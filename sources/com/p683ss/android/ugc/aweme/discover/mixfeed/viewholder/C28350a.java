package com.p683ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.discover.adapter.C27849b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.a */
public final class C28350a extends C27849b {

    /* renamed from: d */
    public static final C28351a f74439d = new C28351a(null);

    /* renamed from: c */
    public DmtTextView f74440c;

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.a$a */
    public static final class C28351a {
        private C28351a() {
        }

        public /* synthetic */ C28351a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d */
    public final View mo56209d() {
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        return view;
    }

    public C28350a(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f74440c = (DmtTextView) view.findViewById(R.id.cjh);
        View findViewById = view.findViewById(R.id.cjm);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = view.findViewById(R.id.b3r);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
    }
}
