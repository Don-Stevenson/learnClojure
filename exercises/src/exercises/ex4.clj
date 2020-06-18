(defn clamp
  [x min max]
  (cond
    (< x min) min
    (> x max) max
    :else x))

(clamp 5 1 4)


;;(is (= 2 (clamp 2 1 4)))

;;(is (= 1 (clamp 0 1 4)))

;;(is (= 4 (clamp 5 1 4)))