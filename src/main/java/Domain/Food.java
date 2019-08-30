package Domain;

public class Food {
    private String menuType;
    private String menuName;
    private Double menuPrice;

    public Food(Builder builder) {
        this.menuName = menuName;
        this.menuType = menuType;
        this.menuPrice = menuPrice;

    }


    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Double getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(Double menuPrice) {
        this.menuPrice = menuPrice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String menuType;
        private String menuName;
        private Double menuPrice;

        public Builder withMenuType(String menuType) {
            this.menuType = menuType;
            return this;
        }

        public Builder withMenuName(String menuName) {
            this.menuName = menuName;
            return this;
        }

        public Builder withMenuPrice(double menuPrice) {
            this.menuPrice = menuPrice;
            return this;
        }

        public Food build() {
            return new Food(this);
        }

    }

    @Override
    public String toString() {
        return "Food{" +
                "menuType='" + menuType + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                '}';
    }
}
