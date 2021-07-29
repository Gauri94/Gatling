
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class AddToCartSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("http://automationpractice.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-GB,en-US;q=0.9,en;q=0.8")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.107 Safari/537.36")

	val headers_0 = Map(
		"Proxy-Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Cache-Control" -> "max-age=0",
		"Origin" -> "http://automationpractice.com",
		"Proxy-Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_2 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Proxy-Connection" -> "keep-alive",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_4 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "http://automationpractice.com",
		"Proxy-Connection" -> "keep-alive",
		"X-Requested-With" -> "XMLHttpRequest")



	val scn = scenario("AddToCartSimulation")
		.exec(http("request_0")
			.get("/index.php?controller=my-account")
			.headers(headers_0))
		.pause(7)
		.exec(http("LOGIN_REQUEST")
			.post("/index.php?controller=authentication")
			.headers(headers_1)
			.formParam("email", "gouri.maftest@gmail.com")
			.formParam("passwd", "Maftest@123")
			.formParam("back", "my-account")
			.formParam("SubmitLogin", ""))
		.pause(3)
		.exec(http("SEARCH_REQUEST")
			.get("/index.php?controller=search&q=dress&limit=10&timestamp=1627221833113&ajaxSearch=1&id_lang=1")
			.headers(headers_2))
		.pause(1)
		.exec(http("SEARCH_SUBMIT_REQUEST")
			.get("/index.php?controller=search&orderby=position&orderway=desc&search_query=dress&submit_search=")
			.headers(headers_0))
		.pause(2)
		.exec(http("ADD_TO_CART_REQUEST")
			.post("/index.php?rand=1627221839945")
			.headers(headers_4)
			.formParam("controller", "cart")
			.formParam("add", "1")
			.formParam("ajax", "true")
			.formParam("qty", "1")
			.formParam("id_product", "5")
			.formParam("token", "fb2c9f6b62307add059743db27744d05"))
		.pause(1)
		.exec(http("request_5")
			.get("/index.php?controller=order")
			.headers(headers_0))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}