//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2026.10.22 a las 02:28:43 PM CEST 
//


package pojos.Ejercicio5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pojos2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Temporadas_QNAME = new QName("", "temporadas");
    private final static QName _Genero_QNAME = new QName("", "genero");
    private final static QName _Suscripcion_QNAME = new QName("", "suscripcion");
    private final static QName _Titulo_QNAME = new QName("", "titulo");
    private final static QName _Duracion_QNAME = new QName("", "duracion");
    private final static QName _Valoracion_QNAME = new QName("", "valoracion");
    private final static QName _Nombre_QNAME = new QName("", "nombre");
    private final static QName _Edad_QNAME = new QName("", "edad");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pojos2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Contenido }
     * 
     */
    public Contenido createContenido() {
        return new Contenido();
    }

    /**
     * Create an instance of {@link Pelicula }
     * 
     */
    public Pelicula createPelicula() {
        return new Pelicula();
    }

    /**
     * Create an instance of {@link Peliculas }
     * 
     */
    public Peliculas createPeliculas() {
        return new Peliculas();
    }

    /**
     * Create an instance of {@link Contenidos }
     * 
     */
    public Contenidos createContenidos() {
        return new Contenidos();
    }

    /**
     * Create an instance of {@link Series }
     * 
     */
    public Series createSeries() {
        return new Series();
    }

    /**
     * Create an instance of {@link Serie }
     * 
     */
    public Serie createSerie() {
        return new Serie();
    }

    /**
     * Create an instance of {@link Usuarios }
     * 
     */
    public Usuarios createUsuarios() {
        return new Usuarios();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Favoritos }
     * 
     */
    public Favoritos createFavoritos() {
        return new Favoritos();
    }

    /**
     * Create an instance of {@link Plataforma }
     * 
     */
    public Plataforma createPlataforma() {
        return new Plataforma();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "temporadas")
    public JAXBElement<Byte> createTemporadas(Byte value) {
        return new JAXBElement<Byte>(_Temporadas_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "genero")
    public JAXBElement<String> createGenero(String value) {
        return new JAXBElement<String>(_Genero_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "suscripcion")
    public JAXBElement<String> createSuscripcion(String value) {
        return new JAXBElement<String>(_Suscripcion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "titulo")
    public JAXBElement<String> createTitulo(String value) {
        return new JAXBElement<String>(_Titulo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "duracion")
    public JAXBElement<Short> createDuracion(Short value) {
        return new JAXBElement<Short>(_Duracion_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "valoracion")
    public JAXBElement<Float> createValoracion(Float value) {
        return new JAXBElement<Float>(_Valoracion_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nombre")
    public JAXBElement<String> createNombre(String value) {
        return new JAXBElement<String>(_Nombre_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "edad")
    public JAXBElement<Byte> createEdad(Byte value) {
        return new JAXBElement<Byte>(_Edad_QNAME, Byte.class, null, value);
    }

}
