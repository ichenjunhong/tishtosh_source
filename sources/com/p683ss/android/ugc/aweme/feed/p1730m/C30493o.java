package com.p683ss.android.ugc.aweme.feed.p1730m;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.PrivateUrlModel;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30316ah;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.m.o */
public class C30493o extends C30500t {

    /* renamed from: b */
    private Aweme f79702b;

    /* renamed from: c */
    private int f79703c;

    /* renamed from: d */
    private int f79704d;

    /* renamed from: e */
    private Context f79705e;

    /* renamed from: b */
    public final void mo44838b() {
        int i;
        super.mo44838b();
        if (this.f79702b != null) {
            this.f79702b.getStatus().setPrivateStatus(this.f79703c);
            int i2 = 0;
            switch (this.f79703c) {
                case 0:
                    i = 0;
                    i2 = R.string.d0z;
                    break;
                case 1:
                    i2 = R.string.cxv;
                    i = 1;
                    break;
                case 2:
                    i2 = R.string.de_;
                    i = 11;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i2 != 0) {
                C10691a.m21533a(this.f79705e, i2).mo19066a();
            }
            C23324d.m57378a().updateAweme(this.f79702b);
            C47718bf.m103288a(new C30316ah((PrivateUrlModel) this.f70700f.getData(), this.f79702b, i, this.f79704d));
        }
    }

    public C30493o(Context context) {
        this.f79705e = context;
    }

    /* renamed from: c_ */
    public void mo44840c_(Exception exc) {
        Throwable a = C22971a.m56490a((Throwable) exc);
        if (a instanceof C23459a) {
            C23459a aVar = (C23459a) a;
            if (!TextUtils.isEmpty(aVar.getErrorMsg())) {
                C10691a.m21545b(this.f79705e, aVar.getErrorMsg()).mo19066a();
                return;
            }
        }
        super.mo44840c_(exc);
    }

    /* renamed from: a */
    public final void mo60917a(Aweme aweme, int i) {
        this.f79702b = aweme;
        this.f79704d = this.f79702b.getStatus().getPrivateStatus();
        this.f79703c = i;
    }
}
