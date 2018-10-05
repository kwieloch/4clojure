(ns four-clojure.easy.problem-157-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-157
  (testing "Indexing Sequences"
    (is (= (__ [:a :b :c]) [[:a 0] [:b 1] [:c 2]]))
    (is (= (__ [0 1 3]) '((0 0) (1 1) (3 2))))
    (is (= (__ [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]]))
    ))

(def __

  #(map list % (range))

  )