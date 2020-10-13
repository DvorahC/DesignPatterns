package Builder;

public class LunchOrderBuilderDemo {

    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("wheat").condiments("LETTUCE").dressing("mayonnaise").meat("turkey");

        LunchOrder LunchOrderBuilder = builder.build();

        System.out.println(LunchOrderBuilder.getBread());
        System.out.println(LunchOrderBuilder.getCondiments());
        System.out.println(LunchOrderBuilder.getDressing());
        System.out.println(LunchOrderBuilder.getMeat());
    }
}
