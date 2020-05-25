package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2.C22770h;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2.C22776j;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2.C22777k;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2.C22780m;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2.TeenagerLockAboutFragmentV2;
import com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.fragment.p1358v2.TeenagerLockOptionsFragmentV2;
import com.p683ss.android.ugc.aweme.mobile.p1965a.C37133a;
import com.p683ss.android.ugc.aweme.mobile.p1965a.C37133a.C37135a;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.e */
public final class C22733e {
    /* renamed from: a */
    public static Fragment m56029a() {
        return m56032b(0);
    }

    /* renamed from: a */
    public static Fragment m56030a(int i) {
        if (i == 0) {
            return C37133a.m83365a(C22770h.class).mo76411a();
        }
        return C37133a.m83365a(TeenagerLockAboutFragmentV2.class).mo76411a();
    }

    /* renamed from: b */
    public static Fragment m56032b(int i) {
        return C37133a.m83365a(C22776j.class).mo76412a("type_close", i).mo76411a();
    }

    /* renamed from: c */
    public static Fragment m56033c(int i) {
        if (i == 0) {
            return C37133a.m83365a(C22777k.class).mo76411a();
        }
        return C37133a.m83365a(TeenagerLockOptionsFragmentV2.class).mo76411a();
    }

    /* renamed from: a */
    public static Fragment m56031a(boolean z) {
        C37135a a = C37133a.m83365a(C22780m.class);
        a.f94795a.putBoolean("from_change_pwd", z);
        return a.mo76411a();
    }
}
