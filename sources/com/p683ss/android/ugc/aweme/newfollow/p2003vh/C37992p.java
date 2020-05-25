package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.newfollow.p1996c.C37854a;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.p */
public final class C37992p extends C1352v {

    /* renamed from: a */
    public C37854a f96713a;

    /* renamed from: b */
    public final Context f96714b;

    /* renamed from: c */
    private final DmtStatusView f96715c;

    public C37992p(View view, Context context, int i) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(context, "context");
        super(view);
        this.f96714b = context;
        View findViewById = view.findViewById(R.id.csk);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.status)");
        this.f96715c = (DmtStatusView) findViewById;
        this.f96715c.setBuilder(C10719a.m21676a(this.f96714b).mo19232b(C48190g.m104428a(this.f96714b, new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C37992p f96716a;

            {
                this.f96716a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C37854a aVar = this.f96716a.f96713a;
                if (aVar != null) {
                    aVar.mo77297a();
                }
            }
        })));
        switch (i) {
            case 65531:
                LayoutParams layoutParams = this.f96715c.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.height = (int) C9432q.m18687b(this.f96714b, 100.0f);
                    this.f96715c.setLayoutParams(layoutParams2);
                    this.f96715c.mo19212f();
                    break;
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            case 65533:
                this.f96715c.mo19204a(false);
                return;
            case 65534:
                this.f96715c.mo19212f();
                return;
        }
    }
}
