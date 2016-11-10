/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package com.neueda.jetbrains.plugin.graphdb.language.cypher.lexer;

import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.neueda.jetbrains.plugin.graphdb.language.cypher.parser.CypherParserDefinition.LINE_COMMENT;
import static com.neueda.jetbrains.plugin.graphdb.language.cypher.parser.CypherParserDefinition.BLOCK_COMMENT;
import static com.neueda.jetbrains.plugin.graphdb.language.cypher.psi.CypherTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_CypherLexer.flex</tt>
 */
public class _CypherLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\2\1\1\2\22\0\1\3\1\70\1\46\1\0\1\36\1\71\1\0\1\44\1\52\1\53"+
    "\1\50\1\64\1\65\1\40\1\43\1\47\1\42\11\41\1\60\1\51\1\62\1\61\1\63\1\66\1"+
    "\0\1\5\1\32\1\7\1\15\1\12\1\24\1\30\1\10\1\16\1\31\1\34\1\21\1\4\1\14\1\20"+
    "\1\27\1\25\1\11\1\17\1\6\1\13\1\22\1\23\1\26\1\33\1\35\1\56\1\45\1\57\1\72"+
    "\1\35\1\37\1\5\1\32\1\7\1\15\1\12\1\24\1\30\1\10\1\16\1\31\1\34\1\21\1\4\1"+
    "\14\1\20\1\27\1\25\1\11\1\17\1\6\1\13\1\22\1\23\1\26\1\33\1\35\1\54\1\67\1"+
    "\55\1\73\6\0\1\1\32\0\1\3\337\0\1\3\177\0\13\3\35\0\2\1\5\0\1\3\57\0\1\3\40"+
    "\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\26\3\1\4\1\5\1\6\2\7"+
    "\1\10\2\1\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\1\1\32\1\33\3\3\1\34"+
    "\24\3\1\35\1\36\6\3\1\37\1\40\16\3\1\41"+
    "\1\3\2\0\1\42\1\0\1\43\3\0\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\2\3\1\54"+
    "\1\55\1\56\1\3\1\57\5\3\1\60\7\3\1\61"+
    "\1\62\10\3\1\63\13\3\1\64\15\3\1\65\5\3"+
    "\1\66\1\67\1\45\5\3\1\70\1\71\1\72\1\73"+
    "\12\3\1\74\1\75\7\3\1\76\1\77\1\100\1\101"+
    "\1\3\1\102\4\3\1\103\2\3\1\104\3\3\1\105"+
    "\1\3\1\106\1\107\1\3\1\110\5\3\1\111\2\3"+
    "\1\45\1\0\1\112\1\113\20\3\1\114\2\3\1\115"+
    "\4\3\1\116\1\117\2\3\1\120\1\3\1\121\1\122"+
    "\1\123\5\3\1\124\1\125\1\3\1\126\1\3\1\127"+
    "\1\130\2\3\1\131\1\3\1\132\1\133\1\134\2\3"+
    "\1\135\1\3\1\136\1\137\1\140\1\3\1\141\1\3"+
    "\1\142\1\3\1\143\2\3\1\144\7\3\1\145\1\3"+
    "\1\146\1\147\5\3\1\150\1\151\3\3\1\152\3\3"+
    "\1\153\1\3\1\154\1\3\1\155\1\156\7\3\1\157"+
    "\1\3\1\160\7\3\1\161\1\162\6\3\1\163\1\164";

  private static int [] zzUnpackAction() {
    int [] result = new int[373];
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
    "\0\0\0\74\0\74\0\170\0\264\0\360\0\u012c\0\u0168"+
    "\0\u01a4\0\u01e0\0\u021c\0\u0258\0\u0294\0\u02d0\0\u030c\0\u0348"+
    "\0\u0384\0\u03c0\0\u03fc\0\u0438\0\u0474\0\u04b0\0\u04ec\0\u0528"+
    "\0\u0564\0\74\0\u05a0\0\u05dc\0\u0618\0\u0654\0\u0690\0\u06cc"+
    "\0\u0708\0\u0744\0\74\0\74\0\74\0\74\0\74\0\74"+
    "\0\74\0\74\0\74\0\u0780\0\u07bc\0\u07f8\0\u0834\0\74"+
    "\0\74\0\74\0\u0870\0\74\0\74\0\u08ac\0\u08e8\0\u0924"+
    "\0\u0960\0\u099c\0\u09d8\0\u0a14\0\u0a50\0\u0a8c\0\u0ac8\0\u0b04"+
    "\0\u0b40\0\u0b7c\0\u0bb8\0\u0bf4\0\u0c30\0\u0c6c\0\u0ca8\0\u0ce4"+
    "\0\u0d20\0\u0d5c\0\u0d98\0\u0dd4\0\u0e10\0\u0e4c\0\u03c0\0\u0e88"+
    "\0\u0ec4\0\u0f00\0\u0f3c\0\u0f78\0\u0fb4\0\u0ff0\0\u03c0\0\u102c"+
    "\0\u1068\0\u10a4\0\u10e0\0\u111c\0\u1158\0\u1194\0\u11d0\0\u120c"+
    "\0\u1248\0\u1284\0\u12c0\0\u12fc\0\u1338\0\u03c0\0\u1374\0\u13b0"+
    "\0\u13ec\0\74\0\u06cc\0\74\0\u1428\0\u0708\0\u1464\0\u14a0"+
    "\0\u14dc\0\74\0\74\0\74\0\74\0\74\0\74\0\u1518"+
    "\0\u1554\0\u03c0\0\u03c0\0\u1590\0\u15cc\0\u1608\0\u1644\0\u1680"+
    "\0\u16bc\0\u16f8\0\u1734\0\u03c0\0\u1770\0\u17ac\0\u17e8\0\u1824"+
    "\0\u1860\0\u189c\0\u18d8\0\u1914\0\u1950\0\u198c\0\u19c8\0\u1a04"+
    "\0\u1a40\0\u1a7c\0\u1ab8\0\u1af4\0\u1b30\0\u03c0\0\u1b6c\0\u1ba8"+
    "\0\u1be4\0\u1c20\0\u1c5c\0\u1c98\0\u1cd4\0\u1d10\0\u1d4c\0\u1d88"+
    "\0\u1dc4\0\u03c0\0\u1e00\0\u1e3c\0\u1e78\0\u1eb4\0\u1ef0\0\u1f2c"+
    "\0\u1f68\0\u1fa4\0\u1fe0\0\u201c\0\u2058\0\u2094\0\u20d0\0\u03c0"+
    "\0\u210c\0\u2148\0\u2184\0\u21c0\0\u21fc\0\74\0\u13ec\0\u2238"+
    "\0\u2274\0\u22b0\0\u22ec\0\u2328\0\u2364\0\u03c0\0\u03c0\0\u03c0"+
    "\0\u03c0\0\u23a0\0\u23dc\0\u2418\0\u2454\0\u2490\0\u24cc\0\u2508"+
    "\0\u2544\0\u2580\0\u25bc\0\u03c0\0\u03c0\0\u25f8\0\u2634\0\u2670"+
    "\0\u26ac\0\u26e8\0\u2724\0\u2760\0\u03c0\0\u03c0\0\u03c0\0\u03c0"+
    "\0\u279c\0\u27d8\0\u2814\0\u2850\0\u288c\0\u28c8\0\u03c0\0\u2904"+
    "\0\u2940\0\u03c0\0\u297c\0\u29b8\0\u29f4\0\u03c0\0\u2a30\0\u03c0"+
    "\0\u03c0\0\u2a6c\0\u03c0\0\u2aa8\0\u2ae4\0\u2b20\0\u2b5c\0\u2b98"+
    "\0\u03c0\0\u2bd4\0\u2c10\0\74\0\u2238\0\u03c0\0\u03c0\0\u2c4c"+
    "\0\u2c88\0\u2cc4\0\u2d00\0\u2d3c\0\u2d78\0\u2db4\0\u2df0\0\u2e2c"+
    "\0\u2e68\0\u2ea4\0\u2ee0\0\u2f1c\0\u2f58\0\u2f94\0\u2fd0\0\u03c0"+
    "\0\u300c\0\u3048\0\u03c0\0\u3084\0\u30c0\0\u30fc\0\u3138\0\u03c0"+
    "\0\u3174\0\u31b0\0\u31ec\0\u03c0\0\u3228\0\u03c0\0\u03c0\0\u03c0"+
    "\0\u3264\0\u32a0\0\u32dc\0\u3318\0\u3354\0\u03c0\0\u03c0\0\u3390"+
    "\0\u03c0\0\u33cc\0\u03c0\0\u03c0\0\u3408\0\u3444\0\u03c0\0\u3480"+
    "\0\u03c0\0\u03c0\0\u03c0\0\u34bc\0\u34f8\0\u03c0\0\u3534\0\u03c0"+
    "\0\u03c0\0\u03c0\0\u3570\0\u03c0\0\u35ac\0\u03c0\0\u35e8\0\u03c0"+
    "\0\u3624\0\u3660\0\u03c0\0\u369c\0\u36d8\0\u3714\0\u3750\0\u378c"+
    "\0\u37c8\0\u3804\0\u03c0\0\u3840\0\u03c0\0\u03c0\0\u387c\0\u38b8"+
    "\0\u38f4\0\u3930\0\u396c\0\u03c0\0\u03c0\0\u39a8\0\u39e4\0\u3a20"+
    "\0\u03c0\0\u3a5c\0\u3a98\0\u3ad4\0\u03c0\0\u3b10\0\u03c0\0\u3b4c"+
    "\0\u03c0\0\u03c0\0\u3b88\0\u3bc4\0\u3c00\0\u3c3c\0\u3c78\0\u3cb4"+
    "\0\u3cf0\0\u03c0\0\u3d2c\0\u03c0\0\u3d68\0\u3da4\0\u3de0\0\u3e1c"+
    "\0\u3e58\0\u3e94\0\u3ed0\0\u03c0\0\u03c0\0\u3f0c\0\u3f48\0\u3f84"+
    "\0\u3fc0\0\u3ffc\0\u4038\0\u03c0\0\u03c0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[373];
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
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\22\1\25\1\26\1\22\1\27"+
    "\1\30\1\31\2\22\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\2\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
    "\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65"+
    "\1\2\100\0\1\22\1\66\4\22\1\67\24\22\2\0"+
    "\2\22\35\0\10\22\1\70\2\22\1\71\1\22\1\72"+
    "\15\22\2\0\2\22\35\0\4\22\1\73\1\74\25\22"+
    "\2\0\2\22\35\0\1\22\1\75\3\22\1\76\5\22"+
    "\1\77\1\100\12\22\1\101\3\22\2\0\2\22\35\0"+
    "\6\22\1\102\24\22\2\0\2\22\35\0\6\22\1\103"+
    "\24\22\2\0\2\22\35\0\10\22\1\104\4\22\1\105"+
    "\4\22\1\106\10\22\2\0\2\22\35\0\10\22\1\107"+
    "\2\22\1\110\17\22\2\0\2\22\35\0\7\22\1\111"+
    "\4\22\1\112\16\22\2\0\2\22\35\0\5\22\1\113"+
    "\1\114\3\22\1\115\20\22\2\0\2\22\35\0\10\22"+
    "\1\116\2\22\1\117\17\22\2\0\2\22\35\0\2\22"+
    "\1\120\1\121\1\122\1\22\1\123\3\22\1\124\15\22"+
    "\1\125\2\22\2\0\2\22\35\0\5\22\1\126\2\22"+
    "\1\127\12\22\1\130\7\22\2\0\2\22\35\0\12\22"+
    "\1\131\1\22\1\132\16\22\2\0\2\22\35\0\33\22"+
    "\2\0\2\22\35\0\4\22\1\133\5\22\1\134\20\22"+
    "\2\0\2\22\35\0\1\22\1\135\3\22\1\136\4\22"+
    "\1\137\1\22\1\140\16\22\2\0\2\22\35\0\14\22"+
    "\1\141\16\22\2\0\2\22\35\0\5\22\1\142\1\143"+
    "\24\22\2\0\2\22\35\0\14\22\1\144\16\22\2\0"+
    "\2\22\35\0\6\22\1\145\20\22\1\146\3\22\2\0"+
    "\2\22\35\0\12\22\1\147\20\22\2\0\2\22\31\0"+
    "\37\150\1\0\34\150\41\0\1\35\1\36\72\0\2\35"+
    "\1\151\73\0\1\151\73\0\1\152\30\0\44\153\1\154"+
    "\1\155\26\153\45\156\1\157\1\154\25\156\47\0\1\160"+
    "\1\161\116\0\1\162\61\0\1\163\1\0\1\164\71\0"+
    "\1\165\53\0\1\35\1\36\16\0\1\166\73\0\1\167"+
    "\16\0\2\22\1\170\30\22\2\0\2\22\35\0\5\22"+
    "\1\171\25\22\2\0\2\22\35\0\11\22\1\172\15\22"+
    "\1\173\3\22\2\0\2\22\35\0\3\22\1\174\7\22"+
    "\1\175\17\22\2\0\2\22\35\0\15\22\1\176\15\22"+
    "\2\0\2\22\35\0\6\22\1\177\24\22\2\0\2\22"+
    "\35\0\7\22\1\200\23\22\2\0\2\22\35\0\13\22"+
    "\1\201\1\22\1\202\15\22\2\0\2\22\35\0\6\22"+
    "\1\203\24\22\2\0\2\22\35\0\16\22\1\204\14\22"+
    "\2\0\2\22\35\0\1\205\7\22\1\206\22\22\2\0"+
    "\2\22\35\0\23\22\1\207\7\22\2\0\2\22\35\0"+
    "\1\22\1\210\31\22\2\0\2\22\35\0\1\211\1\22"+
    "\1\212\6\22\1\213\3\22\1\214\15\22\2\0\2\22"+
    "\35\0\11\22\1\215\21\22\2\0\2\22\35\0\13\22"+
    "\1\216\17\22\2\0\2\22\35\0\2\22\1\217\7\22"+
    "\1\220\10\22\1\221\7\22\2\0\2\22\35\0\12\22"+
    "\1\222\4\22\1\223\13\22\2\0\2\22\35\0\12\22"+
    "\1\224\20\22\2\0\2\22\35\0\15\22\1\225\15\22"+
    "\2\0\2\22\35\0\2\22\1\226\5\22\1\227\1\230"+
    "\21\22\2\0\2\22\35\0\14\22\1\231\16\22\2\0"+
    "\2\22\35\0\2\22\1\232\10\22\1\233\1\22\1\234"+
    "\15\22\2\0\2\22\35\0\13\22\1\235\17\22\2\0"+
    "\2\22\35\0\11\22\1\236\21\22\2\0\2\22\35\0"+
    "\1\22\1\237\31\22\2\0\2\22\35\0\1\22\1\240"+
    "\31\22\2\0\2\22\35\0\14\22\1\241\16\22\2\0"+
    "\2\22\35\0\2\22\1\242\30\22\2\0\2\22\35\0"+
    "\10\22\1\243\22\22\2\0\2\22\35\0\12\22\1\244"+
    "\20\22\2\0\2\22\35\0\11\22\1\245\21\22\2\0"+
    "\2\22\35\0\2\22\1\246\30\22\2\0\2\22\35\0"+
    "\1\247\32\22\2\0\2\22\35\0\1\22\1\250\31\22"+
    "\2\0\2\22\35\0\6\22\1\251\24\22\2\0\2\22"+
    "\35\0\2\22\1\252\30\22\2\0\2\22\35\0\15\22"+
    "\1\253\15\22\2\0\2\22\35\0\14\22\1\254\16\22"+
    "\2\0\2\22\35\0\6\22\1\255\6\22\1\256\15\22"+
    "\2\0\2\22\35\0\5\22\1\257\25\22\2\0\2\22"+
    "\35\0\5\22\1\260\25\22\2\0\2\22\35\0\14\22"+
    "\1\261\16\22\2\0\2\22\35\0\5\22\1\262\25\22"+
    "\2\0\2\22\35\0\12\22\1\263\20\22\2\0\2\22"+
    "\35\0\24\22\1\264\6\22\2\0\2\22\35\0\6\22"+
    "\1\265\24\22\2\0\2\22\31\0\37\150\1\266\34\150"+
    "\41\0\2\267\31\0\1\153\2\0\71\153\1\156\2\0"+
    "\71\156\2\160\1\0\71\160\50\161\1\270\23\161\4\0"+
    "\3\22\1\271\27\22\2\0\2\22\35\0\24\22\1\272"+
    "\6\22\2\0\2\22\35\0\6\22\1\273\24\22\2\0"+
    "\2\22\35\0\6\22\1\274\24\22\2\0\2\22\35\0"+
    "\13\22\1\275\17\22\2\0\2\22\35\0\10\22\1\276"+
    "\22\22\2\0\2\22\35\0\6\22\1\277\24\22\2\0"+
    "\2\22\35\0\6\22\1\300\24\22\2\0\2\22\35\0"+
    "\15\22\1\301\15\22\2\0\2\22\35\0\1\22\1\302"+
    "\31\22\2\0\2\22\35\0\1\303\32\22\2\0\2\22"+
    "\35\0\2\22\1\304\10\22\1\305\17\22\2\0\2\22"+
    "\35\0\4\22\1\306\26\22\2\0\2\22\35\0\11\22"+
    "\1\307\21\22\2\0\2\22\35\0\14\22\1\310\16\22"+
    "\2\0\2\22\35\0\7\22\1\311\23\22\2\0\2\22"+
    "\35\0\7\22\1\312\23\22\2\0\2\22\35\0\1\22"+
    "\1\313\31\22\2\0\2\22\35\0\13\22\1\314\17\22"+
    "\2\0\2\22\35\0\6\22\1\315\24\22\2\0\2\22"+
    "\35\0\5\22\1\316\25\22\2\0\2\22\35\0\13\22"+
    "\1\317\17\22\2\0\2\22\35\0\15\22\1\320\15\22"+
    "\2\0\2\22\35\0\14\22\1\321\4\22\1\322\11\22"+
    "\2\0\2\22\35\0\12\22\1\323\20\22\2\0\2\22"+
    "\35\0\10\22\1\324\22\22\2\0\2\22\35\0\15\22"+
    "\1\325\15\22\2\0\2\22\35\0\6\22\1\326\24\22"+
    "\2\0\2\22\35\0\6\22\1\327\24\22\2\0\2\22"+
    "\35\0\23\22\1\330\7\22\2\0\2\22\35\0\1\22"+
    "\1\331\31\22\2\0\2\22\35\0\3\22\1\332\27\22"+
    "\2\0\2\22\35\0\6\22\1\333\24\22\2\0\2\22"+
    "\35\0\2\22\1\334\30\22\2\0\2\22\35\0\6\22"+
    "\1\335\24\22\2\0\2\22\35\0\5\22\1\336\25\22"+
    "\2\0\2\22\35\0\10\22\1\337\22\22\2\0\2\22"+
    "\35\0\5\22\1\340\25\22\2\0\2\22\35\0\24\22"+
    "\1\341\6\22\2\0\2\22\35\0\23\22\1\342\7\22"+
    "\2\0\2\22\35\0\6\22\1\343\24\22\2\0\2\22"+
    "\35\0\12\22\1\344\20\22\2\0\2\22\35\0\12\22"+
    "\1\345\20\22\2\0\2\22\35\0\11\22\1\346\21\22"+
    "\2\0\2\22\35\0\5\22\1\347\2\22\1\350\22\22"+
    "\2\0\2\22\35\0\4\22\1\351\26\22\2\0\2\22"+
    "\35\0\13\22\1\352\17\22\2\0\2\22\35\0\1\353"+
    "\32\22\2\0\2\22\35\0\15\22\1\354\15\22\2\0"+
    "\2\22\35\0\2\22\1\355\30\22\2\0\2\22\35\0"+
    "\6\22\1\356\24\22\2\0\2\22\35\0\20\22\1\357"+
    "\12\22\2\0\2\22\35\0\12\22\1\360\20\22\2\0"+
    "\2\22\35\0\10\22\1\361\22\22\2\0\2\22\35\0"+
    "\12\22\1\362\20\22\2\0\2\22\35\0\15\22\1\363"+
    "\15\22\2\0\2\22\31\0\47\161\1\364\1\365\23\161"+
    "\4\0\4\22\1\366\26\22\2\0\2\22\35\0\6\22"+
    "\1\367\24\22\2\0\2\22\35\0\10\22\1\370\22\22"+
    "\2\0\2\22\35\0\5\22\1\371\25\22\2\0\2\22"+
    "\35\0\4\22\1\372\26\22\2\0\2\22\35\0\2\22"+
    "\1\373\30\22\2\0\2\22\35\0\12\22\1\374\20\22"+
    "\2\0\2\22\35\0\1\22\1\375\31\22\2\0\2\22"+
    "\35\0\2\22\1\376\30\22\2\0\2\22\35\0\6\22"+
    "\1\377\24\22\2\0\2\22\35\0\6\22\1\u0100\24\22"+
    "\2\0\2\22\35\0\16\22\1\u0101\14\22\2\0\2\22"+
    "\35\0\5\22\1\u0102\25\22\2\0\2\22\35\0\3\22"+
    "\1\u0103\27\22\2\0\2\22\35\0\2\22\1\u0104\30\22"+
    "\2\0\2\22\35\0\1\22\1\u0105\31\22\2\0\2\22"+
    "\35\0\2\22\1\u0106\30\22\2\0\2\22\35\0\1\22"+
    "\1\u0107\31\22\2\0\2\22\35\0\10\22\1\u0108\22\22"+
    "\2\0\2\22\35\0\7\22\1\u0109\23\22\2\0\2\22"+
    "\35\0\10\22\1\u010a\22\22\2\0\2\22\35\0\24\22"+
    "\1\u010b\6\22\2\0\2\22\35\0\3\22\1\u010c\27\22"+
    "\2\0\2\22\35\0\6\22\1\u010d\24\22\2\0\2\22"+
    "\35\0\2\22\1\u010e\30\22\2\0\2\22\35\0\12\22"+
    "\1\u010f\20\22\2\0\2\22\35\0\22\22\1\u0110\10\22"+
    "\2\0\2\22\35\0\2\22\1\u0111\30\22\2\0\2\22"+
    "\35\0\2\22\1\u0112\30\22\2\0\2\22\35\0\15\22"+
    "\1\u0113\15\22\2\0\2\22\35\0\5\22\1\u0114\25\22"+
    "\2\0\2\22\35\0\14\22\1\u0115\16\22\2\0\2\22"+
    "\35\0\2\22\1\u0116\30\22\2\0\2\22\35\0\6\22"+
    "\1\u0117\24\22\2\0\2\22\35\0\6\22\1\u0118\24\22"+
    "\2\0\2\22\35\0\11\22\1\u0119\21\22\2\0\2\22"+
    "\35\0\6\22\1\u011a\24\22\2\0\2\22\35\0\1\22"+
    "\1\u011b\31\22\2\0\2\22\35\0\12\22\1\u011c\20\22"+
    "\2\0\2\22\35\0\14\22\1\u011d\16\22\2\0\2\22"+
    "\35\0\10\22\1\u011e\22\22\2\0\2\22\35\0\11\22"+
    "\1\u011f\21\22\2\0\2\22\35\0\11\22\1\u0120\21\22"+
    "\2\0\2\22\35\0\2\22\1\u0121\30\22\2\0\2\22"+
    "\35\0\14\22\1\u0122\16\22\2\0\2\22\35\0\6\22"+
    "\1\u0123\24\22\2\0\2\22\35\0\2\22\1\u0124\30\22"+
    "\2\0\2\22\35\0\12\22\1\u0125\20\22\2\0\2\22"+
    "\35\0\5\22\1\u0126\25\22\2\0\2\22\35\0\5\22"+
    "\1\u0127\25\22\2\0\2\22\35\0\5\22\1\u0128\25\22"+
    "\2\0\2\22\35\0\6\22\1\u0129\24\22\2\0\2\22"+
    "\35\0\10\22\1\u012a\22\22\2\0\2\22\35\0\6\22"+
    "\1\u012b\24\22\2\0\2\22\35\0\12\22\1\u012c\20\22"+
    "\2\0\2\22\35\0\3\22\1\u012d\27\22\2\0\2\22"+
    "\35\0\13\22\1\u012e\17\22\2\0\2\22\35\0\12\22"+
    "\1\u012f\20\22\2\0\2\22\35\0\6\22\1\u0130\24\22"+
    "\2\0\2\22\35\0\11\22\1\u0131\21\22\2\0\2\22"+
    "\35\0\4\22\1\u0132\26\22\2\0\2\22\35\0\10\22"+
    "\1\u0133\22\22\2\0\2\22\35\0\6\22\1\u0134\24\22"+
    "\2\0\2\22\35\0\10\22\1\u0135\22\22\2\0\2\22"+
    "\35\0\13\22\1\u0136\17\22\2\0\2\22\35\0\6\22"+
    "\1\u0137\24\22\2\0\2\22\35\0\6\22\1\u0138\24\22"+
    "\2\0\2\22\35\0\10\22\1\u0139\22\22\2\0\2\22"+
    "\35\0\2\22\1\u013a\30\22\2\0\2\22\35\0\5\22"+
    "\1\u013b\25\22\2\0\2\22\35\0\3\22\1\u013c\27\22"+
    "\2\0\2\22\35\0\15\22\1\u013d\15\22\2\0\2\22"+
    "\35\0\11\22\1\u013e\21\22\2\0\2\22\35\0\12\22"+
    "\1\u013f\20\22\2\0\2\22\35\0\5\22\1\u0140\25\22"+
    "\2\0\2\22\35\0\10\22\1\u0141\22\22\2\0\2\22"+
    "\35\0\1\22\1\u0142\31\22\2\0\2\22\35\0\13\22"+
    "\1\u0143\17\22\2\0\2\22\35\0\14\22\1\u0144\16\22"+
    "\2\0\2\22\35\0\2\22\1\u0145\30\22\2\0\2\22"+
    "\35\0\10\22\1\u0146\22\22\2\0\2\22\35\0\11\22"+
    "\1\u0147\21\22\2\0\2\22\35\0\3\22\1\u0148\27\22"+
    "\2\0\2\22\35\0\13\22\1\u0149\17\22\2\0\2\22"+
    "\35\0\1\22\1\u014a\31\22\2\0\2\22\35\0\6\22"+
    "\1\u014b\24\22\2\0\2\22\35\0\4\22\1\u014c\26\22"+
    "\2\0\2\22\35\0\6\22\1\u014d\24\22\2\0\2\22"+
    "\35\0\12\22\1\u014e\20\22\2\0\2\22\35\0\10\22"+
    "\1\u014f\22\22\2\0\2\22\35\0\2\22\1\u0150\30\22"+
    "\2\0\2\22\35\0\13\22\1\u0151\17\22\2\0\2\22"+
    "\35\0\12\22\1\u0152\20\22\2\0\2\22\35\0\10\22"+
    "\1\u0153\22\22\2\0\2\22\35\0\12\22\1\u0154\20\22"+
    "\2\0\2\22\35\0\2\22\1\u0155\30\22\2\0\2\22"+
    "\35\0\2\22\1\u0156\30\22\2\0\2\22\35\0\15\22"+
    "\1\u0157\15\22\2\0\2\22\35\0\5\22\1\u0158\25\22"+
    "\2\0\2\22\35\0\3\22\1\u0159\27\22\2\0\2\22"+
    "\35\0\24\22\1\u015a\6\22\2\0\2\22\35\0\6\22"+
    "\1\u015b\24\22\2\0\2\22\35\0\10\22\1\u015c\22\22"+
    "\2\0\2\22\35\0\13\22\1\u015d\17\22\2\0\2\22"+
    "\35\0\10\22\1\u015e\22\22\2\0\2\22\35\0\23\22"+
    "\1\u015f\7\22\2\0\2\22\35\0\1\u0160\32\22\2\0"+
    "\2\22\35\0\13\22\1\u0161\17\22\2\0\2\22\35\0"+
    "\2\22\1\u0162\30\22\2\0\2\22\35\0\4\22\1\u0163"+
    "\26\22\2\0\2\22\35\0\24\22\1\u0164\6\22\2\0"+
    "\2\22\35\0\1\22\1\u0165\31\22\2\0\2\22\35\0"+
    "\12\22\1\u0166\20\22\2\0\2\22\35\0\2\22\1\u0167"+
    "\30\22\2\0\2\22\35\0\12\22\1\u0168\20\22\2\0"+
    "\2\22\35\0\2\22\1\u0169\30\22\2\0\2\22\35\0"+
    "\10\22\1\u016a\22\22\2\0\2\22\35\0\23\22\1\u016b"+
    "\7\22\2\0\2\22\35\0\23\22\1\u016c\7\22\2\0"+
    "\2\22\35\0\4\22\1\u016d\26\22\2\0\2\22\35\0"+
    "\1\22\1\u016e\31\22\2\0\2\22\35\0\1\22\1\u016f"+
    "\31\22\2\0\2\22\35\0\2\22\1\u0170\30\22\2\0"+
    "\2\22\35\0\2\22\1\u0171\30\22\2\0\2\22\35\0"+
    "\14\22\1\u0172\16\22\2\0\2\22\35\0\4\22\1\u0173"+
    "\26\22\2\0\2\22\35\0\5\22\1\u0174\25\22\2\0"+
    "\2\22\35\0\13\22\1\u0175\17\22\2\0\2\22\31\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[16500];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\26\1\1\11\10\1\11\11\4\1\3\11"+
    "\1\1\2\11\62\1\2\0\1\11\1\0\1\11\3\0"+
    "\2\1\6\11\76\1\1\11\75\1\1\11\1\0\200\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[373];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _CypherLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _CypherLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return com.intellij.psi.TokenType.BAD_CHARACTER;
            }
          case 117: break;
          case 2: 
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          case 118: break;
          case 3: 
            { return L_IDENTIFIER;
            }
          case 119: break;
          case 4: 
            { return DOLLAR;
            }
          case 120: break;
          case 5: 
            { return OP_BACTICK;
            }
          case 121: break;
          case 6: 
            { return OP_MINUS;
            }
          case 122: break;
          case 7: 
            { return L_INTEGER;
            }
          case 123: break;
          case 8: 
            { return OP_DOT;
            }
          case 124: break;
          case 9: 
            { return OP_DIVIDE;
            }
          case 125: break;
          case 10: 
            { return OP_MUL;
            }
          case 126: break;
          case 11: 
            { return SEMICOLON;
            }
          case 127: break;
          case 12: 
            { return PARENTHESE_OPEN;
            }
          case 128: break;
          case 13: 
            { return PARENTHESE_CLOSE;
            }
          case 129: break;
          case 14: 
            { return BRACKET_CURLYOPEN;
            }
          case 130: break;
          case 15: 
            { return BRACKET_CURLYCLOSE;
            }
          case 131: break;
          case 16: 
            { return BRACKET_SQUAREOPEN;
            }
          case 132: break;
          case 17: 
            { return BRACKET_SQUARECLOSE;
            }
          case 133: break;
          case 18: 
            { return OP_COLON;
            }
          case 134: break;
          case 19: 
            { return OP_EQUAL;
            }
          case 135: break;
          case 20: 
            { return OP_LESSTHEN;
            }
          case 136: break;
          case 21: 
            { return OP_GREATHERTHEN;
            }
          case 137: break;
          case 22: 
            { return OP_PLUS;
            }
          case 138: break;
          case 23: 
            { return OP_COMMA;
            }
          case 139: break;
          case 24: 
            { return OP_QUESTIONSIGN;
            }
          case 140: break;
          case 25: 
            { return OP_PIPE;
            }
          case 141: break;
          case 26: 
            { return OP_MODULO;
            }
          case 142: break;
          case 27: 
            { return OP_POW;
            }
          case 143: break;
          case 28: 
            { return K_AS;
            }
          case 144: break;
          case 29: 
            { return K_IN;
            }
          case 145: break;
          case 30: 
            { return K_IS;
            }
          case 146: break;
          case 31: 
            { return K_OR;
            }
          case 147: break;
          case 32: 
            { return K_ON;
            }
          case 148: break;
          case 33: 
            { return K_BY;
            }
          case 149: break;
          case 34: 
            { return OP_RANGE;
            }
          case 150: break;
          case 35: 
            { return L_STRING;
            }
          case 151: break;
          case 36: 
            { return LINE_COMMENT;
            }
          case 152: break;
          case 37: 
            { return BLOCK_COMMENT;
            }
          case 153: break;
          case 38: 
            { return OP_REGEXMATCH;
            }
          case 154: break;
          case 39: 
            { return OP_LESSTHANEQUALS;
            }
          case 155: break;
          case 40: 
            { return OP_INVALIDNOTEQUALS;
            }
          case 156: break;
          case 41: 
            { return OP_GREATERTHANEQUALS;
            }
          case 157: break;
          case 42: 
            { return OP_PLUSEQUALS;
            }
          case 158: break;
          case 43: 
            { return OP_NOTEQUALS;
            }
          case 159: break;
          case 44: 
            { return K_AND;
            }
          case 160: break;
          case 45: 
            { return K_ANY;
            }
          case 161: break;
          case 46: 
            { return K_ASC;
            }
          case 162: break;
          case 47: 
            { return K_ALL;
            }
          case 163: break;
          case 48: 
            { return K_CSV;
            }
          case 164: break;
          case 49: 
            { return K_REL;
            }
          case 165: break;
          case 50: 
            { return K_END;
            }
          case 166: break;
          case 51: 
            { return K_NOT;
            }
          case 167: break;
          case 52: 
            { return K_SET;
            }
          case 168: break;
          case 53: 
            { return K_XOR;
            }
          case 169: break;
          case 54: 
            { return L_IDENTIFIER_TEXT;
            }
          case 170: break;
          case 55: 
            { return L_DECIMAL;
            }
          case 171: break;
          case 56: 
            { return K_THEN;
            }
          case 172: break;
          case 57: 
            { return K_TRUE;
            }
          case 173: break;
          case 58: 
            { return K_CASE;
            }
          case 174: break;
          case 59: 
            { return K_CALL;
            }
          case 175: break;
          case 60: 
            { return K_ENDS;
            }
          case 176: break;
          case 61: 
            { return K_ELSE;
            }
          case 177: break;
          case 62: 
            { return K_NULL;
            }
          case 178: break;
          case 63: 
            { return K_NONE;
            }
          case 179: break;
          case 64: 
            { return K_NODE;
            }
          case 180: break;
          case 65: 
            { return K_DROP;
            }
          case 181: break;
          case 66: 
            { return K_DESC;
            }
          case 182: break;
          case 67: 
            { return K_SCAN;
            }
          case 183: break;
          case 68: 
            { return K_SKIP;
            }
          case 184: break;
          case 69: 
            { return K_LOAD;
            }
          case 185: break;
          case 70: 
            { return K_WHEN;
            }
          case 186: break;
          case 71: 
            { return K_WITH;
            }
          case 187: break;
          case 72: 
            { return K_FROM;
            }
          case 188: break;
          case 73: 
            { return K_JOIN;
            }
          case 189: break;
          case 74: 
            { return K_MATCH;
            }
          case 190: break;
          case 75: 
            { return K_MERGE;
            }
          case 191: break;
          case 76: 
            { return K_UNION;
            }
          case 192: break;
          case 77: 
            { return K_USING;
            }
          case 193: break;
          case 78: 
            { return K_INDEX;
            }
          case 194: break;
          case 79: 
            { return K_START;
            }
          case 195: break;
          case 80: 
            { return K_ORDER;
            }
          case 196: break;
          case 81: 
            { return K_LIMIT;
            }
          case 197: break;
          case 82: 
            { return K_WHERE;
            }
          case 198: break;
          case 83: 
            { return K_FALSE;
            }
          case 199: break;
          case 84: 
            { return K_BEGIN;
            }
          case 200: break;
          case 85: 
            { return K_YIELD;
            }
          case 201: break;
          case 86: 
            { return K_ASSERT;
            }
          case 202: break;
          case 87: 
            { return K_CREATE;
            }
          case 203: break;
          case 88: 
            { return K_COMMIT;
            }
          case 204: break;
          case 89: 
            { return K_CYPHER;
            }
          case 205: break;
          case 90: 
            { return K_REMOVE;
            }
          case 206: break;
          case 91: 
            { return K_RETURN;
            }
          case 207: break;
          case 92: 
            { return K_REDUCE;
            }
          case 208: break;
          case 93: 
            { return K_EXISTS;
            }
          case 209: break;
          case 94: 
            { return K_UNIQUE;
            }
          case 210: break;
          case 95: 
            { return K_UNWIND;
            }
          case 211: break;
          case 96: 
            { return K_DETACH;
            }
          case 212: break;
          case 97: 
            { return K_DELETE;
            }
          case 213: break;
          case 98: 
            { return K_STARTS;
            }
          case 214: break;
          case 99: 
            { return K_SINGLE;
            }
          case 215: break;
          case 100: 
            { return K_FILTER;
            }
          case 216: break;
          case 101: 
            { return K_HEADERS;
            }
          case 217: break;
          case 102: 
            { return K_EXTRACT;
            }
          case 218: break;
          case 103: 
            { return K_EXPLAIN;
            }
          case 219: break;
          case 104: 
            { return K_FOREACH;
            }
          case 220: break;
          case 105: 
            { return K_PROFILE;
            }
          case 221: break;
          case 106: 
            { return K_CONTAINS;
            }
          case 222: break;
          case 107: 
            { return K_DISTINCT;
            }
          case 223: break;
          case 108: 
            { return K_OPTIONAL;
            }
          case 224: break;
          case 109: 
            { return K_PERIODIC;
            }
          case 225: break;
          case 110: 
            { return K_ASCENDING;
            }
          case 226: break;
          case 111: 
            { return K_CONSTRAINT;
            }
          case 227: break;
          case 112: 
            { return K_DESCENDING;
            }
          case 228: break;
          case 113: 
            { return K_RELATIONSHIP;
            }
          case 229: break;
          case 114: 
            { return K_SHORTESTPATH;
            }
          case 230: break;
          case 115: 
            { return K_FIELDTERMINATOR;
            }
          case 231: break;
          case 116: 
            { return K_ALLSHORTESTPATHS;
            }
          case 232: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
