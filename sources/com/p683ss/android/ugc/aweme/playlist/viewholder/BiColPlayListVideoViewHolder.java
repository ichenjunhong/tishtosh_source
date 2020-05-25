package com.p683ss.android.ugc.aweme.playlist.viewholder;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
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
import com.p683ss.android.ugc.aweme.feed.p1718d.C30178a;
import com.p683ss.android.ugc.aweme.newfollow.util.C37942h;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.playlist.p2057a.C38923d;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.utils.C47935p;
import com.p683ss.android.ugc.aweme.video.C48009d;
import com.p683ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.p683ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
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

/* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder */
public abstract class BiColPlayListVideoViewHolder<T> extends JediSimpleViewHolder<T> implements OnClickListener, C38923d {

    /* renamed from: m */
    static final /* synthetic */ C52767h[] f99183m = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColPlayListVideoViewHolder.class), "mIvCover", "getMIvCover()Lcom/bytedance/lighten/loader/SmartImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColPlayListVideoViewHolder.class), "mTvTitle", "getMTvTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColPlayListVideoViewHolder.class), "mTvTime", "getMTvTime()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColPlayListVideoViewHolder.class), "mSurfaceView", "getMSurfaceView()Lcom/ss/android/ugc/playerkit/videoview/KeepSurfaceTextureView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColPlayListVideoViewHolder.class), "mIvMask", "getMIvMask()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColPlayListVideoViewHolder.class), "mFrameLayout", "getMFrameLayout()Landroid/widget/FrameLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColPlayListVideoViewHolder.class), "mBgGray", "getMBgGray()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColPlayListVideoViewHolder.class), "mCoverMask", "getMCoverMask()Landroid/widget/FrameLayout;"))};

    /* renamed from: u */
    public static final C38931a f99184u = new C38931a(null);

    /* renamed from: A */
    private C38940j f99185A = new C38940j(this);

    /* renamed from: B */
    private C38941k f99186B = new C38941k(this);

    /* renamed from: C */
    private final int f99187C;

    /* renamed from: f */
    private final C52668f f99188f = C52732g.m112285a(new C38938h(this));

    /* renamed from: g */
    private final C52668f f99189g = C52732g.m112285a(new C38944n(this));

    /* renamed from: j */
    private final C52668f f99190j = C52732g.m112285a(new C38943m(this));

    /* renamed from: k */
    private final C52668f f99191k = C52732g.m112285a(new C38942l(this));

    /* renamed from: l */
    private final C52668f f99192l = C52732g.m112285a(new C38939i(this));

    /* renamed from: n */
    public Aweme f99193n;

    /* renamed from: o */
    public boolean f99194o;

    /* renamed from: p */
    public long f99195p = -1;

    /* renamed from: q */
    public boolean f99196q;

    /* renamed from: r */
    public boolean f99197r;

    /* renamed from: s */
    public float f99198s;

    /* renamed from: t */
    public C38932b f99199t;

    /* renamed from: v */
    private final C52668f f99200v = C52732g.m112285a(new C38937g(this));

    /* renamed from: w */
    private final C52668f f99201w = C52732g.m112285a(new C38935e(this));

    /* renamed from: x */
    private final C52668f f99202x = C52732g.m112285a(new C38936f(this));

    /* renamed from: y */
    private VideoViewComponent f99203y;

    /* renamed from: z */
    private final C30178a f99204z = new C30178a();

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder$a */
    public static final class C38931a {
        private C38931a() {
        }

        public /* synthetic */ C38931a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder$b */
    public interface C38932b {
        /* renamed from: a */
        void mo50641a(int i);

        /* renamed from: a */
        void mo50642a(long j, int i);

        /* renamed from: b */
        void mo50644b(int i);

        /* renamed from: c */
        void mo50645c(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder$c */
    public static final class C38933c extends C12168c {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListVideoViewHolder f99205a;

        C38933c(BiColPlayListVideoViewHolder biColPlayListVideoViewHolder) {
            this.f99205a = biColPlayListVideoViewHolder;
        }

        /* renamed from: a */
        public final void mo23095a(Uri uri, View view, Throwable th) {
            this.f99205a.mo78998y().setImageResource(R.drawable.cu6);
        }

        /* renamed from: a */
        public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
            this.f99205a.mo78998y().setImageResource(R.drawable.cu6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder$d */
    static final class C38934d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListVideoViewHolder f99206a;

        /* renamed from: b */
        final /* synthetic */ float f99207b;

        /* renamed from: c */
        final /* synthetic */ float f99208c;

        C38934d(BiColPlayListVideoViewHolder biColPlayListVideoViewHolder, float f, float f2) {
            this.f99206a = biColPlayListVideoViewHolder;
            this.f99207b = f;
            this.f99208c = f2;
        }

        public final void run() {
            KeepSurfaceTextureView x = this.f99206a.mo78997x();
            C52711k.m112236a((Object) x, "mSurfaceView");
            int width = x.getWidth();
            KeepSurfaceTextureView x2 = this.f99206a.mo78997x();
            C52711k.m112236a((Object) x2, "mSurfaceView");
            C37942h.m84841a(width, x2.getHeight(), this.f99206a.mo78997x(), this.f99207b / this.f99208c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder$e */
    static final class C38935e extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListVideoViewHolder f99209a;

        C38935e(BiColPlayListVideoViewHolder biColPlayListVideoViewHolder) {
            this.f99209a = biColPlayListVideoViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f99209a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return view.findViewById(R.id.k_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder$f */
    static final class C38936f extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListVideoViewHolder f99210a;

        C38936f(BiColPlayListVideoViewHolder biColPlayListVideoViewHolder) {
            this.f99210a = biColPlayListVideoViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f99210a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (FrameLayout) view.findViewById(R.id.f6n);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder$g */
    static final class C38937g extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListVideoViewHolder f99211a;

        C38937g(BiColPlayListVideoViewHolder biColPlayListVideoViewHolder) {
            this.f99211a = biColPlayListVideoViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f99211a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (FrameLayout) view.findViewById(R.id.agt);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder$h */
    static final class C38938h extends C52712l implements C52670a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListVideoViewHolder f99212a;

        C38938h(BiColPlayListVideoViewHolder biColPlayListVideoViewHolder) {
            this.f99212a = biColPlayListVideoViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f99212a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (SmartImageView) view.findViewById(R.id.azj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder$i */
    static final class C38939i extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListVideoViewHolder f99213a;

        C38939i(BiColPlayListVideoViewHolder biColPlayListVideoViewHolder) {
            this.f99213a = biColPlayListVideoViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f99213a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (ImageView) view.findViewById(R.id.b2a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder$j */
    public static final class C38940j extends C48009d {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListVideoViewHolder f99214a;

        C38940j(BiColPlayListVideoViewHolder biColPlayListVideoViewHolder) {
            this.f99214a = biColPlayListVideoViewHolder;
        }

        /* renamed from: a */
        public final void mo53523a(float f) {
            super.mo53523a(f);
            this.f99214a.f99198s = f;
        }

        /* renamed from: a */
        public final void mo53524a(C50112d dVar) {
            super.mo53524a(dVar);
            this.f99214a.mo78993A();
        }

        /* renamed from: d */
        public final void mo53534d(String str) {
            super.mo53534d(str);
            C38932b bVar = this.f99214a.f99199t;
            if (bVar != null) {
                bVar.mo50644b(this.f99214a.f31643i);
            }
        }

        /* renamed from: a */
        public final void mo53526a(C50118g gVar) {
            super.mo53526a(gVar);
            this.f99214a.mo78998y().setImageResource(R.drawable.cu6);
            SmartImageView u = this.f99214a.mo58382u();
            C52711k.m112236a((Object) u, "mIvCover");
            u.setVisibility(8);
            View z = this.f99214a.mo78999z();
            C52711k.m112236a((Object) z, "mBgGray");
            z.setVisibility(8);
            this.f99214a.f99195p = System.currentTimeMillis();
            C38932b bVar = this.f99214a.f99199t;
            if (bVar != null) {
                bVar.mo50641a(this.f99214a.f31643i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder$k */
    public static final class C38941k implements C50161j {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListVideoViewHolder f99215a;

        public final void aD_() {
        }

        /* renamed from: b */
        public final void mo54505b(int i, int i2) {
        }

        C38941k(BiColPlayListVideoViewHolder biColPlayListVideoViewHolder) {
            this.f99215a = biColPlayListVideoViewHolder;
        }

        /* renamed from: a */
        public final void mo54503a(int i, int i2) {
            if (this.f99215a.f99194o) {
                this.f99215a.f99194o = false;
                this.f99215a.mo78994B();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder$l */
    static final class C38942l extends C52712l implements C52670a<KeepSurfaceTextureView> {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListVideoViewHolder f99216a;

        C38942l(BiColPlayListVideoViewHolder biColPlayListVideoViewHolder) {
            this.f99216a = biColPlayListVideoViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f99216a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (KeepSurfaceTextureView) view.findViewById(R.id.czh);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder$m */
    static final class C38943m extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListVideoViewHolder f99217a;

        C38943m(BiColPlayListVideoViewHolder biColPlayListVideoViewHolder) {
            this.f99217a = biColPlayListVideoViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f99217a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (DmtTextView) view.findViewById(R.id.dh7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder$n */
    static final class C38944n extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ BiColPlayListVideoViewHolder f99218a;

        C38944n(BiColPlayListVideoViewHolder biColPlayListVideoViewHolder) {
            this.f99218a = biColPlayListVideoViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f99218a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.dhb);
            dmtTextView.setFontType(C10751d.f28903b);
            return dmtTextView;
        }
    }

    /* renamed from: C */
    private final FrameLayout m86740C() {
        return (FrameLayout) this.f99200v.getValue();
    }

    /* renamed from: a */
    public abstract void mo50643a(DmtTextView dmtTextView);

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }

    /* renamed from: q */
    public final void mo58452q() {
        m86743F();
    }

    /* renamed from: r */
    public final void mo58453r() {
        m86741D();
    }

    /* renamed from: t */
    public boolean mo58381t() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final SmartImageView mo58382u() {
        return (SmartImageView) this.f99188f.getValue();
    }

    /* renamed from: v */
    public final DmtTextView mo78991v() {
        return (DmtTextView) this.f99189g.getValue();
    }

    /* renamed from: w */
    public final DmtTextView mo78996w() {
        return (DmtTextView) this.f99190j.getValue();
    }

    /* renamed from: x */
    public final KeepSurfaceTextureView mo78997x() {
        return (KeepSurfaceTextureView) this.f99191k.getValue();
    }

    /* renamed from: y */
    public final ImageView mo78998y() {
        return (ImageView) this.f99192l.getValue();
    }

    /* renamed from: z */
    public final View mo78999z() {
        return (View) this.f99201w.getValue();
    }

    /* renamed from: l */
    public final void mo22676l() {
        super.mo22676l();
        m86742E();
    }

    /* renamed from: A */
    public final void mo78993A() {
        SmartImageView u = mo58382u();
        C52711k.m112236a((Object) u, "mIvCover");
        u.setVisibility(0);
    }

    /* renamed from: i */
    public final void mo22673i() {
        super.mo22673i();
        this.f99197r = false;
        m86742E();
    }

    /* renamed from: k */
    public final void mo22675k() {
        super.mo22675k();
        if (m86744G()) {
            m86741D();
        }
    }

    /* renamed from: G */
    private final boolean m86744G() {
        if (this.f99196q && mo58381t()) {
            VideoViewComponent videoViewComponent = this.f99203y;
            if (videoViewComponent == null) {
                C52711k.m112237a("mVideoView");
            }
            if (!videoViewComponent.mo97922d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void mo22672h() {
        super.mo22672h();
        this.f99197r = true;
        C38932b bVar = this.f99199t;
        if (bVar != null) {
            bVar.mo50645c(this.f31643i);
        }
        if (m86744G()) {
            mo78994B();
        }
    }

    /* renamed from: p */
    public final void mo58451p() {
        VideoViewComponent videoViewComponent = this.f99203y;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        if (videoViewComponent.mo97922d()) {
            m86743F();
        }
    }

    /* renamed from: D */
    private final void m86741D() {
        Video video;
        this.f99194o = false;
        int i = this.f99204z.f78757a;
        if (i == 0) {
            mo78994B();
        } else if (i == 3) {
            VideoViewComponent videoViewComponent = this.f99203y;
            if (videoViewComponent == null) {
                C52711k.m112237a("mVideoView");
            }
            Aweme aweme = this.f99193n;
            if (aweme != null) {
                video = aweme.getVideo();
            } else {
                video = null;
            }
            videoViewComponent.mo60204a(video);
            VideoViewComponent videoViewComponent2 = this.f99203y;
            if (videoViewComponent2 == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent2.mo97915a();
            this.f99204z.f78757a = 4;
        }
    }

    /* renamed from: F */
    private final void m86743F() {
        VideoViewComponent videoViewComponent = this.f99203y;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        if (videoViewComponent.mo97922d()) {
            VideoViewComponent videoViewComponent2 = this.f99203y;
            if (videoViewComponent2 == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent2.mo60215af();
            this.f99204z.f78757a = 3;
        }
    }

    /* renamed from: g */
    public final void mo22671g() {
        super.mo22671g();
        this.itemView.setOnClickListener(this);
        this.f99203y = new VideoViewComponent(true);
        VideoViewComponent videoViewComponent = this.f99203y;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        videoViewComponent.mo97917a(mo78997x());
        VideoViewComponent videoViewComponent2 = this.f99203y;
        if (videoViewComponent2 == null) {
            C52711k.m112237a("mVideoView");
        }
        videoViewComponent2.mo97918a((C50161j) this.f99186B);
    }

    /* renamed from: j */
    public void mo22674j() {
        this.f99196q = false;
        this.f99197r = false;
        SmartImageView u = mo58382u();
        C52711k.m112236a((Object) u, "mIvCover");
        u.getLayoutParams().height = this.f99187C;
        KeepSurfaceTextureView x = mo78997x();
        C52711k.m112236a((Object) x, "mSurfaceView");
        x.getLayoutParams().height = this.f99187C;
        FrameLayout C = m86740C();
        C52711k.m112236a((Object) C, "mFrameLayout");
        C.getLayoutParams().height = this.f99187C;
        super.mo22674j();
    }

    /* renamed from: m */
    public void mo22677m() {
        super.mo22677m();
        this.itemView.setOnClickListener(null);
        VideoViewComponent videoViewComponent = this.f99203y;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        videoViewComponent.mo60226b((C38871j) this.f99185A);
        VideoViewComponent videoViewComponent2 = this.f99203y;
        if (videoViewComponent2 == null) {
            C52711k.m112237a("mVideoView");
        }
        videoViewComponent2.mo97920b((C50161j) this.f99186B);
    }

    /* renamed from: E */
    private final void m86742E() {
        this.f99194o = false;
        if (this.f99204z.f78757a != 0) {
            VideoViewComponent videoViewComponent = this.f99203y;
            if (videoViewComponent == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent.mo60216ag();
            VideoViewComponent videoViewComponent2 = this.f99203y;
            if (videoViewComponent2 == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent2.mo97919b();
            VideoViewComponent videoViewComponent3 = this.f99203y;
            if (videoViewComponent3 == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent3.mo60226b((C38871j) this.f99185A);
            this.f99204z.f78757a = 0;
            if (this.f99195p > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.f99195p;
                this.f99195p = -1;
                C38932b bVar = this.f99199t;
                if (bVar != null) {
                    bVar.mo50642a(currentTimeMillis, this.f31643i);
                }
            }
            mo78993A();
        }
    }

    /* renamed from: B */
    public final void mo78994B() {
        Boolean bool;
        Boolean bool2;
        if (m86744G()) {
            KeepSurfaceTextureView x = mo78997x();
            C52711k.m112236a((Object) x, "mSurfaceView");
            x.setVisibility(0);
            VideoViewComponent videoViewComponent = this.f99203y;
            if (videoViewComponent == null) {
                C52711k.m112237a("mVideoView");
            }
            C50160i iVar = videoViewComponent.f125619b;
            Video video = null;
            if (iVar != null) {
                bool = Boolean.valueOf(iVar.mo97954c());
            } else {
                bool = null;
            }
            if (bool != null) {
                VideoViewComponent videoViewComponent2 = this.f99203y;
                if (videoViewComponent2 == null) {
                    C52711k.m112237a("mVideoView");
                }
                C50160i iVar2 = videoViewComponent2.f125619b;
                if (iVar2 != null) {
                    bool2 = Boolean.valueOf(iVar2.mo97954c());
                } else {
                    bool2 = null;
                }
                if (bool2 == null) {
                    C52711k.m112234a();
                }
                if (!bool2.booleanValue()) {
                    this.f99194o = true;
                    return;
                }
            }
            int i = this.f99204z.f78757a;
            if (i == 0) {
                View z = mo78999z();
                C52711k.m112236a((Object) z, "mBgGray");
                z.setVisibility(0);
                VideoViewComponent videoViewComponent3 = this.f99203y;
                if (videoViewComponent3 == null) {
                    C52711k.m112237a("mVideoView");
                }
                videoViewComponent3.mo60207a((C38871j) this.f99185A);
                VideoViewComponent videoViewComponent4 = this.f99203y;
                if (videoViewComponent4 == null) {
                    C52711k.m112237a("mVideoView");
                }
                Aweme aweme = this.f99193n;
                if (aweme != null) {
                    video = aweme.getVideo();
                }
                videoViewComponent4.mo60205a(video, true, C10181b.m20511a().mo18168a(Get265DecodeTypeExperiment.class, true, "decoder_type", 31744, 0));
                VideoViewComponent videoViewComponent5 = this.f99203y;
                if (videoViewComponent5 == null) {
                    C52711k.m112237a("mVideoView");
                }
                videoViewComponent5.mo97915a();
                this.f99194o = false;
                this.f99204z.f78757a = 2;
            } else if (i == 3) {
                m86741D();
                return;
            }
            return;
        }
        KeepSurfaceTextureView x2 = mo78997x();
        C52711k.m112236a((Object) x2, "mSurfaceView");
        x2.setVisibility(8);
    }

    /* renamed from: s */
    public void mo58380s() {
        Video video;
        Video video2;
        int i;
        FrameLayout C = m86740C();
        C52711k.m112236a((Object) C, "mFrameLayout");
        C.getLayoutParams().height = this.f99187C;
        SmartImageView u = mo58382u();
        C52711k.m112236a((Object) u, "mIvCover");
        u.getLayoutParams().height = this.f99187C;
        KeepSurfaceTextureView x = mo78997x();
        C52711k.m112236a((Object) x, "mSurfaceView");
        x.getLayoutParams().height = this.f99187C;
        Aweme aweme = this.f99193n;
        UrlModel urlModel = null;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        if (video != null) {
            float width = (float) video.getWidth();
            mo78997x().post(new C38934d(this, (float) video.getHeight(), width));
        }
        mo78993A();
        Aweme aweme2 = this.f99193n;
        if (aweme2 != null) {
            video2 = aweme2.getVideo();
        } else {
            video2 = null;
        }
        if (video2 != null) {
            Aweme aweme3 = this.f99193n;
            if (aweme3 != null) {
                Video video3 = aweme3.getVideo();
                if (video3 != null) {
                    urlModel = video3.getOriginCover();
                }
            }
            C12203q.m24645a((Object) C23608p.m57874a(urlModel)).mo23125b(C47788ct.m103417a(201)).mo23119a(true).mo23118a("PlayListVideoViewHolder").mo23116a((C12197k) mo58382u()).mo23122a((C12175j) new C38933c(this));
        }
        mo78998y().setImageResource(R.drawable.cu7);
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        if (C47918gj.m103682a(view.getContext())) {
            DmtTextView v = mo78991v();
            C52711k.m112236a((Object) v, "mTvTitle");
            v.setGravity(5);
        }
        DmtTextView v2 = mo78991v();
        C52711k.m112236a((Object) v2, "mTvTitle");
        mo50643a(v2);
        DmtTextView v3 = mo78991v();
        C52711k.m112236a((Object) v3, "mTvTitle");
        DmtTextView v4 = mo78991v();
        C52711k.m112236a((Object) v4, "mTvTitle");
        if (!TextUtils.isEmpty(v4.getText())) {
            i = 0;
        } else {
            i = 8;
        }
        v3.setVisibility(i);
        FrameLayout frameLayout = (FrameLayout) this.f99202x.getValue();
        C52711k.m112236a((Object) frameLayout, "mCoverMask");
        View view2 = frameLayout;
        Aweme aweme4 = this.f99193n;
        C52711k.m112240b(view2, "coverMask");
        if (C47935p.m103712e(aweme4)) {
            view2.setVisibility(0);
        } else {
            view2.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo22662a(T t) {
        this.f99196q = true;
        mo58380s();
    }

    /* renamed from: a */
    public final void mo78995a(Aweme aweme) {
        String str;
        this.f99193n = aweme;
        Aweme aweme2 = this.f99193n;
        if (aweme2 != null) {
            Video video = aweme2.getVideo();
            if (video != null) {
                Aweme aweme3 = this.f99193n;
                if (aweme3 != null) {
                    str = aweme3.getAid();
                } else {
                    str = null;
                }
                video.setSourceId(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo58449a(boolean z, boolean z2) {
        if (!z) {
            C38932b bVar = this.f99199t;
            if (bVar != null) {
                bVar.mo50645c(this.f31643i);
            }
            if (z2) {
                mo78994B();
            }
        } else {
            m86742E();
        }
    }

    public BiColPlayListVideoViewHolder(View view, int i) {
        C52711k.m112240b(view, "view");
        super(view);
        this.f99187C = i;
    }
}
