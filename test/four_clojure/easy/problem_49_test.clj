(ns four-clojure.easy.problem-49-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-49
  (testing "Split a sequence"
    (is (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))
    (is (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]]))
    (is (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]]))
    ))

(def __

  #(vector (take %1 %2) (drop %1 %2))

  )