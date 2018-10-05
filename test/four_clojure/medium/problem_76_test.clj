(ns four-clojure.medium.problem-76-test
       (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-76
 (testing "Intro to Trampoline"
   (is (= __
          (letfn
              [(foo [x y] #(bar (conj x y) y))
               (bar [x y] (if (> (last x) 10)
                            x
                            #(foo x (+ 2 y))))]
            (trampoline foo [] 1))))
   ))

(def __

 [1 3 5 7 9 11]

 )
