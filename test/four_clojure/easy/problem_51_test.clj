(ns four-clojure.easy.problem-51-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-51
  (testing "Advanced Destructuring"
    (is (= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d])))
    ))

(def __

  [1 2 3 4 5]

  )