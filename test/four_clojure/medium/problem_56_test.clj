(ns four-clojure.medium.problem-56-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-56
  (testing "Find Distinct Items"
    (is (= (__ [1 2 1 3 1 2 4]) [1 2 3 4]))
    (is (= (__ [:a :a :b :b :c :c]) [:a :b :c]))
    (is (= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3])))
    (is (= (__ (range 50)) (range 50)))
    ))

(def __

  (fn [x] (reduce #(if (contains? (set %1) %2) %1 (conj %1 %2)) [] x))

  )