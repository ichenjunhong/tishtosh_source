package com.bytedance.android.livesdk.user;

import android.app.Activity;
import com.bytedance.android.livesdk.user.C8319a.C8320a;

/* renamed from: com.bytedance.android.livesdk.user.k */
public class C8341k extends C8319a {

    /* renamed from: b */
    int f22699b;

    /* renamed from: c */
    String f22700c;

    /* renamed from: d */
    Activity f22701d;

    /* renamed from: e */
    long f22702e;

    /* renamed from: com.bytedance.android.livesdk.user.k$a */
    public static abstract class C8342a<T extends C8342a<T>> extends C8320a<T> {

        /* renamed from: b */
        int f22703b;

        /* renamed from: c */
        String f22704c = "";

        /* renamed from: d */
        Activity f22705d;

        /* renamed from: e */
        long f22706e;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract T mo14502a();

        /* renamed from: b */
        public final T mo14550b(long j) {
            this.f22706e = j;
            return mo14502a();
        }

        /* renamed from: a */
        public final T mo14546a(int i) {
            this.f22703b = i;
            return mo14502a();
        }

        /* renamed from: a */
        public final T mo14547a(Activity activity) {
            this.f22705d = activity;
            return mo14502a();
        }

        /* renamed from: a */
        public final T mo14548a(String str) {
            this.f22704c = str;
            return mo14502a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.user.k$b */
    public static final class C8343b<T extends C8343b<T>> extends C8342a<T> {
        C8343b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public T mo14549b() {
            return this;
        }

        /* renamed from: c */
        public final C8341k mo14551c() {
            return new C8341k(this);
        }
    }

    C8341k(C8342a aVar) {
        super(aVar);
        this.f22700c = aVar.f22704c;
        this.f22699b = aVar.f22703b;
        this.f22701d = aVar.f22705d;
        this.f22702e = aVar.f22706e;
    }
}
