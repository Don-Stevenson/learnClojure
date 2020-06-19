(defn dice10 [x]
  (->> x
       (rand-int)
       (inc)))

(defn looped-dice
  [sides]
  (loop [results (dice10 sides)]
    (if (= results 6)
      "You got 6!"
      (do (println results) (recur (dice10 sides))))))

(defn list-of-dice
  [number-roll]
  (repeatedly number-roll #(dice10 6)))

(defn sum-dice
  [number-of-dice]
  (let [l (list-of-dice number-of-dice)]
    (println l)
    (apply + l)))

(sum-dice 10)