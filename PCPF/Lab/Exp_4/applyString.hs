-- Write a function applyString to append two strings using higher order functions

-- Author: Ajaykumar

applyString:: String -> String -> String
applyString a b = a ++ " " ++ b

main :: IO()
main = do
  putStrLn (applyString "Ajaykumar" "Nadar")
  