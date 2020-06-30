;; Given problem
;; *************

;;#_( Devise a data model to represent a game of tic-tac-toe.

;;For example, describe a game whose board currently looks like the below:

;;_|X|O

;;_|_|X

;;O|_|_

;;In your model, include a history of the moves played.
;;(map {2 "two" 3 "three"} [5 3 2])
;;Write a function turns-played that returns how many turns have been played.)

;;(defn turns-played
  ;;[gameArray]

  ;;(filter (fn [x] (= ( x) "x"))
    ;;      gameArray))

;;(turns-played [nil "x" "O" nil nil "x" "O" nil nil]);

;;(filter (fn [x]
 ;; (= (count x) 1))


;;(map {5 "hello" 2 "two" 3 "three"} [5 3 2])

;; very similar to filter but returns a vector
;;(filterv even? (range 10))
;;=> [0 2 4 6 8]

;;(filterv (fn [x]
 ;;         (= (count x) 1))
;;      ["a" "aa" "b" "n" "f" "lisp" "clojure" "q" ""])
;;=> ["a" "b" "n" "f" "q"]

;;(filterv #(= (count %) 1)
      ;;  ["a" "aa" "b" "n" "f" "lisp" "clojure" "q" ""])
;;=> ["a" "b" "n" "f" "q"]
;;


;; Given Solution
;; **************

(def game-state
  {:current-player "X"
   :board [nil "X" "O" nil nil "X" "O" nil nil]
   :history [{:player "X"
              :location 1}
             {:player "O"
              :location 2}
             {:player "X"
              :location 5}
             {:player "O"
              :location 6}]})

(defn moves-played [state] (count (state :history)))

(defn moves-played-alt [state] (count (remove nil? (state :board))))