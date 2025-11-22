```mermaid
classDiagram
    class Biblioteca {
        - List~Libro~ libros
        - List~Usuario~ usuarios
        - List~Prestamo~ prestamos
        + registrarLibro(libro : Libro)
        + registrarUsuario(usuario : Usuario)
        + prestarLibro(usuarioID : String, ISBN : String, fecha : Date)
        + mostrarReporte()
    }

    class Libro {
        - String ISBN
        - String titulo
        - String autor
        - int copiasDisponibles
        + reducirCopia()
        + aumentarCopia()
    }

    class Usuario {
        - String claveUsuario
        - String nombre
        - String licenciatura
        - int semestre
    }

    class Prestamo {
        - Usuario usuario
        - Libro libro
        - Date fechaPrestamo
    }

    class LibroNoDisponibleException
    class LibroNoEncontradoException

    Biblioteca "1" o-- "*" Libro : contiene
    Biblioteca "1" o-- "*" Usuario : contiene
    Biblioteca "1" o-- "*" Prestamo : contiene

    Prestamo --> Usuario : asociado
    Prestamo --> Libro : asociado

    LibroNoDisponibleException <|-- Exception
    LibroNoEncontradoException <|-- Exception
