package com.airbnb.lottie.p112d;

import com.airbnb.lottie.C2340c;

/* renamed from: com.airbnb.lottie.d.a */
public enum C2403a {
    Json(".json"),
    Zip(".zip");
    
    public final String extension;

    public final String toString() {
        return this.extension;
    }

    public final String tempExtension() {
        StringBuilder sb = new StringBuilder(".temp");
        sb.append(this.extension);
        return sb.toString();
    }

    public static C2403a forFile(String str) {
        C2403a[] values;
        for (C2403a aVar : values()) {
            if (str.endsWith(aVar.extension)) {
                return aVar;
            }
        }
        StringBuilder sb = new StringBuilder("Unable to find correct extension for ");
        sb.append(str);
        C2340c.m6968a(sb.toString());
        return Json;
    }

    private C2403a(String str) {
        this.extension = str;
    }
}
