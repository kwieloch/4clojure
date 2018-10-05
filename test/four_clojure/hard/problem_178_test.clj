(ns four-clojure.hard.problem-178-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-178
  (testing "Best Hand"
    (is (= :high-card (__ ["HA" "D2" "H3" "C9" "DJ"])))
    (is (= :pair (__ ["HA" "HQ" "SJ" "DA" "HT"])))
    (is (= :two-pair (__ ["HA" "DA" "HQ" "SQ" "HT"])))
    (is (= :three-of-a-kind (__ ["HA" "DA" "CA" "HJ" "HT"])))
    (is (= :straight (__ ["HA" "DK" "HQ" "HJ" "HT"])))
    (is (= :straight (__ ["HA" "H2" "S3" "D4" "C5"])))
    (is (= :flush (__ ["HA" "HK" "H2" "H4" "HT"])))
    (is (= :full-house (__ ["HA" "DA" "CA" "HJ" "DJ"])))
    (is (= :four-of-a-kind (__ ["HA" "DA" "CA" "SA" "DJ"])))
    (is (= :straight-flush (__ ["HA" "HK" "HQ" "HJ" "HT"])))
    ))

(def __

  (fn [h]
    (let [[s r] (apply mapv vector h)
          S (apply = s)
          f frequencies
          N (vals (f r))
          M (apply max N)
          R (some #(= (set r) %) (map set (partition 5 1 "A23456789TJQKA")))]
      (cond
       (and R S) :straight-flush
       (= 4 M) :four-of-a-kind
       (= {3 1 2 1} (f N)) :full-house
       S :flush
       R :straight
       (= 3 M) :three-of-a-kind
       (= {2 2 1 1} (f N)) :two-pair
       (= 2 M) :pair
       :else :high-card)))

  )