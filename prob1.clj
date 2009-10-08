(defn has-divisor [n & items] (some #(zero? (mod n %)) items))
(apply + (filter #(has-divisor % 3 5) (range 1000)))
