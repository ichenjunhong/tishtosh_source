package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.o */
public final class C37989o extends C1352v {

    /* renamed from: b */
    public static final C37991a f96711b = new C37991a(null);

    /* renamed from: a */
    public final DmtTextView f96712a;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.o$a */
    public static final class C37991a {
        private C37991a() {
        }

        public /* synthetic */ C37991a(C52707g gVar) {
            this();
        }
    }

    public C37989o(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        view.addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
            public final void onViewDetachedFromWindow(View view) {
            }

            public final void onViewAttachedToWindow(View view) {
                C26890h.m65011a("show_history", C23089d.m56640a().mo47829a("enter_from", "homepage_follow").f61491a);
            }
        });
        View findViewById = view.findViewById(R.id.dii);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv_watch_history)");
        this.f96712a = (DmtTextView) findViewById;
    }
}
