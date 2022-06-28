package net.javaguides.springboot.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "payments")
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String cardName;
    private String cardNumber;
    private String expiryYear;
    private String expiryMonth;
    private String cvc;
    private Long orderId;

}
