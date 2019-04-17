import { ClienteDTO } from './ClienteDTO';

export interface FacturaDTO {
    facturaId: number,
    clienteId: ClienteDTO,
    iva: number,
    total: number    
}