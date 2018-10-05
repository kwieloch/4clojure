(ns four-clojure.easy.problem-20-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-20
  (testing "Penultimate Element"
    (is (= (__ (list 1 2 3 4 5)) 4))
    (is (= (__ ["a" "b" "c"]) "b"))
    (is (= (__ [[1 2] [3 4]]) [1 2]))
    ))

(def __

  (fn [l] (nth (reverse l) 1))

  )
