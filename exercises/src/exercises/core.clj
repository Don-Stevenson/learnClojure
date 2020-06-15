;; use defn instead of let or const, then give it a name.
;; the arguments you're passing in goes inside square brackets
;; then put the function with in ()
;; no need to return anything, last line is implicited returned
(defn cube [x, y]
  (+ x y)
  (* x x y))

(cube 1, 2)

;; ctrl alt c  then space      evaluate the highlighted form () * most useful
;; 
;; ctrl alt c  then e        evaluate a snippet of the form ()
;; 
;; ctr alt c then enter      evaluate the whole file * most useful