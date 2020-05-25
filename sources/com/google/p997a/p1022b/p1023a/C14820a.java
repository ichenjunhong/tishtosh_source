package com.google.p997a.p1022b.p1023a;

import com.google.p997a.p1022b.p1023a.p1024a.C14832h;
import com.google.p997a.p998a.p1004c.C14744a;
import com.google.p997a.p998a.p1004c.p1007b.p1008a.C14751a;
import com.google.p997a.p998a.p1004c.p1007b.p1008a.C14751a.C14752a;
import com.google.p997a.p998a.p1009d.C14768h;
import com.google.p997a.p998a.p1009d.C14769i;
import com.google.p997a.p998a.p1013e.C14774b;
import com.google.p997a.p998a.p1015f.p1016a.p1017a.p1018a.p1019a.C14780b;
import com.google.p997a.p998a.p1020g.C14810k;
import com.google.p997a.p998a.p1020g.C14814o;
import java.io.IOException;

/* renamed from: com.google.a.b.a.a */
public final class C14820a extends C14751a {

    /* renamed from: com.google.a.b.a.a$a */
    public static final class C14821a extends C14752a {
        /* renamed from: a */
        public final C14820a mo27166a() {
            return new C14820a(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public C14821a mo27044d(String str) {
            return (C14821a) super.mo27039a(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public C14821a mo27045e(String str) {
            return (C14821a) super.mo27040b(str);
        }

        /* renamed from: g */
        public final C14821a mo27046f(String str) {
            return (C14821a) super.mo27041c(str);
        }

        public C14821a(C14769i iVar, C14774b bVar, C14768h hVar) {
            super(iVar, bVar, "https://www.googleapis.com/", "youtube/v3/", hVar, false);
        }
    }

    /* renamed from: com.google.a.b.a.a$b */
    public class C14822b {

        /* renamed from: com.google.a.b.a.a$b$a */
        public class C14823a extends C14849b<C14832h> {
            @C14810k
            public String categoryId;
            @C14810k
            public String forUsername;
            @C14810k

            /* renamed from: id */
            public String f38372id;
            @C14810k
            public Boolean managedByMe;
            @C14810k
            public Long maxResults;
            @C14810k
            public Boolean mine;
            @C14810k
            public Boolean mySubscribers;
            @C14810k
            public String onBehalfOfContentOwner;
            @C14810k
            public String pageToken;
            @C14810k
            public String part;

            /* access modifiers changed from: private */
            /* renamed from: e */
            public C14823a mo27169d(String str, Object obj) {
                return (C14823a) super.mo27169d(str, obj);
            }

            protected C14823a(String str) {
                super(C14820a.this, "GET", "channels", null, C14832h.class);
                this.part = (String) C14814o.m30288a(str, (Object) "Required parameter part must be specified.");
            }
        }

        public C14822b() {
        }

        /* renamed from: a */
        public final C14823a mo27168a(String str) throws IOException {
            return new C14823a(str);
        }
    }

    /* renamed from: d */
    public final C14822b mo27165d() {
        return new C14822b();
    }

    static {
        boolean z;
        if (C14744a.f38206a.intValue() != 1 || C14744a.f38207b.intValue() < 15) {
            z = false;
        } else {
            z = true;
        }
        Object[] objArr = {C14744a.f38209d};
        if (!z) {
            throw new IllegalStateException(C14780b.m30228a("You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.19.0 of the YouTube Data API library.", objArr));
        }
    }

    C14820a(C14821a aVar) {
        super(aVar);
    }
}
