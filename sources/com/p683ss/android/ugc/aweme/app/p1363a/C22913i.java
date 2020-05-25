package com.p683ss.android.ugc.aweme.app.p1363a;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.IAccountService.C20839f;
import com.p683ss.android.ugc.aweme.login.p1637a.C27957d;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39800d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;

/* renamed from: com.ss.android.ugc.aweme.app.a.i */
public class C22913i implements C20839f {

    /* renamed from: a */
    protected boolean f61239a = false;

    /* renamed from: b */
    protected boolean f61240b = false;

    /* renamed from: c */
    Activity f61241c = null;

    /* renamed from: d */
    private Handler f61242d = new Handler(Looper.getMainLooper());

    public C22913i() {
    }

    public C22913i(Activity activity) {
        this.f61241c = activity;
    }

    /* renamed from: a */
    public final void mo44387a(int i, int i2, String str) {
        if (i == 8 && i2 == 4) {
            C47718bf.m103288a(new C39800d(2));
        } else if (i == 9 && i2 == 1) {
            if (!C48121w.m104087I()) {
                C48121w.m104249M().mo95293z();
            } else {
                C50130a.m108170a().mo60215af();
            }
        }
        if (i == 1) {
            if (i2 == 1) {
                if (C48121w.m104249M().mo95257o()) {
                    this.f61242d.postDelayed(C22914j.f61243a, 500);
                    this.f61239a = true;
                }
            } else if (i2 == 4 && (this.f61239a || this.f61240b)) {
                this.f61242d.postDelayed(new C22915k(this), 500);
            }
        }
        if ((i == 1 || i == 7 || i == 10) && i2 == 4) {
            new Handler().postDelayed(C22916l.f61245a, 200);
        }
        if (i2 == 1) {
            C47718bf.m103288a(new C27957d(true));
        }
    }
}
