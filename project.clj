(defproject factual/s3-journal "0.1.3"
  :description "Reliable, high-throughput journalling to S3"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.7.0"]]}}
  :dependencies [[com.amazonaws/aws-java-sdk-core "1.10.12" :exclusions [commons-codec]]
                 [com.amazonaws/aws-java-sdk-s3 "1.10.12" :exclusions [commons-codec]]
                 [factual/durable-queue "0.1.5"]
                 [org.clojure/tools.logging "0.3.1"]
                 [byte-streams "0.2.0"]
                 [byte-transforms "0.1.4"]]
  :jvm-opts ^:replace ["-server" "-Xmx8g"]
  :global-vars {*warn-on-reflection* true})
