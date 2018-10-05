(ns four-clojure.easy.problem-66-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-66
  (testing "Greatest Common Divisor"
    (is (= (__ 2 4) 2))
    (is (= (__ 10 5) 5))
    (is (= (__ 5 7) 1))
    (is (= (__ 1023 858) 33))
    ))

(def __

  #(case (mod %1 %2) 0 %2 (recur %2 (rem %1 %2)))

  )