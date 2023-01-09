package tk.lvicenteaa.biblioteca.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "prestamo")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Libro libro;
    @ManyToOne
    private Cliente cliente;
    private LocalDateTime fechaPrestamo;
    private LocalDateTime fechaDevolucion;

    public Prestamo(Long id) {
        this.id = id;
    }

    public Prestamo() {
    }

    public Prestamo(Long id, Libro libro, Cliente cliente, LocalDateTime fechaPrestamo, LocalDateTime fechaDevolucion) {
        this.id = id;
        this.libro = libro;
        this.cliente = cliente;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDateTime fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
