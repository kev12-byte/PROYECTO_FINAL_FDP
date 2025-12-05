/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seneb_proyecto_final_programacion;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SENEB_PROYECTO_FINAL_PROGRAMACION {

    public static void main(String[] args) {
   //PERMITE ACENTOS Y DEMAS TIPOS DE SIGNOS (CAMBIA LA CODIFICACION DEL SISTEMA OPERATIVO)
        try {//
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        } catch (Exception e) {//DETECTA TODOS LOS ERRORORES QUE NO PUEDE IMPRIMIR LA CONSOLA Y SE LOS MANDA AL TRY
            e.printStackTrace();
        }
        //IMPRIMIR EL MENU
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            imprimirMenu();
            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    calculadoraImc();
                    continue;

                case 2:
                    calcularCalorias();
                    continue;

                case 3:
                    horasdeSueño();
                    continue;
                case 4:
                    indiceCE();
                    continue;

                case 5:
                    hidratacionDiaria();
                    continue;
                case 6:
                    System.out.println("Gracias por probar SENEB, hasta luego!");
                    break;

                default://si no pasan los primeros 6 casos
                    System.out.println("Selecciona una opción válida");
                    System.out.println("");
                    continue;

            }
            break;

        } while (opcion != 6);

    }

    //CALCULO DE IDRATACION TOTAL
    public static void hidratacionDiaria() {
        Scanner input = new Scanner(System.in);
        double peso, aguaMl;
        while (true) {
            System.out.println("Introduce tu peso en kilogramos: ");
            peso = input.nextDouble();
            if (peso <= 0 || peso >= 700) {
                System.out.println("Seguro que eso es lo que pesas?. Vuelve a intentarlo");
                continue;
            }
            aguaMl = peso * 35; // Son 35 ml por kilogramo
            System.out.println("Debes beber aproximadamente: " + aguaMl + " ml de agua al dia");
            break;

        }
    }
//INDICE DEPENDIENTE SE SU IMC 

    public static void indiceCE() {
        Scanner input = new Scanner(System.in);
        double cintura, altura, indice;
        System.out.println("¿Qué indica este índice?\n"
                + "Indica de manera más precisa que el IMC (Índice de Masa Corporal) "
                + "el riesgo de padecer enfermedades cardiovasculares y metabólicas.");
        while (true) {
            System.out.println("Introduce la circunferencia de tu cintura en centímetros: ");
            cintura = input.nextDouble();
            if (cintura <= 0) {
                System.out.println("Seguro que eso mide tu cintura?. Vuelve a intentarlo");
                continue;
            }
            System.out.println("Introduce tu altura en centímetros: ");
            altura = input.nextDouble();
            if (altura <= 0 || altura >= 3) {
                System.out.println("Seguro que esa es tu estatura?. Vuelve a intentarlo");
            }
            indice = cintura / altura;
            System.out.println("Tu indice cintura-altura es: " + indice);
            if (indice >= 0 && indice < 0.40) {
                System.out.println("Estas en bajo peso, lo que puede indicar bajo peso o delgadez extrema");

            } else if (indice >= .40 && indice <= 0.49) {
                System.out.println("Estas en Riesgo Bajo/Saludable, lo que indica un reisgo "
                        + "cardiovascular y metábolico bajo. ");

            } else if (indice >= .50 && indice <= 0.59) {
                System.out.println("Estas en Riesgo Moderado Aumentado, "
                        + "lo que se considera sobrepeso abdominal. "
                        + "Es importante tomar medidas (dieta y ejercicio)");

            } else {
                System.out.println("Estas en Riesgo Alto/Elevado lo que indica obesidad central. "
                        + "Se recomienda una intervención médica "
                        + "y cambios urgentes en el estilo de vida.");
            }
            break;
        }

    }

//CALCULO DE SUS HORAS DE SUENIO
    public static void horasdeSueño() {
        Scanner input = new Scanner(System.in);
        int edad;
        while (true) {
            System.out.println("Ingresa tu edad: ");
            edad = input.nextInt();
            if (edad >= 0 && edad <= 18) {
                System.out.println("Tu horas de sueño recomendado es de: 8-10 horas");
                break;
            } else if (edad > 18 && edad <= 65) {
                System.out.println("Tu horas de sueño recomendado es de: 7-9 horas");
                break;
            } else if (edad > 65 && edad <= 100) {
                System.out.println("Tu horas de sueño recomendado es de: 7-8 horas");
                break;

            } else {
                System.out.println("Seguro que esa es tu edad?. Vuelve a intentarlo");
                continue;
            }
        }
    }
//CALCULAR SU TOTAL DE CALORIAS 

    public static void calcularCalorias() {
        System.out.println("");
        Scanner teclado = new Scanner(System.in);
        String sexo;
        int edad;
        double peso, factor, altura;
        int actividad;
        while (true) {
            System.out.println("=== GASTO ENERGÉTICO TOTAL ===");
            System.out.println("Introduce tu genero (M/F): ");
            sexo = teclado.next().toLowerCase();
            if (!(sexo.equalsIgnoreCase("m")) && !(sexo.equalsIgnoreCase("f"))) {
                System.out.println("Tienes que introducir 'M' (Masculino) O 'F' (Femenino) porfavor. Vuelve a intentarlo");
                System.out.println("");
                continue;
            }
            System.out.println("Introduce tu edad: ");
            edad = teclado.nextInt();
            if (edad <= 0 || edad >= 100) {
                System.out.println("Seguro que esa es tu edad?. Vuelve a intentar");
                continue;
            }
            System.out.println("Ingresa tu altura en metros: ");
            altura = teclado.nextDouble();
            if (altura <= 0 || altura >= 3) {//I=or con que uno sea verdadero uno se vuelve verdadedro 
                System.out.println("Seguro que esa es tu estatura?. Vuelve a intentar");
                continue;
            }
            System.out.println("Introduce tu peso en kilogramos: ");
            peso = teclado.nextInt();
            if (peso <= 0 || peso >= 700) {
                System.out.println("Seguro que eso es lo que pesas? Vuelve a intentarlo");
                continue;
            }
            System.out.println("Nivel de actividad"
                    + "\n1.Sedentario"
                    + "\n2.Ligero"
                    + "\n3.Moderado"
                    + "\n4.Intenso");
            actividad = teclado.nextInt();
            switch (actividad) {
                case 1:// Sedentario
                    factor = 1.2;
                    break;
                case 2:// Ligero
                    factor = 1.375;
                    break;
                case 3:// Moderado
                    factor = 1.55;
                    break;
                case 4:// Intenso
                    factor = 1.725;
                    break;
                case 5:// Muy intenso
                    factor = 1.9;
                    break;
                default:
                    System.out.println("Opción inválida, vuelve a intentarlo.");
                    continue;
            }
            double tmb = calcularTmb(sexo, edad, peso, altura);
            double tdee = calcularTdee(tmb, actividad, factor);
            System.out.println("Tu gasto energético total es de " + tdee + " calorías");
            break;

        }
    }
//CALCULO DE TASA METEBOLOCA BASAL ()

    public static double calcularTmb(String sexo, int edad, double peso, double altura) {

        altura = altura * 100;// Convertir altura a cm poruqe la formula lo pide en cm

        double tmb;

        if (sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("m")) {
            // Hombre
            tmb = (10 * peso) + (6.25 * altura) - (5 * edad) + 5;
        } else if (sexo.equalsIgnoreCase("f")) {
            // Mujer
            tmb = (10 * peso) + (6.25 * altura) - (5 * edad) - 161;
        } else {
            System.out.println("Opción inválida. Usa 'M' (hombre) o 'F' (mujer)");
            return 0; // valor por defecto
        }

        return tmb;
    }
//CALCULO DE GASTO ENERGETICO TOTAL (TOTAL DAYLY ENEGRY EXPENDITURE )
    public static double calcularTdee(double tmb, int actividad, double factor) {
        double tdee;
        return tdee = tmb * factor;
    }
    //IMPRIMIR MENU DE OPCIONES 

    public static void imprimirMenu() {
        System.out.println("======== BIENVENIDO A SENEB ========");
        System.out.println("1. Calcular tu IMC");
        System.out.println("2. Calcular gasto energético");
        System.out.println("3. Horas de sueño recomendadas");
        System.out.println("4. Índice cintura-estatura");
        System.out.println("5. Cantidad de agua recomendada");
        System.out.println("6. Salir del sistema");
        System.out.println("Selecciona una opcion: ");
    }
//CALCULO DE IMC 
    public static void calculadoraImc() {
        System.out.println("El IMC es la manera rápida de saber si tu peso está "
                + "proporcionalmente balanceado con tu altura, "
                + "sirviendo como una alerta temprana sobre posibles "
                + "problemas de salud relacionados con el peso.");
        Scanner teclado = new Scanner(System.in);
        double peso, altura;
        while (true) {
            System.out.println("=== CALCULADORA DE IMC ===");
            System.out.print("Ingresa tu peso en kilogramos: ");
            peso = teclado.nextDouble();
            if (peso <= 0 || peso >= 700) {
                System.out.println("Eso es lo que pesas? Vuelve a intentarlo");
                continue;
            }
            System.out.println("Ingresa tu altura en metros: ");
            altura = teclado.nextDouble();
            if (altura <= 0 || altura >= 3) {
                System.out.println("Eso es lo que mides? Vuelve a intentarlo");
                continue;
            }
            double imc = calcularImc(peso, altura);
            System.out.println("Tu IMC es de " + (imc));
            mostrarCategoria(imc);
            preguntarDieta(imc);
            preguntarEjercicios(imc);
            break;
        }

    }
//FORMULA DEL IMC
    public static double calcularImc(double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;

    }
//CATEGORIA SEGUN TU IMC 
    public static String mostrarCategoria(double imc) {
        String categoria;
        if (imc < 18.5) {//SI EL IMC ES MENOR A 18.5 TE VA A ARROJAR LOS SIGUIENTE
            categoria = "Bajo peso";
            System.out.println("Categoría: " + categoria);
            System.out.println("Tu índice de masa corporal es muy bajo, tu salud está corriendo riesgo, "
                    + "debes poner atención de inmediato."
            );
        } else if (imc >= 18.5 && imc < 25) {//SI EL IMC ES IGUAL O MAYOR A 18.5 PERO NO MAYOR A 25 ARROJA:
            categoria = "Peso normal";
            System.out.println("Categoría: " + categoria);
            System.out.println("Que tu IMC haya sido normal no quiere decir que "
                    + "no tengas que cuidar de tu salud");
        } else if (imc >= 25 && imc < 30) {//SI EL IMC ES IGUAL O MAYOR A 25 PERO NO MAYOR A 30:
            categoria = "Sobrepeso";
            System.out.println("Categoría: " + categoria);
            System.out.println("Empieza a cudar de tu salud, antes de que esto se agrave más...");
        } else {//SI SUPERA TODO LO DEMAS:
            categoria = "Obesidad";
            System.out.println("Categoría: " + categoria);
            System.out.println("En este momento te encuentras en una etapa de riesgo muy alta!"
                    + " Tu salud está en un gran riesgo y, "
                    + "te recomendamos que empieces a cuidar de esta antes de que "
                    + "te cueste tu propia vida!");

        }
        return categoria;

    }
//PREGUNTAR SI QUIERE LA DDIETA 
    public static void preguntarDieta(double imc) {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.print("¿Le gustaría que le recomendemos una dieta? (si / no): ");
            String respuesta = entrada.next().toLowerCase();

            if (respuesta.equals("si")) {//SI LA RESPUES ES VERADERA MUESTRA LA DIETA
                mostrarDieta(imc);//SI LA RESPUESA ES VERADERA INVOCA:
                break;
            } else if (respuesta.equals("no")) {
                break;
            } else {
                System.out.println("Introduce (si) o (no) porfavor");
                continue;
            }
        }
        System.out.println("");
    }
//MOSTRAR DIETA SEGUN SU IMC
    public static void mostrarDieta(double imc) {

        if (imc < 18.5) {//SI EL IMC ES MENOR A 18.5
            System.out.println("\nDieta para una persona con muy bajo peso:\n"
                    + "- Desayuno: Avena con leche entera, plátano y miel.\n"
                    + "- Colación: Pan integral con crema de cacahuate o yogurt con granola.\n"
                    + "- Comida: Carne magra o pollo, arroz, frijoles y ensalada con aguacate.\n"
                    + "- Colación: Licuado de leche con fruta y avena.\n"
                    + "- Cena: Omelette con queso, verduras y 2 tortillas.\n"
                    + "- Antes de dormir: Vaso de leche o yogurt natural.\n"
                    + "- Recomendaciones: Comer cada 3 horas, aumentar porciones poco a poco, dormir bien y hacer ejercicios de fuerza ligera para ganar músculo.");
        } else if (imc >= 18.5 && imc < 25) {//SI EL IMC ES IGUAL A 18.5 PERO NO MAYOR A 25
            System.out.println("\nDieta saludable para mantener una buena salud:\n"
                    + "- Comer variado: frutas, verduras, proteínas, carbohidratos y grasas buenas.\n"
                    + "- Beber suficiente agua (1.5–2 L diarios).\n"
                    + "- Evitar comida rápida, azúcares y frituras.\n"
                    + "- Incluir:\n"
                    + "  Desayuno: avena, fruta, nueces.\n"
                    + "  Comida: pollo o pescado con arroz integral y verduras.\n"
                    + "  Cena: proteína ligera y ensalada.\n");
        } else if (imc >= 25 && imc < 30) {//SI EL IMC ES IGUAL A 25 PERO NO MAYOR A 30
            System.out.println("\nDieta saludable para una persona con sobrepeso:\n"
                    + "- Desayuno: Avena con leche light, fruta y 1 huevo.\n"
                    + "- Colación: Yogurt bajo en grasa o 10 almendras.\n"
                    + "- Comida: Pollo o pescado con ensalada y arroz integral.\n"
                    + "- Colación: Fruta y un puñado de semillas.\n"
                    + "- Cena: Verduras al vapor con atún o huevo.\n"
                    + "- Evita: Refrescos, frituras, pan dulce y alcohol.\n"
                    + "- Recomendaciones: Beber 2L de agua, dormir bien y hacer ejercicio diario.");
        } else {//SI TODO ES MAYOR A 30
            System.out.println("\nDieta saludable para una persona con obesidad:\n"
                    + "- Desayuno: Avena con agua o leche light y una manzana.\n"
                    + "- Colación: Yogurt natural bajo en grasa o 1 fruta pequeña.\n"
                    + "- Comida: Pechuga de pollo o pescado a la plancha, ensalada verde y verduras al vapor.\n"
                    + "- Colación: Pepino o jícama con limón (sin sal).\n"
                    + "- Cena: Sopa de verduras o atún con lechuga y 1 tostada integral.\n"
                    + "- Evita: Refrescos, azúcar, pan dulce, frituras, alcohol y comida rápida.\n"
                    + "- Recomendaciones: Beber 2–3L de agua al día, dormir bien, comer despacio y hacer ejercicio suave diario (caminar o nadar).");
        }
        System.out.println("");
    }
//PREGUNTAR SI QUIERE VER EJERSICIOS
    public static void preguntarEjercicios(double imc) {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.print("\n¿Le gustaría que también le recomendemos ejercicios? (si / no): ");
            String respuestaEj = entrada.next().toLowerCase();

            if (respuestaEj.equals("si")) {
                mostrarEjercicios(imc);//INVOCA LA PARTE QUE CONTIENEN LOS EJERCICIOS
                break;
            } else if (respuestaEj.equals("no")) {
                break;

            } else {
                System.out.println("Introduce (si) o (no) porfavor");
                continue;
            }
        }
    }
//MOSTRAR EJERSICIOS DEPENDIENDO DE SU IMC
    public static void mostrarEjercicios(double imc) {
        //IGUAL QUE EN TODO LO ANTERIOR DEPENDE DE SU IMC LO QUE VA A MOSTRAR

        if (imc < 18.5) {
            System.out.println("\nRutina de ejercicios para una persona con muy bajo peso:\n"
                    + "- Calentamiento: Estiramientos y caminata ligera 5–10 min.\n"
                    + "- Sentadillas (3x10).\n"
                    + "- Lagartijas (3x10).\n"
                    + "- Abdominales 20–30 seg.\n"
                    + "- Zancadas (3x10).\n"
                    + "- Enfriamiento y estiramientos.\n");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("\nEjercicios recomendados para mantener salud:\n"
                    + "- Trotar 30 min.\n"
                    + "- Bicicleta.\n"
                    + "- Sentadillas, lagartijas y abdominales.\n"
                    + "- Practicar algún deporte.\n");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("\nRutina para sobrepeso:\n"
                    + "- Caminata rápida 20–30 min.\n"
                    + "- Sentadillas (3x10).\n"
                    + "- Abdominales (2x10).\n"
                    + "- Bicicleta o baile 20 min.\n");
        } else {
            System.out.println("\nRutina para obesidad:\n"
                    + "- Caminata lenta 15–20 min.\n"
                    + "- Ejercicios con silla (3x10).\n"
                    + "- Movimientos circulares de brazos.\n"
                    + "- Estiramientos suaves.\n");

        }
        System.out.println("");
    }
}
