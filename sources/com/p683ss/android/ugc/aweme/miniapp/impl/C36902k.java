package com.p683ss.android.ugc.aweme.miniapp.impl;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.C39168b;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.C39170c;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.p2069a.C39161a;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.p2070b.C39169a;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.C39181e;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.C39181e.C39182a;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.C39194h;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.k */
final /* synthetic */ class C36902k implements Callable {

    /* renamed from: a */
    private final Activity f94280a;

    /* renamed from: b */
    private final List f94281b;

    /* renamed from: c */
    private final int f94282c;

    C36902k(Activity activity, List list, int i) {
        this.f94280a = activity;
        this.f94281b = list;
        this.f94282c = i;
    }

    public final Object call() {
        Activity activity = this.f94280a;
        List list = this.f94281b;
        int i = this.f94282c;
        C39194h hVar = new C39194h(activity, R.style.om);
        C39182a a = C39181e.m87057a().mo79841b(list).mo79836a(list).mo79831a((int) R.color.z7);
        a.f99964a = R.color.z7;
        C39182a a2 = a.mo79833a((C39170c) new C39169a()).mo79832a((C39168b) new C39161a()).mo79837a(true);
        a2.f99968e = C36904m.f94286a;
        C39181e a3 = a2.mo79838a();
        a3.f99935a = i;
        hVar.mo79874a(a3).mo79875b();
        return null;
    }
}
