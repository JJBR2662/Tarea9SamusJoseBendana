package tarea9samusjosebendaña;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea9SamusJoseBendaña {

    public static void main(String[] args) {
        Scanner enteros = new Scanner(System.in);
        Scanner dobles = new Scanner(System.in);
        Scanner orac = new Scanner(System.in);
        Traje samus = new Traje();
        ArrayList<Traje> trajes = new ArrayList();
        int menu;
        do {
            System.out.println("""
                               1- Crear traje
                               2- Mostrar traje
                               3- Jugar
                               4- Modificar cosas
                               5- Eliminar Trajes
                               6- Salir
                               """);
            System.out.print("Ingrese que quiere hacer: ");
            menu = enteros.nextInt();
            switch (menu) {
                case 1:
                    trajes.add(creartraje(new Traje()));
                    break;
                case 2:
                    if (trajes.isEmpty()) {
                        System.out.println("No hay trajes");
                    }else{
                        for (Traje f : trajes) {
                            System.out.println(f);
                        }
                    }
                    break;
                case 3:
                    if (trajes.isEmpty()) {
                        System.out.println("No hay trajes para jugar");
                    } else {
                        int quetra;
                        do {
                            for (Traje t : trajes) {
                                System.out.println(trajes.indexOf(t) + "- " + t);
                            }
                            System.out.print("Ingrese con que traje quiere jugar: ");
                            quetra = enteros.nextInt();
                            if (quetra >= trajes.size() || quetra < 0) {
                                System.out.println("Opcion no valida, ingrese de nuevo");
                            }
                        } while (quetra >= trajes.size() || quetra < 0);
                        Traje hola = jugar(trajes.get(quetra));
                        if (hola.getMedirdanio()>=100 || hola.getMedircarga()<=0 || hola.getMediroxido()>=100 || hola.getMedirfuerza()<=0) {
                            trajes.remove(quetra);
                        }else{
                            trajes.get(quetra).setBeam(hola.getBeam());
                            trajes.get(quetra).setLista(hola.getLista());
                            trajes.get(quetra).setMedircarga(hola.getMedircarga());
                            trajes.get(quetra).setMedirdanio(hola.getMedirdanio());
                            trajes.get(quetra).setMedirfuerza(hola.getMedirfuerza());
                            trajes.get(quetra).setMediroxido(hola.getMediroxido());
                            trajes.get(quetra).setMissil(hola.getMissil());
                        }
                    }
                    break;
                case 4:
                    if (trajes.isEmpty()) {
                        System.out.println("No hay trajes que modificar");
                    } else {
                        int hacer;
                        int traje;
                        do {
                            System.out.println("""
                                           1- Modificar la velocidad de disparo de un Light Beam 
                                           2- Modificar la funcion de un Add-On""");
                            System.out.print("Ingrese que quiere hacer: ");
                            hacer = enteros.nextInt();
                            do {
                                for (Traje d : trajes) {
                                    System.out.println(trajes.indexOf(d) + "- " + d);
                                }
                                System.out.print("Ingrese que traje quiere modificar: ");
                                traje = enteros.nextInt();
                            } while (traje >= trajes.size() || traje < 0);
                            switch (hacer) {
                                case 1:
                                    if (trajes.get(traje).getBeam() instanceof Light) {
                                        System.out.print("Ingrese la nueva velocidad: ");
                                        double newvel = dobles.nextDouble();
                                        ((Light) (trajes.get(traje).getBeam())).setVelocidadshots(newvel);
                                        System.out.println("Se ha modificado perfectamente");
                                    }
                                    break;
                                case 2:
                                    if (trajes.get(traje).getLista().isEmpty()) {
                                        System.out.println("No hay Add-Ons en el traje");
                                    } else {
                                        int list;
                                        do {
                                            for (Addons q : trajes.get(traje).getLista()) {
                                                System.out.println(trajes.get(traje).getLista().indexOf(q) + "- " + q);
                                            }
                                            System.out.print("Ingrese que Add-On quiere modificar: ");
                                            list = enteros.nextInt();
                                        } while (list >= trajes.get(traje).getLista().size() || list < 0);
                                        System.out.print("Ingrese la nueva funcion: ");
                                        String nuevafun = orac.nextLine();
                                        trajes.get(traje).getLista().get(list).setFuncion(nuevafun);
                                        System.out.println("Se ha cambiado la funcion");
                                    }
                                    break;
                                default:
                                    System.out.println("Opcion no valida, ingrese de nuevo");
                                    break;
                            }
                        } while (hacer > 2 || hacer < 1);
                    }
                    break;
                case 5:
                    if (trajes.isEmpty()) {
                        System.out.println("No hay trajes que eliminar");
                    } else {
                        int elim;
                        do {
                            for (Traje d : trajes) {
                                System.out.println(trajes.indexOf(d) + "- " + d);
                            }
                            System.out.print("Ingrese que traje quiere eliminar: ");
                            elim = enteros.nextInt();
                        } while (elim >= trajes.size() || elim < 0);
                        trajes.remove(elim);
                        System.out.println("Se ha eliminado el traje perfectamente");
                    }
                    break;
                case 6:
                    System.out.println("Saliendoooooooooo............");
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese de nuevo");
                    break;
            }
        } while (menu != 6);
        System.out.println("Ha salido perfectamente");
    }

    public static Traje creartraje(Traje samus) {
        Scanner enteros = new Scanner(System.in);
        Scanner orac = new Scanner(System.in);
        Scanner dobles = new Scanner(System.in);
        Scanner car = new Scanner(System.in);
        System.out.println("El medidor de carga y de fuerza empezaran con 100 y se iran restando, mientras el de danio y oxido empezaran en 0 y se iran sumando");
        samus.setMedircarga(100);
        samus.setMedirdanio(0);
        samus.setMedirfuerza(100);
        samus.setMediroxido(0);
        int beam;
        System.out.println("CREANDO EL BEAM DEL TRAJE");
        System.out.println();
        do {
            System.out.println("""
                               1- Plasma Beam
                               2- Light Beam
                               3- Dark Beam
                               """);
            System.out.print("Ingrese que tipo de Beam quiere: ");
            beam = enteros.nextInt();
            if (beam > 3 || beam < 1) {
                System.out.println("Opcion no valida, ingrese de nuevo");
            } else {
                System.out.print("Ingrese el tipo de carga: ");
                String tipocarga = orac.nextLine();
                System.out.print("Ingrese el peso: ");
                double peso = dobles.nextDouble();
                System.out.print("Ingrese la potencia en watts: ");
                int potencia = enteros.nextInt();

                switch (beam) {
                    case 1:
                        System.out.print("Ingrese el tamanio del tanque en lts: ");
                        int tamanio = enteros.nextInt();
                        System.out.print("Ingrese el tiempo de carga en segundo: ");
                        int tiempo = enteros.nextInt();
                        System.out.print("Ingrese el numero de veces que puede disparar sin calentarse: ");
                        int veces = enteros.nextInt();
                        samus.setBeam(new Plasma(tamanio, tiempo, veces, tipocarga, peso, potencia));
                        System.out.println("SE HA CREADO EL PLASMA BEAM");
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println("ADVERTENCIA: SI EL NUMERO DE FOTONES ES MENOR DE 1 O MAYOR A 10, SE APLICARA AUTOMATICAMENTE 1");
                        System.out.println("----------------------------------------------------------------------------------------------");
                        System.out.println();
                        System.out.print("Ingrese el indice de fotones: ");
                        int numfotones = enteros.nextInt();
                        System.out.print("Ingrese la velocidad del disparo: ");
                        double velocidaddisparo = dobles.nextDouble();
                        System.out.print("Ingrese cuanto tiene de municion: ");
                        int municion = enteros.nextInt();
                        Light l = new Light(numfotones, municion, velocidaddisparo, tipocarga, peso, potencia);
                        l.setNumfotones(numfotones);
                        samus.setBeam(l);
                        System.out.println("SE HA CREADO EL LIGHT BEAM");
                        break;
                    case 3:
                        System.out.print("Ingrese la velocidad de disparo: ");
                        double vel = dobles.nextDouble();
                        System.out.print("Ingrese la municion disponible: ");
                        int mun = enteros.nextInt();
                        samus.setBeam(new Dark(vel, mun, tipocarga, peso, potencia));
                        System.out.println("SE HA CREADO EL DARK BEAM");
                        break;
                    default:
                        System.out.println("Opcion no valida, ingrese de nuevo");
                        break;
                }
            }
        } while (beam > 3 || beam < 1);
        System.out.println("CREANDO EL MISSILE LAUNCHER DEL TRAJE");
        MissileLauncher launcher = new MissileLauncher();
        System.out.println();
        System.out.print("Ingrese la capacidad de misiles: ");
        int capacidad = enteros.nextInt();
        launcher.setCapacidadmisiles(capacidad);
        char resp;
        char char2;
        char char1 = 's';
        boolean aniadir;
        do {
            if (launcher.getListamisiles().isEmpty() && capacidad > 0) {
                System.out.print("Quiere aniadir algun misil [s/n]: ");
                resp = car.next().charAt(0);
                switch (resp) {
                    case 's', 'S':

                        do {
                            System.out.print("Soporta el misil regular[s/n]? ");
                            char1 = car.next().charAt(0);
                            if (char1 != 's' && char1 != 'S' && char1 != 'n' && char1 != 'N') {
                                System.out.println("Opcion no valida, ingrese de nuevo");
                            }
                        } while (char1 != 's' && char1 != 'S' && char1 != 'n' && char1 != 'N');

                        do {
                            System.out.print("Soporta el super misil[s/n]? ");
                            char2 = car.next().charAt(0);
                            if (char2 != 's' && char2 != 'S' && char2 != 'n' && char2 != 'N') {
                                System.out.println("Opcion no valida, ingrese de nuevo");
                            }
                        } while (char2 != 's' && char2 != 'S' && char2 != 'n' && char2 != 'N');

                        boolean soportararegular;
                        if (char1 == 's' || char1 == 'S') {
                            soportararegular = true;
                        } else {
                            soportararegular = false;
                        }
                        launcher.setSoportararegular(soportararegular);

                        boolean soportarasuper;
                        if (char2 == 's' || char2 == 'S') {
                            soportarasuper = true;
                        } else {
                            soportarasuper = false;
                        }
                        launcher.setSoportarasuper(soportarasuper);
                        int cual;
                        if (soportararegular == false && soportarasuper == false) {
                            System.out.println("No se soporta ni un misil");
                        } else {
                            do {
                                do {
                                    System.out.println("""
                                                   1- Regular Missile
                                                   2- Super Missile
                                                   """);
                                    System.out.print("Ingrese que tipo de misil quiere aniadir: ");
                                    cual = enteros.nextInt();
                                    if (cual > 2 || cual < 1) {
                                        System.out.println("Opcion no valida, ingrese de nuevo");
                                    }
                                } while (cual > 2 || cual < 1);

                                switch (cual) {
                                    case 1:
                                        if (soportararegular) {
                                            System.out.print("Ingrese la velocidad de desplazamiento: ");
                                            double velocidad = dobles.nextDouble();
                                            System.out.print("Ingrese su poder explosivo medido en G: ");
                                            double poder = dobles.nextDouble();
                                            System.out.print("Ingrese el tamanio del misil: ");
                                            double tamanio = dobles.nextDouble();
                                            launcher.getListamisiles().add(new Regularmisil(tamanio, velocidad, poder));
                                        } else {
                                            System.out.println("No soporta el misil regular");
                                        }
                                        break;
                                    case 2:
                                        if (soportarasuper) {
                                            System.out.print("Ingrese la velocidad de desplazamiento: ");
                                            double velocidad2 = dobles.nextDouble();
                                            System.out.print("Ingrese su poder explosivo medido en G: ");
                                            double poder2 = dobles.nextDouble();
                                            System.out.print("Ingrese de que tipo de material esta hecho: ");
                                            String mat = orac.nextLine();
                                            launcher.getListamisiles().add(new Supermisil(mat, velocidad2, poder2));
                                        } else {
                                            System.out.println("No soporta el super misil");
                                        }
                                        break;
                                }
                                do {
                                    aniadir = launcher.addmisiles(launcher.getListamisiles());
                                    if (aniadir) {
                                        System.out.print("Desea ingresar otro misil[s/n]: ");
                                        resp = car.next().charAt(0);
                                        if (resp != 's' && resp != 'S' && resp != 'n' && resp != 'N') {
                                            System.out.println("Opcion no valida, ingrese de nuevo");
                                        }
                                    } else {
                                        System.out.println("Ya no se pueden aniadir misiles, la caja de misiles esta llena");
                                        resp = 'n';
                                    }

                                } while (resp != 's' && resp != 'S' && resp != 'n' && resp != 'N');
                            } while (resp == 's' || resp == 'S');
                        }
                        break;
                    case 'n', 'N':
                        System.out.println("Ok, 0 misiles");
                        break;
                    default:
                        System.out.println("Opcion no valida, ingrese de nuevo");
                        break;
                }
            } else {
                System.out.println("no se pueden meter misiles");
                resp = 'n';
            }
        } while (resp != 's' && resp != 'S' && resp != 'n' && resp != 'N');
        samus.setMissil(launcher);
        char resp2;
        do {
            System.out.print("Desea ingresar Add-Ons[s/n]: ");
            resp2 = car.next().charAt(0);
            if (resp2 != 's' && resp2 != 'S' && resp2 != 'n' && resp2 != 'N') {
                System.out.println("Opcion no valida ingrese de nuevo");
            }
        } while (resp2 != 's' && resp2 != 'S' && resp2 != 'n' && resp2 != 'N');
        switch (resp2) {
            case 's', 'S':
                do {
                    System.out.print("Ingrese el nombre del Add-On: ");
                    String name = orac.nextLine();
                    System.out.print("Ingrese la funcion del Add-On:");
                    String funcion = orac.nextLine();
                    System.out.print("Ingrese la parte del cuerpo donde se agregara el Add-On: ");
                    String cuerpo = orac.nextLine();
                    samus.getLista().add(new Addons(name, funcion, cuerpo));
                    do {
                        System.out.print("Desea ingresar otro Add-On[s/n]: ");
                        resp2 = car.next().charAt(0);
                        if (resp2 != 's' && resp2 != 'S' && resp2 != 'n' && resp2 != 'N') {
                            System.out.println("Opcion no valida, ingrese de nuevo");
                        }
                    } while (resp2 != 's' && resp2 != 'S' && resp2 != 'n' && resp2 != 'N');

                } while (resp2 == 's' || resp2 == 'S');
                break;
            case 'n', 'N':
                System.out.println("Ok, 0 Add-Ons");
                break;
        }
        System.out.println("Se ha creado el traje de Samus");
        return samus;
    }

    public static Traje jugar(Traje samus) {
        Scanner enteros = new Scanner(System.in);
        int menu;
        boolean muerte = false;
        do {
            System.out.println("""
                               1- Atacar
                               2- Ver el estado del traje
                               3- Abandonar mision
                               """);
            System.out.print("Ingrese que quiere hacer: ");
            menu = enteros.nextInt();
            switch (menu) {
                case 1:
                    int cual;
                    do {
                        System.out.println("""
                                           1- Beam
                                           2- Missiles
                                           3- Volver
                                           """);
                        System.out.println("Ingrese que ataque va a hacer: ");
                        cual = enteros.nextInt();
                        switch (cual) {
                            case 1:
                                if (samus.getBeam().muni() == 0) {
                                    System.out.println("Ya no tiene mas municion");
                                } else {
                                    if (samus.getBeam() instanceof Plasma) {
                                        ((Plasma) samus.getBeam()).setDisparosseguidos(((Plasma) samus.getBeam()).getDisparosseguidos() - 1);
                                        samus = samus.getBeam().atacar(samus);
                                        System.out.println("Se ha tirado el Plasma Beam");
                                    } else if (samus.getBeam() instanceof Light) {
                                        ((Light) samus.getBeam()).setMunicion(((Light) samus.getBeam()).getMunicion() - 1);
                                        samus = samus.getBeam().atacar(samus);
                                        System.out.println("Se ha tirado el Light Beam");
                                    } else if (samus.getBeam() instanceof Dark) {
                                        ((Dark) samus.getBeam()).setMunicion(((Dark) samus.getBeam()).getMunicion() - 1);
                                        samus = samus.getBeam().atacar(samus);
                                        System.out.println("Se ha tirado el Dark Beam");
                                    }
                                }
                                if (samus.getMedirdanio() >= 100) {
                                    System.out.println("El traje ya no puede mas, has sufrido el 100% de danio");
                                    muerte = true;
                                } else if (samus.getMedircarga() <= 0) {
                                    System.out.println("El traje se quedo sin carga");
                                    muerte = true;
                                } else if (samus.getMediroxido() >= 100) {
                                    System.out.println("El traje se ha oxidado y ya no puede mas");
                                    muerte = true;
                                } else if (samus.getMedirfuerza() <= 0) {
                                    System.out.println("El traje ya no tiene fuerzas");
                                    muerte = true;
                                } else {
                                    muerte = false;
                                }
                                break;

                            case 2:
                                if (samus.getMissil().getListamisiles().isEmpty()) {
                                    System.out.println("No hay misiles en el traje");
                                } else {
                                    int que;
                                    do {
                                        for (Misiles m : samus.getMissil().getListamisiles()) {
                                            System.out.println(samus.getMissil().getListamisiles().indexOf(m) + "- " + m);
                                        }
                                        System.out.println("Ingrese que misil va a tirar: ");
                                        que = enteros.nextInt();
                                        if (que >= samus.getMissil().getListamisiles().size() || que < 0) {
                                            System.out.println("Opcion no valida, ingrese de nuevo");
                                        }
                                    } while (que >= samus.getMissil().getListamisiles().size() || que < 0);
                                    samus.getMissil().getListamisiles().get(que).atacar(samus);
                                    samus.getMissil().getListamisiles().remove(que);
                                    System.out.println("Se ha usado el misil");
                                }
                                break;

                            case 3:
                                System.out.println("Volviendo atras...");
                                break;
                            default:
                                System.out.println("Opcion no valida, ingrese de nuevo");
                                break;
                        }

                    } while (cual != 3 && muerte == false);
                    break;
                case 2:
                    System.out.println(samus.estado());
                    break;
                case 3:
                    System.out.println("Abandonando mision, no caeremos a la proxima");
                    break;
            }
        } while (menu != 3&&muerte==false);

        return samus;
    }
}
