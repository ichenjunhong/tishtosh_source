package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.live.core.p235h.C3924b;
import com.bytedance.android.livesdk.feed.p341i.C6968ai;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.j */
final /* synthetic */ class C6888j implements C3924b {

    /* renamed from: a */
    static final C3924b f18860a = new C6888j();

    private C6888j() {
    }

    /* renamed from: a */
    public final C3923a mo9284a(ViewGroup viewGroup, Object[] objArr) {
        return new C6968ai(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.api, viewGroup, false));
    }
}
