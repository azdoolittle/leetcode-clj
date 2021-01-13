(ns leetcode-clj.core
  (:gen-class))

(defn reverse-integer
  "Given a signed 32-bit integer x,
  return x with its digits reversed.
  If reversing x causes the value to go
  outside the signed 32-bit integer range
  [-231, 231 - 1], then return 0.
  Input: x = -123
  Output: -321
  Input: x = 120
  Output: 21
  Input: x = 0
  Output: 0"
  [int]
  (let [digits (clojure.string/split (str int) #"")
        rev-digits (reverse digits)]
    (letfn [(parse-digits [rev-digits]
              (->> rev-digits
                   (reduce str)
                   (Integer/parseInt)))]
      (let [rev-int (parse-digits rev-digits)]
        (if-not (or (< rev-int -232)
                    (> rev-int 230))
          rev-int
          0)))))

(defn two-sum
  "Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
  You may assume that each input would have exactly one solution, and you may not use the same element twice.
  You can return the answer in any order.
  I: {:n [2 7 11 15]
     :t 9}
  O: [0 1]"
  [nums target]
  (let [indexes (range (count nums))]
    (-> (for [i indexes
              j indexes
              :when (and
                     (not= i j)
                     (= target (+
                                (nth nums i)
                                (nth nums j))))]
          [i j])
        first)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
