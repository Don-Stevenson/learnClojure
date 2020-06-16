;(defn triangle?
  ;[a,b,c]
 ; (and ((< a (+ b c)) (< b (+ a c)) (< c (+ a b)))))
;(triangle 3 4 5)

(defn triangle?
  [a b c]
  (and
   (< a (+ b c)) (< b (+ a c)) (< c (+ a b))))


(triangle? 1 1 1)