package ObjectHttp;

import java.net.URI;

import java.net.http.HttpRequest;

public class ObjectHttp {

    private final String apiURL = "https://gutendex.com/books/?search=";
    public static String input = "";
    private HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiURL + input)).header("accept","application/json").build();



    public HttpRequest getRequest(){
        return this.request;
    }
}
