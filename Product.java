public class Product {
    private int id;
    private String title;
    private int price;
    private Reviews[] reviews;

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.reviews = new Reviews[10];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public class Reviews{
        private float rating;
        private String body;
        private String title;

        public Reviews(float rating, String body, String title) {
            this.rating = rating;
            this.body = body;
            this.title = title;
        }

        public float getRating() {
            return rating;
        }

        public void setRating(float rating) {
            this.rating = rating;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "Reviews{" +
                    "rating=" + rating +
                    ", body='" + body + '\'' +
                    ", title='" + title + '\'' +
                    '}';
        }


    }

    public void addReview(float rating, String body, String title){
        for(int i=0; i < reviews.length; i++){
            if(reviews[i] == null){
                reviews[i] = new Reviews(rating,body,title);
                System.out.println("Review added successfully");
                return;
            }
        }
        System.out.println("Review list is full");
    }

    public void removeReview(int index){
        if(index >=0 && index <= reviews.length && reviews[index] != null){
            for(int i=index; i < reviews.length - 1; i++){
                reviews[i] = reviews[i+1];
            }
            reviews[reviews.length - 1] = null;
            System.out.println("Review removed successfully");
        }else {
            System.out.println("Invalid review index");
        }
    }

    public void printReviews(){
        int reviewCount = 0;
        for(Reviews review : reviews){
            if(review != null){
                System.out.println(review.toString());
                reviewCount++;
            }
        }
        if(reviewCount == 0){
            System.out.println("No review available");
        }
    }
}
