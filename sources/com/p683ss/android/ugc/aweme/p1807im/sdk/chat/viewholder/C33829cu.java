package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33358ae;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cu */
public final class C33829cu extends C33805c<BaseContent> {

    /* renamed from: u */
    static final /* synthetic */ C52767h[] f87777u = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33829cu.class), "closeBtn", "getCloseBtn()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C33829cu.class), "warningTips", "getWarningTips()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: v */
    private final C52668f f87778v;

    /* renamed from: w */
    private final C52668f f87779w;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cu$a */
    static final class C33830a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33829cu f87780a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f87781b;

        /* renamed from: c */
        final /* synthetic */ C52727e f87782c;

        C33830a(C33829cu cuVar, ViewGroup viewGroup, C52727e eVar) {
            this.f87780a = cuVar;
            this.f87781b = viewGroup;
            this.f87782c = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ViewGroup viewGroup = this.f87781b;
            C52711k.m112236a((Object) viewGroup, "vg");
            viewGroup.setVisibility(8);
            String str = (String) this.f87782c.element;
            if (str == null) {
                C52711k.m112234a();
            }
            C52711k.m112240b(str, "msgFakeUuid");
            Keva repo = Keva.getRepo(C33358ae.f86504a);
            C52711k.m112236a((Object) repo, "Keva.getRepo(KEVA_KEY)");
            repo.storeBoolean(str, true);
            C35190af.m79534p(this.f87780a.f87707i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cu$b */
    static final class C33831b extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ View f87783a;

        C33831b(View view) {
            this.f87783a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f87783a;
            if (view != null) {
                return (ImageView) view.findViewById(R.id.e4h);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cu$c */
    static final class C33832c extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f87784a;

        C33832c(View view) {
            this.f87784a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f87784a;
            if (view != null) {
                return (DmtTextView) view.findViewById(R.id.f3f);
            }
            return null;
        }
    }

    public C33829cu(View view, int i) {
        super(view, i);
        this.f87778v = C52732g.m112285a(new C33831b(view));
        this.f87779w = C52732g.m112285a(new C33832c(view));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0080, code lost:
        if (((java.lang.System.currentTimeMillis() / 1000) - java.lang.Long.parseLong(r3[1])) < com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImDisplayStrongTipsIntervalSettings.INSTANCE.getImDisPlayStrongTipsInterval()) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0061, code lost:
        if (r4.getBoolean(r3[0], false) != false) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x022f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71870a(com.bytedance.p702im.core.p706c.C11207p r17, com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.String r3 = "content"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            long r3 = r17.getSender()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "uid"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33358ae.f86504a
            com.bytedance.keva.Keva r4 = com.bytedance.keva.Keva.getRepo(r4)
            java.lang.String r5 = "Keva.getRepo(KEVA_KEY)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33358ae.f86505b
            r5.append(r6)
            r5.append(r3)
            java.lang.CharSequence r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79730b()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r5 = 0
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String[] r3 = r4.getStringArray(r3, r6)
            java.lang.String r6 = "keva.getStringArray(PRE_…Util.getUid(), arrayOf())"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
            int r6 = r3.length
            r7 = 1
            if (r6 != 0) goto L_0x0051
            r6 = 1
            goto L_0x0052
        L_0x0051:
            r6 = 0
        L_0x0052:
            r6 = r6 ^ r7
            r8 = 1000(0x3e8, double:4.94E-321)
            r10 = 3
            r11 = 2
            if (r6 == 0) goto L_0x0083
            if (r2 != 0) goto L_0x0065
            r3 = r3[r5]
            boolean r3 = r4.getBoolean(r3, r5)
            if (r3 == 0) goto L_0x0083
        L_0x0063:
            r3 = 1
            goto L_0x0084
        L_0x0065:
            if (r2 == r11) goto L_0x006c
            if (r2 == r10) goto L_0x006c
            r4 = 4
            if (r2 != r4) goto L_0x0083
        L_0x006c:
            r3 = r3[r7]
            long r3 = java.lang.Long.parseLong(r3)
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 / r8
            long r12 = r12 - r3
            com.ss.android.ugc.aweme.im.sdk.abtest.ImDisplayStrongTipsIntervalSettings r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.ImDisplayStrongTipsIntervalSettings.INSTANCE
            long r3 = r3.getImDisPlayStrongTipsInterval()
            int r6 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x0083
            goto L_0x0063
        L_0x0083:
            r3 = r2
        L_0x0084:
            android.view.View r4 = r16.mo71804c()
            r6 = 0
            if (r4 == 0) goto L_0x0090
            android.content.Context r4 = r4.getContext()
            goto L_0x0091
        L_0x0090:
            r4 = r6
        L_0x0091:
            if (r4 == 0) goto L_0x022f
            android.app.Activity r4 = (android.app.Activity) r4
            r12 = 2132019184(0x7f1407f0, float:1.9676696E38)
            android.view.View r4 = r4.findViewById(r12)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r3 != r7) goto L_0x00a1
            return
        L_0x00a1:
            com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent r1 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemContent) r1
            d.f.b.v$e r12 = new d.f.b.v$e
            r12.<init>()
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            r12.element = r13
            if (r2 != 0) goto L_0x0112
            long r1 = r17.getSender()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33358ae.m76518a(r1)
            long r13 = r17.getSender()
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r13 = "uid"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r13)
            java.lang.String r13 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33358ae.f86504a
            com.bytedance.keva.Keva r13 = com.bytedance.keva.Keva.getRepo(r13)
            java.lang.String r14 = "Keva.getRepo(KEVA_KEY)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33358ae.f86505b
            r14.append(r15)
            r14.append(r2)
            java.lang.CharSequence r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79730b()
            r14.append(r2)
            java.lang.String r2 = r14.toString()
            java.lang.String[] r14 = new java.lang.String[r5]
            java.lang.String[] r2 = r13.getStringArray(r2, r14)
            java.lang.String r13 = "keva.getStringArray(PRE_…Util.getUid(), arrayOf())"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r13)
            int r13 = r2.length
            if (r13 != 0) goto L_0x0108
            r13 = 1
            goto L_0x0109
        L_0x0108:
            r13 = 0
        L_0x0109:
            r13 = r13 ^ r7
            if (r13 == 0) goto L_0x010f
            r2 = r2[r5]
            goto L_0x0110
        L_0x010f:
            r2 = r6
        L_0x0110:
            r12.element = r2
        L_0x0112:
            if (r3 != 0) goto L_0x0159
            if (r1 == 0) goto L_0x0122
            T r2 = r12.element
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0159
        L_0x0122:
            long r1 = r17.getSender()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            if (r1 == 0) goto L_0x0158
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33358ae.f86504a
            com.bytedance.keva.Keva r2 = com.bytedance.keva.Keva.getRepo(r2)
            java.lang.String r3 = "Keva.getRepo(KEVA_KEY)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33358ae.f86505b
            r3.append(r4)
            r3.append(r1)
            java.lang.CharSequence r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79730b()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String[] r3 = new java.lang.String[r5]
            r2.storeStringArray(r1, r3)
        L_0x0158:
            return
        L_0x0159:
            android.view.View r2 = r16.mo71804c()
            if (r2 == 0) goto L_0x0162
            r2.setVisibility(r5)
        L_0x0162:
            android.view.View r2 = r16.mo71804c()
            if (r2 == 0) goto L_0x016c
            android.content.Context r6 = r2.getContext()
        L_0x016c:
            if (r6 == 0) goto L_0x0227
            android.app.Activity r6 = (android.app.Activity) r6
            r2 = 2132020962(0x7f140ee2, float:1.9680302E38)
            android.view.View r2 = r6.findViewById(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r4 == 0) goto L_0x0180
            r6 = 8
            r4.setVisibility(r6)
        L_0x0180:
            r2.removeAllViews()
            android.view.View r4 = r16.mo71804c()
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            r13 = -1
            r14 = -2
            r6.<init>(r13, r14)
            android.view.ViewGroup$LayoutParams r6 = (android.view.ViewGroup.LayoutParams) r6
            r2.addView(r4, r6)
            java.lang.String r4 = r0.f87707i
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79535q(r4)
            d.f r4 = r0.f87778v
            java.lang.Object r4 = r4.getValue()
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x01ac
            com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cu$a r6 = new com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cu$a
            r6.<init>(r0, r2, r12)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r4.setOnClickListener(r6)
        L_0x01ac:
            d.f r2 = r0.f87779w
            java.lang.Object r2 = r2.getValue()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r4 = r0.f87707i
            com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33711v.m77219a(r1, r2, r4)
            java.lang.String r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o.m79761a(r1)
            java.lang.String r2 = "GsonUtil.toJsonString(ct)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            if (r3 == 0) goto L_0x01c8
            r2 = 1
            goto L_0x01c9
        L_0x01c8:
            r2 = 0
        L_0x01c9:
            long r3 = r17.getSender()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            T r4 = r12.element
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x01de
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01de:
            java.lang.String r6 = "uid"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r6)
            java.lang.String r6 = "msgFakeUuid"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r6)
            java.lang.String r6 = "contentString"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r6)
            java.lang.String r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33358ae.f86504a
            com.bytedance.keva.Keva r6 = com.bytedance.keva.Keva.getRepo(r6)
            java.lang.String r12 = "Keva.getRepo(KEVA_KEY)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r12)
            if (r2 == 0) goto L_0x0226
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 / r8
            java.lang.String r2 = java.lang.String.valueOf(r12)
            java.lang.String[] r8 = new java.lang.String[r10]
            r8[r5] = r4
            r8[r7] = r2
            r8[r11] = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33358ae.f86505b
            r1.append(r2)
            r1.append(r3)
            java.lang.CharSequence r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79730b()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r6.storeStringArray(r1, r8)
        L_0x0226:
            return
        L_0x0227:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type android.app.Activity"
            r1.<init>(r2)
            throw r1
        L_0x022f:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type android.app.Activity"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33829cu.mo71870a(com.bytedance.im.core.c.p, com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent, int):void");
    }
}
