
(ns ui-test-devnagri-clj.webica-example
  (:require   [clojure.string :as string]
              [clojure.test :refer [deftest testing is]]
              [webica.core :as webica]
              [webica.by :as by]
              [webica.chrome-driver :as chrome]
              [webica.firefox-driver :as firefox]
              [webica.remote-web-driver :as browser]
              [webica.web-driver :as driver]
              [webica.web-driver-wait :as wait]
              [webica.web-element :as element]))



