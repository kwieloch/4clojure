(ns four-clojure.medium.problem-171-test
   (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-171
 (testing "Intervals"
   (is (= (__ [1 2 3]) [[1 3]]))
   (is (= (__ [10 9 8 1 2 3]) [[1 3] [8 10]]))
   (is (= (__ [1 1 1 1 1 1 1]) [[1 1]]))
   (is (= (__ []) []))
   (is (= (__ [19 4 17 1 3 10 2 13 13 2 16 4 2 15 13 9 6 14 2 11])
              [[1 4] [6 6] [9 11] [13 17] [19 19]]))
   ))

(def __

 (fn [s] 
   (drop 1 (reduce 
      (fn [a e] 
        (let [lie (last (last a))
              lib (first (last a))
              update (fn update [a] 
                       (let [b lib
                             e (inc lie)] 
                         (conj (apply vector (drop-last a)) [b e])))
              insert (fn insert [a e] 
                       (conj a [e e]))]
          (cond 
             (= e (inc lie)) (update a) 
             (> e (inc lie)) (insert a e)
             :default a))) 
       [[-1 -1]]
       (sort s))))

 )
