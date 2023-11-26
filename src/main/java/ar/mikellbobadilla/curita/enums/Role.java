package ar.mikellbobadilla.curita.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Role {
    ROLE_OWNER("Propietario"),
    ROLE_ADMIN("Administrador"),
    ROLE_SELLER("Vendedor");
    private final String roleName;


}
