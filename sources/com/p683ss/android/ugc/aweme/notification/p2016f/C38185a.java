package com.p683ss.android.ugc.aweme.notification.p2016f;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.model.C23556a;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38041h;
import com.p683ss.android.ugc.aweme.notification.NotificationDetailActivity;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35457c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.f.a */
public final class C38185a extends C38188d {
    /* renamed from: b */
    public final int mo72634b() {
        return 7;
    }

    public final String bm_() {
        return "ad_helper";
    }

    public final int bn_() {
        return 1;
    }

    /* renamed from: g */
    public final int mo78184g() {
        return 21;
    }

    /* renamed from: a */
    public final C35457c mo72633a() {
        return new C38186b(this);
    }

    /* renamed from: d */
    public final void mo72643d() {
        this.f91116g = C11010c.m22280a().getString(R.string.bnb);
        this.f91115f = C23556a.m57755a(R.drawable.clp);
    }

    /* renamed from: f */
    public final void mo78183f() {
        super.mo78183f();
        C47718bf.m103288a(new C38041h(mo78184g(), -1));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo78182a(Context context, C35456b bVar, int i) {
        if (i == 1 || i == 2) {
            mo78183f();
            NotificationDetailActivity.m85162a(context, 7, this.f91119j);
            return;
        }
        if (i == 0) {
            C26891a aVar = new C26891a(context);
            aVar.mo54844a((CharSequence[]) new String[]{context.getResources().getString(R.string.bge)}, (OnClickListener) new C38187c(this));
            aVar.mo54845b();
        }
    }
}
