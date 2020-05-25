package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1865b.C34647a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34579c;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.e */
public final class C34605e extends C1352v {

    /* renamed from: i */
    public static final C34608a f89153i = new C34608a(null);

    /* renamed from: a */
    public final Context f89154a;

    /* renamed from: b */
    public final AvatarImageView f89155b = ((AvatarImageView) this.itemView.findViewById(R.id.hy));

    /* renamed from: c */
    public final DmtTextView f89156c = ((DmtTextView) this.itemView.findViewById(R.id.dhb));

    /* renamed from: d */
    public final DmtTextView f89157d = ((DmtTextView) this.itemView.findViewById(R.id.f4o));

    /* renamed from: e */
    public final ImageView f89158e = ((ImageView) this.itemView.findViewById(R.id.f8f));

    /* renamed from: f */
    public final ImageView f89159f = ((ImageView) this.itemView.findViewById(R.id.b3p));

    /* renamed from: g */
    public C34579c f89160g;

    /* renamed from: h */
    public int f89161h;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.e$a */
    static final class C34608a {
        private C34608a() {
        }

        public /* synthetic */ C34608a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.e$b */
    public static final class C34609b extends C52712l implements C52682m<List<IMContact>, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34605e f89166a;

        /* renamed from: b */
        final /* synthetic */ C34579c f89167b;

        public C34609b(C34605e eVar, C34579c cVar) {
            this.f89166a = eVar;
            this.f89167b = cVar;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0043, code lost:
            if (com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79729a(r4.getUid()) == false) goto L_0x0055;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                java.util.List r7 = (java.util.List) r7
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                r8.booleanValue()
                java.lang.String r8 = "list"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r8)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Collection r8 = (java.util.Collection) r8
                java.util.Iterator r7 = r7.iterator()
            L_0x0019:
                boolean r0 = r7.hasNext()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x005b
                java.lang.Object r0 = r7.next()
                r3 = r0
                com.ss.android.ugc.aweme.im.service.model.IMContact r3 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r3
                boolean r4 = r3 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser
                if (r4 == 0) goto L_0x0045
                r4 = r3
                com.ss.android.ugc.aweme.im.service.model.IMUser r4 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser) r4
                java.lang.String r5 = r4.getUid()
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 != 0) goto L_0x0045
                java.lang.String r4 = r4.getUid()
                boolean r4 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79729a(r4)
                if (r4 == 0) goto L_0x0055
            L_0x0045:
                boolean r4 = r3 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation
                if (r4 == 0) goto L_0x0054
                com.ss.android.ugc.aweme.im.service.model.IMConversation r3 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation) r3
                int r3 = r3.getConversationType()
                int r4 = com.bytedance.p702im.core.p703a.C11169d.C11170a.f30115a
                if (r3 != r4) goto L_0x0054
                goto L_0x0055
            L_0x0054:
                r1 = 0
            L_0x0055:
                if (r1 == 0) goto L_0x0019
                r8.add(r0)
                goto L_0x0019
            L_0x005b:
                java.util.List r8 = (java.util.List) r8
                r7 = r8
                java.util.Collection r7 = (java.util.Collection) r7
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x0079
                com.ss.android.ugc.aweme.im.sdk.module.session.e r7 = r6.f89166a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r7.f89157d
                java.lang.String r8 = "mSubTitle"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
                com.ss.android.ugc.aweme.im.sdk.module.session.a.c r8 = r6.f89167b
                java.lang.String r8 = r8.f91117h
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                r7.setText(r8)
                goto L_0x00d9
            L_0x0079:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.Object r8 = r8.get(r2)
                com.ss.android.ugc.aweme.im.service.model.IMContact r8 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r8
                java.lang.String r8 = r8.getDisplayName()
                java.lang.String r0 = "user.displayName"
                p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
                java.lang.String r0 = "$this$ellipsize"
                p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
                r0 = 3
                r3 = 0
                int r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35210aw.m79596b(r8, 0, r8.length())
                r3 = 8
                if (r0 <= r3) goto L_0x00b1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35210aw.m79595a(r8, r2, r3)
                r0.append(r8)
                java.lang.String r8 = "..."
                r0.append(r8)
                java.lang.String r8 = r0.toString()
            L_0x00b1:
                r7.append(r8)
                com.ss.android.ugc.aweme.im.sdk.module.session.e r8 = r6.f89166a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f89157d
                java.lang.String r0 = "mSubTitle"
                p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
                com.ss.android.ugc.aweme.im.sdk.module.session.e r0 = r6.f89166a
                android.content.Context r0 = r0.f89154a
                android.content.res.Resources r0 = r0.getResources()
                r3 = 2132542728(0x7f1c0508, float:2.073857E38)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r7 = r7.toString()
                r1[r2] = r7
                java.lang.String r7 = r0.getString(r3, r1)
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r8.setText(r7)
            L_0x00d9:
                d.x r7 = p2628d.C52860x.f131107a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.C34605e.C34609b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.e$c */
    public static final class C34610c extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34605e f89168a;

        /* renamed from: b */
        final /* synthetic */ C34579c f89169b;

        public C34610c(C34605e eVar, C34579c cVar) {
            this.f89168a = eVar;
            this.f89169b = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((Throwable) obj, "it");
            DmtTextView dmtTextView = this.f89168a.f89157d;
            C52711k.m112236a((Object) dmtTextView, "mSubTitle");
            dmtTextView.setText(this.f89169b.f91117h);
            return C52860x.f131107a;
        }
    }

    public C34605e(ViewGroup viewGroup, final C34647a aVar) {
        C52711k.m112240b(viewGroup, "parent");
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bfk, viewGroup, false));
        Context context = viewGroup.getContext();
        C52711k.m112236a((Object) context, "parent.context");
        this.f89154a = context;
        this.itemView.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C34605e f89162a;

            {
                this.f89162a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C34579c cVar = this.f89162a.f89160g;
                if (cVar != null) {
                    C34647a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo72674a(this.f89162a.f89154a, this.f89162a.f89161h, cVar, 1);
                    }
                }
            }
        });
        this.f89155b.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C34605e f89164a;

            {
                this.f89164a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C34579c cVar = this.f89164a.f89160g;
                if (cVar != null) {
                    C34647a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo72674a(this.f89164a.f89154a, this.f89164a.f89161h, cVar, 2);
                    }
                }
            }
        });
    }
}
