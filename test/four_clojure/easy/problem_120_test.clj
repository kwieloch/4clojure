(ns four-clojure.easy.problem-120-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-120
  (testing "Sum of square of digits"
    (is (= 8 (__ (range 10))))
    (is (= 19 (__ (range 30))))
    (is (= 50 (__ (range 100))))
    (is (= 50 (__ (range 1000))))
    ))

(def __

  (fn [s] (count (filter (fn [n] (< n (apply + (map #(Math/pow (Character/digit % 10) 2) (str n))))) s)))

  )