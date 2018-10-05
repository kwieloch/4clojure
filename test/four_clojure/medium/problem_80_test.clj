(ns four-clojure.medium.problem-80-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-80
  (testing "Perfect Numbers"
    (is (= (__ 6) true))
    (is (= (__ 7) false))
    (is (= (__ 496) true))
    (is (= (__ 500) false))
    (is (= (__ 8128) true))
    ))

(def __

  (fn [x] (= x (apply + (filter #(= 0 (rem x %)) (range 1 x)))))

  )