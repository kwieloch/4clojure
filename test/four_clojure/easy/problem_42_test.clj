(ns four-clojure.easy.problem-42-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-42
  (testing "Factorial Fun"
    (is (= (__ 1) 1))
    (is (= (__ 3) 6))
    (is (= (__ 5) 120))
    (is (= (__ 8) 40320))
    ))

(def __

  (fn [n] (reduce * 1 (range 1 (inc n))))

  )