import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MameGenerator {

    private final OkHttpClient client = new OkHttpClient();

    void generate(String imageType, String topText, String bottomText) throws IOException {

        StringBuilder imageUrl = new StringBuilder();
        imageUrl.append("https://apimeme.com/meme?meme=");
        imageUrl.append(imageType);
        imageUrl.append("&top=");
        imageUrl.append(topText);
        imageUrl.append("&bottom=");
        imageUrl.append(bottomText);

        Request request = new Request.Builder()
                .url(imageUrl.toString())
                .get()
                .build();

        Response response = client.newCall(request).execute();

        String imageName = System.currentTimeMillis() + ".jpg";
        if (response.isSuccessful()) {
            File file = new File(imageName);
            try (FileOutputStream fos = new FileOutputStream(file)) {
                fos.write(response.body().bytes());
            }
        } else {
            System.out.println("Something went wrong!!!");
        }
    }
}
