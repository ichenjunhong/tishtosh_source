package com.p683ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.movie.api.MovieDetailAPi.C37175a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.qrcode.view.C41047a;
import com.p683ss.android.ugc.aweme.share.C41941ab.C41955c;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.share.w */
public final class C42250w {

    /* renamed from: a */
    C41047a f106812a;

    /* renamed from: b */
    Context f106813b;

    /* renamed from: c */
    public String f106814c = "";

    /* renamed from: d */
    public String f106815d = "";

    /* renamed from: e */
    public boolean f106816e = true;

    /* renamed from: f */
    int f106817f = 2;

    /* renamed from: g */
    public C41955c f106818g;

    /* renamed from: a */
    private boolean m92707a() {
        boolean z;
        if (!C48016e.m103957g()) {
            C9432q.m18672a(this.f106813b, (int) R.string.da8);
        } else if (C48016e.m103958h() < 20971520) {
            C9432q.m18672a(this.f106813b, (int) R.string.da9);
        } else {
            z = true;
            if (z || !C41940aa.m91889a(C11010c.m22280a())) {
                return false;
            }
            if (!this.f106816e) {
                return true;
            }
            if (this.f106812a == null) {
                this.f106812a = C41047a.m90709a(this.f106813b, this.f106813b.getResources().getString(R.string.au9));
                this.f106812a.setIndeterminate(false);
            } else if ((this.f106813b instanceof Activity) && !((Activity) this.f106813b).isFinishing()) {
                this.f106812a.show();
                this.f106812a.mo83562a();
            }
            return true;
        }
        z = false;
        if (z) {
        }
        return false;
    }

    public C42250w(Context context) {
        this.f106813b = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C52860x mo86225a(Integer num) {
        if (num.intValue() == 2004 || num.intValue() == 2002) {
            C10691a.m21545b(this.f106813b, this.f106813b.getResources().getString(R.string.cf2)).mo19066a();
        } else if (num.intValue() == 2003) {
            C10691a.m21545b(this.f106813b, this.f106813b.getResources().getString(R.string.cf1)).mo19066a();
        } else if (num.intValue() == 2006) {
            C10691a.m21545b(this.f106813b, this.f106813b.getResources().getString(R.string.b07)).mo19066a();
        } else {
            C10691a.m21545b(this.f106813b, this.f106813b.getResources().getString(R.string.cf0)).mo19066a();
        }
        if (this.f106812a != null) {
            C47700ay.m103236b(this.f106812a);
        }
        if (this.f106818g != null) {
            this.f106818g.mo83478a(num.intValue());
        }
        return null;
    }

    /* renamed from: b */
    public void mo86228b(String str, int i) {
        if (m92707a()) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C42251x(this, str, i));
        }
    }

    public C42250w(Context context, int i) {
        this.f106813b = context;
        this.f106817f = i;
    }

    /* renamed from: a */
    public final void mo86226a(String str, int i) {
        int i2;
        if (AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().getMvPlan() <= 0) {
            i2 = 1;
        } else if (i == C37175a.m83417a()) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        mo86228b(str, i2);
    }

    /* renamed from: a */
    public final void mo86227a(String str, int i, String str2, String str3) {
        this.f106814c = str2;
        this.f106815d = str3;
        mo86226a(str, 0);
    }
}
