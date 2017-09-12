(ns sheep.core-test
  (:require [clojure.test :refer :all]
            [sheep.core :refer :all]))

(deftest sleep-test
  (testing "Simple inputs"
    (is (= 5076 (sleep 1692)))))
