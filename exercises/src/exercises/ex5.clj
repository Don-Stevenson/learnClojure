(defn largest [nums]
  (apply max nums))

;(apply max [1 2 3 4])

;; tests
;; *****
(= 3 (largest [1 2 -1 3 3 2 1 0]))
