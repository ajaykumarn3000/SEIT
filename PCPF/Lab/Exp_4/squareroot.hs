-- Author: Ajaykumar

addition:: Int -> Int ->Int
addition x y = x + y

squareroot :: Float -> Float 
squareroot x = x ** 0.5

main :: IO ()
main = do
  let num = (squareroot (fromIntegral (addition (3^2) (4^2) )))
  putStr "3^2 + 4^2 =  "
  putStrLn $ show (truncate num) ++ "^2"
