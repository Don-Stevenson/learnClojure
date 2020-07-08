;; Read in a text file (assuming it's in the current directory),
;; reverse the file's contents, and write the result to a new file (the name now prefixed by "rev-") .

;;related functions
;;slurp spit clojure.string/reverse str ->>
;;
;;
;;
;;;; ->> and -> by simple string concatenation
;; Effectively (str " jmd" "hello")
;;user=> (->> "hello" (str " jmd"))
;;" jmdhello"
;; Effectively (str "hello" " jmd")
;;user=> (-> "hello" (str " jmd"))
;;=> "hello jmd"

;;Pair Programming solution with Elizabeth and Don
;;************************************************
(defn reverse-text
  [file]
  (->> (slurp file)
       (reverse)
       (apply str)
       (spit (str "rev-" file))))

(reverse-text "text.txt")

;; Given Solution
;; **************
(require '[clojure.string :as string])

(defn reverse-file
  [file-name]
  (->> (slurp file-name)
       string/reverse
       (spit (str "rev-" file-name))))