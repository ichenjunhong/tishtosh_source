package com.bytedance.falconx;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.falconx.b */
public final class C9765b {

    /* renamed from: a */
    public final Context f26574a;

    /* renamed from: b */
    public final String f26575b;

    /* renamed from: c */
    public final List<Pattern> f26576c;

    /* renamed from: d */
    public final List<Uri> f26577d;

    /* renamed from: e */
    public final String f26578e;

    /* renamed from: com.bytedance.falconx.b$a */
    public static class C9767a {

        /* renamed from: a */
        public Context f26579a;

        /* renamed from: b */
        public String f26580b;

        /* renamed from: c */
        public List<Pattern> f26581c;

        /* renamed from: d */
        public List<Uri> f26582d;

        /* renamed from: e */
        public String f26583e;

        /* renamed from: a */
        public final C9765b mo17597a() {
            return new C9765b(this);
        }

        /* renamed from: a */
        public final C9767a mo17595a(String str) {
            this.f26580b = str;
            return this;
        }

        /* renamed from: b */
        public final C9767a mo17598b(String str) {
            this.f26583e = str;
            return this;
        }

        public C9767a(Context context) {
            this.f26579a = context;
        }

        /* renamed from: a */
        public final C9767a mo17596a(List<Pattern> list) {
            this.f26581c = list;
            return this;
        }

        /* renamed from: b */
        public final C9767a mo17599b(List<Uri> list) {
            this.f26582d = list;
            return this;
        }
    }

    private C9765b(C9767a aVar) {
        if (aVar.f26579a != null) {
            Context applicationContext = aVar.f26579a.getApplicationContext();
            if (applicationContext == null) {
                this.f26574a = aVar.f26579a;
            } else {
                this.f26574a = applicationContext;
            }
            if (!TextUtils.isEmpty(aVar.f26580b)) {
                this.f26575b = aVar.f26580b;
                this.f26576c = aVar.f26581c;
                if (aVar.f26582d == null) {
                    this.f26577d = Arrays.asList(new Uri[]{Uri.fromFile(new File(this.f26574a.getFilesDir(), "gecko_offline_res_x"))});
                } else {
                    this.f26577d = aVar.f26582d;
                }
                this.f26578e = aVar.f26583e;
                return;
            }
            throw new IllegalArgumentException("accessKey empty");
        }
        throw new IllegalArgumentException("context == null");
    }
}
