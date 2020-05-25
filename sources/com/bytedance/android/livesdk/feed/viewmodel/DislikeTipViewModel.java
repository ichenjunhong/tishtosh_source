package com.bytedance.android.livesdk.feed.viewmodel;

import android.content.Context;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.bytedance.ies.p672e.C10753b;

public class DislikeTipViewModel extends RxViewModel {

    /* renamed from: a */
    public boolean f19389a;

    /* renamed from: b */
    public int f19390b;

    /* renamed from: c */
    public Context f19391c;

    /* renamed from: d */
    public boolean f19392d;

    public DislikeTipViewModel(C7023m mVar, long j, Context context) {
        boolean z;
        C6945f a = mVar.mo13182a(j);
        if (a == null || a.f19018j <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f19389a = z;
        this.f19391c = context;
        this.f19392d = C10753b.m21794a(this.f19391c, "ttlive_live_user").mo19444a("HAVE_SHOW_DISLIKE_GUIDE", false);
    }
}
