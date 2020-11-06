package Simulations

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

class SecondSIm extends Simulation {

  val httpRequest1: HttpRequestBuilder  =
    http("${param1} - ${param2}")
    .get("http://google.com")



  val myScn: ScenarioBuilder =
    scenario(" asd")
    .feed(csv("data/feedme.csv").circular)
    .exec(httpRequest1)


  setUp(myScn.inject(constantUsersPerSec(1) during 5))

}
