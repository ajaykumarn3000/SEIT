% Base case: If the list is empty, the result is also an empty list.
delete_number(_, [], []).

% If the element at the head of the list is the number to be deleted, skip it.
delete_number(X, [X|T], Result) :-
    delete_number(X, T, Result).

% If the element at the head of the list is not the number to be deleted, keep it in the result.
delete_number(X, [H|T], [H|Result]) :-
    H \= X,
    delete_number(X, T, Result).
