package com.andon.utils;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Deprecated
public class RequestStreamConverter {
    public static String GetStream(HttpServletRequest stream) throws Exception {
        try {
            BufferedReader bufferedReader = stream.getReader();
            StringBuilder wholeStr = new StringBuilder();
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                {
                    wholeStr.append(str);
                }
            }
            bufferedReader.close();
            return wholeStr.toString();
        } catch (IOException e) {
            return e.getMessage();
        }
    }
}
