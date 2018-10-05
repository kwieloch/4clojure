(ns four-clojure.easy.problem-27-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-27
  (testing "Palindrome Detector"
    (is (false? (__ '(1 2 3 4 5))))
    (is (true? (__ "racecar")))
    (is (true? (__ [:foo :bar :foo])))
    (is (true? (__ '(1 1 3 3 1 1))))
    (is (false? (__ '(:a :b :c))))
    ))

(def __

  #(= (seq %) (reverse (seq %)))

  )