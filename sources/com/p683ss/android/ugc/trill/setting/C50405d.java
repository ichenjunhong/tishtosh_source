package com.p683ss.android.ugc.trill.setting;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.net.C37745b;
import com.p683ss.android.ugc.aweme.net.C37757d;
import com.p683ss.android.ugc.bogut.library.p2415b.C48501a;
import com.p683ss.android.ugc.trill.setting.p2524a.C50392a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.setting.d */
public final class C50405d extends C48501a<PushSettingActivity> {

    /* renamed from: c */
    public int f126383c;

    /* renamed from: d */
    private C37757d<String> f126384d = new C37757d<String>() {
        /* renamed from: a */
        public final void mo46329a(Exception exc) {
            C22971a.m56493a(C11010c.m22280a(), (Throwable) exc);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo46330a(String str, Object obj) {
            String str2 = (String) obj;
            if (C50405d.this.f121942a != null) {
                switch (C50405d.this.f126383c) {
                    case 1:
                        ((PushSettingActivity) C50405d.this.f121942a).mo98288c();
                        return;
                    case 2:
                        ((PushSettingActivity) C50405d.this.f121942a).mo98287b();
                        return;
                    case 3:
                        ((PushSettingActivity) C50405d.this.f121942a).mo98289d();
                        break;
                }
            }
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo98307a(int i, boolean z) {
        if (i == R.id.ban) {
            this.f126383c = 2;
        } else if (i == R.id.aia) {
            this.f126383c = 1;
        } else if (i == R.id.xd) {
            this.f126383c = 3;
        }
        if (this.f121942a != null) {
            C37745b a = C50392a.m108684a(this.f126383c, z ? 1 : 0);
            a.mo77239a((C37757d) this.f126384d);
            a.mo77238a();
        }
    }
}
