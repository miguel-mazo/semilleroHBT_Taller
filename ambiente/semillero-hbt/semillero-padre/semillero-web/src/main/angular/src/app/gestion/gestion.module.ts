import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CapaComponent } from './capa/capa.component';
import { EncabezadoComponent } from './capa/encabezado/encabezado.component';
import { CuerpoComponent } from './capa/cuerpo/cuerpo.component';
import { ConsultaService } from '../servicios/consultas-servicio/consulta.service';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { PrincipalComponent } from './capa/principal/principal.component';

@NgModule({
  declarations: [CapaComponent, EncabezadoComponent, CuerpoComponent, PrincipalComponent],
  imports: [
    CommonModule, RouterModule, FormsModule
  ],
  exports: [
  	CapaComponent
  ],
  providers: [
    ConsultaService
  ]
})
export class GestionModule { }
