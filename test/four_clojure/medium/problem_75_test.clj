(ns four-clojure.medium.problem-75-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-75
  (testing "Euler's Totient Function"
    (is (= (__ 1) 1))
    (is (= (__ 10) (count '(1 3 7 9)) 4))
    (is (= (__ 40) 16))
    (is (= (__ 99) 60))
    ))

(def __

  (fn [x] 
    (count (filter 
            #(= 1 (loop [a x b %] 
                    (case (rem a b) 
                      0 b 
                      (recur b (rem a b))))) 
            (range 1 (+ 1 x)))))

  )