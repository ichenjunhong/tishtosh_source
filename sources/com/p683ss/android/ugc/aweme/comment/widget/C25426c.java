package com.p683ss.android.ugc.aweme.comment.widget;

import android.view.View;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.widget.c */
public final class C25426c {

    /* renamed from: a */
    public C25427a f67257a;

    /* renamed from: b */
    private final View f67258b;

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.c$a */
    public interface C25427a {
        /* renamed from: a */
        void mo51892a(int i);
    }

    public C25426c(View view) {
        C52711k.m112240b(view, "watchedView");
        this.f67258b = view;
    }

    /* renamed from: a */
    public final void mo52025a(int i) {
        this.f67258b.setVisibility(i);
        if (this.f67257a != null) {
            C25427a aVar = this.f67257a;
            if (aVar == null) {
                C52711k.m112234a();
            }
            aVar.mo51892a(i);
        }
    }
}
