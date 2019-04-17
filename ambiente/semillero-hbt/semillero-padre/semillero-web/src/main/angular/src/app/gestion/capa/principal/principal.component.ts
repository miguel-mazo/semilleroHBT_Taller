import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-principal',
  templateUrl: './principal.component.html'
})
export class PrincipalComponent implements OnInit {
  
  public titulo = "Facturar"

  constructor() { }

  ngOnInit() {
  }

}
