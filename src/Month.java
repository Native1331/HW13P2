public class Month {
    public static class Month{
        private final String name;
        private final int quantityOfDays;
        private final int quantityOfWorkDays;

        private Month(String name, int quantityOfDays, int quantityOfWorkDays) {
            this.name=name;
            this.quantityOfDays = quantityOfDays;
            this.quantityOfWorkDays = quantityOfWorkDays;);
        }

        public String getName() {
            return name;
        }

        public int getQuantityOfDays() {
            return quantityOfDays;
        }

        public int getQuantityOfWorkDays() {
            return quantityOfWorkDays;
        }
    }

}
