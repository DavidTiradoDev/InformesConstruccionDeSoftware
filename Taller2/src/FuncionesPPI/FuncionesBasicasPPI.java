package FuncionesPPI;
import java.util.*;


/**
 * MY BUSS - Aplicación de transporte público Medellín
 * PPI Segunda Entrega - Tecnológico de Antioquia
 * Juan Pablo García | Johan Morales | David Tirado
 *
 * 5 Funcionalidades principales (RF):
 *   1. Consultar rutas disponibles
 *   2. Consultar paradas de una ruta
 *   3. Ver ocupación en tiempo real de un bus
 *   4. Registrar usuario
 *   5. Generar notificación de llegada de bus
 */
public class FuncionesBasicasPPI {

    // ─────────────────────────────────────────────
    // DATOS HARDCODEADOS
    // ─────────────────────────────────────────────

    // Rutas: código → nombre
    static Map<String, String> rutas = new LinkedHashMap<>();

    // Paradas por ruta: código de ruta → lista de paradas
    static Map<String, List<String>> paradasPorRuta = new LinkedHashMap<>();

    // Ocupación por bus: placa → [pasajeros actuales, capacidad máxima]
    static Map<String, int[]> ocupacionBuses = new LinkedHashMap<>();

    // Usuarios registrados: correo → nombre
    static Map<String, String> usuarios = new LinkedHashMap<>();

    // Bus más cercano por ruta: código de ruta → [placa, minutos para llegar]
    static Map<String, Object[]> proximosBuses = new LinkedHashMap<>();

    // ─────────────────────────────────────────────
    // INICIALIZACIÓN DE DATOS
    // ─────────────────────────────────────────────
    static {
        // Rutas
        rutas.put("301", "Ruta 301 – Itagüí / Niquía");
        rutas.put("044", "Ruta 044 – Belén / Centro");
        rutas.put("115", "Ruta 115 – Aranjuez / El Poblado");
        rutas.put("222", "Ruta 222 – Circular Laureles");
        rutas.put("087", "Ruta 087 – Bello / San Antonio");

        // Paradas
        paradasPorRuta.put("301", Arrays.asList(
                "Terminal Sur", "Estación Itagüí", "Av. El Poblado", "Parque Bello",
                "Estación Niquía"));
        paradasPorRuta.put("044", Arrays.asList(
                "Belén La Palma", "UPB", "Colombia con 80", "Parque Berrío", "Centro Comercial Sandiego"));
        paradasPorRuta.put("115", Arrays.asList(
                "Aranjuez", "Palermo", "Hospital", "El Centro", "Oviedo", "El Poblado"));
        paradasPorRuta.put("222", Arrays.asList(
                "Estadio", "Laureles", "Av. El Jardín", "Conquistadores", "Nutibara"));
        paradasPorRuta.put("087", Arrays.asList(
                "Bello Centro", "Madera", "Puente Colombia", "San Antonio", "Alpujarra"));

        // Ocupación: [pasajeros actuales, capacidad máxima]
        ocupacionBuses.put("MEI-301A", new int[]{42, 50});
        ocupacionBuses.put("MEI-044B", new int[]{18, 50});
        ocupacionBuses.put("MEI-115C", new int[]{50, 50});
        ocupacionBuses.put("MEI-222D", new int[]{5,  50});
        ocupacionBuses.put("MEI-087E", new int[]{33, 50});

        // Usuarios iniciales
        usuarios.put("admin@mybuss.co", "Administrador MyBuss");

        // Próximos buses por ruta: [placa, minutos]
        proximosBuses.put("301", new Object[]{"MEI-301A", 3});
        proximosBuses.put("044", new Object[]{"MEI-044B", 7});
        proximosBuses.put("115", new Object[]{"MEI-115C", 1});
        proximosBuses.put("222", new Object[]{"MEI-222D", 12});
        proximosBuses.put("087", new Object[]{"MEI-087E", 5});
    }

    // ═════════════════════════════════════════════
    // FUNCIONALIDAD 1 – CONSULTAR RUTAS DISPONIBLES
    // RF01: El sistema debe permitir al usuario consultar
    //       todas las rutas de transporte disponibles.
    // ═════════════════════════════════════════════
    static void consultarRutas() {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║   FUNCIONALIDAD 1: RUTAS DISPONIBLES     ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println("  Total de rutas activas: " + rutas.size());
        System.out.println("  ──────────────────────────────────────────");
        for (Map.Entry<String, String> entrada : rutas.entrySet()) {
            System.out.println("  [" + entrada.getKey() + "]  " + entrada.getValue());
        }
    }

    // ═════════════════════════════════════════════
    // FUNCIONALIDAD 2 – CONSULTAR PARADAS DE UNA RUTA
    // RF02: El sistema debe mostrar la lista de paradas
    //       asociadas a una ruta seleccionada por el usuario.
    // ═════════════════════════════════════════════
    static void consultarParadas(String codigoRuta) {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║   FUNCIONALIDAD 2: PARADAS DE RUTA       ║");
        System.out.println("╚══════════════════════════════════════════╝");

        if (!rutas.containsKey(codigoRuta)) {
            System.out.println("  ✗ Error: la ruta '" + codigoRuta + "' no existe.");
            return;
        }

        List<String> paradas = paradasPorRuta.get(codigoRuta);
        System.out.println("  Ruta: " + rutas.get(codigoRuta));
        System.out.println("  Número de paradas: " + paradas.size());
        System.out.println("  ──────────────────────────────────────────");
        for (int i = 0; i < paradas.size(); i++) {
            String prefijo = (i == 0) ? "  ◉ Inicio  →  " :
                             (i == paradas.size() - 1) ? "  ◉ Fin     →  " :
                                                          "  ●          →  ";
            System.out.println(prefijo + paradas.get(i));
        }
    }

    // ═════════════════════════════════════════════
    // FUNCIONALIDAD 3 – VER OCUPACIÓN EN TIEMPO REAL
    // RF03: El sistema debe mostrar la ocupación actual
    //       de un bus, indicando el nivel de lleno.
    // ═════════════════════════════════════════════
    static void verOcupacion(String placaBus) {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║   FUNCIONALIDAD 3: OCUPACIÓN DEL BUS     ║");
        System.out.println("╚══════════════════════════════════════════╝");

        if (!ocupacionBuses.containsKey(placaBus)) {
            System.out.println("  ✗ Error: el bus '" + placaBus + "' no está registrado.");
            return;
        }

        int[] datos       = ocupacionBuses.get(placaBus);
        int pasajeros     = datos[0];
        int capacidad     = datos[1];
        double porcentaje = (double) pasajeros / capacidad * 100;

        String nivel;
        String icono;
        if (porcentaje == 100) {
            nivel = "LLENO"; icono = "🔴";
        } else if (porcentaje >= 70) {
            nivel = "CASI LLENO"; icono = "🟠";
        } else if (porcentaje >= 40) {
            nivel = "MODERADO"; icono = "🟡";
        } else {
            nivel = "DISPONIBLE"; icono = "🟢";
        }

        // Barra visual de ocupación (20 caracteres)
        int llenos  = (int) Math.round(porcentaje / 5);
        int vacios  = 20 - llenos;
        String barra = "[" + "█".repeat(llenos) + "░".repeat(vacios) + "]";

        System.out.println("  Bus       : " + placaBus);
        System.out.println("  Pasajeros : " + pasajeros + " / " + capacidad);
        System.out.printf ("  Ocupación : %.1f%% %s %s%n", porcentaje, barra, icono);
        System.out.println("  Estado    : " + nivel);
    }

    // ═════════════════════════════════════════════
    // FUNCIONALIDAD 4 – REGISTRAR USUARIO
    // RF04: El sistema debe permitir registrar un nuevo
    //       usuario con nombre y correo electrónico único.
    // ═════════════════════════════════════════════
    static void registrarUsuario(String nombre, String correo) {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║   FUNCIONALIDAD 4: REGISTRAR USUARIO     ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // Validar formato básico de correo
        if (!correo.contains("@") || !correo.contains(".")) {
            System.out.println("  ✗ Error: correo electrónico inválido.");
            return;
        }

        // Validar nombre no vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("  ✗ Error: el nombre no puede estar vacío.");
            return;
        }

        // Verificar unicidad del correo
        if (usuarios.containsKey(correo.toLowerCase())) {
            System.out.println("  ✗ Error: el correo '" + correo + "' ya está registrado.");
            return;
        }

        usuarios.put(correo.toLowerCase(), nombre.trim());
        System.out.println("  ✔ Usuario registrado exitosamente.");
        System.out.println("  Nombre : " + nombre.trim());
        System.out.println("  Correo : " + correo.toLowerCase());
        System.out.println("  Total usuarios registrados: " + usuarios.size());
    }

    // ═════════════════════════════════════════════
    // FUNCIONALIDAD 5 – NOTIFICACIÓN DE LLEGADA DE BUS
    // RF05: El sistema debe notificar al usuario cuántos
    //       minutos faltan para que llegue el próximo bus
    //       de la ruta seleccionada a su parada.
    // ═════════════════════════════════════════════
    static void notificarLlegada(String codigoRuta, String paradaUsuario) {
        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║   FUNCIONALIDAD 5: NOTIFICACIÓN LLEGADA  ║");
        System.out.println("╚══════════════════════════════════════════╝");

        if (!rutas.containsKey(codigoRuta)) {
            System.out.println("  ✗ Error: la ruta '" + codigoRuta + "' no existe.");
            return;
        }

        List<String> paradas = paradasPorRuta.get(codigoRuta);
        boolean paradaValida = paradas.stream()
                .anyMatch(p -> p.equalsIgnoreCase(paradaUsuario));

        if (!paradaValida) {
            System.out.println("  ✗ Error: la parada '" + paradaUsuario +
                               "' no pertenece a la ruta " + codigoRuta + ".");
            return;
        }

        Object[] infoBus  = proximosBuses.get(codigoRuta);
        String placa      = (String) infoBus[0];
        int minutos       = (int)    infoBus[1];
        int[] ocupacion   = ocupacionBuses.get(placa);
        double pct        = (double) ocupacion[0] / ocupacion[1] * 100;

        String alerta = (pct == 100) ? "⚠ Bus LLENO – considere esperar el siguiente." :
                        (pct >= 70)  ? "⚠ Bus casi lleno." : "✔ Hay espacio disponible.";

        System.out.println("  Ruta    : " + rutas.get(codigoRuta));
        System.out.println("  Parada  : " + paradaUsuario);
        System.out.println("  ──────────────────────────────────────────");
        System.out.println("  🚌 Próximo bus : " + placa);
        System.out.println("  ⏱ Llega en    : " + minutos +
                           (minutos == 1 ? " minuto" : " minutos"));
        System.out.printf ("  👥 Ocupación   : %.0f%%%n", pct);
        System.out.println("  " + alerta);
    }

    // ═════════════════════════════════════════════
    // MAIN – DEMOSTRACIÓN DE LAS 5 FUNCIONALIDADES
    // ═════════════════════════════════════════════
    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║          MY BUSS  –  Medellín            ║");
        System.out.println("║  Transporte público inteligente          ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // ── Funcionalidad 1: Listar todas las rutas
        consultarRutas();

        // ── Funcionalidad 2: Paradas de una ruta específica
        consultarParadas("301");
        consultarParadas("999");           // ruta inexistente → muestra error

        // ── Funcionalidad 3: Ocupación de buses
        verOcupacion("MEI-301A");          // 42/50  → casi lleno
        verOcupacion("MEI-115C");          // 50/50  → lleno
        verOcupacion("MEI-222D");          // 5/50   → disponible
        verOcupacion("MEI-XXX");           // no existe → error

        // ── Funcionalidad 4: Registro de usuarios
        registrarUsuario("Laura Gómez",   "lgomez@email.com");   // ok
        registrarUsuario("Pedro Pérez",   "lgomez@email.com");   // correo duplicado
        registrarUsuario("",              "sinNombre@email.com"); // nombre vacío
        registrarUsuario("Ana Martínez",  "correo_invalido");     // correo inválido

        // ── Funcionalidad 5: Notificación de llegada
        notificarLlegada("044", "Belén La Palma");   // ok  → 7 min, moderado
        notificarLlegada("115", "Oviedo");           // ok  → 1 min, lleno
        notificarLlegada("301", "Parada Falsa");     // parada no existe
        notificarLlegada("300", "Alguna parada");    // ruta no existe

        System.out.println("\n══════════════════════════════════════════");
        System.out.println("  Fin de la demostración – MY BUSS v1.0");
        System.out.println("══════════════════════════════════════════\n");
    }
}