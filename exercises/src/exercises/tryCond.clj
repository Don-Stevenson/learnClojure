;; simple function that takes in x to see if it greater than two
;; uses cond to see if the conditions are met
(defn isGreaterThanTwo
  [x]
  (cond
    (> x 2) :x-is-greater-than-two
    (= x 2) :x-is-equal-two-two
    (< x 2) :x-is-less-than-two))
(isGreaterThanTwo 4)