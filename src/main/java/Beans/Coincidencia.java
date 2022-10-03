package beans;

import java.sql.Date;
import java.sql.Time;

public class Coincidencia {
 private int id_coincidencia;
 private int id_mascota;
 private Date fecha_cita;
 private String tipo_servicio;
 private int calicacion_usuario;
 private String comentario;

    public Coincidencia(int id_coincidencia, int id_mascota, Date fecha_cita, String tipo_servicio, int calicacion_usuario, String comentario) {
        this.id_coincidencia = id_coincidencia;
        this.id_mascota = id_mascota;
        this.fecha_cita = fecha_cita;
        this.tipo_servicio = tipo_servicio;
        this.calicacion_usuario = calicacion_usuario;
        this.comentario = comentario;
    }

    public int getId_coincidencia() {
        return id_coincidencia;
    }

    public void setId_coincidencia(int id_coincidencia) {
        this.id_coincidencia = id_coincidencia;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public int getCalicacion_usuario() {
        return calicacion_usuario;
    }

    public void setCalicacion_usuario(int calicacion_usuario) {
        this.calicacion_usuario = calicacion_usuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Coincidencia{" + "id_coincidencia=" + id_coincidencia + ", id_mascota=" + id_mascota + ", fecha_cita=" + fecha_cita + ", tipo_servicio=" + tipo_servicio + ", calicacion_usuario=" + calicacion_usuario + ", comentario=" + comentario + '}';
    }

   
 
}