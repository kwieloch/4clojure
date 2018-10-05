(ns four-clojure.medium.problem-46-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-46
  (testing "Flipping out"
    (is (= 3 ((__ nth) 2 [1 2 3 4 5])))
    (is (= true ((__ >) 7 8)))
    (is (= 4 ((__ quot) 2 8)))
    (is (= [1 2 3] ((__ take) [1 2 3 4 5] 3)))
    ))

(def __

  #(fn [a1 a2] (% a2 a1))

  )