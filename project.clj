(defproject ui-test-devnagri-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-beta4"]
                 [etaoin "0.1.8-SNAPSHOT"]
                 [webica "3.0.0-beta2-clj0"]]

  :main ^:skip-aot ui-test-devnagri-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
