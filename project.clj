(defproject refrisk-dependency-repro "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/tools.reader "1.0.5"]
                 [re-frisk-sidecar "0.5.0" :exclusions [org.clojure/tools.reader]]])