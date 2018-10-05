(ns four-clojure.easy.problem-26-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-26
  (testing "Fibonacci Sequence"
    (is (= (__ 3) '(1 1 2)))
    (is (= (__ 6) '(1 1 2 3 5 8)))
    (is (= (__ 8) '(1 1 2 3 5 8 13 21)))
    ))

(def __

  (fn [n] 
    (take n 
          (map first 
               (iterate 
                (fn [[a b]] [b (+ a b)]) 
                [1 1]))))
  
  )
