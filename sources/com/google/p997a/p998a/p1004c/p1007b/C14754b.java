package com.google.p997a.p998a.p1004c.p1007b;

import com.google.p997a.p998a.p1009d.C14762c;
import com.google.p997a.p998a.p1009d.C14765e;
import com.google.p997a.p998a.p1020g.C14806j;
import com.google.p997a.p998a.p1020g.C14814o;

/* renamed from: com.google.a.a.c.b.b */
public abstract class C14754b<T> extends C14806j {

    /* renamed from: a */
    public final String f38245a;

    /* renamed from: b */
    public final String f38246b;

    /* renamed from: c */
    public final C14762c f38247c;

    /* renamed from: d */
    public C14765e f38248d = new C14765e();

    /* renamed from: e */
    public int f38249e = -1;

    /* renamed from: f */
    public Class<T> f38250f;

    /* renamed from: g */
    private final C14749a f38251g;

    /* renamed from: a */
    public C14754b<T> mo27048b(String str, Object obj) {
        return (C14754b) super.mo27048b(str, obj);
    }

    protected C14754b(C14749a aVar, String str, String str2, C14762c cVar, Class<T> cls) {
        this.f38250f = (Class) C14814o.m30287a(cls);
        this.f38251g = (C14749a) C14814o.m30287a(aVar);
        this.f38245a = (String) C14814o.m30287a(str);
        this.f38246b = (String) C14814o.m30287a(str2);
        this.f38247c = cVar;
        String str3 = aVar.f38229f;
        if (str3 != null) {
            C14765e eVar = this.f38248d;
            String valueOf = String.valueOf(String.valueOf(str3));
            String valueOf2 = String.valueOf(String.valueOf("Google-API-Java-Client"));
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(valueOf2);
            eVar.mo27056a(sb.toString());
            return;
        }
        this.f38248d.mo27056a("Google-API-Java-Client");
    }
}
