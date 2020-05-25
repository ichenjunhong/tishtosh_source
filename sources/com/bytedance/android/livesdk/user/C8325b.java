package com.bytedance.android.livesdk.user;

import com.bytedance.android.livesdk.user.C8319a.C8320a;

/* renamed from: com.bytedance.android.livesdk.user.b */
public class C8325b extends C8319a {

    /* renamed from: b */
    String f22666b;

    /* renamed from: c */
    String f22667c;

    /* renamed from: d */
    String f22668d;

    /* renamed from: e */
    long f22669e;

    /* renamed from: f */
    String f22670f;

    /* renamed from: com.bytedance.android.livesdk.user.b$a */
    public static abstract class C8326a<T extends C8326a<T>> extends C8320a<C8326a<T>> {

        /* renamed from: b */
        String f22671b = "";

        /* renamed from: c */
        String f22672c = "";

        /* renamed from: d */
        String f22673d = "";

        /* renamed from: e */
        long f22674e;

        /* renamed from: f */
        String f22675f = "";

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract T mo14502a();

        /* renamed from: b */
        public final T mo14506b(long j) {
            this.f22674e = j;
            return mo14502a();
        }

        /* renamed from: c */
        public final T mo14508c(String str) {
            this.f22673d = str;
            return mo14502a();
        }

        /* renamed from: d */
        public final T mo14509d(String str) {
            this.f22675f = str;
            return mo14502a();
        }

        /* renamed from: a */
        public final T mo14504a(String str) {
            this.f22671b = str;
            return mo14502a();
        }

        /* renamed from: b */
        public final T mo14507b(String str) {
            this.f22672c = str;
            return mo14502a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.user.b$b */
    public static final class C8327b<T extends C8326a<T>> extends C8326a<T> {
        C8327b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final T mo14502a() {
            return this;
        }

        /* renamed from: c */
        public final C8325b mo14510c() {
            return new C8325b(this);
        }
    }

    C8325b(C8326a aVar) {
        super(aVar);
        this.f22666b = aVar.f22671b;
        this.f22667c = aVar.f22672c;
        this.f22668d = aVar.f22673d;
        this.f22669e = aVar.f22674e;
        this.f22670f = aVar.f22675f;
    }
}
