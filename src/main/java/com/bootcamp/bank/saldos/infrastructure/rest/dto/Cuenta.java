package com.bootcamp.bank.saldos.infrastructure.rest.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Cuenta {
    @Id
    private String  id;
    private String  idCliente;
    private String  numeroCuenta;
    private String  fechaCreacion;
    private String  estado;
    private String  tipoCuenta; // AHO: ahorro  , CTE : cuenta corriente , PZF: plazo fijo
    private Boolean flgComisionMantenimiento;
    private Boolean flgLimiteMovMensual;
    private Integer numMaximoMovimientos;
    private Double saldo;
    private Double abonos;
    private Double cargos;

}
