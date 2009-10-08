;;; This is pretty slow
(defn divides [k n] (zero? (mod n k)))

(defn proper-divisors [n]
  (filter #(divides % n) (range 1 (inc (/ n 2)))))

(defn sum [coll] (apply + coll))
(defn d [n] (sum (proper-divisors n)))
(def dd (comp d d))

(defn amicable-number? [n]
  (let [dn (d n)]
    (and (not= n dn) (= n (d dn)))))

(sum (filter amicable-number? (range 10000)))