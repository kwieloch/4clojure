(ns four-clojure.medium.problem-54-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-54
  (testing "Partition a Sequence"
    (is (= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8))))
    (is (= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7))))
    (is (= (__ 3 (range 8)) '((0 1 2) (3 4 5))))
    ))

(def __

  (fn [n s] (apply map list (map #(take-nth n (drop % s)) (range n)) ))

  )