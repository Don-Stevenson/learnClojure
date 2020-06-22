(defn convert-spage
  [years planet-one planet-two]

  (let [solar-year
        {:earth 365
         :mercury 88
         :mars 687
         :uranus 30660
         :venus 225
         :jupiter 4380
         :saturn 10585
         :neptune 60225}]
    (-> solar-year planet-one
        (* years)
        (/ (solar-year planet-two))
           int )))

;;earth years to saturn yrs
;;
(convert-spage 30 :earth :saturn)