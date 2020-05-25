package com.bytedance.android.livesdk.gift.effect.doodle;

import android.view.LayoutInflater;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p421v.C8374c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.g */
final /* synthetic */ class C7355g implements Runnable {

    /* renamed from: a */
    private final C7330a f20063a;

    C7355g(C7330a aVar) {
        this.f20063a = aVar;
    }

    public final void run() {
        C7330a aVar = this.f20063a;
        if (!((Boolean) C4525b.f12310F.mo10345a()).booleanValue()) {
            aVar.mo13593a();
            aVar.f20009p = (C8374c) ((C8374c) ((C8374c) ((C8374c) C8374c.m16598b(aVar.getContext()).mo14564a(LayoutInflater.from(aVar.getContext()).inflate(R.layout.bxo, null))).mo14571c(C3922z.m9899a(44.0f))).mo14572c(true)).mo14561a();
            aVar.f20009p.mo14566a(aVar.f20005l, 1, 3, C3922z.m9899a(8.0f), -C3922z.m9899a(6.0f));
            C4525b.f12310F.mo10346a(Boolean.valueOf(true));
        }
    }
}
