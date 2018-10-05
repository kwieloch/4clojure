(ns four-clojure.easy.problem-83-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-83
  (testing "A Half-Truth"
    (is (= false (__ false false)))
    (is (= true (__ true false)))
    (is (= false (__ true)))
    (is (= true (__ false true false)))
    (is (= false (__ true true true)))
    (is (= true (__ true true true false)))
    ))

(def __

  (fn [& l] (and (if (some identity l) true false) (not-every? #{true} l)))

  )