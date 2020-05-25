package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.gyf.barlibrary.ImmersionBar;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.utils.fa */
public final class C47875fa {
    /* renamed from: b */
    public static void m103569b(Activity activity) {
        ImmersionBar.with(activity).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    /* renamed from: a */
    public static void m103568a(Activity activity) {
        ImmersionBar.with(activity).statusBarDarkFont(true).statusBarColor((int) R.color.wo).init();
    }

    /* renamed from: a */
    public static View m103567a(Activity activity, Context context, int i, int i2) {
        C10722c cVar = new C10723a(activity).mo19280b(i).mo19282c(i2).mo19277a((int) R.drawable.dww).f28711a;
        MtEmptyView a = MtEmptyView.m21697a(context);
        a.setStatus(cVar);
        return a;
    }
}
