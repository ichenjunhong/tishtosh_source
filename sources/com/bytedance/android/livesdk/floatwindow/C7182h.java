package com.bytedance.android.livesdk.floatwindow;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.floatwindow.h */
public final class C7182h {

    /* renamed from: a */
    public static Map<String, C7171b> f19509a = new HashMap();

    /* renamed from: b */
    public static String f19510b = "live_default_window";

    /* renamed from: com.bytedance.android.livesdk.floatwindow.h$a */
    public static class C7183a {

        /* renamed from: a */
        Context f19511a;

        /* renamed from: b */
        View f19512b;

        /* renamed from: c */
        int f19513c;

        /* renamed from: d */
        int f19514d = -2;

        /* renamed from: e */
        int f19515e = -2;

        /* renamed from: f */
        int f19516f = 8388659;

        /* renamed from: g */
        int f19517g;

        /* renamed from: h */
        int f19518h;

        /* renamed from: i */
        boolean f19519i = true;

        /* renamed from: j */
        Class[] f19520j;

        /* renamed from: k */
        int f19521k = 3;

        /* renamed from: l */
        int f19522l;

        /* renamed from: m */
        int f19523m;

        /* renamed from: n */
        long f19524n = 300;

        /* renamed from: o */
        TimeInterpolator f19525o;

        /* renamed from: p */
        String f19526p = C7182h.f19510b;

        /* renamed from: q */
        boolean f19527q;

        /* renamed from: r */
        C7173d f19528r;

        /* renamed from: s */
        C7174e f19529s;

        private C7183a() {
        }

        /* renamed from: a */
        public final void mo13334a() {
            if (!C7182h.f19509a.containsKey(this.f19526p)) {
                if (this.f19512b != null || this.f19513c != 0) {
                    if (this.f19512b == null) {
                        this.f19512b = ((LayoutInflater) this.f19511a.getSystemService("layout_inflater")).inflate(this.f19513c, null);
                    }
                    C7182h.f19509a.put(this.f19526p, new C7176g(this));
                }
            }
        }

        /* renamed from: a */
        public final C7183a mo13326a(int i) {
            this.f19514d = i;
            return this;
        }

        /* renamed from: b */
        public final C7183a mo13335b(int i) {
            this.f19515e = i;
            return this;
        }

        /* renamed from: c */
        public final C7183a mo13337c(int i) {
            this.f19521k = 2;
            return this;
        }

        C7183a(Context context) {
            this.f19511a = context;
        }

        /* renamed from: a */
        public final C7183a mo13330a(View view) {
            this.f19512b = view;
            return this;
        }

        /* renamed from: a */
        public final C7183a mo13331a(C7174e eVar) {
            this.f19529s = eVar;
            return this;
        }

        /* renamed from: a */
        public final C7183a mo13332a(String str) {
            this.f19526p = str;
            return this;
        }

        /* renamed from: a */
        public final C7183a mo13333a(boolean z) {
            this.f19527q = true;
            return this;
        }

        /* renamed from: a */
        public final C7183a mo13328a(int i, int i2) {
            this.f19522l = 0;
            this.f19523m = 0;
            return this;
        }

        /* renamed from: a */
        public final C7183a mo13327a(int i, float f) {
            this.f19517g = (int) (((float) C9432q.m18670a(this.f19511a)) * 0.1f);
            return this;
        }

        /* renamed from: b */
        public final C7183a mo13336b(int i, float f) {
            this.f19518h = (int) (((float) C9432q.m18688b(this.f19511a)) * f);
            return this;
        }

        /* renamed from: a */
        public final C7183a mo13329a(long j, TimeInterpolator timeInterpolator) {
            this.f19524n = 300;
            this.f19525o = timeInterpolator;
            return this;
        }
    }

    /* renamed from: a */
    public static C7183a m14894a(Context context) {
        return new C7183a(context);
    }

    /* renamed from: a */
    public static C7171b m14893a(String str) {
        if (C9431p.m18664a(str)) {
            return null;
        }
        return (C7171b) f19509a.get(str);
    }
}
