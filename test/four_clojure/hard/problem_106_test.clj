(ns four-clojure.hard.problem-106-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-106
  (testing "Number Maze"
    (is (= 1 (__ 1 1)))
    (is (= 3 (__ 3 12)))
    (is (= 3 (__ 12 3)))
    (is (= 3 (__ 5 9)))
    (is (= 9 (__ 9 2)))
    (is (= 5 (__ 9 12)))
    ))

(def __

  (fn [b e]
    (loop [i 1 s #{b}]
    			(if (s e)
      			i
      			(recur (+ 1 i) (reduce #(conj % (* 2 %2) (+ 2 %2) (/ %2 2)) s s)))))

  )