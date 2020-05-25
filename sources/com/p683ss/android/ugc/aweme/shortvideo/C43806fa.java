package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0214z;
import com.bytedance.als.ApiCenter;
import com.p683ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p683ss.android.ugc.aweme.tools.C47351z;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b;
import com.p683ss.android.ugc.gamora.recorder.p2468e.C49659a;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fa */
public final class C43806fa {

    /* renamed from: a */
    C42562ct f110939a;

    /* renamed from: b */
    private RecordStatusViewModel f110940b;

    /* renamed from: c */
    private ShortVideoContext f110941c;

    public C43806fa(C42562ct ctVar) {
        this.f110939a = ctVar;
    }

    public final void onEvent(C47351z zVar) {
        if (this.f110939a.f33834b != null) {
            if (this.f110940b == null) {
                this.f110940b = (RecordStatusViewModel) C0214z.m440a(this.f110939a.mo87882I()).mo359a(RecordStatusViewModel.class);
            }
            if (this.f110941c == null) {
                this.f110941c = ((ShortVideoContextViewModel) C0214z.m440a(this.f110939a.mo87882I()).mo359a(ShortVideoContextViewModel.class)).f107134a;
            }
            ApiCenter a = ApiCenter.m7844a(this.f110939a.mo87882I());
            C49860a aVar = (C49860a) a.mo7339a(C49860a.class);
            C49659a aVar2 = (C49659a) a.mo7339a(C49659a.class);
            aVar.mo97694d();
            aVar.mo97696d(true);
            if (this.f110939a.mo87883J().f107134a.mo86372m() > 0) {
                aVar.mo97695d(0);
                aVar.mo97698e(0);
                aVar2.mo97559b(8);
            } else if (!this.f110941c.f107122o) {
                C49577b bVar = (C49577b) a.mo7339a(C49577b.class);
                bVar.mo97483a(true);
                bVar.mo97484b(true);
                this.f110940b.mo92167l().setValue(Boolean.valueOf(false));
            }
            this.f110939a.mo86793h().mo89397a(true);
        }
    }
}
