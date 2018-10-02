(ns four-clojure.problem106)

(def __
  (fn [b e]
    (loop [i 1 s #{b}]
      (if (s e)
        i
        (recur (+ 1 i) (reduce #(conj % (* 2 %2) (+ 2 %2) (/ %2 2)) s s)))))
  )
