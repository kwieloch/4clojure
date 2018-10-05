(ns four-clojure.medium.problem-58-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-58
  (testing "Function Composition"
    (is (= [3 2 1] ((__ rest reverse) [1 2 3 4])))
    (is (= 5 ((__ (partial + 3) second) [1 2 3 4])))
    (is (= true ((__ zero? #(mod % 8) +) 3 5 7 9)))
    (is (= "HELLO" ((__ #(.toUpperCase %) #(apply str %) take) 5 "hello world")))
    ))

(def __

  (fn [& f] 
    (fn [& a] 
      (reduce #(%2 %1) 
              (apply (last f) a) 
              (rest (reverse f)))))

  )