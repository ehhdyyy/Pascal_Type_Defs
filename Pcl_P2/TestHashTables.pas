PROGRAM TestHashTables;

CONST
    MINUSFIVE = -5;
    TEN = 10;

TYPE
    greek = (ALPHA, BETA, GAMMA);
    days = (MON, TUE, WED, THU, FRI, SAT, SUN);
    weekdays = MON..FRI;

    ht1 = HASHTABLE <integer, boolean>;
    ht2 = HASHTABLE <string, integer>;
    ht3 = HASHTABLE <string, HASHTABLE<integer, boolean>>;
    ht4 = HASHTABLE <greek, greek>;
    ht5 = HASHTABLE <weekdays, string>;
    ht6 = HASHTABLE <days, greek>;

VAR
    h1 : ht1;
    h2 : ht2;
    h3 : ht3;

    uh1 : HASHTABLE <(JAN, FEB, MAR, APR), integer>;
    uh2 : HASHTABLE <String, integer>;
    uh3 : HASHTABLE <String, (1, 2, 3, 4)>;
                
BEGIN
END.
