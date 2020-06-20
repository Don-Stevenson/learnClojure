;; Result of pair programming with Marco and Chris June 19 2020
;; ************************************************************

;; creates a random number between 1 and 6
(defn dice10 [x]
  (->> x
       (rand-int)
       (inc)))

(dice10 6)

;; loops through dice, prints the results and recurs until you get 6
;; *****************************************************************
(defn looped-dice
  [sides]
  (loop [results (dice10 sides)]
    (if (= results 6)
      "You got 6!"
      (do (println results) (recur (dice10 sides))))))

;; rolls the number of dice depening on how many rolls given as a parameter
;; ************************************************************************ 
(defn list-of-dice
  [number-roll]
  (repeatedly number-roll #(dice10 6)))


;; sums the dice total of the number of the dice rolled.
;;  Prints the numbers rolled, then sums them
;;  ***************************************** 
(defn sum-dice
  [number-of-dice]
  (let [dice-list (list-of-dice number-of-dice)]
    (println dice-list)
    (apply + dice-list)))

(sum-dice 10)