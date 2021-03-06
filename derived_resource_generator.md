# TIL

[2021-05-27]

 -  [Spring] spring boot current profile
   - **[Spring 의 Profiles - Sungho's Blog](https://sgc109.github.io/2020/07/06/spring-profiles/)**
   - [How do you get current active/default Environment profile programmatically in Spring? - Stack Overflow](https://stackoverflow.com/questions/9267799/how-do-you-get-current-active-default-environment-profile-programmatically-in-sp)
   - [How to determine programmatically the current active profile using Spring boot](https://www.edureka.co/community/69922/determine-programmatically-current-active-profile-spring)
   - [Spring Profiles](https://www.baeldung.com/spring-profiles)
   - [Properties with Spring and Spring Boot](https://www.baeldung.com/properties-with-spring)
   - [Spring boot get active profile - Java Developer Zone](https://javadeveloperzone.com/spring-boot/spring-boot-get-active-profile/)
   - [[Spring Boot] Profile 설정](https://better-dev.netlify.app/java/2019/03/11/spring_10/)
   - [코딩하는 오징어 :: Spring boot profile 적용하기](https://effectivesquid.tistory.com/entry/Spring-boot-profile-%EC%A0%81%EC%9A%A9%ED%95%98%EA%B8%B0)
   - [[Spring]Spring boot + Spring Profile을 이용한 환경 별 자원 이용](https://ratseno.tistory.com/67)
   - [spring profile 을 사용하여 환경에 맞게 deploy 하기](https://www.lesstif.com/java/spring-profile-deploy-18220309.html)
   


 - [Tomcat/Servlet Container] 쿼리 스트링 특수문자 완화 : The valid characters are defined in RFC 7230 and RFC 3986
   - [[ERROR] Invalid character found in the request target. The valid characters are defined in RFC 7230 and RFC 3986 · 기억하기 위한 개발노트](http://jmlim.github.io/java/2019/10/14/characters-are-defined-in-rfc-7230-and-rfc-3986/)
   - [[Tomcat] java.lang.IllegalArgumentException: Invalid character found in the request target. The valid characters are defined in RFC 7230 and RFC 3986 - 따시! 먹고 살겠다고..](https://ddasi-live.tistory.com/17)


 - [HTTP] 리다이렉트 시 301, 302, 303 Status Code / SEO 영향
   - 301 vs 302 : 기본적으로 클라이언트 캐시 탐
     - 301 : 절루 가! 영원히 오지마, 다신 절대 찾아오지마 (브라우저가 한번 퇴짜를 맡은 걸 잊지않고 영원히 기억함)
     - 302 : 잠깐 일루 가
     - [[HTTP] 301과 302 Redirect의 차이](https://nsinc.tistory.com/168)
   - 303 사용 시 : 기본적으로 클라이언트 캐시 회피 (Cache-Control 헤더를 별도로 주면 그땐 캐시 탐)
     - [HTTP 상태 코드 301에서 303을 이용한 Location 헤더의 브라우저 캐시 회피하기](https://cherrypick.co.kr/avoid-location-header-cache-in-brower-using-303-http-code/)
   - 301 vs 308
     - [301 Moved Permanently - HTTP](https://developer.mozilla.org/ko/docs/Web/HTTP/Status/301)
     - [308 Permanent Redirect - HTTP](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/308)
   - 302 vs 307
     - [302 Found (Moving Temporarily) - HTTP](https://developer.mozilla.org/ko/docs/Web/HTTP/Status/302)
     - [307 Temporary Redirect - HTTP](https://developer.mozilla.org/ko/docs/Web/HTTP/Status/307)
   - 종합
     - [Http 응답 상태코드 (Http Status Code)](https://sgoho01.tistory.com/8)
     - [HTTP 상태 코드](https://velog.io/@sangyeon217/http-status-code)
     - [REST API 관점에서 바라보는 HTTP 상태 코드(HTTP status code)](https://sanghaklee.tistory.com/61)
     - [이러쿵저러쿵 :: HTTP 서버 응답 코드 (Response Code) 정리](https://ooz.co.kr/260)
     - [서버의 상태를 알려주는 HTTP 상태 코드](https://evan-moon.github.io/2020/03/15/about-http-status-code/)

---

[2021-05-23]

 - [Spring/Java] UTF-8 Character Encoding Filter 설정
   - 두 가지 방법이 있다.
   - 하나는 JavaConfig 로 직접 인코딩 Filter Bean 을 등록, 다른 하나는 스프링 properties 에서 제공하는 속성으로 간편하게 설정(deprecated 됨)
   - [CharacterEncodingFilter In SpringBoot](https://www.baeldung.com/spring-boot-characterencodingfilter)
     - [tutorials/CharacterEncodingDemo.java at 950bbadc353bdca114befc98cf4a18476352220e · eugenp/tutorials · GitHub](https://github.com/eugenp/tutorials/blob/950bbadc353bdca114befc98cf4a18476352220e/spring-boot-modules/spring-boot-mvc-3/src/main/java/com/baeldung/charencoding/CharacterEncodingDemo.java)
   - [SpringBoot utf8 설정](https://handcoding.tistory.com/156)
   - [Spring boot 에서 Filter 사용하기 - 가리사니](https://gs.saro.me/dev?tn=503)
   - [spring boot filter추가](https://velog.io/@shson/spring-boot-filter%EC%B6%94%EA%B0%80)

---

[2021-05-23]
 
 - [Spring/Java] springfox 3.0 (swagger2)
   - [[Springboot] springfox-swagger 3.0.0 example](https://log-laboratory.tistory.com/347)
   - [Spring Boot](https://gaemi606.tistory.com/entry/Spring-Boot-Swagger2-%EC%82%AC%EC%9A%A9-springfox-boot-starter300)
   - [java-swagger-ui-3.0-사용하기 - Deliwind](https://blog2.deliwind.com/20201127/java-swagger-ui-3-0-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0/)

   
 - [Spring/Java] 특정 애노테이션 유무로 HandlerMethodArgumentResolver 적용
   - [[Spring] HandlerMethodArgumentResolver 사용하여 Custom Annotation 구현 및 테스트하기](https://sanghye.tistory.com/41)
   - [스프링 MVC 커스텀 HandlerMethodArgumentResolver 사용하기 :: 자바캔(Java Can Do IT)](https://javacan.tistory.com/entry/how-use-spring-mvc-custom-HandlerMethodArgumentResolver)
   
---

[2021-05-22]

 - [SPRING/JAVA] java file content type / apache tika
   - [Getting a File's Mime Type in Java](https://www.baeldung.com/java-file-mime-type#apache-tika)
   - [자바(Java)로 파일의 마임 타입(MIME Type) 확인하기](https://offbyone.tistory.com/330)
   - [@deveely :: Java에서 파일의 Mime type을 판별하는 방법](https://do-study.tistory.com/113) 


 - [SPRING/JAVA] apache tika
   - [[JAVA] Apache Tika 아파치 티카 :: Log](https://logging-panda.tistory.com/72)
   - [아파치 티카(apache tika) 로 컨텐츠 파싱하기](https://www.lesstif.com/java/apache-tika-61898782.html)
   - [Java 파일 읽는 방법, Apache Tika(아파치 티카) 사용하여 파일 읽기](https://kingname.tistory.com/214)

---

[2021-05-18]

 - [SPRING/JAVA] Spring MVC에서 IO 스트림을 처리하는 방법
   - 컨트롤러에서 스트림 처리 끝낸 뒤, 직접 close() 호출해서 닫지 말 것
   - 응답으로 나가기 전 닫으므로 `Stream closed.` 발생
   - 이것이 자동적으로 처리되는 기본 클래스는 ResourceHttpMessageConverter이며 응답 처리를 끝낸 뒤 기본 입력 스트림을 알아서 닫아줌.
   - [InputStream - How to handle IO streams in Spring MVC - Stack Overflow](https://stackoverflow.com/questions/48660011/how-to-handle-io-streams-in-spring-mvc/48660203#48660203)
   - [InputStream is closed in spring controller - Stack Overflow](https://stackoverflow.com/questions/58079500/inputstream-is-closed-in-spring-controller)

---

[2021-05-17]

 - [JAVA/SPRING] 이미지 리사이즈 & 크롭
   - Resize & Crop Image
   - [spring boot img crop resize - Google 검색](https://www.google.com/search?q=spring+boot+img+crop+resize&oq=spring+boot+img+crop+resize&aqs=chrome.0.69i59.575j0j7&sourceid=chrome&ie=UTF-8)
   - [How Can I Resize an Image Using Java?](https://www.baeldung.com/java-resize-image)
     - [Imgscalr](https://www.baeldung.com/java-resize-image#imgscalr)
   - BufferedImage 저장 
     - [buffered img save - Google 검색](https://www.google.com/search?q=buffered+img+save&oq=buffered+img+save&aqs=chrome..69i57j0i13l2j0i13i30j0i5i13i30j0i8i13i30l5.325j0j9&sourceid=chrome&ie=UTF-8)
     - [How to save a BufferedImage as a File - Stack Overflow](https://stackoverflow.com/questions/12674064/how-to-save-a-bufferedimage-as-a-file/12674109#12674109)
     - [Java로 썸네일(Thumbnail) 이미지 만들기](https://offbyone.tistory.com/114)
   - Java Code Examples for org.imgscalr.Scalr#resize()
     - [Scalr.resize save java - Google 검색](https://www.google.com/search?q=Scalr.resize+save+java&oq=Scalr.resize+save+java&aqs=chrome.0.69i59l3.342j0j9&sourceid=chrome&ie=UTF-8)
     - [org.imgscalr.Scalr#resize](https://www.programcreek.com/java-api-examples/?class=org.imgscalr.Scalr&method=resize)
   - FileOutPutStream 닫기
     - [FileOutPutStream 닫기 - Google 검색](https://www.google.com/search?q=FileOutPutStream+%EB%8B%AB%EA%B8%B0&oq=FileOutPutStream+%EB%8B%AB%EA%B8%B0&aqs=chrome..69i57j0i333l4.5720j1j7&sourceid=chrome&ie=UTF-8)
   
 - [SQL/MySQL] ORDER BY - 다중 정렬 조건
   - ORDER BY 를 여러개 사용할 경우 '왼쪽부터 순차적으로 정렬이 적용'되기 때문에 순서를 고려
   - [order by 2개 콤마 - Google 검색](https://www.google.com/search?q=order+by+2%EA%B0%9C+%EC%BD%A4%EB%A7%88&oq=order+by+2%EA%B0%9C+%EC%BD%A4%EB%A7%88&aqs=chrome.0.69i59.322j0j9&sourceid=chrome&ie=UTF-8)
   - [[SQL] 다중정렬 ORDER BY](https://dar0m.tistory.com/60)

---

[2021-05-16] 파생 요청 사항을 만족하는 기존 이미지가 있으면 이를 활용
파생 요청을 받았을 때 기존 이미지를 활용할 수 있다면, 패스

 - [JAVA] 이미지, 동영상 파일의 너비, 높이 얻기
   - [java get img file width - Google 검색](https://www.google.com/search?q=java+get+img+file+width&oq=java+get+img+file+width&aqs=chrome..69i57j33i160l2.4982j0j7&sourceid=chrome&ie=UTF-8)
   - [javax.imageio - How to get image height and width using java? - Stack Overflow](https://stackoverflow.com/questions/672916/how-to-get-image-height-and-width-using-java/9083914#9083914)
 
 - [MyBatis/XML] 마이바티스 비교연산자
   - 쿼리를 작성할 때, '<', '>', '&'를 사용해야 하는 경우가 생기는데 xml에서 그냥 사용할 경우 태그로 인식하는 경우가 나타난다. 이럴 경우 사용하는 것이 <! CDATA [...]]>이다.
   - 간단한 쿼리에 부등호가 필요하다면 '&lt;', '&gt;'로 처리하면 되지만, 부등호를 여러 개를 사용할 때는 <! CDATA [...]]>범위로 사용하는 방법이 간편하다.
   - **단, <!CDATA[...]]>를 사용하는 경우 동적(다이나믹) 쿼리를 사용할 수 없다는 점을 유의하자.**
   - [[MyBatis] 부등호, 비교연산자(<, >, <=, >=, &) 사용 방법](https://codingmomong.tistory.com/404)
   - [[Mybatis] 비교연산자 부등호 >,< 안될때 :: 기타치는 개발자의 야매 가이드](https://yamea-guide.tistory.com/entry/Mybatis-%EB%B9%84%EA%B5%90%EC%97%B0%EC%82%B0%EC%9E%90-%EB%B6%80%EB%93%B1%ED%98%B8-%EC%95%88%EB%90%A0%EB%95%8C)
   - 검색
     - [mybatis less than in xml](https://www.google.com/search?q=mybatis+less+than+in+xml&oq=mybatis+less+than+in+xml&aqs=chrome..69i57j33i160.427j0j7&sourceid=chrome&ie=UTF-8)
   - 참고
     - [[Back end] Mybatis &lt; &gt; CDATA](https://reference-m1.tistory.com/308)
     - [MyBatis mapper.xml 비교연산자 <=, >=, <, > 처리방법](https://sinpk.tistory.com/entry/mybatis-mapperxml-%EB%B9%84%EA%B5%90%EC%97%B0%EC%82%B0%EC%9E%90-%EC%B2%98%EB%A6%AC%EB%B0%A9%EB%B2%95)
     - [Mybatis SQL xml handles less than and greater than - Programmer Sought](https://www.programmersought.com/article/5786424700/)
     - [Mybatis special symbols (greater than, less than, not equal) and summary of commonly used functions - Programmer Sought](https://www.programmersought.com/article/22761484017/)
     - [What is the proper syntax for the Less Than/Equal operator in MyBatis 3? - Stack Overflow](https://stackoverflow.com/questions/32042726/what-is-the-proper-syntax-for-the-less-than-equal-operator-in-mybatis-3/32042753)
     - [Mybatis : "less than" issue in Select annotations - Stack Overflow](https://stackoverflow.com/questions/29092950/mybatis-less-than-issue-in-select-annotations)
     - [How to implement the greater than or equal SQL statement in iBatis? - Stack Overflow](https://stackoverflow.com/questions/2023408/how-to-implement-the-greater-than-or-equal-sql-statement-in-ibatis)
     - [112일차-MyBatis](https://chocotaste.tistory.com/112)
     - [MyBatis if test 안에서 integer 값 비교하기 : 네이버 블로그](https://m.blog.naver.com/PostView.nhn?blogId=admass&logNo=220548334257&proxyReferer=https:%2F%2Fwww.google.com%2F)
     - [MyBatis에서 자주하는 실수 : 작은따옴표.. : 네이버블로그](https://blog.naver.com/admass/220533442483)
---

[2021-05-14] 이미지 출처(originUrl)가 중복되는 요청은 원본파일 다운로드 생략 후 기존 이미지 활용

 - retrieve / get / fetch
  - [retrieve get fetch - Google 검색](https://www.google.com/search?q=retrieve+get+fetch&oq=retrieve+get+fetch&aqs=chrome..69i57j0i8i30j69i61.248j0j9&sourceid=chrome&ie=UTF-8)
  - [[개발자 영어] get, retreive, fetch 등 가져오는 동사들](https://ssomu.tistory.com/60)
  - [코딩에 많이 쓰이는 영어](https://tagilog.tistory.com/537)
  - [번외 — 개발자가 알아두면 좋은 영어 표현들 및 발음 실수들](https://medium.com/%EC%98%A4%EB%8A%98%EC%9D%98-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/%EB%B2%88%EC%99%B8-%EA%B0%9C%EB%B0%9C%EC%9E%90%EA%B0%80-%EC%95%8C%EC%95%84%EB%91%90%EB%A9%B4-%EC%A2%8B%EC%9D%80-%EC%98%81%EC%96%B4-%ED%91%9C%ED%98%84%EB%93%A4-%EB%B0%8F-%EB%B0%9C%EC%9D%8C-%EC%8B%A4%EC%88%98%EB%93%A4-db8f1b83d96e)
  


---

[2021-05-14] 클라이언트 캐시 기능 구현
 
 - HTTP/WEB
   - [HTTP caching - HTTP](https://developer.mozilla.org/ko/docs/Web/HTTP/Caching)
   - [Cache-Control - HTTP](https://developer.mozilla.org/ko/docs/Web/HTTP/Headers/Cache-Control)
     - [HTTP 완벽 가이드 (7) 캐시](https://velog.io/@akh9804/HTTP-%EC%99%84%EB%B2%BD-%EA%B0%80%EC%9D%B4%EB%93%9C-7-%EC%BA%90%EC%8B%9C)
     - [HTTP 완벽가이드 스터디 #7 Cache](https://brainbackdoor.tistory.com/129?category=711396)
     - [HTTP 완벽 가이드 요약본 : 7장 캐시](https://goodgid.github.io/HTTP-Summary-7/)
     - [7장 캐시](http://tlog.tammolo.com/blog/7-bbf51489-a113-40df-b64b-bea148785017/)
   - [Keep-Alive - HTTP](https://developer.mozilla.org/ko/docs/Web/HTTP/Headers/Keep-Alive)
     - [[Web]서버와의 연결을 계속? Keep Alive! :: Kamang's IT Blog](https://kamang-it.tistory.com/entry/Web%EC%84%9C%EB%B2%84%EC%99%80%EC%9D%98-%EC%97%B0%EA%B2%B0%EC%9D%84-%EA%B3%84%EC%86%8D-Keep-Alive)
     - [HTTP 와 TCP의 Keep-Alive](https://jw910911.tistory.com/35)
     - [HTTP 완벽가이드 스터디 #4 -d Keep-Alive](https://brainbackdoor.tistory.com/127)
 
 - HTTP 통신과 관련된 개념은 검색 시, "HTTP 완벽 가이드 + "알고 싶은 Keyword" 식으로 검색하면 필요한 내용만 고퀄리티로 빠르게 참고할 수 있다.
   - [HTTP 완벽가이드 Cache - Google 검색](https://www.google.com/search?q=HTTP+%EC%99%84%EB%B2%BD%EA%B0%80%EC%9D%B4%EB%93%9C+Cache&ei=FG-eYJezBpH30ASu2Y7ACA&oq=HTTP+%EC%99%84%EB%B2%BD%EA%B0%80%EC%9D%B4%EB%93%9C+Cache&gs_lcp=Cgdnd3Mtd2l6EAMyCAgAELADEM0CULUPWLUPYKUQaAJwAHgAgAFqiAFqkgEDMC4xmAEAoAEBqgEHZ3dzLXdpesgBAcABAQ&sclient=gws-wiz&ved=0ahUKEwiXjbKTmMnwAhWRO5QKHa6sA4gQ4dUDCA4&uact=5) 
   - [HTTP 완벽가이드 스터디 Cache - Google 검색](https://www.google.com/search?q=HTTP+%EC%99%84%EB%B2%BD%EA%B0%80%EC%9D%B4%EB%93%9C+%EC%8A%A4%ED%84%B0%EB%94%94+Cache&ei=DG-eYJqoHu-Lr7wP-4e18AM&oq=HTTP+%EC%99%84%EB%B2%BD%EA%B0%80%EC%9D%B4%EB%93%9C+%EC%8A%A4%ED%84%B0%EB%94%94+Cache&gs_lcp=Cgdnd3Mtd2l6EAMyBQgAEM0CSgUIExIBMVDZKVi6LWD0NWgCcAB4AIABdYgByAOSAQMwLjSYAQCgAQGqAQdnd3Mtd2l6wAEB&sclient=gws-wiz&ved=0ahUKEwia3uGPmMnwAhXvxYsBHftDDT4Q4dUDCA4&uact=5)

>Cache는 성능 향상을 위해 사용한다.
>
>웹 사이트를 개발하는 데에 있어서 적용할 수 있는 캐시에는
>브라우저 캐시와 서버단에서의 캐시가 있다. 
>
>**`브라우저 캐시`**
>
>이미 받아왔던 자원들은 캐시에 저장해둔다.
>일정 기간동안 같은 리소스 요청은 캐시에 있는 내용을 쓰게 됨으로써 서버와의 통신에 따른 비용을 줄일 수 있다.
>
>**`서버 캐시`**
>
>DB 조회 비용을 줄이기 위해 주로 사용한다.
>자주 변경되지 않는 데이터는 캐싱하여 DB 통신 비용을 줄일 수 있다.
>
>쇼핑몰을 예로 들면, 브라우저를 새로 로드할 때마다 상품 리스트를 보내줘야 하는 경우가 있을 것이다.
>만약 상품이 1억개가 있다면, 상품 리스트를 조회하는 것만으로도 비용이 어마어마 할 것이다.
>이럴 때 서버단에 캐시를 두어 일정 기간동안에 들어오는 요청에 한해서는 캐시에 있는 내용을 보내주는 것이다.
>그러면 DB 조회 비용을 줄일 수 있다.
>
>이렇게 성능을 개선하기 위해 적용하는 것이 캐시이고,
>Spring 에서는 경량의 빠른 캐시엔진인 Ehcache 을 비롯해 JCache, Redis, Ehcache 등 여러 캐시 종류가 있다.


 - 캐시 적용을 왜 해야 하는 거지? :  클라이언트 캐시와 서버 캐시
   - [(HTTP) 알아둬야 할 HTTP 쿠키 & 캐시 헤더 - ZeroCho Blog](https://www.zerocho.com/category/HTTP/post/5b594dd3c06fa2001b89feb9)
   - [[Spring] Ehcache 캐시 사용](https://hyeooona825.tistory.com/86)
   - [Cache](https://kkwonsy.tistory.com/16) : Ehcache, Memcached, Redis 비교
   
   
 - [ResponseEntity.ok() header cache-control - Google 검색](https://www.google.com/search?q=ResponseEntity.ok()+header+cache-control&oq=ResponseEntity.ok()+header+cache-control&aqs=chrome.0.69i59.335j0j9&sourceid=chrome&ie=UTF-8)
   - [Java + Spring Boot: I am trying to add CacheControl header to ResponseEntity - Stack Overflow](https://stackoverflow.com/questions/38131725/java-spring-boot-i-am-trying-to-add-cachecontrol-header-to-responseentity)
   - [java - Java + Spring Boot : CacheEntity 헤더를 ResponseEntity에 추가하려고합니다. - IT 툴 넷](https://pythonq.com/so/java/629440)
   - [Cache Headers in Spring MVC](https://www.baeldung.com/spring-mvc-cache-headers)
   - [logicbig :: Spring MVC - How to set 'Cache-Control' header?](https://www.logicbig.com/tutorials/spring-framework/spring-web-mvc/cache-control.html) : Spring MVC - Cache-Control support
   - [logicbig :: Spring MVC - CacheControl Examples](https://www.logicbig.com/how-to/code-snippets/jcode-spring-mvc-cachecontrol.html)
   - [Java Code Examples for org.springframework.http.CacheControl](https://www.programcreek.com/java-api-examples/?api=org.springframework.http.CacheControl)
   - [[Web on Reactive Stack] 1. 스프링 웹플럭스: 1.10. HTTP Caching](https://madplay.github.io/post/spring-webflux-references-http-caching)
   - [ResponseEntity, String to JSON :: 사월은 봄이다.](https://napsis.tistory.com/266)
   - [Spring Security - Cache Control Headers](https://www.baeldung.com/spring-security-cache-control-headers)
   - [ResponseEntity 캐싱 - Google 검색](https://www.google.com/search?q=ResponseEntity+%EC%BA%90%EC%8B%B1&oq=ResponseEntity+%EC%BA%90%EC%8B%B1&aqs=chrome..69i57j0l5j69i60l2.1041j0j9&sourceid=chrome&ie=UTF-8)

---

[2021-05-13]  요청 URL 정보를 관리해 신규 URL일 경우만 파일 저장 / originUrl 칼럼을 일반 인덱스로 변경
   
 - MySQL
   - MySQL 8 Invisible/Visible Index
     - [mysql8 VISIBLE - Google 검색](https://www.google.com/search?q=mysql8+VISIBLE&oq=mysql8+VISIBLE&aqs=chrome..69i57j0i13l7j0i13i30l2.1798j1j7&sourceid=chrome&ie=UTF-8)
     - [MySQL 8.0 - Invisible Index](http://minsql.com/mysql8/B-3-A-invisibleIndex/)
     - [[이렇게 사용하세요!] MySQL 8.0, 개발자를 위한 신규 기능 살펴보기! #3 Indexes](https://medium.com/naver-cloud-platform/%EC%9D%B4%EB%A0%87%EA%B2%8C-%EC%82%AC%EC%9A%A9%ED%95%98%EC%84%B8%EC%9A%94-mysql-8-0-%EA%B0%9C%EB%B0%9C%EC%9E%90%EB%A5%BC-%EC%9C%84%ED%95%9C-%EC%8B%A0%EA%B7%9C-%EA%B8%B0%EB%8A%A5-%EC%82%B4%ED%8E%B4%EB%B3%B4%EA%B8%B0-3-indexes-e32249e2dae5)
     - [MySQL 8.0 새기능 : 네이버 블로그](https://m.blog.naver.com/PostView.nhn?blogId=theswice&logNo=221321015924&proxyReferer=https:%2F%2Fwww.google.com%2F)
   - [Integer display width is deprecated and will be removed in a future release. - Google 검색](https://www.google.com/search?q=Integer+display+width+is+deprecated+and+will+be+removed+in+a+future+release.&oq=Integer+display+width+is+deprecated+and+will+be+removed+in+a+future+release.&aqs=chrome.0.69i59j0i30l2j0i5i30l3.463j0j7&sourceid=chrome&ie=UTF-8)
     - [MYSQL - Warning: #1681 Integer display width is deprecated - Stack Overflow](https://stackoverflow.com/questions/58938358/mysql-warning-1681-integer-display-width-is-deprecated)
     - [코드루덴스 :: MySQL DB 복원시 경고 메시지 해결 방법](https://blog.codens.info/1879)
     - [[MySQL] 03. Table, 테이블 구조 및 생성 :: IT개발이야기](https://devkevin0408.tistory.com/11)
   - [MySQL 테이블명 대소문자 구분 - Google 검색](https://www.google.com/search?q=sql+%ED%85%8C%EC%9D%B4%EB%B8%94%EB%AA%85+%EB%8C%80%EC%86%8C%EB%AC%B8%EC%9E%90+%EA%B5%AC%EB%B6%84&oq=sql+%ED%85%8C%EC%9D%B4%EB%B8%94%EB%AA%85+%EB%8C%80%EC%86%8C%EB%AC%B8%EC%9E%90+%EA%B5%AC%EB%B6%84&aqs=chrome..69i57j0i333l4j69i60.408j0j9&sourceid=chrome&ie=UTF-8)
     - [Happy Resource :: MySQL 테이블명 대소문자 구분](https://bizadmin.tistory.com/entry/MySQL-%ED%85%8C%EC%9D%B4%EB%B8%94%EB%AA%85-%EB%8C%80%EC%86%8C%EB%AC%B8%EC%9E%90-%EA%B5%AC%EB%B6%84)
     - [Happy Resource :: MySQL 테이블 이름 lower_case_table_names 대소문자 변경](https://bizadmin.tistory.com/entry/mysql-%ED%85%8C%EC%9D%B4%EB%B8%94-%EC%9D%B4%EB%A6%84-%EB%8C%80%EC%86%8C%EB%AC%B8%EC%9E%90-%EB%B3%80%EA%B2%BD)
     - [MySQL 대소문자 구분 안하기 - lower_case_table_names 변경 :: 야근싫어하는 개발자](https://roqkffhwk.tistory.com/91)
     - [MySQL 테이블 및 데이타베이스 이름 대소문자 구분 설정](https://www.lesstif.com/dbms/mysql-14745775.html)
     - [DB명 Table명 대소문자 구분 처리하기 (대소문자 구분 OS에서만 가능)](https://blog.edit.kr/entry/DB%EB%AA%85-Table%EB%AA%85-%EB%8C%80%EC%86%8C%EB%AC%B8%EC%9E%90-%EA%B5%AC%EB%B6%84-%EC%B2%98%EB%A6%AC%ED%95%98%EA%B8%B0-%EB%8C%80%EC%86%8C%EB%AC%B8%EC%9E%90-%EA%B5%AC%EB%B6%84-OS%EC%97%90%EC%84%9C%EB%A7%8C-%EA%B0%80%EB%8A%A5)


 - [java request current url - Google 검색](https://www.google.com/search?q=java+request+current+url&oq=java+request+current+url&aqs=chrome..69i57j0i8i30l7.4756j0j7&sourceid=chrome&ie=UTF-8)
   - **[Get full URL and query string in Servlet for both HTTP and HTTPS requests - Stack Overflow](https://stackoverflow.com/questions/16675191/get-full-url-and-query-string-in-servlet-for-both-http-and-https-requests)**
   - [How to get the full url from HttpServletRequest? - Stack Overflow](https://stackoverflow.com/questions/23692914/how-to-get-the-full-url-from-httpservletrequest)
   - [HttpServletRequest to complete URL - Stack Overflow](https://stackoverflow.com/questions/2222238/httpservletrequest-to-complete-url)
   - [How to get Request URL in Spring Boot - Stack Overflow](https://stackoverflow.com/questions/52842979/how-to-get-request-url-in-spring-boot)
   - [Get Root/Base Url In Spring MVC - Stack Overflow](https://stackoverflow.com/questions/5012525/get-root-base-url-in-spring-mvc)
   - [What's the best way to get the current URL in Spring MVC? - Stack Overflow](https://stackoverflow.com/questions/1490821/whats-the-best-way-to-get-the-current-url-in-spring-mvc)
   - [[JAVA] java 에서 현재 URL 가져오기](https://heung-9.tistory.com/3)
   - [[java] 현재 페이지의 url 주소 가져오기](https://dlevelb.tistory.com/576)
   - [HttpServletRequest 함수를 사용한 요청 URL 취득](https://hihoyeho.tistory.com/entry/HttpServletRequest-%ED%95%A8%EC%88%98%EB%A5%BC-%EC%82%AC%EC%9A%A9%ED%95%9C-%EC%9A%94%EC%B2%AD-URL-%EC%B7%A8%EB%93%9D)
   - [Spring에서 호출 URL 찾는 방법](https://jang8584.tistory.com/86)
   - [Spring MVC request URL 가져오기](https://dogcowking.tistory.com/83)
   - [[Spring/JAVA] 사용자 IP, 접속자IP, 클라이언트IP 주소 가져오기](https://bbo-blog.tistory.com/17)
   - [Spring 전체 URL 가져오기](https://hailey0.tistory.com/24)
   
     
     
---

[2021-05-13] 파일 다운로드 시, 고유한 파일명을 부여해 덮어쓰기 방지
- 파일 다운로드 시, 파일명 중복으로 기존 파일이 덮어쓰기 되지 않도록 처리

> 파일 저장 시, UUID를 통한 고유하고 랜덤한 파일명을 부여해, 기존 파일이 덮어쓰기 되는 경우를 방지한다.

- [자바 파일이름 중복 방지](https://www.google.com/search?q=%EC%9E%90%EB%B0%94+%ED%8C%8C%EC%9D%BC%EC%9D%B4%EB%A6%84+%EC%A4%91%EB%B3%B5+%EB%B0%A9%EC%A7%80+%ED%8C%A8%ED%84%B4&oq=%EC%9E%90%EB%B0%94+%ED%8C%8C%EC%9D%BC%EC%9D%B4%EB%A6%84+%EC%A4%91%EB%B3%B5+%EB%B0%A9%EC%A7%80+%ED%8C%A8%ED%84%B4&aqs=chrome.0.69i59j0i333.689j0j9&sourceid=chrome&ie=UTF-8)
  - [Java.util.UUID Class - Tutorialspoint](https://www.tutorialspoint.com/java/util/java_util_uuid.htm)
  - [UUID로 파일 이름 중복 방지하기](https://enai.tistory.com/38)
  - [Kakao DB Team: MySQL 서버에서 UUID 활용](https://small-dbtalk.blogspot.com/2014/12/)
  - [UUID.fromString 예제](https://www.google.com/search?q=UUID.fromString+%EC%98%88%EC%A0%9C&oq=UUID.fromString+%EC%98%88%EC%A0%9C&aqs=chrome..69i57j0i333l3.3432j0j7&sourceid=chrome&ie=UTF-8)
  - [Java에서 UUID 클래스를 사용하여 유일한 식별자 생성하기](https://offbyone.tistory.com/303)
  - [Java에서 GUID 만들기](https://www.delftstack.com/ko/howto/java/create-a-guid-in-java/)


> 파일 I/O 관련된 다양한 연습 : Using Java IO / Java NIO / Library

- java.nio.file.Files 내 유틸 메서드 활용 익숙해지기
  - [DoDo's BLOG :: Files](https://dodocap.tistory.com/entry/Files)
  

- [java delete file - Google 검색](https://www.google.com/search?q=java+delete+file&oq=java+delete+file&aqs=chrome..69i57j69i59l2j0l3j69i60l2.318j0j9&sourceid=chrome&ie=UTF-8)
  - [Delete a file using Java - GeeksforGeeks](https://www.geeksforgeeks.org/delete-file-using-java/)
  - [How to Delete a File in Java - Javatpoint](https://www.javatpoint.com/how-to-delete-a-file-in-java)
  
 
- [java file get size - Google 검색](https://www.google.com/search?q=java+file+get+size&oq=java+file+get+size&aqs=chrome.0.0l7j69i60.6626j1j7&sourceid=chrome&ie=UTF-8)
  - [Java File 사이즈 (파일크기,용량)](https://leewon.tistory.com/132)


- [java file move - Google 검색](https://www.google.com/search?q=java+file+move&oq=java+file+move&aqs=chrome..69i57j0l5j0i30l4.3623j0j7&sourceid=chrome&ie=UTF-8)
- [java file 이동 - Google 검색](https://www.google.com/search?q=java+file+%EC%9D%B4%EB%8F%99&oq=java+file+%EC%9D%B4%EB%8F%99&aqs=chrome..69i57j0l2j69i60j69i65l2j69i61j69i60.3201j1j7&sourceid=chrome&ie=UTF-8)
  - [Rename or Move a File in Java](https://www.baeldung.com/java-how-to-rename-or-move-a-file)
  - [java, 파일 rename, move 하는법](https://pandorica.tistory.com/38)
  - [(Java) 파일(File) 이동(Move) 기능 구현방법](https://jinseongsoft.tistory.com/20)
  - [Java - 파일 rename, move 하는 방법](https://codechacha.com/ko/java-rename-or-move-file/)


- [java file copy - Google 검색](https://www.google.com/search?q=java+file+copy&oq=java+file+copy&aqs=chrome..69i57j0l9.9801j1j9&sourceid=chrome&ie=UTF-8)
  - [How to Copy a File with Java](https://www.baeldung.com/java-copy-file)
  - [Creator Developer :: 자바 IO&NIO 파일복사 (FileCopy) 방법](https://creatordev.tistory.com/72)
  - [Java NIO (Files & Path) 로 파일 복사하기 · 슷호브 New 훌로구](https://stove99.github.io/java/2019/08/16/java-nio-file-copy/)


- [get directory directly above from File java - Google 검색](https://www.google.com/search?q=get+Directory+directly+above+from+File+java&oq=get+Directory+directly+above+from+File+java&aqs=chrome..69i57j69i64.6832j1j9&sourceid=chrome&ie=UTF-8)
  - [How to get just the parent directory name of a specific file - Stack Overflow](https://stackoverflow.com/questions/8197049/how-to-get-just-the-parent-directory-name-of-a-specific-file)
  - [Java Examples - Parent Directory - Tutorialspoint](https://www.tutorialspoint.com/javaexamples/dir_parent.htm)
  
  
---

[2021-05-12] 쿼리 스트링으로 넘어온 URL의 파일 다운로드

- 자바 HTTP 파일 다운로드
  - [java http file download - Google 검색](https://www.google.com/search?q=java+http+file+download&oq=java+http+file+download&aqs=chrome..69i57j0i8i30l4j69i60j69i65j69i60.3848j0j9&sourceid=chrome&ie=UTF-8)
  - [자바 http download](https://www.google.com/search?q=%EC%9E%90%EB%B0%94+http+download&sxsrf=ALeKk03pY7g6UQB6eWECY5eZLDB1XuaN4Q%3A1620796295778&ei=h2ObYO6JL4eS0gTp47G4DQ&oq=%EC%9E%90%EB%B0%94+http+download&gs_lcp=Cgdnd3Mtd2l6EAMyBQgAEM0CMgUIABDNAjoHCAAQsAMQHjoJCAAQsAMQCBAeOgQIIxAnOgYIABAHEB46BAgAEB5QikxYh1Ng-FRoAnAAeACAAZEBiAHbBZIBAzAuNpgBAKABAaoBB2d3cy13aXrIAQbAAQE&sclient=gws-wiz&ved=0ahUKEwiu6dnbsMPwAhUHiZQKHelxDNcQ4dUDCA4&uact=5)
  - **[Download a File From an URL in Java](https://www.baeldung.com/java-download-file)**
    - Downloader for use 구현 시 Using Java NIO 참고함
    - Downloader v1 구현 시 Using Java IO 참고함
    - [tutorials/FileDownload.java at 950bbadc353bdca114befc98cf4a18476352220e · eugenp/tutorials](https://github.com/eugenp/tutorials/blob/950bbadc353bdca114befc98cf4a18476352220e/core-java-modules/core-java-networking-2/src/main/java/com/baeldung/download/FileDownload.java)
    - [tutorials/FileDownloadIntegrationTest.java at 950bbadc353bdca114befc98cf4a18476352220e · eugenp/tutorials](https://github.com/eugenp/tutorials/blob/950bbadc353bdca114befc98cf4a18476352220e/core-java-modules/core-java-networking-2/src/test/java/com/baeldung/download/FileDownloadIntegrationTest.java#L41)
  - Downloader v2 구현 시 참고함
    - [[Java] URL로 부터 File Download 하는 방법](https://jinseongsoft.tistory.com/322)
    - [[Java] 자바 HttpUrlConnection 을 이용하여 파일 다운받기](https://velog.io/@hellonewtry/Java-%EC%9E%90%EB%B0%94-HttpUrlConnection-%EC%9D%84-%EC%9D%B4%EC%9A%A9%ED%95%98%EC%97%AC-%ED%8C%8C%EC%9D%BC-%EB%8B%A4%EC%9A%B4%EB%B0%9B%EA%B8%B0)
    - [개발자의 하루 :: 자바 (Java) HTTP 파일 (File) 다운로드 (Download) 예제 (Example)](https://devday.tistory.com/entry/%EC%9E%90%EB%B0%94-Java-HTTP-%ED%8C%8C%EC%9D%BC-File-%EB%8B%A4%EC%9A%B4%EB%A1%9C%EB%93%9C-Download-%EC%98%88%EC%A0%9C-Example)
  

- Query String 추출
  - [query string parameter](https://www.google.com/search?q=query+string+parameter&oq=query+string+parameter&aqs=chrome.0.0l4.3246j1j7&sourceid=chrome&ie=UTF-8)
  - [올바른 URL 설계 : 1) Query string과 Path Variable 이해하기](https://velog.io/@jcinsh/Query-string-path-variable)
  - [Query String 쿼리스트링이란?](https://velog.io/@pear/Query-String-%EC%BF%BC%EB%A6%AC%EC%8A%A4%ED%8A%B8%EB%A7%81%EC%9D%B4%EB%9E%80)
  - [배우고 나누고 즐기며... :: 쿼리스트링(Query String)](https://ysoh.tistory.com/entry/Query-String)


- [get filename from path java - Google 검색](https://www.google.com/search?q=java+get+file+name+from+path&oq=java+get+file+name+from+path&aqs=chrome..69i57j0i30l2j0i8i30l6j0i5i30.5844j1j7&sourceid=chrome&ie=UTF-8)
  - [How do I get the file name from a String containing the Absolute file path? - Stack Overflow](https://stackoverflow.com/questions/14526260/how-do-i-get-the-file-name-from-a-string-containing-the-absolute-file-path/14526362#14526362)
- [get filename from url java - Google 검색](https://www.google.com/search?q=get+filename+from+url+java&oq=get+filename+from+url+java&aqs=chrome..69i57j0l9.3311j0j7&sourceid=chrome&ie=UTF-8)
  - [Get file name from URL - Stack Overflow](https://stackoverflow.com/questions/605696/get-file-name-from-url/33871029#33871029)


- java replace dot
  - [Java String split 또는 replace 할 때 .(Dot, 점) 안되는 현상](https://marobiana.tistory.com/137)
  - [ReplaceAll에서 dot(.) 사용하기](https://ohgyun.com/4)
  - java.util.regex.PatternSyntaxException: Dangling meta character '?' near index 0
  - [[JAVA] java.util.regex.PatternSyntaxException: Dangling meta character :: 나만의 기록들](https://mine-it-record.tistory.com/309)
  - [replace / replaceFirst, Caused by: java.util.regex.PatternSyntaxException: Dangling meta character '?' near index 0](https://acet.tistory.com/291)
  - [자바 문자열 오류 - java.util.regex.PatternSyntaxException: Dangling meta character 해결](https://blog.naver.com/qbxlvnf11/221170503490)
  - ["?" Dangling metacharacter - Google 검색](https://www.google.com/search?q=%22%3F%22+Dangling+metacharacter&oq=%22%3F%22+Dangling+metacharacter&aqs=chrome..69i57.9224j0j7&sourceid=chrome&ie=UTF-8)
  

- Lorem Picsum
  - 랜덤한 이미지 URL 얻고 싶을 경우 'lorem img' 키워드로 검색
  - [Lorem Picsum](https://picsum.photos/)
  - [사용하기 쉽고 세련된 자리 표시자 로렘 픽숨(Lorem Picsum)](http://websrepublic.co.kr/news/355)
  - [LoremFlickr: free placeholder images](https://loremflickr.com/)
  - 보통 화면 디자인 시 placeholder images 로 이용하곤 한다.
  

- Executing Code on Spring Boot Application Startup
  - [Executing Code on Spring Boot Application Startup](https://reflectoring.io/spring-boot-execute-on-startup/)
  - [스프링 부트 애플리케이션이 구동될 때 코드를 실행하는 방법](https://madplay.github.io/post/run-code-on-application-startup-in-springboot)
  - [애플리케이션 시작시 실행되는 프로그램 설정](https://velog.io/@borab/Spring-boot-%EA%B0%9C%EB%85%90-%EC%A0%95%EB%A6%AC-1#%EC%95%A0%ED%94%8C%EB%A6%AC%EC%BC%80%EC%9D%B4%EC%85%98-%EC%8B%9C%EC%9E%91%EC%8B%9C-%EC%8B%A4%ED%96%89%EB%90%98%EB%8A%94-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%A8-%EC%84%A4%EC%A0%95)
    - [ApplicationEvent and Listeners](https://velog.io/@borab/Spring-boot-%EA%B0%9C%EB%85%90-%EC%A0%95%EB%A6%AC-1#applicationevent-and-listeners)
  - [토비의 스프링 부트 1 - 스프링 부트 앱에 초기화 코드를 넣는 방법 3가지 - YouTube](https://www.youtube.com/watch?v=f017PD5BIEc)
  - [Running code after Spring Boot starts - Stack Overflow](https://stackoverflow.com/questions/27405713/running-code-after-spring-boot-starts/44923402#44923402)
  - [Guide To Running Logic on Startup in Spring](https://www.baeldung.com/running-setup-logic-on-startup-in-spring)
  - [ApplicationReadyEvent - Google 검색](https://www.google.com/search?q=ApplicationReadyEvent+%EB%B0%B1%EA%B8%B0%EC%84%A0&oq=ApplicationReadyEvent+%EB%B0%B1%EA%B8%B0%EC%84%A0&aqs=chrome..69i57j0l5j0i30l4.2350j0j7&sourceid=chrome&ie=UTF-8)
  - [spring boot on start event - Google 검색](https://www.google.com/search?q=spring+boot+on+start+event&oq=spring+boot+on+start+event&aqs=chrome..69i57j0i8i30j69i60.3391j0j9&sourceid=chrome&ie=UTF-8)
  - [spring boot application ready - Google 검색](https://www.google.com/search?q=spring+boot+application+ready&oq=spring+boot+application+ready&aqs=chrome..69i57j0i19j0i19i30l2j0i8i19i30l2.3600j0j9&sourceid=chrome&ie=UTF-8)
  - [spring boot startup method - Google 검색](https://www.google.com/search?q=spring+boot+startup+method&oq=spring+boot+startup+method&aqs=chrome.0.69i59j0i8i30.312j0j9&sourceid=chrome&ie=UTF-8)


- [Spring @Order 로 Bean 순서 정의하기](https://unhosted.tistory.com/79) 
  

- OS에 따른 Java Directory Separator 처리
  - [java directory separator - Google 검색](https://www.google.com/search?q=java+directory+separator&oq=java+directory+separator&aqs=chrome..69i57.199j0j9&sourceid=chrome&ie=UTF-8)
  - [File.separator 와 File.pathSeparator의 차이는 뭔가요?](https://hashcode.co.kr/questions/570/fileseparator-%EC%99%80-filepathseparator%EC%9D%98-%EC%B0%A8%EC%9D%B4%EB%8A%94-%EB%AD%94%EA%B0%80%EC%9A%94)
  - [File.separatorChar 와 File.separator 차이점 - Google 검색](https://www.google.com/search?q=separatorChar+separator+%EC%B0%A8%EC%9D%B4%EC%A0%90&oq=separatorChar+separator+%EC%B0%A8%EC%9D%B4%EC%A0%90&aqs=chrome..69i57j0i333l2.10412j0j7&sourceid=chrome&ie=UTF-8)
  - [File.separator, File.separatorChar 차이점](https://blog.naver.com/anjdieheocp/20117162010)
  - [파일구분자(File.separator)를 대체하는 Path, Paths 사용하기 :: 허니몬(Honeymon)의 자바guru](https://java.ihoney.pe.kr/342)
  

- Java IO Exception Handling, 자원 해제 close 와 예외처리 (Exception Handling)
  - [Java에서의 Close (feat. Connection, Statement, ResultSet) :: 소림사의 홍반장!](https://androphil.tistory.com/763)
  - [Java - Try-with-resources로 자원 쉽게 해제하기](https://codechacha.com/ko/java-try-with-resources/)
  - [Chapter 8 예외처리(Exception Handling)](https://rebeccacho.gitbooks.io/java-study-group/content/chapter8.html)
  - [자바 8 람다에서 checked exception을 어떻게 구현하면 좋을까? :: SLiPP](https://www.slipp.net/questions/572)
  - [[Java] try catch finally](https://shxrecord.tistory.com/59)
  - [Java 예외(Exception) 처리에 대한 작은 생각](https://www.nextree.co.kr/p3239/)
  - [Java Exception Handle in Stream Operations](https://kihoonkim.github.io/2017/09/09/java/noexception-in-stream-operations/)
  - [Today I Learned. @cheers_hena 치얼스헤나 :: [JAVA] Try-Catch문이란? 예외처리하기/예외던지기](https://cheershennah.tistory.com/147)
  - [코끼리를 냉장고에 넣는 방법 :: [JAVA] 자바 향상된 예외 처리 - try - with - resources 문](https://dololak.tistory.com/67)
  - [자바7에서 마음에 드는 다섯 가지 :: 자바캔(Java Can Do IT)](https://javacan.tistory.com/entry/my-interesting-java7-five-features)
  - [java io exception handling - Google 검색](https://www.google.com/search?q=java+io+exception+handling&oq=java+io+exception+handling&aqs=chrome..69i57j0i8i30j69i60.5203j0j7&sourceid=chrome&ie=UTF-8)
  - [try catch finally 생략 - Google 검색](https://www.google.com/search?q=try+catch+finally+%EC%83%9D%EB%9E%B5&oq=try+catch+finally+%EC%83%9D%EB%9E%B5&aqs=chrome..69i57j0i333l5.8848j1j7&sourceid=chrome&ie=UTF-8)
  - [java try catch finally resource - Google 검색](https://www.google.com/search?q=java+try+catch+finally+resource&oq=java+try+catch+finally+resource&aqs=chrome..69i57j0i8i30l2.250j0j9&sourceid=chrome&ie=UTF-8)