public class BodyMassIndexService {
    int calculate (int weight, int heightSm) {
        int index = weight / (heightSm * heightSm / 10_000); // делим на 10_000, чтобы перейти из см2 в м2
        return index;
    }
}
