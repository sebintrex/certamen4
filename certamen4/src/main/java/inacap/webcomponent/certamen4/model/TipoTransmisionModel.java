/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inacap.webcomponent.certamen4.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 20002816-3
 */
@Entity
@Table (name= "tipo_transmision")

public class TipoTransmisionModel {
    
    @Id
    private int idTipoTransmision;
    private String nombreTransmision;

    public int getIdTipoTransmision() {
        return idTipoTransmision;
    }

    public void setIdTipoTransmision(int idTipoTransmision) {
        this.idTipoTransmision = idTipoTransmision;
    }

    public String getNombreTransmision() {
        return nombreTransmision;
    }

    public void setNombreTransmision(String nombreTransmision) {
        this.nombreTransmision = nombreTransmision;
    }

    public TipoTransmisionModel() {
    }

    public TipoTransmisionModel(String nombreTransmision) {
        this.nombreTransmision = nombreTransmision;
    }

    public TipoTransmisionModel(int idTipoTransmision, String nombreTransmision) {
        this.idTipoTransmision = idTipoTransmision;
        this.nombreTransmision = nombreTransmision;
    }
    
    
    
}
