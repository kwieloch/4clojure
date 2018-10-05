(ns four-clojure.easy.problem-38-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-38
  (testing "Maximum value"
    (is (= (__ 1 8 3 4) 8))
    (is (= (__ 30 20) 30))
    (is (= (__ 45 67 11) 67))
    ))

(def __

  (fn [& args] (reduce #(if (< %1 %2) %2 %1) 0 args))

  )