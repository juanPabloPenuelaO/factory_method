class GestorReportePDF extends GestorDocumentos {
    @Override
    public Documento crearDocumento() {
        return new DocumentoPDF();
    }
}