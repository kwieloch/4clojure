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
            "      "]))))

(def __

  (fn [m]
    (let [size (count m)
          board (into [] (map vec m))
          within-board? (fn [[x y]] (and (< -1 x size) (< -1 y size)))
          neighbours (fn [x y] (filter within-board? (map
                                                      #(map + % [x y])
                                                      [[-1 -1] [-1 0] [-1 1] [0 -1] [0 1] [1 -1] [1 0] [1 1]])))
          state #(get-in board %)
          alive \#
          dead \space
          alive? #{alive}
          num-of-alive-neighbours (fn [x y] (count (filter alive? (map state (neighbours x y)))))
          fate (fn [cell alive-n]
                 (cond
                   (and (alive? cell) (< alive-n 2)) dead
                   (and (alive? cell) (<= 2 alive-n 3)) alive
                   (and (alive? cell) (> alive-n 3)) dead
                   (and (not (alive? cell)) (= alive-n  3)) alive
                   :else dead))]

      (->> (for [x (range size)
                 y (range size)]
             (fate (state [x y]) (num-of-alive-neighbours x y)))
           (partition size)
           (map #(apply str %))))))
