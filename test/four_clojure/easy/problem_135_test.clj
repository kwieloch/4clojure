(ns four-clojure.easy.problem-135-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-135
  (testing "Infix Calculator"
    (is (= 7  (__ 2 + 5)))
    (is (= 42 (__ 38 + 48 - 2 / 2)))
    (is (= 8  (__ 10 / 2 - 1 * 2)))
    (is (= 72 (__ 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9)))
    ))

(def __

  #(reduce (fn [a [o e]] (o a e)) % (partition 2 %&))

  )