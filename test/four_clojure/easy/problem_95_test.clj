(ns four-clojure.easy.problem-95-test
       (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-95
 (testing "To Tree, or not to Tree"
   (is (= (__ '(:a (:b nil nil) nil))
          true))
   (is (= (__ '(:a (:b nil nil)))
          false))
   (is (= (__ [1 nil [2 [3 nil nil] [4 nil nil]]])
          true))
   (is (= (__ [1 [2 nil nil] [3 nil nil] [4 nil nil]])
          false))
   (is (= (__ [1 [2 [3 [4 nil nil] nil] nil] nil])
          true))
   (is (= (__ [1 [2 [3 [4 false nil] nil] nil] nil])
          false))
   (is (= (__ '(:a nil ()))
          false))
   ))

(def __

  (fn ch
    [all]
     (cond 
          (or (keyword? all) (number? all) (nil? all))
          true
          (and (coll? all) (= 3 (count all))) 
          (and (ch (nth all 1)) (ch (nth all 2)))
        :else
          false
      ))

 )
