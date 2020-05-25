package com.p683ss.android.ugc.aweme.tools.beauty.p2349a;

import android.animation.ObjectAnimator;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.aweme.tools.beauty.C46870d;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46829a;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.b */
public final class C46817b extends C1352v {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f118283a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46817b.class), "mAnimator", "getMAnimator()Landroid/animation/ObjectAnimator;"))};

    /* renamed from: g */
    public static final C46818a f118284g = new C46818a(null);

    /* renamed from: b */
    final AVDmtImageTextView f118285b = ((AVDmtImageTextView) this.itemView.findViewById(R.id.eds));

    /* renamed from: c */
    public final ImageView f118286c = ((ImageView) this.itemView.findViewById(R.id.ee0));

    /* renamed from: d */
    int f118287d = -1;

    /* renamed from: e */
    public C52682m<? super ComposerBeauty, ? super Integer, C52860x> f118288e;

    /* renamed from: f */
    public final View f118289f;

    /* renamed from: h */
    private final C52668f f118290h = C52732g.m112285a(new C46820c(this));

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.b$a */
    public static final class C46818a {
        private C46818a() {
        }

        public /* synthetic */ C46818a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.b$b */
    static final class C46819b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46817b f118291a;

        /* renamed from: b */
        final /* synthetic */ UrlModel f118292b;

        /* renamed from: c */
        final /* synthetic */ ComposerBeauty f118293c;

        /* renamed from: d */
        final /* synthetic */ int f118294d;

        /* renamed from: e */
        final /* synthetic */ boolean f118295e;

        /* renamed from: f */
        final /* synthetic */ boolean f118296f;

        C46819b(C46817b bVar, UrlModel urlModel, ComposerBeauty composerBeauty, int i, boolean z, boolean z2) {
            this.f118291a = bVar;
            this.f118292b = urlModel;
            this.f118293c = composerBeauty;
            this.f118294d = i;
            this.f118295e = z;
            this.f118296f = z2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f118293c.getEnable()) {
                C10691a.m21542b(this.f118291a.f118289f.getContext(), (int) R.string.dii).mo19066a();
                return;
            }
            if (!C46829a.f118310b.mo94074a(this.f118293c)) {
                C46829a aVar = C46829a.f118310b;
                C46870d dVar = new C46870d(this.f118293c, null, 2, null);
                C52711k.m112240b(dVar, "beautyDownload");
                aVar.mo94072a().mo59069b(dVar, null);
            }
            C52682m<? super ComposerBeauty, ? super Integer, C52860x> mVar = this.f118291a.f118288e;
            if (mVar != null) {
                mVar.invoke(this.f118293c, Integer.valueOf(this.f118291a.getLayoutPosition()));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.b$c */
    static final class C46820c extends C52712l implements C52670a<ObjectAnimator> {

        /* renamed from: a */
        final /* synthetic */ C46817b f118297a;

        C46820c(C46817b bVar) {
            this.f118297a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f118297a.f118286c, "rotation", new float[]{0.0f, 360.0f});
            C52711k.m112236a((Object) ofFloat, "animator");
            ofFloat.setDuration(800);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.setInterpolator(new LinearInterpolator());
            return ofFloat;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ObjectAnimator mo94059a() {
        return (ObjectAnimator) this.f118290h.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo94060b() {
        ObjectAnimator a = mo94059a();
        if (!a.isRunning()) {
            a = null;
        }
        if (a != null) {
            a.cancel();
        }
        ImageView imageView = this.f118286c;
        C52711k.m112236a((Object) imageView, "ivDownload");
        imageView.setRotation(0.0f);
        this.f118286c.setImageResource(R.drawable.ec);
    }

    public C46817b(View view) {
        C52711k.m112240b(view, "view");
        super(view);
        this.f118289f = view;
    }
}
