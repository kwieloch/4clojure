(ns four-clojure.easy.problem-28-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-28
  (testing "Flatten a Sequence"
    (is (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6)))
    (is (= (__ ["a" ["b"] "c"]) '("a" "b" "c")))
    (is (= (__ '((((:a))))) '(:a)))
    ))

(def __

  (fn fl [s] 
    (if (sequential? s)
        (mapcat fl s)
        (list s)))

  )
