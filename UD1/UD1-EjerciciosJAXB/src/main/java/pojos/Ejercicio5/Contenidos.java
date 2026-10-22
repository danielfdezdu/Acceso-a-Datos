//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.10.22 a las 02:28:43 PM CEST 
//


package pojos.Ejercicio5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}series"/>
 *         &lt;element ref="{}peliculas"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "series",
    "peliculas"
})
@XmlRootElement(name = "contenidos")
public class Contenidos {

    @XmlElement(required = true)
    protected Series series;
    @XmlElement(required = true)
    protected Peliculas peliculas;

    /**
     * Obtiene el valor de la propiedad series.
     * 
     * @return
     *     possible object is
     *     {@link Series }
     *     
     */
    public Series getSeries() {
        return series;
    }

    /**
     * Define el valor de la propiedad series.
     * 
     * @param value
     *     allowed object is
     *     {@link Series }
     *     
     */
    public void setSeries(Series value) {
        this.series = value;
    }

    /**
     * Obtiene el valor de la propiedad peliculas.
     * 
     * @return
     *     possible object is
     *     {@link Peliculas }
     *     
     */
    public Peliculas getPeliculas() {
        return peliculas;
    }

    /**
     * Define el valor de la propiedad peliculas.
     * 
     * @param value
     *     allowed object is
     *     {@link Peliculas }
     *     
     */
    public void setPeliculas(Peliculas value) {
        this.peliculas = value;
    }

}
