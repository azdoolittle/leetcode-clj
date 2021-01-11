(ns leetcode-clj.core
  (:gen-class))

(defn two-sum
  "Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
  You may assume that each input would have exactly one solution, and you may not use the same element twice.
  You can return the answer in any order.
  I: {:n [2 7 11 15]
     :t 9}
  O: [0 1]"
  [nums target]
  (let [indexes (range (count nums))]
    (first
     (for [i indexes
           j indexes
           :when (and (not= i j)
                      (= target (+
                                 (nth nums i)
                                 (nth nums j))))]
       [i j]))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
