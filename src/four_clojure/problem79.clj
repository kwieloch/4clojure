(ns four-clojure.problem79)

(def __
  #(first 
  (reduce 
   (fn [a e]
     (map + 
          (map (partial apply min) (partition 2 1 a)) 
          e)) 
   (first (reverse %)) 
   (rest  (reverse %))))
)
