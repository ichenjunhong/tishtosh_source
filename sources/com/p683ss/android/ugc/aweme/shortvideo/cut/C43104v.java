package com.p683ss.android.ugc.aweme.shortvideo.cut;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C43099t.C43102c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.v */
final /* synthetic */ class C43104v implements OnClickListener {

    /* renamed from: a */
    private final C43102c f108819a;

    /* renamed from: b */
    private final C43102c f108820b;

    C43104v(C43102c cVar, C43102c cVar2) {
        this.f108819a = cVar;
        this.f108820b = cVar2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C43102c cVar = this.f108819a;
        C43102c cVar2 = this.f108820b;
        if (C43099t.this.f108809d) {
            int adapterPosition = cVar2.getAdapterPosition();
            if (adapterPosition <= C43099t.this.f108806a.size() && adapterPosition >= 0) {
                C43099t.this.f108808c.mo87356a(view, adapterPosition, ((C43170w) C43099t.this.f108806a.get(adapterPosition)).f109123b.mo86950e());
            }
        }
    }
}
