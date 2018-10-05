(ns four-clojure.medium.problem-93-test
       (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-93
 (testing "Partially Flatten a Sequence"
   (is (= (__ [["Do"] ["Nothing"]])
          [["Do"] ["Nothing"]]))
   (is (= (__ [[[[:a :b]]] [[:c :d]] [:e :f]])
          [[:a :b] [:c :d] [:e :f]]))
   (is (= (__ '((1 2)((3 4)((((5 6)))))))
          '((1 2)(3 4)(5 6))))
   ))

(def __

 (fn [x]
   (let [s sequential?]
    (filter #(not-any? s %) 
             (tree-seq s #(filter s %) x))))

 )
