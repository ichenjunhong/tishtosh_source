package com.p683ss.android.ugc.aweme.notification.newstyle.p2029f;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.ap */
public final class C38367ap extends C38383h {

    /* renamed from: d */
    public DmtTextView f97630d;

    /* renamed from: e */
    public ImageView f97631e;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.ap$a */
    public interface C38368a {
        /* renamed from: k */
        void mo78260k();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f.ap$b */
    public static final class C38369b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38367ap f97632a;

        /* renamed from: b */
        final /* synthetic */ C38368a f97633b;

        public C38369b(C38367ap apVar, C38368a aVar) {
            this.f97632a = apVar;
            this.f97633b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f97633b.mo78260k();
        }
    }

    public C38367ap(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.f52);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv_title_name)");
        this.f97630d = (DmtTextView) findViewById;
        this.f97631e = (ImageView) view.findViewById(R.id.ebs);
    }
}
