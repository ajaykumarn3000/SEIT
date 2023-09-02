factor :: Int -> [[Int]]
factor n | n `mod` 2 == 0 = [[x | x <- [0,2..n], x <= n], [x | x <- [1,3..n], x <= n]]
factor n | n `mod` 2 == 1 = [[x | x <- [0,2..n], x <= n], [x | x <- [1,3..n], x <= n]]

