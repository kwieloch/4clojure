(ns four-clojure.medium.problem-104-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-104
  (testing "Write Roman Numerals"
    (is (= "I" (__ 1)))
    (is (= "XXX" (__ 30)))
    (is (= "IV" (__ 4)))
    (is (= "CXL" (__ 140)))
    (is (= "DCCCXXVII" (__ 827)))
    (is (= "MMMCMXCIX" (__ 3999)))
    (is (= "XLVIII" (__ 48)))
    ))

(def __

  (fn [a] 
    (let [d->r {0 "" 1 "I" 4 "IV" 5 "V" 9 "IX" 10 "X" 40 "XL" 50 "L" 90 "XC" 100 "C" 400 "CD" 500 "D" 900 "CM" 1000 "M"}
          nums (reverse (sort (keys d->r)))
          fnum (fn [n] (first (filter #(<= % n) nums)))]
      (->>
        a
        (iterate #(- % (fnum %)))
        (partition 2 1)
        (map (partial apply -))
        (take-while (partial < 0))
        (map d->r)
        (apply str))))

  )