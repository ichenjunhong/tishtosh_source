package com.p683ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12208t;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.pendant.r */
public final class C38648r extends C38604f {
    /* renamed from: c */
    public final void mo78501c() {
    }

    /* renamed from: e */
    public final void mo78504e() {
    }

    /* renamed from: a */
    public final void mo78535a(C12208t tVar) {
        C52711k.m112240b(tVar, "builder");
        tVar.mo23119a(true).mo23113a(Config.ARGB_8888);
    }

    public C38648r(Context context, View view, SmartImageView smartImageView, SmartImageView smartImageView2, View view2, C38609g gVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(view, C42311c.f106865i);
        C52711k.m112240b(smartImageView, "bigImageView");
        C52711k.m112240b(smartImageView2, "smallImageView");
        C52711k.m112240b(view2, "closeBtn");
        C52711k.m112240b(gVar, "configure");
        super(context, view, smartImageView, smartImageView2, view2, gVar);
    }
}
