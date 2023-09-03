-- Define a function spaces n which returns a string of n spaces 

-- Author: Ajaykumar Nadar

space:: Int->String
space n  = [' ' | x <- [1..n]]

main = do 
    let x = space 5
    print x
