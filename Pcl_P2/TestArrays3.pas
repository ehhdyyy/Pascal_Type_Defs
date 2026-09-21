PROGRAM TestArrays3;

CONST
    MINUSFIVE = -5;
    TEN = 10;

TYPE
    greek = (ALPHA, BETA, GAMMA);
    days = (MON, TUE, WED, THU, FRI, SAT, SUN);
    weekdays = MON..FRI;
    sr1 = 5..25;
    sr2 = MINUSFIVE..TEN;
    sr3 = -TEN..-3;
               
    ar1 = ARRAY [sr1] OF ARRAY [sr2] OF weekdays;
    ar2 = ARRAY [sr1, sr2, sr3] OF weekdays;
                        
BEGIN
END.
