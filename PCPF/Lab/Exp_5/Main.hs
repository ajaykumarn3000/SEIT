space:: Int->String
space n  = [' ' | x <- [1..n]]

main = do 
    putStr "Enter A number: "
    y <- getLine
    space (read y)
