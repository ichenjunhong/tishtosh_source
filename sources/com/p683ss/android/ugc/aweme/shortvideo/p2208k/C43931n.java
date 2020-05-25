package com.p683ss.android.ugc.aweme.shortvideo.p2208k;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.k.n */
public final class C43931n {

    /* renamed from: a */
    public static final C43931n f111232a = new C43931n();

    private C43931n() {
    }

    /* renamed from: a */
    public static boolean m96463a(Aweme aweme) {
        if (!(aweme == null || aweme.getAuthor() == null)) {
            User author = aweme.getAuthor();
            C52711k.m112236a((Object) author, "aweme.author");
            if (author.getFollowStatus() == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo89486b(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        if (aweme.getAuthor() == null) {
            return false;
        }
        User author = aweme.getAuthor();
        C52711k.m112236a((Object) author, "aweme.author");
        int duetSetting = author.getDuetSetting();
        if (duetSetting == 3) {
            return false;
        }
        switch (duetSetting) {
            case 0:
                return true;
            case 1:
                return m96463a(aweme);
            default:
                return false;
        }
    }
}
