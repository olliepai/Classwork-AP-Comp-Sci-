package inClassExercise;

public class ProductReview {
	private String prodName;
	private String revName;
	private int rating;
	private String review;
	
	public ProductReview(String prodName, String revName, int rating, String review) {
		this.prodName = prodName;
		this.revName = revName;
		this.rating = rating;
		this.review = review;
	}
	
	public String getProdName() {
		return prodName;
	}
	
	public String getRevName() {
		return revName;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String getReview() {
		return review;
	}
	
	public void  setReview(String review) {
		this.review = review;
	}
}
