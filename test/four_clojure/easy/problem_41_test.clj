(ns four-clojure.easy.problem-41-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-41
  (testing "Drop Every Nth Item"
    (is (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))
    (is (= (__ [:a :b :c :d :e :f] 2) [:a :c :e]))
    (is (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6]))
    ))

(def __

  (fn [l n] 
    (for [[x y] (map (fn [a b] [a (inc b)]) l (cycle (range n)))
          :when (not= y  n)] 
      x))

  )
