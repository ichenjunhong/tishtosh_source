package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.app.Activity;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.utils.C32782b;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i */
public final class C40434i extends C1352v {

    /* renamed from: a */
    public final Context f103222a;

    /* renamed from: b */
    final AvatarImageWithVerify f103223b;

    /* renamed from: c */
    final DmtTextView f103224c;

    /* renamed from: d */
    final DmtTextView f103225d;

    /* renamed from: e */
    final TextView f103226e;

    /* renamed from: f */
    final ImageView f103227f;

    /* renamed from: g */
    public C52682m<? super RecommendContact, ? super Integer, C52860x> f103228g;

    /* renamed from: h */
    public final int f103229h;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i$a */
    static final class C40435a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40434i f103230a;

        /* renamed from: b */
        final /* synthetic */ RecommendContact f103231b;

        /* renamed from: c */
        final /* synthetic */ int f103232c;

        C40435a(C40434i iVar, RecommendContact recommendContact, int i) {
            this.f103230a = iVar;
            this.f103231b = recommendContact;
            this.f103232c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52682m<? super RecommendContact, ? super Integer, C52860x> mVar = this.f103230a.f103228g;
            if (mVar != null) {
                mVar.invoke(this.f103231b, Integer.valueOf(this.f103232c));
            }
            this.f103230a.mo82737a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i$b */
    static final class C40436b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40434i f103233a;

        /* renamed from: b */
        final /* synthetic */ RecommendContact f103234b;

        /* renamed from: c */
        final /* synthetic */ int f103235c;

        C40436b(C40434i iVar, RecommendContact recommendContact, int i) {
            this.f103233a = iVar;
            this.f103234b = recommendContact;
            this.f103235c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Context context = this.f103233a.f103222a;
            if (context != null) {
                C32782b.m75659a((Activity) context, (C52671b<? super Boolean, C52860x>) new C52671b<Boolean, C52860x>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C40436b f103236a;

                    {
                        this.f103236a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        if (((Boolean) obj).booleanValue()) {
                            C52682m<? super RecommendContact, ? super Integer, C52860x> mVar = this.f103236a.f103233a.f103228g;
                            if (mVar != null) {
                                mVar.invoke(this.f103236a.f103234b, Integer.valueOf(this.f103236a.f103235c));
                            }
                        }
                        return C52860x.f131107a;
                    }
                });
                C32782b.m75660a("click", this.f103233a.mo82737a());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: a */
    public final String mo82737a() {
        String str = "";
        switch (this.f103229h) {
            case 0:
                return "others_homepage";
            case 1:
                return "homepage_follow";
            case 2:
                return "homepage_friends";
            default:
                return str;
        }
    }

    public C40434i(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f103229h = i;
        this.f103222a = view.getContext();
        View findViewById = view.findViewById(R.id.hi);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.avatar)");
        this.f103223b = (AvatarImageWithVerify) findViewById;
        View findViewById2 = view.findViewById(R.id.dn1);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.user_name)");
        this.f103224c = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.c_5);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.recommend_reason)");
        this.f103225d = (DmtTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ai0);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.follow)");
        this.f103226e = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ue);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.close)");
        this.f103227f = (ImageView) findViewById5;
    }
}
