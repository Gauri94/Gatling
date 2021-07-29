
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("http://automationpractice.com")
		.inferHtmlResources()
		.acceptHeader("image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-GB,en-US;q=0.9,en;q=0.8")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.107 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Origin" -> "http://automationpractice.com",
		"Proxy-Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Proxy-Connection" -> "keep-alive",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Proxy-Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_3 = Map("Proxy-Connection" -> "keep-alive")

	val headers_19 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "http://automationpractice.com",
		"Proxy-Connection" -> "keep-alive",
		"X-Requested-With" -> "XMLHttpRequest")



	val scn = scenario("AutomationEcommerceRecordedSimulation")
		.exec(http("LOGIN_REQUEST")
			.post("/index.php?controller=authentication")
			.headers(headers_0)
			.formParam("email", "gouri.maftest@gmail.com")
			.formParam("passwd", "Maftest@123")
			.formParam("back", "my-account")
			.formParam("SubmitLogin", ""))
		.pause(4)
		.exec(http("SEARCH_REQUEST")
			.get("/index.php?controller=search&q=dress&limit=10&timestamp=1627220885201&ajaxSearch=1&id_lang=1")
			.headers(headers_1))
		.pause(1)
		.exec(http("request_2")
			.get("/index.php?controller=search&orderby=position&orderway=desc&search_query=dress&submit_search=")
			.headers(headers_2)
			.resources(http("request_3")
			.get("/img/p/2/0/20-small_default2x.jpg")
			.headers(headers_3)
			.check(status.is(404)),
            http("request_4")
			.get("/img/p/7/7-small_default2x.jpg")
			.headers(headers_3)
			.check(status.is(404)),
            http("request_5")
			.get("/img/p/1/6/16-small_default2x.jpg")
			.headers(headers_3)
			.check(status.is(404)),
            http("request_6")
			.get("/img/p/1/1-small_default2x.jpg")
			.headers(headers_3)
			.check(status.is(404)),
            http("request_7")
			.get("/img/p/1/0/10-small_default2x.jpg")
			.headers(headers_3)
			.check(status.is(404)),
            http("request_8")
			.get("/img/p/8/8-small_default2x.jpg")
			.headers(headers_3)
			.check(status.is(404)),
            http("request_9")
			.get("/img/p/1/2/12-small_default2x.jpg")
			.headers(headers_3)
			.check(status.is(404)),
            http("request_10")
			.get("/img/p/1/6/16-home_default2x.jpg")
			.headers(headers_3)
			.check(status.is(404)),
            http("request_11")
			.get("/img/p/2/0/20-home_default2x.jpg")
			.headers(headers_3)
			.check(status.is(404)),
            http("request_12")
			.get("/img/p/1/0/10-home_default2x.jpg")
			.headers(headers_3)
			.check(status.is(404)),
            http("request_13")
			.get("/img/p/8/8-home_default2x.jpg")
			.headers(headers_3)
			.check(status.is(404)),
            http("request_14")
			.get("/img/p/1/2/12-home_default2x.jpg")
			.headers(headers_3)
			.check(status.is(404)),
            http("request_15")
			.get("/img/p/1/1-home_default2x.jpg")
			.headers(headers_3)
			.check(status.is(404)),
            http("request_16")
			.get("/img/p/7/7-home_default2x.jpg")
			.headers(headers_3)
			.check(status.is(404)),
            http("request_17")
			.get("/themes/default-bootstrap/img/jquery/uniform/sprite.png")
			.headers(headers_3),
            http("request_18")
			.get("/themes/default-bootstrap/img/functional-bt-shadow.png")
			.headers(headers_3),
            http("ADD_TO_CART_REQUEST")
			.post("/index.php?rand=1627220892935")
			.headers(headers_19)
			.formParam("controller", "cart")
			.formParam("add", "1")
			.formParam("ajax", "true")
			.formParam("qty", "1")
			.formParam("id_product", "5")
			.formParam("token", "fb2c9f6b62307add059743db27744d05"),
            http("request_20")
			.get("/img/p/1/2/12-cart_default.jpg")
			.headers(headers_3)))
		.pause(1)
		.exec(http("LOGOUT_REQUEST")
			.get("/index.php?controller=order")
			.headers(headers_2))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}