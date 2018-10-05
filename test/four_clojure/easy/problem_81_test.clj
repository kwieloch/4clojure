(ns four-clojure.easy.problem-81-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-81
  (testing "Set Intersection"
    (is (= (__ #{0 1 2 3} #{2 3 4 5}) #{2 3}))
    (is (= (__ #{0 1 2} #{3 4 5}) #{}))
    (is (= (__ #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d}))
    ))

(def __

  #(set (filter % %2))

  )