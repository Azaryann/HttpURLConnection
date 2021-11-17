package am.azaryan.urlConnection;

import java.io.IOException;

public class HttpDownloader {

    public static void main(String[] args) {
        String fileURL = "https://devmark.ru/article/spring-transaction-management";
        String saveDir = "D:/HttpURLConnection/src/am/azaryan/saveFileUrl";
        try {
            HttpDownloadUtility.downloadFile(fileURL, saveDir);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
