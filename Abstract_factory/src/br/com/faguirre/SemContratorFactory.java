package br.com.faguirre;

public class SemContratorFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)){
            return new Brasília(100, "cheio", "amarela");
        }else {
            return new GolfGTI(230, "cheio", "Preto");
        }
    }
}
