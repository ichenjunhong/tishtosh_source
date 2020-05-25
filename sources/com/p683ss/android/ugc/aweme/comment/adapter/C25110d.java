package com.p683ss.android.ugc.aweme.comment.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.p030v4.content.C0726c;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.comment.p1518c.C25147a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c.C39486a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.d */
public final class C25110d {

    /* renamed from: a */
    public static final C25110d f66532a = new C25110d();

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.d$a */
    static final class C25111a implements C39486a {

        /* renamed from: a */
        final /* synthetic */ View f66533a;

        /* renamed from: b */
        final /* synthetic */ Activity f66534b;

        /* renamed from: c */
        final /* synthetic */ C39481c f66535c;

        /* renamed from: d */
        final /* synthetic */ C25147a f66536d;

        /* renamed from: e */
        final /* synthetic */ C29366a f66537e;

        C25111a(View view, Activity activity, C39481c cVar, C25147a aVar, C29366a aVar2) {
            this.f66533a = view;
            this.f66534b = activity;
            this.f66535c = cVar;
            this.f66536d = aVar;
            this.f66537e = aVar2;
        }

        /* renamed from: a */
        public final void mo51196a() {
            this.f66535c.dismiss();
            C25147a aVar = this.f66536d;
            if (aVar != null) {
                aVar.mo51257a(this.f66537e);
            }
        }
    }

    private C25110d() {
    }

    /* renamed from: a */
    public static final void m61017a(View view, C29366a aVar, C25147a aVar2) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(aVar, "emoji");
        Context context = view.getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            C39481c cVar = new C39481c(activity);
            cVar.f100999n = 0;
            cVar.f101001p = 200;
            cVar.f101002q = 200;
            cVar.setOutsideTouchable(true);
            cVar.mo80496b(C0726c.m2098c(view.getContext(), R.color.gt));
            cVar.setFocusable(true);
            int b = (int) C9432q.m18687b((Context) activity, 4.0f);
            cVar.f100997l = -b;
            cVar.f100992g = b;
            cVar.f100988c.setTextSize(2, 13.0f);
            cVar.f100991f = false;
            cVar.setBackgroundDrawable(new BitmapDrawable());
            cVar.mo80486a((int) R.string.ax6);
            C25111a aVar3 = new C25111a(view, activity, cVar, aVar2, aVar);
            cVar.f101004s = aVar3;
            cVar.mo80489a(view, 48);
        }
    }
}
