;; primes = sieve [ 2.. ]
;;   where
;;   sieve (p:x) = p : sieve [ n | n <- x, n `mod` p > 0 ]  
;; Inspired by Haskell.
(defn- sieve [[p & coll]]
  (let [x (filter #(> (mod % p) 0) coll)]
    (cons p (lazy-seq (sieve x)))))

(def primes (sieve (iterate inc 2)))
