
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class ParaBankAccounts extends Simulation {

	val httpProtocol = http
		.baseUrl("https://parabank.parasoft.com")
		.inferHtmlResources()

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"origin" -> "https://parabank.parasoft.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.107 Safari/537.36")

	val headers_1 = Map(
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.107 Safari/537.36",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_20 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.107 Safari/537.36")

	val headers_22 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.107 Safari/537.36")

	val headers_48 = Map(
		"accept" -> "application/json, text/plain, */*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"content-type" -> "application/json;charset=UTF-8",
		"origin" -> "https://parabank.parasoft.com",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "same-origin",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.107 Safari/537.36")



	val scn = scenario("ParaBankAccounts")
		.exec(http("LOGIN_REQUEST")
			.post("/parabank/login.htm")
			.headers(headers_0)
			.formParam("username", "gsoneja")
			.formParam("password", "Maftest@1234")
			.resources(http("request_1")
			.get("/parabank/webjars/angularjs/1.6.9/angular.min.js")
			.headers(headers_1),
            http("request_2")
			.get("/parabank/images/clear.gif")
			.headers(headers_1),
            http("LOGO_REQUEST")
			.get("/parabank/images/logo.gif")
			.headers(headers_1),
            http("request_4")
			.get("/parabank/template.css")
			.headers(headers_1),
            http("request_5")
			.get("/parabank/style.css")
			.headers(headers_1),
            http("request_6")
			.get("/parabank/images/main-bg.gif")
			.headers(headers_1),
            http("request_7")
			.get("/parabank/images/topbg.gif")
			.headers(headers_1),
            http("request_8")
			.get("/parabank/images/bullet-hover.gif")
			.headers(headers_1),
            http("request_9")
			.get("/parabank/images/bullet-normal.gif")
			.headers(headers_1),
            http("request_10")
			.get("/parabank/images/home-normal.gif")
			.headers(headers_1),
            http("request_11")
			.get("/parabank/images/aboutus-normal.gif")
			.headers(headers_1),
            http("request_12")
			.get("/parabank/images/contact-normal.gif")
			.headers(headers_1),
            http("request_13")
			.get("/parabank/images/bodybg.gif")
			.headers(headers_1),
            http("request_14")
			.get("/parabank/images/bullet2-normal.gif")
			.headers(headers_1),
            http("request_15")
			.get("/parabank/images/header-customer.jpg")
			.headers(headers_1),
            http("request_16")
			.get("/parabank/images/sky-color-bg.gif")
			.headers(headers_1),
            http("request_17")
			.get("/parabank/images/footerbg.gif")
			.headers(headers_1),
            http("request_18")
			.get("/parabank/images/gradhead.png")
			.headers(headers_1),
            http("request_19")
			.get("/parabank/images/gradback.png")
			.headers(headers_1),
            http("GET_ACCOUNT_REQUEST")
			.get("/parabank/services_proxy/bank/customers/12545/accounts")
			.headers(headers_20),
            http("request_21")
			.get("/parabank/images/bullet2-hover.gif")
			.headers(headers_1)))
		.pause(1)
		.exec(http("request_22")
			.get("/parabank/openaccount.htm")
			.headers(headers_22)
			.resources(http("request_23")
			.get("/parabank/template.css")
			.headers(headers_1),
            http("request_24")
			.get("/parabank/style.css")
			.headers(headers_1),
            http("request_25")
			.get("/parabank/webjars/angularjs/1.6.9/angular.min.js")
			.headers(headers_1),
            http("request_26")
			.get("/parabank/images/clear.gif")
			.headers(headers_1),
            http("request_27")
			.get("/parabank/images/logo.gif")
			.headers(headers_1),
            http("request_28")
			.get("/parabank/images/main-bg.gif"),
            http("request_29")
			.get("/parabank/images/topbg.gif"),
            http("request_30")
			.get("/parabank/images/header-customer.jpg")
			.headers(headers_1),
            http("request_31")
			.get("/parabank/images/bullet-hover.gif"),
            http("request_32")
			.get("/parabank/images/bullet-normal.gif"),
            http("request_33")
			.get("/parabank/images/bullet-normal.gif"),
            http("request_34")
			.get("/parabank/images/home-normal.gif"),
            http("request_35")
			.get("/parabank/images/aboutus-normal.gif"),
            http("request_36")
			.get("/parabank/images/contact-normal.gif"),
            http("request_37")
			.get("/parabank/images/bodybg.gif"),
            http("request_38")
			.get("/parabank/images/bullet2-normal.gif"),
            http("request_39")
			.get("/parabank/images/bullet2-normal.gif"),
            http("request_40")
			.get("/parabank/images/bullet2-normal.gif"),
            http("request_41")
			.get("/parabank/images/sky-color-bg.gif"),
            http("request_42")
			.get("/parabank/images/button-bgr.png")
			.headers(headers_1),
            http("request_43")
			.get("/parabank/images/footerbg.gif"),
            http("CREATE_ACCOUNT_REQUEST")
			.get("/parabank/services_proxy/bank/customers/12545/accounts")
			.headers(headers_20),
            http("request_45")
			.get("/parabank/images/bullet2-hover.gif"),
            http("request_46")
			.get("/parabank/images/bullet2-hover.gif"),
            http("request_47")
			.get("/parabank/images/bullet2-normal.gif")))
		.pause(2)
		.exec(http("request_48")
			.post("/parabank/services_proxy/bank/createAccount?customerId=12545&newAccountType=0&fromAccountId=14010")
			.headers(headers_48))
		.pause(2)
		.exec(http("request_49")
			.get("/parabank/images/bullet2-hover.gif")
			.resources(http("request_50")
			.get("/parabank/images/bullet2-hover.gif"),
            http("request_51")
			.get("/parabank/overview.htm")
			.headers(headers_22),
            http("request_52")
			.get("/parabank/template.css")
			.headers(headers_1),
            http("request_53")
			.get("/parabank/style.css")
			.headers(headers_1),
            http("request_54")
			.get("/parabank/webjars/angularjs/1.6.9/angular.min.js")
			.headers(headers_1),
            http("request_55")
			.get("/parabank/images/clear.gif")
			.headers(headers_1),
            http("request_56")
			.get("/parabank/images/logo.gif")
			.headers(headers_1),
            http("request_57")
			.get("/parabank/images/main-bg.gif"),
            http("request_58")
			.get("/parabank/images/topbg.gif"),
            http("request_59")
			.get("/parabank/images/header-customer.jpg")
			.headers(headers_1),
            http("request_60")
			.get("/parabank/images/bullet-hover.gif"),
            http("request_61")
			.get("/parabank/images/bullet-normal.gif"),
            http("request_62")
			.get("/parabank/images/bullet-normal.gif"),
            http("request_63")
			.get("/parabank/images/home-normal.gif"),
            http("request_64")
			.get("/parabank/images/aboutus-normal.gif"),
            http("request_65")
			.get("/parabank/images/contact-normal.gif"),
            http("request_66")
			.get("/parabank/images/bodybg.gif"),
            http("request_67")
			.get("/parabank/images/bullet2-normal.gif"),
            http("request_68")
			.get("/parabank/images/bullet2-normal.gif"),
            http("request_69")
			.get("/parabank/images/bullet2-normal.gif"),
            http("request_70")
			.get("/parabank/images/sky-color-bg.gif"),
            http("request_71")
			.get("/parabank/images/gradhead.png"),
            http("request_72")
			.get("/parabank/images/gradhead.png"),
            http("request_73")
			.get("/parabank/images/gradhead.png"),
            http("request_74")
			.get("/parabank/images/gradback.png"),
            http("request_75")
			.get("/parabank/images/gradback.png"),
            http("request_76")
			.get("/parabank/images/gradback.png"),
            http("request_77")
			.get("/parabank/images/footerbg.gif"),
            http("request_78")
			.get("/parabank/services_proxy/bank/customers/12545/accounts")
			.headers(headers_20),
            http("request_79")
			.get("/parabank/images/gradback.png"),
            http("request_80")
			.get("/parabank/images/gradback.png"),
            http("request_81")
			.get("/parabank/images/gradback.png"),
            http("request_82")
			.get("/parabank/images/gradback.png"),
            http("request_83")
			.get("/parabank/images/gradback.png"),
            http("request_84")
			.get("/parabank/images/gradback.png"),
            http("request_85")
			.get("/parabank/images/gradback.png"),
            http("request_86")
			.get("/parabank/images/gradback.png"),
            http("request_87")
			.get("/parabank/images/gradback.png"),
            http("request_88")
			.get("/parabank/images/bullet2-hover.gif"),
            http("request_89")
			.get("/parabank/images/bullet2-hover.gif"),
            http("request_90")
			.get("/parabank/images/bullet2-normal.gif"),
            http("request_91")
			.get("/parabank/images/bullet2-hover.gif"),
            http("request_92")
			.get("/parabank/images/bullet2-normal.gif")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}