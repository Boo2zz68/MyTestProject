package petstore;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.InputStream;
import java.util.Properties;

@UtilityClass
public class MyUtils {
    Properties prop = new Properties();
    private static InputStream configfile;
    @SneakyThrows
    public String getBaseUrl() {
        prop.load(configfile);
        return prop.getProperty("url");
    }
    //Настройка ретрофита
    public Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(getBaseUrl())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }
}
