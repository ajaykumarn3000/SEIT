-- Author: Ajaykumar

areaOfTriangle :: Float -> Float -> Float
areaOfTriangle x y = x * y / 2

main :: IO ()
main = do
  putStr "Height = 3, Base = 4\nArea Of Triangle = "
  print (truncate (areaOfTriangle 2 3))
