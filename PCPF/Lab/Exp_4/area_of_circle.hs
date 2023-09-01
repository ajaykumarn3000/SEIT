-- Author: Ajaykumar

areaOfCircle :: Float -> Float
areaOfCircle r = pi * r**2

main :: IO ()
main = do
  putStr "Radius = 3\nArea Of Circle = "
  print (areaOfCircle 3)
