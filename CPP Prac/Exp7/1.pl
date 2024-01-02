palindrome([]).
palindrome([_]).
palindrome([H|L]):-append(Mid, [H], L), palindrome(Mid).