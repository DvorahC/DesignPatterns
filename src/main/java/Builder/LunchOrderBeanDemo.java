package Builder;

public class LunchOrderBeanDemo {

    public static void main(String[] args) {
        LunchOrderBean lunchOrderBean = new LunchOrderBean();
        lunchOrderBean.setBread("white");
        lunchOrderBean.setCondiments("moustard");
        lunchOrderBean.setDressing("mayonnaise");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
    }



}
