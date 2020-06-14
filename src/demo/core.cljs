(ns demo.core
  (:require
    [reagent.dom :as rdom]
    [reagent.core :as r]))

(defonce state (r/atom {:counter 1}))

(defn app-view []
  [:div
   [:h1 "Hello World!"]
   (:counter @state)
   [:button {:on-click (fn []
                         (swap! state update :counter inc))}
    "+1"]])

(+ 1 1)

;; ctrl alt c   then space to evaluate top level form ie. between two brackets ( )
;; 
;; ctrl alt c   then  e   to evaluate a current piece of a form ( ())
;; 
;; ctrl alt c    then  enter to evaluate a whole file
;; 
(defn render! []
  (rdom/render
    [app-view]
    (js/document.getElementById "app")))



