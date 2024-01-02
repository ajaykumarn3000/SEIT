notGate(false).

andGate(true, true).

orGate(_, true).
orGate(true, _).

nandGate(_, false).
nandGate(false, _).

norGate(false, false).

happy(mia).
Mia is happy

listens2Music(yolanda):- happy(yolanda).
if yolanda is happy then yolanda listens2Music

professor(X, Y) :- teaches(X, C), studies(Y, C). 
if X teaches C and Y studies C then X is the professor of Y