package adrian.belarte.recetas.conexiones;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitObject {
    //coger la base de la URL de la API
    public static final String BASE_URL = "https://www.themealdb.com";
    //metodo para obtener la base de la URL
    public static Retrofit getConexion(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
