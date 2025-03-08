package ir.stdev.attact.gatewayserver;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Configuration
public class TrackingCodeFilter implements GatewayFilter {

    private static final String TRACKING_HEADER = "X-Tracking-Id";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String trackingCode = UUID.randomUUID().toString();

        ServerWebExchange mutateExchange = exchange.mutate()
                .request(exchange.getRequest().mutate()
                        .header(TRACKING_HEADER, trackingCode)
                        .build())
                .build();
        return chain.filter(mutateExchange);
    }


}
