public class Main {
    public static void main(String[] args) {
        System.out.println("Cliente: Usando el GestorReportePDF:");
        gestionDocumentos(new GestorReportePDF());

        System.out.println("\nCliente: Usando el GestorReporteWord:");
        gestionDocumentos(new GestorReporteWord());
    }

    // Función cliente que acepta cualquier clase que extienda GestorDocumentos.
    public static void gestionDocumentos(GestorDocumentos gestor) {
        gestor.gestionarImpresion();
    }
}