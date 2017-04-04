(ns yegortimoshenko.temp
  (:import [java.nio.file Files Path]
           [java.nio.file.attribute FileAttribute]))

(def attributes (into-array FileAttribute []))

(defn directory [prefix]
  (.toFile (Files/createTempDirectory prefix attributes)))

(defn file [prefix suffix]
  (.toFile (Files/createTempFile prefix suffix attributes)))