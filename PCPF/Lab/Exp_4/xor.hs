-- Author: Ajaykumar

xor :: Bool -> Bool -> Bool
xor x y | x == y = False
xor x y | x /= y = True

main :: IO ()
main = do
  putStr "xor False True = "
  print (xor False True)

  putStr "xor False False = "
  print (xor False False)
