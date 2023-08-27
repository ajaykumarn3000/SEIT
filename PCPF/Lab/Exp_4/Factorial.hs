-- Author: Ajaykumar Nadar

factorial::Int->Int
factorial n | n == 0 = 1
factorial n | n /= 0 = n * factorial(n-1)

main :: IO ()
main = do
  putStr "4! = "
  print (factorial 4)
  putStr "5! = "
  print (factorial 5) 