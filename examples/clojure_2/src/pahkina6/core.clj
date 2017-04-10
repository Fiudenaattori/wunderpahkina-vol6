(ns pahkina6.core
  (:require [clojure.java.io :as io]))

(defn step [acc column-height]
  (reduce-kv (fn [m square-width square-height]
               (let [new-width (inc square-width)
                     new-height (min square-height column-height)]
                 (cond
                   (< new-width new-height) (assoc-in m [:squares new-width] new-height)
                   (= new-width new-height) (update m :solution max new-height)
                   :else                    (update m :solution max square-width))))
             (assoc acc :squares {1 column-height})
             (:squares acc)))

(defn complete [{:keys [squares solution]}]
  (reduce max solution (map key squares)))

(defn process [input]
  (complete (reduce step {:solution 0} input)))

(defn -main [& args]
  (->>
    (first args)
    (io/reader)
    (line-seq)
    (map #(Integer/parseInt %))
    (process)
    (println)))

