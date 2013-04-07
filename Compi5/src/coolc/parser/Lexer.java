/* The following code was generated by JFlex 1.4.3 on 05-04-13 10:51 PM */

package coolc.parser;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 05-04-13 10:51 PM from the specification file
 * <tt>cool.l</tt>
 */
public class Lexer implements Parser.Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int multiline_comment = 4;
  public static final int comment = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\100\1\11\2\0\1\100\22\0\1\100\1\0\1\4\5\0"+
    "\1\5\1\7\1\6\1\53\1\47\1\10\1\46\1\54\12\77\1\45"+
    "\1\44\1\52\1\55\3\0\1\57\1\30\1\36\1\73\1\34\1\63"+
    "\1\24\1\61\1\12\1\32\1\1\1\40\1\1\1\14\1\26\1\67"+
    "\1\1\1\22\1\20\1\16\1\75\1\71\1\65\3\1\1\42\1\2"+
    "\1\43\3\2\1\60\1\31\1\37\1\74\1\35\1\64\1\25\1\62"+
    "\1\13\1\33\1\3\1\41\1\3\1\15\1\27\1\70\1\3\1\23"+
    "\1\21\1\17\1\76\1\72\1\66\3\3\1\50\1\0\1\51\1\56"+
    "\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\2\1\3\1\2\1\3\1\2\1\3"+
    "\1\2\1\3\1\2\1\3\1\2\1\3\1\2\1\3"+
    "\1\2\1\3\1\2\1\3\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\2\1\3\1\2\1\3\1\2\1\3\1\26"+
    "\1\0\1\27\2\0\1\30\1\2\1\31\1\30\1\3"+
    "\1\31\2\2\2\3\2\2\2\3\1\2\1\3\1\2"+
    "\1\3\1\2\1\3\1\2\1\3\1\2\1\3\2\2"+
    "\2\3\1\32\1\33\1\34\1\2\1\34\1\3\1\2"+
    "\1\3\1\2\1\3\1\0\1\35\1\36\2\2\1\36"+
    "\2\3\1\37\1\40\1\37\1\40\2\2\2\3\1\2"+
    "\1\3\1\2\1\3\1\2\1\3\1\2\1\3\1\2"+
    "\1\3\1\2\1\41\1\3\1\41\1\2\1\3\1\2"+
    "\1\3\1\2\1\3\2\2\2\3\1\42\1\43\1\42"+
    "\1\43\1\2\1\3\1\2\1\3\2\44\2\45\1\2"+
    "\1\3\2\46\1\2\1\3\1\2\1\3\2\47\2\2"+
    "\2\3\1\2\1\3\1\2\1\3\2\50\2\51\2\52"+
    "\1\2\1\53\1\3\1\53\2\54\2\55\1\2\1\3"+
    "\2\56";

  private static int [] zzUnpackAction() {
    int [] result = new int[179];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\101\0\101\0\202\0\303\0\u0104\0\u0145\0\101"+
    "\0\101\0\u0186\0\u01c7\0\u0208\0\u0249\0\u028a\0\u02cb\0\u030c"+
    "\0\u034d\0\u038e\0\u03cf\0\u0410\0\u0451\0\u0492\0\u04d3\0\u0514"+
    "\0\u0555\0\u0596\0\u05d7\0\u0618\0\u0659\0\101\0\101\0\101"+
    "\0\101\0\101\0\101\0\101\0\101\0\u069a\0\101\0\101"+
    "\0\101\0\101\0\u06db\0\u071c\0\u075d\0\u079e\0\u07df\0\u0820"+
    "\0\u0861\0\u0104\0\101\0\u08a2\0\u08e3\0\u0924\0\u0965\0\202"+
    "\0\u09a6\0\u09e7\0\303\0\u0a28\0\u0a69\0\u0aaa\0\u0aeb\0\u0b2c"+
    "\0\u0b6d\0\u0bae\0\u0bef\0\u0c30\0\u0c71\0\u0cb2\0\u0cf3\0\u0d34"+
    "\0\u0d75\0\u0db6\0\u0df7\0\u0e38\0\u0e79\0\u0eba\0\u0efb\0\u0f3c"+
    "\0\u0f7d\0\101\0\101\0\202\0\u0fbe\0\303\0\u0fff\0\u1040"+
    "\0\u1081\0\u10c2\0\u1103\0\u1144\0\101\0\202\0\u1185\0\u11c6"+
    "\0\303\0\u1207\0\u1248\0\202\0\202\0\303\0\303\0\u1289"+
    "\0\u12ca\0\u130b\0\u134c\0\u138d\0\u13ce\0\u140f\0\u1450\0\u1491"+
    "\0\u14d2\0\u1513\0\u1554\0\u1595\0\u15d6\0\u1617\0\202\0\u1658"+
    "\0\303\0\u1699\0\u16da\0\u171b\0\u175c\0\u179d\0\u17de\0\u181f"+
    "\0\u1860\0\u18a1\0\u18e2\0\202\0\202\0\303\0\303\0\u1923"+
    "\0\u1964\0\u19a5\0\u19e6\0\202\0\303\0\202\0\303\0\u1a27"+
    "\0\u1a68\0\202\0\303\0\u1aa9\0\u1aea\0\u1b2b\0\u1b6c\0\202"+
    "\0\303\0\u1bad\0\u1bee\0\u1c2f\0\u1c70\0\u1cb1\0\u1cf2\0\u1d33"+
    "\0\u1d74\0\202\0\303\0\202\0\303\0\202\0\303\0\u1db5"+
    "\0\202\0\u1df6\0\303\0\202\0\303\0\202\0\303\0\u1e37"+
    "\0\u1e78\0\202\0\303";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[179];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\3\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\4\1\5\1\4\1\5\1\24\1\25"+
    "\1\26\1\27\1\4\1\5\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\4"+
    "\1\5\1\4\1\5\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\1\4\1\5\1\4\1\5\1\4\1\5\1\61"+
    "\1\13\102\0\3\4\6\0\32\4\13\0\21\4\2\0"+
    "\3\5\6\0\32\5\13\0\21\5\1\0\4\62\1\63"+
    "\74\62\6\0\1\64\102\0\1\65\101\0\1\13\66\0"+
    "\1\13\1\0\3\4\6\0\2\4\2\66\2\4\2\67"+
    "\22\4\13\0\4\4\2\70\13\4\2\0\3\5\6\0"+
    "\2\5\2\71\2\5\2\72\22\5\13\0\4\5\2\73"+
    "\13\5\2\0\3\4\6\0\14\4\2\74\4\4\2\75"+
    "\6\4\13\0\21\4\2\0\3\5\6\0\14\5\2\76"+
    "\4\5\2\77\6\5\13\0\21\5\2\0\3\4\6\0"+
    "\10\4\2\100\20\4\13\0\2\4\2\101\15\4\2\0"+
    "\3\5\6\0\10\5\2\102\20\5\13\0\2\5\2\103"+
    "\15\5\2\0\3\4\6\0\4\4\2\104\24\4\13\0"+
    "\21\4\2\0\3\5\6\0\4\5\2\105\24\5\13\0"+
    "\21\5\2\0\3\4\6\0\16\4\2\106\12\4\13\0"+
    "\21\4\2\0\3\5\6\0\16\5\2\107\12\5\13\0"+
    "\21\5\2\0\3\4\6\0\14\4\2\110\14\4\13\0"+
    "\21\4\2\0\3\5\6\0\14\5\2\111\14\5\13\0"+
    "\21\5\2\0\3\4\6\0\26\4\2\112\2\4\13\0"+
    "\21\4\2\0\3\5\6\0\26\5\2\113\2\5\13\0"+
    "\21\5\2\0\3\4\6\0\26\4\2\114\2\4\13\0"+
    "\21\4\2\0\3\5\6\0\26\5\2\115\2\5\13\0"+
    "\21\5\2\0\3\4\6\0\14\4\2\116\4\4\2\117"+
    "\6\4\13\0\21\4\2\0\3\5\6\0\14\5\2\120"+
    "\4\5\2\121\6\5\13\0\21\5\11\0\1\122\44\0"+
    "\1\123\24\0\3\4\6\0\2\124\30\4\13\0\2\125"+
    "\17\4\2\0\3\5\6\0\2\126\30\5\13\0\2\127"+
    "\17\5\2\0\3\4\6\0\32\4\13\0\2\4\2\130"+
    "\15\4\2\0\3\5\6\0\32\5\13\0\2\5\2\131"+
    "\15\5\2\0\3\4\6\0\14\4\2\132\14\4\13\0"+
    "\21\4\2\0\3\5\6\0\14\5\2\133\14\5\13\0"+
    "\21\5\100\0\1\61\1\0\6\64\1\134\1\0\71\64"+
    "\11\65\1\135\67\65\1\0\3\4\6\0\4\4\2\136"+
    "\24\4\13\0\2\4\2\137\15\4\2\0\3\4\6\0"+
    "\32\4\13\0\12\4\2\140\5\4\2\0\3\5\6\0"+
    "\4\5\2\141\24\5\13\0\2\5\2\142\15\5\2\0"+
    "\3\5\6\0\32\5\13\0\12\5\2\143\5\5\2\0"+
    "\3\4\6\0\4\4\2\144\24\4\13\0\21\4\2\0"+
    "\3\4\6\0\32\4\13\0\6\4\2\145\11\4\2\0"+
    "\3\5\6\0\4\5\2\146\24\5\13\0\21\5\2\0"+
    "\3\5\6\0\32\5\13\0\6\5\2\147\11\5\2\0"+
    "\3\4\6\0\32\4\13\0\16\4\2\150\1\4\2\0"+
    "\3\4\6\0\22\4\2\151\6\4\13\0\21\4\2\0"+
    "\3\5\6\0\32\5\13\0\16\5\2\152\1\5\2\0"+
    "\3\5\6\0\22\5\2\153\6\5\13\0\21\5\2\0"+
    "\3\4\6\0\10\4\2\154\20\4\13\0\21\4\2\0"+
    "\3\5\6\0\10\5\2\155\20\5\13\0\21\5\2\0"+
    "\3\4\6\0\20\4\2\156\10\4\13\0\21\4\2\0"+
    "\3\5\6\0\20\5\2\157\10\5\13\0\21\5\2\0"+
    "\3\4\6\0\14\4\2\160\14\4\13\0\21\4\2\0"+
    "\3\5\6\0\14\5\2\161\14\5\13\0\21\5\2\0"+
    "\3\4\6\0\6\4\2\162\22\4\13\0\21\4\2\0"+
    "\3\5\6\0\6\5\2\163\22\5\13\0\21\5\2\0"+
    "\3\4\6\0\32\4\13\0\2\164\17\4\2\0\3\5"+
    "\6\0\32\5\13\0\2\165\17\5\2\0\3\4\6\0"+
    "\14\4\2\166\14\4\13\0\21\4\2\0\3\4\6\0"+
    "\4\4\2\167\24\4\13\0\21\4\2\0\3\5\6\0"+
    "\14\5\2\170\14\5\13\0\21\5\2\0\3\5\6\0"+
    "\4\5\2\171\24\5\13\0\21\5\2\0\3\4\6\0"+
    "\26\4\2\172\2\4\13\0\21\4\2\0\3\5\6\0"+
    "\26\5\2\173\2\5\13\0\21\5\2\0\3\4\6\0"+
    "\2\174\30\4\13\0\21\4\2\0\3\5\6\0\2\175"+
    "\30\5\13\0\21\5\2\0\3\4\6\0\14\4\2\176"+
    "\14\4\13\0\21\4\2\0\3\5\6\0\14\5\2\177"+
    "\14\5\13\0\21\5\10\0\1\135\72\0\3\4\6\0"+
    "\22\4\2\200\6\4\13\0\21\4\2\0\3\4\6\0"+
    "\14\4\2\201\14\4\13\0\21\4\2\0\3\5\6\0"+
    "\22\5\2\202\6\5\13\0\21\5\2\0\3\5\6\0"+
    "\14\5\2\203\14\5\13\0\21\5\2\0\3\4\6\0"+
    "\22\4\2\204\6\4\13\0\21\4\2\0\3\4\6\0"+
    "\2\4\2\205\26\4\13\0\21\4\2\0\3\5\6\0"+
    "\22\5\2\206\6\5\13\0\21\5\2\0\3\5\6\0"+
    "\2\5\2\207\26\5\13\0\21\5\2\0\3\4\6\0"+
    "\2\210\30\4\13\0\21\4\2\0\3\5\6\0\2\211"+
    "\30\5\13\0\21\5\2\0\3\4\6\0\22\4\2\212"+
    "\6\4\13\0\21\4\2\0\3\5\6\0\22\5\2\213"+
    "\6\5\13\0\21\5\2\0\3\4\6\0\26\4\2\214"+
    "\2\4\13\0\21\4\2\0\3\5\6\0\26\5\2\215"+
    "\2\5\13\0\21\5\2\0\3\4\6\0\22\4\2\216"+
    "\6\4\13\0\21\4\2\0\3\5\6\0\22\5\2\217"+
    "\6\5\13\0\21\5\2\0\3\4\6\0\6\4\2\220"+
    "\22\4\13\0\21\4\2\0\3\5\6\0\6\5\2\221"+
    "\22\5\13\0\21\5\2\0\3\4\6\0\32\4\13\0"+
    "\10\4\2\222\7\4\2\0\3\5\6\0\32\5\13\0"+
    "\10\5\2\223\7\5\2\0\3\4\6\0\6\4\2\224"+
    "\22\4\13\0\21\4\2\0\3\5\6\0\6\5\2\225"+
    "\22\5\13\0\21\5\2\0\3\4\6\0\26\4\2\226"+
    "\2\4\13\0\21\4\2\0\3\5\6\0\26\5\2\227"+
    "\2\5\13\0\21\5\2\0\3\4\6\0\26\4\2\230"+
    "\2\4\13\0\21\4\2\0\3\5\6\0\26\5\2\231"+
    "\2\5\13\0\21\5\2\0\3\4\6\0\10\4\2\232"+
    "\20\4\13\0\21\4\2\0\3\4\6\0\2\233\30\4"+
    "\13\0\21\4\2\0\3\5\6\0\10\5\2\234\20\5"+
    "\13\0\21\5\2\0\3\5\6\0\2\235\30\5\13\0"+
    "\21\5\2\0\3\4\6\0\2\4\2\236\26\4\13\0"+
    "\21\4\2\0\3\5\6\0\2\5\2\237\26\5\13\0"+
    "\21\5\2\0\3\4\6\0\24\4\2\240\4\4\13\0"+
    "\21\4\2\0\3\5\6\0\24\5\2\241\4\5\13\0"+
    "\21\5\2\0\3\4\6\0\6\4\2\242\22\4\13\0"+
    "\21\4\2\0\3\5\6\0\6\5\2\243\22\5\13\0"+
    "\21\5\2\0\3\4\6\0\22\4\2\244\6\4\13\0"+
    "\21\4\2\0\3\5\6\0\22\5\2\245\6\5\13\0"+
    "\21\5\2\0\3\4\6\0\22\4\2\246\6\4\13\0"+
    "\21\4\2\0\3\5\6\0\22\5\2\247\6\5\13\0"+
    "\21\5\2\0\3\4\6\0\2\250\30\4\13\0\21\4"+
    "\2\0\3\4\6\0\32\4\13\0\14\4\2\251\3\4"+
    "\2\0\3\5\6\0\2\252\30\5\13\0\21\5\2\0"+
    "\3\5\6\0\32\5\13\0\14\5\2\253\3\5\2\0"+
    "\3\4\6\0\12\4\2\254\16\4\13\0\21\4\2\0"+
    "\3\5\6\0\12\5\2\255\16\5\13\0\21\5\2\0"+
    "\3\4\6\0\4\4\2\256\24\4\13\0\21\4\2\0"+
    "\3\5\6\0\4\5\2\257\24\5\13\0\21\5\2\0"+
    "\3\4\6\0\4\4\2\260\24\4\13\0\21\4\2\0"+
    "\3\5\6\0\4\5\2\261\24\5\13\0\21\5\2\0"+
    "\3\4\6\0\6\4\2\262\22\4\13\0\21\4\2\0"+
    "\3\5\6\0\6\5\2\263\22\5\13\0\21\5\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7865];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\10\1\11\4\1\2\11\24\1\10\11\1\1"+
    "\4\11\7\1\1\0\1\11\2\0\34\1\2\11\10\1"+
    "\1\0\1\11\126\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[179];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

    private Object yylval;

    public Object getLVal() {
        return yylval;
    }

    public Position getStartPos() {
        return new Position(yyline, yycolumn);
    }

    public Position getEndPos() {
        return new Position(yyline, yycolumn);
    }

    public void yyerror(String msg) {
        //throw new Exception();
    }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 162) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 43: 
          { return Parser.T_ISVOID;
          }
        case 47: break;
        case 31: 
          { return Parser.T_NOT;
          }
        case 48: break;
        case 20: 
          { return Parser.T_EQUAL;
          }
        case 49: break;
        case 30: 
          { return Parser.T_INT;
          }
        case 50: break;
        case 39: 
          { return Parser.T_POOL;
          }
        case 51: break;
        case 23: 
          { yylval = yytext();
                return Parser.TYPE_STRING;
          }
        case 52: break;
        case 5: 
          { return Parser.T_MULT;
          }
        case 53: break;
        case 46: 
          { return Parser.T_INHERITS;
          }
        case 54: break;
        case 32: 
          { return Parser.T_NEW;
          }
        case 55: break;
        case 13: 
          { return Parser.T_POINT;
          }
        case 56: break;
        case 12: 
          { return Parser.T_TWO_POINT;
          }
        case 57: break;
        case 21: 
          { return Parser.T_SNOT;
          }
        case 58: break;
        case 26: 
          { return Parser.T_ASSIGN;
          }
        case 59: break;
        case 33: 
          { return Parser.T_LET;
          }
        case 60: break;
        case 17: 
          { return Parser.T_LESS;
          }
        case 61: break;
        case 25: 
          { return Parser.T_IF;
          }
        case 62: break;
        case 8: 
          { // ignoramos el espacio en blanco
          }
        case 63: break;
        case 22: 
          { yylval = Integer.parseInt(yytext());
                return Parser.INT;
          }
        case 64: break;
        case 41: 
          { return Parser.T_FALSE;
          }
        case 65: break;
        case 27: 
          { return Parser.T_LESS_EQUAL;
          }
        case 66: break;
        case 1: 
          { System.out.printf("Unknown character [%s]\n", yytext());
                       return Parser.T_UNKNOWN;
          }
        case 67: break;
        case 14: 
          { return Parser.T_COMMA;
          }
        case 68: break;
        case 15: 
          { return Parser.T_LKEY;
          }
        case 69: break;
        case 11: 
          { return Parser.T_SEMICOLON;
          }
        case 70: break;
        case 44: 
          { return Parser.T_STRING;
          }
        case 71: break;
        case 4: 
          { return Parser.T_LPAREN;
          }
        case 72: break;
        case 3: 
          { yylval = yytext();
                return Parser.ID;
          }
        case 73: break;
        case 35: 
          { return Parser.T_THEN;
          }
        case 74: break;
        case 6: 
          { return Parser.T_RPAREN;
          }
        case 75: break;
        case 37: 
          { return Parser.T_ELSE;
          }
        case 76: break;
        case 28: 
          { return Parser.T_FI;
          }
        case 77: break;
        case 29: 
          { yylval = yytext();
                return Parser.T_COMMENTS;
          }
        case 78: break;
        case 24: 
          { return Parser.T_IN;
          }
        case 79: break;
        case 40: 
          { return Parser.T_CLASS;
          }
        case 80: break;
        case 16: 
          { return Parser.T_RKEY;
          }
        case 81: break;
        case 34: 
          { return Parser.T_TRUE;
          }
        case 82: break;
        case 2: 
          { yylval = yytext();
                return Parser.TYPEID;
          }
        case 83: break;
        case 45: 
          { return Parser.T_OBJECT;
          }
        case 84: break;
        case 7: 
          { return Parser.T_MINUS;
          }
        case 85: break;
        case 38: 
          { return Parser.T_LOOP;
          }
        case 86: break;
        case 18: 
          { return Parser.T_PLUS;
          }
        case 87: break;
        case 42: 
          { return Parser.T_WHILE;
          }
        case 88: break;
        case 36: 
          { return Parser.T_BOOL;
          }
        case 89: break;
        case 19: 
          { return Parser.T_DIV;
          }
        case 90: break;
        case 10: 
          { return Parser.T_RBRACE;
          }
        case 91: break;
        case 9: 
          { return Parser.T_LBRACE;
          }
        case 92: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {
                return Parser.EOF;
              }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
