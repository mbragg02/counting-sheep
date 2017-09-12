(ns sheep.core
 (:require [clojure.set :refer [union]]))

(defn explode-to-digits
 [number]
 (set (str number)))

(defn sleep
 "Counting sheep: For a supplied number N, start by naming N, 2 × N, 3 × N, and so on.
 Keep track of which digits (0, 1, 2, 3, 4, 5, 6, 7, 8, and 9) has been seen at least once so far as part of any number.
 Once each of the ten digits has been seen at least once, sleep."
 [n]
 (if (zero? n)
  (println "INSOMNIA")
  (loop [results #{}
         itr 1]
   (if (= 10 (count results))
    (* n (- itr 1))
    (do
     (let [combined-results (union results (set (str (* itr n))))]
       (println (str itr "#") (* itr n) combined-results)
       (recur combined-results (+ 1 itr))))))))

(sleep 1692) ;;5076
