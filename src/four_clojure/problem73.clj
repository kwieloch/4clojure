(ns four-clojure.problem73)

(def __
  (fn [b] 
    (let [c #(if (and (apply = %) (not= (first %) :e)) (first %) nil)
          e #(get-in b [%1 %2])]
      (first (remove nil? (map c (concat b 
                                         (apply mapv vector b) 
                                         [[(e 0 0) (e 1 1) (e 2 2)] [(e 0 2) (e 1 1) (e 2 0)]])))))))
