public class Product {

        private String name ;
        private double price;
        private String category ;
        private static int quantity ;
        private char size ;
        private String author ;
        private String color;

        public Product(String name, double price, String category, int quantity, char size, String color) {
            this.name = name;
            this.price = price;
            this.category = category;
            this.quantity = quantity;
            this.size = size;
            this.color = color;
        }

        public Product(String name, double price, String category, int quantity, String author) {
            this.name = name;
            this.price = price;
            this.category = category;
            this.quantity = quantity;
            this.author = author;
        }

        public Product(String name, double price, String category, int quantity) {
            this.name = name;
            this.price = price;
            this.category = category;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }
        public double getPrice() {
            return price;
        }


        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", category='" + category + '\'' +
                    ", quantity=" + quantity +
                    ", size=" + size +
                    ", author='" + author + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    public static boolean buy(){
                if (quantity>0){
                    quantity --; // if a quantity is a string
                    return true;}
                else{
                    return false;
                }

        }
}

