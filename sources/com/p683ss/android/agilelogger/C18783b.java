package com.p683ss.android.agilelogger;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.agilelogger.p1124a.C18782a;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import java.io.File;

/* renamed from: com.ss.android.agilelogger.b */
public final class C18783b {

    /* renamed from: a */
    public int f51929a;

    /* renamed from: b */
    public int f51930b;

    /* renamed from: c */
    public String f51931c;

    /* renamed from: d */
    public String f51932d;

    /* renamed from: e */
    public boolean f51933e;

    /* renamed from: f */
    public boolean f51934f;

    /* renamed from: g */
    public int f51935g;

    /* renamed from: h */
    public int f51936h;

    /* renamed from: i */
    public int f51937i;

    /* renamed from: com.ss.android.agilelogger.b$a */
    public static class C18785a {

        /* renamed from: a */
        public String f51938a;

        /* renamed from: b */
        private int f51939b = C18782a.f51928c;

        /* renamed from: c */
        private int f51940c = C18782a.f51927b;

        /* renamed from: d */
        private int f51941d = VideoPreloadSizeExperiment.DEFAULT;

        /* renamed from: e */
        private int f51942e = 3;

        /* renamed from: f */
        private String f51943f;

        /* renamed from: g */
        private boolean f51944g = true;

        /* renamed from: h */
        private boolean f51945h = true;

        /* renamed from: i */
        private int f51946i = 3;

        /* renamed from: a */
        public final C18783b mo38393a() {
            String str;
            String str2 = null;
            C18783b bVar = new C18783b();
            bVar.f51929a = this.f51939b;
            bVar.f51930b = this.f51940c;
            if (TextUtils.isEmpty(this.f51943f)) {
                File filesDir = C18778a.m45838a().getFilesDir();
                if (filesDir != null) {
                    File file = new File(filesDir.getAbsolutePath(), "ALOG");
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    str2 = file.getAbsolutePath();
                }
            } else {
                str2 = this.f51943f;
            }
            bVar.f51931c = str2;
            bVar.f51936h = this.f51941d;
            if (TextUtils.isEmpty(this.f51938a)) {
                Context a = C18778a.m45838a();
                File externalFilesDir = a.getExternalFilesDir("logs");
                if (externalFilesDir == null) {
                    externalFilesDir = new File(a.getFilesDir(), "logs");
                }
                if (!externalFilesDir.exists()) {
                    externalFilesDir.mkdir();
                }
                str = externalFilesDir.getAbsolutePath();
            } else {
                str = this.f51938a;
            }
            bVar.f51932d = str;
            bVar.f51933e = this.f51944g;
            bVar.f51934f = this.f51945h;
            bVar.f51935g = this.f51942e;
            bVar.f51937i = this.f51946i;
            return bVar;
        }

        /* renamed from: a */
        public final C18785a mo38392a(int i) {
            this.f51939b = i;
            return this;
        }

        /* renamed from: b */
        public final C18785a mo38394b(int i) {
            this.f51940c = 2097152;
            return this;
        }

        public C18785a(Context context) {
            if (context != null) {
                C18778a.f51914a = context.getApplicationContext();
                return;
            }
            throw new RuntimeException("context must not be null");
        }
    }

    private C18783b() {
        this.f51935g = 3;
    }
}
