(ns blackjack-v2.core)



(defn eleva [lista]
  (map #(* % %)lista))

(def lista-original '(1 2 3 4 5 6 7))

(println "lista elevada:" (eleva lista-original) )
