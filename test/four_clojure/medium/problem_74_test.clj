(ns four-clojure.medium.problem-74-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-74
  (testing "Filter Perfect Squares"
    (is (= (__ "4,5,6,7,8,9") "4,9"))
    (is (= (__ "15,16,25,36,37") "16,25,36"))
    ))

(def __

  (fn [s] 
    (clojure.string/join "," 
                         (filter (fn [n] 
                                   (let [sqrt (long (+ 0.5 (Math/sqrt n)))] 
                                     (if (= n (* sqrt sqrt)) 
                                       true 
                                       false)))
                                 (map read-string (clojure.string/split s #",")))))

  )