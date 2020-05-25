package com.facebook.p914c.p916b;

import android.content.Context;
import com.facebook.common.p917a.C13658b;
import com.facebook.common.p917a.C13659c;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13691k;
import com.facebook.common.p920d.C13692l;
import com.facebook.p914c.p915a.C13616a;
import com.facebook.p914c.p915a.C13617b;
import com.facebook.p914c.p915a.C13622f;
import com.facebook.p914c.p915a.C13623g;
import java.io.File;

/* renamed from: com.facebook.c.b.c */
public final class C13636c {

    /* renamed from: a */
    public final int f35561a;

    /* renamed from: b */
    public final String f35562b;

    /* renamed from: c */
    public final C13691k<File> f35563c;

    /* renamed from: d */
    public final long f35564d;

    /* renamed from: e */
    public final long f35565e;

    /* renamed from: f */
    public final long f35566f;

    /* renamed from: g */
    public final C13650h f35567g;

    /* renamed from: h */
    public final C13616a f35568h;

    /* renamed from: i */
    public final C13617b f35569i;

    /* renamed from: j */
    public final C13658b f35570j;

    /* renamed from: k */
    public final Context f35571k;

    /* renamed from: l */
    public final boolean f35572l;

    /* renamed from: com.facebook.c.b.c$a */
    public static class C13638a {

        /* renamed from: a */
        public int f35573a;

        /* renamed from: b */
        public String f35574b;

        /* renamed from: c */
        public C13691k<File> f35575c;

        /* renamed from: d */
        public long f35576d;

        /* renamed from: e */
        public long f35577e;

        /* renamed from: f */
        public long f35578f;

        /* renamed from: g */
        public C13650h f35579g;

        /* renamed from: h */
        public C13616a f35580h;

        /* renamed from: i */
        public C13617b f35581i;

        /* renamed from: j */
        public C13658b f35582j;

        /* renamed from: k */
        public boolean f35583k;

        /* renamed from: l */
        public final Context f35584l;

        /* renamed from: a */
        public final C13636c mo25503a() {
            boolean z;
            if (this.f35575c == null && this.f35584l == null) {
                z = false;
            } else {
                z = true;
            }
            C13689i.m27658b(z, "Either a non-null context or a base directory path or supplier must be provided.");
            if (this.f35575c == null && this.f35584l != null) {
                this.f35575c = new C13691k<File>() {
                    /* renamed from: b */
                    public final /* synthetic */ Object mo23157b() {
                        return C13638a.this.f35584l.getApplicationContext().getCacheDir();
                    }
                };
            }
            return new C13636c(this);
        }

        /* renamed from: a */
        public final C13638a mo25499a(long j) {
            this.f35576d = j;
            return this;
        }

        /* renamed from: a */
        public final C13638a mo25500a(C13658b bVar) {
            this.f35582j = bVar;
            return this;
        }

        /* renamed from: a */
        public final C13638a mo25501a(File file) {
            this.f35575c = C13692l.m27661a(file);
            return this;
        }

        /* renamed from: a */
        public final C13638a mo25502a(String str) {
            this.f35574b = str;
            return this;
        }

        private C13638a(Context context) {
            this.f35573a = 1;
            this.f35574b = "image_cache";
            this.f35576d = 41943040;
            this.f35577e = 10485760;
            this.f35578f = 2097152;
            this.f35579g = new C13634b();
            this.f35584l = context;
        }
    }

    /* renamed from: a */
    public static C13638a m27531a(Context context) {
        return new C13638a(context);
    }

    private C13636c(C13638a aVar) {
        C13616a aVar2;
        C13617b bVar;
        C13658b bVar2;
        this.f35561a = aVar.f35573a;
        this.f35562b = (String) C13689i.m27652a(aVar.f35574b);
        this.f35563c = (C13691k) C13689i.m27652a(aVar.f35575c);
        this.f35564d = aVar.f35576d;
        this.f35565e = aVar.f35577e;
        this.f35566f = aVar.f35578f;
        this.f35567g = (C13650h) C13689i.m27652a(aVar.f35579g);
        if (aVar.f35580h == null) {
            aVar2 = C13622f.m27498a();
        } else {
            aVar2 = aVar.f35580h;
        }
        this.f35568h = aVar2;
        if (aVar.f35581i == null) {
            bVar = C13623g.m27499a();
        } else {
            bVar = aVar.f35581i;
        }
        this.f35569i = bVar;
        if (aVar.f35582j == null) {
            bVar2 = C13659c.m27611a();
        } else {
            bVar2 = aVar.f35582j;
        }
        this.f35570j = bVar2;
        this.f35571k = aVar.f35584l;
        this.f35572l = aVar.f35583k;
    }
}
