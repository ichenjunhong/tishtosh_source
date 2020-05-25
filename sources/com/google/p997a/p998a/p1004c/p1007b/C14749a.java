package com.google.p997a.p998a.p1004c.p1007b;

import com.google.p997a.p998a.p1009d.C14767g;
import com.google.p997a.p998a.p1009d.C14768h;
import com.google.p997a.p998a.p1009d.C14769i;
import com.google.p997a.p998a.p1020g.C14812m;
import com.google.p997a.p998a.p1020g.C14814o;
import java.util.logging.Logger;

/* renamed from: com.google.a.a.c.b.a */
public abstract class C14749a {

    /* renamed from: a */
    static final Logger f38224a = Logger.getLogger(C14749a.class.getName());

    /* renamed from: b */
    public final C14767g f38225b;

    /* renamed from: c */
    public final C14755c f38226c;

    /* renamed from: d */
    public final String f38227d;

    /* renamed from: e */
    public final String f38228e;

    /* renamed from: f */
    public final String f38229f;

    /* renamed from: g */
    public final boolean f38230g;

    /* renamed from: h */
    public final boolean f38231h;

    /* renamed from: i */
    private final String f38232i;

    /* renamed from: j */
    private final C14812m f38233j;

    /* renamed from: com.google.a.a.c.b.a$a */
    public static abstract class C14750a {

        /* renamed from: a */
        public final C14769i f38234a;

        /* renamed from: b */
        public C14755c f38235b;

        /* renamed from: c */
        public C14768h f38236c;

        /* renamed from: d */
        final C14812m f38237d;

        /* renamed from: e */
        public String f38238e;

        /* renamed from: f */
        public String f38239f;

        /* renamed from: g */
        String f38240g;

        /* renamed from: h */
        public String f38241h;

        /* renamed from: i */
        public boolean f38242i;

        /* renamed from: j */
        public boolean f38243j;

        /* renamed from: c */
        public C14750a mo27041c(String str) {
            this.f38241h = str;
            return this;
        }

        /* renamed from: a */
        public C14750a mo27039a(String str) {
            this.f38238e = C14749a.m30142a(str);
            return this;
        }

        /* renamed from: b */
        public C14750a mo27040b(String str) {
            this.f38239f = C14749a.m30143b(str);
            return this;
        }

        protected C14750a(C14769i iVar, String str, String str2, C14812m mVar, C14768h hVar) {
            this.f38234a = (C14769i) C14814o.m30287a(iVar);
            this.f38237d = mVar;
            mo27039a(str);
            mo27040b(str2);
            this.f38236c = hVar;
        }
    }

    /* renamed from: a */
    public C14812m mo27038a() {
        return this.f38233j;
    }

    /* renamed from: a */
    static String m30142a(String str) {
        C14814o.m30288a(str, (Object) "root URL cannot be null.");
        if (!str.endsWith("/")) {
            return String.valueOf(str).concat("/");
        }
        return str;
    }

    /* renamed from: b */
    static String m30143b(String str) {
        C14814o.m30288a(str, (Object) "service path cannot be null");
        if (str.length() == 1) {
            C14814o.m30290a("/".equals(str), (Object) "service path must equal \"/\" if it is of length 1.");
            return "";
        } else if (str.length() <= 0) {
            return str;
        } else {
            if (!str.endsWith("/")) {
                str = String.valueOf(str).concat("/");
            }
            if (str.startsWith("/")) {
                return str.substring(1);
            }
            return str;
        }
    }

    protected C14749a(C14750a aVar) {
        boolean z;
        C14767g gVar;
        this.f38226c = aVar.f38235b;
        this.f38227d = m30142a(aVar.f38238e);
        this.f38228e = m30143b(aVar.f38239f);
        this.f38232i = aVar.f38240g;
        String str = aVar.f38241h;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f38224a.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.f38229f = aVar.f38241h;
        if (aVar.f38236c == null) {
            gVar = aVar.f38234a.mo27063a(null);
        } else {
            gVar = aVar.f38234a.mo27063a(aVar.f38236c);
        }
        this.f38225b = gVar;
        this.f38233j = aVar.f38237d;
        this.f38230g = aVar.f38242i;
        this.f38231h = aVar.f38243j;
    }
}
