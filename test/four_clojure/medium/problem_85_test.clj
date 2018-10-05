(ns four-clojure.medium.problem-85-test
       (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-85
 (testing "Power Set"
   (is (= (__ #{1 :a}) #{#{1 :a} #{:a} #{} #{1}}))
   (is (= (__ #{}) #{#{}}))
   (is (= (__ #{1 2 3}) #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}}))
   (is (= (count (__ (into #{} (range 10)))) 1024))
   ))

(def __

 (fn [s] (reduce (fn [a e] (->> a (map #(set (concat #{e} %))) (concat a) set )) #{#{}} s))

 )
