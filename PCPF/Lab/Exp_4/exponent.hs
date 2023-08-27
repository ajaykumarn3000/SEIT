-- Author: Ajaykumar

exponentFunc :: Int -> Int -> Int
exponentFunc x y = x ^ y

main :: IO ()
main = do
  putStr " 4 ^ 3 = "
  print (exponentFunc 4 3)