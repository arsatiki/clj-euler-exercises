(def fibs (lazy-cat [1 1] (map + fibs (rest fibs))))
(apply + (filter even? (take-while #(< % 4e6) fibs)))