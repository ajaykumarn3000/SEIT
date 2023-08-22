import Text.Read (readMaybe) -- 

add :: Float -> Float -> Float
add x y = x + y

subtractt :: Float -> Float -> Float
subtractt x y = x - y

multiply :: Float -> Float -> Float
multiply x y = x * y

main :: IO ()
main = do
  putStrLn "Enter the first number: "
  num1Str <- getLine
  let num1Float = readMaybe num1Str :: Maybe Float

  putStrLn "Enter the second number: "
  num2Str <- getLine
  let num2Float = readMaybe num2Str :: Maybe Float

  case (num1Float, num2Float) of 
    (Just n1, Just n2) -> do
      let addition = add n1 n2
          subtraction = subtractt n1 n2
          multiplication = multiply n1 n2

      putStrLn ("Sum: " ++ show addition)
      putStrLn ("Difference: " ++ show subtraction) 
      putStrLn ("Product: " ++ show multiplication)
      
    _ -> putStrLn "Invalid input"
