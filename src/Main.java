import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //¡El bot está pasando por una catástrofe financiera! Tiene 10.000 libras esterlinas.
        //Quiere vender todo lo antes posible Antes de que el estado de Gran Bretaña se derrumbe
        // pero es un poco codicioso.
        //Solo venderá sus libras cuando el tipo de cambio sea superior a 1,15 (poundToEuro)

        //En los días que vende, solo puede vender 1000 libras por euros.
        //Escribir un ciclo while
        //Use el cálculo para el tipo de cambio a continuación
        //1 + (Math.random() * 0.2);
        //Para recalcular nuestra tarifa todos los días (una vez por bucle)
        //Imprime el número de días que tarda nuestro bot en vender sus libras

        double librasActual, tipoCambio, librasVender, cambioMin;
        int dias;
        librasActual = 10000;
        librasVender = 1000;
        cambioMin = 1.15;
        dias = 1;

        while(librasActual>0){//iniciamos el ciclo mientras que nuestro saldo sea mayor a 0, sabemos que iniciamos con 10000
            tipoCambio = 1+(Math.random()* 0.2);//establecemos el tipo de cambio que variara cada dia
            if (tipoCambio>cambioMin){//entramos en la condicion solo si el tipo de cambio es mayor al cambio minimo para poder vender
                System.out.println("Dia: "+dias+", Iniciamos con un total de "+librasActual);
                librasActual -= librasVender;//restamos nuestras libras actuales, con la cantidad que podemos vender por dia.
                System.out.println(", el tipo de cambio es: "+tipoCambio+", despues de vender 1000 libras, nos resta: "+librasActual);
                dias++;
            }else{
                System.out.println("Dia "+dias+", el tipo de cambio es: "+tipoCambio+" por lo tanto no podemos vender");
                //si no entra en la condicion anterior, imprimimos que no podemos vender y contabilizamos 1 dia mas.
                dias++;
            }
        }
        System.out.println("Logramos vender las 10000 libras en: "+(dias-1)+" dias.");
        //imprimimos dias-1 porque en el if se agrega un dia al final (dias++) para contabilizar el siguiente dia.
    }
}