package com.addname.demo.modelo;



import javax.persistence.*;


@Entity
@Table(name = "nombres")
public class Nombre {
    public Nombre() {
    }


    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private  Long id;

    @Column(name ="nombre" ,length = 60,nullable = false)
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}

