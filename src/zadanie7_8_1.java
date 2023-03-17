import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class zadanie7_8_1 {
    // 7. Добавим вывод автора цитаты. */
    /* ВНИМАНИЕ: ПОСКОЛЬКУ ПРЕДЛОЖЕННАЯ В ЗАДАНИИ СТРАНИЦА НЕ РАБОТАЕТ, МНОЮ ВЗЯТА В КАЧЕСТВЕ ИСХОДНОЙ ДРУГАЯ СТРАНИЦА: https://text-box.ru/quotes/source/breaking-bad */
    public static void main(String[] args) throws IOException {
        String page = downloadWebPage("https://text-box.ru/quotes/source/breaking-bad");
        //System.out.println(page);
        int quoteStart = page.indexOf("text__line__content__rus text__line--cell");
        int quoteEnd = page.indexOf("text__footer");
        //System.out.println(page.substring(quoteStart + 43, quoteEnd - 82));
        String quote = page.substring(quoteStart + 43, quoteEnd - 82);
        String shorten = quote.length() > 50 ? quote.substring(0, 50) + "..." : quote;
        //System.out.println(shorten);
        int authorStart = page.indexOf("Уолтер Уайт мл.");
        int authorEnd = page.indexOf("Уолтер Уайт мл.");
        String author = page.substring(authorStart, authorEnd + 11);
        System.out.println(quote);
        System.out.println("(" + author + ")");
    }

    private static String downloadWebPage(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}