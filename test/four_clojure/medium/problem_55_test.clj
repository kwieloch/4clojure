(ns four-clojure.medium.problem-55-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-55
  (testing "Count Occurrences"
    (is (= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1}))
    (is (= (__ [:b :a :b :a :b]) {:a 2, :b 3}))
    (is (= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2}))
    ))

(def __

  (fn [x] (reduce #(assoc %1 %2 (inc (%1 %2 0))) {} x))

  )