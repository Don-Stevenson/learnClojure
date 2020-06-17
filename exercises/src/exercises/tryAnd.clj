;; fn to see how and works in clojure
;; returns true or false
(defn isThree?
  [x]
  (and
   (= x 3)))

(isThree? 3)