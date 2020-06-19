
;; largest is a function that returns 
;; the largest number in an array
(defn largest [nums]
  (apply max nums))

;; same as above but with reduce max
(defn largest-reduce [nums]
  (reduce max nums))

;; tests
;; *****
(= 3 (largest [1 2 -1 3 3 2 1 0]))
(largest-reduce [1 2 -1 3 3 2 1 0])
