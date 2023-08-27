-- Author: Ajaykumar Nadar

flipFunction :: (a -> b -> c) -> b -> a -> c
flipFunction f x y = f y x

main :: IO ()
main = do
  putStr "5 - 3 = "
  print (flipFunction (-) 5 3)
  putStr "5 / 2 = "
  print (flipFunction (/) 5 2)