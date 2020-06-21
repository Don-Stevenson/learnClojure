;;Write a function clamp to restrict a value to a given range:

;;(defn clamp [x min max])
;;***********************************************************

(defn clamp
  [x min max]
  (cond
    (< x min) min
    (> x max) max
    :else x))

;;(clamp 5 1 4)

;; Given solution
;; ***************
; (defn clamp
  ;[x min max]
  ;(cond (<= min x max) x
 ;       (< x min) min
;        :else max))

;; Test Cases
;; *********** 

(= 2 (clamp 2 1 4)) 

(= 1 (clamp 0 1 4))

(= 4 (clamp 5 1 4))