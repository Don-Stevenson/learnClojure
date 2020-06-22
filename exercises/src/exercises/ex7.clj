#_( Write a function count-if that counts the number of items in a collection that pass a certain predicate.

related functions
filter count
sample tests
(is (= 3 (count-if even? [1 2 3 4 5 6])))

(is (= 1 (count-if keyword? ["foo" :bar 'baz])))

(is (= 2
       (count-if (fn [x]
                   (= x (reverse x)))
                 [[1 2 1] [1 2 3 4] [1]])))

)

(defn count-if
  [f items-list]
  (->> items-list
       (filter f)
       ;count
       (reduce +)))

(println (count-if even? [1 2 3 4 5 6]))
(println (count-if odd? [1 2 3 4 5 6 7]))