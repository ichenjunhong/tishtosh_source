package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.live.core.p235h.C3924b;
import com.bytedance.android.livesdk.feed.drawerfeed.p336a.C6876j;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.f */
final /* synthetic */ class C6884f implements C3924b {

    /* renamed from: a */
    private final C6890l f18853a;

    C6884f(C6890l lVar) {
        this.f18853a = lVar;
    }

    /* renamed from: a */
    public final C3923a mo9284a(ViewGroup viewGroup, Object[] objArr) {
        return new C6876j(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.apk, viewGroup, false), this.f18853a);
    }
}
