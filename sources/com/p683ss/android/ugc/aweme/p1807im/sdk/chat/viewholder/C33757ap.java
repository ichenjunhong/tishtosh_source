package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SayHelloContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35214b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35234bi;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35306y;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.ttm.player.MediaPlayer;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ap */
public final class C33757ap extends C33742ah {

    /* renamed from: g */
    public View f87555g;

    /* renamed from: h */
    public View f87556h;

    /* renamed from: i */
    public View f87557i;

    /* renamed from: j */
    private View f87558j;

    /* renamed from: k */
    private RemoteImageView f87559k;

    /* renamed from: l */
    private RemoteImageView f87560l;

    /* renamed from: m */
    private RemoteImageView f87561m;

    /* renamed from: n */
    private Animation f87562n;

    /* renamed from: o */
    private final C33758a f87563o = new C33758a(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ap$a */
    public static final class C33758a implements C35306y {

        /* renamed from: a */
        final /* synthetic */ C33757ap f87564a;

        /* renamed from: b */
        private int f87565b;

        /* renamed from: c */
        private int f87566c;

        /* renamed from: c */
        public final boolean mo71039c() {
            return true;
        }

        /* renamed from: a */
        public final void mo71037a() {
            this.f87566c++;
            this.f87565b++;
            m77312d();
        }

        /* renamed from: b */
        public final void mo71038b() {
            this.f87566c++;
            m77312d();
        }

        /* renamed from: d */
        private final void m77312d() {
            if (this.f87566c == 3) {
                C33757ap.m77303a(this.f87564a).setVisibility(8);
                C35214b.m79603a(C33757ap.m77303a(this.f87564a));
                if (this.f87565b != this.f87566c) {
                    C33757ap.m77304b(this.f87564a).setVisibility(8);
                    C33757ap.m77305c(this.f87564a).setVisibility(0);
                } else {
                    C33757ap.m77304b(this.f87564a).setVisibility(0);
                    C33757ap.m77305c(this.f87564a).setVisibility(8);
                }
                this.f87566c = 0;
                this.f87565b = 0;
            }
        }

        C33758a(C33757ap apVar) {
            this.f87564a = apVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ap$b */
    static final class C33759b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33757ap f87567a;

        C33759b(C33757ap apVar) {
            this.f87567a = apVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f87567a.mo71809g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ap$c */
    static final class C33760c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33757ap f87568a;

        C33760c(C33757ap apVar) {
            this.f87568a = apVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f87568a.mo71789a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ap$d */
    static final class C33761d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33757ap f87569a;

        C33761d(C33757ap apVar) {
            this.f87569a = apVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f87569a.mo71789a(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ap$e */
    static final class C33762e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33757ap f87570a;

        C33762e(C33757ap apVar) {
            this.f87570a = apVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f87570a.mo71789a(2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final List<C29366a> mo71795d() {
        List<C29366a> emoji = mo71793b().getEmoji();
        C52711k.m112236a((Object) emoji, "content.emoji");
        return emoji;
    }

    /* renamed from: g */
    public final void mo71809g() {
        View view = this.f87555g;
        if (view == null) {
            C52711k.m112237a("reloadLayout");
        }
        view.setVisibility(8);
        View view2 = this.f87556h;
        if (view2 == null) {
            C52711k.m112237a("loadingIv");
        }
        view2.setVisibility(0);
        View view3 = this.f87557i;
        if (view3 == null) {
            C52711k.m112237a("emojiLayout");
        }
        view3.setVisibility(0);
        View view4 = this.f87556h;
        if (view4 == null) {
            C52711k.m112237a("loadingIv");
        }
        Animation animation = this.f87562n;
        if (animation == null) {
            C52711k.m112237a("animation");
        }
        view4.startAnimation(animation);
        m77306h();
    }

    /* renamed from: h */
    private final void m77306h() {
        if (mo71795d().size() >= 3) {
            RemoteImageView remoteImageView = this.f87559k;
            if (remoteImageView == null) {
                C52711k.m112237a("emojiIvFirst");
            }
            C35234bi.m79642a(remoteImageView, ((C29366a) mo71795d().get(0)).getAnimateUrl(), (C35306y) this.f87563o);
            RemoteImageView remoteImageView2 = this.f87560l;
            if (remoteImageView2 == null) {
                C52711k.m112237a("emojiIvSecond");
            }
            C35234bi.m79642a(remoteImageView2, ((C29366a) mo71795d().get(1)).getAnimateUrl(), (C35306y) this.f87563o);
            RemoteImageView remoteImageView3 = this.f87561m;
            if (remoteImageView3 == null) {
                C52711k.m112237a("emojiIvThird");
            }
            C35234bi.m79642a(remoteImageView3, ((C29366a) mo71795d().get(2)).getAnimateUrl(), (C35306y) this.f87563o);
        }
    }

    /* renamed from: e */
    public final void mo71796e() {
        super.mo71796e();
        this.f87558j = mo71792b(R.id.b8o);
        this.f87556h = mo71792b(R.id.bh7);
        this.f87555g = mo71792b(R.id.ax5);
        this.f87557i = mo71792b(R.id.ax4);
        this.f87559k = (RemoteImageView) mo71792b(R.id.zf);
        this.f87560l = (RemoteImageView) mo71792b(R.id.zg);
        this.f87561m = (RemoteImageView) mo71792b(R.id.zh);
        RotateAnimation a = C35214b.m79601a(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, null);
        C52711k.m112236a((Object) a, "AnimationUtils.getRotateAnimation(400, null)");
        this.f87562n = a;
        View view = this.f87556h;
        if (view == null) {
            C52711k.m112237a("loadingIv");
        }
        Animation animation = this.f87562n;
        if (animation == null) {
            C52711k.m112237a("animation");
        }
        view.startAnimation(animation);
        View view2 = this.f87555g;
        if (view2 == null) {
            C52711k.m112237a("reloadLayout");
        }
        view2.setOnClickListener(new C33759b(this));
        RemoteImageView remoteImageView = this.f87559k;
        if (remoteImageView == null) {
            C52711k.m112237a("emojiIvFirst");
        }
        remoteImageView.setOnClickListener(new C33760c(this));
        RemoteImageView remoteImageView2 = this.f87560l;
        if (remoteImageView2 == null) {
            C52711k.m112237a("emojiIvSecond");
        }
        remoteImageView2.setOnClickListener(new C33761d(this));
        RemoteImageView remoteImageView3 = this.f87561m;
        if (remoteImageView3 == null) {
            C52711k.m112237a("emojiIvThird");
        }
        remoteImageView3.setOnClickListener(new C33762e(this));
    }

    public C33757ap(C33763aq aqVar) {
        C52711k.m112240b(aqVar, "parent");
        super(aqVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ View m77303a(C33757ap apVar) {
        View view = apVar.f87556h;
        if (view == null) {
            C52711k.m112237a("loadingIv");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m77304b(C33757ap apVar) {
        View view = apVar.f87557i;
        if (view == null) {
            C52711k.m112237a("emojiLayout");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m77305c(C33757ap apVar) {
        View view = apVar.f87555g;
        if (view == null) {
            C52711k.m112237a("reloadLayout");
        }
        return view;
    }

    /* renamed from: a */
    public final void mo71791a(boolean z) {
        int i;
        View view = this.f87558j;
        if (view == null) {
            C52711k.m112237a("rootLayout");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo71790a(C11207p pVar, C11207p pVar2, SayHelloContent sayHelloContent, int i) {
        C52711k.m112240b(pVar, "msg");
        C52711k.m112240b(sayHelloContent, C42311c.f106865i);
        super.mo71790a(pVar, pVar2, sayHelloContent, i);
        mo71791a(true);
        m77306h();
    }
}
