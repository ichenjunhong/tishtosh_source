package com.google.p997a.p998a.p1004c.p1005a.p1006a;

import com.google.p997a.p998a.p1009d.C14764d;
import com.google.p997a.p998a.p1009d.C14769i;
import com.google.p997a.p998a.p1013e.C14774b;
import com.google.p997a.p998a.p1020g.C14814o;
import com.google.p997a.p998a.p999a.p1000a.C14737a.C14738a;
import com.google.p997a.p998a.p999a.p1000a.C14739b;
import com.google.p997a.p998a.p999a.p1000a.C14740c;
import com.google.p997a.p998a.p999a.p1000a.C14740c.C14742b;
import java.security.PrivateKey;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.google.a.a.c.a.a.b */
public final class C14746b extends C14740c {

    /* renamed from: p */
    private static C14745a f38210p = new C14745a();

    /* renamed from: j */
    public String f38211j;

    /* renamed from: k */
    public String f38212k;

    /* renamed from: l */
    public Collection<String> f38213l;

    /* renamed from: m */
    public PrivateKey f38214m;

    /* renamed from: n */
    public String f38215n;

    /* renamed from: o */
    public String f38216o;

    /* renamed from: com.google.a.a.c.a.a.b$a */
    public static class C14747a extends C14742b {

        /* renamed from: i */
        public String f38217i;

        /* renamed from: j */
        public Collection<String> f38218j;

        /* renamed from: k */
        public PrivateKey f38219k;

        /* renamed from: l */
        public String f38220l;

        /* renamed from: m */
        public String f38221m;

        /* renamed from: n */
        public String f38222n;

        public C14747a() {
            super(new C14738a());
            mo27030a("https://accounts.google.com/o/oauth2/token");
        }

        /* renamed from: a */
        public final C14746b mo27035a() {
            return new C14746b(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C14747a mo27027a(C14764d dVar) {
            return (C14747a) super.mo27027a(dVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C14747a mo27030a(String str) {
            return (C14747a) super.mo27030a(str);
        }

        /* renamed from: b */
        public final C14747a mo27028a(C14769i iVar) {
            return (C14747a) super.mo27028a(iVar);
        }

        /* renamed from: b */
        public final C14747a mo27029a(C14774b bVar) {
            return (C14747a) super.mo27029a(bVar);
        }

        /* renamed from: a */
        public final C14747a mo27034a(String str, String str2) {
            mo27027a((C14764d) new C14739b(str, null));
            return this;
        }
    }

    public C14746b() {
        this(new C14747a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C14740c mo27023a(Long l) {
        return (C14746b) super.mo27023a(l);
    }

    /* renamed from: c */
    public final C14746b mo27025b(Long l) {
        return (C14746b) super.mo27025b(l);
    }

    /* renamed from: c */
    public final C14746b mo27024a(String str) {
        return (C14746b) super.mo27024a(str);
    }

    /* renamed from: d */
    public final C14746b mo27026b(String str) {
        boolean z;
        if (str != null) {
            if (this.f38190f == null || this.f38188d == null || this.f38189e == null) {
                z = false;
            } else {
                z = true;
            }
            C14814o.m30290a(z, (Object) "Please use the Builder and call setJsonFactory, setTransport and setClientSecrets");
        }
        return (C14746b) super.mo27026b(str);
    }

    protected C14746b(C14747a aVar) {
        Collection<String> collection;
        boolean z;
        super(aVar);
        if (aVar.f38219k == null) {
            if (aVar.f38217i == null && aVar.f38218j == null && aVar.f38222n == null) {
                z = true;
            } else {
                z = false;
            }
            C14814o.m30289a(z);
            return;
        }
        this.f38211j = (String) C14814o.m30287a(aVar.f38217i);
        this.f38212k = aVar.f38221m;
        if (aVar.f38218j == null) {
            collection = Collections.emptyList();
        } else {
            collection = Collections.unmodifiableCollection(aVar.f38218j);
        }
        this.f38213l = collection;
        this.f38214m = aVar.f38219k;
        this.f38215n = aVar.f38220l;
        this.f38216o = aVar.f38222n;
    }
}
