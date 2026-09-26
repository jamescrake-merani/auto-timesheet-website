(ns powerblog.core)

(defn layout [title content]
  [:html
   [:head
    [:meta {:charset "utf-8"}]
    [:meta
     {:name "viewport" :content "width=device-width, initial-scale=1"}]
    [:title title]
    [:link
     {:rel "stylesheet"
      :href "https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.classless.cyan.min.css"}]]
   [:body
    [:header
     [:nav
      [:ul
       [:li [:strong "Auto Timesheet"]]
       [:li "Installation"]
       [:li "Documentation"]]]]
    [:main
     content]]])

(defn render-page [context page]
  (layout "Placeholder" "Placeholder"))

(def config
  {:site/title "Auto Timesheet"
   :powerpack/render-page #'render-page})

