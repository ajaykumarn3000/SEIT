squareRoot :: [Int] -> [Int]
squareRoot ys = [ x | x <- ys, sqrt (fromIntegral x) > 7]

main :: IO()
main = do
  let array = squareRoot [43, 13, 64, 85, 38, 100, 81, 4, 1]
  print array