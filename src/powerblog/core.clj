(ns powerblog.core
  (:require [powerpack.markdown :as md]))

(defn layout [title content]
  [:html
   [:head
    [:meta {:charset "utf-8"}]
    [:meta
     {:name "viewport" :content "width=device-width, initial-scale=1"}]
    [:title title]
    [:link
     {:rel "stylesheet"
      :href "https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.classless.cyan.min.css"}]
    [:link
     {:rel "stylesheet"
      :href "https://cdn.jsdelivr.net/gh/highlightjs/cdn-release@11.12.0/build/styles/default.min.css"}]]
   [:body
    [:header
     [:nav
      [:ul
       [:li [:strong "Auto Timesheet"]]
       [:li "Installation"]
       [:li "Documentation"]]]]
    [:main
     content]]
   [:script {:src "https://cdn.jsdelivr.net/gh/highlightjs/cdn-release@11.12.0/build/highlight.min.js"}]
   [:script {:src "https://cdn.jsdelivr.net/gh/highlightjs/cdn-release@11.12.0/build/languages/shell.min.js"}]
   [:script "hljs.highlightAll();"]])

(defn render-page [context page]
  (layout "Auto Timesheet" (md/render-html (:page/body page))))

(def config
  {:site/title "Auto Timesheet"
   :powerpack/render-page #'render-page})

