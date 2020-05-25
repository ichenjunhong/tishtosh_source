package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;

@C16299uq
public final class aoc {

    /* renamed from: a */
    public final String f41155a;

    /* renamed from: b */
    public final Uri f41156b;

    /* renamed from: c */
    public final Map<String, String> f41157c;

    /* renamed from: d */
    private final String f41158d;

    public aoc(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public aoc(String str) {
        this(str, Uri.parse(str), null, null);
    }

    private aoc(String str, Uri uri, String str2, Map<String, String> map) {
        this.f41155a = str;
        this.f41156b = uri;
        if (str2 == null) {
            str2 = "GET";
        }
        this.f41158d = str2;
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.f41157c = map;
    }
}
