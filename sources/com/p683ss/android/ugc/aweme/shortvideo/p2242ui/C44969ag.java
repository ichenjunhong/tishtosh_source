package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.p683ss.android.ugc.aweme.setting.C41626j;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41693b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41700e;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ag */
public final class C44969ag implements C41693b {

    /* renamed from: a */
    CommonItemView f113894a;

    /* renamed from: b */
    HashMap<String, String> f113895b;

    /* renamed from: c */
    C41686c f113896c;

    /* renamed from: d */
    private C41700e f113897d = new C41700e();

    /* renamed from: e_ */
    public final void mo55285e_(Exception exc) {
    }

    /* renamed from: a */
    public final void mo55281a(C41686c cVar) {
        this.f113896c = cVar;
        if (!(this.f113894a == null || this.f113896c == null || this.f113896c.f105499o != C41626j.f105361d)) {
            this.f113894a.setChecked(false);
            this.f113894a.setAlpha(0.66f);
        }
    }

    public C44969ag(CommonItemView commonItemView, boolean z, HashMap<String, String> hashMap) {
        this.f113894a = commonItemView;
        this.f113895b = hashMap;
        if (C41626j.m91500a()) {
            this.f113894a.setVisibility(0);
            this.f113894a.setChecked(z);
            this.f113894a.setOnClickListener(new C44970ah(this));
            this.f113897d = new C41700e();
            this.f113897d.mo54800a(this);
            this.f113897d.mo44934a_(new Object[0]);
            return;
        }
        this.f113894a.setVisibility(8);
    }
}
