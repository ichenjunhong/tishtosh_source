package com.p683ss.android.ugc.aweme.p2345t;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31619a;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31631c;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31634f;
import com.p683ss.android.ugc.aweme.filter.view.internal.main.C31699j;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.C49744a;
import com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.C49757f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.t.c */
public final class C46771c {

    /* renamed from: com.ss.android.ugc.aweme.t.c$a */
    public static final class C46772a extends C31699j {

        /* renamed from: a */
        final /* synthetic */ C49757f f118131a;

        /* renamed from: a */
        public final C31619a mo64590a(ViewGroup viewGroup) {
            C52711k.m112240b(viewGroup, C42311c.f106865i);
            Context context = viewGroup.getContext();
            C52711k.m112236a((Object) context, "content.context");
            return new C49744a(context, mo64595i());
        }

        public C46772a(C49757f fVar, ViewGroup viewGroup, C0184k kVar, C31499l lVar, C31634f fVar2, C31631c cVar, boolean z) {
            this.f118131a = fVar;
            super(viewGroup, kVar, lVar, cVar, fVar2, true, false, false, false, false, 960, null);
        }
    }
}
