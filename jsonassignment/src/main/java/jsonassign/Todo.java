package jsonassign;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Todo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String url= "https://jsonplaceholder.typicode.com/users";

HttpClient client=HttpClient.newHttpClient();
HttpRequest request= HttpRequest.newBuilder()
.uri(URI.create(url))
.GET()
.build();

client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
.thenApply(HttpResponse::body)
.thenAccept(System.out::println)
.join();
	}

}