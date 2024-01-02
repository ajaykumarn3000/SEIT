a :: Integer -> Integer-> Integer
a x y = x+y


s :: Integer->Integer->Integer
s x y = x-y


m :: Integer->Integer->Integer
m x y = x*y


d :: Float -> Float ->Float
d x y = x/y


main :: IO()
main = do
  print "Enter two numbers"
  str1 <- getLine
  str2 <- getLine
  let num1 = read str1 :: Integer
  let num2 = read str2 :: Integer
  
  
  
  let aans = a num1 num2
  let sans= (s num1 num2)
  let mans= (m num1 num2)
  let dans= (d (fromIntegral num1) (fromIntegral num2))
  
  print aans
  print sans
  print mans
  print dans
  