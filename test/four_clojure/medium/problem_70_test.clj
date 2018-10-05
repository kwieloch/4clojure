(ns four-clojure.medium.problem-70-test
       (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-70
 (testing "Word Sorting"
   (is (= (__  "Have a nice day.")
          ["a" "day" "Have" "nice"]))
   (is (= (__  "Clojure is a fun language!")
          ["a" "Clojure" "fun" "is" "language"]))
   (is (= (__  "Fools fall for foolish follies.")
          ["fall" "follies" "foolish" "Fools" "for"]))
   ))

(def __

 #(sort-by clojure.string/lower-case (clojure.string/split % #"\W+"))

 )
