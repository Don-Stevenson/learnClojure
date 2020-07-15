;; Write a function that takes a map with this structure:
;;******************************************************
;;
;;{:people {1 {:name "james"
;;             :points 1}
;;          2 {:name "rafd"
;;             :points 5}}}
;;as well as an id, a keyword, and some value.

;; Return the same map but with the person with the given id n
;; having the given keyword & value added to their data (see tests for an example).

(defn add-info
  [obj-info id keyword val]
  (assoc-in obj-info [:people id keyword] val))


;; Given solution
;; **************
;;(defn add-info 
;;  [info id key value] 
;;  (assoc-in info [:people id key] value))


;;related functions
;;assoc-in
;;
;;
;;sample tests
;;************
(= {:people {1 {:name "james"
                   :points 1
                   :stuff "beep boop"}
                2 {:name "rafd"
                   :points 5}}}
      (add-info {:people {1 {:name "james"
                              :points 1}
                          2 {:name "rafd"
                              :points 5}}}
                 1
                :stuff
                 "beep boop"))

