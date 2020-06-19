(defn largest [nums]
  (apply max (nums))
  
  )

((= 3 (largest [1 2 -1 3 3 2 1 0])))
