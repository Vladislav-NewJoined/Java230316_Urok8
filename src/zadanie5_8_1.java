import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class zadanie5_8_1 {
    /* 5. Возьмем код с 4 задания и добавим определение длины цитаты. Если цитата длинная мы ее обрежем. */
    /* ВНИМАНИЕ: ПОСКОЛЬКУ ПРЕДЛОЖЕННАЯ В ЗАДАНИИ СТРАНИЦА НЕ РАБОТАЕТ, МНОЮ ВЗЯТА В КАЧЕСТВЕ ИСХОДНОЙ ДРУГАЯ СТРАНИЦА: https://text-box.ru/quotes/source/breaking-bad */
    public static void main(String[] args) throws IOException {
        String page = downloadWebPage("https://text-box.ru/quotes/source/breaking-bad");
        //System.out.println(page);
        int quoteStart = page.indexOf("text__line__content__rus text__line--cell");
        int quoteEnd = page.indexOf("text__footer");
        //System.out.println(page.substring(quoteStart + 43, quoteEnd - 82));
        String quote = page.substring(quoteStart + 43, quoteEnd - 82);
        if (quote.length() > 50) {
            System.out.println(quote.substring(0, 50) + "...");
        } else {
            System.out.println(quote);
        }
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