(ns four-clojure.problem92-test
  (:require [clojure.test :refer :all]
            [four-clojure.problem92 :refer [__]]))

(deftest four-clojure-test
  (testing "test sets"
    (is (= 14 (__ "XIV")))
    (is (= 827 (__ "DCCCXXVII")))
    (is (= 3999 (__ "MMMCMXCIX")))
    (is (= 48 (__ "XLVIII")))))
