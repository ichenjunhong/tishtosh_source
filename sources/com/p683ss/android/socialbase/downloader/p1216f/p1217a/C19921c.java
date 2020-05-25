package com.p683ss.android.socialbase.downloader.p1216f.p1217a;

import com.p683ss.android.socialbase.downloader.model.HttpHeader;
import com.p683ss.android.socialbase.downloader.p1216f.C19924c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.socialbase.downloader.f.a.c */
public final class C19921c implements C19924c {

    /* renamed from: e */
    private static final ArrayList<String> f54732e;

    /* renamed from: a */
    public List<HttpHeader> f54733a;

    /* renamed from: b */
    long f54734b;

    /* renamed from: c */
    protected final Object f54735c;

    /* renamed from: d */
    boolean f54736d;

    /* renamed from: f */
    private Map<String, String> f54737f;

    /* renamed from: g */
    private int f54738g;

    /* renamed from: h */
    private boolean f54739h;

    /* renamed from: i */
    private C19924c f54740i;

    /* renamed from: b */
    public final int mo13393b() throws IOException {
        return this.f54738g;
    }

    /* renamed from: c */
    public final void mo13394c() {
        if (this.f54740i != null) {
            this.f54740i.mo13394c();
        }
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>(6);
        f54732e = arrayList;
        arrayList.add("Content-Length");
        f54732e.add("Content-Range");
        f54732e.add("Transfer-Encoding");
        f54732e.add("Accept-Ranges");
        f54732e.add("Etag");
        f54732e.add("Content-Disposition");
    }

    /* renamed from: a */
    public final void mo41647a() throws InterruptedException {
        synchronized (this.f54735c) {
            if (this.f54739h && this.f54737f == null) {
                this.f54735c.wait();
            }
        }
    }

    /* renamed from: a */
    public final String mo13392a(String str) {
        if (this.f54737f != null) {
            return (String) this.f54737f.get(str);
        }
        if (this.f54740i != null) {
            return this.f54740i.mo13392a(str);
        }
        return null;
    }
}
