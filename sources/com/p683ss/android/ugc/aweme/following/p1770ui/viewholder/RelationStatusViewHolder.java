package com.p683ss.android.ugc.aweme.following.p1770ui.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p683ss.android.ugc.aweme.following.p1768a.C32002i;
import com.p683ss.android.ugc.aweme.profile.service.C40010c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder */
public final class RelationStatusViewHolder extends JediSimpleViewHolder<C32002i> {

    /* renamed from: g */
    public static final C32283a f84110g = new C32283a(null);

    /* renamed from: f */
    public final Context f84111f;

    /* renamed from: j */
    private final DmtStatusView f84112j = ((DmtStatusView) this.itemView.findViewById(R.id.csv));

    /* renamed from: k */
    private final C10719a f84113k;

    /* renamed from: l */
    private boolean f84114l;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder$a */
    public static final class C32283a {
        private C32283a() {
        }

        public /* synthetic */ C32283a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder$b */
    static final class C32284b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RelationStatusViewHolder f84115a;

        /* renamed from: b */
        final /* synthetic */ C32002i f84116b;

        C32284b(RelationStatusViewHolder relationStatusViewHolder, C32002i iVar) {
            this.f84115a = relationStatusViewHolder;
            this.f84116b = iVar;
        }

        public final void onClick(View view) {
            int i;
            String str;
            ClickInstrumentation.onClick(view);
            if (this.f84116b.f83558a == 9) {
                i = 13;
            } else {
                i = 14;
            }
            if (this.f84116b.f83558a == 9) {
                str = "following";
            } else {
                str = "fans";
            }
            this.f84115a.f84111f.startActivity(C40010c.f101950a.mo82020a(this.f84115a.f84111f, 0, i, "", str));
        }
    }

    public RelationStatusViewHolder(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bpp, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…           parent, false)");
        super(inflate);
        Context context = viewGroup.getContext();
        C52711k.m112236a((Object) context, "parent.context");
        this.f84111f = context;
        C10719a a = C10719a.m21676a(viewGroup.getContext());
        C52711k.m112236a((Object) a, "DmtStatusView.Builder.cr…ltBuilder(parent.context)");
        this.f84113k = a;
        this.f84114l = true;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo22662a(java.lang.Object r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.following.a.i r5 = (com.p683ss.android.ugc.aweme.following.p1768a.C32002i) r5
            java.lang.String r0 = "item"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            int r0 = r5.f83558a
            r1 = 0
            r2 = 0
            switch(r0) {
                case 7: goto L_0x00a0;
                case 8: goto L_0x00a0;
                case 9: goto L_0x0059;
                case 10: goto L_0x0059;
                case 11: goto L_0x0010;
                case 12: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0170
        L_0x0010:
            android.content.Context r0 = r4.f84111f
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r3 = 2132216465(0x7f170a91, float:2.007683E38)
            android.view.View r0 = r0.inflate(r3, r1, r2)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r1 = r4.f84113k
            r1.mo19231b(r0)
            r1 = 2132023392(0x7f141860, float:1.968523E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "footer.findViewById<DmtTextView>(R.id.title)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            java.lang.String r5 = r5.f83560c
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.setText(r5)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r5 = r4.f84112j
            java.lang.String r0 = "mStatusView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.content.Context r0 = r4.f84111f
            r1 = 1113063424(0x42580000, float:54.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            int r0 = (int) r0
            r5.height = r0
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r4.f84112j
            java.lang.String r1 = "mStatusView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setLayoutParams(r5)
            goto L_0x0170
        L_0x0059:
            android.content.Context r0 = r4.f84111f
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r3 = 2132215640(0x7f170758, float:2.0075156E38)
            android.view.View r0 = r0.inflate(r3, r1, r2)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r1 = r4.f84113k
            r1.mo19231b(r0)
            r1 = 2132017352(0x7f1400c8, float:1.967298E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder$b r1 = new com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder$b
            r1.<init>(r4, r5)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r5 = r4.f84112j
            java.lang.String r0 = "mStatusView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.content.Context r0 = r4.f84111f
            r1 = 1125842944(0x431b0000, float:155.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            int r0 = (int) r0
            r5.height = r0
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r4.f84112j
            java.lang.String r1 = "mStatusView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setLayoutParams(r5)
            goto L_0x0170
        L_0x00a0:
            com.bytedance.ies.dmt.ui.widget.c$a r0 = new com.bytedance.ies.dmt.ui.widget.c$a
            android.content.Context r1 = r4.f84111f
            r0.<init>(r1)
            java.lang.String r1 = r5.f83560c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r3 = 2131954361(0x7f130ab9, float:1.954522E38)
            if (r1 != 0) goto L_0x00c6
            com.bytedance.ies.dmt.ui.widget.c$a r1 = r0.mo19277a(r3)
            r3 = 2132551798(0x7f1c2876, float:2.0756965E38)
            com.bytedance.ies.dmt.ui.widget.c$a r1 = r1.mo19280b(r3)
            java.lang.String r3 = r5.f83560c
            r1.mo19281b(r3)
            goto L_0x012f
        L_0x00c6:
            com.bytedance.ies.dmt.ui.widget.c$a r1 = r0.mo19277a(r3)
            java.lang.Object r3 = r4.mo22689o()
            com.ss.android.ugc.aweme.following.a.i r3 = (com.p683ss.android.ugc.aweme.following.p1768a.C32002i) r3
            int r3 = r3.f83558a
            switch(r3) {
                case 7: goto L_0x00e8;
                case 8: goto L_0x00d6;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            goto L_0x00f6
        L_0x00d6:
            java.lang.Object r3 = r4.mo22689o()
            com.ss.android.ugc.aweme.following.a.i r3 = (com.p683ss.android.ugc.aweme.following.p1768a.C32002i) r3
            boolean r3 = r3.f83559b
            if (r3 == 0) goto L_0x00e4
            r3 = 2132551588(0x7f1c27a4, float:2.075654E38)
            goto L_0x00f9
        L_0x00e4:
            r3 = 2132551605(0x7f1c27b5, float:2.0756574E38)
            goto L_0x00f9
        L_0x00e8:
            java.lang.Object r3 = r4.mo22689o()
            com.ss.android.ugc.aweme.following.a.i r3 = (com.p683ss.android.ugc.aweme.following.p1768a.C32002i) r3
            boolean r3 = r3.f83559b
            if (r3 != 0) goto L_0x00f6
            r3 = 2132551603(0x7f1c27b3, float:2.075657E38)
            goto L_0x00f9
        L_0x00f6:
            r3 = 2132551590(0x7f1c27a6, float:2.0756543E38)
        L_0x00f9:
            com.bytedance.ies.dmt.ui.widget.c$a r1 = r1.mo19280b(r3)
            java.lang.Object r3 = r4.mo22689o()
            com.ss.android.ugc.aweme.following.a.i r3 = (com.p683ss.android.ugc.aweme.following.p1768a.C32002i) r3
            int r3 = r3.f83558a
            switch(r3) {
                case 7: goto L_0x011b;
                case 8: goto L_0x0109;
                default: goto L_0x0108;
            }
        L_0x0108:
            goto L_0x0129
        L_0x0109:
            java.lang.Object r3 = r4.mo22689o()
            com.ss.android.ugc.aweme.following.a.i r3 = (com.p683ss.android.ugc.aweme.following.p1768a.C32002i) r3
            boolean r3 = r3.f83559b
            if (r3 == 0) goto L_0x0117
            r3 = 2132551589(0x7f1c27a5, float:2.0756541E38)
            goto L_0x012c
        L_0x0117:
            r3 = 2132551606(0x7f1c27b6, float:2.0756576E38)
            goto L_0x012c
        L_0x011b:
            java.lang.Object r3 = r4.mo22689o()
            com.ss.android.ugc.aweme.following.a.i r3 = (com.p683ss.android.ugc.aweme.following.p1768a.C32002i) r3
            boolean r3 = r3.f83559b
            if (r3 != 0) goto L_0x0129
            r3 = 2132551604(0x7f1c27b4, float:2.0756572E38)
            goto L_0x012c
        L_0x0129:
            r3 = 2132551591(0x7f1c27a7, float:2.0756545E38)
        L_0x012c:
            r1.mo19282c(r3)
        L_0x012f:
            boolean r1 = r4.f84114l
            if (r1 == 0) goto L_0x013c
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r1 = r4.f84113k
            com.bytedance.ies.dmt.ui.widget.c r0 = r0.f28711a
            r1.mo19229a(r0)
            r4.f84114l = r2
        L_0x013c:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r4.f84112j
            java.lang.String r1 = "mStatusView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            java.lang.String r5 = r5.f83560c
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x015b
            android.content.Context r5 = r4.f84111f
            r1 = 1134559232(0x43a00000, float:320.0)
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r5, r1)
            int r5 = (int) r5
            goto L_0x0164
        L_0x015b:
            android.content.Context r5 = r4.f84111f
            r1 = 1137180672(0x43c80000, float:400.0)
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r5, r1)
            int r5 = (int) r5
        L_0x0164:
            r0.height = r5
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r5 = r4.f84112j
            java.lang.String r1 = "mStatusView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r1)
            r5.setLayoutParams(r0)
        L_0x0170:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r5 = r4.f84112j
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = r4.f84113k
            r5.setBuilder(r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r5 = r4.f84112j
            r5.mo19209d()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r5 = r4.f84112j
            r5.mo19213g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.viewholder.RelationStatusViewHolder.mo22662a(java.lang.Object):void");
    }
}
