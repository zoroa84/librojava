package com.ipartek.formacion.javalibro.pojo.interfaces;

import java.io.Serializable;

//los atributos de un interfaz son static y final, 
//static xk solo puede haber uno en memoria 
//y final xk no se puede modificar
public interface Vendible extends Serializable,Cloneable {
/**
 * devuelve el precio del objeto el cual deve ser superior al PRECIO_MINIMO
 */
static final float PRECIO_MINIMO=0;
float getprecio(); /* prototipo*/
float getPrecio();
}
