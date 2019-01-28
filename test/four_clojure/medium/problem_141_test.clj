(ns four-clojure.medium.problem-141-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-141
  (testing "trickTakingCardGame"
    (let [notrump (__ nil)]
      (and (= {:suit :club :rank 9}  (notrump [{:suit :club :rank 4}
                                               {:suit :club :rank 9}]))
           (= {:suit :spade :rank 2} (notrump [{:suit :spade :rank 2}
                                               {:suit :club :rank 10}]))))
    (= {:suit :club :rank 10} ((__ :club) [{:suit :spade :rank 2}
                                           {:suit :club :rank 10}]))
    (= {:suit :heart :rank 8}
       ((__ :heart) [{:suit :heart :rank 6} {:suit :heart :rank 8}
                     {:suit :diamond :rank 10} {:suit :heart :rank 4}]))
    ))

(def __

  (fn [trump]
    (fn [t]
      (reduce (fn [a b] 
                (if (= (:suit a) (:suit b))
                  (max-key :rank a b) 
                  (condp = trump (:suit b) b (:suit a) a a) )) (first t) (rest t))))

  )
