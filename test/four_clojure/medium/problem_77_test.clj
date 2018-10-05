(ns four-clojure.medium.problem-77-test
       (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-77
 (testing "Anagram Finder"
   (is (= (__ ["meat" "mat" "team" "mate" "eat"])
          #{#{"meat" "team" "mate"}}))
   (is (= (__ ["veer" "lake" "item" "kale" "mite" "ever"])
          #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}}))
   ))

(def __

 (fn [s] (set (filter #(> (count %) 1) (map set (vals (group-by sort s))))))

 )
