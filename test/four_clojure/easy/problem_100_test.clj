(ns four-clojure.easy.problem-100-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-100
  (testing "Least Common Multiple"
    (is (== (__ 2 3) 6))
    (is (== (__ 5 3 7) 105))
    (is (== (__ 1/3 2/5) 2))
    (is (== (__ 3/4 1/6) 3/2))
    (is (== (__ 7 5/7 2 3/5) 210))
    ))

(def __

  (fn [& args]
    (let [gcd (fn gcd [a b] (cond (= a b) a
                                  (> a b) (recur (- a b) b) 
                                  (< a b) (recur a (- b a))))
          lcm (fn lcm [a b] (* (/ a (gcd a b)) b))
          ] (reduce lcm args)))

  )