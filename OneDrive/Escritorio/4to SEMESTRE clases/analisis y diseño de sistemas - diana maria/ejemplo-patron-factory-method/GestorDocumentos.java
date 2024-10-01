abstract class GestorDocumentos {
    // método de fábrica que las subclases deben implementar.
    public abstract Documento crearDocumento();

    // método que utiliza el documento creado por el método de fábrica.
    public void gestionarImpresion() {
        // crea un documento usando el Factory Method.
        Documento documento = crearDocumento();
        documento.imprimir();
    }
}