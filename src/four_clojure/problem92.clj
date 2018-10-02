(ns four-clojure.problem92)

(def __
  #(second (reduce (fn [[p a] e] (let [c ({\I 1 \V 5 \X 10 \L 50 \C 100 \D 500 \M 1000} e)
                             v (if (< p c) (- c (* 2 p)) c)]
                         [c (+ a v)])) [0 0] %))
)
