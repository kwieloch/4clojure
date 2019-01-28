(ns four-clojure.medium.problem-60-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-60
  (testing "SequenceReductions"
    (is (= (take 5 (__ + (range))) [0 1 3 6 10]))
    (is (= (__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]]))
    (is (= (last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120))
    ))

(def __

  (fn red
    ([f [x & xs]]
     (red f x xs))
    ([f i [x & xs]]
     (lazy-seq (cons i (when x
                            (red f (f i x) xs))))))

)
