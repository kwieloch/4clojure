(ns four-clojure.medium.problem-158-test
   (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-158
 (testing "Decurry"
   (is (= 10 ((__ (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (+ a b c d))))))
              1 2 3 4)))
   (is (= 24 ((__ (fn [a]
    (fn [b]
      (fn [c]
        (fn [d]
          (* a b c d))))))
              1 2 3 4)))
   (is (= 25 ((__ (fn [a]
    (fn [b]
      (* a b))))
              5 5)))
   ))

(def __

 (fn [f] (fn [& a] (reduce #(% %2) f a) ))

 )
