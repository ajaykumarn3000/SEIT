main::IO()
main = do
  putStrLn "Insert the first value: "
  one <- getLine
  putStrLn "Insert the second value: "
  two <- getLine
  putStrLn "Addition: "
  print ((read one) + (read two))
  putStrLn "Subtraction: "
  putStrLn $ (" Subtraction: " ++ show ((read one) - (read two)))