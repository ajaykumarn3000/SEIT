-- Author: Ajaykumar Nadar

addition :: Integer -> Integer -> Integer
addition a b = a + b
substraction :: Integer -> Integer -> Integer
substraction x y = x - y
multiplication :: Integer -> Integer -> Integer
multiplication a b = a * b
division :: Float -> Float -> Float
division x y = x / y

main :: IO()
main = do
  putStr "3 + 4 = "
  print (addition 3 4)
  putStr "3 - 4 = "
  print (substraction 3 4)
  putStr "3 x 4 = "
  print (multiplication 3 4)
  putStr "3 / 4 = "
  print (division 3 4)





