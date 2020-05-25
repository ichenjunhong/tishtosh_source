package com.bytedance.android.livesdk.rank;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0176h;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.widget.CircleProgressView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.rank.j */
public final class C8209j {

    /* renamed from: a */
    final int f22393a;

    /* renamed from: b */
    public ViewGroup f22394b;

    /* renamed from: c */
    HSImageView f22395c;

    /* renamed from: d */
    TextView f22396d;

    /* renamed from: e */
    CircleProgressView f22397e;

    /* renamed from: f */
    long f22398f;

    /* renamed from: g */
    Context f22399g;

    /* renamed from: h */
    C0176h f22400h;

    /* renamed from: i */
    public ObjectAnimator f22401i;

    /* renamed from: j */
    public Bundle f22402j;

    public C8209j(Context context, C0176h hVar, ViewGroup viewGroup) {
        this.f22399g = context;
        this.f22400h = hVar;
        this.f22394b = viewGroup;
        if (context != null) {
            this.f22395c = (HSImageView) this.f22394b.findViewById(R.id.dm3);
            this.f22396d = (TextView) this.f22394b.findViewById(R.id.dyk);
            this.f22397e = (CircleProgressView) this.f22394b.findViewById(R.id.e1r);
            C9432q.m18679a((View) this.f22394b, -3, (int) C9432q.m18687b(context, 26.0f));
        }
        this.f22393a = (int) C9432q.m18687b(context, 20.0f);
    }
}
