-- Author: Ajayumar Nadar

factor :: Int -> [Int]
factor n = [ x | x <- [2..(n-1)], n `mod` x == 0]

main :: IO()
main = do
  let x = factor 24
  print x