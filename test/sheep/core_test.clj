(ns sheep.core-test
  (:require [clojure.test :refer :all]
            [sheep.core :refer :all]))

(deftest sleep-test
  (testing "Simple inputs"
    (is (= "INSOMNIA" (sleep 0)))
    (is (= 10 (sleep 1)))
    (is (= 90 (sleep 2)))
    (is (= 110 (sleep 11)))
    (is (= 5076 (sleep 1692)))))
