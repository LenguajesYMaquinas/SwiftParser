/* Generated By:JavaCC: Do not edit this line. SwiftViews.java */
package lym.languages;

public class SwiftViews implements SwiftViewsConstants {
  public static void main(String args []) throws ParseException
  {
    SwiftViews parser = new SwiftViews(System.in);
    while (true)
    {
      try
      {
        switch (parser.one_line())
        {
          case 0 :
          System.out.println("OK.");
          break;
          case 1 :
          System.out.println("Goodbye.");
          break;
          default :
          break;
        }
      }
      catch (Exception e)
      {
        System.out.println("NOK.");
        System.out.println(e.getMessage());
       // SwiftViews.ReInit(System.in);
      }
      catch (Error e)
      {
        System.out.println("Oops.");
        System.out.println(e.getMessage());
        break;
      }
    }
  }

  final public int one_line() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IMPORT:
      structView();
    {if (true) return 0;}
      break;
    default:
      jj_la1[0] = jj_gen;
    {if (true) return 1;}
    }
    throw new Error("Missing return statement in function");
  }

  final public void structView() throws ParseException {
    jj_consume_token(IMPORT);
    jj_consume_token(SWIFTUI);
    label_1:
    while (true) {
      jj_consume_token(STRUCT);
      label_2:
      while (true) {
        jj_consume_token(STRING);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case STRING:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
      }
      jj_consume_token(COLON);
      jj_consume_token(VIEW);
      jj_consume_token(LBRACKET);
      structBody();
      jj_consume_token(RBRACKET);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STRUCT:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_1;
      }
    }
  }

  final public void structBody() throws ParseException {
    jj_consume_token(VAR);
    jj_consume_token(BODY);
    jj_consume_token(COLON);
    jj_consume_token(SOME);
    jj_consume_token(VIEW);
    jj_consume_token(LBRACKET);
    label_3:
    while (true) {
      viewBody();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IMAGE:
      case TEXT:
      case SPACER:
      case VSTACK:
      case HSTACK:
      case STRING:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_3;
      }
    }
    jj_consume_token(RBRACKET);
  }

  final public void viewBody() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STRING:
      structViewCall();
      break;
    case IMAGE:
      imageComponent();
      break;
    case TEXT:
      textComponent();
      break;
    case SPACER:
      spacerComponent();
      break;
    case VSTACK:
    case HSTACK:
      structuringElement();
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void structViewCall() throws ParseException {
    label_4:
    while (true) {
      jj_consume_token(STRING);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STRING:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_4;
      }
    }
    jj_consume_token(LPARENTHESIS);
    jj_consume_token(RPARENTHESIS);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case POINT:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_5;
      }
      forImageAndViewMethod();
    }
  }

  final public void imageComponent() throws ParseException {
    jj_consume_token(IMAGE);
    jj_consume_token(LPARENTHESIS);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SIMPLEQUOTATION:
      jj_consume_token(SIMPLEQUOTATION);
      break;
    case DOUBLEQUOTATION:
      jj_consume_token(DOUBLEQUOTATION);
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    label_6:
    while (true) {
      jj_consume_token(STRING);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STRING:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_6;
      }
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SIMPLEQUOTATION:
      jj_consume_token(SIMPLEQUOTATION);
      break;
    case DOUBLEQUOTATION:
      jj_consume_token(DOUBLEQUOTATION);
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(RPARENTHESIS);
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case POINT:
        ;
        break;
      default:
        jj_la1[10] = jj_gen;
        break label_7;
      }
      forImageAndViewMethod();
    }
  }

  final public void textComponent() throws ParseException {
    jj_consume_token(TEXT);
    jj_consume_token(LPARENTHESIS);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SIMPLEQUOTATION:
      jj_consume_token(SIMPLEQUOTATION);
      break;
    case DOUBLEQUOTATION:
      jj_consume_token(DOUBLEQUOTATION);
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    label_8:
    while (true) {
      jj_consume_token(STRING);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STRING:
        ;
        break;
      default:
        jj_la1[12] = jj_gen;
        break label_8;
      }
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case SIMPLEQUOTATION:
      jj_consume_token(SIMPLEQUOTATION);
      break;
    case DOUBLEQUOTATION:
      jj_consume_token(DOUBLEQUOTATION);
      break;
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(RPARENTHESIS);
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case POINT:
        ;
        break;
      default:
        jj_la1[14] = jj_gen;
        break label_9;
      }
      forTextAndStructuringElemenMethod();
    }
  }

  final public void spacerComponent() throws ParseException {
    jj_consume_token(SPACER);
    jj_consume_token(LPARENTHESIS);
    jj_consume_token(RPARENTHESIS);
  }

  final public void structuringElement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VSTACK:
      jj_consume_token(VSTACK);
      break;
    case HSTACK:
      jj_consume_token(HSTACK);
      break;
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(LBRACKET);
    label_10:
    while (true) {
      viewBody();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IMAGE:
      case TEXT:
      case SPACER:
      case VSTACK:
      case HSTACK:
      case STRING:
        ;
        break;
      default:
        jj_la1[16] = jj_gen;
        break label_10;
      }
    }
    jj_consume_token(RBRACKET);
    label_11:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case POINT:
        ;
        break;
      default:
        jj_la1[17] = jj_gen;
        break label_11;
      }
      forTextAndStructuringElemenMethod();
    }
  }

  final public void forImageAndViewMethod() throws ParseException {
    jj_consume_token(POINT);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case OFFSET:
      offset();
      break;
    case PADDING:
      padding();
      break;
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void forTextAndStructuringElemenMethod() throws ParseException {
    jj_consume_token(POINT);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case OFFSET:
      offset();
      break;
    case PADDING:
      padding();
      break;
    case FONT:
      font();
      break;
    case FOREGROUNDCOLOR:
      foregroundColor();
      break;
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void offset() throws ParseException {
    jj_consume_token(OFFSET);
    jj_consume_token(LPARENTHESIS);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case X:
    case Y:
      offsetArgument();
      break;
    default:
      jj_la1[20] = jj_gen;
      ;
    }
    jj_consume_token(RPARENTHESIS);
  }

  final public void offsetArgument() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case X:
      jj_consume_token(X);
      jj_consume_token(COLON);
      number();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        jj_consume_token(COMMA);
        jj_consume_token(Y);
        jj_consume_token(COLON);
        number();
        break;
      default:
        jj_la1[21] = jj_gen;
        ;
      }
      break;
    case Y:
      jj_consume_token(Y);
      jj_consume_token(COLON);
      number();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        jj_consume_token(COMMA);
        jj_consume_token(X);
        jj_consume_token(COLON);
        number();
        break;
      default:
        jj_la1[22] = jj_gen;
        ;
      }
      break;
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void number() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case DASH:
      jj_consume_token(DASH);
      break;
    default:
      jj_la1[24] = jj_gen;
      ;
    }
    label_12:
    while (true) {
      jj_consume_token(DIGIT);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DIGIT:
        ;
        break;
      default:
        jj_la1[25] = jj_gen;
        break label_12;
      }
    }
  }

  final public void padding() throws ParseException {
    jj_consume_token(PADDING);
    jj_consume_token(LPARENTHESIS);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case POINT:
      paddingArgument();
      break;
    default:
      jj_la1[26] = jj_gen;
      ;
    }
    jj_consume_token(RPARENTHESIS);
  }

  final public void paddingArgument() throws ParseException {
    jj_consume_token(POINT);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case TOP:
      jj_consume_token(TOP);
      jj_consume_token(COMMA);
      number();
      break;
    case BOTTOM:
      jj_consume_token(BOTTOM);
      jj_consume_token(COMMA);
      number();
      break;
    case LEFT:
      jj_consume_token(LEFT);
      jj_consume_token(COMMA);
      number();
      break;
    case RIGHT:
      jj_consume_token(RIGHT);
      jj_consume_token(COMMA);
      number();
      break;
    default:
      jj_la1[27] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void font() throws ParseException {
    jj_consume_token(FONT);
    jj_consume_token(LPARENTHESIS);
    jj_consume_token(POINT);
    label_13:
    while (true) {
      jj_consume_token(STRING);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STRING:
        ;
        break;
      default:
        jj_la1[28] = jj_gen;
        break label_13;
      }
    }
    jj_consume_token(RPARENTHESIS);
  }

  final public void foregroundColor() throws ParseException {
    jj_consume_token(FOREGROUNDCOLOR);
    jj_consume_token(LPARENTHESIS);
    jj_consume_token(POINT);
    label_14:
    while (true) {
      jj_consume_token(STRING);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STRING:
        ;
        break;
      default:
        jj_la1[29] = jj_gen;
        break label_14;
      }
    }
    jj_consume_token(RPARENTHESIS);
  }

  /** Generated Token Manager. */
  public SwiftViewsTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[30];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x2000,0x0,0x20,0x19c00,0x19c00,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x18000,0x19c00,0x0,0x60000,0x6060000,0x180000,0x0,0x0,0x180000,0x0,0x0,0x0,0x1e00000,0x0,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x80,0x0,0x80,0x80,0x80,0x8,0x6,0x80,0x6,0x8,0x6,0x80,0x6,0x8,0x0,0x80,0x8,0x0,0x0,0x0,0x20,0x20,0x0,0x10,0x40,0x8,0x0,0x80,0x80,};
   }

  /** Constructor with InputStream. */
  public SwiftViews(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public SwiftViews(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SwiftViewsTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 30; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 30; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public SwiftViews(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SwiftViewsTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 30; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 30; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public SwiftViews(SwiftViewsTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 30; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(SwiftViewsTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 30; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[40];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 30; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 40; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}