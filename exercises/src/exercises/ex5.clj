;;Write a function largest to find the largest number in a list,
;; making use of max and either apply or reduce.

;;(defn largest [nums])
;;Note that max takes a variable number of arguments, 
;;but does not work with arrays, ie. (max 1 2 3) works as expected, 
;;but (max [1 2 3]) does not.
;;*****************************************************************

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
