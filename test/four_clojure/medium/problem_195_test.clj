(ns four-clojure.medium.problem-195-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-195
  (testing "Parentheses... Again"
    (is (= [#{""} #{"()"} #{"()()" "(())"}] (map (fn [n] (__ n)) [0 1 2])))
    (is (= #{"((()))" "()()()" "()(())" "(())()" "(()())"} (__ 3)))
    (is (= 16796 (count (__ 10))))
    (is (= (nth (sort (filter #(.contains ^String % "(()()()())") (__ 9))) 6) "(((()()()())(())))"))
    (is (= (nth (sort (__ 12)) 5000) "(((((()()()()()))))(()))"))
    ))

(def __

  (fn p 
    ([n] (p "" #{} n n))
    ([s a b e]
     (let [o #(p (str s \() a (dec b) e)
           c #(p (str s \)) a b (dec e))] 
       (cond
         (= 0 b e) (conj a s)
         (=   b e) (o)       
         (= 0 b  ) (c) 
         :else     (into (o) (c))))))

  )