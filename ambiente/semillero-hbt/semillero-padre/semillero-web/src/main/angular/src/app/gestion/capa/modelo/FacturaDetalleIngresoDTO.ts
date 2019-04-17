import { FacturaDetalleDTO } from './FacturaDetalleDTO';

export interface FacturaDetalleIngresoDTO {
    
    detalles: FacturaDetalleDTO[],
    idCliente: number,
    fechaCompra: string,
    tipoPedido: number,
    metodoPago: number
}