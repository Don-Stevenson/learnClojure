;takes a key a value and data
;uses assoc to change a key value 
;to a new value and return a modified array
;;*****************************************

   (defn get-and-set
     [key value data]
     [(data key)
      (assoc data key value)])

(get-and-set 0 10 [1 2 3])     ;;=> [1 [10 2 3]]