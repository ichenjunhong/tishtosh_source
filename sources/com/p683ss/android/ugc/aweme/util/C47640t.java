package com.p683ss.android.ugc.aweme.util;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.qrcode.view.C41047a;
import com.p683ss.android.ugc.aweme.util.C47634q.C47637a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.util.t */
public class C47640t implements C47637a {

    /* renamed from: a */
    private Activity f120110a;

    /* renamed from: b */
    private C41047a f120111b;

    /* renamed from: a */
    public final void mo94935a() {
        Activity activity = this.f120110a;
        if (this.f120111b == null && activity != null) {
            this.f120111b = C41047a.m90709a(activity, activity.getResources().getString(R.string.d7z));
            this.f120111b.setIndeterminate(false);
        }
        if (this.f120111b != null && !this.f120111b.isShowing()) {
            this.f120111b.show();
            this.f120111b.mo83562a();
        }
    }

    public C47640t(Activity activity) {
        this.f120110a = activity;
    }

    /* renamed from: a */
    public void mo86129a(String str) {
        if (this.f120111b != null && this.f120111b.isShowing()) {
            this.f120111b.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo94936a(Throwable th) {
        C10691a.m21533a((Context) this.f120110a, (int) R.string.d_5).mo19066a();
        if (this.f120111b != null && this.f120111b.isShowing()) {
            this.f120111b.dismiss();
        }
    }
}
