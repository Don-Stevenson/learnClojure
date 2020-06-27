;takes a key a value and data
;uses assoc to change a key value 
;to a new value and return a modified array
;;*****************************************

   ;(defn get-and-set
   ;  [key value data]
  ;   [(data key)
 ;     (assoc data key value)])

;(get-and-set 0 10 [1 2 3])     ;;=> [1 [10 2 3]]
;
;
(defn get-and-set
  [key, value, coll]
  [;; gets the value that will be replaced
   ;; 
   (get coll key)
   ;; replaces the original value at the key with a new value
   (assoc coll key value)])

;(get-and-set 0 2 [1 3 4])

(get-and-set :a
              "baz"
              {:a "foo"
               :b "quux"})