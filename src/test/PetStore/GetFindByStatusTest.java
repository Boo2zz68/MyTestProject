package PetStore;

import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import petstore.MyUtils;
import petstore.api.ProductService;
import petstore.dto.Pet;
import retrofit2.Response;

import java.util.ArrayList;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class GetFindByStatusTest {
    static ProductService productService;
    @BeforeAll
    static void beforeAll() {
        productService = MyUtils.getRetrofit().create(ProductService.class);
    }
    @SneakyThrows
    @Test
    void getFindByStatusSold() {
        Response<ArrayList<Pet>> response = productService.getFindByStatus("sold").execute();
        assertThat(response.code(), equalTo(200));
    }
    @SneakyThrows
    @Test
    void getFindByStatusPending() {
        Response<ArrayList<Pet>> response = productService.getFindByStatus("pending").execute();
        assertThat(response.code(), equalTo(200));
    }
    @SneakyThrows
    @Test
    void getFindByStatusAvailable() {
        Response<ArrayList<Pet>> response = productService.getFindByStatus("available").execute();
        assertThat(response.code(), equalTo(200));
    }
    @SneakyThrows
    @Test
    void getFindByStatusNegative() {
        Response<ArrayList<Pet>> response = productService.getFindByStatus("qwerty").execute();
        assertThat(response.code(), equalTo(400));
    }
}
