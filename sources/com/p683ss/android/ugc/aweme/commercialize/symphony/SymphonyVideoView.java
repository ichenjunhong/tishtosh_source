package com.p683ss.android.ugc.aweme.commercialize.symphony;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.p126ad.symphony.p127a.p128a.C2676c;
import com.bytedance.p126ad.symphony.p131c.C2712f;
import com.bytedance.p126ad.symphony.p132d.p133a.C2717a;
import com.bytedance.p126ad.symphony.p139i.C2743b;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout.C26275a;
import com.p683ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout.C26276b;
import com.p683ss.android.ugc.aweme.common.widget.C26964b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.p683ss.android.ugc.aweme.feed.widget.PeriscopeLayout;
import com.p683ss.android.ugc.aweme.longvideo.feature.VolumeController;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView */
public final class SymphonyVideoView extends FrameLayout implements C26316g, C26964b {

    /* renamed from: a */
    public C2717a f69394a;

    /* renamed from: b */
    public C2676c f69395b;

    /* renamed from: c */
    public boolean f69396c;

    /* renamed from: d */
    public int f69397d;

    /* renamed from: e */
    public int f69398e;

    /* renamed from: f */
    public boolean f69399f;

    /* renamed from: g */
    public boolean f69400g;

    /* renamed from: h */
    public Aweme f69401h;

    /* renamed from: i */
    private VolumeController f69402i;

    /* renamed from: j */
    private String f69403j;

    /* renamed from: k */
    private String f69404k;

    /* renamed from: l */
    private C26276b f69405l;

    /* renamed from: m */
    private HashMap f69406m;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$a */
    final class C26286a implements OnLongClickListener {
        public C26286a() {
        }

        public final boolean onLongClick(View view) {
            ObjectAnimator objectAnimator;
            SymphonyVideoView symphonyVideoView = SymphonyVideoView.this;
            FrameLayout frameLayout = (FrameLayout) symphonyVideoView.mo53970a(R.id.bnz);
            C52711k.m112236a((Object) frameLayout, "musicRegion");
            frameLayout.setVisibility(8);
            FrameLayout frameLayout2 = (FrameLayout) symphonyVideoView.mo53970a(R.id.a4f);
            C52711k.m112236a((Object) frameLayout2, "descRegion");
            frameLayout2.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) symphonyVideoView.mo53970a(R.id.bl4);
            C52711k.m112236a((Object) linearLayout, "menuRegion");
            linearLayout.setVisibility(8);
            AdDislikeLayout adDislikeLayout = (AdDislikeLayout) SymphonyVideoView.this.mo53970a(R.id.a68);
            LinearLayout linearLayout2 = (LinearLayout) adDislikeLayout.mo53931a(R.id.d0r);
            C52711k.m112236a((Object) linearLayout2, "titleAndOptions");
            LayoutParams layoutParams = new LayoutParams(linearLayout2.getLayoutParams());
            int i = adDislikeLayout.f69368g - adDislikeLayout.f69366e;
            if (i < adDislikeLayout.f69364c) {
                i = adDislikeLayout.f69368g;
                adDislikeLayout.f69362a = false;
            } else {
                if (i > adDislikeLayout.f69365d - adDislikeLayout.f69366e) {
                    i = adDislikeLayout.f69365d - adDislikeLayout.f69366e;
                }
                adDislikeLayout.f69362a = true;
            }
            layoutParams.setMargins(0, i, 0, 0);
            LinearLayout linearLayout3 = (LinearLayout) adDislikeLayout.mo53931a(R.id.d0r);
            C52711k.m112236a((Object) linearLayout3, "titleAndOptions");
            linearLayout3.setLayoutParams(layoutParams);
            LinearLayout linearLayout4 = (LinearLayout) adDislikeLayout.mo53931a(R.id.bv7);
            C52711k.m112236a((Object) linearLayout4, "option");
            linearLayout4.setVisibility(0);
            LinearLayout linearLayout5 = (LinearLayout) adDislikeLayout.mo53931a(R.id.d0r);
            C52711k.m112236a((Object) linearLayout5, "titleAndOptions");
            linearLayout5.setVisibility(0);
            View a = adDislikeLayout.mo53931a(R.id.agk);
            C52711k.m112236a((Object) a, "flDislikeBg");
            a.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(adDislikeLayout.mo53931a(R.id.agk), "alpha", new float[]{0.0f, 1.0f});
            C52711k.m112236a((Object) ofFloat, "fadeInBg");
            ofFloat.setDuration(150);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((LinearLayout) adDislikeLayout.mo53931a(R.id.d0r), "alpha", new float[]{0.0f, 1.0f});
            C52711k.m112236a((Object) ofFloat2, "fadeInContent");
            ofFloat2.setDuration(300);
            if (adDislikeLayout.f69362a) {
                objectAnimator = ObjectAnimator.ofFloat((LinearLayout) adDislikeLayout.mo53931a(R.id.d0r), "translationY", new float[]{adDislikeLayout.f69363b, 0.0f});
                C52711k.m112236a((Object) objectAnimator, "ObjectAnimator.ofFloat(t…translationYDistance, 0f)");
            } else {
                objectAnimator = ObjectAnimator.ofFloat((LinearLayout) adDislikeLayout.mo53931a(R.id.d0r), "translationY", new float[]{0.0f, adDislikeLayout.f69363b});
                C52711k.m112236a((Object) objectAnimator, "ObjectAnimator.ofFloat(t…0f, translationYDistance)");
            }
            ObjectAnimator duration = objectAnimator.setDuration(300);
            C52711k.m112236a((Object) duration, "jumpContent.setDuration(…IN_CONTENT_DURATION_LONG)");
            duration.setInterpolator(new OvershootInterpolator(1.04f));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(objectAnimator).with(ofFloat2);
            animatorSet.start();
            C26275a aVar = adDislikeLayout.f69367f;
            if (aVar != null) {
                aVar.mo53946b();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$b */
    static final class C26287b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f69408a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$b$a */
        public static final class C26288a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ SymphonyVideoView f69409a;

            /* renamed from: b */
            final /* synthetic */ C26287b f69410b;

            public C26288a(SymphonyVideoView symphonyVideoView, C26287b bVar) {
                this.f69409a = symphonyVideoView;
                this.f69410b = bVar;
            }

            public final void run() {
                LinearLayout linearLayout = (LinearLayout) this.f69409a.mo53970a(R.id.bka);
                C52711k.m112236a((Object) linearLayout, "maskAdLayout");
                linearLayout.setVisibility(8);
                this.f69410b.f69408a.mo53101a();
            }
        }

        C26287b(SymphonyVideoView symphonyVideoView) {
            this.f69408a = symphonyVideoView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SymphonyVideoView symphonyVideoView = this.f69408a;
            LinearLayout linearLayout = (LinearLayout) symphonyVideoView.mo53970a(R.id.bka);
            C52711k.m112236a((Object) linearLayout, "maskAdLayout");
            if (linearLayout.getVisibility() != 0) {
                this.f69408a.mo53101a();
            } else {
                LinearLayout linearLayout2 = (LinearLayout) symphonyVideoView.mo53970a(R.id.bka);
                C52711k.m112236a((Object) linearLayout2, "maskAdLayout");
                linearLayout2.setAlpha(1.0f);
                ((LinearLayout) symphonyVideoView.mo53970a(R.id.bka)).animate().alpha(0.0f).setDuration(150).withEndAction(new C26288a(symphonyVideoView, this)).start();
                ((FrameLayout) symphonyVideoView.mo53970a(R.id.bnz)).animate().alpha(1.0f).setDuration(150).start();
                ((FrameLayout) symphonyVideoView.mo53970a(R.id.a4f)).animate().alpha(1.0f).setDuration(150).start();
                ((LinearLayout) symphonyVideoView.mo53970a(R.id.bl4)).animate().alpha(1.0f).setDuration(150).start();
            }
            C2712f.m7761a("ad_sdk_replay", this.f69408a.f69395b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$c */
    static final class C26289c implements OnClickListener {

        /* renamed from: a */
        public static final C26289c f69411a = new C26289c();

        C26289c() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$d */
    static final class C26290d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f69412a;

        C26290d(SymphonyVideoView symphonyVideoView) {
            this.f69412a = symphonyVideoView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f69412a.mo53973d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$e */
    static final class C26291e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f69413a;

        C26291e(SymphonyVideoView symphonyVideoView) {
            this.f69413a = symphonyVideoView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f69413a.mo53973d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$f */
    static final class C26292f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f69414a;

        C26292f(SymphonyVideoView symphonyVideoView) {
            this.f69414a = symphonyVideoView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f69414a.mo53973d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$g */
    static final class C26293g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f69415a;

        C26293g(SymphonyVideoView symphonyVideoView) {
            this.f69415a = symphonyVideoView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Context context = this.f69415a.getContext();
            if (context != null) {
                new C26312e((MainActivity) context, this.f69415a.f69395b, this.f69415a.f69401h).show();
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$h */
    static final class C26294h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f69416a;

        C26294h(SymphonyVideoView symphonyVideoView) {
            this.f69416a = symphonyVideoView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f69416a.mo53973d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$i */
    static final class C26295i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f69417a;

        C26295i(SymphonyVideoView symphonyVideoView) {
            this.f69417a = symphonyVideoView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f69417a.f69396c) {
                ImageView imageView = (ImageView) this.f69417a.mo53970a(R.id.bwk);
                C52711k.m112236a((Object) imageView, "pauseIcon");
                imageView.setVisibility(0);
                C2712f.m7761a("ad_sdk_pause", this.f69417a.f69395b);
                this.f69417a.mo53102b();
                return;
            }
            ImageView imageView2 = (ImageView) this.f69417a.mo53970a(R.id.bwk);
            C52711k.m112236a((Object) imageView2, "pauseIcon");
            imageView2.setVisibility(8);
            C2712f.m7761a("ad_sdk_continue", this.f69417a.f69395b);
            this.f69417a.mo53101a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$j */
    public static final class C26296j implements C26275a {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f69418a;

        /* renamed from: b */
        public final void mo53946b() {
            this.f69418a.f69400g = true;
        }

        /* renamed from: a */
        public final void mo53945a() {
            this.f69418a.f69400g = false;
            SymphonyVideoView symphonyVideoView = this.f69418a;
            FrameLayout frameLayout = (FrameLayout) symphonyVideoView.mo53970a(R.id.bnz);
            C52711k.m112236a((Object) frameLayout, "musicRegion");
            frameLayout.setVisibility(0);
            FrameLayout frameLayout2 = (FrameLayout) symphonyVideoView.mo53970a(R.id.a4f);
            C52711k.m112236a((Object) frameLayout2, "descRegion");
            frameLayout2.setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) symphonyVideoView.mo53970a(R.id.bl4);
            C52711k.m112236a((Object) linearLayout, "menuRegion");
            linearLayout.setVisibility(0);
        }

        C26296j(SymphonyVideoView symphonyVideoView) {
            this.f69418a = symphonyVideoView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$k */
    public static final class C26297k implements C2717a {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f69419a;

        C26297k(SymphonyVideoView symphonyVideoView) {
            this.f69419a = symphonyVideoView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$l */
    static final class C26298l extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f69420a;

        /* renamed from: b */
        final /* synthetic */ long f69421b = 240;

        C26298l(SymphonyVideoView symphonyVideoView, long j) {
            this.f69420a = symphonyVideoView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ((SymphonyCard) this.f69420a.mo53970a(R.id.cwg)).mo53961b();
            this.f69420a.postDelayed(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C26298l f69422a;

                {
                    this.f69422a = r1;
                }

                public final void run() {
                    this.f69422a.f69420a.mo53974e();
                }
            }, this.f69421b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$m */
    static final class C26300m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f69423a;

        /* renamed from: b */
        final /* synthetic */ long f69424b = 240;

        C26300m(SymphonyVideoView symphonyVideoView, long j) {
            this.f69423a = symphonyVideoView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:101:0x01bd, code lost:
            if (r1 == null) goto L_0x01bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r5 == null) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b2, code lost:
            if (r5 == null) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0127, code lost:
            if (r5 == null) goto L_0x0129;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r0 = r9.f69423a
                r1 = 2132023210(0x7f1417aa, float:1.9684861E38)
                r0.mo53970a(r1)
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r0 = r9.f69423a
                com.bytedance.ad.symphony.a.a.c r0 = r0.f69395b
                r1 = 0
                if (r0 == 0) goto L_0x0014
                java.lang.String r2 = r0.mo7234c()
                goto L_0x0015
            L_0x0014:
                r2 = r1
            L_0x0015:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0024
                int r2 = r2.length()
                if (r2 != 0) goto L_0x0022
                goto L_0x0024
            L_0x0022:
                r2 = 0
                goto L_0x0025
            L_0x0024:
                r2 = 1
            L_0x0025:
                if (r2 == 0) goto L_0x0085
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
                if (r0 == 0) goto L_0x003d
                com.bytedance.ad.symphony.e.b r5 = r0.mo7232a()
                if (r5 == 0) goto L_0x003d
                org.json.JSONObject r5 = r5.f8254e
                if (r5 == 0) goto L_0x003d
                java.lang.String r5 = r5.toString()
                if (r5 != 0) goto L_0x003f
            L_0x003d:
                java.lang.String r5 = ""
            L_0x003f:
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53604i(r5)
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53584a(r4)
                java.lang.String r5 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53582a(r5)
                java.lang.String r5 = "show_fail"
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53593b(r5)
                if (r0 == 0) goto L_0x0075
                com.bytedance.ad.symphony.e.b r5 = r0.mo7232a()
                if (r5 == 0) goto L_0x0075
                java.util.concurrent.ConcurrentHashMap r5 = r5.mo7280a()
                if (r5 == 0) goto L_0x0075
                r6 = r5
                java.util.Map r6 = (java.util.Map) r6
                java.lang.String r7 = "error_message"
                java.lang.String r8 = "card_name_missing"
                r6.put(r7, r8)
                com.google.gson.f r6 = new com.google.gson.f
                r6.<init>()
                java.lang.String r5 = r6.mo34889b(r5)
                goto L_0x0076
            L_0x0075:
                r5 = r1
            L_0x0076:
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53581a(r5)
                java.lang.String r5 = "card"
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53602g(r5)
                r2.mo53597c()
                r2 = 0
                goto L_0x0086
            L_0x0085:
                r2 = 1
            L_0x0086:
                if (r0 == 0) goto L_0x008d
                java.lang.String r5 = r0.mo7235d()
                goto L_0x008e
            L_0x008d:
                r5 = r1
            L_0x008e:
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                if (r5 == 0) goto L_0x009b
                int r5 = r5.length()
                if (r5 != 0) goto L_0x0099
                goto L_0x009b
            L_0x0099:
                r5 = 0
                goto L_0x009c
            L_0x009b:
                r5 = 1
            L_0x009c:
                if (r5 == 0) goto L_0x00fb
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
                if (r0 == 0) goto L_0x00b4
                com.bytedance.ad.symphony.e.b r5 = r0.mo7232a()
                if (r5 == 0) goto L_0x00b4
                org.json.JSONObject r5 = r5.f8254e
                if (r5 == 0) goto L_0x00b4
                java.lang.String r5 = r5.toString()
                if (r5 != 0) goto L_0x00b6
            L_0x00b4:
                java.lang.String r5 = ""
            L_0x00b6:
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53604i(r5)
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53584a(r4)
                java.lang.String r5 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53582a(r5)
                java.lang.String r5 = "show_fail"
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53593b(r5)
                if (r0 == 0) goto L_0x00ec
                com.bytedance.ad.symphony.e.b r5 = r0.mo7232a()
                if (r5 == 0) goto L_0x00ec
                java.util.concurrent.ConcurrentHashMap r5 = r5.mo7280a()
                if (r5 == 0) goto L_0x00ec
                r6 = r5
                java.util.Map r6 = (java.util.Map) r6
                java.lang.String r7 = "error_message"
                java.lang.String r8 = "card_title_missing"
                r6.put(r7, r8)
                com.google.gson.f r6 = new com.google.gson.f
                r6.<init>()
                java.lang.String r5 = r6.mo34889b(r5)
                goto L_0x00ed
            L_0x00ec:
                r5 = r1
            L_0x00ed:
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53581a(r5)
                java.lang.String r5 = "card"
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53602g(r5)
                r2.mo53597c()
                r2 = 0
            L_0x00fb:
                if (r0 == 0) goto L_0x0102
                java.lang.String r5 = r0.mo7238g()
                goto L_0x0103
            L_0x0102:
                r5 = r1
            L_0x0103:
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                if (r5 == 0) goto L_0x0110
                int r5 = r5.length()
                if (r5 != 0) goto L_0x010e
                goto L_0x0110
            L_0x010e:
                r5 = 0
                goto L_0x0111
            L_0x0110:
                r5 = 1
            L_0x0111:
                if (r5 == 0) goto L_0x0170
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
                if (r0 == 0) goto L_0x0129
                com.bytedance.ad.symphony.e.b r5 = r0.mo7232a()
                if (r5 == 0) goto L_0x0129
                org.json.JSONObject r5 = r5.f8254e
                if (r5 == 0) goto L_0x0129
                java.lang.String r5 = r5.toString()
                if (r5 != 0) goto L_0x012b
            L_0x0129:
                java.lang.String r5 = ""
            L_0x012b:
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53604i(r5)
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53584a(r4)
                java.lang.String r5 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53582a(r5)
                java.lang.String r5 = "show_fail"
                com.ss.android.ugc.aweme.commercialize.log.e$b r2 = r2.mo53593b(r5)
                if (r0 == 0) goto L_0x0161
                com.bytedance.ad.symphony.e.b r0 = r0.mo7232a()
                if (r0 == 0) goto L_0x0161
                java.util.concurrent.ConcurrentHashMap r0 = r0.mo7280a()
                if (r0 == 0) goto L_0x0161
                r5 = r0
                java.util.Map r5 = (java.util.Map) r5
                java.lang.String r6 = "error_message"
                java.lang.String r7 = "card_download_button_missing"
                r5.put(r6, r7)
                com.google.gson.f r5 = new com.google.gson.f
                r5.<init>()
                java.lang.String r0 = r5.mo34889b(r0)
                goto L_0x0162
            L_0x0161:
                r0 = r1
            L_0x0162:
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r2.mo53581a(r0)
                java.lang.String r2 = "card"
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53602g(r2)
                r0.mo53597c()
                r2 = 0
            L_0x0170:
                if (r2 == 0) goto L_0x021f
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r0 = r9.f69423a
                r2 = 2132020994(0x7f140f02, float:1.9680367E38)
                android.view.View r0 = r0.mo53970a(r2)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                java.lang.String r2 = "maskAdLayout"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                int r0 = r0.getVisibility()
                if (r0 == 0) goto L_0x021f
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
                com.google.gson.f r2 = new com.google.gson.f
                r2.<init>()
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r3 = r9.f69423a
                com.bytedance.ad.symphony.a.a.c r3 = r3.f69395b
                if (r3 == 0) goto L_0x01a1
                com.bytedance.ad.symphony.e.b r3 = r3.mo7232a()
                if (r3 == 0) goto L_0x01a1
                java.util.concurrent.ConcurrentHashMap r1 = r3.mo7280a()
            L_0x01a1:
                java.lang.String r1 = r2.mo34889b(r1)
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53581a(r1)
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r1 = r9.f69423a
                com.bytedance.ad.symphony.a.a.c r1 = r1.f69395b
                if (r1 == 0) goto L_0x01bf
                com.bytedance.ad.symphony.e.b r1 = r1.mo7232a()
                if (r1 == 0) goto L_0x01bf
                org.json.JSONObject r1 = r1.f8254e
                if (r1 == 0) goto L_0x01bf
                java.lang.String r1 = r1.toString()
                if (r1 != 0) goto L_0x01c1
            L_0x01bf:
                java.lang.String r1 = ""
            L_0x01c1:
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53604i(r1)
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53584a(r4)
                java.lang.String r1 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53582a(r1)
                java.lang.String r1 = "othershow"
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53593b(r1)
                java.lang.String r1 = "card"
                com.ss.android.ugc.aweme.commercialize.log.e$b r0 = r0.mo53602g(r1)
                r0.mo53597c()
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r0 = r9.f69423a
                r1 = 2132018283(0x7f14046b, float:1.9674868E38)
                android.view.View r1 = r0.mo53970a(r1)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                android.view.ViewPropertyAnimator r1 = r1.animate()
                android.view.animation.LinearInterpolator r2 = new android.view.animation.LinearInterpolator
                r2.<init>()
                android.animation.TimeInterpolator r2 = (android.animation.TimeInterpolator) r2
                android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r2)
                r2 = 200(0xc8, double:9.9E-322)
                android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
                r2 = 0
                android.view.ViewPropertyAnimator r1 = r1.alpha(r2)
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$n r2 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$n
                r2.<init>(r0)
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                android.view.ViewPropertyAnimator r0 = r1.withEndAction(r2)
                r0.start()
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView r0 = r9.f69423a
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$m$1 r1 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$m$1
                r1.<init>(r9)
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                long r2 = r9.f69424b
                r0.postDelayed(r1, r2)
            L_0x021f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView.C26300m.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$n */
    static final class C26302n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f69426a;

        C26302n(SymphonyVideoView symphonyVideoView) {
            this.f69426a = symphonyVideoView;
        }

        public final void run() {
            LinearLayout linearLayout = (LinearLayout) this.f69426a.mo53970a(R.id.zk);
            C52711k.m112236a((Object) linearLayout, "contentView");
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$o */
    public static final class C26303o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f69427a;

        /* renamed from: b */
        final /* synthetic */ SymphonyVideoView f69428b;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$o$a */
        static final class C26304a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C26303o f69429a;

            C26304a(C26303o oVar) {
                this.f69429a = oVar;
            }

            public final void run() {
            }
        }

        public C26303o(SymphonyVideoView symphonyVideoView, SymphonyVideoView symphonyVideoView2) {
            this.f69427a = symphonyVideoView;
            this.f69428b = symphonyVideoView2;
        }

        public final void run() {
            LinearLayout linearLayout = (LinearLayout) this.f69427a.mo53970a(R.id.bka);
            C52711k.m112236a((Object) linearLayout, "maskAdLayout");
            linearLayout.setVisibility(8);
            this.f69428b.postDelayed(new C26304a(this), 300);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$p */
    static final class C26305p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SymphonyVideoView f69430a;

        C26305p(SymphonyVideoView symphonyVideoView) {
            this.f69430a = symphonyVideoView;
        }

        public final void run() {
        }
    }

    public SymphonyVideoView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* renamed from: a */
    public final View mo53970a(int i) {
        if (this.f69406m == null) {
            this.f69406m = new HashMap();
        }
        View view = (View) this.f69406m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f69406m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final void mo53102b() {
        if (this.f69399f && this.f69396c) {
        }
    }

    /* renamed from: d */
    public final void mo53973d() {
        C10691a.m21549c(getContext(), (int) R.string.dm, 0).mo19066a();
    }

    /* renamed from: f */
    private final boolean m63667f() {
        if (C2743b.m7832a(this.f69395b) || C2743b.m7833b(this.f69395b) || C2743b.m7834c(this.f69395b)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo53972c() {
        this.f69399f = false;
        if (this.f69400g) {
            ((AdDislikeLayout) mo53970a(R.id.a68)).mo53933b();
        }
        if ((getContext() instanceof MainActivity) && this.f69402i != null) {
            Context context = getContext();
            if (context != null) {
                MainActivity mainActivity = (MainActivity) context;
                VolumeController volumeController = this.f69402i;
                if (volumeController == null) {
                    C52711k.m112234a();
                }
                mainActivity.unRegisterActivityOnKeyDownListener(volumeController);
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
            }
        }
        mo53102b();
        ((PeriscopeLayout) mo53970a(R.id.brn)).mo64101b();
        ((MarqueeView) mo53970a(R.id.aw)).mo64087b();
        ((FrameLayout) mo53970a(R.id.bny)).animate().cancel();
        ((SymphonyCard) mo53970a(R.id.cwg)).mo53960a();
        ((SymphonyCard) mo53970a(R.id.cwg)).mo53961b();
        mo53974e();
    }

    /* renamed from: e */
    public final void mo53974e() {
        LinearLayout linearLayout = (LinearLayout) mo53970a(R.id.zk);
        C52711k.m112236a((Object) linearLayout, "contentView");
        linearLayout.setTranslationY((float) C23728o.m58241a(17.0d));
        LinearLayout linearLayout2 = (LinearLayout) mo53970a(R.id.zk);
        C52711k.m112236a((Object) linearLayout2, "contentView");
        linearLayout2.setVisibility(0);
        ((LinearLayout) mo53970a(R.id.zk)).animate().alpha(1.0f).translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(280).start();
    }

    /* renamed from: a */
    public final void mo53101a() {
        if (this.f69399f && !this.f69396c) {
            LinearLayout linearLayout = (LinearLayout) mo53970a(R.id.bka);
            C52711k.m112236a((Object) linearLayout, "maskAdLayout");
            if (linearLayout.getVisibility() != 0) {
                postDelayed(new C26305p(this), 300);
                return;
            }
            LinearLayout linearLayout2 = (LinearLayout) mo53970a(R.id.bka);
            C52711k.m112236a((Object) linearLayout2, "maskAdLayout");
            linearLayout2.setAlpha(1.0f);
            ((LinearLayout) mo53970a(R.id.bka)).animate().alpha(0.0f).setDuration(150).withEndAction(new C26303o(this, this)).start();
            ((FrameLayout) mo53970a(R.id.bnz)).animate().alpha(1.0f).setDuration(150).start();
            ((FrameLayout) mo53970a(R.id.a4f)).animate().alpha(1.0f).setDuration(150).start();
            ((LinearLayout) mo53970a(R.id.bl4)).animate().alpha(1.0f).setDuration(150).start();
        }
    }

    public SymphonyVideoView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f69404k = "Ad";
        this.f69398e = 2;
        LayoutInflater.from(context).inflate(R.layout.afi, this, true);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (!C22453b.m55505a().f60473k) {
            Space space = (Space) mo53970a(R.id.ma);
            C52711k.m112236a((Object) space, "bottom_space");
            ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
            C22453b a = C22453b.m55505a();
            C52711k.m112236a((Object) a, "AdaptationManager.getInstance()");
            layoutParams.height = a.mo46745b();
            Space space2 = (Space) mo53970a(R.id.ma);
            C52711k.m112236a((Object) space2, "bottom_space");
            space2.setLayoutParams(layoutParams);
        }
    }

    private /* synthetic */ SymphonyVideoView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0514  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0595  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x05ba  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x05e7  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x05ec  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0621  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x067f  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x06f3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02e6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53971a(com.bytedance.p126ad.symphony.p127a.p128a.C2676c r18, com.p683ss.android.ugc.aweme.feed.model.Aweme r19, java.lang.String r20, java.lang.String r21, com.bytedance.p126ad.symphony.p132d.p133a.C2717a r22, com.p683ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout.C26276b r23, int r24) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            r2 = r21
            java.lang.String r3 = "soundDesc"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            java.lang.String r3 = "adLabel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            r3 = r18
            r0.f69395b = r3
            r0.f69403j = r1
            r0.f69404k = r2
            r1 = r22
            r0.f69394a = r1
            r1 = r23
            r0.f69405l = r1
            r1 = r24
            r0.f69398e = r1
            r1 = r19
            r0.f69401h = r1
            r1 = 0
            r0.f69397d = r1
            com.bytedance.ad.symphony.a.a.c r2 = r0.f69395b
            r3 = 2132017219(0x7f140043, float:1.967271E38)
            r4 = 2132017213(0x7f14003d, float:1.9672698E38)
            r5 = 2132020991(0x7f140eff, float:1.968036E38)
            r6 = 2132020995(0x7f140f03, float:1.9680369E38)
            r7 = 2132020993(0x7f140f01, float:1.9680365E38)
            r8 = 2132017214(0x7f14003e, float:1.96727E38)
            r9 = 2132023210(0x7f1417aa, float:1.9684861E38)
            r10 = 2132020996(0x7f140f04, float:1.968037E38)
            r11 = 1
            if (r2 != 0) goto L_0x004a
            goto L_0x0150
        L_0x004a:
            com.bytedance.ad.symphony.a.a.c r2 = r0.f69395b
            if (r2 == 0) goto L_0x0057
            boolean r2 = r2.mo7240i()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r11)
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r13)
            if (r2 == 0) goto L_0x007d
            com.bytedance.ad.symphony.a.a.c r2 = r0.f69395b
            if (r2 == 0) goto L_0x006c
            r2 = 2132017222(0x7f140046, float:1.9672716E38)
            r0.mo53970a(r2)
        L_0x006c:
            r2 = 2132017222(0x7f140046, float:1.9672716E38)
            android.view.View r2 = r0.mo53970a(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            java.lang.String r13 = "adVideoTypeView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r13)
            r2.setVisibility(r1)
        L_0x007d:
            r2 = 2132021469(0x7f1410dd, float:1.968133E38)
            android.view.View r2 = r0.mo53970a(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.removeAllViews()
            com.bytedance.ad.symphony.a.a.c r2 = r0.f69395b
            if (r2 == 0) goto L_0x00b7
            r2 = 3
            android.view.ViewGroup[] r2 = new android.view.ViewGroup[r2]
            r13 = 2132021469(0x7f1410dd, float:1.968133E38)
            android.view.View r13 = r0.mo53970a(r13)
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            r2[r1] = r13
            android.view.View r13 = r0.mo53970a(r9)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard r13 = (com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyCard) r13
            android.view.ViewGroup r13 = r13.getAddOtherLayout()
            r2[r11] = r13
            r13 = 2
            r14 = 2132021000(0x7f140f08, float:1.968038E38)
            android.view.View r14 = r0.mo53970a(r14)
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r2[r13] = r14
        L_0x00b7:
            com.bytedance.ad.symphony.a.a.c r2 = r0.f69395b
            if (r2 == 0) goto L_0x0147
            r0.mo53970a(r8)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r13 = 2132017215(0x7f14003f, float:1.9672702E38)
            android.view.View r13 = r0.mo53970a(r13)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r13 = (com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView) r13
            r2.add(r13)
            android.view.View r13 = r0.mo53970a(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r13
            r2.add(r13)
            android.view.View r13 = r0.mo53970a(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r13
            r2.add(r13)
            r13 = 2132020992(0x7f140f00, float:1.9680363E38)
            android.view.View r13 = r0.mo53970a(r13)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r13
            r2.add(r13)
            boolean r13 = r17.m63667f()
            if (r13 == 0) goto L_0x0147
            r13 = 2132017935(0x7f14030f, float:1.9674162E38)
            android.view.View r13 = r0.mo53970a(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r2.add(r13)
            r13 = 2132017936(0x7f140310, float:1.9674164E38)
            android.view.View r13 = r0.mo53970a(r13)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r13 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r13
            r2.add(r13)
            r13 = 2132017937(0x7f140311, float:1.9674167E38)
            android.view.View r13 = r0.mo53970a(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r2.add(r13)
            r13 = 2132017934(0x7f14030e, float:1.967416E38)
            android.view.View r13 = r0.mo53970a(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r2.add(r13)
            android.view.View r13 = r0.mo53970a(r7)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r13 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r13
            r2.add(r13)
            android.view.View r13 = r0.mo53970a(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r13
            r2.add(r13)
            android.view.View r13 = r0.mo53970a(r10)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r13 = (com.p683ss.android.ugc.aweme.commercialize.p1545ad.AdRatingView) r13
            r2.add(r13)
            android.view.View r13 = r0.mo53970a(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r13
            r2.add(r13)
        L_0x0147:
            com.bytedance.ad.symphony.a.a.c r2 = r0.f69395b
            if (r2 == 0) goto L_0x0150
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$k r2 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$k
            r2.<init>(r0)
        L_0x0150:
            android.view.View r2 = r0.mo53970a(r9)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard r2 = (com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyCard) r2
            r2.mo53960a()
            android.view.View r2 = r0.mo53970a(r9)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard r2 = (com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyCard) r2
            com.bytedance.ad.symphony.a.a.c r13 = r0.f69395b
            java.lang.String r14 = r0.f69404k
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$l r15 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$l
            r5 = 240(0xf0, double:1.186E-321)
            r15.<init>(r0, r5)
            d.f.a.a r15 = (p2628d.p2639f.p2640a.C52670a) r15
            java.lang.String r5 = "sponsor"
            p2628d.p2639f.p2641b.C52711k.m112240b(r14, r5)
            java.lang.String r5 = "closeAction"
            p2628d.p2639f.p2641b.C52711k.m112240b(r15, r5)
            r5 = 2132017936(0x7f140310, float:1.9674164E38)
            android.view.View r5 = r2.mo53959a(r5)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r5
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r6.<init>()
            java.lang.String[] r12 = new java.lang.String[r11]
            if (r13 == 0) goto L_0x018d
            java.lang.String r16 = r13.mo7237f()
            goto L_0x018f
        L_0x018d:
            r16 = 0
        L_0x018f:
            r12[r1] = r16
            java.util.List r12 = p2628d.p2629a.C52575l.m112101c(r12)
            r6.setUrlList(r12)
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r5, r6)
            if (r13 == 0) goto L_0x01a2
            java.lang.String r12 = r13.mo7234c()
            goto L_0x01a3
        L_0x01a2:
            r12 = 0
        L_0x01a3:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            if (r12 == 0) goto L_0x01b0
            int r5 = r12.length()
            if (r5 != 0) goto L_0x01ae
            goto L_0x01b0
        L_0x01ae:
            r5 = 0
            goto L_0x01b1
        L_0x01b0:
            r5 = 1
        L_0x01b1:
            if (r5 != 0) goto L_0x01ce
            r5 = 2132017937(0x7f140311, float:1.9674167E38)
            android.view.View r5 = r2.mo53959a(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r6 = "cardAdTitle"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            if (r13 == 0) goto L_0x01c8
            java.lang.String r12 = r13.mo7234c()
            goto L_0x01c9
        L_0x01c8:
            r12 = 0
        L_0x01c9:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r5.setText(r12)
        L_0x01ce:
            if (r13 == 0) goto L_0x01d5
            java.lang.String r12 = r13.mo7235d()
            goto L_0x01d6
        L_0x01d5:
            r12 = 0
        L_0x01d6:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            if (r12 == 0) goto L_0x01e3
            int r5 = r12.length()
            if (r5 != 0) goto L_0x01e1
            goto L_0x01e3
        L_0x01e1:
            r5 = 0
            goto L_0x01e4
        L_0x01e3:
            r5 = 1
        L_0x01e4:
            if (r5 != 0) goto L_0x0201
            r5 = 2132017934(0x7f14030e, float:1.967416E38)
            android.view.View r5 = r2.mo53959a(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r6 = "cardAdDesc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            if (r13 == 0) goto L_0x01fb
            java.lang.String r12 = r13.mo7235d()
            goto L_0x01fc
        L_0x01fb:
            r12 = 0
        L_0x01fc:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r5.setText(r12)
        L_0x0201:
            if (r13 == 0) goto L_0x0208
            java.lang.String r12 = r13.mo7238g()
            goto L_0x0209
        L_0x0208:
            r12 = 0
        L_0x0209:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            if (r12 == 0) goto L_0x0216
            int r5 = r12.length()
            if (r5 != 0) goto L_0x0214
            goto L_0x0216
        L_0x0214:
            r5 = 0
            goto L_0x0217
        L_0x0216:
            r5 = 1
        L_0x0217:
            if (r5 != 0) goto L_0x0234
            r5 = 2132017935(0x7f14030f, float:1.9674162E38)
            android.view.View r5 = r2.mo53959a(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r6 = "cardAdDownload"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            if (r13 == 0) goto L_0x022e
            java.lang.String r12 = r13.mo7238g()
            goto L_0x022f
        L_0x022e:
            r12 = 0
        L_0x022f:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r5.setText(r12)
        L_0x0234:
            r5 = 2132017940(0x7f140314, float:1.9674173E38)
            android.view.View r5 = r2.mo53959a(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r6 = "cardSponsorText"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r5.setText(r14)
            r5 = 2132017938(0x7f140312, float:1.9674169E38)
            android.view.View r5 = r2.mo53959a(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$a r6 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$a
            r6.<init>(r15)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r5.setOnClickListener(r6)
            r5 = 2132017939(0x7f140313, float:1.967417E38)
            android.view.View r5 = r2.mo53959a(r5)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            java.lang.String r6 = "cardOthersTagLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            int r5 = r5.getChildCount()
            r6 = 8
            if (r5 != 0) goto L_0x0281
            r5 = 2132017939(0x7f140313, float:1.967417E38)
            android.view.View r5 = r2.mo53959a(r5)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            java.lang.String r12 = "cardOthersTagLayout"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r12)
            r5.setVisibility(r6)
        L_0x0281:
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$b r5 = com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyCard.C26281b.f69389a
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r2.setOnClickListener(r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f69401h
            if (r2 == 0) goto L_0x0297
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x0297
            int r2 = r2.getCardInteractionSeconds()
            goto L_0x0298
        L_0x0297:
            r2 = 0
        L_0x0298:
            if (r2 <= 0) goto L_0x02d4
            boolean r2 = r17.m63667f()
            if (r2 == 0) goto L_0x02d4
            android.view.View r2 = r0.mo53970a(r9)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard r2 = (com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyCard) r2
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$m r5 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$m
            r12 = 240(0xf0, double:1.186E-321)
            r5.<init>(r0, r12)
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r0.f69401h
            if (r9 == 0) goto L_0x02c2
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r9 = r9.getAwemeRawAd()
            if (r9 == 0) goto L_0x02c2
            int r9 = r9.getCardInteractionSeconds()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            goto L_0x02c3
        L_0x02c2:
            r12 = 0
        L_0x02c3:
            if (r12 != 0) goto L_0x02c8
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x02c8:
            int r9 = r12.intValue()
            long r12 = (long) r9
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            r2.postDelayed(r5, r12)
        L_0x02d4:
            r2 = 2132017215(0x7f14003f, float:1.9672702E38)
            android.view.View r2 = r0.mo53970a(r2)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r2 = (com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView) r2
            com.bytedance.ad.symphony.a.a.c r5 = r0.f69395b
            if (r5 == 0) goto L_0x02e6
            java.lang.String r12 = r5.mo7237f()
            goto L_0x02e7
        L_0x02e6:
            r12 = 0
        L_0x02e7:
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r2, r12)
            r2 = 2132017901(0x7f1402ed, float:1.9674093E38)
            android.view.View r2 = r0.mo53970a(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.ss.android.ugc.aweme.commercialize.symphony.b r5 = new com.ss.android.ugc.aweme.commercialize.symphony.b
            r5.<init>()
            android.view.View$OnTouchListener r5 = (android.view.View.OnTouchListener) r5
            r2.setOnTouchListener(r5)
            r2 = 2132017901(0x7f1402ed, float:1.9674093E38)
            android.view.View r2 = r0.mo53970a(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$e r5 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$e
            r5.<init>(r0)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r2.setOnClickListener(r5)
            r2 = 2132017900(0x7f1402ec, float:1.9674091E38)
            android.view.View r2 = r0.mo53970a(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.ss.android.ugc.aweme.commercialize.symphony.b r5 = new com.ss.android.ugc.aweme.commercialize.symphony.b
            r5.<init>()
            android.view.View$OnTouchListener r5 = (android.view.View.OnTouchListener) r5
            r2.setOnTouchListener(r5)
            r2 = 2132017900(0x7f1402ec, float:1.9674091E38)
            android.view.View r2 = r0.mo53970a(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$f r5 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$f
            r5.<init>(r0)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r2.setOnClickListener(r5)
            r2 = 2132017903(0x7f1402ef, float:1.9674098E38)
            android.view.View r5 = r0.mo53970a(r2)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.ss.android.ugc.aweme.commercialize.symphony.b r9 = new com.ss.android.ugc.aweme.commercialize.symphony.b
            r9.<init>()
            android.view.View$OnTouchListener r9 = (android.view.View.OnTouchListener) r9
            r5.setOnTouchListener(r9)
            android.view.View r5 = r0.mo53970a(r2)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$g r9 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$g
            r9.<init>(r0)
            android.view.View$OnClickListener r9 = (android.view.View.OnClickListener) r9
            r5.setOnClickListener(r9)
            android.view.View r2 = r0.mo53970a(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r5 = com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.getBridgeService_Monster()
            java.lang.String r9 = "ServiceManager.get().get…ridgeService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r9)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r5 = (com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService) r5
            int r5 = r5.getShareIconResource()
            r2.setImageResource(r5)
            r2 = 2132021460(0x7f1410d4, float:1.9681312E38)
            android.view.View r2 = r0.mo53970a(r2)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r2 = (com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView) r2
            com.bytedance.ad.symphony.a.a.c r5 = r0.f69395b
            if (r5 == 0) goto L_0x0383
            java.lang.String r12 = r5.mo7237f()
            goto L_0x0384
        L_0x0383:
            r12 = 0
        L_0x0384:
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r2, r12)
            r2 = 2132021152(0x7f140fa0, float:1.9680687E38)
            android.view.View r2 = r0.mo53970a(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$h r5 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$h
            r5.<init>(r0)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r2.setOnClickListener(r5)
            android.view.View r2 = r0.mo53970a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r5 = "adDescButton"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            com.bytedance.ad.symphony.a.a.c r5 = r0.f69395b
            if (r5 == 0) goto L_0x03ae
            java.lang.String r12 = r5.mo7238g()
            goto L_0x03af
        L_0x03ae:
            r12 = 0
        L_0x03af:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r2.setText(r12)
            r2 = 2132017220(0x7f140044, float:1.9672712E38)
            android.view.View r2 = r0.mo53970a(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.String r5 = "adTagIcon"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            com.ss.android.ugc.aweme.commercialize.ad.b r5 = new com.ss.android.ugc.aweme.commercialize.ad.b
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r9 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r12)
            float r9 = (float) r9
            android.content.Context r12 = r17.getContext()
            java.lang.String r13 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131821883(0x7f11053b, float:1.9276522E38)
            int r12 = r12.getColor(r13)
            r5.<init>(r9, r12)
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            r2.setBackground(r5)
            r2 = 2132017221(0x7f140045, float:1.9672714E38)
            android.view.View r2 = r0.mo53970a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r5 = "adTagLabel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            java.lang.String r5 = r0.f69404k
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r2.setText(r5)
            r2 = 2132017221(0x7f140045, float:1.9672714E38)
            android.view.View r2 = r0.mo53970a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$c r5 = com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView.C26289c.f69411a
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r2.setOnClickListener(r5)
            android.view.View r2 = r0.mo53970a(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r5 = "adName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "@"
            r5.<init>(r9)
            com.bytedance.ad.symphony.a.a.c r9 = r0.f69395b
            if (r9 == 0) goto L_0x0427
            java.lang.String r12 = r9.mo7234c()
            goto L_0x0428
        L_0x0427:
            r12 = 0
        L_0x0428:
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r2.setText(r5)
            android.view.View r2 = r0.mo53970a(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r3 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28908g
            r2.setFontType(r3)
            android.view.View r2 = r0.mo53970a(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r3 = "adDesc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.bytedance.ad.symphony.a.a.c r3 = r0.f69395b
            if (r3 == 0) goto L_0x0453
            java.lang.String r12 = r3.mo7235d()
            goto L_0x0454
        L_0x0453:
            r12 = 0
        L_0x0454:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r2.setText(r12)
            android.view.View r2 = r0.mo53970a(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r3 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28902a
            r2.setFontType(r3)
            r2 = 2132017218(0x7f140042, float:1.9672708E38)
            android.view.View r2 = r0.mo53970a(r2)
            com.ss.android.ugc.aweme.feed.widget.MarqueeView r2 = (com.p683ss.android.ugc.aweme.feed.widget.MarqueeView) r2
            java.lang.String r3 = r0.f69403j
            r2.setText(r3)
            android.view.View r2 = r0.mo53970a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r3 = com.bytedance.ies.dmt.p664ui.widget.util.C10751d.f28902a
            r2.setFontType(r3)
            android.view.View r2 = r0.mo53970a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r3 = "adDescButton"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.ss.android.ugc.aweme.commercialize.ad.b r3 = new com.ss.android.ugc.aweme.commercialize.ad.b
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r4 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r4)
            float r4 = (float) r4
            android.content.Context r5 = r17.getContext()
            java.lang.String r8 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r8)
            android.content.res.Resources r5 = r5.getResources()
            r8 = 2131821457(0x7f110391, float:1.9275658E38)
            int r5 = r5.getColor(r8)
            r3.<init>(r4, r5)
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r2.setBackground(r3)
            r2 = 2132017218(0x7f140042, float:1.9672708E38)
            android.view.View r2 = r0.mo53970a(r2)
            com.ss.android.ugc.aweme.feed.widget.MarqueeView r2 = (com.p683ss.android.ugc.aweme.feed.widget.MarqueeView) r2
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$d r3 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$d
            r3.<init>(r0)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            r2 = 2132018576(0x7f140590, float:1.9675463E38)
            android.view.View r3 = r0.mo53970a(r2)
            com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout r3 = (com.p683ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout) r3
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$a r4 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$a
            r4.<init>()
            android.view.View$OnLongClickListener r4 = (android.view.View.OnLongClickListener) r4
            r3.setOnLongClickListener(r4)
            android.view.View r3 = r0.mo53970a(r2)
            com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout r3 = (com.p683ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout) r3
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$i r4 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$i
            r4.<init>(r0)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r3.setOnClickListener(r4)
            android.view.View r3 = r0.mo53970a(r2)
            com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout r3 = (com.p683ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout) r3
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$j r4 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$j
            r4.<init>(r0)
            com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout$a r4 = (com.p683ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout.C26275a) r4
            r3.setIDislike(r4)
            android.view.View r2 = r0.mo53970a(r2)
            com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout r2 = (com.p683ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout) r2
            com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout$b r3 = r0.f69405l
            r2.setIDislikeClick(r3)
            android.view.View r2 = r0.mo53970a(r7)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r2
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r3.<init>()
            java.lang.String[] r4 = new java.lang.String[r11]
            com.bytedance.ad.symphony.a.a.c r5 = r0.f69395b
            if (r5 == 0) goto L_0x0514
            java.lang.String r12 = r5.mo7237f()
            goto L_0x0515
        L_0x0514:
            r12 = 0
        L_0x0515:
            r4[r1] = r12
            java.util.List r4 = p2628d.p2629a.C52575l.m112101c(r4)
            r3.setUrlList(r4)
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r2, r3)
            r2 = 2132020995(0x7f140f03, float:1.9680369E38)
            android.view.View r3 = r0.mo53970a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r3
            java.lang.String r2 = "maskAdName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r2)
            com.bytedance.ad.symphony.a.a.c r2 = r0.f69395b
            if (r2 == 0) goto L_0x0538
            java.lang.String r12 = r2.mo7234c()
            goto L_0x0539
        L_0x0538:
            r12 = 0
        L_0x0539:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r3.setText(r12)
            com.bytedance.ad.symphony.a.a.c r2 = r0.f69395b
            if (r2 == 0) goto L_0x0570
            float r2 = r2.mo7239h()
            java.lang.Float r12 = java.lang.Float.valueOf(r2)
            r2 = r12
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 1082130432(0x40800000, float:4.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0559
            r2 = 1
            goto L_0x055a
        L_0x0559:
            r2 = 0
        L_0x055a:
            if (r2 == 0) goto L_0x055d
            goto L_0x055e
        L_0x055d:
            r12 = 0
        L_0x055e:
            if (r12 == 0) goto L_0x0570
            java.lang.Number r12 = (java.lang.Number) r12
            float r2 = r12.floatValue()
            android.view.View r3 = r0.mo53970a(r10)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r3 = (com.p683ss.android.ugc.aweme.commercialize.p1545ad.AdRatingView) r3
            r3.setRatingProgress(r2)
            goto L_0x057e
        L_0x0570:
            android.view.View r2 = r0.mo53970a(r10)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r2 = (com.p683ss.android.ugc.aweme.commercialize.p1545ad.AdRatingView) r2
            java.lang.String r3 = "maskAdRatingView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setVisibility(r6)
        L_0x057e:
            r2 = 2132021000(0x7f140f08, float:1.968038E38)
            android.view.View r2 = r0.mo53970a(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            java.lang.String r3 = "maskOthers"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            int r2 = r2.getChildCount()
            r3 = 2132020999(0x7f140f07, float:1.9680377E38)
            if (r2 != 0) goto L_0x05a3
            android.view.View r2 = r0.mo53970a(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.String r4 = "maskGroup"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            r2.setVisibility(r6)
        L_0x05a3:
            r2 = 2132020991(0x7f140eff, float:1.968036E38)
            android.view.View r4 = r0.mo53970a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
            java.lang.String r2 = "maskAdDescView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r2)
            com.bytedance.ad.symphony.a.a.c r2 = r0.f69395b
            if (r2 == 0) goto L_0x05ba
            java.lang.String r12 = r2.mo7235d()
            goto L_0x05bb
        L_0x05ba:
            r12 = 0
        L_0x05bb:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r4.setText(r12)
            r2 = 2132021001(0x7f140f09, float:1.9680381E38)
            android.view.View r2 = r0.mo53970a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r4 = "maskTagLabel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            java.lang.String r4 = r0.f69404k
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.setText(r4)
            r2 = 2132020992(0x7f140f00, float:1.9680363E38)
            android.view.View r2 = r0.mo53970a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r4 = "maskAdDownload"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            com.bytedance.ad.symphony.a.a.c r4 = r0.f69395b
            if (r4 == 0) goto L_0x05ec
            java.lang.String r12 = r4.mo7238g()
            goto L_0x05ed
        L_0x05ec:
            r12 = 0
        L_0x05ed:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r2.setText(r12)
            r2 = 2132020994(0x7f140f02, float:1.9680367E38)
            android.view.View r2 = r0.mo53970a(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$b r4 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView$b
            r4.<init>(r0)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r2.setOnClickListener(r4)
            boolean r2 = r17.m63667f()
            if (r2 == 0) goto L_0x061e
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f69401h
            if (r2 == 0) goto L_0x061e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x061e
            int r2 = r2.getNativeCardType()
            r4 = 5
            if (r2 != r4) goto L_0x061e
            r2 = 1
            goto L_0x061f
        L_0x061e:
            r2 = 0
        L_0x061f:
            if (r2 != 0) goto L_0x067f
            android.view.View r2 = r0.mo53970a(r7)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r2
            java.lang.String r4 = "maskAdIcon"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            r2.setVisibility(r6)
            r2 = 2132020995(0x7f140f03, float:1.9680369E38)
            android.view.View r2 = r0.mo53970a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r4 = "maskAdName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            r2.setVisibility(r6)
            android.view.View r2 = r0.mo53970a(r10)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r2 = (com.p683ss.android.ugc.aweme.commercialize.p1545ad.AdRatingView) r2
            java.lang.String r4 = "maskAdRatingView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            r2.setVisibility(r6)
            android.view.View r2 = r0.mo53970a(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.String r3 = "maskGroup"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setVisibility(r6)
            r2 = 2132020991(0x7f140eff, float:1.968036E38)
            android.view.View r2 = r0.mo53970a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r3 = "maskAdDescView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setVisibility(r6)
            r2 = 2132020998(0x7f140f06, float:1.9680375E38)
            android.view.View r2 = r0.mo53970a(r2)
            android.widget.Space r2 = (android.widget.Space) r2
            java.lang.String r3 = "maskDivide"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setVisibility(r6)
            goto L_0x06eb
        L_0x067f:
            android.view.View r2 = r0.mo53970a(r7)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r2
            java.lang.String r4 = "maskAdIcon"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            r2.setVisibility(r1)
            r2 = 2132020995(0x7f140f03, float:1.9680369E38)
            android.view.View r2 = r0.mo53970a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r4 = "maskAdName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            r2.setVisibility(r1)
            android.view.View r2 = r0.mo53970a(r10)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r2 = (com.p683ss.android.ugc.aweme.commercialize.p1545ad.AdRatingView) r2
            float r2 = r2.getRatingProgress()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x06bb
            android.view.View r2 = r0.mo53970a(r10)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r2 = (com.p683ss.android.ugc.aweme.commercialize.p1545ad.AdRatingView) r2
            java.lang.String r4 = "maskAdRatingView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            r2.setVisibility(r1)
        L_0x06bb:
            android.view.View r2 = r0.mo53970a(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.String r3 = "maskGroup"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setVisibility(r1)
            r2 = 2132020991(0x7f140eff, float:1.968036E38)
            android.view.View r2 = r0.mo53970a(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r3 = "maskAdDescView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setVisibility(r1)
            r2 = 2132020998(0x7f140f06, float:1.9680375E38)
            android.view.View r2 = r0.mo53970a(r2)
            android.widget.Space r2 = (android.widget.Space) r2
            java.lang.String r3 = "maskDivide"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r2.setVisibility(r1)
        L_0x06eb:
            android.content.Context r2 = r17.getContext()
            boolean r2 = r2 instanceof com.p683ss.android.ugc.aweme.main.MainActivity
            if (r2 == 0) goto L_0x0723
            android.content.Context r2 = r17.getContext()
            if (r2 == 0) goto L_0x071b
            com.ss.android.ugc.aweme.main.MainActivity r2 = (com.p683ss.android.ugc.aweme.main.MainActivity) r2
            com.ss.android.ugc.aweme.longvideo.feature.VolumeController r3 = new com.ss.android.ugc.aweme.longvideo.feature.VolumeController
            r4 = r2
            android.support.v4.app.FragmentActivity r4 = (android.support.p030v4.app.FragmentActivity) r4
            r5 = 2132017487(0x7f14014f, float:1.9673254E38)
            android.view.View r5 = r0.mo53970a(r5)
            com.ss.android.ugc.aweme.base.ui.AudioControlView r5 = (com.p683ss.android.ugc.aweme.base.p1420ui.AudioControlView) r5
            r3.<init>(r4, r5)
            r0.f69402i = r3
            com.ss.android.ugc.aweme.longvideo.feature.VolumeController r3 = r0.f69402i
            if (r3 != 0) goto L_0x0715
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0715:
            com.ss.android.ugc.aweme.base.activity.a r3 = (com.p683ss.android.ugc.aweme.base.activity.C23422a) r3
            r2.registerActivityOnKeyDownListener(r3)
            goto L_0x0723
        L_0x071b:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity"
            r1.<init>(r2)
            throw r1
        L_0x0723:
            r0.f69399f = r11
            r0.f69397d = r1
            r17.mo53101a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView.mo53971a(com.bytedance.ad.symphony.a.a.c, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, com.bytedance.ad.symphony.d.a.a, com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout$b, int):void");
    }
}
