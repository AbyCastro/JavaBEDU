import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        //Definir la ruta del archivo de logs
        Path rutaLog = Paths.get("src/errores.log");  //Path correcto
        Path rutaError = Paths.get("src/registrofallos.txt"); //Simuula un Path con errores

        int totalLineas = 0;
        int conteoErrores = 0;
        int conteoWarnings = 0;

        //Lectura eficiente usando try-with-resources y BufferedReader
        try (BufferedReader Lector = Files.newBufferedReader(rutaLog)) {
            String linea;
            while ((linea = Lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    conteoErrores++;
                }
                if (linea.contains("WARNING")) {
                    conteoWarnings++;
                }
            }

            //Mostrar Resumen
            System.out.println("📊 Análisis completado:");
            System.out.println("➡️ Total de líneas leídas: " + totalLineas);
            System.out.println("❌ Total de errores (ERROR): " + conteoErrores);
            System.out.println("⚠️ Total de advertencias (WARNING): " + conteoWarnings);

            double porcentajeErrores = (totalLineas > 0) ? ((double) conteoErrores / totalLineas) * 100 :0;
            double porcentajeWarnings = (totalLineas > 0) ? ((double) conteoWarnings / totalLineas) * 100 :0;

            System.out.printf("📈 Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("📉 Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarnings);

        } catch (IOException e) {
            System.out.println("❌ Error al procesar el archivo de logs: " + e.getMessage());

            //Registrar fallo en archivo externo
            try (BufferedWriter escritor = Files.newBufferedWriter(rutaError)) {
                escritor.write("Se produjo un error al leer el archivo 'errores.log': " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("❌ Además, no se pudo escribir en el archivo de registro de fallos.");
            }
        }
    }
}
