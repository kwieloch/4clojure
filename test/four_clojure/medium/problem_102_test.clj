(ns four-clojure.medium.problem-102-test
  (:require [clojure.test :refer :all]))

(declare __)

(deftest problem-102
  (testing "intoCamelCase"
    (is (= (__ "something") "something"))
    (is (= (__ "multi-word-key") "multiWordKey"))
    (is (= (__ "leaveMeAlone") "leaveMeAlone"))
    ))

(def __

  (fn [s] (clojure.string/replace s #"-(\w)" #(.toUpperCase (% 1))))

  )