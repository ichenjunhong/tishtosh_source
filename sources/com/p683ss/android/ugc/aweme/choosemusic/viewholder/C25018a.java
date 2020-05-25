package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24840c;
import com.p683ss.android.ugc.aweme.choosemusic.p1504c.C24841d;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.a */
public final class C25018a extends C1352v {

    /* renamed from: a */
    public DmtTextView f66263a;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.a$a */
    public static final class C25019a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f66264a;

        public C25019a(boolean z) {
            this.f66264a = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f66264a) {
                C24840c.m60407c().mo50738a();
            } else {
                C24841d.m60410c().mo50738a();
            }
        }
    }

    public C25018a(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.d81);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv_clear_all)");
        this.f66263a = (DmtTextView) findViewById;
    }
}
