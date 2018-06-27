
package inacap.webcomponent.certamen4.model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transmision")
public class TransmisionModel {
    
    @ManyToOne
    @JoinColumn(name= "id_Tipo_Transmision")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTransmision;
    private String nombreTransmision;
    private String detalle;
    private TipoTransmisionModel TipoTransmision;
    
    public int getIdTransmision() {
        return idTransmision;
    }

    public void setIdTransmision(int idTransmision) {
        this.idTransmision = idTransmision;
    }

    public String getNombreTransmision() {
        return nombreTransmision;
    }

    public void setNombreTransmision(String nombreTransmision) {
        this.nombreTransmision = nombreTransmision;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public TipoTransmisionModel getTipoTransmision() {
        return TipoTransmision;
    }

    public void setTipoTransmision(TipoTransmisionModel TipoTransmision) {
        this.TipoTransmision = TipoTransmision;
    }

    
    public TransmisionModel() {
    }

    public TransmisionModel(String nombreTransmision, String detalle, TipoTransmisionModel TipoTransmision) {
        this.nombreTransmision = nombreTransmision;
        this.detalle = detalle;
        this.TipoTransmision = TipoTransmision;
    }

    private TransmisionModel(int idTransmision, String nombreTransmision, String detalle, TipoTransmisionModel TipoTransmision) {
        this.idTransmision = idTransmision;
        this.nombreTransmision = nombreTransmision;
        this.detalle = detalle;
        this.TipoTransmision = TipoTransmision;
    }

   
    
    
}
