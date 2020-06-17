;; simple function that takes in x to see if it greater than two
;; uses cond to see if the conditions are met
(defn isGreaterThanTwo
  [x]
  (cond
    ;(not a number x)) :not-a-number
    (> x 2) :x-is-greater-than-two
    (= x 2) :x-is-equal-two-two
    (< x 2) :x-is-less-than-two
    :else  :x-is-not-a-number))
(isGreaterThanTwo "a")