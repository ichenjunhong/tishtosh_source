package com.p683ss.android.ugc.aweme.detail.p1628ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0636b;
import android.support.p030v4.app.C0643c;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.view.C1056u;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12200n;
import com.bytedance.lighten.p766a.C12202p;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.p769c.C12168c;
import com.bytedance.lighten.p766a.p769c.C12175j;
import com.bytedance.p125a.C2667b;
import com.bytedance.p125a.C2668c;
import com.p683ss.android.agilelogger.C18778a;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.activity.C23442u;
import com.p683ss.android.ugc.aweme.base.activity.C23442u.C23444b;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26446by;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.detail.C27338h;
import com.p683ss.android.ugc.aweme.detail.p1624f.C27334a;
import com.p683ss.android.ugc.aweme.feed.helper.C30360a;
import com.p683ss.android.ugc.aweme.feed.helper.C30398t;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1736ui.seekbar.C31124c;
import com.p683ss.android.ugc.aweme.feed.param.C30668a;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.feed.param.MobParamProvider;
import com.p683ss.android.ugc.aweme.feed.param.MobParamProvider.C30667a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.C36670n;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.main.p1937a.C36484a.C36485a;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p683ss.android.ugc.aweme.miniapp_api.C36918a;
import com.p683ss.android.ugc.aweme.p1386ar.C23261d;
import com.p683ss.android.ugc.aweme.p1402b.C23346d;
import com.p683ss.android.ugc.aweme.p1402b.C23351h;
import com.p683ss.android.ugc.aweme.push.C40884a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47859eq;
import com.p683ss.android.ugc.aweme.utils.C47893fn;
import com.p683ss.android.ugc.aweme.utils.p2390d.C47801c;
import com.p683ss.android.ugc.aweme.video.C48114q;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailActivity */
public class DetailActivity extends AmeSlideSSActivity implements C23346d, C27488ae, C36485a {

    /* renamed from: d */
    public static boolean f72254d = true;

    /* renamed from: k */
    public static HashSet<Integer> f72255k = new HashSet<>();

    /* renamed from: b */
    protected C27497g f72256b;

    /* renamed from: c */
    protected List<C23422a> f72257c;

    /* renamed from: e */
    public Aweme f72258e;

    /* renamed from: f */
    FrameLayout f72259f;

    /* renamed from: g */
    volatile boolean f72260g;

    /* renamed from: h */
    FrameLayout f72261h;

    /* renamed from: i */
    FrameLayout f72262i;

    /* renamed from: j */
    protected int f72263j;

    /* renamed from: l */
    private boolean f72264l;

    /* renamed from: m */
    private String f72265m = "";

    /* renamed from: n */
    private volatile boolean f72266n;

    /* renamed from: o */
    private C23261d f72267o = new C23261d();

    /* renamed from: p */
    private int f72268p = -1;

    /* renamed from: q */
    private String f72269q;

    /* renamed from: r */
    private C23351h f72270r;

    /* renamed from: s */
    private boolean f72271s = true;

    /* renamed from: c */
    public final int mo48563c() {
        return 0;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    @C53771m
    public void onVideoEvent(C30332aw awVar) {
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    public C36670n getHelper() {
        return this.f72256b.f72293b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C23351h getInflater() {
        if (this.f72270r == null) {
            this.f72270r = new C23351h(this);
        }
        return this.f72270r;
    }

    /* renamed from: b */
    public final boolean mo48562b() {
        if (!C48114q.m104226b()) {
            return true;
        }
        return false;
    }

    public Resources getResources() {
        C47859eq.m103530a(this, this.mFirstResumed);
        return super.getResources();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", true);
        if (C47859eq.m103531b(this)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", false);
            return;
        }
        super.onResume();
        C47893fn.m103596a(this);
        C27338h.m65875a(true);
        this.f72267o.mo48200a((Activity) this);
        C47859eq.m103529a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", false);
    }

    public void onPause() {
        super.onPause();
        this.f72267o.mo48199a();
        C27338h.m65875a(false);
        if (C2667b.f8109a && C2667b.f8110b.size() > 0) {
            for (C2668c cVar : C2667b.f8110b.values()) {
                cVar.f8120f = 2;
                cVar.f8122h = 2;
                cVar.f8121g = System.currentTimeMillis() - cVar.f8119e;
                C2667b.m7662a(cVar);
            }
            C2667b.f8110b.clear();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.f6);
        if (this.f72256b != null) {
            this.f72256b.mo55918h();
        }
        String stringExtra = getIntent().getStringExtra("video_from");
        if (C30398t.m71322b(this) || TextUtils.equals(stringExtra, "from_follow_page")) {
            if (!TextUtils.equals("from_mix_video", stringExtra)) {
                overridePendingTransition(R.anim.ew, R.anim.ex);
            }
        } else if (!C48121w.m104087I()) {
            C48121w.m104249M().mo95292y();
        } else {
            C50130a.m108170a().mo60216ag();
        }
        C36918a.m83054a(this);
        String stringExtra2 = getIntent().getStringExtra("back_to");
        if (!TextUtils.isEmpty(stringExtra2)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse(stringExtra2);
            if (C23057c.f61423a.equals(parse.getScheme())) {
                String str = C23057c.f61423a;
                StringBuilder sb = new StringBuilder(C23057c.f61424b);
                sb.append(C11010c.m22289j());
                parse = Uri.parse(stringExtra2.replaceFirst(str, sb.toString()));
            }
            intent.setData(parse);
            intent.setPackage(getPackageName());
            intent.addCategory("android.intent.category.BROWSABLE");
            startActivity(intent);
        } else {
            C40884a.m90455a(this);
        }
        getIntent().removeExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
        if (this.f72256b != null) {
            this.f72256b.mo55910a(!TextUtils.equals(stringExtra, "from_follow_page"), this.f72268p);
        }
    }

    public void onBackPressed() {
        if (C47801c.m103434c() || C47801c.m103435d()) {
            Intent intent = (Intent) getIntent().getParcelableExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
            if (!(intent == null || intent.resolveActivity(getPackageManager()) == null)) {
                startActivity(intent);
                finish();
                return;
            }
        }
        if (this.f72264l) {
            C26890h.m65011a("back", C23089d.m56640a().mo47829a("enter_from", "poi_video_leaderboard").mo47829a("previous_page", this.f72265m).f61491a);
        }
        try {
            if (this.f72257c != null) {
                for (C23422a onKeyDown : this.f72257c) {
                    if (onKeyDown.onKeyDown(4, null)) {
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (this.f72256b == null || !this.f72256b.isViewValid()) {
            C32458a.m75141a(6, "DetailActivity", "back when fragment is null!");
            super.onBackPressed();
        } else if (!this.f72256b.mo55917g()) {
            this.f72256b.mo55920j();
        }
        C47718bf.m103288a(new C30332aw(42));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r1.equals("from_hot") != false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r6 = this;
            super.onDestroy()
            r0 = 0
            r6.overridePendingTransition(r0, r0)
            com.ss.android.ugc.aweme.detail.ui.g r1 = r6.f72256b
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r2 = "video_from"
            java.lang.String r1 = r1.getStringExtra(r2)
            android.content.Intent r2 = r6.getIntent()
            if (r2 == 0) goto L_0x008c
            com.ss.android.ugc.aweme.detail.e.a r2 = com.p683ss.android.ugc.aweme.detail.p1623e.C27332a.f72080a
            boolean r2 = r2.mo55771a(r1)
            if (r2 == 0) goto L_0x008c
            int r2 = r6.f72263j
            r3 = -1
            if (r2 == r3) goto L_0x008c
            com.ss.android.ugc.aweme.detail.ui.g r2 = r6.f72256b
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.mo55919i()
            if (r2 == 0) goto L_0x008c
            int r4 = r1.hashCode()
            r5 = -1244334536(0xffffffffb5d4f638, float:-1.586689E-6)
            if (r4 == r5) goto L_0x004a
            r0 = 54656180(0x341fcb4, float:5.700769E-37)
            if (r4 == r0) goto L_0x0040
            goto L_0x0053
        L_0x0040:
            java.lang.String r0 = "from_nearby"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0053
            r0 = 1
            goto L_0x0054
        L_0x004a:
            java.lang.String r4 = "from_hot"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = -1
        L_0x0054:
            switch(r0) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            return
        L_0x0058:
            java.lang.String r0 = "homepage_fresh"
            goto L_0x005d
        L_0x005b:
            java.lang.String r0 = "homepage_hot"
        L_0x005d:
            com.ss.android.ugc.aweme.common.MobClick r1 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r3 = "feed_back"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r3)
            com.ss.android.ugc.aweme.common.MobClick r0 = r1.setLabelName(r0)
            com.ss.android.ugc.aweme.detail.ui.g r1 = r6.f72256b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.mo55919i()
            java.lang.String r1 = r1.getAid()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r1)
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r1 = com.p683ss.android.ugc.aweme.awemeservice.C23325e.m57379a()
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r1 = (com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r1
            int r3 = r6.f72263j
            org.json.JSONObject r1 = r1.getRequestIdAndOrderJsonObject(r2, r3)
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r0)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity.onDestroy():void");
    }

    public void unRegisterActivityOnKeyDownListener(C23422a aVar) {
        if (this.f72257c != null) {
            this.f72257c.remove(aVar);
        }
    }

    public void registerActivityOnKeyDownListener(C23422a aVar) {
        if (this.f72257c == null) {
            this.f72257c = new ArrayList();
        }
        if (!this.f72257c.contains(aVar)) {
            this.f72257c.add(aVar);
        }
    }

    public <T extends View> T findViewById(int i) {
        T findViewById = super.findViewById(i);
        if (findViewById != null || !f72255k.contains(Integer.valueOf(i))) {
            return findViewById;
        }
        StringBuilder sb = new StringBuilder("findViewById is null and id is ");
        sb.append(i);
        C18778a.m45848b("live_fragment_id", sb.toString());
        return super.findViewById(R.id.f0w);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C27497g mo55885a(C30669b bVar) {
        Bundle bundle;
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putSerializable("feed_param", bVar);
        C27497g gVar = new C27497g();
        gVar.setArguments(bundle);
        return gVar;
    }

    @C53771m
    public void onPlayerControllerRenderFirstFrameEvent(C31124c cVar) {
        if (this.f72271s) {
            this.f72271s = false;
            getInflater().mo48403a().mo48405a(R.layout.b5v).mo48405a(R.layout.b6q).mo48405a(R.layout.b6y).mo48405a(R.layout.b6r).mo48405a(R.layout.b7h).mo48405a(R.layout.b6o).mo48405a(R.layout.b6x).mo48405a(R.layout.b6_).mo48405a(R.layout.b7f).mo48405a(R.layout.b70).mo48405a(R.layout.b6p).mo48405a(R.layout.b5l).mo48407a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55886a(Bundle bundle) {
        this.f72263j = getIntent().getIntExtra("page_type", -1);
        this.f72269q = getIntent().getStringExtra("from_micro_app");
        if (TextUtils.isEmpty(this.f72269q) && getIntent().getData() != null) {
            this.f72269q = getIntent().getData().getQueryParameter("from");
        }
        C30669b a = C30668a.m71946a(this);
        HashMap logExtra = a.getLogExtra();
        C30667a aVar = MobParamProvider.f80147b;
        C52711k.m112240b(this, "context");
        C52711k.m112240b(logExtra, "param");
        C30667a.m71944b(this).f80148a.putAll(logExtra);
        if (!TextUtils.isEmpty(a.getAid()) || !TextUtils.isEmpty(a.getIds()) || !TextUtils.isEmpty(a.getPushParams()) || a.isHotSpot() || a.isShowVideoRank() || a.isShowPoiNews() || a.isSearchTopic() || a.isfollowSkyLight().booleanValue()) {
            String str = "DetailActivity";
            try {
                StringBuilder sb = new StringBuilder("enter detail page,param from:");
                sb.append(a.getFrom());
                sb.append(",eventType:");
                sb.append(a.getEventType());
                C32458a.m75141a(4, str, sb.toString());
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
            this.f72264l = a.isShowVideoRank();
            this.f72265m = a.getPreviousPage();
            if (!C27493d.m66096a(this, a, this.f72263j)) {
                String str2 = "detailFragment";
                C0654k supportFragmentManager = getSupportFragmentManager();
                C27497g gVar = (C27497g) supportFragmentManager.mo2224a(str2);
                C0679r a2 = supportFragmentManager.mo2225a();
                if (gVar != null) {
                    this.f72256b = gVar;
                } else {
                    this.f72256b = mo55885a(a);
                    a2.mo2192b(R.id.ajf, this.f72256b, str2);
                }
                C26446by.m63937a(getParent(), this.f72256b);
                a2.mo2196c(this.f72256b);
                a2.mo2189b();
                this.f72256b.setUserVisibleHint(true);
                try {
                    Intent intent = getIntent();
                    if (intent.getBooleanExtra("video_from_dcd", false)) {
                        C27334a aVar2 = new C27334a();
                        aVar2.f72083b = intent.getStringExtra("id");
                        aVar2.f72082a = "general_search";
                        aVar2.f72084c = ((LogPbBean) intent.getSerializableExtra("extra_log_pb")).getImprId();
                        aVar2.mo48076e();
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!(intent == null || intent.getData() == null)) {
            Uri data = intent.getData();
            StringBuilder sb = new StringBuilder();
            sb.append(data.getHost());
            sb.append(data.getPath());
            if (TextUtils.equals("user/video", sb.toString())) {
                intent.putExtra("enter_from", "push");
                intent.putExtra("refer", "push");
                intent.putExtra("id", data.getQueryParameter("id"));
                intent.putExtra("cid", data.getQueryParameter("commentId"));
            }
        }
        getWindow().setSoftInputMode(48);
        setContentView((int) R.layout.b8m);
        getInflater().mo48403a().mo48405a(R.layout.b8s).mo48405a(C25280a.m61493a().providerInputLayoutIdForPreLoad()).mo48407a();
        this.f72262i = (FrameLayout) findViewById(R.id.a4z);
        this.f72261h = (FrameLayout) findViewById(R.id.ajf);
        this.f72259f = (FrameLayout) findViewById(R.id.e9j);
        this.f72262i.setBackground(null);
        mo55886a(bundle);
        if (!C27492c.m66095a(this)) {
            finish();
            C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
        }
        try {
            if (VERSION.SDK_INT >= 21) {
                getWindow().addFlags(DynamicTabYellowPointVersion.DEFAULT);
                getWindow().setNavigationBarColor(-16777216);
            }
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
        }
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            this.f72268p = getIntent().getExtras().getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", -1);
        }
        if (this.f62479a != null) {
            C23442u uVar = this.f62479a;
            C274761 r3 = new C23444b() {
                /* renamed from: a */
                public final void mo48610a() {
                    DetailActivity.this.f72258e = AwemeChangeCallBack.m82601a(DetailActivity.this);
                    if (DetailActivity.this.f72258e != null) {
                        C47718bf.m103288a(new C30332aw(21, DetailActivity.this.f72258e));
                    }
                }
            };
            C52711k.m112240b(r3, "listener");
            uVar.f62512c = r3;
        }
        if (VERSION.SDK_INT >= 21) {
            Intent intent2 = getIntent();
            if (intent2 != null && intent2.getBooleanExtra("video_cover_transition", false)) {
                Aweme awemeById = C23324d.m57378a().getAwemeById(intent2.getStringExtra("id"));
                if (awemeById == null || awemeById.getVideo() == null || awemeById.getVideo().getCover() == null || C9376b.m18558a((Collection<T>) awemeById.getVideo().getCover().getUrlList())) {
                    z = false;
                } else {
                    this.f72259f.setVisibility(0);
                    C30360a aVar = new C30360a();
                    C30360a.m71256a(this);
                    LayoutParams layoutParams = (LayoutParams) this.f72259f.getLayoutParams();
                    layoutParams.topMargin = C30360a.m71255a();
                    layoutParams.bottomMargin = C22453b.m55505a().mo46745b();
                    this.f72259f.setLayoutParams(layoutParams);
                    SmartImageView smartImageView = new SmartImageView(this);
                    this.f72259f.addView(smartImageView, new LayoutParams(-1, -1, 17));
                    aVar.mo60787a((Context) this, awemeById.getVideo(), (View) null, (View) smartImageView, awemeById.getOcrLocation());
                    C1056u.m3036a((View) smartImageView, "video_cover_transition");
                    C12203q.m24645a((Object) C23608p.m57874a(awemeById.getVideo().getCover())).mo23117a(C12202p.HIGH).mo23118a("DetailActivity").mo23116a((C12197k) smartImageView).mo23122a((C12175j) new C12168c() {
                        /* renamed from: a */
                        public final void mo23095a(Uri uri, View view, Throwable th) {
                            C0636b.m1721c(DetailActivity.this);
                        }

                        /* renamed from: a */
                        public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
                            C0636b.m1721c(DetailActivity.this);
                        }
                    });
                    z = true;
                }
                if (z) {
                    this.f72266n = true;
                    C0636b.m1720b(this);
                    AutoTransition autoTransition = new AutoTransition();
                    autoTransition.addListener(new C27483a() {
                        public final void onTransitionEnd(Transition transition) {
                            super.onTransitionEnd(transition);
                            DetailActivity detailActivity = DetailActivity.this;
                            if (!detailActivity.f72260g) {
                                detailActivity.f72260g = true;
                                C47718bf.m103289b(new C27494e(detailActivity.hashCode(), 1));
                                detailActivity.f72259f.animate().alpha(0.0f).withEndAction(new C27491b(detailActivity)).setDuration(50).start();
                            }
                        }
                    });
                    getWindow().setSharedElementEnterTransition(autoTransition);
                }
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onCreate", false);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f72257c != null) {
            for (C23422a onKeyDown : this.f72257c) {
                if (onKeyDown.onKeyDown(i, keyEvent)) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    public static void m66078a(Context context, Intent intent, View view) {
        if (view == null) {
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                context.startActivity(intent);
            }
        } else {
            C0636b.m2094a(context, intent, C0643c.m1729b(view, 0, 0, view.getWidth(), view.getHeight()).mo2171a());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }

    /* renamed from: a */
    public static void m66079a(Context context, String str, String str2, String str3, int i, int i2, String str4, View view) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("id", str);
        intent.putExtra("refer", str2);
        intent.putExtra("video_from", str3);
        intent.putExtra("profile_enterprise_type", i);
        intent.putExtra("page_type", i2);
        if (str4 != null) {
            intent.putExtra("userid", str4);
        }
        m66078a(context, intent, view);
    }
}
