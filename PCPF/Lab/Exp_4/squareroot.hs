-- Author: Ajaykumar

addition:: Int -> Int ->Int
addition x y = x + y

squareroot :: Float -> Float 
squareroot x = x ** 0.5

main :: IO ()
main = do
  let num = (squareroot (fromIntegral (addition 9 16 )))
  putStr "sqrt(9 + 16) = "
  putStrLn $ show (truncate num)
