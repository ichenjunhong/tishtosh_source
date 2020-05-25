package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.tools.C47349x;
import com.p683ss.android.ugc.aweme.tools.C47351z;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.er */
final /* synthetic */ class C43794er implements Runnable {

    /* renamed from: a */
    private final C43791eo f110892a;

    /* renamed from: b */
    private final Integer f110893b;

    /* renamed from: c */
    private final C47349x f110894c;

    C43794er(C43791eo eoVar, Integer num, C47349x xVar) {
        this.f110892a = eoVar;
        this.f110893b = num;
        this.f110894c = xVar;
    }

    public final void run() {
        C43791eo eoVar = this.f110892a;
        Integer num = this.f110893b;
        C47349x xVar = this.f110894c;
        if (num.intValue() != 0) {
            int intValue = num.intValue();
            StringBuilder sb = new StringBuilder("start Record ret :");
            sb.append(intValue);
            C45407ay.m98971b(sb.toString());
            StringBuilder sb2 = new StringBuilder("start failed , ve result = ");
            sb2.append(intValue);
            C47858ep.m103512a("record_error", "2", sb2.toString());
            C10691a.m21542b((Context) eoVar.f110885a, (int) R.string.d8l).mo19066a();
            eoVar.f110886b.mo91335a(new C47351z());
        } else if (!((ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) eoVar.f110885a).mo359a(ShortVideoContextViewModel.class)).mo86391c()) {
            ShortVideoContext shortVideoContext = eoVar.f110887c;
            eoVar.f110886b.f114031i.mo7350a(xVar);
        }
    }
}
