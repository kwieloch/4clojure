(ns four-clojure.easy.problem-21-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-21
  (testing "Nth Element"
    (is (= (__ '(4 5 6 7) 2) 6))
    (is (= (__ [:a :b :c] 0) :a))
    (is (= (__ [1 2 3 4] 1) 2))
    (is (= (__ '([1 2] [3 4] [5 6]) 2) [5 6]))
    ))

(def __

  (fn [l n] 
    (if (= n 0) 
      (first l) 
      (recur (rest l) (dec n))))

  )
