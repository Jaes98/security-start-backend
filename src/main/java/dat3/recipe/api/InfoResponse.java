package dat3.recipe.api;

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
