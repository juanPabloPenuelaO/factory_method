class GestorReporteWord extends GestorDocumentos {
    @Override
    public Documento crearDocumento() {
        return new DocumentoWord();
    }
}