package uygulamalar;

import dto.UserReviewsDto;
import entityservice.ReviewService;
import java.util.List;

public class UserReviewsApp {

  public static void main(String[] args) {

    ReviewService reviewService = new ReviewService();


    //find by user id
    List<UserReviewsDto> userReviewsList= reviewService.userReviews(1L);

    for (UserReviewsDto userReview : userReviewsList){
      System.out.println(userReview);
    }
  }
}
