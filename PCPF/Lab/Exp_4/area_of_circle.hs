-- Author: Ajaykumar

areaOfCircle :: Float -> Float
areaOfCircle r = 2 * pi * r

main :: IO ()
main = do
  putStr "Radius = 3\nArea Of Circle = "
  print (areaOfCircle 3)
