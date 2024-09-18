package ar.edu.utn.frba.dds.ejercicio_03;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public abstract class Decorado extends Producto {

  @ManyToOne
  @JoinColumn(name = "productoDecorado_id", referencedColumnName = "id")
  protected Producto producto;

  public Double precio()
  {
    return this.producto.precio();
  }
}
