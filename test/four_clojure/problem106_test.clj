(ns four-clojure.problem106-test
  (:require [clojure.test :refer :all]
            [four-clojure.problem106 :refer [__]]))

(deftest four-clojure-test
  (testing "test sets"
    (is (= 1 (__ 1 1)))
    (is (= 3 (__ 3 12)))
    (is (= 3 (__ 12 3)))
    (is (= 3 (__ 5 9)))
    (is (= 9 (__ 9 2)))
    (is (= 5 (__ 9 12)))    
    ))
