/* Generated By:JavaCC: Do not edit this line. TP1TokenManager.java */
package lym.languages;

/** Token Manager. */
public class TP1TokenManager implements TP1Constants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x18000000L) != 0L)
            return 1;
         if ((active0 & 0x3e5fce1e0L) != 0L)
         {
            jjmatchedKind = 34;
            return 1;
         }
         if ((active0 & 0x1000000000L) != 0L)
            return 3;
         return -1;
      case 1:
         if ((active0 & 0x3e5fce1e0L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 1;
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0x20002000L) != 0L)
            return 1;
         if ((active0 & 0x3c5fcc1e0L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 2;
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x8108c100L) != 0L)
            return 1;
         if ((active0 & 0x344f400e0L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 3;
            return 1;
         }
         return -1;
      case 4:
         if ((active0 & 0x100040000L) != 0L)
            return 1;
         if ((active0 & 0x244f000e0L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 4;
            return 1;
         }
         return -1;
      case 5:
         if ((active0 & 0x4800040L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 5;
            return 1;
         }
         if ((active0 & 0x2407000a0L) != 0L)
            return 1;
         return -1;
      case 6:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 6;
            return 1;
         }
         if ((active0 & 0x800040L) != 0L)
            return 1;
         return -1;
      case 7:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 7;
            return 1;
         }
         return -1;
      case 8:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 8;
            return 1;
         }
         return -1;
      case 9:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 9;
            return 1;
         }
         return -1;
      case 10:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 10;
            return 1;
         }
         return -1;
      case 11:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 11;
            return 1;
         }
         return -1;
      case 12:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 12;
            return 1;
         }
         return -1;
      case 13:
         if ((active0 & 0x4000000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 13;
            return 1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 34:
         return jjStopAtPos(0, 16);
      case 40:
         return jjStopAtPos(0, 11);
      case 41:
         return jjStopAtPos(0, 12);
      case 44:
         return jjStopAtPos(0, 35);
      case 45:
         return jjStartNfaWithStates_0(0, 36, 3);
      case 46:
         return jjStopAtPos(0, 17);
      case 58:
         return jjStopAtPos(0, 25);
      case 72:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x200000040L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x100100L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x40004000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x5000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x8080L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 120:
         return jjStartNfaWithStates_0(0, 27, 1);
      case 121:
         return jjStartNfaWithStates_0(0, 28, 1);
      case 123:
         return jjStopAtPos(0, 9);
      case 125:
         return jjStopAtPos(0, 10);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 83:
         return jjMoveStringLiteralDfa2_0(active0, 0x300000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x802000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x80080000L);
      case 102:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000100L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x40020L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x6500c000L);
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x200040000L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x804000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x80400000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 112:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 114:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x4000080L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x40300000L);
      case 120:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x300000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(3, 15, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      case 102:
         return jjMoveStringLiteralDfa4_0(active0, 0x40L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x20L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 116:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(3, 19, 1);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(3, 24, 1);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(3, 31, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 119:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 1);
         break;
      case 121:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x300080L);
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x200400000L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x20L);
      case 116:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(4, 32, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 85:
         return jjMoveStringLiteralDfa6_0(active0, 0x40L);
      case 107:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(5, 20, 1);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(5, 21, 1);
         break;
      case 109:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(5, 30, 1);
         break;
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      case 114:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(5, 33, 1);
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000L);
      case 116:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 1);
         else if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(5, 7, 1);
         else if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(5, 22, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 73:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(6, 6, 1);
         break;
      case 103:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(6, 23, 1);
         break;
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 117:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa10_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa11_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa12_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 108:
         return jjMoveStringLiteralDfa13_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa14_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 114:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(14, 26, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 4;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(3);
                  }
                  else if (curChar == 45)
                     jjCheckNAdd(3);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if (curChar == 45)
                     jjCheckNAdd(3);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(3);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  jjCheckNAdd(1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 4 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\151\155\160\157\162\164", 
"\123\167\151\146\164\125\111", "\163\164\162\165\143\164", "\126\151\145\167", "\173", "\175", "\50", "\51", 
"\166\141\162", "\142\157\144\171", "\163\157\155\145", "\42", "\56", "\111\155\141\147\145", 
"\124\145\170\164", "\126\123\164\141\143\153", "\110\123\164\141\143\153", 
"\157\146\146\163\145\164", "\160\141\144\144\151\156\147", "\146\157\156\164", "\72", 
"\146\157\162\145\147\162\157\165\156\144\103\157\154\157\162", "\170", "\171", "\164\157\160", "\142\157\164\164\157\155", 
"\154\145\146\164", "\162\151\147\150\164", "\123\160\141\143\145\162", null, "\54", "\55", null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3fffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[4];
private final int[] jjstateSet = new int[8];
protected char curChar;
/** Constructor. */
public TP1TokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public TP1TokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 4; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
