//package com.springbootmicroservices.apigateway.filter;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//
//import java.util.List;
//
//@Component
//public class FilterUtils {
//  //  tạo ra một lớp tiện ích để dễ dàng truy cập và làm việc với các thông tin quan trọng trong headers của các request và response.
//    public static final String CORRELATION_ID = "correlation-id";
//    public static final String AUTH_TOKEN     = "Authentication";
//
//    public String getCorrelationId(HttpHeaders requestHeaders){
//        if (requestHeaders.get(CORRELATION_ID) !=null) {
//            List<String> header = requestHeaders.get(CORRELATION_ID);
//            return header.stream().findFirst().get();
//        }
//        else{
//            return null;
//        }
//    }
//
//    public String getAuthToken(HttpHeaders requestHeaders){
//        if (requestHeaders.get(AUTH_TOKEN) !=null) {
//            List<String> header = requestHeaders.get(AUTH_TOKEN);
//            return header.stream().findFirst().get();
//        }
//        else{
//            return null;
//        }
//    }
//
//
//    public ServerWebExchange setRequestHeader(ServerWebExchange exchange, String name, String value) {
//        return exchange.mutate().request(
//                exchange.getRequest().mutate()
//                        .header(name, value)
//                        .build())
//                .build();
//    }
//
//    public ServerWebExchange setCorrelationId(ServerWebExchange exchange, String correlationId) {
//        return this.setRequestHeader(exchange, CORRELATION_ID, correlationId);
//    }
//}
