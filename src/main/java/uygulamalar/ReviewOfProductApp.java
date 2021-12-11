package uygulamalar;

import dto.ProductReviewDto;
import entityservice.ReviewService;
import java.util.List;

public class ReviewOfProductApp {

  public static void main(String[] args) {

    ReviewService reviewService = new ReviewService();

    // find reviews by product id
    List<ProductReviewDto>  listOfReviews = reviewService.findReviewOfProduct(5L);

    for(ProductReviewDto productReviewDto : listOfReviews){
      System.out.println(productReviewDto.toString());
    }
  }
}
