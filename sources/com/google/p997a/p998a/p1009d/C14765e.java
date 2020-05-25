package com.google.p997a.p998a.p1009d;

import com.google.p997a.p998a.p1020g.C14806j;
import com.google.p997a.p998a.p1020g.C14806j.C14809c;
import com.google.p997a.p998a.p1020g.C14810k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

/* renamed from: com.google.a.a.d.e */
public final class C14765e extends C14806j {
    @C14810k(mo27159a = "Accept")
    private List<String> accept;
    @C14810k(mo27159a = "Accept-Encoding")
    private List<String> acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    @C14810k(mo27159a = "Age")
    private List<Long> age;
    @C14810k(mo27159a = "WWW-Authenticate")
    public List<String> authenticate;
    @C14810k(mo27159a = "Authorization")
    public List<String> authorization;
    @C14810k(mo27159a = "Cache-Control")
    private List<String> cacheControl;
    @C14810k(mo27159a = "Content-Encoding")
    private List<String> contentEncoding;
    @C14810k(mo27159a = "Content-Length")
    private List<Long> contentLength;
    @C14810k(mo27159a = "Content-MD5")
    private List<String> contentMD5;
    @C14810k(mo27159a = "Content-Range")
    private List<String> contentRange;
    @C14810k(mo27159a = "Content-Type")
    private List<String> contentType;
    @C14810k(mo27159a = "Cookie")
    private List<String> cookie;
    @C14810k(mo27159a = "Date")
    private List<String> date;
    @C14810k(mo27159a = "ETag")
    private List<String> etag;
    @C14810k(mo27159a = "Expires")
    private List<String> expires;
    @C14810k(mo27159a = "If-Match")
    private List<String> ifMatch;
    @C14810k(mo27159a = "If-Modified-Since")
    private List<String> ifModifiedSince;
    @C14810k(mo27159a = "If-None-Match")
    private List<String> ifNoneMatch;
    @C14810k(mo27159a = "If-Range")
    private List<String> ifRange;
    @C14810k(mo27159a = "If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;
    @C14810k(mo27159a = "Last-Modified")
    private List<String> lastModified;
    @C14810k(mo27159a = "Location")
    private List<String> location;
    @C14810k(mo27159a = "MIME-Version")
    private List<String> mimeVersion;
    @C14810k(mo27159a = "Range")
    private List<String> range;
    @C14810k(mo27159a = "Retry-After")
    private List<String> retryAfter;
    @C14810k(mo27159a = "User-Agent")
    private List<String> userAgent;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C14765e clone() {
        return (C14765e) super.clone();
    }

    public C14765e() {
        super(EnumSet.of(C14809c.IGNORE_CASE));
    }

    /* renamed from: a */
    public final String mo27057a() {
        Object obj;
        List<String> list = this.userAgent;
        if (list == null) {
            obj = null;
        } else {
            obj = list.get(0);
        }
        return (String) obj;
    }

    /* renamed from: a */
    public final C14765e mo27056a(String str) {
        this.userAgent = m30172a((T) str);
        return this;
    }

    /* renamed from: a */
    private static <T> List<T> m30172a(T t) {
        if (t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C14806j mo27048b(String str, Object obj) {
        return (C14765e) super.mo27048b(str, obj);
    }
}
