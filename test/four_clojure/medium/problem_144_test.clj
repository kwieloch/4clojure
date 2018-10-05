(ns four-clojure.medium.problem-144-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-144
  (testing "Oscilrate"
    (is (= (take 3 (__ 3.14 int double)) [3.14 3 3.0]))
    (is (= (take 5 (__ 3 #(- % 3) #(+ 5 %))) [3 0 5 2 7]))
    (is (= (take 12 (__ 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3]))
    ))

(def __

  (fn [v & args] (reductions #(%2 %) v (cycle args)))

  )