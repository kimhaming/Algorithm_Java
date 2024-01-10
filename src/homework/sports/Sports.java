package homework.sports;

public class Sports {
    private String name;
    private int number;
    private Type type;

    public Sports(String name, int number, Type type) {
        this.name = name;
        this.type = type;

        if (type == Type.SOCCER) {
            if (number == 11) {
                this.number = number;
            } else {
                throw new IllegalArgumentException();
            }
        } else if (type == Type.BASKETBALL) {
            if (number == 5) {
                this.number = number;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            if (number == 6) {
                this.number = number;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
    // toString 메서드 추가
    @Override
    public String toString () {
        return "Sports{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", type=" + type +
                '}';
    }
}
