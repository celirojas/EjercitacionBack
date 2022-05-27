package com.dh.ecommerce.service.impl;

import com.dh.ecommerce.model.Producto;

import java.util.List;

public class AlmacenService {

    private List<Producto> productos; //lista de productos

    //Constructor
    public AlmacenService(List<Producto> productos) {
        this.productos = productos;
    }

    //Me pasan un id y una cantidad y busca el producto.
    public Producto buscarProducto(String productoId, Integer cantidad) {
        Producto producto = null; //Primero es nulo

        //Recorro la lista de productos
        for (Producto p : this.productos) {
            if (p.getProductoId().equals(productoId) && p.getCantidad() >= cantidad) //Si el productoid es igual
                //al producto que me pasan por parametro y tengo igual o mayor cantidad, lo puedo vender
                producto = p;
            p.setCantidad(p.getCantidad() - cantidad); // actulizamos la cantidad de productos disponibles
            producto.setCantidad(cantidad);

        }

        return producto;

    }

}
