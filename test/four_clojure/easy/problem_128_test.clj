(ns four-clojure.easy.problem-128-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-128
  (testing "Recognize Playing Cards"
    (is (= {:suit :diamond :rank 10} (__ "DQ")))
    (is (= {:suit :heart :rank 3} (__ "H5")))
    (is (= {:suit :club :rank 12} (__ "CA")))
    (is (= (range 13) (map (comp :rank __ str)
           '[S2 S3 S4 S5 S6 S7
             S8 S9 ST SJ SQ SK SA])))
    ))

(def __

  (fn [[s r]] 
    {:suit ({\D :diamond \H :heart \C :club \S :spade} s) 
     :rank ((zipmap "23456789TJQKA" (range 13)) r)})

  )