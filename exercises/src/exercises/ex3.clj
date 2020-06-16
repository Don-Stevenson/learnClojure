(defn triangle?
  [a b c]
  (and
   (< a (+ b c)) (< b (+ a c)) (< c (+ a b))))
;; returning if the triangle is not valid, equilateral, isosceles, right Triangle or scalene
(defn classifyTriangle
  [a b c]
  (cond (not (triangle? a b c)) :invalid
        (= a b c) :equilateral
        (or (= a b) (= b c) (= c a)) :isosceles
        (or (= (* c c) (+ (* a a) (* b b)))) :right-Triangle
        :else
        :scalene))

(classifyTriangle  4 3 5)
