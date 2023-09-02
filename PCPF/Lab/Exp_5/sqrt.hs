squareRoot :: [Int] -> [Int]
squareRoot ys = [ x | x <- ys, sqrt (fromIntegral x) > 7]