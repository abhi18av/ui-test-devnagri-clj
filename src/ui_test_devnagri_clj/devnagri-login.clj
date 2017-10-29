(ns ui-test-devnagri-clj.devnagri-login
  (:use etaoin.api)
  (:require [clojure.test :as test]
            [etaoin.keys :as k]))

(def driver (chrome)) ;; here, a Chrome(ium) window should appear

;; let's perform a quick Wiki session
(go driver "http://beta.devnagri.co.in/login")

(fill driver {:id :email} "translator@fourtek.com")

(fill driver {:id :password} "secret")

(click driver {:type :submit})

;(js-execute driver "window.alert(\"Hello, world!\")")

;(screenshot driver "/Users/eklavya/Desktop/screenshot.png")

(maximize driver )


(get-window-size driver)


;(set-window-size driver 100 100)


;(mouse-move-to driver {:class :card-title})


(mouse-move-to driver 200 200 )
