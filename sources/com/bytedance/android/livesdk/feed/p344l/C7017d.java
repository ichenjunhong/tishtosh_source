package com.bytedance.android.livesdk.feed.p344l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.live.core.p235h.C3924b;
import com.bytedance.android.livesdk.feed.p338f.C6926k;
import com.bytedance.android.livesdk.feed.p341i.C6970ak;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.l.d */
public final /* synthetic */ class C7017d implements C3924b {

    /* renamed from: a */
    private final C6926k f19167a;

    public C7017d(C6926k kVar) {
        this.f19167a = kVar;
    }

    /* renamed from: a */
    public final C3923a mo9284a(ViewGroup viewGroup, Object[] objArr) {
        return new C6970ak(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.apk, viewGroup, false), this.f19167a);
    }
}
