package com.p683ss.android.ugc.aweme.tools.music.p2361a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.p582g.p583a.p593e.C10022a;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.music.C37218a;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37625m;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24430a;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24438g;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24439h;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24441j;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24442k;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24443l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39526a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39532c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39540k;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44704c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44709f;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p683ss.android.ugc.aweme.tools.music.C47094a;
import com.p683ss.android.ugc.aweme.tools.music.aichoosemusic.AIChooseMusicManager;
import com.p683ss.android.ugc.aweme.tools.music.aichoosemusic.C47157c;
import com.p683ss.android.ugc.aweme.tools.music.aichoosemusic.C47157c.C47159b;
import com.p683ss.android.ugc.aweme.tools.music.lrc.C47205a;
import com.p683ss.android.ugc.aweme.tools.music.lrc.C47207b;
import com.p683ss.android.ugc.aweme.tools.music.lrc.C47207b.C47214b;
import com.p683ss.android.ugc.aweme.tools.music.lrc.LrcView;
import com.p683ss.android.ugc.aweme.tools.music.p2361a.C47126b.C47127a;
import com.p683ss.android.ugc.aweme.tools.music.p2363c.C47164a;
import com.p683ss.android.ugc.aweme.tools.music.p2364d.C47182b;
import com.p683ss.android.ugc.aweme.tools.music.p2364d.p2365a.C47166a;
import com.p683ss.android.ugc.aweme.tools.music.p2364d.p2365a.C47172b.C47173a;
import com.p683ss.android.ugc.aweme.tools.music.p2366e.C47197b;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.p2425e.C48557d;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.a.a */
public final class C47105a implements OnClickListener, C37625m, C39532c {

    /* renamed from: A */
    private View f118924A;

    /* renamed from: B */
    private View f118925B;

    /* renamed from: C */
    private View f118926C;

    /* renamed from: D */
    private boolean f118927D;

    /* renamed from: E */
    private List<MusicModel> f118928E = new ArrayList();

    /* renamed from: F */
    private final C20347c f118929F;

    /* renamed from: G */
    private final int f118930G;

    /* renamed from: a */
    public C24443l f118931a;

    /* renamed from: b */
    public AVDmtTabLayout f118932b;

    /* renamed from: c */
    public int f118933c = 3;

    /* renamed from: d */
    public C47182b f118934d;

    /* renamed from: e */
    public C47157c f118935e;

    /* renamed from: f */
    public C37218a f118936f;

    /* renamed from: g */
    public RecyclerView f118937g;

    /* renamed from: h */
    public RecyclerView f118938h;

    /* renamed from: i */
    public LrcView f118939i;

    /* renamed from: j */
    public AVDmtTextView f118940j;

    /* renamed from: k */
    public int f118941k;

    /* renamed from: l */
    public C39526a f118942l;

    /* renamed from: m */
    public MusicModel f118943m;

    /* renamed from: n */
    public TextView f118944n;

    /* renamed from: o */
    public C47166a f118945o;

    /* renamed from: p */
    public C24441j f118946p;

    /* renamed from: q */
    public C24442k f118947q;

    /* renamed from: r */
    public C24438g f118948r;

    /* renamed from: s */
    public List<String> f118949s;

    /* renamed from: t */
    public C24439h f118950t;

    /* renamed from: u */
    public final AppCompatActivity f118951u;

    /* renamed from: v */
    public final C24430a f118952v;

    /* renamed from: w */
    private List<? extends MusicModel> f118953w;

    /* renamed from: x */
    private ViewGroup f118954x;

    /* renamed from: y */
    private ViewGroup f118955y;

    /* renamed from: z */
    private FrameLayout f118956z;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$a */
    static final class C47106a<T> implements C1710e<C39526a> {

        /* renamed from: a */
        final /* synthetic */ C47105a f118957a;

        C47106a(C47105a aVar) {
            this.f118957a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f118957a.f118942l = (C39526a) obj;
            if (C10022a.m20170a(this.f118957a.f118949s)) {
                RecyclerView recyclerView = this.f118957a.f118938h;
                if (recyclerView != null) {
                    recyclerView.post(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C47106a f118959a;

                        {
                            this.f118959a = r1;
                        }

                        public final void run() {
                            C47182b bVar = this.f118959a.f118957a.f118934d;
                            if (bVar != null) {
                                bVar.mo80644d();
                            }
                            this.f118959a.f118957a.mo94379k();
                        }
                    });
                }
            } else if (this.f118957a.f118943m != null) {
                C47105a aVar = this.f118957a;
                C39526a aVar2 = this.f118957a.f118942l;
                MusicModel musicModel = this.f118957a.f118943m;
                if (musicModel == null) {
                    C52711k.m112234a();
                }
                aVar.mo94377a(aVar2, musicModel);
            } else {
                C47127a.m102336a().mo94395a((C47164a) new C47164a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C47106a f118958a;

                    {
                        this.f118958a = r1;
                    }

                    /* renamed from: a */
                    public final void mo94376a(MusicModel musicModel, boolean z) {
                        C52711k.m112240b(musicModel, "musicModel");
                        this.f118958a.f118957a.mo94377a(this.f118958a.f118957a.f118942l, musicModel);
                    }
                }).mo94396a(this.f118957a.f118949s);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$b */
    static final class C47109b<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C47109b f118960a = new C47109b();

        C47109b() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder("Get AI Recommend Music Failed. Reason:");
            sb.append(th.getMessage());
            C47625i.m103103a(sb.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$c */
    public static final class C47110c implements C24441j {

        /* renamed from: a */
        final /* synthetic */ C47105a f118961a;

        C47110c(C47105a aVar) {
            this.f118961a = aVar;
        }

        /* renamed from: a */
        public final void mo50207a(View view, int i) {
            MusicModel musicModel;
            Object obj;
            Object obj2;
            boolean z;
            C52711k.m112240b(view, "view");
            C47166a aVar = this.f118961a.f118945o;
            MusicModel musicModel2 = null;
            if (aVar != null) {
                musicModel = aVar.mo80620b(i);
            } else {
                musicModel = null;
            }
            if (musicModel != null) {
                C47166a aVar2 = this.f118961a.f118945o;
                if (aVar2 != null) {
                    obj = Integer.valueOf(aVar2.mo94410j());
                } else {
                    obj = null;
                }
                C47166a aVar3 = this.f118961a.f118945o;
                if (aVar3 != null) {
                    obj2 = Integer.valueOf(aVar3.cm_());
                } else {
                    obj2 = null;
                }
                if (C52711k.m112239a(obj, obj2)) {
                    C47166a aVar4 = this.f118961a.f118945o;
                    if (aVar4 != null && aVar4.mo94410j() == i) {
                        if (C10022a.m20170a(this.f118961a.f118949s)) {
                            this.f118961a.mo80606b(false);
                            this.f118961a.mo94381m();
                            C47166a aVar5 = this.f118961a.f118945o;
                            if (aVar5 != null) {
                                aVar5.mo80621b(-1, false);
                            }
                            C47166a aVar6 = this.f118961a.f118945o;
                            if (aVar6 != null) {
                                aVar6.mo94409c(-1);
                            }
                            C47157c cVar = this.f118961a.f118935e;
                            if (cVar != null) {
                                cVar.mo94407b();
                            }
                            C24439h hVar = this.f118961a.f118950t;
                            if (hVar != null) {
                                hVar.mo50204a(null, null, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                C24441j jVar = this.f118961a.f118946p;
                if (jVar != null) {
                    jVar.mo50207a(view, i);
                }
                C47166a aVar7 = this.f118961a.f118945o;
                if (aVar7 != null) {
                    musicModel2 = aVar7.mo80620b(i);
                }
                String a = C47105a.m102289a(musicModel2);
                CharSequence charSequence = a;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C47166a aVar8 = this.f118961a.f118945o;
                    if (aVar8 != null) {
                        aVar8.mo80614a(i, false);
                    }
                    this.f118961a.mo50816a(a, musicModel2, "");
                    return;
                }
                C47166a aVar9 = this.f118961a.f118945o;
                if (aVar9 != null) {
                    aVar9.mo80614a(i, true);
                }
                C37218a aVar10 = this.f118961a.f118936f;
                if (aVar10 != null) {
                    aVar10.mo76545b(musicModel2, this.f118961a.f118933c, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$d */
    static final class C47111d implements C26846a {

        /* renamed from: a */
        final /* synthetic */ C47105a f118962a;

        C47111d(C47105a aVar) {
            this.f118962a = aVar;
        }

        public final void ar_() {
            C47166a aVar = this.f118962a.f118945o;
            if (aVar != null) {
                aVar.am_();
            }
            C47173a.m102427a().mo94421c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$e */
    public static final class C47112e implements C39540k {

        /* renamed from: a */
        final /* synthetic */ C47105a f118963a;

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$e$a */
        static final class C47113a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C47112e f118964a;

            C47113a(C47112e eVar) {
                this.f118964a = eVar;
            }

            public final void run() {
                C47166a aVar = this.f118964a.f118963a.f118945o;
                if (aVar != null) {
                    aVar.mo80625g();
                }
                RecyclerView recyclerView = this.f118964a.f118963a.f118937g;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                }
                TextView textView = this.f118964a.f118963a.f118944n;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f118964a.f118963a.f118944n;
                if (textView2 != null) {
                    textView2.setText(this.f118964a.f118963a.f118951u.getResources().getString(R.string.azb));
                }
                TextView textView3 = this.f118964a.f118963a.f118944n;
                if (textView3 != null) {
                    textView3.setOnClickListener(C471141.f118965a);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$e$b */
        static final class C47115b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C47112e f118966a;

            C47115b(C47112e eVar) {
                this.f118966a = eVar;
            }

            public final void run() {
                RecyclerView recyclerView = this.f118966a.f118963a.f118937g;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                C47166a aVar = this.f118966a.f118963a.f118945o;
                if (aVar != null) {
                    aVar.cn_();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$e$c */
        static final class C47116c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C47112e f118967a;

            C47116c(C47112e eVar) {
                this.f118967a = eVar;
            }

            public final void run() {
                C47166a aVar = this.f118967a.f118963a.f118945o;
                if (aVar != null) {
                    aVar.mo80625g();
                }
                RecyclerView recyclerView = this.f118967a.f118963a.f118937g;
                if (recyclerView != null) {
                    recyclerView.setVisibility(4);
                }
                TextView textView = this.f118967a.f118963a.f118944n;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f118967a.f118963a.f118944n;
                if (textView2 != null) {
                    textView2.setText(this.f118967a.f118963a.f118951u.getResources().getString(R.string.a4b));
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$e$d */
        static final class C47117d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C47112e f118968a;

            /* renamed from: b */
            final /* synthetic */ List f118969b;

            /* renamed from: c */
            final /* synthetic */ boolean f118970c;

            C47117d(C47112e eVar, List list, boolean z) {
                this.f118968a = eVar;
                this.f118969b = list;
                this.f118970c = z;
            }

            public final void run() {
                RecyclerView recyclerView = this.f118968a.f118963a.f118937g;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                TextView textView = this.f118968a.f118963a.f118944n;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                C47166a aVar = this.f118968a.f118963a.f118945o;
                if (aVar != null) {
                    aVar.mo80625g();
                }
                C47166a aVar2 = this.f118968a.f118963a.f118945o;
                if (aVar2 != null) {
                    aVar2.mo50303a(this.f118969b);
                }
                C47166a aVar3 = this.f118968a.f118963a.f118945o;
                if (aVar3 != null) {
                    aVar3.mo54798c(true);
                }
                if (!this.f118970c) {
                    C47166a aVar4 = this.f118968a.f118963a.f118945o;
                    if (aVar4 != null) {
                        aVar4.an_();
                    }
                    C47166a aVar5 = this.f118968a.f118963a.f118945o;
                    if (aVar5 != null) {
                        aVar5.mo54798c(false);
                    }
                    return;
                }
                C47166a aVar6 = this.f118968a.f118963a.f118945o;
                if (aVar6 != null) {
                    aVar6.ao_();
                }
            }
        }

        /* renamed from: a */
        public final void mo80646a() {
            RecyclerView recyclerView = this.f118963a.f118937g;
            if (recyclerView != null) {
                recyclerView.post(new C47116c(this));
            }
        }

        /* renamed from: b */
        public final void mo80648b() {
            RecyclerView recyclerView = this.f118963a.f118937g;
            if (recyclerView != null) {
                recyclerView.post(new C47115b(this));
            }
        }

        /* renamed from: c */
        public final void mo80649c() {
            RecyclerView recyclerView = this.f118963a.f118937g;
            if (recyclerView != null) {
                recyclerView.post(new C47113a(this));
            }
        }

        C47112e(C47105a aVar) {
            this.f118963a = aVar;
        }

        /* renamed from: a */
        public final void mo80647a(List<? extends MusicModel> list, boolean z) {
            C52711k.m112240b(list, "musicList");
            RecyclerView recyclerView = this.f118963a.f118937g;
            if (recyclerView != null) {
                recyclerView.post(new C47117d(this, list, z));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$f */
    public static final class C47118f implements C24441j {

        /* renamed from: a */
        final /* synthetic */ C47105a f118971a;

        C47118f(C47105a aVar) {
            this.f118971a = aVar;
        }

        /* renamed from: a */
        public final void mo50207a(View view, int i) {
            MusicModel musicModel;
            Object obj;
            Object obj2;
            boolean z;
            CharSequence charSequence;
            C52711k.m112240b(view, "view");
            if (i == -1) {
                this.f118971a.f118952v.mo50186a();
                C24439h hVar = this.f118971a.f118950t;
                if (hVar != null) {
                    hVar.mo50203a();
                    return;
                }
                return;
            }
            C47182b bVar = this.f118971a.f118934d;
            MusicModel musicModel2 = null;
            if (bVar != null) {
                musicModel = bVar.mo94422c(i);
            } else {
                musicModel = null;
            }
            if (musicModel != null) {
                C47182b bVar2 = this.f118971a.f118934d;
                if (bVar2 != null) {
                    obj = Integer.valueOf(bVar2.mo80635a());
                } else {
                    obj = null;
                }
                C47182b bVar3 = this.f118971a.f118934d;
                if (bVar3 != null) {
                    obj2 = Integer.valueOf(bVar3.mo80640b());
                } else {
                    obj2 = null;
                }
                if (C52711k.m112239a(obj, obj2)) {
                    C47182b bVar4 = this.f118971a.f118934d;
                    if (bVar4 != null && bVar4.mo80635a() == i) {
                        if (C10022a.m20170a(this.f118971a.f118949s)) {
                            this.f118971a.mo80606b(false);
                            this.f118971a.mo94381m();
                            C47182b bVar5 = this.f118971a.f118934d;
                            if (bVar5 != null) {
                                bVar5.mo80642b(-1, false);
                            }
                            C47182b bVar6 = this.f118971a.f118934d;
                            if (bVar6 != null) {
                                bVar6.mo80636a(-1);
                            }
                            AVDmtTextView aVDmtTextView = this.f118971a.f118940j;
                            if (aVDmtTextView != null) {
                                aVDmtTextView.setSelected(false);
                            }
                            AVDmtTextView aVDmtTextView2 = this.f118971a.f118940j;
                            if (aVDmtTextView2 != null) {
                                AVDmtTextView aVDmtTextView3 = this.f118971a.f118940j;
                                if (aVDmtTextView3 != null) {
                                    Context context = aVDmtTextView3.getContext();
                                    if (context != null) {
                                        Resources resources = context.getResources();
                                        if (resources != null) {
                                            charSequence = resources.getString(R.string.o3);
                                            aVDmtTextView2.setText(charSequence);
                                        }
                                    }
                                }
                                charSequence = null;
                                aVDmtTextView2.setText(charSequence);
                            }
                            LrcView lrcView = this.f118971a.f118939i;
                            if (lrcView != null) {
                                lrcView.setVisibility(8);
                            }
                            C47157c cVar = this.f118971a.f118935e;
                            if (cVar != null) {
                                cVar.mo94407b();
                            }
                            C24439h hVar2 = this.f118971a.f118950t;
                            if (hVar2 != null) {
                                hVar2.mo50204a(null, null, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                C24441j jVar = this.f118971a.f118946p;
                if (jVar != null) {
                    jVar.mo50207a(view, i);
                }
                C47182b bVar7 = this.f118971a.f118934d;
                if (bVar7 != null) {
                    musicModel2 = bVar7.mo94422c(i);
                }
                String a = C47105a.m102289a(musicModel2);
                CharSequence charSequence2 = a;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || (musicModel2 != null && musicModel2.isMvThemeMusic())) {
                    C47182b bVar8 = this.f118971a.f118934d;
                    if (bVar8 != null) {
                        bVar8.mo80637a(i, false);
                    }
                    this.f118971a.mo50816a(a, musicModel2, "");
                } else {
                    this.f118971a.mo80606b(false);
                    C47182b bVar9 = this.f118971a.f118934d;
                    if (bVar9 != null) {
                        bVar9.mo80637a(i, true);
                    }
                    C37218a aVar = this.f118971a.f118936f;
                    if (aVar != null) {
                        aVar.mo76545b(musicModel2, this.f118971a.f118933c, false);
                    }
                }
                if (musicModel2 != null && musicModel2.isMvThemeMusic()) {
                    this.f118971a.mo80606b(false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$g */
    public static final class C47119g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47105a f118972a;

        C47119g(C47105a aVar) {
            this.f118972a = aVar;
        }

        public final void onClick(View view) {
            C44709f fVar;
            ClickInstrumentation.onClick(view);
            C24443l lVar = this.f118972a.f118931a;
            if (lVar != null) {
                lVar.mo50209a(true);
            }
            this.f118972a.mo94378c(true);
            AVDmtTabLayout aVDmtTabLayout = this.f118972a.f118932b;
            if (aVDmtTabLayout != null) {
                AVDmtTabLayout aVDmtTabLayout2 = this.f118972a.f118932b;
                if (aVDmtTabLayout2 != null) {
                    fVar = aVDmtTabLayout2.mo90679a(0);
                } else {
                    fVar = null;
                }
                aVDmtTabLayout.mo90693b(fVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$h */
    public static final class C47120h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47105a f118973a;

        C47120h(C47105a aVar) {
            this.f118973a = aVar;
        }

        public final void onClick(View view) {
            C44709f fVar;
            ClickInstrumentation.onClick(view);
            C24443l lVar = this.f118973a.f118931a;
            if (lVar != null) {
                lVar.mo50209a(true);
            }
            this.f118973a.mo94378c(true);
            AVDmtTabLayout aVDmtTabLayout = this.f118973a.f118932b;
            if (aVDmtTabLayout != null) {
                AVDmtTabLayout aVDmtTabLayout2 = this.f118973a.f118932b;
                if (aVDmtTabLayout2 != null) {
                    fVar = aVDmtTabLayout2.mo90679a(1);
                } else {
                    fVar = null;
                }
                aVDmtTabLayout.mo90693b(fVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$i */
    public static final class C47121i implements C44704c {

        /* renamed from: a */
        final /* synthetic */ C47105a f118974a;

        /* renamed from: b */
        public final void mo64264b(C44709f fVar) {
        }

        /* renamed from: c */
        public final void mo64265c(C44709f fVar) {
        }

        C47121i(C47105a aVar) {
            this.f118974a = aVar;
        }

        /* renamed from: a */
        public final void mo64263a(C44709f fVar) {
            boolean z;
            C24443l lVar = this.f118974a.f118931a;
            boolean z2 = false;
            if (lVar != null) {
                if (fVar == null || fVar.f113161e != 0) {
                    z = false;
                } else {
                    z = true;
                }
                lVar.mo50209a(z);
            }
            C47105a aVar = this.f118974a;
            if (fVar != null && fVar.f113161e == 0) {
                z2 = true;
            }
            aVar.mo94378c(z2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$j */
    public static final class C47122j implements C47214b {

        /* renamed from: a */
        final /* synthetic */ C47105a f118975a;

        C47122j(C47105a aVar) {
            this.f118975a = aVar;
        }

        /* renamed from: a */
        public final void mo94391a(String str, List<C47205a> list) {
            String str2;
            MusicModel l = this.f118975a.mo94380l();
            if (l != null) {
                str2 = l.getLrcUrl();
            } else {
                str2 = null;
            }
            if (!(!C52711k.m112239a((Object) str, (Object) str2)) && !C9376b.m18558a((Collection<T>) list)) {
                LrcView lrcView = this.f118975a.f118939i;
                if (lrcView != null) {
                    lrcView.setVisibility(0);
                }
                LrcView lrcView2 = this.f118975a.f118939i;
                if (lrcView2 != null) {
                    if (list == null) {
                        C52711k.m112234a();
                    }
                    lrcView2.setLrcInfos(list);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$k */
    public static final class C47123k implements C47159b {

        /* renamed from: a */
        final /* synthetic */ C47105a f118976a;

        C47123k(C47105a aVar) {
            this.f118976a = aVar;
        }

        /* renamed from: a */
        public final void mo94392a(int i) {
            LrcView lrcView = this.f118976a.f118939i;
            if (lrcView != null) {
                lrcView.setCurrentTime(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$l */
    public static final class C47124l implements C47214b {

        /* renamed from: a */
        final /* synthetic */ C47105a f118977a;

        C47124l(C47105a aVar) {
            this.f118977a = aVar;
        }

        /* renamed from: a */
        public final void mo94391a(String str, List<C47205a> list) {
            String str2;
            MusicModel l = this.f118977a.mo94380l();
            if (l != null) {
                str2 = l.getLrcUrl();
            } else {
                str2 = null;
            }
            if (!(!C52711k.m112239a((Object) str, (Object) str2)) && !C9376b.m18558a((Collection<T>) list)) {
                LrcView lrcView = this.f118977a.f118939i;
                if (lrcView != null) {
                    lrcView.setVisibility(0);
                }
                LrcView lrcView2 = this.f118977a.f118939i;
                if (lrcView2 != null) {
                    if (list == null) {
                        C52711k.m112234a();
                    }
                    lrcView2.setLrcInfos(list);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.a$m */
    static final class C47125m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C47105a f118978a;

        C47125m(C47105a aVar) {
            this.f118978a = aVar;
        }

        public final void run() {
            C47182b bVar = this.f118978a.f118934d;
            if (bVar != null) {
                bVar.mo80644d();
            }
            this.f118978a.mo94379k();
        }
    }

    /* renamed from: d */
    public final int mo80609d() {
        return this.f118941k;
    }

    /* renamed from: a */
    public final void mo80602a(List<String> list) {
        this.f118949s = list;
    }

    /* renamed from: a */
    public final void mo80603a(boolean z) {
        RecyclerView recyclerView = this.f118938h;
        if (recyclerView != null) {
            recyclerView.setEnabled(true);
        }
    }

    /* renamed from: a */
    public final void mo50816a(String str, MusicModel musicModel, String str2) {
        int i = -1;
        String str3 = null;
        if (this.f118941k == 0) {
            C47182b bVar = this.f118934d;
            MusicModel e = bVar != null ? bVar.mo94423e() : null;
            if (!(!C52711k.m112239a(e != null ? e.getMusicId() : null, musicModel != null ? musicModel.getMusicId() : null))) {
                AVDmtTextView aVDmtTextView = this.f118940j;
                if (aVDmtTextView != null) {
                    aVDmtTextView.setSelected(true);
                }
                AVDmtTextView aVDmtTextView2 = this.f118940j;
                if (aVDmtTextView2 != null) {
                    AVDmtTextView aVDmtTextView3 = this.f118940j;
                    if (aVDmtTextView3 != null) {
                        Context context = aVDmtTextView3.getContext();
                        if (context != null) {
                            Resources resources = context.getResources();
                            if (resources != null) {
                                Object[] objArr = new Object[1];
                                if (e != null) {
                                    str3 = e.getName();
                                }
                                objArr[0] = str3;
                                str3 = resources.getString(R.string.o6, objArr);
                            }
                        }
                    }
                    aVDmtTextView2.setText(str3);
                }
                LrcView lrcView = this.f118939i;
                if (lrcView != null) {
                    lrcView.setVisibility(8);
                }
                LrcView lrcView2 = this.f118939i;
                if (lrcView2 != null) {
                    lrcView2.setStartTime(0);
                }
                int b = new C47094a().mo80578b(str);
                LrcView lrcView3 = this.f118939i;
                if (lrcView3 != null) {
                    lrcView3.setDuration(((float) b) / 1000.0f);
                }
                LrcView lrcView4 = this.f118939i;
                if (lrcView4 != null) {
                    lrcView4.setPreviewStartTime(e != null ? e.getPreviewStartTime() : 0.0f);
                }
                C24439h hVar = this.f118950t;
                if (hVar != null) {
                    new C47197b();
                    hVar.mo50204a(str, C47197b.m102454a(e), true);
                }
                C47182b bVar2 = this.f118934d;
                if (bVar2 != null) {
                    bVar2.mo80643c();
                }
                C47182b bVar3 = this.f118934d;
                if (bVar3 != null) {
                    C47182b bVar4 = this.f118934d;
                    if (bVar4 != null) {
                        i = bVar4.mo80640b();
                    }
                    bVar3.mo80642b(i, true);
                }
                C47166a aVar = this.f118945o;
                if (aVar != null) {
                    aVar.mo94413m();
                }
                C47207b a = C47207b.m102463a();
                if (e == null) {
                    C52711k.m112234a();
                }
                a.mo94448a(e.getLrcUrl(), e.getLrcType(), (C47214b) new C47122j(this));
                C47157c cVar = this.f118935e;
                if (cVar != null) {
                    C47159b kVar = new C47123k(this);
                    C52711k.m112240b(kVar, "positionListener");
                    cVar.f119061b = kVar;
                }
                C47157c cVar2 = this.f118935e;
                if (cVar2 != null) {
                    cVar2.mo94406a();
                }
                mo80606b(this.f118952v.mo50187b());
                if (musicModel != null && musicModel.isMvThemeMusic()) {
                    mo80606b(true);
                }
            }
            return;
        }
        C47166a aVar2 = this.f118945o;
        MusicModel k = aVar2 != null ? aVar2.mo94411k() : null;
        Object musicId = k != null ? k.getMusicId() : null;
        if (musicModel != null) {
            str3 = musicModel.getMusicId();
        }
        if (!(!C52711k.m112239a(musicId, (Object) str3))) {
            C24439h hVar2 = this.f118950t;
            if (hVar2 != null) {
                new C47197b();
                hVar2.mo50204a(str, C47197b.m102454a(k), false);
            }
            C47166a aVar3 = this.f118945o;
            if (aVar3 != null) {
                aVar3.mo94412l();
            }
            C47166a aVar4 = this.f118945o;
            if (aVar4 != null) {
                C47166a aVar5 = this.f118945o;
                aVar4.mo80621b(aVar5 != null ? aVar5.cm_() : -1, true);
            }
            C47182b bVar5 = this.f118934d;
            if (bVar5 != null) {
                bVar5.mo80642b(-1, false);
                bVar5.mo80636a(-1);
                bVar5.mo80641b(-1);
            }
            C47157c cVar3 = this.f118935e;
            if (cVar3 != null) {
                cVar3.mo94406a();
            }
            mo80606b(this.f118952v.mo50187b());
            if (musicModel != null && musicModel.isMvThemeMusic()) {
                mo80606b(true);
            }
        }
    }

    /* renamed from: i */
    public final Activity mo50821i() {
        return this.f118951u;
    }

    /* renamed from: j */
    public final boolean mo50822j() {
        if (this.f118926C != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo80594a() {
        C47157c cVar = this.f118935e;
        if (cVar != null) {
            cVar.mo94407b();
        }
    }

    /* renamed from: e */
    public final void mo80610e() {
        C47182b bVar = this.f118934d;
        if (bVar != null) {
            RecyclerView recyclerView = bVar.f119124b;
            if (recyclerView != null) {
                recyclerView.mo4847f(bVar.f119123a);
            }
        }
    }

    /* renamed from: f */
    public final void mo80611f() {
        C47182b bVar = this.f118934d;
        if (bVar != null) {
            bVar.mo94425g();
        }
    }

    /* renamed from: g */
    public final MusicModel mo50819g() {
        C47182b bVar = this.f118934d;
        if (bVar != null) {
            return bVar.mo94426h();
        }
        return null;
    }

    /* renamed from: h */
    public final void mo80612h() {
        C47166a aVar = this.f118945o;
        if (aVar != null) {
            aVar.mo94413m();
        }
    }

    /* renamed from: l */
    public final MusicModel mo94380l() {
        C47182b bVar = this.f118934d;
        if (bVar != null) {
            return bVar.mo94426h();
        }
        return null;
    }

    /* renamed from: m */
    public final void mo94381m() {
        View view = this.f118924A;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    /* renamed from: b */
    public final void mo80605b() {
        C47157c cVar = this.f118935e;
        if (cVar != null) {
            cVar.f119062c.removeCallbacksAndMessages(null);
            cVar.f119062c.postDelayed(null, cVar.f119063d);
        }
    }

    /* renamed from: c */
    public final void mo80608c() {
        C47173a.m102427a().f119097a = null;
        C47127a.m102336a().mo94395a((C47164a) null);
        C47157c cVar = this.f118935e;
        if (cVar != null) {
            cVar.f119062c.removeCallbacksAndMessages(null);
        }
        C37218a aVar = this.f118936f;
        if (aVar != null) {
            aVar.mo50916d();
        }
    }

    /* renamed from: n */
    private final void m102290n() {
        long j;
        AIChooseMusicManager.m102346a(false);
        if (!this.f118927D) {
            C47182b bVar = this.f118934d;
            if (bVar != null) {
                bVar.mo94424f();
            }
            C24438g gVar = this.f118948r;
            if (gVar != null) {
                gVar.mo50202a();
            }
        }
        C20347c cVar = this.f118929F;
        if (cVar != null) {
            j = (long) cVar.mo43071k();
        } else {
            j = 0;
        }
        AIChooseMusicManager.m102337a(j).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C47106a<Object>(this), (C1710e<? super Throwable>) C47109b.f118960a);
    }

    /* renamed from: k */
    public final void mo94379k() {
        Object obj;
        boolean z;
        C1332i iVar;
        MusicModel musicModel;
        Object obj2;
        List<? extends MusicModel> list;
        Object obj3;
        CharSequence charSequence;
        List<? extends MusicModel> list2;
        C42482c b = C43214dh.m94817a().mo50201b();
        String str = null;
        if (b == null) {
            this.f118928E.clear();
            C39526a aVar = this.f118942l;
            if (aVar != null) {
                List<? extends MusicModel> list3 = aVar.f101102a;
                if (list3 != null) {
                    this.f118928E.addAll(list3);
                }
            }
            List<? extends MusicModel> list4 = this.f118953w;
            C39526a aVar2 = this.f118942l;
            if (aVar2 != null) {
                obj3 = aVar2.f101102a;
            } else {
                obj3 = null;
            }
            if (!C52711k.m112239a((Object) list4, obj3)) {
                C47182b bVar = this.f118934d;
                if (bVar != null) {
                    Map<String, Boolean> map = bVar.f119131i;
                    if (map != null) {
                        map.clear();
                    }
                }
                C47182b bVar2 = this.f118934d;
                if (bVar2 != null) {
                    Set<String> set = bVar2.f119132j;
                    if (set != null) {
                        set.clear();
                    }
                }
                C39526a aVar3 = this.f118942l;
                if (aVar3 != null) {
                    list2 = aVar3.f101102a;
                } else {
                    list2 = null;
                }
                this.f118953w = list2;
            }
            mo80606b(false);
            mo94381m();
            C47182b bVar3 = this.f118934d;
            if (bVar3 != null) {
                bVar3.mo80642b(-1, false);
            }
            C47182b bVar4 = this.f118934d;
            if (bVar4 != null) {
                bVar4.mo80636a(-1);
            }
            C47182b bVar5 = this.f118934d;
            if (bVar5 != null) {
                bVar5.mo80641b(-1);
            }
            C47182b bVar6 = this.f118934d;
            if (bVar6 != null) {
                bVar6.notifyDataSetChanged();
            }
            AVDmtTextView aVDmtTextView = this.f118940j;
            if (aVDmtTextView != null) {
                aVDmtTextView.setSelected(false);
            }
            AVDmtTextView aVDmtTextView2 = this.f118940j;
            if (aVDmtTextView2 != null) {
                AVDmtTextView aVDmtTextView3 = this.f118940j;
                if (aVDmtTextView3 != null) {
                    Context context = aVDmtTextView3.getContext();
                    if (context != null) {
                        Resources resources = context.getResources();
                        if (resources != null) {
                            charSequence = resources.getString(R.string.o3);
                            aVDmtTextView2.setText(charSequence);
                        }
                    }
                }
                charSequence = null;
                aVDmtTextView2.setText(charSequence);
            }
            LrcView lrcView = this.f118939i;
            if (lrcView != null) {
                lrcView.setDuration(0.0f);
            }
            LrcView lrcView2 = this.f118939i;
            if (lrcView2 != null) {
                lrcView2.setStartTime(0);
            }
            LrcView lrcView3 = this.f118939i;
            if (lrcView3 != null) {
                lrcView3.setPreviewStartTime(0.0f);
            }
            LrcView lrcView4 = this.f118939i;
            if (lrcView4 != null) {
                lrcView4.setVisibility(8);
            }
            C47157c cVar = this.f118935e;
            if (cVar != null) {
                cVar.mo94407b();
            }
            C24439h hVar = this.f118950t;
            if (hVar != null) {
                hVar.mo50204a(null, null, false);
                return;
            }
            return;
        }
        this.f118928E.clear();
        C39526a aVar4 = this.f118942l;
        if (aVar4 != null) {
            List<? extends MusicModel> list5 = aVar4.f101102a;
            if (list5 != null) {
                this.f118928E.addAll(list5);
            }
        }
        List<? extends MusicModel> list6 = this.f118953w;
        C39526a aVar5 = this.f118942l;
        if (aVar5 != null) {
            obj = aVar5.f101102a;
        } else {
            obj = null;
        }
        if (!C52711k.m112239a((Object) list6, obj)) {
            C47182b bVar7 = this.f118934d;
            if (bVar7 != null) {
                Map<String, Boolean> map2 = bVar7.f119131i;
                if (map2 != null) {
                    map2.clear();
                }
            }
            C47182b bVar8 = this.f118934d;
            if (bVar8 != null) {
                Set<String> set2 = bVar8.f119132j;
                if (set2 != null) {
                    set2.clear();
                }
            }
            C39526a aVar6 = this.f118942l;
            if (aVar6 != null) {
                list = aVar6.f101102a;
            } else {
                list = null;
            }
            this.f118953w = list;
        }
        int size = this.f118928E.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                String musicId = b.getMusicId();
                MusicModel musicModel2 = (MusicModel) this.f118928E.get(i);
                if (musicModel2 != null) {
                    obj2 = musicModel2.getMusicId();
                } else {
                    obj2 = null;
                }
                if (!C52711k.m112239a((Object) musicId, obj2)) {
                    if (i == size) {
                        break;
                    }
                    i++;
                } else {
                    if (i != 0) {
                        this.f118928E.add(0, (MusicModel) this.f118928E.remove(i));
                    }
                    z = true;
                }
            }
        }
        z = false;
        if (!z) {
            C52711k.m112240b(b, "avMusic");
            MusicModel musicModel3 = new MusicModel();
            musicModel3.setMusicId(b.getMusicId());
            musicModel3.setId(b.getId());
            musicModel3.setAlbum(b.getAlbum());
            musicModel3.setName(b.getMusicName());
            musicModel3.setAlbum(b.getAlbum());
            if (b.getCoverMedium() != null) {
                UrlModel coverMedium = b.getCoverMedium();
                C52711k.m112236a((Object) coverMedium, "avMusic.getCoverMedium()");
                if (!C9376b.m18558a((Collection<T>) coverMedium.getUrlList())) {
                    UrlModel coverMedium2 = b.getCoverMedium();
                    C52711k.m112236a((Object) coverMedium2, "avMusic.getCoverMedium()");
                    musicModel3.setPicPremium((String) coverMedium2.getUrlList().get(0));
                }
            }
            if (b.getCoverThumb() != null) {
                UrlModel coverThumb = b.getCoverThumb();
                C52711k.m112236a((Object) coverThumb, "avMusic.getCoverThumb()");
                if (!C9376b.m18558a((Collection<T>) coverThumb.getUrlList())) {
                    UrlModel coverThumb2 = b.getCoverThumb();
                    C52711k.m112236a((Object) coverThumb2, "avMusic.getCoverThumb()");
                    musicModel3.setPicSmall((String) coverThumb2.getUrlList().get(0));
                }
            }
            musicModel3.setLocalPath(b.getPath());
            musicModel3.setSinger(b.getSinger());
            if (b.getMusicType() == MusicType.ONLINE.ordinal()) {
                musicModel3.setUrl(b.getPlayUrl());
            }
            musicModel3.setDuration(b.duration);
            musicModel3.setShootDuration(Integer.valueOf(b.shootDuration));
            musicModel3.setAuditionDuration(Integer.valueOf(b.auditionDuration));
            if (b.getMusicType() == MusicType.BAIDU.ordinal()) {
                musicModel3.setMusicType(MusicType.BAIDU);
            }
            if (b.getMusicType() == MusicType.LOCAL.ordinal()) {
                musicModel3.setMusicType(MusicType.LOCAL);
            }
            if (b.getMusicType() == MusicType.ONLINE.ordinal()) {
                musicModel3.setMusicType(MusicType.ONLINE);
            }
            musicModel3.setOfflineDesc(b.getOfflineDesc());
            musicModel3.setMusicStatus(b.getMusicStatus());
            musicModel3.setStrongBeatUrl(b.getStrongBeatUrl());
            musicModel3.setLrcUrl(b.getLrcUrl());
            musicModel3.setLrcType(b.getLrcType());
            musicModel3.setPreviewStartTime(b.getPreviewStartTime());
            this.f118928E.add(0, musicModel3);
            C47182b bVar9 = this.f118934d;
            if (bVar9 != null) {
                C52711k.m112240b(musicModel3, "mMusicModel");
                String musicId2 = musicModel3.getMusicId();
                if (musicId2 != null) {
                    if (bVar9.f119131i.get(musicId2) == null || C52711k.m112239a((Object) (Boolean) bVar9.f119131i.get(musicId2), (Object) Boolean.valueOf(false))) {
                        bVar9.f119131i.put(musicId2, Boolean.valueOf(true));
                    }
                    bVar9.f119132j.add(musicId2);
                }
            }
            mo80606b(this.f118952v.mo50187b());
        }
        C47182b bVar10 = this.f118934d;
        if (bVar10 != null) {
            bVar10.mo80641b(0);
        }
        C47182b bVar11 = this.f118934d;
        if (bVar11 != null) {
            bVar11.mo80636a(0);
        }
        C47182b bVar12 = this.f118934d;
        if (bVar12 != null) {
            bVar12.notifyDataSetChanged();
        }
        RecyclerView recyclerView = this.f118938h;
        if (recyclerView != null) {
            iVar = recyclerView.getLayoutManager();
        } else {
            iVar = null;
        }
        if (iVar instanceof LinearLayoutManager) {
            ((LinearLayoutManager) iVar).mo4721a(0, 0);
        }
        C47182b bVar13 = this.f118934d;
        if (bVar13 != null) {
            musicModel = bVar13.mo94426h();
        } else {
            musicModel = null;
        }
        if (!z) {
            LrcView lrcView5 = this.f118939i;
            if (lrcView5 != null) {
                lrcView5.setVisibility(8);
            }
            LrcView lrcView6 = this.f118939i;
            if (lrcView6 != null) {
                lrcView6.setPreviewStartTime(0.0f);
            }
        }
        if (musicModel != null) {
            C47207b.m102463a().mo94448a(musicModel.getLrcUrl(), musicModel.getLrcType(), (C47214b) new C47124l(this));
        }
        C47182b bVar14 = this.f118934d;
        if (bVar14 != null) {
            bVar14.mo94425g();
        }
        if (((MusicModel) this.f118928E.get(0)) != null) {
            mo80606b(this.f118952v.mo50187b());
        }
        if (musicModel != null) {
            AVDmtTextView aVDmtTextView4 = this.f118940j;
            if (aVDmtTextView4 != null) {
                aVDmtTextView4.setSelected(true);
            }
            AVDmtTextView aVDmtTextView5 = this.f118940j;
            if (aVDmtTextView5 != null) {
                AVDmtTextView aVDmtTextView6 = this.f118940j;
                if (aVDmtTextView6 != null) {
                    Context context2 = aVDmtTextView6.getContext();
                    if (context2 != null) {
                        Resources resources2 = context2.getResources();
                        if (resources2 != null) {
                            str = resources2.getString(R.string.o6, new Object[]{musicModel.getName()});
                        }
                    }
                }
                aVDmtTextView5.setText(str);
            }
            C47157c cVar2 = this.f118935e;
            if (cVar2 != null) {
                cVar2.mo94406a();
            }
        }
    }

    /* renamed from: a */
    public final void mo80597a(C24438g gVar) {
        this.f118948r = gVar;
    }

    /* renamed from: a */
    public final void mo80598a(C24439h hVar) {
        C52711k.m112240b(hVar, "onMusicViewClickListener");
        this.f118950t = hVar;
    }

    /* renamed from: a */
    public final void mo80595a(int i) {
        LrcView lrcView = this.f118939i;
        if (lrcView != null) {
            lrcView.setStartTime(i);
        }
    }

    /* renamed from: b */
    public final C42482c mo80604b(int i) {
        MusicModel musicModel;
        new C47197b();
        C47166a aVar = this.f118945o;
        if (aVar != null) {
            musicModel = aVar.mo80620b(i);
        } else {
            musicModel = null;
        }
        return C47197b.m102454a(musicModel);
    }

    /* renamed from: c */
    public final C42482c mo80607c(int i) {
        MusicModel musicModel;
        new C47197b();
        C39526a aVar = this.f118942l;
        if (aVar != null) {
            List<? extends MusicModel> list = aVar.f101102a;
            if (list != null) {
                musicModel = (MusicModel) C52575l.m112118a(list, i);
                return C47197b.m102454a(musicModel);
            }
        }
        musicModel = null;
        return C47197b.m102454a(musicModel);
    }

    /* renamed from: a */
    public final void mo80599a(C24441j jVar) {
        this.f118946p = jVar;
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.b5j) {
            RecyclerView recyclerView = this.f118938h;
            if (recyclerView != null) {
                recyclerView.setEnabled(false);
            }
            C24439h hVar = this.f118950t;
            if (hVar != null) {
                hVar.mo50205b();
            }
        }
    }

    /* renamed from: a */
    public static String m102289a(MusicModel musicModel) {
        String str;
        boolean z;
        if (musicModel != null) {
            str = musicModel.getLocalPath();
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String a = C48557d.m105031a().mo96061a(str);
        if (TextUtils.isEmpty(a) || !C48016e.m103944b(a) || new File(a).length() <= 0) {
            return null;
        }
        return a;
    }

    /* renamed from: b */
    public final void mo80606b(boolean z) {
        float f;
        if (z) {
            View view = this.f118924A;
            if (view != null) {
                view.setVisibility(0);
            }
        }
        View view2 = this.f118924A;
        if (view2 != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            view2.setAlpha(f);
        }
        View view3 = this.f118924A;
        if (view3 != null) {
            view3.setEnabled(z);
        }
    }

    /* renamed from: c */
    public final void mo94378c(boolean z) {
        int i;
        ViewGroup viewGroup = this.f118955y;
        int i2 = 4;
        if (viewGroup != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            viewGroup.setVisibility(i);
        }
        ViewGroup viewGroup2 = this.f118954x;
        if (viewGroup2 != null) {
            if (!z) {
                i2 = 0;
            }
            viewGroup2.setVisibility(i2);
        }
        if (!z) {
            C47173a.m102427a().mo94420b();
            this.f118941k = 1;
            return;
        }
        this.f118941k = 0;
    }

    /* renamed from: a */
    public final void mo80600a(C24442k kVar) {
        this.f118947q = kVar;
    }

    /* renamed from: a */
    public final void mo80601a(C24443l lVar) {
        this.f118931a = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0184  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80596a(android.support.p043v7.app.AppCompatActivity r8, android.widget.FrameLayout r9) {
        /*
            r7 = this;
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            android.view.View r0 = r7.f118926C
            r1 = 1
            if (r0 != 0) goto L_0x0318
            android.content.Context r8 = (android.content.Context) r8
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            int r0 = r7.f118930G
            if (r0 != 0) goto L_0x0018
            r0 = 2132213951(0x7f1700bf, float:2.007173E38)
            goto L_0x001b
        L_0x0018:
            r0 = 2132213952(0x7f1700c0, float:2.0071732E38)
        L_0x001b:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            android.view.View r8 = r8.inflate(r0, r9, r1)
            r7.f118926C = r8
            int r8 = r7.f118930G
            if (r8 != 0) goto L_0x005b
            android.view.View r8 = r7.f118926C
            if (r8 != 0) goto L_0x002e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x002e:
            r9 = 2132020858(0x7f140e7a, float:1.968009E38)
            android.view.View r8 = r8.findViewById(r9)
            r7.f118925B = r8
            android.view.View r8 = r7.f118926C
            if (r8 != 0) goto L_0x003e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x003e:
            r9 = 2132024237(0x7f141bad, float:1.9686944E38)
            android.view.View r8 = r8.findViewById(r9)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTextView r8 = (com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView) r8
            r7.f118940j = r8
            android.view.View r8 = r7.f118926C
            if (r8 != 0) goto L_0x0050
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0050:
            r9 = 2132024230(0x7f141ba6, float:1.968693E38)
            android.view.View r8 = r8.findViewById(r9)
            com.ss.android.ugc.aweme.tools.music.lrc.LrcView r8 = (com.p683ss.android.ugc.aweme.tools.music.lrc.LrcView) r8
            r7.f118939i = r8
        L_0x005b:
            android.view.View r8 = r7.f118926C
            if (r8 != 0) goto L_0x0062
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0062:
            r9 = 2132023234(0x7f1417c2, float:1.968491E38)
            android.view.View r8 = r8.findViewById(r9)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r8 = (com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout) r8
            r7.f118932b = r8
            android.view.View r8 = r7.f118926C
            if (r8 != 0) goto L_0x0074
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0074:
            r9 = 2132020273(0x7f140c31, float:1.9678904E38)
            android.view.View r8 = r8.findViewById(r9)
            r7.f118924A = r8
            android.view.View r8 = r7.f118926C
            if (r8 != 0) goto L_0x0084
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0084:
            r9 = 2132022446(0x7f1414ae, float:1.9683312E38)
            android.view.View r8 = r8.findViewById(r9)
            android.support.v7.widget.RecyclerView r8 = (android.support.p043v7.widget.RecyclerView) r8
            r7.f118938h = r8
            android.view.View r8 = r7.f118926C
            if (r8 != 0) goto L_0x0096
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0096:
            r9 = 2132023415(0x7f141877, float:1.9685277E38)
            android.view.View r8 = r8.findViewById(r9)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            r7.f118956z = r8
            android.view.View r8 = r7.f118926C
            if (r8 != 0) goto L_0x00a8
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00a8:
            r9 = 2132022109(0x7f14135d, float:1.9682628E38)
            android.view.View r8 = r8.findViewById(r9)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r7.f118955y = r8
            android.view.View r8 = r7.f118926C
            if (r8 != 0) goto L_0x00ba
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ba:
            r9 = 2132018124(0x7f1403cc, float:1.9674546E38)
            android.view.View r8 = r8.findViewById(r9)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r7.f118954x = r8
            android.view.View r8 = r7.f118926C
            if (r8 != 0) goto L_0x00cc
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00cc:
            r9 = 2132022444(0x7f1414ac, float:1.9683308E38)
            android.view.View r8 = r8.findViewById(r9)
            android.support.v7.widget.RecyclerView r8 = (android.support.p043v7.widget.RecyclerView) r8
            r7.f118937g = r8
            android.view.View r8 = r7.f118924A
            if (r8 != 0) goto L_0x00de
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00de:
            r9 = r7
            android.view.View$OnClickListener r9 = (android.view.View.OnClickListener) r9
            r8.setOnClickListener(r9)
            int r8 = r7.f118930G
            r9 = 2
            r0 = 0
            r2 = 8
            r3 = 0
            if (r8 != 0) goto L_0x0104
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r8 = r7.f118932b
            if (r8 == 0) goto L_0x00f4
            r8.setVisibility(r2)
        L_0x00f4:
            android.view.View r8 = r7.f118925B
            if (r8 == 0) goto L_0x00fb
            r8.setVisibility(r3)
        L_0x00fb:
            android.widget.FrameLayout r8 = r7.f118956z
            if (r8 == 0) goto L_0x024d
            r8.setVisibility(r2)
            goto L_0x024d
        L_0x0104:
            int r8 = r7.f118930G
            if (r8 != r9) goto L_0x011f
            com.ss.android.ugc.aweme.services.IAVServiceProxy r8 = com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin()
            java.lang.String r4 = "ServiceManager.get().get…ServiceProxy::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r4)
            com.ss.android.ugc.aweme.services.IAVServiceProxy r8 = (com.p683ss.android.ugc.aweme.services.IAVServiceProxy) r8
            com.ss.android.ugc.aweme.port.in.aa r8 = r8.getAccountService()
            boolean r8 = r8.mo74282b()
            if (r8 == 0) goto L_0x011f
            r8 = 1
            goto L_0x0120
        L_0x011f:
            r8 = 0
        L_0x0120:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r4 = r7.f118932b
            if (r4 == 0) goto L_0x0127
            r4.setVisibility(r2)
        L_0x0127:
            android.view.View r4 = r7.f118925B
            if (r4 == 0) goto L_0x012e
            r4.setVisibility(r2)
        L_0x012e:
            android.widget.FrameLayout r4 = r7.f118956z
            if (r4 == 0) goto L_0x0135
            r4.setVisibility(r3)
        L_0x0135:
            r4 = 2132543984(0x7f1c09f0, float:2.0741117E38)
            if (r8 != 0) goto L_0x0184
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r8 = r7.f118932b
            if (r8 == 0) goto L_0x0141
            r8.setVisibility(r2)
        L_0x0141:
            android.widget.FrameLayout r8 = r7.f118956z
            if (r8 == 0) goto L_0x0148
            r8.setVisibility(r3)
        L_0x0148:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r8 = r7.f118932b
            if (r8 == 0) goto L_0x0151
            android.content.Context r8 = r8.getContext()
            goto L_0x0152
        L_0x0151:
            r8 = r0
        L_0x0152:
            int r2 = r7.f118930G
            if (r2 != 0) goto L_0x0158
            r2 = 1
            goto L_0x0159
        L_0x0158:
            r2 = 0
        L_0x0159:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r8 = com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C46784a.m101615a(r8, r2)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r2 = r7.f118932b
            if (r2 == 0) goto L_0x0172
            android.content.Context r2 = r2.getContext()
            if (r2 == 0) goto L_0x0172
            android.content.res.Resources r2 = r2.getResources()
            if (r2 == 0) goto L_0x0172
            java.lang.String r2 = r2.getString(r4)
            goto L_0x0173
        L_0x0172:
            r2 = r0
        L_0x0173:
            r8.setText(r2)
            r8.mo93988a(r1)
            android.widget.FrameLayout r1 = r7.f118956z
            if (r1 == 0) goto L_0x024d
            android.view.View r8 = (android.view.View) r8
            r1.addView(r8)
            goto L_0x024d
        L_0x0184:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r8 = r7.f118932b
            if (r8 == 0) goto L_0x018b
            r8.setVisibility(r3)
        L_0x018b:
            android.widget.FrameLayout r8 = r7.f118956z
            if (r8 == 0) goto L_0x0192
            r8.setVisibility(r2)
        L_0x0192:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r8 = r7.f118932b
            if (r8 == 0) goto L_0x024d
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r2 = r7.f118932b
            if (r2 == 0) goto L_0x019d
            r2.setMaxTabModeForCount(r9)
        L_0x019d:
            android.content.Context r2 = r8.getContext()
            int r5 = r7.f118930G
            if (r5 != 0) goto L_0x01a7
            r5 = 1
            goto L_0x01a8
        L_0x01a7:
            r5 = 0
        L_0x01a8:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r2 = com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C46784a.m101615a(r2, r5)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r5 = r8.mo90678a()
            r6 = r2
            android.view.View r6 = (android.view.View) r6
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r5 = r5.mo90742a(r6)
            r8.mo90684a(r5)
            com.ss.android.ugc.aweme.tools.music.a.a$g r5 = new com.ss.android.ugc.aweme.tools.music.a.a$g
            r5.<init>(r7)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r2.setOnClickListener(r5)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r2 = r8.mo90679a(r3)
            if (r2 == 0) goto L_0x01cd
            android.view.View r2 = r2.f113162f
            goto L_0x01ce
        L_0x01cd:
            r2 = r0
        L_0x01ce:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r2 = (com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView) r2
            if (r2 == 0) goto L_0x01e6
            android.content.Context r5 = r8.getContext()
            java.lang.String r6 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            android.content.res.Resources r5 = r5.getResources()
            java.lang.String r4 = r5.getString(r4)
            r2.setText(r4)
        L_0x01e6:
            android.content.Context r2 = r8.getContext()
            int r4 = r7.f118930G
            if (r4 != 0) goto L_0x01f0
            r4 = 1
            goto L_0x01f1
        L_0x01f0:
            r4 = 0
        L_0x01f1:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r2 = com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C46784a.m101615a(r2, r4)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r4 = r8.mo90678a()
            r5 = r2
            android.view.View r5 = (android.view.View) r5
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r4 = r4.mo90742a(r5)
            r8.mo90684a(r4)
            com.ss.android.ugc.aweme.tools.music.a.a$h r4 = new com.ss.android.ugc.aweme.tools.music.a.a$h
            r4.<init>(r7)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r2.setOnClickListener(r4)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r1 = r8.mo90679a(r1)
            if (r1 == 0) goto L_0x0216
            android.view.View r1 = r1.f113162f
            goto L_0x0217
        L_0x0216:
            r1 = r0
        L_0x0217:
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabItemView r1 = (com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView) r1
            if (r1 == 0) goto L_0x0232
            android.content.Context r2 = r8.getContext()
            java.lang.String r4 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2132543983(0x7f1c09ef, float:2.0741115E38)
            java.lang.String r2 = r2.getString(r4)
            r1.setText(r2)
        L_0x0232:
            com.ss.android.ugc.aweme.tools.music.a.a$i r1 = new com.ss.android.ugc.aweme.tools.music.a.a$i
            r1.<init>(r7)
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$c r1 = (com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C44704c) r1
            r8.mo90683a(r1)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r8 = r7.f118932b
            if (r8 == 0) goto L_0x024d
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r1 = r7.f118932b
            if (r1 == 0) goto L_0x0249
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f r1 = r1.mo90679a(r3)
            goto L_0x024a
        L_0x0249:
            r1 = r0
        L_0x024a:
            r8.mo90693b(r1)
        L_0x024d:
            android.support.v7.widget.RecyclerView r8 = r7.f118938h
            if (r8 == 0) goto L_0x0263
            android.support.v7.widget.LinearLayoutManager r1 = new android.support.v7.widget.LinearLayoutManager
            android.support.v7.widget.RecyclerView r2 = r7.f118938h
            if (r2 == 0) goto L_0x025b
            android.content.Context r0 = r2.getContext()
        L_0x025b:
            r1.<init>(r0, r3, r3)
            android.support.v7.widget.RecyclerView$i r1 = (android.support.p043v7.widget.RecyclerView.C1332i) r1
            r8.setLayoutManager(r1)
        L_0x0263:
            int r8 = r7.f118930G
            if (r8 != r9) goto L_0x02c9
            android.view.View r8 = r7.f118926C
            if (r8 != 0) goto L_0x026e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x026e:
            r9 = 2132018703(0x7f14060f, float:1.967572E38)
            android.view.View r8 = r8.findViewById(r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.f118944n = r8
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r8 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
            android.support.v7.app.AppCompatActivity r9 = r7.f118951u
            android.content.Context r9 = (android.content.Context) r9
            r8.<init>(r9, r3, r3)
            android.support.v7.widget.RecyclerView r9 = r7.f118937g
            if (r9 == 0) goto L_0x028b
            android.support.v7.widget.RecyclerView$i r8 = (android.support.p043v7.widget.RecyclerView.C1332i) r8
            r9.setLayoutManager(r8)
        L_0x028b:
            com.ss.android.ugc.aweme.tools.music.d.a.a r8 = new com.ss.android.ugc.aweme.tools.music.d.a.a
            int r9 = r7.f118930G
            com.ss.android.ugc.aweme.tools.music.a.a$c r0 = new com.ss.android.ugc.aweme.tools.music.a.a$c
            r0.<init>(r7)
            com.ss.android.ugc.aweme.bw.a.j r0 = (com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24441j) r0
            r8.<init>(r9, r0)
            r7.f118945o = r8
            com.ss.android.ugc.aweme.tools.music.d.a.a r8 = r7.f118945o
            if (r8 == 0) goto L_0x02a3
            com.ss.android.ugc.aweme.bw.a.k r9 = r7.f118947q
            r8.f119083j = r9
        L_0x02a3:
            com.ss.android.ugc.aweme.tools.music.d.a.a r8 = r7.f118945o
            if (r8 == 0) goto L_0x02b1
            com.ss.android.ugc.aweme.tools.music.a.a$d r9 = new com.ss.android.ugc.aweme.tools.music.a.a$d
            r9.<init>(r7)
            com.ss.android.ugc.aweme.common.a.j$a r9 = (com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a) r9
            r8.mo54788a(r9)
        L_0x02b1:
            android.support.v7.widget.RecyclerView r8 = r7.f118937g
            if (r8 == 0) goto L_0x02bc
            com.ss.android.ugc.aweme.tools.music.d.a.a r9 = r7.f118945o
            android.support.v7.widget.RecyclerView$a r9 = (android.support.p043v7.widget.RecyclerView.C1322a) r9
            r8.setAdapter(r9)
        L_0x02bc:
            com.ss.android.ugc.aweme.tools.music.d.a.b r8 = com.p683ss.android.ugc.aweme.tools.music.p2364d.p2365a.C47172b.C47173a.m102427a()
            com.ss.android.ugc.aweme.tools.music.a.a$e r9 = new com.ss.android.ugc.aweme.tools.music.a.a$e
            r9.<init>(r7)
            com.ss.android.ugc.aweme.port.in.ab$k r9 = (com.p683ss.android.ugc.aweme.port.p2082in.C39529ab.C39540k) r9
            r8.f119097a = r9
        L_0x02c9:
            com.ss.android.ugc.aweme.music.service.IMusicService r8 = com.p683ss.android.ugc.aweme.component.music.MusicService.createIMusicServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.music.service.IMusicService r8 = (com.p683ss.android.ugc.aweme.music.service.IMusicService) r8
            r9 = r7
            com.ss.android.ugc.aweme.music.ui.m r9 = (com.p683ss.android.ugc.aweme.music.p1978ui.C37625m) r9
            com.ss.android.ugc.aweme.music.a r8 = r8.provideMusicDownloadPlayHelper(r9)
            r7.f118936f = r8
            com.ss.android.ugc.aweme.tools.music.aichoosemusic.c r8 = new com.ss.android.ugc.aweme.tools.music.aichoosemusic.c
            r8.<init>()
            r7.f118935e = r8
            com.ss.android.ugc.aweme.tools.music.aichoosemusic.c r8 = r7.f118935e
            if (r8 == 0) goto L_0x02e7
            com.ss.android.ugc.asve.c.c r9 = r7.f118929F
            r8.f119060a = r9
        L_0x02e7:
            com.ss.android.ugc.aweme.tools.music.aichoosemusic.c r8 = r7.f118935e
            if (r8 == 0) goto L_0x02ef
            r0 = 10
            r8.f119063d = r0
        L_0x02ef:
            com.ss.android.ugc.aweme.tools.music.d.b r8 = new com.ss.android.ugc.aweme.tools.music.d.b
            int r9 = r7.f118930G
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r7.f118928E
            com.ss.android.ugc.aweme.tools.music.a.a$f r1 = new com.ss.android.ugc.aweme.tools.music.a.a$f
            r1.<init>(r7)
            com.ss.android.ugc.aweme.bw.a.j r1 = (com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24441j) r1
            r8.<init>(r9, r0, r1)
            r7.f118934d = r8
            com.ss.android.ugc.aweme.tools.music.d.b r8 = r7.f118934d
            if (r8 == 0) goto L_0x0309
            com.ss.android.ugc.aweme.bw.a.k r9 = r7.f118947q
            r8.f119125c = r9
        L_0x0309:
            android.support.v7.widget.RecyclerView r8 = r7.f118938h
            if (r8 == 0) goto L_0x0314
            com.ss.android.ugc.aweme.tools.music.d.b r9 = r7.f118934d
            android.support.v7.widget.RecyclerView$a r9 = (android.support.p043v7.widget.RecyclerView.C1322a) r9
            r8.setAdapter(r9)
        L_0x0314:
            r7.m102290n()
            return
        L_0x0318:
            r7.f118927D = r1
            r7.m102290n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.music.p2361a.C47105a.mo80596a(android.support.v7.app.AppCompatActivity, android.widget.FrameLayout):void");
    }

    /* renamed from: a */
    public final void mo94377a(C39526a aVar, MusicModel musicModel) {
        List<? extends MusicModel> list;
        boolean z;
        C52711k.m112240b(musicModel, "it");
        if (!(aVar == null || this.f118942l == null)) {
            C39526a aVar2 = this.f118942l;
            if (aVar2 != null) {
                List<? extends MusicModel> list2 = aVar.f101102a;
                if (list2 == null || list2.isEmpty()) {
                    list = C52575l.m112101c(musicModel);
                } else {
                    Iterable iterable = list2;
                    Collection arrayList = new ArrayList();
                    for (Object next : iterable) {
                        if (((MusicModel) next).getId() != musicModel.getId()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    list = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
                    list.add(0, musicModel);
                }
                aVar2.f101102a = list;
            }
        }
        RecyclerView recyclerView = this.f118938h;
        if (recyclerView != null) {
            recyclerView.post(new C47125m(this));
        }
    }

    /* renamed from: a */
    public final void mo50813a(MusicModel musicModel, Exception exc) {
        MusicModel musicModel2;
        Object obj;
        MusicModel musicModel3;
        Object obj2;
        C52711k.m112240b(exc, "e");
        int i = -1;
        String str = null;
        if (this.f118941k == 0) {
            C52711k.m112240b(exc, "e");
            C47182b bVar = this.f118934d;
            if (bVar != null) {
                musicModel3 = bVar.mo94423e();
            } else {
                musicModel3 = null;
            }
            if (musicModel3 != null) {
                obj2 = musicModel3.getMusicId();
            } else {
                obj2 = null;
            }
            if (musicModel != null) {
                str = musicModel.getMusicId();
            }
            if (!(!C52711k.m112239a(obj2, (Object) str))) {
                C47182b bVar2 = this.f118934d;
                if (bVar2 != null) {
                    bVar2.mo80643c();
                }
                C47182b bVar3 = this.f118934d;
                if (bVar3 != null) {
                    C47182b bVar4 = this.f118934d;
                    if (bVar4 != null) {
                        i = bVar4.mo80635a();
                    }
                    bVar3.mo80641b(i);
                }
                mo80606b(false);
            }
            return;
        }
        C52711k.m112240b(exc, "e");
        C47166a aVar = this.f118945o;
        if (aVar != null) {
            musicModel2 = aVar.mo94411k();
        } else {
            musicModel2 = null;
        }
        if (musicModel2 != null) {
            obj = musicModel2.getMusicId();
        } else {
            obj = null;
        }
        if (musicModel != null) {
            str = musicModel.getMusicId();
        }
        if (!(!C52711k.m112239a(obj, (Object) str))) {
            C47166a aVar2 = this.f118945o;
            if (aVar2 != null) {
                aVar2.mo94412l();
            }
            C47166a aVar3 = this.f118945o;
            if (aVar3 != null) {
                C47166a aVar4 = this.f118945o;
                if (aVar4 != null) {
                    i = aVar4.mo94410j();
                }
                aVar3.mo80626g_(i);
            }
            mo80606b(false);
        }
    }

    public C47105a(AppCompatActivity appCompatActivity, C20347c cVar, C24430a aVar, int i) {
        C52711k.m112240b(appCompatActivity, "mActivity");
        C52711k.m112240b(aVar, "aiMusicConfig");
        this.f118951u = appCompatActivity;
        this.f118929F = cVar;
        this.f118952v = aVar;
        this.f118930G = i;
    }
}
