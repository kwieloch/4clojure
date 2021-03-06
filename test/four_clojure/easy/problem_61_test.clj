(ns four-clojure.easy.problem-61-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-61
  (testing "Map Construction"
    (is (= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3}))
    (is (= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"}))
    (is (= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"}))
    ))

(def __

  #(into {} (map vector % %2))

  )