(ns exercise3)

(defn fibonacci
    "fibonacci sequence"
    [num]
    (cond
        (= num 0) 0
        (= num 1) 1
        :else (+ (fibonacci (- num 1)) (fibonacci (- num 2)))
    )
)
