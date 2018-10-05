(ns four-clojure.medium.problem-69-test
       (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-69
 (testing "Merge with a Function"
   (is (= (__ * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
          {:a 4, :b 6, :c 20}))
   (is (= (__ - {1 10, 2 20} {1 3, 2 10, 3 15})
          {1 7, 2 10, 3 15}))
   (is (= (__ concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})
          {:a [3 4 5], :b [6 7], :c [8 9]}))
   ))

(def __

 (fn [f b & r] (reduce (fn [a [k v]] (assoc a k (if (a k) (f (a k) v) v))) b (apply concat r)))

 )
