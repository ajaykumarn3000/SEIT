-- Author: Ajaykumar Nadar

applyTwice::(a->a) -> a -> a
applyTwice f x = f(f x)

main::IO()
main = do 
  putStr "Addition: "
  print (applyTwice (+ 2) 6)