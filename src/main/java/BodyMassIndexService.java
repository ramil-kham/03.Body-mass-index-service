public class BodyMassIndexService {
    int calculate (int weight, int height) {
        int index = weight / (height * height / 10_000);
        return index;
    }
}
