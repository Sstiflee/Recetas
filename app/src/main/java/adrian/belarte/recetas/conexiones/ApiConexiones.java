package adrian.belarte.recetas.conexiones;

import adrian.belarte.recetas.modelos.Categorias;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiConexiones {
        //le pasalos la url para todas las cotegorias
        @GET("/api/json/v1/1/categories.php")
        Call<Categorias> getCategorias();
}
