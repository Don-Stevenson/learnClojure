;;Refactor the below code to use a single cond instead of multiple ifs.

;;Also, consider re-ordering the conditionals to simplify the logic.
;;******************************************************************

;(defn process-value
 ; [value]
  ;(if (and (number? value) (> value 10))
   ; :pretty-big
    ;;(if (and (number? value) (< value 0))
      ;;:negative
      ;;(if (and (number? value) (zero? value))
        ;;:zero
        ;;(if (number? value)
          ;;:small-number
          ;;(if (string? value)
            ;;:a-string
            ;;:something-else))))))
 
(defn process-value 
  [value]
(cond (string? value) :a-string
 (not (number? value))
 :something-else
 (> value 10)
 :pretty-big
 (< value 0)
 :negative
 (zero? value)
 :zero
 :else :small-number))   

 (process-value 5)