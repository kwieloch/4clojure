(ns four-clojure.medium.problem-108-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-108
  (testing "Lazy Searching"
    (is (= 3 (__ [3 4 5])))
    (is (= 4 (__ [1 2 3 4 5 6 7] [0.5 3/2 4 19])))
    (is (= 7 (__ (range) (range 0 100 7/6) [2 3 5 7 11 13])))
    (is (= 64 (__ (map #(* % % %) (range))
                  (filter #(zero? (bit-and % (dec %))) (range))
                  (iterate inc 20))))
    ))

(def __

  (fn [& c]
            (let [r (map first c)
                  m (apply max r)]
                (if (apply = r)
                  m
                  (recur (map (fn [s] (drop-while #(< % m) s)) c)))))

  )
