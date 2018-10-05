(ns four-clojure.hard.problem-79-test
   (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-79
 (testing "Triangle Minimal Path"
   (is (= 7 (__ '([1]
                 [2 4]
                [5 1 4]
               [2 3 4 5]))))
   (is (= 20 (__ '([3]
                  [2 4]
                 [1 9 3]
                [9 9 2 4]
               [4 6 6 7 8]
              [5 7 3 5 1 4]))))
   ))

(def __

 #(first 
   (reduce 
    (fn [a e]
      (map + 
           (map (partial apply min) (partition 2 1 a)) 
           e)) 
    (first (reverse %)) 
    (rest  (reverse %))))

 )