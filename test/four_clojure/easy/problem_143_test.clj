(ns four-clojure.easy.problem-143-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-143
  (testing "dot product"
    (is (= 0 (__ [0 1 0] [1 0 0])))
    (is (= 3 (__ [1 1 1] [1 1 1])))
    (is (= 32 (__ [1 2 3] [4 5 6])))
    (is (= 256 (__ [2 5 6] [100 10 1])))
    ))

(def __

  #(reduce + (map * %1 %2))

  )