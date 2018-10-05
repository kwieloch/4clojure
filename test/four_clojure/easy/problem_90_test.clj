(ns four-clojure.easy.problem-90-test
       (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-90
 (testing "Cartesian Product"
   (is (= (__ #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
          #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
            ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
            ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]}))
   (is (= (__ #{1 2 3} #{4 5})
          #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]}))
   (is (= 300 (count (__ (into #{} (range 10))
         (into #{} (range 30))))))
   ))

(def __

 (fn [a b] (into #{} (for [x a y b] [x y])))

 )
