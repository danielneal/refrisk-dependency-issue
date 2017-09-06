(ns refrisk-dependency-repro.core-test
  (:require [clojure.test :refer :all]
            [clojure.tools.reader]))

(deftest repro
  (testing "Tools reader"
    (= (clojure.tools.reader/read-string "#:foo{:bar 1}") {:foo/bar 1})))
