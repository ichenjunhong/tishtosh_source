package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.j */
public final class C23666j extends C23644aa {

    /* renamed from: a */
    private final Activity f63098a;

    /* renamed from: b */
    private final String f63099b;

    /* renamed from: f */
    public final String mo49078f() {
        return "green_screen";
    }

    /* renamed from: g */
    public final Activity mo49079g() {
        return this.f63098a;
    }

    /* renamed from: h */
    public final String mo49080h() {
        return this.f63099b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49075a(android.view.View r2) {
        /*
            r1 = this;
            super.mo49075a(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r1.f63071q
            if (r2 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.feed.model.Anchor r2 = r2.getAnchor()
            if (r2 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r2 = r2.getAnchorInfo()
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = r2.getUrl()
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            if (r2 == 0) goto L_0x002a
            android.app.Activity r2 = r1.mo49079g()
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = "Not Implementation!"
            com.bytedance.ies.dmt.ui.d.a r2 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r2, r0)
            r2.mo19066a()
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23666j.mo49075a(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo49076a(Aweme aweme, JSONObject jSONObject) {
        super.mo49076a(aweme, jSONObject);
        this.f63057c.setImageResource(R.drawable.d0_);
        this.f63058d.setText(R.string.hly);
    }

    public C23666j(ViewGroup viewGroup, Activity activity, String str) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(activity, "activity");
        super(viewGroup, activity, str);
        this.f63098a = activity;
        this.f63099b = str;
    }
}
