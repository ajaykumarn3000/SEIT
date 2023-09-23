% Write a program in Prolog to find all possible subsets of a given list.
% Author - Ajaykumar Nadar

subset([], []).

subset([Head | Tail], [Head | Sub]) :- subset(Tail, Sub).
subset([_ | Tail], Sub) :- subset(Tail, Sub).
