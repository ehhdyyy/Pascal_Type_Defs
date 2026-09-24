PROGRAM TestHashTables;

CONST
    TEN = 10;

TYPE
    greek = (ALPHA, BETA, GAMMA);
    days = (MON, TUE, WED, THU, FRI, SAT, SUN);
    weekdays = MON..FRI;

    { Three proper named hashtable definitions }
    ht1 = HASHTABLE <integer, boolean>;
    ht2 = HASHTABLE <greek, integer>;
    ht3 = HASHTABLE <char, HASHTABLE <boolean, real>>;

VAR
    h1 : ht1;
    h2 : ht2;
    h3 : ht3;

    { Three proper unnamed hashtable definitions }
    u1 : HASHTABLE <1..TEN, real>;
    u2 : HASHTABLE <(RED, GREEN, BLUE), boolean>;
    u3 : HASHTABLE <weekdays, greek>;

BEGIN
END.
