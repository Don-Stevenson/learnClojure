;;Write a function that takes a map with this structure:
;;
;;{:people {1 {:name "james"
;;             :points 1}
;;          2 {:name "rafd"
;;             :points 5}}}
;;as well as an id and a number.
;;
;;
;;Return the same map but with the person with the given id having their name
;; converted to upper-case and the given number added to their points.

(defn update-info
  [info id points]
  ;; arrow at the beginning returns each step, otherwise only the last step is returned
  (-> (update-in info [:people id :name] clojure.string/upper-case)
      (update-in [:people id :points] + points)))


(def data {:people {1 {:name "jamesC"
                       :points 1}
                    2 {:name "rafd"
                       :points 5}}})

(update-info data 2 45)





;; Evaluating file: deepUpdate.clj
;; CompilerException clojure.lang.ArityException: Wrong number of args (0) passed to:
;; PersistentArrayMap, compiling:(/home/don/lighthouse/learnClojure/exercises/src/exercises/deepUpdate.clj:22:1) 

;; Evaluation of file deepUpdate.clj failed: class clojure.lang.Compiler$CompilerException
;;
;;related functions
;; update-in clojure.string/upper-case -> +
;; sample tests
;; (is (= {:people {1 {:name "james"
;;                     :points 1}
;;                  2 {:name "RAFD"
;;                     :points 8}}}
    ;;    (update-info {:people {1 {:name "james"
    ;;                              :points 1}
    ;;                           2 {:name "rafd"
    ;;                              :points 5}}}
;;                     2
;;                     3)))