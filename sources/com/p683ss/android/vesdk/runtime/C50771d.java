package com.p683ss.android.vesdk.runtime;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vesdk.runtime.d */
public abstract class C50771d {

    /* renamed from: a */
    private String f127565a;

    /* renamed from: b */
    private String f127566b;

    /* renamed from: c */
    protected String f127567c;

    /* renamed from: d */
    public List<String> f127568d = new ArrayList();

    /* renamed from: e */
    public List<String> f127569e = new ArrayList();

    /* renamed from: a */
    public abstract String mo43564a();

    /* renamed from: a */
    public abstract String mo43565a(int i);

    /* renamed from: b */
    public String mo43566b() {
        return this.f127565a;
    }

    /* renamed from: b */
    public abstract String mo43567b(int i);

    /* renamed from: c */
    public String mo43568c() {
        return this.f127566b;
    }

    /* renamed from: d */
    public final void mo99456d() {
        StringBuilder sb = new StringBuilder();
        sb.append(C50772e.m109884a(this.f127567c, "concat"));
        sb.append(File.separator);
        sb.append("concat.mp4");
        this.f127565a = sb.toString();
    }

    /* renamed from: e */
    public final void mo99457e() {
        StringBuilder sb = new StringBuilder();
        sb.append(C50772e.m109884a(this.f127567c, "concat"));
        sb.append(File.separator);
        sb.append("concat.wav");
        this.f127566b = sb.toString();
    }

    public C50771d(String str) {
        this.f127567c = str;
    }
}
