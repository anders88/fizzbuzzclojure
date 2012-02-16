(ns fizzbuzzclojure.core)

(defn isDividableBy? [number divisor]
  (= (rem number divisor) 0))

(defn fizzbuzz [x] 
  (cond    
    (isDividableBy? x 15) "FizzBuzz"
    (isDividableBy? x 3)  "Fizz" 
    (isDividableBy? x 5)  "Buzz"
    :else    x))
