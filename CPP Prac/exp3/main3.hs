addition :: Float -> Float -> Float
addition x y = x+y

subtraction :: Float -> Float -> Float
subtraction x y = x-y

multiplication :: Float -> Float -> Float
multiplication x y = x*y

division :: Float -> Float -> Float
division x y = x/y

main::IO()
main = do
  putStrLn "Enter 2 numbers"
  str1 <- getLine
  str2 <- getLine
  let num1 = read str1 :: Float
  let num2 = read str2 :: Float
  let addnum = addition num1 num2
  let subnum = subtraction num1 num2
  let mulnum = multiplication num1 num2
  let divnum = division num1 num2
  print addnum
  print subnum
  print mulnum
  print divnum
  