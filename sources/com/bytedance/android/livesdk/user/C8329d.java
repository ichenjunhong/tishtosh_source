package com.bytedance.android.livesdk.user;

import android.app.Activity;
import com.bytedance.android.livesdk.user.C8325b.C8326a;

/* renamed from: com.bytedance.android.livesdk.user.d */
public final class C8329d extends C8325b {

    /* renamed from: g */
    Activity f22678g;

    /* renamed from: h */
    String f22679h;

    /* renamed from: i */
    String f22680i;

    /* renamed from: com.bytedance.android.livesdk.user.d$a */
    public static abstract class C8331a<T extends C8326a<T>> extends C8326a<T> {

        /* renamed from: g */
        Activity f22681g;

        /* renamed from: h */
        String f22682h;

        /* renamed from: i */
        String f22683i;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract T mo14502a();

        /* renamed from: e */
        public final T mo14512e(String str) {
            this.f22682h = str;
            return mo14502a();
        }

        /* renamed from: f */
        public final T mo14513f(String str) {
            this.f22683i = str;
            return mo14502a();
        }

        /* renamed from: a */
        public final T mo14511a(Activity activity) {
            this.f22681g = activity;
            return mo14502a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.user.d$b */
    public static final class C8332b<T extends C8331a<T>> extends C8331a<T> {
        C8332b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public T mo14505b() {
            return this;
        }

        /* renamed from: c */
        public final C8329d mo14514c() {
            return new C8329d(this);
        }
    }

    private C8329d(C8331a aVar) {
        super(aVar);
        this.f22678g = aVar.f22681g;
        this.f22679h = aVar.f22682h;
        this.f22680i = aVar.f22683i;
    }
}
