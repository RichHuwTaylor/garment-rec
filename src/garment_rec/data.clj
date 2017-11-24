(ns garment-rec.data
  (:require [clj-ml.data :refer :all]
            [clojure.java.io :as io]
            [cheshire.core :refer :all]))

(defn read-json
  "Returns a collection containing maps of product details."
  [path]
  (with-open [rdr (io/reader path)]
    (-> rdr
        (parsed-seq)
        (first))))

(defn get-col-names
  ""
  [products-collection]
  (keys (first products-collection)))
