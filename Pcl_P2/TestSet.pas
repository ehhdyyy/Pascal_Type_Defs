PROGRAM TestSet;

TYPE
    numbers = 1..5;

    { Three proper named set definitions }  
    integerset = set of integer;
    charset = set of char;
    booleanset = set of boolean;

VAR

    
    i1 : integerset;
    c1 : charset;
    b1 : booleanset;

    { Three proper unnamed set definitions }
    r1 : set of numbers;
    r2 : set of char;
    r3 : set of boolean;

BEGIN
END.