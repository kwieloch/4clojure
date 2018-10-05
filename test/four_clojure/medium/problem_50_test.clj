(ns four-clojure.medium.problem-50-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-50
  (testing "Split by Type"
    (is (= (set (__ [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]}))
    (is (= (set (__ [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]}))
    (is (= (set (__ [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]}))
    ))

(def __

  #(vals (group-by class %))

  )