doublep :: [Int] -> [Int]
doublep x = [2*y | y <-x, y>0]

spacep :: Int -> String
spacep n = [' ' | y <- [1..n]]

triples :: (Int, Int, Int) -> [(Int, Int,Int)]
triples (x,y,z) = [(m,n,o) | m<-[1..x], n<-[1..y], o<-[1..z], m^2 + n^2 == o^2]

factor :: Int -> [Int]
factor n = [x | x <- [1..n], n `mod` x == 0]
