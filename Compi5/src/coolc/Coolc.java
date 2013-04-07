package coolc;

import coolc.parser.*;

import java.io.*;
import java.util.*;

public class Coolc {

    public static void printInstructions() {
        System.out.println(
            "Usage Coolc <action> file1 file2 ... filen\n" +
            "Available actions: \n" +
            "scan - scans each files and outputs a token list\n" +
            "parse - parses each file and outputs the syntax tree\n"
            );
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        if (args.length < 2) {
            printInstructions();
            return;
        }


        String action = args[0];

        List<String> files = Arrays.asList(args).subList(1, args.length);

        switch(action) {

            case "scan":
                scan(files);
                break;

            case "parse":
                parse(files);
                break;

            default:
                printInstructions();
                return;
        }


    }

    private static void scan(List<String> files) throws FileNotFoundException, IOException {

        for(String filename: files) {
            File f = new File(filename);
            Reader r = new FileReader(f);
            Lexer lex = new Lexer(r);

            for(int token = lex.yylex(); token != Parser.EOF; token = lex.yylex()) {

                Position pos = lex.getStartPos();

                String out = "";
                switch(token) {

                    case Parser.ID:
                        out = "Id<" + lex.getLVal() + ">";
                        break;
                        
                    case Parser.TYPEID:
                        out = "Type<" + lex.getLVal() + ">";
                        break;

                    case Parser.INT:
                    	out = "Int<" + lex.getLVal() + ">";
                        break;
                        
                    case Parser.T_INT:
                    case Parser.T_STRING:
                    case Parser.T_BOOL:
                    case Parser.T_OBJECT:
                    	out = "Type<" + lex.getLVal() + ">";
                        break;
                        
                    case Parser.TYPE_STRING:
                    	String t = lex.getLVal().toString();
                    	t = t.substring(1, t.length() - 1);
                    	t = t.replace("\\n", "");
                    	
                    	out = "String<" + t + ">";
                    	break;
                    	
                    case Parser.T_COMMENTS:
                    case Parser.T_UNKNOWN:
                    	break;
                    

                    default:
                    	out = Parser.getTokenName(token);
                        break;
                }
                
                if(!out.equals("")){
                	System.out.printf("%s:%2d:%2d  %s\n", f.getPath(), pos.line, pos.column, out);
                }

            }
        }
    }

    private static void parse(List<String> files) throws FileNotFoundException, IOException { 

    }



}  