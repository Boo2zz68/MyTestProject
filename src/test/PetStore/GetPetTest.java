package PetStore;

import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import petstore.MyUtils;
import petstore.api.ProductService;
import petstore.dto.GetOrderResponse;
import petstore.dto.Pet;
import retrofit2.Response;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class GetPetTest {
    static ProductService productService;
    @BeforeAll
    static void beforeAll() {
        productService = MyUtils.getRetrofit().create(ProductService.class);
    }
    @SneakyThrows
    @Test
    void getPetTest() {
        Response<Pet> response = productService.getPet(10).execute();
        assertThat(response.code(), equalTo(200));
        assertThat(response.body().getId(), equalTo(10));
    }
    @SneakyThrows
    @Test
    void getPetTestNegative() {
        Response<GetOrderResponse> response = productService.getOrder(331112).execute();
        assertThat(response.code(), equalTo(404));
    }
}
