package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40338do.C40340b;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.dn */
public final class C40334dn extends C1352v {

    /* renamed from: g */
    public static final C40335a f102958g = new C40335a(null);

    /* renamed from: a */
    public final AvatarImageWithVerify f102959a;

    /* renamed from: b */
    public final DmtTextView f102960b;

    /* renamed from: c */
    public final DmtTextView f102961c;

    /* renamed from: d */
    public final TextView f102962d;

    /* renamed from: e */
    public final ImageView f102963e;

    /* renamed from: f */
    public final int f102964f;

    /* renamed from: h */
    private final Context f102965h;

    /* renamed from: i */
    private final View f102966i;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.dn$a */
    public static final class C40335a {
        private C40335a() {
        }

        public /* synthetic */ C40335a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.dn$b */
    public static final class C40336b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendContact f102967a;

        /* renamed from: b */
        final /* synthetic */ C40340b f102968b;

        /* renamed from: c */
        final /* synthetic */ int f102969c;

        public C40336b(RecommendContact recommendContact, C40340b bVar, int i) {
            this.f102967a = recommendContact;
            this.f102968b = bVar;
            this.f102969c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C32616c cVar = C32616c.f84865a;
            Integer type = this.f102967a.getType();
            if (type == null) {
                C52711k.m112234a();
            }
            cVar.setPermissionNextPopUp(type.intValue());
            C40340b bVar = this.f102968b;
            if (bVar != null) {
                bVar.mo82594a(this.f102967a, this.f102969c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.dn$c */
    public static final class C40337c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendContact f102970a;

        /* renamed from: b */
        final /* synthetic */ C40340b f102971b;

        /* renamed from: c */
        final /* synthetic */ int f102972c;

        public C40337c(RecommendContact recommendContact, C40340b bVar, int i) {
            this.f102970a = recommendContact;
            this.f102971b = bVar;
            this.f102972c = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C32616c cVar = C32616c.f84865a;
            Integer type = this.f102970a.getType();
            if (type == null) {
                C52711k.m112234a();
            }
            cVar.showFriendslistPermissionPopUp(type.intValue(), "others_homepage");
            C40340b bVar = this.f102971b;
            if (bVar != null) {
                bVar.mo82594a(this.f102970a, this.f102972c);
            }
        }
    }

    public C40334dn(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f102964f = i;
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        this.f102965h = context;
        View findViewById = view.findViewById(R.id.cfc);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.root)");
        this.f102966i = findViewById;
        View findViewById2 = view.findViewById(R.id.hi);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.avatar)");
        this.f102959a = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = view.findViewById(R.id.dn1);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.user_name)");
        this.f102960b = (DmtTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c_5);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.recommend_reason)");
        this.f102961c = (DmtTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ai0);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.follow)");
        this.f102962d = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.ue);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.close)");
        this.f102963e = (ImageView) findViewById6;
        this.f102963e.setImageResource(R.drawable.cq3);
        LayoutParams layoutParams = this.f102963e.getLayoutParams();
        layoutParams.width = (int) C9432q.m18687b(this.f102965h, -2.0f);
        layoutParams.height = (int) C9432q.m18687b(this.f102965h, -2.0f);
        this.f102963e.setLayoutParams(layoutParams);
        this.f102962d.setText(R.string.h5r);
        this.f102962d.setBackgroundResource(R.drawable.kq);
        this.f102962d.setTextColor(this.f102965h.getResources().getColor(R.color.jf));
        this.f102966i.setBackgroundResource(R.color.a2s);
    }
}
