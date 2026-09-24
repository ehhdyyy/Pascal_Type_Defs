PROGRAM ErrorHashTablesSemantic;

TYPE
    greek = (ALPHA, BETA, GAMMA);

VAR
    ok : HASHTABLE <integer, boolean>;

    badKey : HASHTABLE <string, integer>;
    badKey2 : HASHTABLE <real, greek>;

BEGIN
END.
