package com.github.dev_tsampaio.projetowebservices.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_payment")
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;

    @OneToOne
    @MapsId
    private Order order;
}
