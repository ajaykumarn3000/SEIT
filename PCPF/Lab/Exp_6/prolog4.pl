% Not Operation
notGate(false).

% And Operation
andGate(true, true).

% OR Operation
orGate(_, true).
orGate(true, _).

% NAND Operation
nandGate(_, false).
nandGate(false, _).

% NOR Operation
norGate(false, false).

