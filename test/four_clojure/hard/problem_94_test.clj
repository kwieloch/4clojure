(ns four-clojure.hard.problem-94-test
       (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-94
 (testing "Game of Life"
   (is (= (__ ["      "  
               " ##   "
               " ##   "
               "   ## "
               "   ## "
               "      "])
          ["      "  
           " ##   "
           " #    "
           "    # "
           "   ## "
           "      "]))
   (is (= (__ ["     "
               "     "
               " ### "
               "     "
               "     "])
          ["     "
           "  #  "
           "  #  "
           "  #  "
           "     "]))
   (is (= (__ ["      "
               "      "
               "  ### "
               " ###  "
               "      "
               "      "])
          ["      "
           "   #  "
           " #  # "
           " #  # "
           "  #   "
           "      "]))
   ))

(def __

 (fn [m] 
   (let [s (count m)
         board (into [] (map vec m))
         of [[-1 -1] [-1 0] [-1 1] [0 -1] [0 1] [1 -1] [1 0] [1 1]]
         in? (fn [[x y]] (and (< -1 x s) (< -1 y s)))
         state #(get-in board %)
         a \#
         d \space
         a? #{a}
         an (fn [x y] (count (filter a? (map state (filter in? (map #(map + % [x y]) of)))) )) 
         destiny (fn [c an]
                   (cond 
                     (and (#{a} c) (< an 2)) d
                     (and (#{a} c) (<= 2 an 3)) a
                     (and (#{a} c) (> an 3)) d
                     (and (not (#{a} c)) (= an  3)) a
                     :else d))]

     (->> (for [x (range s) y (range s)] (destiny (state [x y]) (an x y)))
          (partition s)
          (map #(apply str %)))))

 )
