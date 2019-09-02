package RDPCrystalEDILibrary;

public enum RuleOperator {
  EQ(0L),
  NE(1L),
  GT(2L),
  GE(3L),
  LT(4L),
  LE(5L),
  EXISTS(6L),
  NEXIST(7L),
  CONTAINS(8L),
  NOTCONTAINS(9L),
  STARTSWITH(10L),
  NOTSTARTSWITH(11L),
  ENDSWITH(12L),
  NOTENDSWITH(13L),
  LENGTHEQUAL(14L),
  LENGTHNOTEQUAL(15L),
  LENGTHLESSTHAN(16L),
  LENGTHGREATERTHAN(17L),
  ;
  private long numVal;

  RuleOperator(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
