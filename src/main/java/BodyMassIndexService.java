public class BodyMassIndexService {
    double calculate (double weight, double heightSm) {
        double index = weight / (heightSm * heightSm / 10_000); // делим на 10_000, чтобы перейти из см2 в м2
        return index;
    }
}
