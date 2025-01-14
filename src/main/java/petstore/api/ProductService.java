package petstore.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import petstore.dto.GetOrder;

public interface ProductService {
    @GET("/store/order/{id}")
    Call<GetOrder> getPet(@Path("id") int id);
}
