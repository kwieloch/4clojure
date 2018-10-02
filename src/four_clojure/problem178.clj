(ns four-clojure.problem178)

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
