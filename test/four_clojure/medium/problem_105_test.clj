(ns four-clojure.medium.problem-105-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-105
  (testing "Identify keys and values"
    (is (= {} (__ [])))
    (is (= {:a [1]} (__ [:a 1])))
    (is (= {:a [1], :b [2]} (__ [:a 1, :b 2])))
    (is (= {:a [1 2 3], :b [], :c [4]} (__ [:a 1 2 3 :b :c 4])))
    ))

(def __

  #(second 
       (reduce (fn [[p a] c]
                   (if (number? c) 
                       [p (assoc a p (conj (a p) c))]
                     [c (assoc a c [])])) 
               [0 {}]
               %))

  )