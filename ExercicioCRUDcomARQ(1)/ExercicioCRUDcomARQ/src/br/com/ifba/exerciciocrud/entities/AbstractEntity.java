package br.com.ifba.exerciciocrud.entities;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Lucas Bastos
 */
@MappedSuperclass
public class AbstractEntity implements Serializable {
    
    // Atributos
    
    @Id
    @GeneratedValue
    private Long id;
    
    
    // Métodos acessores

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
