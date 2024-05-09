/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg251;

/**
 *
 * @author Shrou
 */
public class CakeReview {
  private String reviewerName;
  private String reviewText;
  private int rating; // Out of 5 stars
  

  public CakeReview(String reviewerName, String reviewText, int rating) {
    this.reviewerName = reviewerName;
    this.reviewText = reviewText;
    this.rating = rating;
  }

  public String getReviewerName() {
    return reviewerName;
  }

  public void setReviewerName(String reviewerName) {
    this.reviewerName = reviewerName;
  }

  public String getReviewText() {
    return reviewText;
  }

  public void setReviewText(String reviewText) {
    this.reviewText = reviewText;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    if (rating < 0 || rating > 5) {
      throw new IllegalArgumentException("Rating must be between 0 and 5");
    }
    this.rating = rating;
  }
   public String addString() {
    return "Review by " + reviewerName + "\nRating: " + rating + " stars\n" + reviewText;
  }
  
  @Override
  public String toString() {
    return "";
  }
    
}
