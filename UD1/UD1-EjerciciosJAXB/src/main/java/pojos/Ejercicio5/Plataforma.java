//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.10.22 a las 02:28:43 PM CEST 
//


package pojos.Ejercicio5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}usuarios"/>
 *         &lt;element ref="{}contenidos"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "usuarios",
    "contenidos"
})
@XmlRootElement(name = "plataforma")
public class Plataforma {

    @XmlElement(required = true)
    protected Usuarios usuarios;
    @XmlElement(required = true)
    protected Contenidos contenidos;
    @XmlAttribute(name = "nombre")
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad usuarios.
     * 
     * @return
     *     possible object is
     *     {@link Usuarios }
     *     
     */
    public Usuarios getUsuarios() {
        return usuarios;
    }

    /**
     * Define el valor de la propiedad usuarios.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuarios }
     *     
     */
    public void setUsuarios(Usuarios value) {
        this.usuarios = value;
    }

    /**
     * Obtiene el valor de la propiedad contenidos.
     * 
     * @return
     *     possible object is
     *     {@link Contenidos }
     *     
     */
    public Contenidos getContenidos() {
        return contenidos;
    }

    /**
     * Define el valor de la propiedad contenidos.
     * 
     * @param value
     *     allowed object is
     *     {@link Contenidos }
     *     
     */
    public void setContenidos(Contenidos value) {
        this.contenidos = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
