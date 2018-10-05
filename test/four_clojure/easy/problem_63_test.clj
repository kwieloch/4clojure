(ns four-clojure.easy.problem-63-test
       (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-63
  (testing "Group a Sequence"
         (is (= (__ #(> % 5) [1 3 6 8])
                {false [1 3], true [6 8]}))
         (is (= (__ #(apply / %) [[1 2] [2 4] [4 6] [3 6]]) 
                {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]}))
         (is (= (__ count [[1] [1 2] [3] [1 2 3] [2 3]]) 
                {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})) ))

(def __

   #(reduce (fn [a e] (assoc a (% e) (conj (get a (% e) []) e))) {} %2)

  )
