//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.10.20 a las 09:41:20 AM CEST 
//


package pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoRoot complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListaPersona" type="{http://xml.netbeans.org/schema/schema}TipoListaPersona"/>
 *         &lt;element name="ListaNegocio" type="{http://xml.netbeans.org/schema/schema}TipoListaNegocio"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoRoot", propOrder = {
    "listaPersona",
    "listaNegocio"
})
public class TipoRoot {

    @XmlElement(name = "ListaPersona", required = true)
    protected TipoListaPersona listaPersona;
    @XmlElement(name = "ListaNegocio", required = true)
    protected TipoListaNegocio listaNegocio;

    /**
     * Obtiene el valor de la propiedad listaPersona.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaPersona }
     *     
     */
    public TipoListaPersona getListaPersona() {
        return listaPersona;
    }

    /**
     * Define el valor de la propiedad listaPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaPersona }
     *     
     */
    public void setListaPersona(TipoListaPersona value) {
        this.listaPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad listaNegocio.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaNegocio }
     *     
     */
    public TipoListaNegocio getListaNegocio() {
        return listaNegocio;
    }

    /**
     * Define el valor de la propiedad listaNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaNegocio }
     *     
     */
    public void setListaNegocio(TipoListaNegocio value) {
        this.listaNegocio = value;
    }

}
