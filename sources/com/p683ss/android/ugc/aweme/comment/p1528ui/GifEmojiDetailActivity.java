package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29367a;
import com.p683ss.android.ugc.aweme.emoji.p1688g.C29368b;
import com.p683ss.android.ugc.aweme.emoji.utils.C29478h;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity */
public final class GifEmojiDetailActivity extends AmeSSActivity implements C29367a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f66936a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GifEmojiDetailActivity.class), "mStatusBar", "getMStatusBar()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GifEmojiDetailActivity.class), "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GifEmojiDetailActivity.class), "mTitleBar", "getMTitleBar()Lcom/bytedance/ies/dmt/ui/titlebar/TextTitleBar;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GifEmojiDetailActivity.class), "mImage", "getMImage()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GifEmojiDetailActivity.class), "mAction", "getMAction()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GifEmojiDetailActivity.class), "mMaxSize", "getMMaxSize()I"))};

    /* renamed from: b */
    public static final C25308a f66937b = new C25308a(null);

    /* renamed from: c */
    private C29366a f66938c;

    /* renamed from: d */
    private final C52668f f66939d = C52732g.m112286a(C52757k.NONE, new C25314g(this));

    /* renamed from: e */
    private final C52668f f66940e = C52732g.m112286a(C52757k.NONE, new C25315h(this));

    /* renamed from: f */
    private final C52668f f66941f = C52732g.m112286a(C52757k.NONE, new C25316i(this));

    /* renamed from: g */
    private final C52668f f66942g = C52732g.m112286a(C52757k.NONE, new C25312e(this));

    /* renamed from: h */
    private final C52668f f66943h = C52732g.m112286a(C52757k.NONE, new C25311d(this));

    /* renamed from: i */
    private final C52668f f66944i = C52732g.m112286a(C52757k.NONE, new C25313f(this));

    /* renamed from: j */
    private C1690c f66945j;

    /* renamed from: k */
    private boolean f66946k;

    /* renamed from: l */
    private HashMap f66947l;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$a */
    public static final class C25308a {
        private C25308a() {
        }

        public /* synthetic */ C25308a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$b */
    public static final class C25309b implements C10713a {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f66948a;

        /* renamed from: b */
        public final void mo19167b(View view) {
            C52711k.m112240b(view, "view");
        }

        C25309b(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f66948a = gifEmojiDetailActivity;
        }

        /* renamed from: a */
        public final void mo19166a(View view) {
            C52711k.m112240b(view, "view");
            this.f66948a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$c */
    static final class C25310c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f66949a;

        C25310c(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f66949a = gifEmojiDetailActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            GifEmojiDetailActivity gifEmojiDetailActivity = this.f66949a;
            C52711k.m112236a((Object) view, "it");
            gifEmojiDetailActivity.toggleCollectState(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$d */
    static final class C25311d extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f66950a;

        C25311d(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f66950a = gifEmojiDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f66950a.mo51835a((int) R.id.a2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$e */
    static final class C25312e extends C52712l implements C52670a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f66951a;

        C25312e(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f66951a = gifEmojiDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RemoteImageView) this.f66951a.mo51835a((int) R.id.ar5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$f */
    static final class C25313f extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f66952a;

        C25313f(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f66952a = gifEmojiDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf((int) (((float) C9432q.m18670a((Context) this.f66952a)) - (C9432q.m18687b((Context) this.f66952a, 32.0f) * 2.0f)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$g */
    static final class C25314g extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f66953a;

        C25314g(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f66953a = gifEmojiDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f66953a.mo51835a((int) R.id.csm);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$h */
    static final class C25315h extends C52712l implements C52670a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f66954a;

        C25315h(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f66954a = gifEmojiDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtStatusView) this.f66954a.mo51835a((int) R.id.csv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$i */
    static final class C25316i extends C52712l implements C52670a<TextTitleBar> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f66955a;

        C25316i(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f66955a = gifEmojiDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextTitleBar) this.f66955a.mo51835a((int) R.id.d10);
        }
    }

    /* renamed from: a */
    private final DmtStatusView m61558a() {
        return (DmtStatusView) this.f66940e.getValue();
    }

    /* renamed from: b */
    private final TextTitleBar m61560b() {
        return (TextTitleBar) this.f66941f.getValue();
    }

    /* renamed from: c */
    private final DmtTextView m61561c() {
        return (DmtTextView) this.f66943h.getValue();
    }

    /* renamed from: d */
    private final int m61562d() {
        return ((Number) this.f66944i.getValue()).intValue();
    }

    /* renamed from: a */
    public final View mo51835a(int i) {
        if (this.f66947l == null) {
            this.f66947l = new HashMap();
        }
        View view = (View) this.f66947l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f66947l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo51836a(List<C29366a> list, C29366a aVar, boolean z, String str) {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    public final void onDestroy() {
        super.onDestroy();
        C1690c cVar = this.f66945j;
        if (cVar != null) {
            cVar.dispose();
        }
        C29368b.m69241a().mo59393b((C29367a) this);
    }

    /* renamed from: a */
    private final void m61559a(boolean z) {
        int i;
        if (this.f66946k ^ z) {
            DmtTextView c = m61561c();
            if (z) {
                i = R.string.axl;
            } else {
                i = R.string.ax6;
            }
            c.setText(i);
            this.f66946k = z;
        }
    }

    public final void toggleCollectState(View view) {
        if (!C32800a.m75679a(view)) {
            C29366a aVar = this.f66938c;
            if (aVar != null) {
                m61558a().mo19212f();
                if (this.f66946k) {
                    C29368b.m69241a().mo59388a(aVar);
                } else {
                    UrlModel animateUrl = aVar.getAnimateUrl();
                    C29368b a = C29368b.m69241a();
                    long id = aVar.getId();
                    C52711k.m112236a((Object) animateUrl, "urlModel");
                    String uri = animateUrl.getUri();
                    List urlList = animateUrl.getUrlList();
                    C52711k.m112236a((Object) urlList, "urlModel.urlList");
                    a.mo59383a(id, uri, (String) C52575l.m112137e(urlList), aVar.getResourcesId(), aVar.getStickerType());
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        Object obj;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b1e);
        Serializable serializableExtra = getIntent().getSerializableExtra("gif_emoji");
        if (!(serializableExtra instanceof C29366a)) {
            serializableExtra = null;
        }
        this.f66938c = (C29366a) serializableExtra;
        C29366a aVar = this.f66938c;
        if (aVar != null && aVar.getId() <= 0) {
            C29368b a = C29368b.m69241a();
            C52711k.m112236a((Object) a, "SelfEmojiModel.inst()");
            List c = a.mo59394c();
            C52711k.m112236a((Object) c, "SelfEmojiModel.inst().cacheEmojiList");
            Iterator it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C52711k.m112239a((Object) (C29366a) obj, (Object) this.f66938c)) {
                    break;
                }
            }
            C29366a aVar2 = (C29366a) obj;
            if (aVar2 == null) {
                aVar2 = this.f66938c;
            }
            this.f66938c = aVar2;
        }
        if (VERSION.SDK_INT >= 19) {
            View view = (View) this.f66939d.getValue();
            C52711k.m112236a((Object) view, "mStatusBar");
            view.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        m61558a().setBuilder(C10719a.m21676a((Context) this));
        m61560b().setTitle((int) R.string.axa);
        m61560b().setOnTitleBarClickListener(new C25309b(this));
        m61561c().setOnClickListener(new C25310c(this));
        m61559a(C29368b.m69241a().mo59389a(this.f66938c));
        C29366a aVar3 = this.f66938c;
        if (aVar3 != null) {
            UrlModel animateUrl = aVar3.getAnimateUrl();
            if (animateUrl != null) {
                int d = m61562d();
                int d2 = m61562d();
                if (animateUrl.getWidth() > animateUrl.getHeight()) {
                    d2 = (animateUrl.getHeight() * d) / animateUrl.getWidth();
                } else if (animateUrl.getHeight() > animateUrl.getWidth()) {
                    d = (animateUrl.getWidth() * d2) / animateUrl.getHeight();
                }
                C29478h.m69559a((RemoteImageView) this.f66942g.getValue(), animateUrl, d, d2, null, true);
            }
        }
        C29368b.m69241a().mo59384a((C29367a) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo51838b(List<C29366a> list, boolean z, String str) {
        m61558a().mo19209d();
        if (z) {
            m61559a(false);
        }
    }

    /* renamed from: a */
    public final void mo51837a(List<C29366a> list, boolean z, String str) {
        m61558a().mo19209d();
        if (z || C52711k.m112239a((Object) str, (Object) getString(R.string.ax7))) {
            m61559a(true);
            if (list != null) {
                C29366a aVar = (C29366a) C52575l.m112140f(list);
                if (aVar != null) {
                    this.f66938c = aVar;
                }
            }
        }
    }
}
