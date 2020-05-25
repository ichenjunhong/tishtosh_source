package com.bytedance.ies.p688h.p691c;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.ies.p688h.C10968a;
import com.google.gson.p1076a.C17952c;
import java.util.List;
import java.util.Locale;

/* renamed from: com.bytedance.ies.h.c.a */
public final class C10983a {
    @C17952c(mo34828a = "common")

    /* renamed from: a */
    public C10984a f29492a;
    @C17952c(mo34828a = "offline")

    /* renamed from: b */
    public List<C10985b> f29493b;

    /* renamed from: com.bytedance.ies.h.c.a$a */
    public static class C10984a {
        @C17952c(mo34828a = "app_version")

        /* renamed from: a */
        public String f29494a;
        @C17952c(mo34828a = "sdk_version")

        /* renamed from: b */
        public String f29495b = "1.0.0.alpha";
        @C17952c(mo34828a = "device_id")

        /* renamed from: c */
        public String f29496c;
        @C17952c(mo34828a = "device_model")

        /* renamed from: d */
        public String f29497d = Build.MODEL;
        @C17952c(mo34828a = "os")

        /* renamed from: e */
        public int f29498e;
        @C17952c(mo34828a = "region")

        /* renamed from: f */
        public String f29499f = Locale.getDefault().getCountry();
    }

    /* renamed from: com.bytedance.ies.h.c.a$b */
    public static class C10985b {
        @C17952c(mo34828a = "resource_url")

        /* renamed from: a */
        public String f29500a;
        @C17952c(mo34828a = "access_key")

        /* renamed from: b */
        public String f29501b;
        @C17952c(mo34828a = "channel")

        /* renamed from: c */
        public String f29502c;
        @C17952c(mo34828a = "mime_type")

        /* renamed from: d */
        public String f29503d;
        @C17952c(mo34828a = "offline_status")

        /* renamed from: e */
        public Integer f29504e;
        @C17952c(mo34828a = "offline_duration")

        /* renamed from: f */
        public Long f29505f;
        @C17952c(mo34828a = "ac")

        /* renamed from: g */
        public String f29506g;
        @C17952c(mo34828a = "offline_rule")

        /* renamed from: h */
        public String f29507h;
        @C17952c(mo34828a = "err_code")

        /* renamed from: i */
        public String f29508i;
        @C17952c(mo34828a = "err_msg")

        /* renamed from: j */
        public String f29509j;
        @C17952c(mo34828a = "pkg_version")

        /* renamed from: k */
        public Long f29510k;
        @C17952c(mo34828a = "online_duration")

        /* renamed from: l */
        public Long f29511l;
        @C17952c(mo34828a = "res_root_dir")

        /* renamed from: m */
        public String f29512m;
        @C17952c(mo34828a = "log_id")

        /* renamed from: n */
        public String f29513n;

        /* renamed from: o */
        public Long f29514o = Long.valueOf(SystemClock.uptimeMillis());
        @C17952c(mo34828a = "page_url")

        /* renamed from: p */
        public String f29515p;

        /* renamed from: a */
        public final void mo19806a(String str) {
            if (str != null) {
                if (str.contains("??")) {
                    this.f29500a = str;
                    return;
                }
                try {
                    Uri parse = Uri.parse(str);
                    StringBuilder sb = new StringBuilder();
                    sb.append(parse.getScheme());
                    sb.append("://");
                    sb.append(parse.getHost());
                    sb.append(parse.getPath());
                    this.f29500a = sb.toString();
                } catch (Exception unused) {
                    this.f29500a = str;
                }
            }
        }

        /* renamed from: a */
        public final void mo19808a(boolean z) {
            if (z) {
                this.f29505f = Long.valueOf(SystemClock.uptimeMillis() - this.f29514o.longValue());
                this.f29504e = Integer.valueOf(1);
                return;
            }
            this.f29504e = Integer.valueOf(0);
        }

        /* renamed from: a */
        public final void mo19807a(String str, String str2) {
            if (str != null && str2 != null) {
                if (str.endsWith("/")) {
                    str = str.substring(0, str.length() - 1);
                }
                this.f29503d = C10968a.m22227a(str2);
                int lastIndexOf = str.lastIndexOf("/");
                if (lastIndexOf != -1) {
                    this.f29501b = str.substring(lastIndexOf + 1);
                }
                int indexOf = str2.indexOf("/");
                if (indexOf != -1) {
                    this.f29502c = str2.substring(0, indexOf);
                }
            }
        }
    }
}
