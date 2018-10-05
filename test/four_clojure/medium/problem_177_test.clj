(ns four-clojure.medium.problem-177-test
      (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-177
  (testing "Balancing Brackets"
    (is (__ "This string has no brackets."))
    (is (__ "class Test {
               public static void main(String[] args) {
                 System.out.println(\"Hello world.\");
               }
             }"))
    (is (not (__ "(start, end]")))
    (is (not (__ "())")))
    (is (not (__ "[ { ] } ")))
    (is (__ "([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))"))
    (is (not (__ "([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))")))
    (is (not (__ "[")))
    ))

(def __

  #(= '() (reduce (fn [a e] (let [m {\} \{ \) \( \] \[}]
                               (cond 
                                  (some #{e} (vals m)) (cons e a)
                                  (= (m e) (first a)) (rest a)
                                  (and (m e) (= 0 (count a))) (cons 0 a) 
                                  :else a))) 
                  '() 
                  %))
 )
