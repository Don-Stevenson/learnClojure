   
   (defn get-and-set
     [key value data]
     [(data key)
      (assoc data key value)] 
     )
   
   (get-and-set 0 10 [1 2 3])     ;;=> [10 2 3]