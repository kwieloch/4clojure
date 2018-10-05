(ns four-clojure.hard.problem-92-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-92
  (testing "Read Roman numerals"
    (is (= 14 (__ "XIV")))
    (is (= 827 (__ "DCCCXXVII")))
    (is (= 3999 (__ "MMMCMXCIX")))
    (is (= 48 (__ "XLVIII")))
    ))

(def __

  #(second (reduce (fn [[p a] e] (let [c ({\I 1 \V 5 \X 10 \L 50 \C 100 \D 500 \M 1000} e)
                               v (if (< p c) (- c (* 2 p)) c)]
                           [c (+ a v)])) [0 0] %))

  )