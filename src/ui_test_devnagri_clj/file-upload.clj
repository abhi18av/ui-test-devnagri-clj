(ns ui-test-devnagri-clj.file-upload
  (:use etaoin.api)
  (:require [clojure.test :as test]
            [etaoin.keys :as k]))

(def driver (chrome)) ;; here, a Chrome window should appear

;; let's perform a quick Wiki session
(go driver "http://demo.guru99.com/selenium/upload/") 

(click driver {:id "terms" })


(click driver {:id "uploadfile_0" })


(fill {:id "uploadfile_0" } "")

; mac
(fill driver {:id "uploadfile_0"} "/Users/eklavya/Desktop/profile.jpg")


; ubuntu
(upload-file driver {:tag :input :type :file} "/Users/ivan/Downloads/sample.png")


(click driver {:name :send  })


;;;;;; test file upload from main repo example


;; open a web page that serves uploaded files
(go driver "http://nervgh.github.io/pages/angular-file-upload/examples/simple/")

;; search for input widgets, there are a couple of them
(query-all driver {:tag :input :type :file})

;; upload an image with the first one
(upload-file driver {:tag :input :type :file} "/Users/ivan/Downloads/sample.png")
