(ns ui-test-devnagri-clj.file-upload
  (:use etaoin.api)
  (:require [clojure.test :as test]
            [etaoin.keys :as k]))

(def driver (chrome)) ;; here, a Firefox window should appear

;; let's perform a quick Wiki session
(go driver "http://demo.guru99.com/selenium/upload/")


(click driver {:id "terms" })


(click driver {:id "uploadfile_0" })


(fill {:id "uploadfile_0" } "")

(fill driver {:id "uploadfile_0"} "/Users/eklavya/Desktop/profile.jpg")



(click driver {:name :send  })

