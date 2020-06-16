(defn triangle?
  [a b c]
  (and
   (< a (+ b c)) (< b (+ a c)) (< c (+ a b)))
  : "not a triangle")


(triangle? 1 1 1)