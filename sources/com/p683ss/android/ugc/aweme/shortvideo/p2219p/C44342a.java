package com.p683ss.android.ugc.aweme.shortvideo.p2219p;

import android.support.p043v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.filter.C31384a;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24430a;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24438g;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24439h;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24441j;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24442k;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24443l;
import com.p683ss.android.ugc.aweme.p1484bx.C24453c;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39532c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.p.a */
public final class C44342a implements OnClickListener {

    /* renamed from: A */
    private static final int f112213A = 1;

    /* renamed from: B */
    private static final int f112214B = 2;

    /* renamed from: s */
    public static final C44343a f112215s = new C44343a(null);

    /* renamed from: a */
    public AppCompatActivity f112216a;

    /* renamed from: b */
    public FrameLayout f112217b;

    /* renamed from: c */
    public C23441t f112218c;

    /* renamed from: d */
    public List<String> f112219d;

    /* renamed from: e */
    public C24438g f112220e;

    /* renamed from: f */
    public C39532c f112221f;

    /* renamed from: g */
    public C24443l f112222g;

    /* renamed from: h */
    public boolean f112223h;

    /* renamed from: i */
    public C44344b f112224i;

    /* renamed from: j */
    public boolean f112225j;

    /* renamed from: k */
    public boolean f112226k;

    /* renamed from: l */
    public View f112227l;

    /* renamed from: m */
    public C24458h f112228m;

    /* renamed from: n */
    public ViewGroup f112229n;

    /* renamed from: o */
    public C24442k f112230o;

    /* renamed from: p */
    public C24441j f112231p;

    /* renamed from: q */
    public C20347c f112232q;

    /* renamed from: r */
    public C42482c f112233r;

    /* renamed from: t */
    private final C23422a f112234t = new C44349g(this);

    /* renamed from: u */
    private AVDmtTextView f112235u;

    /* renamed from: v */
    private AVDmtTextView f112236v;

    /* renamed from: w */
    private RelativeLayout f112237w;

    /* renamed from: x */
    private C31384a f112238x;

    /* renamed from: y */
    private int f112239y;

    /* renamed from: z */
    private FrameLayout f112240z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.a$a */
    public static final class C44343a {
        private C44343a() {
        }

        public /* synthetic */ C44343a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.a$b */
    public interface C44344b {
        /* renamed from: a */
        void mo90212a();

        /* renamed from: a */
        void mo90213a(String str, C42482c cVar, boolean z);

        /* renamed from: b */
        void mo90214b();

        /* renamed from: c */
        void mo90215c();

        /* renamed from: d */
        void mo90216d();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.a$c */
    public static final class C44345c extends C24459a {

        /* renamed from: a */
        final /* synthetic */ C44342a f112241a;

        /* renamed from: a */
        public final void mo50217a() {
            this.f112241a.f112225j = true;
            C24458h hVar = this.f112241a.f112228m;
            if (hVar != null) {
                hVar.mo50217a();
            }
        }

        /* renamed from: d */
        public final void mo50225d() {
            this.f112241a.f112225j = false;
            C24458h hVar = this.f112241a.f112228m;
            if (hVar != null) {
                hVar.mo50225d();
            }
        }

        /* renamed from: b */
        public final void mo50221b() {
            C39532c cVar = this.f112241a.f112221f;
            if (cVar != null) {
                cVar.mo80603a(true);
            }
            C24458h hVar = this.f112241a.f112228m;
            if (hVar != null) {
                hVar.mo50221b();
            }
        }

        /* renamed from: c */
        public final void mo50224c() {
            C24458h hVar = this.f112241a.f112228m;
            if (hVar != null) {
                hVar.mo50224c();
            }
            C39532c cVar = this.f112241a.f112221f;
            if (cVar != null) {
                cVar.mo80594a();
            }
        }

        C44345c(C44342a aVar) {
            this.f112241a = aVar;
        }

        /* renamed from: b */
        public final void mo50222b(float f, int i, int i2) {
            C24458h hVar = this.f112241a.f112228m;
            if (hVar != null) {
                hVar.mo50222b(f, i, i2);
            }
        }

        /* renamed from: a */
        public final void mo50218a(float f, int i, int i2) {
            C24458h hVar = this.f112241a.f112228m;
            if (hVar != null) {
                hVar.mo50218a(f, i, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.a$d */
    static final class C44346d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44342a f112242a;

        C44346d(C44342a aVar) {
            this.f112242a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f112242a.mo90209c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.a$e */
    public static final class C44347e implements C24430a {

        /* renamed from: a */
        final /* synthetic */ C44342a f112243a;

        /* renamed from: a */
        public final void mo50186a() {
            this.f112243a.mo90209c();
        }

        /* renamed from: b */
        public final boolean mo50187b() {
            return this.f112243a.f112223h;
        }

        C44347e(C44342a aVar) {
            this.f112243a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.a$f */
    public static final class C44348f implements C24439h {

        /* renamed from: a */
        final /* synthetic */ C44342a f112244a;

        /* renamed from: a */
        public final void mo50203a() {
            C44344b bVar = this.f112244a.f112224i;
            if (bVar != null) {
                bVar.mo90212a();
            }
        }

        /* renamed from: b */
        public final void mo50205b() {
            C44344b bVar = this.f112244a.f112224i;
            if (bVar != null) {
                bVar.mo90216d();
            }
        }

        C44348f(C44342a aVar) {
            this.f112244a = aVar;
        }

        /* renamed from: a */
        public final void mo50204a(String str, C42482c cVar, boolean z) {
            C44344b bVar = this.f112244a.f112224i;
            if (bVar != null) {
                bVar.mo90213a(str, cVar, z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.a$g */
    static final class C44349g implements C23422a {

        /* renamed from: a */
        final /* synthetic */ C44342a f112245a;

        C44349g(C44342a aVar) {
            this.f112245a = aVar;
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f112245a.mo90209c();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.a$h */
    public static final class C44350h extends C24453c {

        /* renamed from: a */
        final /* synthetic */ C44342a f112246a;

        /* renamed from: a */
        public final void mo50217a() {
            View view = this.f112246a.f112227l;
            if (view != null) {
                view.setVisibility(0);
            }
            super.mo50217a();
        }

        C44350h(C44342a aVar) {
            this.f112246a = aVar;
        }
    }

    /* renamed from: a */
    public static int m97120a() {
        Integer b = C39630m.m88234a().mo58604b().mo80585g().mo80587a().mo50197b();
        if (b != null) {
            return b.intValue();
        }
        return 0;
    }

    /* renamed from: c */
    public final void mo90209c() {
        C31384a aVar = this.f112238x;
        if (aVar != null) {
            aVar.mo50223b(new C24453c());
        }
        C23441t tVar = this.f112218c;
        if (tVar != null) {
            tVar.mo48606b(this.f112234t);
        }
    }

    /* renamed from: d */
    public final int mo90210d() {
        if (this.f112221f == null) {
            return 0;
        }
        C39532c cVar = this.f112221f;
        if (cVar == null) {
            C52711k.m112234a();
        }
        return cVar.mo80609d();
    }

    /* renamed from: b */
    public final void mo90208b() {
        int i;
        FrameLayout frameLayout = this.f112217b;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            AppCompatActivity appCompatActivity = this.f112216a;
            if (appCompatActivity == null) {
                C52711k.m112237a("mActivity");
            }
            if (this.f112227l == null) {
                LayoutInflater from = LayoutInflater.from(appCompatActivity);
                if (C44351b.m97144a() == 0) {
                    i = R.layout.g9;
                } else {
                    i = R.layout.g_;
                }
                this.f112227l = from.inflate(i, frameLayout, false);
                View view = this.f112227l;
                if (view == null) {
                    C52711k.m112234a();
                }
                this.f112237w = (RelativeLayout) view.findViewById(R.id.bo4);
                View view2 = this.f112227l;
                if (view2 == null) {
                    C52711k.m112234a();
                }
                view2.findViewById(R.id.bov).setOnClickListener(new C44346d(this));
                View view3 = this.f112227l;
                if (view3 == null) {
                    C52711k.m112234a();
                }
                this.f112236v = (AVDmtTextView) view3.findViewById(R.id.div);
                View view4 = this.f112227l;
                if (view4 == null) {
                    C52711k.m112234a();
                }
                this.f112235u = (AVDmtTextView) view4.findViewById(R.id.dj0);
                View view5 = this.f112227l;
                if (view5 == null) {
                    C52711k.m112234a();
                }
                this.f112229n = (ViewGroup) view5.findViewById(R.id.bew);
                View view6 = this.f112227l;
                if (view6 == null) {
                    C52711k.m112234a();
                }
                this.f112240z = (FrameLayout) view6.findViewById(R.id.ce_);
                AVDmtTextView aVDmtTextView = this.f112235u;
                if (aVDmtTextView == null) {
                    C52711k.m112234a();
                }
                OnClickListener onClickListener = this;
                aVDmtTextView.setOnClickListener(onClickListener);
                AVDmtTextView aVDmtTextView2 = this.f112236v;
                if (aVDmtTextView2 == null) {
                    C52711k.m112234a();
                }
                aVDmtTextView2.setOnClickListener(onClickListener);
                C39529ab b = C39630m.m88234a().mo58604b();
                AppCompatActivity appCompatActivity2 = this.f112216a;
                if (appCompatActivity2 == null) {
                    C52711k.m112237a("mActivity");
                }
                this.f112221f = b.mo80560a(appCompatActivity2, this.f112232q, (C24430a) new C44347e(this));
                C39532c cVar = this.f112221f;
                if (cVar != null) {
                    cVar.mo80602a(this.f112219d);
                }
                C39532c cVar2 = this.f112221f;
                if (cVar2 != null) {
                    AppCompatActivity appCompatActivity3 = this.f112216a;
                    if (appCompatActivity3 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    cVar2.mo80596a(appCompatActivity3, this.f112240z);
                }
                C39532c cVar3 = this.f112221f;
                if (cVar3 != null) {
                    cVar3.mo80597a(this.f112220e);
                }
                C39532c cVar4 = this.f112221f;
                if (cVar4 != null) {
                    cVar4.mo80601a(this.f112222g);
                }
                C39532c cVar5 = this.f112221f;
                if (cVar5 != null) {
                    cVar5.mo80600a(this.f112230o);
                }
                C39532c cVar6 = this.f112221f;
                if (cVar6 != null) {
                    cVar6.mo80599a(this.f112231p);
                }
                C39532c cVar7 = this.f112221f;
                if (cVar7 != null) {
                    cVar7.mo80598a((C24439h) new C44348f(this));
                }
                View view7 = this.f112227l;
                if (view7 == null) {
                    C52711k.m112234a();
                }
                RelativeLayout relativeLayout = this.f112237w;
                if (relativeLayout == null) {
                    C52711k.m112234a();
                }
                this.f112238x = new C31384a(frameLayout, view7, relativeLayout);
                C31384a aVar = this.f112238x;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                aVar.mo50220a((C24458h) new C44345c(this));
                m97121a(f112213A, false);
            } else {
                C39532c cVar8 = this.f112221f;
                if (cVar8 != null) {
                    AppCompatActivity appCompatActivity4 = this.f112216a;
                    if (appCompatActivity4 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    cVar8.mo80596a(appCompatActivity4, this.f112240z);
                }
            }
            View view8 = this.f112227l;
            if (view8 != null) {
                view8.setVisibility(4);
            }
            C31384a aVar2 = this.f112238x;
            if (aVar2 != null) {
                aVar2.mo50219a((C24454d) new C44350h(this));
            }
            C23441t tVar = this.f112218c;
            if (tVar != null) {
                tVar.mo48605a(this.f112234t);
            }
        }
    }

    /* renamed from: a */
    public final void mo90207a(List<String> list) {
        this.f112219d = list;
        C39532c cVar = this.f112221f;
        if (cVar != null) {
            cVar.mo80602a(list);
        }
    }

    /* renamed from: a */
    public final C42482c mo90206a(int i) {
        if (C44351b.m97144a() == 2 && mo90210d() == 1) {
            C39532c cVar = this.f112221f;
            if (cVar != null) {
                return cVar.mo80604b(i);
            }
            return null;
        }
        C39532c cVar2 = this.f112221f;
        if (cVar2 != null) {
            return cVar2.mo80607c(i);
        }
        return null;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C52711k.m112240b(view, "v");
        int id = view.getId();
        if (id == R.id.div) {
            m97121a(f112213A, true);
            return;
        }
        if (id == R.id.dj0) {
            m97121a(f112214B, true);
        }
    }

    /* renamed from: a */
    private final void m97121a(int i, boolean z) {
        if (i != this.f112239y) {
            this.f112239y = i;
            if (this.f112239y == f112213A) {
                AVDmtTextView aVDmtTextView = this.f112236v;
                if (aVDmtTextView != null) {
                    aVDmtTextView.setSelected(true);
                }
                AVDmtTextView aVDmtTextView2 = this.f112235u;
                if (aVDmtTextView2 != null) {
                    aVDmtTextView2.setSelected(false);
                }
                ViewGroup viewGroup = this.f112229n;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                FrameLayout frameLayout = this.f112240z;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                AVDmtTextView aVDmtTextView3 = this.f112236v;
                if (aVDmtTextView3 != null) {
                    aVDmtTextView3.setSelected(false);
                }
                AVDmtTextView aVDmtTextView4 = this.f112235u;
                if (aVDmtTextView4 != null) {
                    aVDmtTextView4.setSelected(true);
                }
                ViewGroup viewGroup2 = this.f112229n;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                FrameLayout frameLayout2 = this.f112240z;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            }
            if (z) {
                if (this.f112239y == f112214B) {
                    C44344b bVar = this.f112224i;
                    if (bVar != null) {
                        bVar.mo90214b();
                    }
                } else {
                    C44344b bVar2 = this.f112224i;
                    if (bVar2 != null) {
                        bVar2.mo90215c();
                    }
                }
            }
        }
    }
}
