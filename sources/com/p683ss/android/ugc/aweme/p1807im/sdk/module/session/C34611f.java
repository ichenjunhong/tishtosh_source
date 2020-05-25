package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1865b.C34647a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.BadgeTextView;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35454a;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.f */
public final class C34611f extends C1352v {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89170a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34611f.class), "mAvatarView", "getMAvatarView()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34611f.class), "mTvTitle", "getMTvTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34611f.class), "mTvSubTitle", "getMTvSubTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34611f.class), "mTvTimeStamp", "getMTvTimeStamp()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34611f.class), "mIvArrow", "getMIvArrow()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34611f.class), "mCountView", "getMCountView()Lcom/ss/android/ugc/aweme/im/sdk/widget/BadgeTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34611f.class), "mLlContent", "getMLlContent()Landroid/widget/LinearLayout;"))};

    /* renamed from: b */
    public final C52668f f89171b;

    /* renamed from: c */
    public final C52668f f89172c;

    /* renamed from: d */
    public C35454a f89173d;

    /* renamed from: e */
    public int f89174e;

    /* renamed from: f */
    private final C52668f f89175f;

    /* renamed from: g */
    private final C52668f f89176g;

    /* renamed from: h */
    private final C52668f f89177h;

    /* renamed from: i */
    private final C52668f f89178i;

    /* renamed from: j */
    private final C52668f f89179j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.f$a */
    static final class C34615a extends C52712l implements C52670a<AvatarImageView> {

        /* renamed from: a */
        final /* synthetic */ View f89186a;

        C34615a(View view) {
            this.f89186a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (AvatarImageView) this.f89186a.findViewById(R.id.hy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.f$b */
    static final class C34616b extends C52712l implements C52670a<BadgeTextView> {

        /* renamed from: a */
        final /* synthetic */ View f89187a;

        C34616b(View view) {
            this.f89187a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (BadgeTextView) this.f89187a.findViewById(R.id.car);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.f$c */
    static final class C34617c extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ View f89188a;

        C34617c(View view) {
            this.f89188a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f89188a.findViewById(R.id.b3p);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.f$d */
    static final class C34618d extends C52712l implements C52670a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ View f89189a;

        C34618d(View view) {
            this.f89189a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (LinearLayout) this.f89189a.findViewById(R.id.bf1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.f$e */
    static final class C34619e extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f89190a;

        C34619e(View view) {
            this.f89190a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f89190a.findViewById(R.id.f4o);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.f$f */
    static final class C34620f extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f89191a;

        C34620f(View view) {
            this.f89191a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f89191a.findViewById(R.id.f2r);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.f$g */
    static final class C34621g extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f89192a;

        C34621g(View view) {
            this.f89192a = view;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f89192a.findViewById(R.id.dhb);
        }
    }

    /* renamed from: a */
    public final AvatarImageView mo72657a() {
        return (AvatarImageView) this.f89175f.getValue();
    }

    /* renamed from: b */
    public final DmtTextView mo72658b() {
        return (DmtTextView) this.f89176g.getValue();
    }

    /* renamed from: c */
    public final ImageView mo72659c() {
        return (ImageView) this.f89177h.getValue();
    }

    /* renamed from: d */
    public final BadgeTextView mo72660d() {
        return (BadgeTextView) this.f89178i.getValue();
    }

    /* renamed from: e */
    public final LinearLayout mo72661e() {
        return (LinearLayout) this.f89179j.getValue();
    }

    public C34611f(View view, final C34647a aVar) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f89175f = C52732g.m112285a(new C34615a(view));
        this.f89171b = C52732g.m112285a(new C34621g(view));
        this.f89176g = C52732g.m112285a(new C34619e(view));
        this.f89172c = C52732g.m112285a(new C34620f(view));
        this.f89177h = C52732g.m112285a(new C34617c(view));
        this.f89178i = C52732g.m112285a(new C34616b(view));
        this.f89179j = C52732g.m112285a(new C34618d(view));
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C34611f f89180a;

            {
                this.f89180a = r1;
            }

            public final void onClick(View view) {
                int i;
                int i2;
                ClickInstrumentation.onClick(view);
                C52711k.m112240b(view, "v");
                C35454a aVar = this.f89180a.f89173d;
                if (aVar != null) {
                    i = aVar.mo73750g();
                } else {
                    i = -1;
                }
                String str = "click";
                C35454a aVar2 = this.f89180a.f89173d;
                if (aVar2 != null) {
                    i2 = aVar2.f91119j;
                } else {
                    i2 = 0;
                }
                C34611f.m78562a(i, str, i2);
                C35454a aVar3 = this.f89180a.f89173d;
                if (aVar3 != null) {
                    C34647a aVar4 = aVar;
                    if (aVar4 != null) {
                        Context context = view.getContext();
                        C52711k.m112236a((Object) context, "v.context");
                        aVar4.mo72674a(context, this.f89180a.f89174e, aVar3, 1);
                    }
                }
            }
        });
        view.setOnLongClickListener(new OnLongClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C34611f f89182a;

            {
                this.f89182a = r1;
            }

            public final boolean onLongClick(View view) {
                C52711k.m112240b(view, "v");
                C35454a aVar = this.f89182a.f89173d;
                if (aVar != null) {
                    C34647a aVar2 = aVar;
                    if (aVar2 != null) {
                        Context context = view.getContext();
                        C52711k.m112236a((Object) context, "v.context");
                        aVar2.mo72674a(context, this.f89182a.f89174e, aVar, 0);
                    }
                }
                return true;
            }
        });
        mo72657a().setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C34611f f89184a;

            {
                this.f89184a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C52711k.m112240b(view, "v");
                C35454a aVar = this.f89184a.f89173d;
                if (aVar != null) {
                    C34647a aVar2 = aVar;
                    if (aVar2 != null) {
                        Context context = view.getContext();
                        C52711k.m112236a((Object) context, "v.context");
                        aVar2.mo72674a(context, this.f89184a.f89174e, aVar, 2);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m78562a(int i, String str, int i2) {
        String str2;
        if (i != -1) {
            if (i == 12) {
                str2 = "comment&at";
            } else if (i != 64) {
                switch (i) {
                    case 0:
                        str2 = "fans";
                        break;
                    case 1:
                        str2 = "like";
                        break;
                    default:
                        return;
                }
            } else {
                str2 = "interaction";
            }
            C23089d a = C23089d.m56640a().mo47829a("notice_type", "number_dot").mo47829a("account_type", str2).mo47829a("action_type", str).mo47826a("show_cnt", i2);
            C52711k.m112236a((Object) a, "EventMapBuilder.newBuild…ob.SHOW_CNT, unreadCount)");
            C26890h.m65011a("notification_notice", a.f61491a);
        }
    }
}
