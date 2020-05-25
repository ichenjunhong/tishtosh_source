package com.p683ss.android.ugc.aweme.notification.newstyle.p2021a;

import android.os.Build.VERSION;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.b */
public final class C38251b extends C1352v {

    /* renamed from: a */
    final ImageView f97357a;

    /* renamed from: b */
    final TextView f97358b;

    /* renamed from: c */
    final ImageView f97359c;

    /* renamed from: d */
    final ImageView f97360d;

    /* renamed from: e */
    private final View f97361e;

    public C38251b(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.e21);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.cl_notification_root)");
        this.f97361e = findViewById;
        View findViewById2 = view.findViewById(R.id.ebb);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.ic_notification_group)");
        this.f97357a = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f3p);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.tv_notification_group)");
        this.f97358b = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ebc);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.…ic_notification_selector)");
        this.f97359c = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.efc);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.….iv_notification_red_dot)");
        this.f97360d = (ImageView) findViewById5;
        if (VERSION.SDK_INT >= 23) {
            this.f97361e.setForeground(this.f97361e.getResources().getDrawable(R.drawable.clf));
        } else {
            C38446k.m85764a(this.f97361e);
        }
    }
}
