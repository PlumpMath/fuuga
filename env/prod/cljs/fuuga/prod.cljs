(ns fuuga.prod
  (:require [fuuga.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
