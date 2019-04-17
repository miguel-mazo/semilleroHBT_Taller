import { Component, OnInit } from '@angular/core';
import { BebidaDTO } from '../modelo/BebidaDTO';
import { ConsultaService } from '../../../servicios/consultas-servicio/consulta.service';
import { PlatoDTO } from '../modelo/PlatoDTO';
import { FacturaDetalleIngresoDTO } from '../modelo/FacturaDetalleIngresoDTO';

@Component({
  selector: 'app-encabezado',
  templateUrl: './encabezado.component.html'
})
export class EncabezadoComponent implements OnInit {
  
  public bebidas: BebidaDTO[];
  public bebidaId: number;

  public platos: PlatoDTO[];
  public platoId: number;
  
  public facturaDetalle: FacturaDetalleIngresoDTO;

  constructor(private consultaService : ConsultaService) { }

  ngOnInit() {

  }

  public consultarBebidas(){
    this.consultaService.consultarBebidas().subscribe(
      result => {
        this.bebidas = result;
      },error => {
        console.log(error);
      }
    );
  }

  public consultarPlatos(){
    this.consultaService.consultarPlatos().subscribe(
      result => {
        this.platos = result;
      },error => {
        console.log(error);
      }
    );
  }

  public Registrar(){
    this.consultaService.crearFactura(this.facturaDetalle).subscribe(
      
    )
  }

}
