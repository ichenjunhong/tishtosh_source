package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.discover.helper.C28201i;
import com.p683ss.android.ugc.aweme.discover.model.BarrageBean;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.f */
public final class C27890f extends C1322a<C1352v> {

    /* renamed from: a */
    public boolean f73260a = true;

    /* renamed from: b */
    public List<BarrageBean> f73261b = new ArrayList();

    /* renamed from: c */
    public C27900g f73262c;

    /* renamed from: d */
    public Aweme f73263d;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.f$a */
    public static final class C27891a extends C1352v {

        /* renamed from: g */
        public static final C27892a f73264g = new C27892a(null);

        /* renamed from: a */
        public View f73265a;

        /* renamed from: b */
        public final View f73266b;

        /* renamed from: c */
        public final TextView f73267c;

        /* renamed from: d */
        public final TextView f73268d;

        /* renamed from: e */
        public final TextView f73269e;

        /* renamed from: f */
        public boolean f73270f;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.f$a$a */
        public static final class C27892a {
            private C27892a() {
            }

            public /* synthetic */ C27892a(C52707g gVar) {
                this();
            }
        }

        public C27891a(View view) {
            int i;
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.bw6);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.parent)");
            this.f73265a = findViewById;
            View findViewById2 = view.findViewById(R.id.ek9);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.ll_parent)");
            this.f73266b = findViewById2;
            View findViewById3 = view.findViewById(R.id.bpp);
            C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.name)");
            this.f73267c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.aqa);
            C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.icon)");
            this.f73268d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.f18);
            C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.tv)");
            this.f73269e = (TextView) findViewById5;
            LayoutParams layoutParams = this.f73266b.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (C28201i.m67096a()) {
                    i = 9;
                } else {
                    i = 11;
                }
                layoutParams2.addRule(i, -1);
                this.f73266b.setLayoutParams(layoutParams2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.f$b */
    public static final class C27893b extends C1352v {

        /* renamed from: c */
        public static final C27894a f73271c = new C27894a(null);

        /* renamed from: a */
        public View f73272a;

        /* renamed from: b */
        public TextView f73273b;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.f$b$a */
        public static final class C27894a {
            private C27894a() {
            }

            public /* synthetic */ C27894a(C52707g gVar) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.f$b$b */
        static final class C27895b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C27893b f73274a;

            C27895b(C27893b bVar) {
                this.f73274a = bVar;
            }

            public final void run() {
                if (this.f73274a.f73273b.getLineCount() == 1) {
                    this.f73274a.f73273b.setBackgroundResource(R.drawable.cnw);
                } else {
                    this.f73274a.f73273b.setBackgroundResource(R.drawable.cnv);
                }
            }
        }

        public C27893b(View view) {
            int i;
            C52711k.m112240b(view, "itemView");
            super(view);
            this.f73272a = view;
            View findViewById = view.findViewById(R.id.f18);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv)");
            this.f73273b = (TextView) findViewById;
            LayoutParams layoutParams = this.f73273b.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (C28201i.m67096a()) {
                    i = 9;
                } else {
                    i = 11;
                }
                layoutParams2.addRule(i, -1);
                this.f73273b.setLayoutParams(layoutParams2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.f$c */
    public static final class C27896c extends C1352v {

        /* renamed from: b */
        public static final C27897a f73275b = new C27897a(null);

        /* renamed from: a */
        public View f73276a;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.f$c$a */
        public static final class C27897a {
            private C27897a() {
            }

            public /* synthetic */ C27897a(C52707g gVar) {
                this();
            }
        }

        public C27896c(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.by8);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.placeholder)");
            this.f73276a = findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.f$d */
    static final class C27898d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C27890f f73277a;

        /* renamed from: b */
        final /* synthetic */ BarrageBean f73278b;

        C27898d(C27890f fVar, BarrageBean barrageBean) {
            this.f73277a = fVar;
            this.f73278b = barrageBean;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C27900g gVar = this.f73277a.f73262c;
            if (gVar != null) {
                gVar.mo56309a(this.f73278b.cid);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.f$e */
    static final class C27899e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C27890f f73279a;

        C27899e(C27890f fVar) {
            this.f73279a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C27900g gVar = this.f73279a.f73262c;
            if (gVar != null) {
                gVar.mo56308a();
            }
        }
    }

    public final int getItemCount() {
        return this.f73261b.size();
    }

    /* renamed from: a */
    public final void mo56304a(List<BarrageBean> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f73261b = list;
    }

    public final int getItemViewType(int i) {
        return ((BarrageBean) this.f73261b.get(i)).type;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i == -2) {
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(viewGroup, "view");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bid, viewGroup, false);
            C52711k.m112236a((Object) inflate, "inflate");
            return new C27891a(inflate);
        } else if (i != 1) {
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(viewGroup, "view");
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bif, viewGroup, false);
            C52711k.m112236a((Object) inflate2, "inflate");
            return new C27896c(inflate2);
        } else {
            C52711k.m112240b(viewGroup, "parent");
            boolean z = this.f73260a;
            C52711k.m112240b(viewGroup, "view");
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bie, viewGroup, false);
            C52711k.m112236a((Object) inflate3, "inflate");
            return new C27893b(inflate3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(android.support.p043v7.widget.RecyclerView.C1352v r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "viewholder"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            java.util.List<com.ss.android.ugc.aweme.discover.model.BarrageBean> r3 = r0.f73261b
            int r3 = r3.size()
            if (r2 < r3) goto L_0x0014
            return
        L_0x0014:
            java.util.List<com.ss.android.ugc.aweme.discover.model.BarrageBean> r3 = r0.f73261b
            java.lang.Object r2 = r3.get(r2)
            com.ss.android.ugc.aweme.discover.model.BarrageBean r2 = (com.p683ss.android.ugc.aweme.discover.model.BarrageBean) r2
            boolean r3 = r1 instanceof com.p683ss.android.ugc.aweme.discover.adapter.C27890f.C27893b
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x01f1
            com.ss.android.ugc.aweme.discover.adapter.f$b r1 = (com.p683ss.android.ugc.aweme.discover.adapter.C27890f.C27893b) r1
            java.lang.String r3 = "bean"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            android.widget.TextView r3 = r1.f73273b
            java.lang.String r7 = r2.text
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r3.setText(r7)
            android.widget.TextView r3 = r1.f73273b
            boolean r7 = com.p683ss.android.ugc.aweme.discover.helper.C28188a.f74011b
            if (r7 == 0) goto L_0x003c
        L_0x0038:
            r16 = 0
            goto L_0x016d
        L_0x003c:
            com.p683ss.android.ugc.aweme.discover.helper.C28188a.f74011b = r5
            java.lang.CharSequence r7 = r3.getText()
            android.content.Context r9 = r3.getContext()
            java.lang.String r10 = r7.toString()
            if (r9 != 0) goto L_0x0050
            android.app.Activity r9 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
        L_0x0050:
            if (r9 == 0) goto L_0x0080
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto L_0x0059
            goto L_0x0080
        L_0x0059:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.regex.Pattern r12 = com.p683ss.android.ugc.aweme.discover.helper.C28188a.f74010a
            java.util.regex.Matcher r10 = r12.matcher(r10)
        L_0x0064:
            boolean r12 = r10.find()
            if (r12 == 0) goto L_0x0085
            java.lang.String r12 = r10.group()
            com.ss.android.ugc.aweme.emoji.h.b.a r13 = com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29406a.m69329b(r9)
            android.app.Activity r14 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
            android.graphics.drawable.Drawable r13 = r13.mo59400a(r14, r12)
            if (r13 == 0) goto L_0x0064
            r11.add(r12)
            goto L_0x0064
        L_0x0080:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x0085:
            int r9 = r11.size()
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            if (r10 != 0) goto L_0x0168
            if (r9 > 0) goto L_0x0093
            goto L_0x0168
        L_0x0093:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r7)
            int r12 = r7.length()
            java.lang.Class<com.ss.android.ugc.aweme.emoji.views.a> r13 = com.p683ss.android.ugc.aweme.emoji.views.C29489a.class
            java.lang.Object[] r12 = r10.getSpans(r6, r12, r13)
            com.ss.android.ugc.aweme.emoji.views.a[] r12 = (com.p683ss.android.ugc.aweme.emoji.views.C29489a[]) r12
            if (r12 == 0) goto L_0x00da
            int r13 = r12.length
            if (r13 <= 0) goto L_0x00da
            int r13 = r12.length
            if (r13 == r9) goto L_0x00ae
            r13 = 1
            goto L_0x00af
        L_0x00ae:
            r13 = 0
        L_0x00af:
            int r14 = r12.length
            r15 = r13
            r13 = 0
        L_0x00b2:
            if (r13 >= r14) goto L_0x00d4
            r8 = r12[r13]
            r10.removeSpan(r8)
            if (r13 >= r9) goto L_0x00d0
            if (r15 != 0) goto L_0x00d0
            java.lang.CharSequence r8 = r8.mo59592a()
            java.lang.Object r17 = r11.get(r13)
            r5 = r17
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.equals(r8, r5)
            if (r5 != 0) goto L_0x00d0
            r15 = 1
        L_0x00d0:
            int r13 = r13 + 1
            r5 = 1
            goto L_0x00b2
        L_0x00d4:
            if (r15 != 0) goto L_0x00da
            com.p683ss.android.ugc.aweme.discover.helper.C28188a.f74011b = r6
            goto L_0x0038
        L_0x00da:
            boolean r5 = r3 instanceof android.widget.EditText
            if (r5 == 0) goto L_0x00e3
            int r8 = r3.getSelectionStart()
            goto L_0x00e4
        L_0x00e3:
            r8 = 0
        L_0x00e4:
            android.content.Context r9 = r3.getContext()
            com.ss.android.ugc.aweme.emoji.h.b.a r9 = com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29406a.m69329b(r9)
            java.util.regex.Pattern r11 = com.p683ss.android.ugc.aweme.discover.helper.C28188a.f74010a
            java.util.regex.Matcher r11 = r11.matcher(r7)
        L_0x00f2:
            boolean r12 = r11.find()
            if (r12 == 0) goto L_0x0151
            int r12 = r11.start()
            int r13 = r11.end()
            java.lang.String r14 = r11.group()
            android.content.Context r15 = r3.getContext()
            android.graphics.drawable.Drawable r15 = r9.mo59400a(r15, r14)
            if (r15 == 0) goto L_0x014b
            int r4 = r3.getLineHeight()
            int r6 = r15.getIntrinsicWidth()
            float r6 = (float) r6
            r16 = 0
            float r6 = r6 + r16
            r18 = r9
            int r9 = r15.getIntrinsicHeight()
            float r9 = (float) r9
            float r6 = r6 / r9
            float r9 = (float) r4
            float r9 = r9 * r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r6
            int r6 = (int) r9
            r9 = 0
            r15.setBounds(r9, r9, r6, r4)
            com.ss.android.ugc.aweme.emoji.views.a r4 = new com.ss.android.ugc.aweme.emoji.views.a
            int r6 = r13 - r12
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.<init>(r15, r6, r14)
            r6 = 33
            r10.setSpan(r4, r12, r13, r6)
            if (r8 <= r12) goto L_0x014d
            if (r8 >= r13) goto L_0x014d
            if (r5 == 0) goto L_0x014d
            r4 = r3
            android.widget.EditText r4 = (android.widget.EditText) r4
            r4.setSelection(r13)
            goto L_0x014d
        L_0x014b:
            r18 = r9
        L_0x014d:
            r9 = r18
            r6 = 0
            goto L_0x00f2
        L_0x0151:
            if (r5 == 0) goto L_0x0162
            android.text.Editable r3 = r3.getEditableText()
            if (r3 == 0) goto L_0x0162
            int r4 = r7.length()
            r5 = 0
            r3.replace(r5, r4, r10)
            goto L_0x0163
        L_0x0162:
            r5 = 0
        L_0x0163:
            com.p683ss.android.ugc.aweme.discover.helper.C28188a.f74011b = r5
            r16 = r10
            goto L_0x016d
        L_0x0168:
            r5 = 0
            com.p683ss.android.ugc.aweme.discover.helper.C28188a.f74011b = r5
            goto L_0x0038
        L_0x016d:
            if (r16 == 0) goto L_0x01ad
            android.view.View r3 = r1.itemView
            java.lang.String r4 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            android.content.Context r3 = r3.getContext()
            r4 = 1127481344(0x43340000, float:180.0)
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r4)
            r4 = r16
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            android.widget.TextView r5 = r1.f73273b
            android.text.TextPaint r5 = r5.getPaint()
            float r5 = android.text.Layout.getDesiredWidth(r4, r5)
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r6
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x01a8
            android.widget.TextView r5 = r1.f73273b
            android.widget.TextView r6 = r1.f73273b
            android.text.TextPaint r6 = r6.getPaint()
            android.text.TextUtils$TruncateAt r7 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r3 = android.text.TextUtils.ellipsize(r4, r6, r3, r7)
            r5.setText(r3)
            goto L_0x01ad
        L_0x01a8:
            android.widget.TextView r3 = r1.f73273b
            r3.setText(r4)
        L_0x01ad:
            android.widget.TextView r3 = r1.f73273b
            com.ss.android.ugc.aweme.discover.adapter.f$b$b r4 = new com.ss.android.ugc.aweme.discover.adapter.f$b$b
            r4.<init>(r1)
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.post(r4)
            android.view.View r1 = r1.f73272a
            com.ss.android.ugc.aweme.discover.adapter.f$d r3 = new com.ss.android.ugc.aweme.discover.adapter.f$d
            r3.<init>(r0, r2)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r1.setOnClickListener(r3)
            com.ss.android.ugc.aweme.discover.model.BarrageData r1 = com.p683ss.android.ugc.aweme.discover.model.BarrageData.INSTANCE
            java.util.Set r1 = r1.getShow()
            java.lang.String r3 = r2.cid
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L_0x0331
            com.ss.android.ugc.aweme.discover.model.BarrageData r1 = com.p683ss.android.ugc.aweme.discover.model.BarrageData.INSTANCE
            java.util.Set r1 = r1.getShow()
            java.lang.String r2 = r2.cid
            r1.add(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f73263d
            if (r1 == 0) goto L_0x01f0
            org.greenrobot.eventbus.c r2 = org.greenrobot.eventbus.C53755c.m114319a()
            com.ss.android.ugc.aweme.discover.d.b r3 = new com.ss.android.ugc.aweme.discover.d.b
            r3.<init>(r1)
            r2.mo112960d(r3)
            goto L_0x0331
        L_0x01f0:
            return
        L_0x01f1:
            boolean r3 = r1 instanceof com.p683ss.android.ugc.aweme.discover.adapter.C27890f.C27891a
            if (r3 == 0) goto L_0x0331
            java.util.List<com.ss.android.ugc.aweme.discover.model.BarrageBean> r3 = r0.f73261b
            int r3 = r3.size()
            r4 = 1
            if (r3 != r4) goto L_0x0204
            r3 = r1
            com.ss.android.ugc.aweme.discover.adapter.f$a r3 = (com.p683ss.android.ugc.aweme.discover.adapter.C27890f.C27891a) r3
            r3.f73270f = r4
            goto L_0x020a
        L_0x0204:
            r3 = r1
            com.ss.android.ugc.aweme.discover.adapter.f$a r3 = (com.p683ss.android.ugc.aweme.discover.adapter.C27890f.C27891a) r3
            r4 = 0
            r3.f73270f = r4
        L_0x020a:
            r3 = r1
            com.ss.android.ugc.aweme.discover.adapter.f$a r3 = (com.p683ss.android.ugc.aweme.discover.adapter.C27890f.C27891a) r3
            java.lang.String r4 = "bean"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            android.view.View r4 = r3.f73265a
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            if (r4 == 0) goto L_0x0329
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            boolean r5 = r3.f73270f
            if (r5 == 0) goto L_0x0235
            android.view.View r5 = r3.itemView
            java.lang.String r6 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            android.content.Context r5 = r5.getContext()
            r6 = 1092616192(0x41200000, float:10.0)
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r5, r6)
            int r5 = (int) r5
            r4.bottomMargin = r5
            goto L_0x0249
        L_0x0235:
            android.view.View r5 = r3.itemView
            java.lang.String r6 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            android.content.Context r5 = r5.getContext()
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r5, r6)
            int r5 = (int) r5
            r4.bottomMargin = r5
        L_0x0249:
            android.widget.TextView r4 = r3.f73267c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "@"
            r5.<init>(r6)
            java.lang.String r6 = r2.name
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
            boolean r4 = com.p683ss.android.ugc.aweme.discover.helper.C28201i.m67096a()
            if (r4 == 0) goto L_0x0313
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r2.text
            r4.append(r5)
            java.lang.String r5 = " · "
            r4.append(r5)
            android.view.View r5 = r3.itemView
            java.lang.String r6 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            android.content.Context r5 = r5.getContext()
            long r6 = r2.time
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            java.lang.String r5 = com.p683ss.android.ugc.aweme.utils.C47903fw.m103625b(r5, r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.text.SpannableString r5 = new android.text.SpannableString
            r6 = r4
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.<init>(r6)
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            java.lang.String r7 = "#80FFFFFF"
            int r7 = android.graphics.Color.parseColor(r7)
            r6.<init>(r7)
            android.text.style.AbsoluteSizeSpan r7 = new android.text.style.AbsoluteSizeSpan
            android.view.View r8 = r3.itemView
            java.lang.String r9 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            android.content.Context r8 = r8.getContext()
            boolean r9 = com.p683ss.android.ugc.aweme.discover.helper.C28201i.m67098b()
            if (r9 == 0) goto L_0x02ba
            r9 = 1096810496(0x41600000, float:14.0)
            goto L_0x02bc
        L_0x02ba:
            r9 = 1097859072(0x41700000, float:15.0)
        L_0x02bc:
            float r8 = com.bytedance.common.utility.C9432q.m18687b(r8, r9)
            int r8 = (int) r8
            r7.<init>(r8)
            java.lang.String r8 = r2.text
            int r8 = r8.length()
            r9 = 34
            if (r8 <= 0) goto L_0x02da
            java.lang.String r8 = r2.text
            int r8 = r8.length()
            r10 = 1
            int r8 = r8 - r10
            r10 = 0
            r5.setSpan(r7, r10, r8, r9)
        L_0x02da:
            android.text.style.AbsoluteSizeSpan r7 = new android.text.style.AbsoluteSizeSpan
            android.view.View r8 = r3.itemView
            java.lang.String r10 = "itemView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r10)
            android.content.Context r8 = r8.getContext()
            r10 = 1095761920(0x41500000, float:13.0)
            float r8 = com.bytedance.common.utility.C9432q.m18687b(r8, r10)
            int r8 = (int) r8
            r7.<init>(r8)
            java.lang.String r8 = r2.text
            int r8 = r8.length()
            int r10 = r4.length()
            r5.setSpan(r6, r8, r10, r9)
            java.lang.String r2 = r2.text
            int r2 = r2.length()
            int r4 = r4.length()
            r5.setSpan(r7, r2, r4, r9)
            android.widget.TextView r2 = r3.f73269e
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r2.setText(r5)
            goto L_0x031c
        L_0x0313:
            android.widget.TextView r3 = r3.f73269e
            java.lang.String r2 = r2.text
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.setText(r2)
        L_0x031c:
            android.view.View r1 = r1.itemView
            com.ss.android.ugc.aweme.discover.adapter.f$e r2 = new com.ss.android.ugc.aweme.discover.adapter.f$e
            r2.<init>(r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            goto L_0x0331
        L_0x0329:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r1.<init>(r2)
            throw r1
        L_0x0331:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.adapter.C27890f.onBindViewHolder(android.support.v7.widget.RecyclerView$v, int):void");
    }
}
