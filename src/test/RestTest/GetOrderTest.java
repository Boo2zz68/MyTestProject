package RestTest;

import lombok.SneakyThrows;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import petstore.MyUtils;
import petstore.api.ProductService;
import petstore.dto.GetOrderResponse;
import retrofit2.Response;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class GetOrderTest {
    static ProductService productService;
    @BeforeAll
    static void beforeAll() {
        productService = MyUtils.getRetrofit().create(ProductService.class);
    }
    @SneakyThrows
    @Test
    void getOrderTest() {
        Response<GetOrderResponse> response = productService.getOrder(10).execute();
        assertThat(response.body().getId(), equalTo(10));
    }
    @SneakyThrows
    @Test
    void getOrderTestNegative() {
        Response<GetOrderResponse> response = productService.getOrder(5).execute();
        assertThat(response.code(), equalTo(404));
    }
}
