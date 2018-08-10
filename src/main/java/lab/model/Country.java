package lab.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    @Default
    int id = 1;

    String name;

    String codeName;

    public Country(String name, String codeName) {
        this.name = name;
        this.codeName = codeName;
    }
}
