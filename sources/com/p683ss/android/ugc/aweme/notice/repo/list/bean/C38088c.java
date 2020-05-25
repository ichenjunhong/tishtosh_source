package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.c */
public final class C38088c {

    /* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.c$a */
    static final class C38089a extends C52712l implements C52671b<User, CharSequence> {

        /* renamed from: a */
        public static final C38089a f96895a = new C38089a();

        C38089a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            User user = (User) obj;
            C52711k.m112240b(user, "it");
            String uid = user.getUid();
            if (uid != null) {
                return uid;
            }
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
    }

    /* renamed from: a */
    public static final String m85161a(CheckProfileNotice checkProfileNotice) {
        C52711k.m112240b(checkProfileNotice, "$this$customNid");
        List users = checkProfileNotice.getUsers();
        if (users != null) {
            String a = C52575l.m112120a(users, null, null, null, 0, null, C38089a.f96895a, 31, null);
            if (a != null) {
                return a;
            }
        }
        return TEVideoRecorder.FACE_BEAUTY_NULL;
    }
}
