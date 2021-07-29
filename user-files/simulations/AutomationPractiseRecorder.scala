
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class AutomationPractiseRecorder extends Simulation {

	val httpProtocol = http
		.baseUrl("http://automationpractice.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.164 Safari/537.36")

	val headers_34 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8")

	val headers_68 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_69 = Map("Origin" -> "http://automationpractice.com")

	val headers_70 = Map(
		"Origin" -> "http://automationpractice.com",
		"sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_72 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Cache-Control" -> "max-age=0",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_80 = Map("Accept" -> "*/*")

	val headers_85 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"origin" -> "http://automationpractice.com",
		"sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_90 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-fetch-dest" -> "iframe",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "cross-site",
		"upgrade-insecure-requests" -> "1")

	val headers_91 = Map(
		"Origin" -> "https://www.facebook.com",
		"sec-ch-ua" -> """ Not;A Brand";v="99", "Google Chrome";v="91", "Chromium";v="91""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_92 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

	val headers_94 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_164 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_170 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "http://automationpractice.com",
		"X-Requested-With" -> "XMLHttpRequest")

    val uri1 = "connect.facebook.net"
    val uri2 = "https://www.facebook.com"
    val uri3 = "https://static.xx.fbcdn.net/rsrc.php/v3/yk/l/0,cross/Gg1hipXQzLz.css"
    val uri5 = "https://fonts.gstatic.com/s/opensans/v20"
    val uri6 = "http://fonts.googleapis.com/css"

	val scn = scenario("AutomationPractiseRecorder")
		.exec(http("request_0")
			.get("/themes/default-bootstrap/css/global.css")
			.resources(http("request_1")
			.get("/themes/default-bootstrap/css/autoload/highdpi.css"),
            http("request_2")
			.get("/js/jquery/jquery-1.11.0.min.js"),
            http("request_3")
			.get("/js/jquery/jquery-migrate-1.2.1.min.js"),
            http("request_4")
			.get("/js/jquery/plugins/jquery.easing.js"),
            http("request_5")
			.get("/js/tools.js"),
            http("request_6")
			.get("/themes/default-bootstrap/js/global.js"),
            http("request_7")
			.get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js"),
            http("request_8")
			.get("/themes/default-bootstrap/css/autoload/responsive-tables.css"),
            http("request_9")
			.get("/themes/default-bootstrap/css/autoload/uniform.default.css"),
            http("request_10")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js"),
            http("request_11")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js"),
            http("request_12")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.js"),
            http("request_13")
			.get("/themes/default-bootstrap/js/products-comparison.js"),
            http("request_14")
			.get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js"),
            http("request_15")
			.get("/js/jquery/plugins/jquery.scrollTo.js"),
            http("request_16")
			.get("/js/jquery/plugins/jquery.serialScroll.js"),
            http("request_17")
			.get("/js/jquery/plugins/bxslider/jquery.bxslider.js"),
            http("request_18")
			.get("/themes/default-bootstrap/js/tools/treeManagement.js"),
            http("request_19")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.css"),
            http("request_20")
			.get("/modules/blockfacebook/blockfacebook.js"),
            http("request_21")
			.get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js"),
            http("request_22")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js"),
            http("request_23")
			.get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js"),
            http("request_24")
			.get("/themes/default-bootstrap/js/modules/homeslider/js/homeslider.js"),
            http("request_25")
			.get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js"),
            http("request_26")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js"),
            http("request_27")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js"),
            http("request_28")
			.get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css"),
            http("request_29")
			.get("/themes/default-bootstrap/css/product_list.css"),
            http("request_30")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js"),
            http("request_31")
			.get("/themes/default-bootstrap/js/index.js"),
            http("request_32")
			.get("/modules/blockbanner/img/sale70.png"),
            http("request_33")
			.get("/img/logo.jpg"),
            http("request_34")
			.get("/img/p/7/7-cart_default.jpg")
			.headers(headers_34),
            http("request_35")
			.get("/img/c/3-0_thumb.jpg"),
            http("request_36")
			.get("/img/c/3-1_thumb.jpg"),
            http("request_37")
			.get("/modules/homeslider/images/sample-1.jpg"),
            http("request_38")
			.get("/modules/homeslider/images/sample-2.jpg"),
            http("request_39")
			.get("/modules/homeslider/images/sample-3.jpg"),
            http("request_40")
			.get("/modules/themeconfigurator/img/banner-img6.jpg"),
            http("request_41")
			.get("/modules/themeconfigurator/img/banner-img7.jpg"),
            http("request_42")
			.get("/img/p/1/1-home_default.jpg"),
            http("request_43")
			.get("/img/p/7/7-home_default.jpg"),
            http("request_44")
			.get("/img/p/8/8-home_default.jpg"),
            http("request_45")
			.get("/img/p/1/0/10-home_default.jpg"),
            http("request_46")
			.get("/img/p/1/2/12-home_default.jpg"),
            http("request_47")
			.get("/img/p/1/6/16-home_default.jpg"),
            http("request_48")
			.get("/img/p/2/0/20-home_default.jpg"),
            http("request_49")
			.get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css"),
            http("request_50")
			.get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css"),
            http("request_51")
			.get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css"),
            http("request_52")
			.get("/modules/blockfacebook/css/blockfacebook.css"),
            http("request_53")
			.get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css"),
            http("request_54")
			.get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css"),
            http("request_55")
			.get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css"),
            http("request_56")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css"),
            http("request_57")
			.get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css"),
            http("request_58")
			.get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css"),
            http("request_59")
			.get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css"),
            http("request_60")
			.get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css"),
            http("request_61")
			.get("/themes/default-bootstrap/css/modules/homeslider/homeslider.css"),
            http("request_62")
			.get("/modules/themeconfigurator/css/hooks.css"),
            http("request_63")
			.get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css"),
            http("request_64")
			.get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css"),
            http("request_65")
			.get("/modules/editorial/css/editorial.css"),
            http("request_66")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css"),
            http("request_67")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css"),
            http("request_68")
			.get(uri6 + "?family=Open+Sans:300,600&subset=latin,latin-ext")
			.headers(headers_68),
            http("request_69")
			.get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
			.headers(headers_69),
            http("request_70")
			.get(uri5 + "/mem5YaGs126MiZpBA-UN_r8OUuhpKKSTjw.woff2")
			.headers(headers_70),
            http("request_71")
			.get(uri5 + "/mem5YaGs126MiZpBA-UNirkOUuhpKKSTjw.woff2")
			.headers(headers_70),
            http("request_72")
			.get("/index.php")
			.headers(headers_72),
            http("request_73")
			.get("/modules/themeconfigurator/img/banner-img1.jpg"),
            http("request_74")
			.get("/modules/themeconfigurator/img/banner-img2.jpg"),
            http("request_75")
			.get("/modules/themeconfigurator/img/banner-img3.jpg"),
            http("request_76")
			.get("/modules/themeconfigurator/img/banner-img4.jpg"),
            http("request_77")
			.get("/modules/themeconfigurator/img/banner-img5.jpg"),
            http("request_78")
			.get("/themes/default-bootstrap/img/footer-bg.png"),
            http("request_79")
			.get("/themes/default-bootstrap/css/modules/homeslider/images/bx_loader.gif"),
            http("request_80")
			.get("http://" + uri1 + "/en_US/all.js")
			.headers(headers_80),
            http("request_81")
			.get("https://" + uri1 + "/en_US/all.js?hash=20947e543794041a9a8f3ef1586d7b21")
			.headers(headers_70),
            http("request_82")
			.get("/img/p/8/8-home_default2x.jpg")
			.headers(headers_34)
			.check(status.is(404)),
            http("request_83")
			.get("/img/p/1/1-home_default2x.jpg")
			.headers(headers_34)
			.check(status.is(404)),
            http("request_84")
			.get("/img/p/7/7-home_default2x.jpg")
			.headers(headers_34)
			.check(status.is(404)),
            http("request_85")
			.get(uri2 + "/x/oauth/status?client_id=334341610034299&input_token&origin=1&redirect_uri=http%3A%2F%2Fautomationpractice.com%2Findex.php&sdk=joey&wants_cookie_data=false")
			.headers(headers_85),
            http("request_86")
			.get("/img/p/1/0/10-home_default2x.jpg")
			.headers(headers_34)
			.check(status.is(404)),
            http("request_87")
			.get("/img/p/1/2/12-home_default2x.jpg")
			.headers(headers_34)
			.check(status.is(404)),
            http("request_88")
			.get("/img/p/1/6/16-home_default2x.jpg")
			.headers(headers_34)
			.check(status.is(404)),
            http("request_89")
			.get("/img/p/2/0/20-home_default2x.jpg")
			.headers(headers_34)
			.check(status.is(404)),
            http("request_90")
			.get(uri2 + "/plugins/like_box.php?app_id=334341610034299&channel=https%3A%2F%2Fstaticxx.facebook.com%2Fx%2Fconnect%2Fxd_arbiter%2F%3Fversion%3D46%23cb%3Df15ddcda3c130e%26domain%3Dautomationpractice.com%26origin%3Dhttp%253A%252F%252Fautomationpractice.com%252Ff209a88f965d3b%26relation%3Dparent.parent&color_scheme=light&container_width=330&header=false&href=https%3A%2F%2Fwww.facebook.com%2Fprestashop&locale=en_US&sdk=joey&show_border=false&show_faces=true&stream=false")
			.headers(headers_90),
            http("request_91")
			.get(uri3 + "?_nc_x=I1OCuT_WMAD")
			.headers(headers_91),
            http("request_92")
			.get("/img/favicon.ico?1461205423")
			.headers(headers_92),
            http("request_93")
			.get("/img/favicon.ico?1461205423"),
            http("request_94")
			.get("/index.php?controller=search&q=dress&limit=10&timestamp=1626886686689&ajaxSearch=1&id_lang=1")
			.headers(headers_94)))
		.pause(12)
		.exec(http("request_95")
			.get("/themes/default-bootstrap/css/global.css")
			.resources(http("request_96")
			.get("/themes/default-bootstrap/css/autoload/highdpi.css"),
            http("request_97")
			.get("/themes/default-bootstrap/css/autoload/responsive-tables.css"),
            http("request_98")
			.get("/themes/default-bootstrap/css/autoload/uniform.default.css"),
            http("request_99")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.css"),
            http("request_100")
			.get("/themes/default-bootstrap/css/product.css"),
            http("request_101")
			.get("/modules/socialsharing/css/socialsharing.css"),
            http("request_102")
			.get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css"),
            http("request_103")
			.get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css"),
            http("request_104")
			.get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css"),
            http("request_105")
			.get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css"),
            http("request_106")
			.get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css"),
            http("request_107")
			.get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css"),
            http("request_108")
			.get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css"),
            http("request_109")
			.get("/themes/default-bootstrap/css/print.css"),
            http("request_110")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css"),
            http("request_111")
			.get("/themes/default-bootstrap/css/product_list.css"),
            http("request_112")
			.get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css"),
            http("request_113")
			.get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css"),
            http("request_114")
			.get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css"),
            http("request_115")
			.get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css"),
            http("request_116")
			.get("/modules/themeconfigurator/css/hooks.css"),
            http("request_117")
			.get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css"),
            http("request_118")
			.get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css"),
            http("request_119")
			.get("/modules/sendtoafriend/sendtoafriend.css"),
            http("request_120")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css"),
            http("request_121")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css"),
            http("request_122")
			.get("/js/jquery/jquery-1.11.0.min.js"),
            http("request_123")
			.get("/js/jquery/jquery-migrate-1.2.1.min.js"),
            http("request_124")
			.get("/js/jquery/plugins/jquery.easing.js"),
            http("request_125")
			.get("/js/tools.js"),
            http("request_126")
			.get("/themes/default-bootstrap/js/global.js"),
            http("request_127")
			.get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js"),
            http("request_128")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js"),
            http("request_129")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js"),
            http("request_130")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.js"),
            http("request_131")
			.get("/themes/default-bootstrap/js/products-comparison.js"),
            http("request_132")
			.get("/js/jquery/plugins/jquery.scrollTo.js"),
            http("request_133")
			.get("/js/jquery/plugins/jquery.serialScroll.js"),
            http("request_134")
			.get("/js/jquery/plugins/bxslider/jquery.bxslider.js"),
            http("request_135")
			.get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js"),
            http("request_136")
			.get("/themes/default-bootstrap/js/tools/treeManagement.js"),
            http("request_137")
			.get("/js/jquery/plugins/jquery.idTabs.js"),
            http("request_138")
			.get("/themes/default-bootstrap/js/product.js"),
            http("request_139")
			.get("/modules/socialsharing/js/socialsharing.js"),
            http("request_140")
			.get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js"),
            http("request_141")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js"),
            http("request_142")
			.get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js"),
            http("request_143")
			.get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js"),
            http("request_144")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js"),
            http("request_145")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js"),
            http("request_146")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js"),
            http("request_147")
			.get("/modules/productcomments/js/jquery.rating.pack.js"),
            http("request_148")
			.get("/modules/blockbanner/img/sale70.png"),
            http("request_149")
			.get("/img/logo.jpg"),
            http("request_150")
			.get("/img/p/7/7-cart_default.jpg")
			.headers(headers_34),
            http("request_151")
			.get("/themes/default-bootstrap/js/modules/sendtoafriend/sendtoafriend.js"),
            http("request_152")
			.get("/modules/productcomments/js/jquery.textareaCounter.plugin.js"),
            http("request_153")
			.get("/themes/default-bootstrap/js/modules/productcomments/js/productcomments.js"),
            http("request_154")
			.get(uri6 + "?family=Open+Sans:300,600&subset=latin,latin-ext")
			.headers(headers_68),
            http("request_155")
			.get("/img/c/3-0_thumb.jpg"),
            http("request_156")
			.get("/img/c/3-1_thumb.jpg"),
            http("request_157")
			.get("/img/p/1/0/10-home_default.jpg"),
            http("request_158")
			.get("/modules/productpaymentlogos/img/payment-logo.png"),
            http("request_159")
			.get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
			.headers(headers_69),
            http("request_160")
			.get(uri5 + "/mem5YaGs126MiZpBA-UN_r8OUuhpKKSTjw.woff2")
			.headers(headers_70),
            http("request_161")
			.get(uri5 + "/mem5YaGs126MiZpBA-UNirkOUuhpKKSTjw.woff2")
			.headers(headers_70),
            http("request_162")
			.get("/themes/default-bootstrap/img/border-1.gif"),
            http("request_163")
			.get("/themes/default-bootstrap/img/footer-bg.png"),
            http("request_164")
			.get("/index.php?id_product=4&controller=product")
			.headers(headers_164),
            http("request_165")
			.get("/img/p/1/0/10-cart_default.jpg")
			.headers(headers_34),
            http("request_166")
			.get("/img/p/1/1/11-cart_default.jpg")
			.headers(headers_34),
            http("request_167")
			.get("/img/p/1/0/10-medium_default.jpg")
			.headers(headers_34),
            http("request_168")
			.get("/img/p/1/0/10-large_default.jpg")
			.headers(headers_34),
            http("request_169")
			.get("/themes/default-bootstrap/img/jquery/uniform/sprite.png"),
            http("request_170")
			.post("/index.php?rand=1626886712859")
			.headers(headers_170)
			.formParam("controller", "cart")
			.formParam("add", "1")
			.formParam("ajax", "true")
			.formParam("qty", "1")
			.formParam("id_product", "4")
			.formParam("token", "fb2c9f6b62307add059743db27744d05")
			.formParam("ipa", "16"),
            http("request_171")
			.get("/themes/default-bootstrap/img/bg_bt.gif")))
		.pause(11)
		.exec(http("request_172")
			.get("/themes/default-bootstrap/css/autoload/highdpi.css")
			.resources(http("request_173")
			.get("/themes/default-bootstrap/css/global.css"),
            http("request_174")
			.get("/themes/default-bootstrap/css/autoload/responsive-tables.css"),
            http("request_175")
			.get("/themes/default-bootstrap/css/autoload/uniform.default.css"),
            http("request_176")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.css"),
            http("request_177")
			.get("/themes/default-bootstrap/css/addresses.css"),
            http("request_178")
			.get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css"),
            http("request_179")
			.get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css"),
            http("request_180")
			.get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css"),
            http("request_181")
			.get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css"),
            http("request_182")
			.get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css"),
            http("request_183")
			.get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css"),
            http("request_184")
			.get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css"),
            http("request_185")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css"),
            http("request_186")
			.get("/themes/default-bootstrap/css/product_list.css"),
            http("request_187")
			.get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css"),
            http("request_188")
			.get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css"),
            http("request_189")
			.get("/js/jquery/jquery-1.11.0.min.js"),
            http("request_190")
			.get("/js/jquery/jquery-migrate-1.2.1.min.js"),
            http("request_191")
			.get("/js/jquery/plugins/jquery.easing.js"),
            http("request_192")
			.get("/js/tools.js"),
            http("request_193")
			.get("/themes/default-bootstrap/js/global.js"),
            http("request_194")
			.get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js"),
            http("request_195")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js"),
            http("request_196")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js"),
            http("request_197")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.js"),
            http("request_198")
			.get("/themes/default-bootstrap/js/products-comparison.js"),
            http("request_199")
			.get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css"),
            http("request_200")
			.get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js"),
            http("request_201")
			.get("/js/jquery/plugins/jquery.scrollTo.js"),
            http("request_202")
			.get("/js/jquery/plugins/jquery.serialScroll.js"),
            http("request_203")
			.get("/js/jquery/plugins/bxslider/jquery.bxslider.js"),
            http("request_204")
			.get("/themes/default-bootstrap/js/tools/treeManagement.js"),
            http("request_205")
			.get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js"),
            http("request_206")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js"),
            http("request_207")
			.get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js"),
            http("request_208")
			.get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js"),
            http("request_209")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js"),
            http("request_210")
			.get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css"),
            http("request_211")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js"),
            http("request_212")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js"),
            http("request_213")
			.get("/modules/themeconfigurator/css/hooks.css"),
            http("request_214")
			.get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css"),
            http("request_215")
			.get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css"),
            http("request_216")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css"),
            http("request_217")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css"),
            http("request_218")
			.get("/js/jquery/plugins/jquery.typewatch.js"),
            http("request_219")
			.get("/themes/default-bootstrap/js/cart-summary.js"),
            http("request_220")
			.get(uri6 + "?family=Open+Sans:300,600&subset=latin,latin-ext")
			.headers(headers_68),
            http("request_221")
			.get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
			.headers(headers_69),
            http("request_222")
			.get(uri5 + "/mem5YaGs126MiZpBA-UN_r8OUuhpKKSTjw.woff2")
			.headers(headers_70),
            http("request_223")
			.get(uri5 + "/mem5YaGs126MiZpBA-UNirkOUuhpKKSTjw.woff2")
			.headers(headers_70),
            http("request_224")
			.get("/modules/blockbanner/img/sale70.png"),
            http("request_225")
			.get("/img/logo.jpg"),
            http("request_226")
			.get("/img/p/7/7-cart_default.jpg")
			.headers(headers_34),
            http("request_227")
			.get("/img/p/1/0/10-cart_default.jpg")
			.headers(headers_34),
            http("request_228")
			.get("/img/c/3-0_thumb.jpg"),
            http("request_229")
			.get("/img/c/3-1_thumb.jpg"),
            http("request_230")
			.get("/img/p/7/7-small_default.jpg"),
            http("request_231")
			.get("/themes/default-bootstrap/img/order-step-a.png"),
            http("request_232")
			.get("/themes/default-bootstrap/img/order-step-current.png"),
            http("request_233")
			.get("/themes/default-bootstrap/img/footer-bg.png"),
            http("request_234")
			.get("/index.php?controller=order")
			.headers(headers_164),
            http("request_235")
			.get("/img/p/1/0/10-small_default.jpg")
			.headers(headers_34)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}