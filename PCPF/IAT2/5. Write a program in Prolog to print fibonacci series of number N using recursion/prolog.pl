% Base cases: Fibonacci of 0 is 0 and Fibonacci of 1 is 1.
fibonacci(0, 0).
fibonacci(1, 1).

% Recursive case: Calculate the Nth Fibonacci number.
fibonacci(N, Result) :-
    N > 1,
    N1 is N - 1,
    N2 is N - 2,
    fibonacci(N1, Fib1),
    fibonacci(N2, Fib2),
    Result is Fib1 + Fib2.

% Print the Fibonacci series up to N.
print_fibonacci_series(N) :-
    N >= 0,
    print_fibonacci_series(N, 0).

print_fibonacci_series(N, N).
print_fibonacci_series(N, Current) :-
    fibonacci(Current, Fib),
    write(Fib), write(' '),
    Next is Current + 1,
    print_fibonacci_series(N, Next).