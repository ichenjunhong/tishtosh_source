package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34030j;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bh */
public final class C35233bh {

    /* renamed from: a */
    public static final C35233bh f90533a = new C35233bh();

    private C35233bh() {
    }

    /* renamed from: a */
    public static void m79635a(String str) {
        boolean z;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C41302w a = C41302w.m91042a();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(str);
            a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("sec_user_id", C34030j.f87981c.mo71976a(str)).mo83870a("previous_page_position", "other_places").mo83870a("previous_page", "message").mo83870a("enter_from", "chat").mo83871a());
        }
    }

    /* renamed from: a */
    public final void mo73336a(String str, String str2) {
        boolean z;
        CharSequence charSequence = str2;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m79635a(str);
            return;
        }
        C41302w a = C41302w.m91042a();
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        sb.append(str);
        a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("sec_user_id", str2).mo83870a("previous_page_position", "other_places").mo83870a("previous_page", "message").mo83870a("enter_from", "chat").mo83871a());
    }
}
