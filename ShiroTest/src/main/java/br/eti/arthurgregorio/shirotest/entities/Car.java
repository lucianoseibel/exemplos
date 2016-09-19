package br.eti.arthurgregorio.shirotest.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Arthur Gregorio
 *
 * @version 1.0.0
 * @since 1.0.0, 12/07/2015
 */
@Entity
@ToString
@EqualsAndHashCode
@Table(name = "carro")
public class Car implements Serializable {

    @Id
    @Getter
    @Setter
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    @Column(name = "plate")
    private String plate;
    
    @Getter
    @Setter
    @ManyToOne(optional = false)
    @JoinColumn(name = "owner_id")
    private Owner owner;
}