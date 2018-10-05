(ns four-clojure.easy.problem-99-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-99
  (testing "Product Digits"
    (is (= (__ 1 1) [1]))
    (is (= (__ 99 9) [8 9 1]))
    (is (= (__ 999 99) [9 8 9 0 1]))
    ))

(def __

  #(map (fn [x] (- (int x) 48)) (str (* % %2)))

  )