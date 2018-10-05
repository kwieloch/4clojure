(ns four-clojure.easy.problem-96-test
       (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-96
 (testing "Beauty is Symmetry"
   (is (= (__ '(:a (:b nil nil) (:b nil nil))) true))
   (is (= (__ '(:a (:b nil nil) nil)) false))
   (is (= (__ '(:a (:b nil nil) (:c nil nil))) false))
   (is (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
               [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]])
          true))
   (is (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
               [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]])
          false))
   (is (= (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
               [2 [3 nil [4 [6 nil nil] nil]] nil]])
          false))
   ))

(def __

 (fn start [[v l r]] (let [mi (fn mi 
                                [l r] 
                                (let [e? (complement sequential?)]
                                  (if (or (e? l) (e? r)) 
                                      (and (e? l) (e? r))
                                      (let [[lv ll lr] l 
                                            [rv rl rr] r]
                                        (every? true? [(= lv rv) (mi ll rr) (mi lr rl)])))))]
                       (mi l r)))

 )
