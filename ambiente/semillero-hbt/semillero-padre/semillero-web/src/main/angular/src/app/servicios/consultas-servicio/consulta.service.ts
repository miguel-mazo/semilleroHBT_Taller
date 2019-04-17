import { Injectable, Injector } from '@angular/core';
import { AbstractService } from '../template.service';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { BebidaDTO } from 'src/app/gestion/capa/modelo/BebidaDTO';
import { PlatoDTO } from 'src/app/gestion/capa/modelo/PlatoDTO';
import { FacturaDetalleIngresoDTO } from 'src/app/gestion/capa/modelo/FacturaDetalleIngresoDTO';

@Injectable({
    providedIn: 'root'
  })
  export class ConsultaService extends AbstractService {
          
    /**
     * Constructor
     */
    constructor(injector: Injector) {
      super(injector);
    }

    public consultarBebidas(): Observable<BebidaDTO[]>{
      return this.get<BebidaDTO[]>("/semillero-servicios", "/ConsultasRest/consultarBebidas");
    }

    public consultarPlatos() : Observable<PlatoDTO[]>{
      return this.get<PlatoDTO[]>("/semillero-servicios", "/ConsultasRest/consultarPlatos");
    }

    public crearFactura(facturaDetalle: FacturaDetalleIngresoDTO) : Observable<string>{
      return this.post<string>("/semillero-servicios", "/ConsultasRest/crearFactura",
        {
            "facturaDetalle" : facturaDetalle
        });
    }


  }