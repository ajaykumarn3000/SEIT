-- Author: Ajaykumar Nadar

divideByTen :: Float -> Float
divideByTen x = (x / 10)

main :: IO ()
main = do
  putStr "25 / 10 = "
  print (divideByTen 25)
