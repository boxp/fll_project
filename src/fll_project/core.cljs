(ns fllproject.core
  (:require [goog.style :as style]
            [goog.fx.dom :as fxdom]
            [goog.dom :as dom]))

; define backgrounds paths
(def backgrounds {0 "elements/0.jpg", 1 "elements/1.jpg", 2 "elements/2.jpg"})

; define fade-indicator
(def fadeindicator (fxdom/FadeInAndShow. js/header 1000))

; Set randomized backgrounds
(defn setbackground [] 
  (do (style/setTransparentBackgroundImage js/header 
      (backgrounds 
        (def selected-background 
          (.floor js/Math (* 3 (.random js/Math))))))
      (style/showElement js/header false)
      (. fadeindicator (play))))

; set default function
(set! (. js/window -onload) setbackground)

; define button fader
(def fadeoutbutton1 (fxdom/Fade. js/button1 1 0.8 300))
(def fadeoutbutton2 (fxdom/Fade. js/button2 1 0.8 300))
(def fadeoutbutton3 (fxdom/Fade. js/button3 1 0.8 300))
(def fadeoutbutton4 (fxdom/Fade. js/button4 1 0.8 300))
(def fadeoutbutton5 (fxdom/Fade. js/button5 1 0.8 300))
(def fadeoutbutton6 (fxdom/Fade. js/button6 1 0.8 300))
(def fadeoutbutton7 (fxdom/Fade. js/button7 1 0.8 300))

; define button fader
(def fadeinbutton1 (fxdom/Fade. js/button1 0.8 1 300))
(def fadeinbutton2 (fxdom/Fade. js/button2 0.8 1 300))
(def fadeinbutton3 (fxdom/Fade. js/button3 0.8 1 300))
(def fadeinbutton4 (fxdom/Fade. js/button4 0.8 1 300))
(def fadeinbutton5 (fxdom/Fade. js/button5 0.8 1 300))
(def fadeinbutton6 (fxdom/Fade. js/button6 0.8 1 300))
(def fadeinbutton7 (fxdom/Fade. js/button7 0.8 1 300))

; define button linker
(defn linkbutton1 []
  (set! 
    (. js/window -location) "index.html"))
(defn linkbutton2 []
  (set! 
    (. js/window -location) "homepage/whatsfll.html"))
(defn linkbutton3 []
  (set! 
    (. js/window -location) "homepage//history.html"))
(defn linkbutton4 []
  (set! 
    (. js/window -location) "homepage/participate.html"))
(defn linkbutton5 []
  (set! 
    (. js/window -location) "homepage/enlarge.html"))
(defn linkbutton6 []
  (set! 
    (. js/window -location) "homepage/lecture.html"))
(defn linkbutton7 []
  (set! 
    (. js/window -location) "homepage/lounge.html"))
