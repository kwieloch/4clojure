(ns four-clojure.easy.problem-122-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-122
  (testing "Read a binary number"
    (is (= 0     (__ "0")))
    (is (= 7     (__ "111")))
    (is (= 8     (__ "1000")))
    (is (= 9     (__ "1001")))
    (is (= 255   (__ "11111111")))
    (is (= 1365  (__ "10101010101")))
    (is (= 65535 (__ "1111111111111111")))
    ))

(def __

  #(. Integer parseInt % 2)

  )