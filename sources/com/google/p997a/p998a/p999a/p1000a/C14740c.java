package com.google.p997a.p998a.p999a.p1000a;

import com.google.p997a.p998a.p1009d.C14758b;
import com.google.p997a.p998a.p1009d.C14764d;
import com.google.p997a.p998a.p1009d.C14768h;
import com.google.p997a.p998a.p1009d.C14769i;
import com.google.p997a.p998a.p1013e.C14774b;
import com.google.p997a.p998a.p1020g.C14797e;
import com.google.p997a.p998a.p1020g.C14814o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/* renamed from: com.google.a.a.a.a.c */
public class C14740c implements C14764d, C14768h {

    /* renamed from: a */
    static final Logger f38185a = Logger.getLogger(C14740c.class.getName());

    /* renamed from: b */
    public final C14741a f38186b;

    /* renamed from: c */
    public final C14797e f38187c;

    /* renamed from: d */
    public final C14769i f38188d;

    /* renamed from: e */
    public final C14764d f38189e;

    /* renamed from: f */
    public final C14774b f38190f;

    /* renamed from: g */
    public final String f38191g;

    /* renamed from: h */
    public final Collection<Object> f38192h;

    /* renamed from: i */
    public final C14768h f38193i;

    /* renamed from: j */
    private final Lock f38194j = new ReentrantLock();

    /* renamed from: k */
    private String f38195k;

    /* renamed from: l */
    private Long f38196l;

    /* renamed from: m */
    private String f38197m;

    /* renamed from: com.google.a.a.a.a.c$a */
    public interface C14741a {
    }

    /* renamed from: com.google.a.a.a.a.c$b */
    public static class C14742b {

        /* renamed from: a */
        public final C14741a f38198a;

        /* renamed from: b */
        public C14769i f38199b;

        /* renamed from: c */
        public C14774b f38200c;

        /* renamed from: d */
        public C14758b f38201d;

        /* renamed from: e */
        public C14797e f38202e = C14797e.f38322a;

        /* renamed from: f */
        public C14764d f38203f;

        /* renamed from: g */
        public C14768h f38204g;

        /* renamed from: h */
        public Collection<Object> f38205h = new ArrayList();

        /* renamed from: a */
        public C14742b mo27027a(C14764d dVar) {
            this.f38203f = dVar;
            return this;
        }

        /* renamed from: a */
        public C14742b mo27028a(C14769i iVar) {
            this.f38199b = iVar;
            return this;
        }

        /* renamed from: a */
        public C14742b mo27029a(C14774b bVar) {
            this.f38200c = bVar;
            return this;
        }

        public C14742b(C14741a aVar) {
            this.f38198a = (C14741a) C14814o.m30287a(aVar);
        }

        /* renamed from: a */
        public C14742b mo27030a(String str) {
            C14758b bVar;
            if (str == null) {
                bVar = null;
            } else {
                bVar = new C14758b(str);
            }
            this.f38201d = bVar;
            return this;
        }
    }

    /* renamed from: a */
    public C14740c mo27023a(Long l) {
        this.f38194j.lock();
        try {
            this.f38196l = l;
            return this;
        } finally {
            this.f38194j.unlock();
        }
    }

    /* renamed from: b */
    public C14740c mo27025b(Long l) {
        Long l2;
        if (l == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf(this.f38187c.mo27118a() + (l.longValue() * 1000));
        }
        return mo27023a(l2);
    }

    /* renamed from: a */
    public C14740c mo27024a(String str) {
        this.f38194j.lock();
        try {
            this.f38195k = str;
            return this;
        } finally {
            this.f38194j.unlock();
        }
    }

    /* renamed from: b */
    public C14740c mo27026b(String str) {
        boolean z;
        this.f38194j.lock();
        if (str != null) {
            try {
                if (this.f38190f == null || this.f38188d == null || this.f38189e == null || this.f38191g == null) {
                    z = false;
                } else {
                    z = true;
                }
                C14814o.m30290a(z, (Object) "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
            } catch (Throwable th) {
                this.f38194j.unlock();
                throw th;
            }
        }
        this.f38197m = str;
        this.f38194j.unlock();
        return this;
    }

    protected C14740c(C14742b bVar) {
        String str;
        this.f38186b = (C14741a) C14814o.m30287a(bVar.f38198a);
        this.f38188d = bVar.f38199b;
        this.f38190f = bVar.f38200c;
        if (bVar.f38201d == null) {
            str = null;
        } else {
            str = bVar.f38201d.mo27050a();
        }
        this.f38191g = str;
        this.f38189e = bVar.f38203f;
        this.f38193i = bVar.f38204g;
        this.f38192h = Collections.unmodifiableCollection(bVar.f38205h);
        this.f38187c = (C14797e) C14814o.m30287a(bVar.f38202e);
    }
}
