package ex.f.exception.ex03;


    public class Book{
        private String title;
        private String kind;
        private int rentalPrice;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public int getRentalPrice() {
            return rentalPrice;
        }

        public void setRentalPrice(int rentalPrice) {
            this.rentalPrice = rentalPrice;
        }

        @Override
        public String toString() {
            return "Book [title =" + title + " kind =" + kind + "rentalPrice =" + rentalPrice + "]";
        }
    }
