package com.p683ss.android.ugc.aweme.playlist.viewholder;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12200n;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.p769c.C12168c;
import com.bytedance.lighten.p766a.p769c.C12175j;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.playlist.p2057a.C38923d;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.utils.C47935p;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListCoverViewHolder */
public abstract class BiColPlayListCoverViewHolder<T> extends JediSimpleViewHolder<T> implements OnClickListener, C38923d {

    /* renamed from: k */
    static final /* synthetic */ C52767h[] f99166k = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColPlayListCoverViewHolder.class), "mIvCover", "getMIvCover()Lcom/bytedance/lighten/loader/SmartImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColPlayListCoverViewHolder.class), "mTvTitle", "getMTvTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColPlayListCoverViewHolder.class), "mTvTime", "getMTvTime()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColPlayListCoverViewHolder.class), "mIvMask", "getMIvMask()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColPlayListCoverViewHolder.class), "mCoverMask", "getMCoverMask()Landroid/widget/FrameLayout;"))};

    /* renamed from: o */
    public static final C38924a f99167o = new C38924a(null);

    /* renamed from: f */
    private final C52668f f99168f = C52732g.m112285a(new C38927d(this));

    /* renamed from: g */
    private final C52668f f99169g = C52732g.m112285a(new C38930g(this));

    /* renamed from: j */
    private final C52668f f99170j = C52732g.m112285a(new C38929f(this));

    /* renamed from: l */
    public Aweme f99171l;

    /* renamed from: m */
    public boolean f99172m;

    /* renamed from: n */
    public boolean f99173n;

    /* renamed from: p */
    private final C52668f f99174p = C52732g.m112285a(new C38928e(this));

    /* renamed from: q */
    private final C52668f f99175q = C52732g.m112285a(new C38926c(this));

    /* renamed from: r */
    private final int f99176r;

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListCoverViewHolder$a */
    public static final class C38924a {
        private C38924a() {
        }

        public /* synthetic */ C38924a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListCoverViewHolder$b */
    public static final class C38925b extends C12168c {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListCoverViewHolder f99177a;

        C38925b(BiColPlayListCoverViewHolder biColPlayListCoverViewHolder) {
            this.f99177a = biColPlayListCoverViewHolder;
        }

        /* renamed from: a */
        public final void mo23095a(Uri uri, View view, Throwable th) {
            this.f99177a.mo78992w().setImageResource(R.drawable.cu6);
        }

        /* renamed from: a */
        public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
            this.f99177a.mo78992w().setImageResource(R.drawable.cu6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListCoverViewHolder$c */
    static final class C38926c extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListCoverViewHolder f99178a;

        C38926c(BiColPlayListCoverViewHolder biColPlayListCoverViewHolder) {
            this.f99178a = biColPlayListCoverViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f99178a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (FrameLayout) view.findViewById(R.id.f6n);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListCoverViewHolder$d */
    static final class C38927d extends C52712l implements C52670a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListCoverViewHolder f99179a;

        C38927d(BiColPlayListCoverViewHolder biColPlayListCoverViewHolder) {
            this.f99179a = biColPlayListCoverViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f99179a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (SmartImageView) view.findViewById(R.id.azj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListCoverViewHolder$e */
    static final class C38928e extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListCoverViewHolder f99180a;

        C38928e(BiColPlayListCoverViewHolder biColPlayListCoverViewHolder) {
            this.f99180a = biColPlayListCoverViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f99180a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (ImageView) view.findViewById(R.id.b2a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListCoverViewHolder$f */
    static final class C38929f extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListCoverViewHolder f99181a;

        C38929f(BiColPlayListCoverViewHolder biColPlayListCoverViewHolder) {
            this.f99181a = biColPlayListCoverViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f99181a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (DmtTextView) view.findViewById(R.id.dh7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListCoverViewHolder$g */
    static final class C38930g extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListCoverViewHolder f99182a;

        C38930g(BiColPlayListCoverViewHolder biColPlayListCoverViewHolder) {
            this.f99182a = biColPlayListCoverViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f99182a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.dhb);
            dmtTextView.setFontType(C10751d.f28903b);
            return dmtTextView;
        }
    }

    /* renamed from: x */
    private final SmartImageView m86722x() {
        return (SmartImageView) this.f99168f.getValue();
    }

    /* renamed from: a */
    public abstract void mo50639a(DmtTextView dmtTextView);

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }

    /* renamed from: p */
    public final void mo58451p() {
    }

    /* renamed from: q */
    public final void mo58452q() {
    }

    /* renamed from: r */
    public final void mo58453r() {
    }

    /* renamed from: t */
    public void mo58381t() {
    }

    /* renamed from: u */
    public final DmtTextView mo58382u() {
        return (DmtTextView) this.f99169g.getValue();
    }

    /* renamed from: v */
    public final DmtTextView mo78991v() {
        return (DmtTextView) this.f99170j.getValue();
    }

    /* renamed from: w */
    public final ImageView mo78992w() {
        return (ImageView) this.f99174p.getValue();
    }

    /* renamed from: i */
    public final void mo22673i() {
        super.mo22673i();
        this.f99173n = false;
    }

    /* renamed from: g */
    public final void mo22671g() {
        super.mo22671g();
        this.itemView.setOnClickListener(this);
    }

    /* renamed from: h */
    public final void mo22672h() {
        super.mo22672h();
        this.f99173n = true;
        mo58381t();
    }

    /* renamed from: j */
    public final void mo22674j() {
        this.f99172m = false;
        this.f99173n = false;
        mo78992w().setImageResource(R.drawable.cu7);
        SmartImageView x = m86722x();
        C52711k.m112236a((Object) x, "mIvCover");
        x.getLayoutParams().height = this.f99176r;
        super.mo22674j();
    }

    /* renamed from: s */
    public void mo58380s() {
        Video video;
        UrlModel urlModel;
        SmartImageView x = m86722x();
        C52711k.m112236a((Object) x, "mIvCover");
        x.getLayoutParams().height = this.f99176r;
        SmartImageView x2 = m86722x();
        C52711k.m112236a((Object) x2, "mIvCover");
        x2.setVisibility(0);
        Aweme aweme = this.f99171l;
        String str = null;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        if (video != null) {
            Aweme aweme2 = this.f99171l;
            if (aweme2 != null) {
                Video video2 = aweme2.getVideo();
                if (video2 != null) {
                    urlModel = video2.getOriginCover();
                    C12203q.m24645a((Object) C23608p.m57874a(urlModel)).mo23125b(C47788ct.m103417a(201)).mo23119a(true).mo23118a("DoublePlayListCover").mo23116a((C12197k) m86722x()).mo23122a((C12175j) new C38925b(this));
                }
            }
            urlModel = null;
            C12203q.m24645a((Object) C23608p.m57874a(urlModel)).mo23125b(C47788ct.m103417a(201)).mo23119a(true).mo23118a("DoublePlayListCover").mo23116a((C12197k) m86722x()).mo23122a((C12175j) new C38925b(this));
        }
        mo78992w().setImageResource(R.drawable.cu7);
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        if (C47918gj.m103682a(view.getContext())) {
            DmtTextView u = mo58382u();
            C52711k.m112236a((Object) u, "mTvTitle");
            u.setGravity(5);
        }
        DmtTextView u2 = mo58382u();
        C52711k.m112236a((Object) u2, "mTvTitle");
        Aweme aweme3 = this.f99171l;
        if (aweme3 != null) {
            str = aweme3.getDesc();
        }
        u2.setText(str);
        FrameLayout frameLayout = (FrameLayout) this.f99175q.getValue();
        C52711k.m112236a((Object) frameLayout, "mCoverMask");
        View view2 = frameLayout;
        Aweme aweme4 = this.f99171l;
        C52711k.m112240b(view2, "coverMask");
        if (C47935p.m103712e(aweme4)) {
            view2.setVisibility(0);
        } else {
            view2.setVisibility(8);
        }
        DmtTextView u3 = mo58382u();
        C52711k.m112236a((Object) u3, "mTvTitle");
        mo50639a(u3);
    }

    /* renamed from: a */
    public void mo22662a(T t) {
        this.f99172m = true;
        mo58380s();
    }

    /* renamed from: a */
    public final void mo58449a(boolean z, boolean z2) {
        if (!z) {
            mo58381t();
        }
    }

    public BiColPlayListCoverViewHolder(View view, int i) {
        C52711k.m112240b(view, "view");
        super(view);
        this.f99176r = i;
    }
}
