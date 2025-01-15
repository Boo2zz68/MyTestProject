package petstore.api;

import retrofit2.Call;
import retrofit2.http.*;
import petstore.dto.GetOrderResponse;
import petstore.dto.GetUser;

public interface ProductService {
    @Headers("accept: application/json")
    @GET("/api/v3/store/order/{id}")
    Call<GetOrderResponse> getOrder(@Path("id") int id);
    @POST("/v2/user/createWithArray")
    Call<GetUser> getUserCreate(@Body GetUser gerUserRequest);
}
