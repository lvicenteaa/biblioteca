package tk.lvicenteaa.biblioteca.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "autor")
    private Autor autor;
    private Integer paginas;
    @OneToOne
    @JoinColumn(name = "editorial")
    private Editorial editorial;

    public Libro(Long id) {
        this.id = id;
    }

    public Libro() {
    }

    public Libro(Long id, String isbn, String nombre, Autor autor, Integer paginas, Editorial editorial) {
        this.id = id;
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
        this.editorial = editorial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}
