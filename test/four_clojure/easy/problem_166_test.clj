(ns four-clojure.easy.problem-166-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-166
  (testing "Comparisons"
    (is (= :gt (__ < 5 1)))
    (is (= :eq (__ (fn [x y] (< (count x) (count y))) "pear" "plum")))
    (is (= :lt (__ (fn [x y] (< (mod x 5) (mod y 5))) 21 3)))
    (is (= :gt (__ > 0 2)))
    ))

(def __

  #(if (% %2 %3) :lt (if (% %3 %2) :gt :eq) )

  )