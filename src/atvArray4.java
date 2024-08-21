public class atvArray4 {
public static void main(String[] args) {
    double[] notas = {7.5, 8, 9.8, 8, 6, 10};
    double media = calcMedias(notas);
    System.out.println("A media da sala e:"+ media);
}
public static double calcMedias(double[] array){
    double soma = 0;
    for(double notas: array){
    soma += notas;
    }
 return soma /array.length;
}
}
