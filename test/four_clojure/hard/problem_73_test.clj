(ns four-clojure.hard.problem-73-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-73
  (testing "Analyze a Tic-Tac-Toe Board"
    (is (= nil (__ [[:e :e :e]
                    [:e :e :e]
                    [:e :e :e]])))
    (is (= :x (__ [[:x :e :o]
                   [:x :e :e]
                   [:x :e :o]])))
    (is (= :o (__ [[:e :x :e]
                   [:o :o :o]
                   [:x :e :x]])))
    (is (= nil (__ [[:x :e :o]
                    [:x :x :e]
                    [:o :x :o]])))
    (is (= :x (__ [[:x :e :e]
                   [:o :x :e]
                   [:o :e :x]])))
    (is (= :o (__ [[:x :e :o]
                   [:x :o :e]
                   [:o :e :x]])))
    (is (= nil (__ [[:x :o :x]
                    [:x :o :x]
                    [:o :x :o]])))
    ))

(def __

  (fn [b] 
    (let [c #(if (and (apply = %) (not= (first %) :e)) (first %) nil)
          e #(get-in b [%1 %2])]
    (first (remove nil? (map c (concat b 
                                       (apply mapv vector b) 
                                       [[(e 0 0) (e 1 1) (e 2 2)] [(e 0 2) (e 1 1) (e 2 0)]]))))))

  )
