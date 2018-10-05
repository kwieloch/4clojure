(ns four-clojure.medium.problem-44-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-44
  (testing "Rotate Sequence"
    (is (= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2)))
    (is (= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3)))
    (is (= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1)))
    (is (= (__ 1 '(:a :b :c)) '(:b :c :a)))
    (is (= (__ -4 '(:a :b :c)) '(:c :a :b)))
    ))

(def __

  (fn [n l] (let [c (count l)
                  p (rem n c) 
                  s (if (neg? p) (+ p c) p)]
              (concat (drop s l) (take s l))))

  )