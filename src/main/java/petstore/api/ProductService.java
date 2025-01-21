package petstore.api;

import petstore.dto.Pet;
import retrofit2.Call;
import retrofit2.http.*;
import petstore.dto.GetOrderResponse;
import petstore.dto.PostUserCreate;

import java.util.ArrayList;

public interface ProductService {
    @Headers("accept: application/json")
    @GET("/api/v3/store/order/{id}")
    Call<GetOrderResponse> getOrder(@Path("id") int id);
    @Headers("accept: application/json")
    @GET("/api/v3/pet/{id}")
    Call<Pet> getPet(@Path("id") int id);
    @Headers("accept: application/json, Content-Type: application/json")
    @POST("/api/v3/user")
    Call<PostUserCreate> getUserCreate(@Body PostUserCreate getUserRequest);
    @POST("/api/v3/pet")
    Call<Pet> getPetCreate(@Body Pet getPetRequest);
    @GET("/api/v3/pet/findByStatus")
    Call<ArrayList<Pet>> getFindByStatus(@Query("status") String status);

}
