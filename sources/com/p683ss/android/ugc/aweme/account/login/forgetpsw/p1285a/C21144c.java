package com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1285a;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.model.FindPswByEmailResponse;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1287ui.C21155b;
import com.p683ss.android.ugc.aweme.account.p1270c.C20940a;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.forgetpsw.a.c */
public final class C21144c extends C20940a<C21142b, C21155b> {
    /* renamed from: R_ */
    public final void mo44834R_() {
        super.mo44834R_();
        ((C21155b) this.f70701g).mo45290a(true);
    }

    /* renamed from: b */
    public final void mo44838b() {
        super.mo44838b();
        if (this.f70701g != null) {
            ((C21155b) this.f70701g).mo45290a(false);
        }
        if (((C21142b) this.f70700f).getData() != null) {
            int i = ((FindPswByEmailResponse) ((C21142b) this.f70700f).getData()).status_code;
            if (TextUtils.equals(((FindPswByEmailResponse) ((C21142b) this.f70700f).getData()).message, "success") && i == 0) {
                C22282t.m55151f().edit().putLong("lastTimeResetPsw", System.currentTimeMillis()).apply();
                ((C21155b) this.f70701g).mo45288a(R.string.c9_, R.string.c9a);
            } else if (((FindPswByEmailResponse) ((C21142b) this.f70700f).getData()).getData() != null) {
                ((C21155b) this.f70701g).mo45289a(C22275o.m55131a(Integer.valueOf(i), ((FindPswByEmailResponse) ((C21142b) this.f70700f).getData()).getData().getDescription()));
            }
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        super.mo44840c_(exc);
        if (this.f70701g != null) {
            ((C21155b) this.f70701g).mo45290a(false);
            ((C21155b) this.f70701g).mo45289a(((C21155b) this.f70701g).mo45287a().getString(R.string.bd5));
        }
    }
}
