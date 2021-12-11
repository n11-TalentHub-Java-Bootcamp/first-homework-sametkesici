package uygulamalar;

import dto.CountOfProductReviewsDto;
import entityservice.ReviewService;
import java.util.List;

public class CountOfReviewsApp {

  public static void main(String[] args) {

    ReviewService reviewService = new ReviewService();
    List<CountOfProductReviewsDto> countOfReviews = reviewService.countOfReviews();

    for (CountOfProductReviewsDto count : countOfReviews)
    {
      System.out.println(count);
    }
  }
}
