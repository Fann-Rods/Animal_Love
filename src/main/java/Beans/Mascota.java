package beans;

import java.sql.Blob;

public class Mascota {
   private int id_mascota; 
   private String nombre;
   private String raza;
   private String tipo;
   private String edad;
   private Blob foto;
   private String genero;
   private String descripcion;
   private String montas_mascota;
   private int id_usuario; 

    public Mascota(int id_mascota, String nombre, String raza, String tipo, String edad, Blob foto, String genero, String descripcion, String montas_mascota, int id_usuario) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
        this.edad = edad;
        this.foto = foto;
        this.genero = genero;
        this.descripcion = descripcion;
        this.montas_mascota = montas_mascota;
        this.id_usuario = id_usuario;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMontas_mascota() {
        return montas_mascota;
    }

    public void setMontas_mascota(String montas_mascota) {
        this.montas_mascota = montas_mascota;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id_mascota=" + id_mascota + ", nombre=" + nombre + ", raza=" + raza + ", tipo=" + tipo + ", edad=" + edad + ", foto=" + foto + ", genero=" + genero + ", descripcion=" + descripcion + ", montas_mascota=" + montas_mascota + ", id_usuario=" + id_usuario + '}';
    }

}