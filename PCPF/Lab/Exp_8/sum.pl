% Author - Ajaykumar Nadar

summ(0,0).
summ(N,F):-
  (
    N>0 -> (N1 is N-1, summ(N1,F1), F is N+F1);
    N<0 -> (N1 is N+1, summ(N1,F1), F is N+F1)
  ).