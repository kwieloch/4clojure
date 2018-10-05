(ns four-clojure.easy.problem-29-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-29
  (testing "Get the Caps"
    (is (= (__ "HeLlO, WoRlD!") "HLOWRD"))
    (is (empty? (__ "nothing")))
    (is (= (__ "$#A(*&987Zf") "AZ"))
    ))

(def __

  (fn [s] 
    (apply str 
           (filter 
            	(fn [e] (re-matches #"[A-Z]" (str e))) s)))

  )
