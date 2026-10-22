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
 *         &lt;element ref="{}nombre"/>
 *         &lt;element ref="{}edad"/>
 *         &lt;element ref="{}suscripcion"/>
 *         &lt;element ref="{}favoritos"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombre",
    "edad",
    "suscripcion",
    "favoritos"
})
@XmlRootElement(name = "usuario")
public class Usuario {

    @XmlElement(required = true)
    protected String nombre;
    protected byte edad;
    @XmlElement(required = true)
    protected String suscripcion;
    @XmlElement(required = true)
    protected Favoritos favoritos;
    @XmlAttribute(name = "id")
    protected String id;

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

    /**
     * Obtiene el valor de la propiedad edad.
     * 
     */
    public byte getEdad() {
        return edad;
    }

    /**
     * Define el valor de la propiedad edad.
     * 
     */
    public void setEdad(byte value) {
        this.edad = value;
    }

    /**
     * Obtiene el valor de la propiedad suscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuscripcion() {
        return suscripcion;
    }

    /**
     * Define el valor de la propiedad suscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuscripcion(String value) {
        this.suscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad favoritos.
     * 
     * @return
     *     possible object is
     *     {@link Favoritos }
     *     
     */
    public Favoritos getFavoritos() {
        return favoritos;
    }

    /**
     * Define el valor de la propiedad favoritos.
     * 
     * @param value
     *     allowed object is
     *     {@link Favoritos }
     *     
     */
    public void setFavoritos(Favoritos value) {
        this.favoritos = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
