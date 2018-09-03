# Project Demonstration

## In order to run the project 

1. git clone https://nikif@bitbucket.org/nikif/demo.git

2. cd demo

3. `mvn clean package` Or `./mvnw clean package`

4. `java -jar target/demo-0.0.1-SNAPSHOT.jar`

5. the exposed info can be accessed from `localhost:8080/api/metrics/`

The default spring profile is `prod` that accesses the wunderground api. 

## Documentation

Every class used containts a small description at its beginning. 

The main class is the `DemoApplication.java`. In the following section the applcation is briefly outlined:

```
/**
 * Main Class of the spring boot application responsible for bootstrapping the tomcat
 * along with the application.
 *
 * CommandLineRunner is used so that when the application runs:
 *
 * 1. A http request is executed to fetch the data from the wunderground api with
 * the help of HttpRequestService
 *
 * 2. The returned json is converted to pojo with the help of JsonDeserializerService
 *
 * 3. Through getters and setters the 4 :
 *       a. Max percentage humidity -> maxhumidity
 *       b. Max Temp in C -> maxtempm
 *       c. Min Temp in C -> mintempm
 *       d. Precipitation in mm -> precipm
 *     are accessed through the DailySummary object that summarizes the requested info for NY
 *     for the given day
 *
 *     4. The WeatherInfo pojo is constructed that encapsulates the 4 aforementioned details
 *
 *     5. Through the WeatherInfoRepository the WeatherInfo pojo is saved in the h2 in memory db
 *     (The jpa is responsible for creating the needed db tables as WeatherInfo is annotated
 *     with @Entity jpa annotation)
 *
 *  6. Any step is logged appropriately and should any fail, no object is saved.
 *
 *  7. If everything goes ok then the pojo is saved in the db and can be accessed with the
 *  help of WeatherInfoRepository from the db and exposed with the MetricsController
 *  to the url localhost:8080/api/metrics
 */
```



## Run Parameters supported 

```
java -jar -Dspring.profiles.active=dev -Dapi.default.key=2312313

OR 

java -jar demo.jar --spring.profiles.active=dev --api.default.key=123131
```

1. `api.default.key` can be used in order to run the application with a different api key
2. For local development `dev` spring profile is supported for full logs and for a local `node.js express` server that exposes the same `json` as wunderground api. The server is located in `demo/server`file directory and requires `npm i` and `node index.js` to run in port 3000.