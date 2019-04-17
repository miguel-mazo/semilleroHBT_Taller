import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EncabezadoComponent } from './gestion/capa/encabezado/encabezado.component';
import { CuerpoComponent } from './gestion/capa/cuerpo/cuerpo.component';
import { PrincipalComponent } from './gestion/capa/principal/principal.component';

const routes: Routes = [
  { path: 'pricipal', component: PrincipalComponent},
  { path: 'registro-cliente', component: EncabezadoComponent},
  { path: 'detalles-pedido', component: CuerpoComponent}
	
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
