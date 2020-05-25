package com.p683ss.android.ugc.aweme.notification.newstyle.p2027d;

import com.p683ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.d.g */
public final class C38342g extends User {
    public static final C38343a Companion = new C38343a(null);

    /* renamed from: a */
    private int f97582a;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.d.g$a */
    public static final class C38343a implements Serializable {
        private C38343a() {
        }

        public /* synthetic */ C38343a(C52707g gVar) {
            this();
        }
    }

    public final int getType() {
        return this.f97582a;
    }

    public final void setType(int i) {
        this.f97582a = i;
    }

    public C38342g(int i) {
        this.f97582a = i;
    }
}
