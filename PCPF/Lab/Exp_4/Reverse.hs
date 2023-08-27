-- Write a program in Haskell to reverse a string using recursion 

-- Author: Ajaykumar Nadar

reverseString :: String -> String
reverseString n| length n == 0 = ""
reverseString n| length n /= 0 = [last n] ++ (reverseString (init n))

main :: IO ()
main = do
  putStrLn (reverseString "AJAY KUMAR")