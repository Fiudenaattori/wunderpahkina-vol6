(ns area.core)

(def heights (->> (slurp "resources/input.txt")
                  clojure.string/split-lines
                  (map read-string)))

(defn solve []
  (->> heights
       (reduce (fn [{:keys [biggest left right]} cur-height]
                 (let [distance-to-smaller (fn [cols] (count (take-while #(>= % cur-height) cols)))
                       width (+ 1 (distance-to-smaller left) (distance-to-smaller right))
                       potential (min width cur-height)]
                   {:biggest (max biggest potential)
                    :left (cons cur-height left)
                    :right (rest right)}))
               {:biggest 0
                :left '()
                :right (rest heights)})
       :biggest))
