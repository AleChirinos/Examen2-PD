package segundoParcial.fila1.ejercicio2Mediator;

public class Cliente {
    public static void main (String[] args){
        Chat chat= new Chat();
        chat.setNotify("TODOS");

        Estudiante estudiante1 = new Estudiante(chat);
        estudiante1.setName("Jorge");
        estudiante1.setMatricula(123);
        Estudiante estudiante2 = new Estudiante(chat);
        estudiante2.setName("Miguel");
        estudiante2.setMatricula(456);
        Estudiante estudiante3 = new Estudiante(chat);
        estudiante3.setName("Pablo");
        estudiante3.setMatricula(789);

        Docente docente1 = new Docente(chat);
        docente1.setName("Juan");
        docente1.setCi(1234567);
        Docente docente2 = new Docente(chat);
        docente2.setName("Cecilia");
        docente2.setCi(2341235);
        Docente docente3 = new Docente(chat);
        docente3.setName("Veronica");
        docente3.setCi(3654332);

        Administrativos administrativo1 = new Administrativos(chat);
        administrativo1.setName("Mariela");
        administrativo1.setCargo("Directora");
        Administrativos administrativo2 = new Administrativos(chat);
        administrativo2.setName("Geraldine");
        administrativo2.setCargo("Coordinadora");
        Administrativos administrativo3 = new Administrativos(chat);
        administrativo3.setName("Natalia");
        administrativo3.setCargo("Encargada");

        chat.addColleague(estudiante1);
        chat.addColleague(estudiante2);
        chat.addColleague(estudiante3);
        chat.addColleague(docente1);
        chat.addColleague(docente2);
        chat.addColleague(docente3);
        chat.addColleague(administrativo1);
        chat.addColleague(administrativo2);
        chat.addColleague(administrativo3);

        estudiante1.send("Hola");
        docente1.send("¿Como estas?");
        administrativo1.send("¡Que tengas un lindoi dia!");
    }
}
