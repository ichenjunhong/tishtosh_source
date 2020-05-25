package com.p683ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fv */
public final class C43853fv {

    /* renamed from: a */
    public static final C43853fv f111091a = new C43853fv();

    private C43853fv() {
    }

    /* renamed from: a */
    public static final String m96286a(User user) {
        String uniqueId;
        String str;
        C52711k.m112240b(user, "user");
        if (TextUtils.isEmpty(user.getUniqueId())) {
            uniqueId = user.getShortId();
            str = "user.shortId";
        } else {
            uniqueId = user.getUniqueId();
            str = "user.uniqueId";
        }
        C52711k.m112236a((Object) uniqueId, str);
        return uniqueId;
    }
}
