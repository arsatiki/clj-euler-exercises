(defn square [a] (* a a))
(defn hypotenuse [a b] (+ (square a) (square b)))

(defn pythagorean-triplet? [[a b c]]
  (= (hypotenuse a b) (square c)))

(def candidates
  (for [a (range 1000) 
        b (range (inc a) 1000) 
        c [(- 1000 a b)] :when (< 0 b c)]
    [a b c]))

(defn *** [[a b c ]] (* a b c))

(apply *** (filter pythagorean-triplet? candidates))