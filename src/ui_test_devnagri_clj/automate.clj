(ns ui-test-devnagri-clj.automate
  (:use etaoin.api)
  (:require [clojure.test :as test]
            [etaoin.keys :as k]))





(def driver (chrome)) ;; here, a Firefox window should appear

;; let's perform a quick Wiki session
(go driver "https://en.wikipedia.org/")

(wait-visible driver [{:id :simpleSearch} {:tag :input :name :search}])

;; search for something
(fill driver {:tag :input :name :search} "Clojure programming language")


(fill driver {:tag :input :name :search} k/enter)
(wait-visible driver {:class :mw-search-results})
(click driver [{:class :mw-search-results} {:class :mw-search-result-heading} {:tag :a}])
(wait-visible driver {:id :firstHeading})
(get-url driver)


