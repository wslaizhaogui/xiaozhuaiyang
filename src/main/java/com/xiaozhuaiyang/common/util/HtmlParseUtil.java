package com.xiaozhuaiyang.common.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

public class HtmlParseUtil {
    public static void main(String[] args) throws IOException {
        //获取请求
        String url = "https://segmentfault.com/channel/backend";

        Document document = Jsoup.parse(new URL(url),30000);
        //网页标题
        String title = document.title();

        Element element = document.getElementById("fixedTools");

        Elements card = document.getElementsByClass("card");

        System.out.println(card.html());

        new Thread().start();
    }
}
