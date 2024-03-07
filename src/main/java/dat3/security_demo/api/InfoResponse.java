package dat3.security_demo.api;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
class InfoResponse {
    String info;

    public InfoResponse(String info) {
        this.info = info;
    }
}
