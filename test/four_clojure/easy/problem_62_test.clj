(ns four-clojure.easy.problem-62-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-62
  (testing "Re-implement Iterate"
    (is (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16]))
    (is (= (take 100 (__ inc 0)) (take 100 (range))))
    (is (= (take 9 (__ #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3]))))
    ))

(def __

  #(reductions (fn [a e] (%1 a)) %2 (range))

  )