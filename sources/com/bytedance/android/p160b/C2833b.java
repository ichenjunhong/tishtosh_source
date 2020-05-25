package com.bytedance.android.p160b;

import android.content.Context;
import android.text.TextUtils;
import android.view.TextureView;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y.C8726a;
import com.bytedance.android.p160b.C2831a.C2832a;

/* renamed from: com.bytedance.android.b.b */
public interface C2833b extends C2831a {

    /* renamed from: com.bytedance.android.b.b$a */
    public static class C2834a {

        /* renamed from: a */
        public Context f8436a;

        /* renamed from: b */
        public String f8437b;

        /* renamed from: c */
        public String f8438c;

        /* renamed from: d */
        public String f8439d;

        /* renamed from: e */
        public String f8440e;

        /* renamed from: f */
        public C8710m f8441f;

        /* renamed from: g */
        public C8726a f8442g;

        /* renamed from: h */
        public boolean f8443h = true;

        /* renamed from: i */
        public int f8444i;

        /* renamed from: a */
        public final C2834a mo7465a(C8710m mVar) {
            this.f8441f = mVar;
            return this;
        }

        /* renamed from: b */
        public final C2834a mo7468b(String str) {
            this.f8438c = str;
            return this;
        }

        /* renamed from: d */
        public final C2834a mo7470d(String str) {
            this.f8440e = str;
            return this;
        }

        /* renamed from: a */
        public static C2834a m8085a(Context context) {
            return new C2834a(context);
        }

        private C2834a(Context context) {
            this.f8436a = context;
        }

        /* renamed from: a */
        public final C2834a mo7466a(C8726a aVar) {
            this.f8442g = aVar;
            return this;
        }

        /* renamed from: a */
        public final C2834a mo7467a(String str) {
            this.f8437b = str;
            if (!TextUtils.isEmpty(this.f8437b)) {
                this.f8444i = 1;
            }
            return this;
        }

        /* renamed from: c */
        public final C2834a mo7469c(String str) {
            this.f8439d = str;
            if (this.f8444i == 0 && !TextUtils.isEmpty(this.f8439d)) {
                this.f8444i = 2;
            }
            return this;
        }
    }

    void attach(Context context, TextureView textureView, C2832a aVar);

    String getPlayerTag();

    void initialize(long j, C2834a aVar);

    void release();

    boolean warmUp();
}
