(ns four-clojure.easy.problem-118-test
       (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-118
 (testing "Re-implement Map"
   (is (= [3 4 5 6 7]
          (__ inc [2 3 4 5 6])))
   (is (= (repeat 10 nil)
          (__ (fn [_] nil) (range 10))))
   (is (= [1000000 1000001]
          (->> (__ inc (range))
               (drop (dec 1000000))
               (take 2))))
   ))

(def __

 (fn [f s] (rest (reductions #(f %2) 0 s)))

 )
