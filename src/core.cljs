(ns core
  (:require
   [lib]))

(defn main []
  (js/console.log (lib/greet "World")))
