package com.appsflyer.cache;

import java.util.Scanner;

public class RequestCacheData {

    /* renamed from: ˊ */
    public String f7791;

    /* renamed from: ˎ */
    public String f7792;

    /* renamed from: ˏ */
    public String f7793;

    /* renamed from: ॱ */
    public String f7794;

    public RequestCacheData(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.f7793 = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.f7794 = nextLine.substring(8).trim();
            } else if (nextLine.startsWith("data=")) {
                this.f7792 = nextLine.substring(5).trim();
            }
        }
        scanner.close();
    }

    public RequestCacheData(String str, String str2, String str3) {
        this.f7793 = str;
        this.f7792 = str2;
        this.f7794 = str3;
    }
}
