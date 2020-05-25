package com.bytedance.ies.geckoclient.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.ies.geckoclient.model.j */
public final class C10963j {
    @C17952c(mo34828a = "package_version")

    /* renamed from: a */
    public int f29435a;
    @C17952c(mo34828a = "channel")

    /* renamed from: b */
    public String f29436b;
    @C17952c(mo34828a = "package_type")

    /* renamed from: c */
    public int f29437c;

    /* renamed from: d */
    public String f29438d;

    /* renamed from: e */
    public long f29439e;
    @C17952c(mo34828a = "content")

    /* renamed from: f */
    private C10964a f29440f;

    /* renamed from: com.bytedance.ies.geckoclient.model.j$a */
    public static class C10964a {
        @C17952c(mo34828a = "package")

        /* renamed from: a */
        public C10965b f29441a;
        @C17952c(mo34828a = "patch")

        /* renamed from: b */
        public C10965b f29442b;
        @C17952c(mo34828a = "strategies")

        /* renamed from: c */
        public C10962i f29443c;
    }

    /* renamed from: com.bytedance.ies.geckoclient.model.j$b */
    public static class C10965b {
        @C17952c(mo34828a = "id")

        /* renamed from: a */
        public int f29444a;

        /* renamed from: b */
        public String f29445b;
        @C17952c(mo34828a = "url_list")

        /* renamed from: c */
        public List<String> f29446c;
        @C17952c(mo34828a = "md5")

        /* renamed from: d */
        public String f29447d;

        /* renamed from: e */
        public String f29448e;

        /* renamed from: f */
        public String f29449f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("Package{url='");
            sb.append(this.f29445b);
            sb.append('\'');
            sb.append(", md5='");
            sb.append(this.f29447d);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public final C10965b mo19774a() {
        return this.f29440f.f29441a;
    }

    /* renamed from: b */
    public final C10965b mo19775b() {
        return this.f29440f.f29442b;
    }

    /* renamed from: c */
    public final C10962i mo19776c() {
        return this.f29440f.f29443c;
    }

    /* renamed from: d */
    public final int mo19777d() {
        if (this.f29440f == null || this.f29440f.f29441a == null) {
            return -10;
        }
        return this.f29440f.f29441a.f29444a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdatePackage{version=");
        sb.append(this.f29435a);
        sb.append(", channel='");
        sb.append(this.f29436b);
        sb.append('\'');
        sb.append(", content=");
        sb.append(this.f29440f);
        sb.append(", packageType=");
        sb.append(this.f29437c);
        sb.append(", afterPatchZip='");
        sb.append(this.f29438d);
        sb.append('\'');
        sb.append(", downloadFileSize=");
        sb.append(this.f29439e);
        sb.append('}');
        return sb.toString();
    }
}
