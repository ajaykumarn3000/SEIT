-- Write a Haskell snippet to implement Fibonacci series. Define an expression fibs :: [Integer] that
-- generates this infinite sequence.

-- Author: Ajaykumar Nadar

fibs :: [Integer]
fibs = 0 : 1 : zipWith (+) fibs (tail fibs)

main :: IO ()
main = do
    print (take 10 fibs)
    
