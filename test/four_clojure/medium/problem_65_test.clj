(ns four-clojure.medium.problem-65-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-65
  (testing "Black Box Testing"
    (is (= :map (__ {:a 1, :b 2})))
    (is (= :list (__ (range (rand-int 20)))))
    (is (= :vector (__ [1 2 3 4 5 6])))
    (is (= :set (__ #{10 (rand-int 5)})))
    (is (= [:map :set :vector :list] (map __ [{} #{} [] ()])))
    ))

(def __

  #(let [x [1 1]
         y [1 2]
         a (reduce conj % [x x y])]
               (case (- (count a) (count %))
                  1 :map
                  2 :set
                  3 (if (= (first a) y) :list :vector)))

  )