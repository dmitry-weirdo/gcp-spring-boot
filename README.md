# Trivial Spring Boot application run on Google App Engine Standard

This is almost one-by-one done by [the tutorial](https://codelabs.developers.google.com/codelabs/cloud-app-engine-springboot/).

To run the app:
* Clone the repository.
* In ``appengine-web.xml``, replace content of ``<application>`` tag with your GCP project id.
* run ``mvn clean install``
* For local deployment, run ``mvn -DskipTests appengine:devserver``. 
    * On <http://localhost:8080/> and <http://localhost:8080/hello>, you can see Spring Rest Controller output. 
    * On <http://localhost:8080/helloServlet>, you can see standard servlet output.
* For deployment to GCP, run ``mvn -DskipTests appengine:update``.  
    * You can then open app by running ``gcloud app browse``.
    * Relative urls and results will be the same, obviously.

Other notes:
* There is ``java.lang.NullPointerException at java.util.concurrent.ConcurrentHashMap.get`` on Jetty start. But that actually does not matter.
* Using Google Cloud APIs does not work. Maven dependencies have to be added, 
most probably copied from the App Engine type created by generating the corresponding maven artifact. 
* Deployment via IntelliJ IDEA does not work, it seems that it will be fixed with additional maven dependencies too.  