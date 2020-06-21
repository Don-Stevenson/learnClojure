;;Write a function to determine if some 3 side lengths are sufficient to make a triangle.

;;To check if 3 sides make a triangle, you need to check that every 
;; side is less than or equal to the sum of the other two sides.
;; ******************************************************************


;; returns true or false if three lengths can be made into a triangle
;; ******************************************************************
(defn triangle?
  [a b c]
  (and
   (< a (+ b c)) (< b (+ a c)) (< c (+ a b))))
;; returning if the triangle is not valid, equilateral, isosceles, right Triangle or scalene
;;*******************************************************************************************

(defn classifyTriangle
  [a b c]
  (cond (not (triangle? a b c)) :invalid
        (= a b c) :equilateral
        (or (= a b) (= b c) (= c a)) :isosceles
        (or (= (* c c) (+ (* a a) (* b b)))) :right-Triangle
        :else
        :scalene))

(classifyTriangle  4 3 5)
