package com.p683ss.android.ugc.aweme.commercialize.widget;

import android.graphics.Bitmap.Config;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12159b;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.bytedance.lighten.p766a.p767a.C12156a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26407ay;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26514h;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26542y;
import com.p683ss.android.ugc.aweme.commercialize.utils.ViewWrapper;
import com.p683ss.android.ugc.aweme.commercialize.views.C26682c;
import com.p683ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget.C26810a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget */
public final class AdFakeUserProfileVideoPlayWidget extends AbsAdProfileWidget implements C38871j {

    /* renamed from: j */
    static final /* synthetic */ C52767h[] f70609j = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdFakeUserProfileVideoPlayWidget.class), "mVideoCoverContainer", "getMVideoCoverContainer()Lcom/bytedance/lighten/loader/SmartImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdFakeUserProfileVideoPlayWidget.class), "mVideoContainer", "getMVideoContainer()Landroid/view/ViewGroup;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdFakeUserProfileVideoPlayWidget.class), "mVideoPlayIcon", "getMVideoPlayIcon()Landroid/widget/ImageView;"))};

    /* renamed from: l */
    public static final C26797a f70610l = new C26797a(null);

    /* renamed from: k */
    public C26682c f70611k;

    /* renamed from: m */
    private final C52668f f70612m = C52732g.m112285a(new C26801e(this));

    /* renamed from: n */
    private final C52668f f70613n = C52732g.m112285a(new C26800d(this));

    /* renamed from: o */
    private final C52668f f70614o = C52732g.m112285a(new C26802f(this));

    /* renamed from: p */
    private boolean f70615p;

    /* renamed from: q */
    private C26407ay f70616q = new C26407ay();

    /* renamed from: r */
    private boolean f70617r;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget$a */
    public static final class C26797a {
        private C26797a() {
        }

        public /* synthetic */ C26797a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget$b */
    static final class C26798b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f70618a;

        C26798b(ImageView imageView) {
            this.f70618a = imageView;
        }

        public final void run() {
            this.f70618a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget$c */
    static final class C26799c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoPlayWidget f70619a;

        /* renamed from: b */
        final /* synthetic */ Video f70620b;

        C26799c(AdFakeUserProfileVideoPlayWidget adFakeUserProfileVideoPlayWidget, Video video) {
            this.f70619a = adFakeUserProfileVideoPlayWidget;
            this.f70620b = video;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26682c cVar = this.f70619a.f70611k;
            if (cVar != null) {
                if (cVar.mo54497a() == 3) {
                    cVar.mo54500c();
                    this.f70619a.mo54702e();
                } else {
                    cVar.mo54501d();
                    ImageView d = this.f70619a.mo54701d();
                    if (d != null) {
                        d.setAlpha(0.0f);
                        d.setScaleX(2.5f);
                        d.setScaleY(2.5f);
                        d.setVisibility(0);
                        d.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget$d */
    static final class C26800d extends C52712l implements C52670a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoPlayWidget f70621a;

        C26800d(AdFakeUserProfileVideoPlayWidget adFakeUserProfileVideoPlayWidget) {
            this.f70621a = adFakeUserProfileVideoPlayWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ViewGroup) this.f70621a.mo54695a((int) R.id.doz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget$e */
    static final class C26801e extends C52712l implements C52670a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoPlayWidget f70622a;

        C26801e(AdFakeUserProfileVideoPlayWidget adFakeUserProfileVideoPlayWidget) {
            this.f70622a = adFakeUserProfileVideoPlayWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SmartImageView) this.f70622a.mo54695a((int) R.id.dp2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget$f */
    static final class C26802f extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ AdFakeUserProfileVideoPlayWidget f70623a;

        C26802f(AdFakeUserProfileVideoPlayWidget adFakeUserProfileVideoPlayWidget) {
            this.f70623a = adFakeUserProfileVideoPlayWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f70623a.mo54695a((int) R.id.f6w);
        }
    }

    /* renamed from: f */
    private final ViewGroup m64775f() {
        return (ViewGroup) this.f70613n.getValue();
    }

    /* renamed from: a */
    public final void mo53523a(float f) {
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
    }

    /* renamed from: a */
    public final void mo53528a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo53529a(boolean z) {
    }

    /* renamed from: b */
    public final void mo53530b(C50112d dVar) {
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final ImageView mo54701d() {
        return (ImageView) this.f70614o.getValue();
    }

    /* renamed from: d */
    public final void mo53534d(String str) {
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
    }

    public final void onCreate() {
        super.onCreate();
        C47718bf.m103290c(this);
    }

    public final void onPause() {
        super.onPause();
        if (this.f70615p) {
            C26682c cVar = this.f70611k;
            if (cVar != null) {
                cVar.mo54501d();
            }
            mo54702e();
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f70615p && !this.f70617r) {
            C26682c cVar = this.f70611k;
            if (cVar != null) {
                cVar.mo54502e();
            }
        }
    }

    /* renamed from: e */
    public final void mo54702e() {
        ImageView d = mo54701d();
        if (d != null) {
            d.animate().alpha(0.0f).scaleX(2.5f).scaleY(2.5f).withEndAction(new C26798b(d)).setDuration(100).start();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C47718bf.m103291d(this);
        C26682c cVar = this.f70611k;
        if (cVar != null) {
            if (cVar.f70302e.mo95287b((C38871j) cVar)) {
                C26542y yVar = cVar.f70301d;
                if (yVar.f69883f != null && yVar.f69883f.mo95287b(yVar.f69881d)) {
                    yVar.f69883f.mo95284a((C38871j) null);
                }
            }
            cVar.f70300c.mo97920b((C50161j) cVar.f70304g);
            cVar.f70298a.clear();
            try {
                cVar.f70302e.mo95267D();
                cVar.f70302e.mo95264A();
            } catch (Throwable unused) {
            }
        }
        C26077e.m63190a().mo53582a("homepage_ad").mo53593b("play_break").mo53573a(this.f70616q.f69653a).mo53590b(this.f70586a).mo53586a(this.f62235b);
    }

    @C53771m
    public final void onAdPopupWebPageEvent(C26810a aVar) {
        C52711k.m112240b(aVar, "event");
        this.f70617r = aVar.f70643a;
        if (this.f70617r) {
            C26682c cVar = this.f70611k;
            if (cVar != null) {
                cVar.mo54501d();
            }
        } else if (this.f70615p) {
            C26682c cVar2 = this.f70611k;
            if (cVar2 != null) {
                cVar2.mo54500c();
            }
        }
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        C26682c cVar = this.f70611k;
        if (cVar != null) {
            C48121w wVar = cVar.f70302e;
            if (wVar != null) {
                ViewGroup f = m64775f();
                if (f != null) {
                    m64774a(f, wVar.mo95254l(), wVar.mo95255m());
                }
            }
        }
        this.f70616q.mo54123a();
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        C26077e.m63190a().mo53582a("homepage_ad").mo53593b("pause").mo53590b(this.f70586a).mo53586a(this.f62235b);
        C26407ay ayVar = this.f70616q;
        if (ayVar.f69656d) {
            ayVar.f69656d = false;
            ayVar.f69655c = System.currentTimeMillis();
            if (ayVar.f69655c > 0 && ayVar.f69654b > 0 && ayVar.f69655c - ayVar.f69654b > 0) {
                ayVar.f69653a += ayVar.f69655c - ayVar.f69654b;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo54697c(boolean z) {
        int i;
        super.mo54697c(z);
        this.f70615p = z;
        C48021h hVar = (C48021h) C26514h.f69837a.get();
        if (hVar != null) {
            C48021h hVar2 = (C48021h) C26514h.f69838b.get();
            if (hVar2 != null) {
                long i2 = hVar.mo95251i();
                if (i2 > 0 && z) {
                    hVar2.mo95279a((((float) (hVar.mo95256n() - 1000)) * 100.0f) / ((float) i2));
                }
            }
        }
        if (z) {
            C26682c cVar = this.f70611k;
            if (cVar == null || cVar.mo54497a() != 0) {
                C26682c cVar2 = this.f70611k;
                if (cVar2 != null) {
                    cVar2.mo54500c();
                }
            } else {
                C48021h hVar3 = (C48021h) C26514h.f69837a.get();
                if (hVar3 != null) {
                    i = (int) hVar3.mo95256n();
                } else {
                    i = 0;
                }
                C26682c cVar3 = this.f70611k;
                if (cVar3 != null) {
                    cVar3.mo54498a(i);
                }
            }
        } else {
            C26682c cVar4 = this.f70611k;
            if (cVar4 != null) {
                cVar4.mo54501d();
            }
            mo54702e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54696a(C26818c cVar) {
        C52711k.m112240b(cVar, "params");
        super.mo54696a(cVar);
        Aweme aweme = this.f70586a;
        if (aweme != null) {
            Video video = aweme.getVideo();
            if (video != null) {
                UrlModel cover = video.getCover();
                if (cover != null) {
                    List urlList = cover.getUrlList();
                    if (urlList != null && (!urlList.isEmpty())) {
                        UrlModel cover2 = video.getCover();
                        C52711k.m112236a((Object) cover2, "video.cover");
                        C12208t a = C12203q.m24643a(new C12156a(cover2.getUrlList()));
                        a.f32261x = new C12159b(25);
                        a.mo23113a(Config.ARGB_8888).mo23116a((C12197k) (SmartImageView) this.f70612m.getValue()).mo23121a();
                    }
                }
                ViewGroup f = m64775f();
                if (f != null) {
                    m64774a(f, video.getWidth(), video.getHeight());
                    this.f70611k = new C26682c(f, this.f70586a);
                    C26682c cVar2 = this.f70611k;
                    if (cVar2 != null) {
                        cVar2.f70303f = false;
                    }
                    C26682c cVar3 = this.f70611k;
                    if (cVar3 != null) {
                        C38871j jVar = this;
                        if (!cVar3.f70298a.contains(jVar)) {
                            cVar3.f70298a.add(jVar);
                        }
                    }
                    C26682c cVar4 = this.f70611k;
                    if (cVar4 != null) {
                        C48121w wVar = cVar4.f70302e;
                        if (wVar != null) {
                            C26514h.f69838b = new WeakReference<>(wVar);
                        }
                    }
                    View view = this.f62237d;
                    if (view != null) {
                        view.setOnClickListener(new C26799c(this, video));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        C26077e.m63190a().mo53582a("homepage_ad").mo53593b("resume").mo53590b(this.f70586a).mo53586a(this.f62235b);
        this.f70616q.mo54123a();
    }

    /* renamed from: a */
    private final void m64774a(View view, int i, int i2) {
        if (i > 0 && i2 > 0) {
            ViewWrapper viewWrapper = new ViewWrapper(view);
            viewWrapper.setWidth(C9432q.m18670a(this.f62235b));
            viewWrapper.setHeight((int) ((((float) viewWrapper.getWidth()) * ((float) i2)) / ((float) i)));
            DataCenter dataCenter = this.f62238e;
            if (dataCenter != null) {
                dataCenter.mo48228a("ON_VIDEO_CONTAINER_SIZE_CHANGE", (Object) null);
            }
        }
    }
}
