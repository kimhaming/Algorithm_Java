package homework.혼자공부하는자바;

public class ShopService {
    private static ShopService shopService = new ShopService();

    private ShopService() {}    // 생성자

    static ShopService getInstance() {
        return shopService;
    }
}
