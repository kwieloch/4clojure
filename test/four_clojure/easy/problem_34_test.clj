(ns four-clojure.easy.problem-34-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-34
  (testing "Implement range"
    (is (= (__ 1 4) '(1 2 3)))
    (is (= (__ -2 2) '(-2 -1 0 1)))
    (is (= (__ 5 8) '(5 6 7)))
    ))

(def __

  #(take (- %2 %1) (iterate inc %1))

  )