package com.p683ss.android.ugc.aweme.music.p1978ui.viewholder;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29686a;
import com.p683ss.android.ugc.aweme.favorites.p1703c.C29689c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView.C37446a;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1979a.C37489a;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1979a.C37491c.C37492a;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1984f.C37610a.C37611a;
import com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.C37682d;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p683ss.android.ugc.aweme.utils.C47788ct;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.video.C48009d;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder */
public final class SimilarMusicListViewHolder extends JediSimpleViewHolder<C37682d> implements OnClickListener, C29689c, C37489a {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f96011f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SimilarMusicListViewHolder.class), "mMusicLayout", "getMMusicLayout()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SimilarMusicListViewHolder.class), "tvMusicName", "getTvMusicName()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SimilarMusicListViewHolder.class), "mMusicUsedCount", "getMMusicUsedCount()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SimilarMusicListViewHolder.class), "mTitileMask", "getMTitileMask()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SimilarMusicListViewHolder.class), "mMusicCover", "getMMusicCover()Lcom/bytedance/lighten/loader/SmartImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SimilarMusicListViewHolder.class), "mIvMusicCollect", "getMIvMusicCollect()Lcom/ss/android/ugc/aweme/music/ui/CheckableImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SimilarMusicListViewHolder.class), "mIvShoot", "getMIvShoot()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SimilarMusicListViewHolder.class), "mVideoView", "getMVideoView()Lcom/ss/android/ugc/aweme/music/ui/viewholder/SimilarMusicVideoView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SimilarMusicListViewHolder.class), "mVideoView2", "getMVideoView2()Lcom/ss/android/ugc/aweme/music/ui/viewholder/SimilarMusicVideoView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SimilarMusicListViewHolder.class), "mOperationListener", "getMOperationListener()Lcom/ss/android/ugc/aweme/music/ui/adapter/SimilarMusicListAdapter$OnItemOperationListener;"))};

    /* renamed from: n */
    public static final C37651a f96012n = new C37651a(null);

    /* renamed from: A */
    private boolean f96013A;

    /* renamed from: B */
    private final C52668f f96014B;

    /* renamed from: C */
    private C37658h f96015C;

    /* renamed from: D */
    private C37659i f96016D;

    /* renamed from: g */
    public Aweme f96017g;

    /* renamed from: j */
    public Aweme f96018j;

    /* renamed from: k */
    public final int f96019k;

    /* renamed from: l */
    public int f96020l;

    /* renamed from: m */
    public HashMap<Integer, Integer> f96021m;

    /* renamed from: o */
    private final C52668f f96022o = C52732g.m112285a(new C37656f(this));

    /* renamed from: p */
    private final C52668f f96023p = C52732g.m112285a(new C37666p(this));

    /* renamed from: q */
    private final C52668f f96024q = C52732g.m112285a(new C37657g(this));

    /* renamed from: r */
    private final C52668f f96025r = C52732g.m112285a(new C37661k(this));

    /* renamed from: s */
    private final C52668f f96026s = C52732g.m112285a(new C37655e(this));

    /* renamed from: t */
    private final C52668f f96027t = C52732g.m112285a(new C37653c(this));

    /* renamed from: u */
    private final C52668f f96028u = C52732g.m112285a(new C37654d(this));

    /* renamed from: v */
    private final C52668f f96029v = C52732g.m112285a(new C37662l(this));

    /* renamed from: w */
    private final C52668f f96030w = C52732g.m112285a(new C37663m(this));

    /* renamed from: x */
    private boolean f96031x;

    /* renamed from: y */
    private MusicModel f96032y;

    /* renamed from: z */
    private C29686a f96033z;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$a */
    public static final class C37651a {
        private C37651a() {
        }

        public /* synthetic */ C37651a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$b */
    static final class C37652b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f96034a;

        C37652b(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f96034a = similarMusicListViewHolder;
        }

        public final void run() {
            this.f96034a.mo77157q().mo77160a();
            this.f96034a.mo77158r().mo77160a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$c */
    static final class C37653c extends C52712l implements C52670a<CheckableImageView> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f96035a;

        C37653c(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f96035a = similarMusicListViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f96035a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (CheckableImageView) view.findViewById(R.id.ees);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$d */
    static final class C37654d extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f96036a;

        C37654d(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f96036a = similarMusicListViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f96036a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (ImageView) view.findViewById(R.id.efv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$e */
    static final class C37655e extends C52712l implements C52670a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f96037a;

        C37655e(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f96037a = similarMusicListViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f96037a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (SmartImageView) view.findViewById(R.id.b2m);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$f */
    static final class C37656f extends C52712l implements C52670a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f96038a;

        C37656f(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f96038a = similarMusicListViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f96038a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (RelativeLayout) view.findViewById(R.id.ek7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$g */
    static final class C37657g extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f96039a;

        C37657g(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f96039a = similarMusicListViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f96039a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (DmtTextView) view.findViewById(R.id.di9);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$h */
    public static final class C37658h extends C48009d {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f96040a;

        /* renamed from: a */
        public final void mo53523a(float f) {
            super.mo53523a(f);
        }

        C37658h(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f96040a = similarMusicListViewHolder;
        }

        /* renamed from: d */
        public final void mo53534d(String str) {
            String str2;
            super.mo53534d(str);
            Aweme aweme = this.f96040a.f96017g;
            String str3 = null;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            Aweme aweme2 = this.f96040a.f96017g;
            if (aweme2 != null) {
                str3 = aweme2.getAuthorUid();
            }
            C37611a.m84060b(str2, str3);
        }

        /* renamed from: a */
        public final void mo53524a(C50112d dVar) {
            Object obj;
            Object obj2;
            StringBuilder sb = new StringBuilder("onPlayCompletedFirstTime play onPlayFailed：");
            Object obj3 = null;
            if (dVar != null) {
                obj = Integer.valueOf(dVar.f125526d);
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(' ');
            if (dVar != null) {
                obj2 = Integer.valueOf(dVar.f125527e);
            } else {
                obj2 = null;
            }
            sb.append(obj2);
            sb.append("  ");
            if (dVar != null) {
                obj3 = dVar.f125528f;
            }
            sb.append(obj3);
            super.mo53524a(dVar);
            this.f96040a.mo77157q().mo77167f();
            this.f96040a.mo77157q().setIvPlayingVisibility(false);
        }

        /* renamed from: a */
        public final void mo53526a(C50118g gVar) {
            String str;
            super.mo53526a(gVar);
            if (!this.f96040a.mo77157q().f96050b) {
                this.f96040a.mo77157q().mo77165d();
                this.f96040a.mo77157q().setIvPlayingVisibility(true);
            }
            this.f96040a.mo77157q().mo77168g();
            this.f96040a.mo77157q().setStartPlayTime(System.currentTimeMillis());
            Aweme aweme = this.f96040a.f96017g;
            String str2 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = this.f96040a.f96017g;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            C37611a.m84057a(str, str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$i */
    public static final class C37659i extends C48009d {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f96041a;

        C37659i(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f96041a = similarMusicListViewHolder;
        }

        /* renamed from: d */
        public final void mo53534d(String str) {
            String str2;
            super.mo53534d(str);
            Aweme aweme = this.f96041a.f96018j;
            String str3 = null;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            Aweme aweme2 = this.f96041a.f96018j;
            if (aweme2 != null) {
                str3 = aweme2.getAuthorUid();
            }
            C37611a.m84060b(str2, str3);
        }

        /* renamed from: a */
        public final void mo53524a(C50112d dVar) {
            Object obj;
            Object obj2;
            StringBuilder sb = new StringBuilder("onPlayCompletedFirstTime play onPlayFailed：");
            Object obj3 = null;
            if (dVar != null) {
                obj = Integer.valueOf(dVar.f125526d);
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(' ');
            if (dVar != null) {
                obj2 = Integer.valueOf(dVar.f125527e);
            } else {
                obj2 = null;
            }
            sb.append(obj2);
            sb.append("  ");
            if (dVar != null) {
                obj3 = dVar.f125528f;
            }
            sb.append(obj3);
            super.mo53524a(dVar);
            this.f96041a.mo77158r().mo77167f();
            this.f96041a.mo77158r().setIvPlayingVisibility(false);
        }

        /* renamed from: a */
        public final void mo53526a(C50118g gVar) {
            String str;
            super.mo53526a(gVar);
            if (!this.f96041a.mo77158r().f96050b) {
                this.f96041a.mo77158r().mo77165d();
                this.f96041a.mo77158r().setIsNeedPlay(true);
            }
            this.f96041a.mo77158r().mo77168g();
            this.f96041a.mo77158r().setStartPlayTime(System.currentTimeMillis());
            Aweme aweme = this.f96041a.f96018j;
            String str2 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = this.f96041a.f96018j;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            C37611a.m84057a(str, str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$j */
    static final class C37660j extends C52712l implements C52670a<C37492a> {

        /* renamed from: a */
        final /* synthetic */ C37492a f96042a;

        C37660j(C37492a aVar) {
            this.f96042a = aVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return this.f96042a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$k */
    static final class C37661k extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f96043a;

        C37661k(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f96043a = similarMusicListViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f96043a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return view.findViewById(R.id.f7j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$l */
    static final class C37662l extends C52712l implements C52670a<SimilarMusicVideoView> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f96044a;

        C37662l(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f96044a = similarMusicListViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f96044a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (SimilarMusicVideoView) view.findViewById(R.id.f6y);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$m */
    static final class C37663m extends C52712l implements C52670a<SimilarMusicVideoView> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f96045a;

        C37663m(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f96045a = similarMusicListViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f96045a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (SimilarMusicVideoView) view.findViewById(R.id.f6z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$n */
    public static final class C37664n implements C37446a {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f96046a;

        /* renamed from: a */
        public final void mo50574a() {
        }

        C37664n(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f96046a = similarMusicListViewHolder;
        }

        /* renamed from: a */
        public final void mo50575a(int i) {
            if (i == 1) {
                this.f96046a.mo58381t();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$o */
    static final /* synthetic */ class C37665o extends C52710j implements C52670a<C52860x> {
        C37665o(SimilarMusicListViewHolder similarMusicListViewHolder) {
            super(0, similarMusicListViewHolder);
        }

        public final String getName() {
            return "handleCollectMusic";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(SimilarMusicListViewHolder.class);
        }

        public final String getSignature() {
            return "handleCollectMusic()V";
        }

        public final /* synthetic */ Object invoke() {
            ((SimilarMusicListViewHolder) this.receiver).mo58380s();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder$p */
    static final class C37666p extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewHolder f96047a;

        C37666p(SimilarMusicListViewHolder similarMusicListViewHolder) {
            this.f96047a = similarMusicListViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f96047a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (DmtTextView) view.findViewById(R.id.dcg);
        }
    }

    /* renamed from: u */
    private final CheckableImageView m84141u() {
        return (CheckableImageView) this.f96027t.getValue();
    }

    /* renamed from: v */
    private final C37492a m84142v() {
        return (C37492a) this.f96014B.getValue();
    }

    /* renamed from: j */
    public final void mo22674j() {
        super.mo22674j();
    }

    /* renamed from: q */
    public final SimilarMusicVideoView mo77157q() {
        return (SimilarMusicVideoView) this.f96029v.getValue();
    }

    /* renamed from: r */
    public final SimilarMusicVideoView mo77158r() {
        return (SimilarMusicVideoView) this.f96030w.getValue();
    }

    /* renamed from: x */
    private final void m84144x() {
        this.f96013A = !this.f96013A;
    }

    public final void bB_() {
        mo77157q().mo77166e();
        mo77158r().mo77166e();
    }

    /* renamed from: w */
    private final int m84143w() {
        Integer num = (Integer) this.f96021m.get(Integer.valueOf(this.f31643i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: g */
    public final void mo22671g() {
        super.mo22671g();
        mo77157q().mo77161a(this.f96019k);
        mo77158r().mo77161a(this.f96019k);
    }

    /* renamed from: h */
    public final void mo22672h() {
        super.mo22672h();
        this.f96031x = true;
        C37492a v = m84142v();
        if (v != null) {
            v.mo77038c(((C37682d) mo22689o()).f96090a, this.f31643i);
        }
    }

    /* renamed from: i */
    public final void mo22673i() {
        super.mo22673i();
        this.f96031x = false;
        mo77157q().mo77166e();
        mo77158r().mo77166e();
    }

    /* renamed from: m */
    public final void mo22677m() {
        super.mo22677m();
        mo77157q().mo77166e();
        mo77158r().mo77166e();
        if (this.f96033z != null) {
            C29686a aVar = this.f96033z;
            if (aVar != null) {
                aVar.mo46991S_();
            }
            this.f96033z = null;
        }
    }

    /* renamed from: t */
    public final void mo58381t() {
        int i;
        CheckableImageView u = m84141u();
        if (this.f96013A) {
            i = R.drawable.dfz;
        } else {
            i = R.drawable.dg0;
        }
        u.setImageResource(i);
    }

    public final void bC_() {
        switch (m84143w()) {
            case 0:
                mo77157q().mo77163b();
                mo77157q().setIsNeedPlay(true);
                return;
            case 1:
                mo77158r().mo77163b();
                mo77158r().setIsNeedPlay(true);
                break;
        }
    }

    /* renamed from: p */
    public final void mo77156p() {
        switch (m84143w()) {
            case 0:
                mo77157q().mo77165d();
                mo77157q().setIsNeedPlay(false);
                return;
            case 1:
                mo77158r().mo77165d();
                mo77158r().setIsNeedPlay(false);
                break;
        }
    }

    /* renamed from: s */
    public final void mo58380s() {
        String str;
        if (this.f96032y != null) {
            if (!this.f96013A) {
                MusicModel musicModel = this.f96032y;
                View view = this.itemView;
                C52711k.m112236a((Object) view, "itemView");
                if (!C37378c.m83700a(musicModel, view.getContext(), true)) {
                    return;
                }
            }
            C29686a aVar = this.f96033z;
            if (aVar != null) {
                Object[] objArr = new Object[3];
                objArr[0] = Integer.valueOf(1);
                MusicModel musicModel2 = this.f96032y;
                if (musicModel2 != null) {
                    str = musicModel2.getMusicId();
                } else {
                    str = null;
                }
                objArr[1] = str;
                objArr[2] = Integer.valueOf(true ^ this.f96013A ? 1 : 0);
                aVar.mo44934a_(objArr);
            }
            m84144x();
            m84141u().mo76959b();
        }
    }

    /* renamed from: a */
    public final void mo50570a(Exception exc) {
        m84144x();
        mo58381t();
    }

    /* renamed from: a */
    public final void mo50568a(BaseResponse baseResponse) {
        Music music = null;
        if (this.f96013A) {
            Music music2 = ((C37682d) mo22689o()).f96090a;
            if (music2 != null) {
                music2.setCollectStatus(1);
            }
            MusicModel musicModel = this.f96032y;
            if (musicModel != null) {
                musicModel.setCollectionType(CollectionType.COLLECTED);
            }
            C37492a v = m84142v();
            if (v != null) {
                C37682d dVar = (C37682d) mo22689o();
                if (dVar != null) {
                    music = dVar.f96090a;
                }
                v.mo77037b(music, this.f31643i);
            }
        } else {
            Music music3 = ((C37682d) mo22689o()).f96090a;
            if (music3 != null) {
                music3.setCollectStatus(0);
            }
            MusicModel musicModel2 = this.f96032y;
            if (musicModel2 != null) {
                musicModel2.setCollectionType(CollectionType.NOT_COLLECTED);
            }
            C37492a v2 = m84142v();
            if (v2 != null) {
                C37682d dVar2 = (C37682d) mo22689o();
                if (dVar2 != null) {
                    music = dVar2.f96090a;
                }
                v2.mo77035a(music, this.f31643i);
            }
        }
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C32800a.m75679a(view)) {
            Music music = null;
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == R.id.efv) {
                C37492a v = m84142v();
                if (v != null) {
                    C37682d dVar = (C37682d) mo22689o();
                    if (dVar != null) {
                        music = dVar.f96090a;
                    }
                    v.mo77039d(music, this.f31643i);
                }
            } else if (num != null && num.intValue() == R.id.ees) {
                IAccountUserService g = C20854a.m53167g();
                C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                if (!g.isLogin()) {
                    C27965f.m66721a(C11016e.m22312g(), "single_song", "click_favorite_music", (Bundle) null, (C23505g) new C37671b(new C37665o(this)));
                } else {
                    mo58380s();
                }
            } else if (num != null && num.intValue() == R.id.f6y) {
                mo77157q().setIsNeedPlay(true);
                if (mo77157q().getVideoView().mo97922d()) {
                    mo77157q().mo77165d();
                    C37492a v2 = m84142v();
                    if (v2 != null) {
                        v2.mo77036a(true);
                    }
                } else {
                    mo77157q().mo77163b();
                    mo77158r().mo77165d();
                    mo77158r().setIsNeedPlay(false);
                }
            } else if (num != null && num.intValue() == R.id.f6z) {
                mo77158r().setIsNeedPlay(true);
                if (mo77158r().getVideoView().mo97922d()) {
                    mo77158r().mo77165d();
                    C37492a v3 = m84142v();
                    if (v3 != null) {
                        v3.mo77036a(true);
                    }
                } else {
                    mo77158r().mo77163b();
                    mo77157q().mo77165d();
                    mo77157q().setIsNeedPlay(false);
                }
            } else if (num != null && num.intValue() == R.id.ek7) {
                C37492a v4 = m84142v();
                if (v4 != null) {
                    C37682d dVar2 = (C37682d) mo22689o();
                    if (dVar2 != null) {
                        music = dVar2.f96090a;
                    }
                    v4.mo77040e(music, this.f31643i);
                }
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22662a(Object obj) {
        MusicModel musicModel;
        CharSequence charSequence;
        int i;
        int i2;
        int i3;
        Video video;
        Video video2;
        UrlModel urlModel;
        CollectionType collectionType;
        String str;
        String str2;
        Aweme aweme;
        Aweme aweme2;
        C37682d dVar = (C37682d) obj;
        C52711k.m112240b(dVar, "item");
        Music music = dVar.f96090a;
        CollectionType collectionType2 = null;
        if (music != null) {
            musicModel = music.convertToMusicModel();
        } else {
            musicModel = null;
        }
        this.f96032y = musicModel;
        m84141u().setOnStateChangeListener(new C37664n(this));
        if (this.f96033z == null) {
            this.f96033z = new C29686a();
            C29686a aVar = this.f96033z;
            if (aVar != null) {
                aVar.f77596c = "similar_song";
            }
            C29686a aVar2 = this.f96033z;
            if (aVar2 != null) {
                aVar2.mo54800a(this);
            }
        }
        TextView textView = (TextView) this.f96023p.getValue();
        Music music2 = ((C37682d) mo22689o()).f96090a;
        if (music2 != null) {
            charSequence = music2.getMusicName();
        } else {
            charSequence = null;
        }
        textView.setText(charSequence);
        Music music3 = ((C37682d) mo22689o()).f96090a;
        boolean z = false;
        if (music3 != null) {
            i = music3.getUserCount();
        } else {
            i = 0;
        }
        String a = C33095b.m76068a((long) i);
        TextView textView2 = (TextView) this.f96024q.getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(' ');
        textView2.setText(sb.toString());
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        if (C47918gj.m103682a(view.getContext())) {
            ((View) this.f96025r.getValue()).setBackgroundResource(R.drawable.dj1);
        }
        List<Aweme> list = ((C37682d) mo22689o()).f96091b;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i2 > 0) {
            List<Aweme> list2 = ((C37682d) mo22689o()).f96091b;
            if (list2 != null) {
                aweme2 = (Aweme) list2.get(0);
            } else {
                aweme2 = null;
            }
            this.f96017g = aweme2;
        }
        List<Aweme> list3 = ((C37682d) mo22689o()).f96091b;
        if (list3 != null) {
            i3 = list3.size();
        } else {
            i3 = 0;
        }
        if (i3 >= 2) {
            List<Aweme> list4 = ((C37682d) mo22689o()).f96091b;
            if (list4 != null) {
                aweme = (Aweme) list4.get(1);
            } else {
                aweme = null;
            }
            this.f96018j = aweme;
        }
        Aweme aweme3 = this.f96017g;
        if (aweme3 != null) {
            video = aweme3.getVideo();
        } else {
            video = null;
        }
        if (video != null) {
            Aweme aweme4 = this.f96017g;
            if (aweme4 != null) {
                Video video3 = aweme4.getVideo();
                if (video3 != null) {
                    Aweme aweme5 = this.f96017g;
                    if (aweme5 != null) {
                        str2 = aweme5.getAid();
                    } else {
                        str2 = null;
                    }
                    video3.setSourceId(str2);
                }
            }
            mo77157q().mo77162a(this.f96017g, this.f31643i, this.f96015C, m84142v(), this.f96021m, 0);
        }
        Aweme aweme6 = this.f96018j;
        if (aweme6 != null) {
            video2 = aweme6.getVideo();
        } else {
            video2 = null;
        }
        if (video2 != null) {
            Aweme aweme7 = this.f96018j;
            if (aweme7 != null) {
                Video video4 = aweme7.getVideo();
                if (video4 != null) {
                    Aweme aweme8 = this.f96018j;
                    if (aweme8 != null) {
                        str = aweme8.getAid();
                    } else {
                        str = null;
                    }
                    video4.setSourceId(str);
                }
            }
            mo77158r().mo77162a(this.f96018j, this.f31643i, this.f96016D, m84142v(), this.f96021m, 1);
        }
        SmartImageView smartImageView = (SmartImageView) this.f96026s.getValue();
        C52711k.m112236a((Object) smartImageView, "mMusicCover");
        Music music4 = ((C37682d) mo22689o()).f96090a;
        if (music4 != null) {
            urlModel = music4.getCoverMedium();
        } else {
            urlModel = null;
        }
        if (!(urlModel == null || smartImageView == null)) {
            C12203q.m24645a((Object) C23608p.m57874a(urlModel)).mo23125b(C47788ct.m103417a(300)).mo23118a("SimilarMusicListViewHolder").mo23116a((C12197k) smartImageView).mo23121a();
        }
        MusicModel musicModel2 = this.f96032y;
        if (musicModel2 != null) {
            collectionType = musicModel2.getCollectionType();
        } else {
            collectionType = null;
        }
        if (collectionType != null) {
            CollectionType collectionType3 = CollectionType.COLLECTED;
            MusicModel musicModel3 = this.f96032y;
            if (musicModel3 != null) {
                collectionType2 = musicModel3.getCollectionType();
            }
            if (collectionType3 == collectionType2) {
                z = true;
            }
            this.f96013A = z;
        }
        mo58381t();
        this.itemView.post(new C37652b(this));
        mo77157q().mo77167f();
        mo77158r().mo77167f();
        OnClickListener onClickListener = this;
        m84141u().setOnClickListener(onClickListener);
        ((ImageView) this.f96028u.getValue()).setOnClickListener(onClickListener);
        mo77157q().setOnClickListener(onClickListener);
        mo77158r().setOnClickListener(onClickListener);
        ((View) this.f96022o.getValue()).setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo77030a(int i, int i2) {
        if (i != this.f31643i) {
            mo77157q().mo77166e();
            mo77158r().mo77166e();
            mo77157q().setIsNeedPlay(false);
            mo77158r().setIsNeedPlay(false);
        } else if (i2 == 0) {
            mo77158r().mo77165d();
            mo77158r().setIsNeedPlay(false);
        } else {
            if (i2 == 1) {
                mo77157q().mo77165d();
                mo77157q().setIsNeedPlay(false);
            }
        }
    }

    public SimilarMusicListViewHolder(View view, int i, int i2, C37492a aVar, HashMap<Integer, Integer> hashMap) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(hashMap, "mLastplayingPosMap");
        super(view);
        this.f96019k = i;
        this.f96020l = i2;
        this.f96021m = hashMap;
        this.f96014B = C52732g.m112285a(new C37660j(aVar));
        this.f96015C = new C37658h(this);
        this.f96016D = new C37659i(this);
    }
}
