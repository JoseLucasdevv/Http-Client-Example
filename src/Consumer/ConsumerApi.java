package Consumer;

import ObjectHttp.ObjectHttp;

import java.io.IOException;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumerApi {
    private HttpResponse<String> response = null;
    private HttpClient client = HttpClient.newHttpClient();
    private HttpRequest request = new ObjectHttp().getRequest();
    public String ApiConsumer() throws IOException, InterruptedException{
        try{
            this.response = client.send(request,HttpResponse.BodyHandlers.ofString());

        }catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String json = this.response.body();
        return json;

    }




}
