-- Author: Ajaykumar

multThree :: Int -> Int -> Int ->Int
multThree x y z = x*y*z

applyFunc :: (Int->Int->Int) ->Int -> Int ->Int
applyFunc f x y = f x y

main :: IO ()
main = do
  print (multThree 2 3 4)
  print (applyFunc (multThree 2) 6 4)
