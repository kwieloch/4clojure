(ns four-clojure.easy.problem-97-test
       (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-97
 (testing "Pascal's Triangle"
   (is (= (__ 1) [1]))
   (is (= (map __ (range 1 6))
        [     [1]
             [1 1]
            [1 2 1]
           [1 3 3 1]
          [1 4 6 4 1]]))
   (is (= (__ 11)
        [1 10 45 120 210 252 210 120 45 10 1]))
   ))

(def __

 (fn pt 
   [n] 
   (let [
         sn (fn 
              [n k] 
              (int (reduce (fn [a e] (* a (/ (+ (- n e) 1) e))) 1 (range 1 (inc k)))))] 
     (vec (map #(sn (dec n) %) (range 0 n)))))

 )