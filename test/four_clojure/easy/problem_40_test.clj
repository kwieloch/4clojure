(ns four-clojure.easy.problem-40-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-40
  (testing "Interpose a Seq"
    (is (= (__ 0 [1 2 3]) [1 0 2 0 3]))
    (is (= (apply str (__ ", " ["one" "two" "three"])) "one, two, three"))
    (is (= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d]))
    ))

(def __

  #(drop 1 (interleave (repeat %1) %2))

  )