package api.springsecurity.customerservice.payload;

import lombok.Builder;

@Builder
public record LoginRequest(String phone, String email, String password) {
}
