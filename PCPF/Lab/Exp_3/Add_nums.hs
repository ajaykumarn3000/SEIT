module Add_nums(main) where
  num1 :: Int
  num2 :: Int 
  num1 = 2
  num2 = 3
  num3 = num1 + num2

  main :: IO()
  main = 
    print num3
    