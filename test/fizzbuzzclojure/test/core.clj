(ns fizzbuzzclojure.test.core
  (:use [fizzbuzzclojure.core])
  (:use [clojure.test]))


(deftest one-is-one
  (is (= 1 (fizzbuzz 1)) "One is one"))

(deftest two-is-two
  (is (= 2 (fizzbuzz 2)) "Two is two"))

(deftest three-is-fizz
  (is (= "Fizz" (fizzbuzz 3)) "Three is fizzz"))

(deftest four-is-four
  (is (= 4 (fizzbuzz 4)) "Four is four"))

(deftest five-is-buzz
  (is (= "Buzz" (fizzbuzz 5)) "Five is buzz"))

(deftest six-is-fizz
  (is (= "Fizz" (fizzbuzz 6)) "Six is fizz"))

(deftest ten-is-buzz
  (is (= "Buzz" (fizzbuzz 10)) "Ten is buzz"))

(deftest thirty-is-fizzbuzz
  (is (= "FizzBuzz" (fizzbuzz 30)) "Thirty is fizzbuzz"))

(deftest acceptance-test
  (is (= '(1 2 "Fizz" 4 "Buzz") (map fizzbuzz '(1 2 3 4 5))) "Sould give a list"))