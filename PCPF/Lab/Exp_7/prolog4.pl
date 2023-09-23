% Author - Ajaykumar Nadar

list_insert([],[],[]).
list_insert(X,[],[X]).
list_insert(X, [Head|Tail], [X, Head|Tail]).