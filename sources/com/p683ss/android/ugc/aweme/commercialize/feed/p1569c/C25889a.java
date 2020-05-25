package com.p683ss.android.ugc.aweme.commercialize.feed.p1569c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1714a.C29979a;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.p1311a.C22325a;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1317c.C22400a;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22434b;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.c.a */
public abstract class C25889a implements OnClickListener {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f68418a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C25889a.class), "feedAdDownloadBtn", "getFeedAdDownloadBtn()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C25889a.class), "feedAdReplay", "getFeedAdReplay()Landroid/widget/TextView;"))};

    /* renamed from: b */
    public final Context f68419b;

    /* renamed from: c */
    public final Aweme f68420c;

    /* renamed from: d */
    public final C25908e f68421d;

    /* renamed from: e */
    public final C22325a f68422e;

    /* renamed from: f */
    public final String f68423f;

    /* renamed from: g */
    public final LinearLayout f68424g;

    /* renamed from: h */
    private final C52668f f68425h;

    /* renamed from: i */
    private final C52668f f68426i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.c.a$a */
    static final class C25890a extends C52712l implements C52670a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C25889a f68427a;

        C25890a(C25889a aVar) {
            this.f68427a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextView) this.f68427a.f68424g.findViewById(R.id.aec);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.c.a$b */
    static final class C25891b extends C52712l implements C52670a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C25889a f68428a;

        C25891b(C25889a aVar) {
            this.f68428a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextView) this.f68428a.f68424g.findViewById(R.id.aee);
        }
    }

    /* renamed from: a */
    public final TextView mo53212a() {
        return (TextView) this.f68425h.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo53213a(View view);

    /* renamed from: b */
    public final TextView mo53214b() {
        return (TextView) this.f68426i.getValue();
    }

    /* renamed from: c */
    public abstract void mo53215c();

    public void onClick(View view) {
        boolean z;
        boolean z2;
        Integer num;
        ClickInstrumentation.onClick(view);
        if (this.f68421d == null || !this.f68421d.mo53248d()) {
            z = true;
        } else {
            z = false;
        }
        if (this.f68420c.isAd() || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            C9432q.m18672a(this.f68419b, (int) R.string.dm);
        }
        if (!z2) {
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == R.id.aec) {
                C22434b.m55466c(this.f68423f);
                this.f68422e.mo46461a(3);
                this.f68422e.mo46462a(C22434b.m55465c(this.f68420c), true);
            } else if ((num != null && num.intValue() == R.id.aed) || (num != null && num.intValue() == R.id.aee)) {
                if (this.f68421d.mo53244a()) {
                    C22434b.m55466c(this.f68423f);
                    C29979a.m70150b(this.f68419b, this.f68420c);
                    this.f68422e.mo46460a();
                }
                this.f68422e.mo46462a(true, false);
            } else {
                mo53213a(view);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo53211a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "rootView");
        View findViewById = viewGroup.findViewById(R.id.e9a);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.fl_mask_content)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        frameLayout.removeAllViews();
        View inflate = LayoutInflater.from(this.f68419b).inflate(i, frameLayout, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(mCon…yout, frameLayout, false)");
        frameLayout.addView(inflate);
        this.f68424g.setOnClickListener(this);
        return inflate;
    }

    public C25889a(LinearLayout linearLayout, C22400a aVar) {
        C52711k.m112240b(linearLayout, "feedAdLayout");
        C52711k.m112240b(aVar, "adMaskParams");
        this.f68424g = linearLayout;
        this.f68419b = aVar.mo46641b();
        this.f68420c = aVar.mo46642c();
        this.f68421d = aVar.mo46643d();
        C22325a aVar2 = aVar.f60334d;
        if (aVar2 == null) {
            C52711k.m112237a("adMaskCallback");
        }
        this.f68422e = aVar2;
        this.f68423f = aVar.mo46644e();
        this.f68425h = C52732g.m112285a(new C25890a(this));
        this.f68426i = C52732g.m112285a(new C25891b(this));
    }
}
