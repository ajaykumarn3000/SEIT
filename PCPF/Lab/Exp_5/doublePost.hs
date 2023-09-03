-- Define a function doublePost that doubles the positive elements in the list of integers 

-- Author: Ajaykumar Nadar

doublePost :: [Int] -> [Int]
doublePost x = [2*y | y <- x, y>0]

main :: IO()
main = do
  let array = [-10, -7..15]
  let posArray = doublePost array
  print posArray