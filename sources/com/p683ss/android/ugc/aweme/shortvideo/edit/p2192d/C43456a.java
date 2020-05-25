package com.p683ss.android.ugc.aweme.shortvideo.edit.p2192d;

import android.content.res.Resources;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a */
public final class C43456a {

    /* renamed from: a */
    public static final C43456a f109843a = new C43456a();

    private C43456a() {
    }

    /* renamed from: a */
    public static String m95260a(User user) {
        if (user != null) {
            String nickname = user.getNickname();
            if (nickname != null) {
                return nickname;
            }
        }
        return "";
    }

    /* renamed from: a */
    public static String m95261a(User user, Resources resources) {
        CharSequence charSequence;
        C52711k.m112240b(resources, "resources");
        String str = null;
        if (C39629l.m88232a().mo58564B().mo74268b()) {
            if (user != null) {
                charSequence = user.getUniqueId();
            } else {
                charSequence = null;
            }
            if (TextUtils.isEmpty(charSequence)) {
                if (user != null) {
                    str = user.getShortId();
                }
            } else if (user != null) {
                str = user.getUniqueId();
            }
        } else if (user != null) {
            str = user.getNickname();
        }
        if (TextUtils.isEmpty(str)) {
            return resources.getText(R.string.ip).toString();
        }
        return str;
    }
}
