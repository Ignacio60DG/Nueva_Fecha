import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Pon una fecha con día, mes y año, en ese orden y la fecha te dirá el día siguiente");
        System.out.println("La fecha se comprende desde el 1 D.C hasta 4000 D.C.");

        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int year = sc.nextInt();
        sc.close();

        if(year >= 1 && year <= 4000 && dia>=1 && dia<=30 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 | mes == 8 || mes == 10 || mes == 12)) {
            System.out.println((dia+1)+" / "+mes+" / "+year);
        } else if (year >= 1 && year <= 4000 && dia == 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 | mes == 8 || mes == 10)) {
            System.out.println(1+" / "+(mes+1)+" / "+year);
        }else if (year >= 1 && year <= 4000 && dia == 31 && mes == 12){
            System.out.println(1+" / "+1+" / "+(year+1));
        }else if (year >= 1 && year <= 4000 && dia>=1 && dia<=29 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)){
            System.out.println((dia+1)+" / "+mes+" / "+year);
        }else if (year >= 1 && year <= 4000 && dia == 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)){
            System.out.println(1+" / "+(mes+1)+" / "+year);
        }else if (year >= 1 && year <= 4000 && dia>=1 && dia < 29 && mes == 2 && year%4 == 0){
            System.out.println((dia+1)+" / "+mes+" / "+year);
        }else if (year >= 1 && year <= 4000 && dia == 29 && mes == 2 && year%4 == 0){
            //envez de else aquí debería de ser solo if y poner solo (día == 29)
            System.out.println(1+" / "+(mes+1)+" / "+year);
        }else if (year >= 1 && year <= 4000 && dia>=1 && dia < 28 && mes == 2 && year%4 != 0){
            System.out.println((dia+1)+" / "+mes+" / "+year);
        }else if (year >= 1 && year <= 4000 && dia == 28 && mes == 2 && year%4 != 0){
            ////envez de else aquí debería de ser solo if y poner solo (día == 28)
            System.out.println(1+" / "+(mes+1)+" / "+year);
        }else{
            System.out.println("Conocimiento de fechas no tener tú.");
            System.out.println("Tú tenter que seguir camino de la fecha.");
            System.out.println("Si no mensaje este te saldra... ¡Que la fecha te acompañe!");
        }
    }
}