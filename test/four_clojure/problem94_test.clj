(ns four-clojure.problem94-test
  (:require [clojure.test :refer :all]
            [four-clojure.problem94 :refer [__]]))

(deftest four-clojure-test
  (testing "test sets"
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
    (is  (= (__ ["      "
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
