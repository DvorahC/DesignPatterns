package Builder;

/**
 * Demo of the builder Pattern with the same idea of having a constructor
 */

public class LunchOrder {

    public static class Builder {
            // implement the builder inside this class
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder (){
        }

        //this is the implementation!!!!!
        public LunchOrder build(){
            return new LunchOrder(this);

        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
            //we return an instance of this, we return the Builder object we are creating
        }
        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }
        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }
        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }
    }

    private  final String bread;
    private  final String condiments;
    private final String dressing;
    private final String meat;

    private LunchOrder(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }
    public String getCondiments() {
        return condiments;
    }
    public String getDressing() {
        return dressing;
    }
    public String getMeat() {
        return meat;
    }
}
