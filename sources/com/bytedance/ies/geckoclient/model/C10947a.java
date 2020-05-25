package com.bytedance.ies.geckoclient.model;

import android.os.Build;
import android.os.Build.VERSION;
import com.google.gson.p1076a.C17952c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ies.geckoclient.model.a */
public final class C10947a {
    @C17952c(mo34828a = "common")

    /* renamed from: a */
    public C10951d f29364a;
    @C17952c(mo34828a = "deployment")

    /* renamed from: b */
    public Map<String, List<C10949b>> f29365b;
    @C17952c(mo34828a = "deployments")

    /* renamed from: c */
    public Map<String, C10950c> f29366c;
    @C17952c(mo34828a = "custom")

    /* renamed from: d */
    public Map<String, Map<String, Object>> f29367d;

    /* renamed from: com.bytedance.ies.geckoclient.model.a$a */
    public static class C10948a {
        @C17952c(mo34828a = "c")

        /* renamed from: a */
        String f29368a;

        public C10948a(String str) {
            this.f29368a = str;
        }
    }

    /* renamed from: com.bytedance.ies.geckoclient.model.a$b */
    public static class C10949b {
        @C17952c(mo34828a = "target_version")

        /* renamed from: a */
        public Integer f29369a;
        @C17952c(mo34828a = "channel")

        /* renamed from: b */
        private String f29370b;
        @C17952c(mo34828a = "local_version")

        /* renamed from: c */
        private int f29371c;

        public C10949b(String str, int i) {
            this.f29370b = str;
            this.f29371c = i;
        }
    }

    /* renamed from: com.bytedance.ies.geckoclient.model.a$c */
    public static class C10950c {
        @C17952c(mo34828a = "channels")

        /* renamed from: a */
        public List<C10948a> f29372a = new ArrayList();
    }

    /* renamed from: com.bytedance.ies.geckoclient.model.a$d */
    public static class C10951d {
        @C17952c(mo34828a = "aid")

        /* renamed from: a */
        private int f29373a;
        @C17952c(mo34828a = "app_version")

        /* renamed from: b */
        private String f29374b;
        @C17952c(mo34828a = "os")

        /* renamed from: c */
        private int f29375c;
        @C17952c(mo34828a = "device_id")

        /* renamed from: d */
        private String f29376d;
        @C17952c(mo34828a = "app_name")

        /* renamed from: e */
        private String f29377e;
        @C17952c(mo34828a = "ac")

        /* renamed from: f */
        private String f29378f;
        @C17952c(mo34828a = "os_version")

        /* renamed from: g */
        private String f29379g;
        @C17952c(mo34828a = "device_model")

        /* renamed from: h */
        private String f29380h = Build.MODEL;
        @C17952c(mo34828a = "device_platform")

        /* renamed from: i */
        private String f29381i = "android";
        @C17952c(mo34828a = "sdk_version")

        /* renamed from: j */
        private String f29382j;

        public C10951d(int i, String str, String str2, String str3, String str4, String str5) {
            StringBuilder sb = new StringBuilder();
            sb.append(VERSION.SDK_INT);
            this.f29379g = sb.toString();
            this.f29373a = i;
            this.f29374b = str;
            this.f29376d = str2;
            this.f29377e = str3;
            this.f29378f = str4;
            this.f29382j = str5;
        }
    }

    /* renamed from: a */
    public final void mo19772a(String str, List<C10949b> list) {
        if (this.f29365b == null) {
            this.f29365b = new HashMap();
        }
        this.f29365b.put(str, list);
    }
}
