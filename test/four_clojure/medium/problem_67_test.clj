(ns four-clojure.medium.problem-67-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-67
  (testing "Prime Numbers"
    (is (= (__ 2) [2 3]))
    (is (= (__ 5) [2 3 5 7 11]))
    (is (= (last (__ 100)) 541))
    ))

(def __

  (fn [n] 
    (let [sieve (fn sieve [s]
    		 (cons (first s)
                       (lazy-seq (sieve (filter #(not= 0 (mod % (first s))) (rest s))))))]
      (take n (sieve (iterate inc 2)))))

  )
