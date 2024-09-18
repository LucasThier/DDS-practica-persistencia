package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity @DiscriminatorValue("productoSimple")
public class ProductoSimple extends Producto{

  @Column(name = "precio")
  private Double precio;

  @Column(name = "stock")
  private Integer stock;

  public Double precio() {
    return this.precio;
  }

  public Integer stock() {
    return this.stock;
  }

  public ProductoSimple() {

  }

}
