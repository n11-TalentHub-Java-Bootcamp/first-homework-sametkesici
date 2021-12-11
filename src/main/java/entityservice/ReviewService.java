package entityservice;

import dao.ReviewDao;
import dto.CountOfProductReviewsDto;
import dto.ProductReviewDto;
import dto.UserReviewsDto;
import java.util.List;

public class ReviewService {

  private final ReviewDao reviewDao;

  public ReviewService (){
    reviewDao = new ReviewDao();
  }

  public List<ProductReviewDto> findReviewOfProduct(long productId){
    return reviewDao.findReviewOfProduct(productId);
  }

  public List<CountOfProductReviewsDto> countOfReviews(){
    return reviewDao.countOfReviews();
  }

  public List<UserReviewsDto> userReviews (long userId){
    return reviewDao.userReviews(userId);
  }


}
