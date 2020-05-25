package com.p683ss.android.ugc.aweme.commercialize.views;

import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26542y;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30178a;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.c */
public final class C26682c implements C38871j {

    /* renamed from: h */
    public static final C26683a f70296h = new C26683a(null);

    /* renamed from: l */
    private static final String f70297l = C26682c.class.getSimpleName();

    /* renamed from: a */
    public final ArrayList<C38871j> f70298a = new ArrayList<>();

    /* renamed from: b */
    public final C30178a f70299b = new C30178a();

    /* renamed from: c */
    public final VideoViewComponent f70300c = new VideoViewComponent();

    /* renamed from: d */
    public final C26542y f70301d;

    /* renamed from: e */
    public final C48121w f70302e = new C48121w();

    /* renamed from: f */
    public boolean f70303f;

    /* renamed from: g */
    public final C26684b f70304g = new C26684b(this);

    /* renamed from: i */
    private View f70305i;

    /* renamed from: j */
    private final ViewGroup f70306j;

    /* renamed from: k */
    private final Aweme f70307k;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.c$a */
    public static final class C26683a {
        private C26683a() {
        }

        public /* synthetic */ C26683a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.c$b */
    public static final class C26684b implements C50161j {

        /* renamed from: a */
        final /* synthetic */ C26682c f70308a;

        public final void aD_() {
        }

        /* renamed from: b */
        public final void mo54505b(int i, int i2) {
        }

        C26684b(C26682c cVar) {
            this.f70308a = cVar;
        }

        /* renamed from: a */
        public final void mo54503a(int i, int i2) {
            if (this.f70308a.f70303f) {
                if (this.f70308a.f70299b.f78757a == 0) {
                    this.f70308a.mo54499b();
                    return;
                }
                this.f70308a.mo54500c();
            }
        }
    }

    /* renamed from: a */
    public final void mo53528a(String str, boolean z) {
    }

    /* renamed from: a */
    public final int mo54497a() {
        return this.f70299b.f78757a;
    }

    /* renamed from: e */
    public final void mo54502e() {
        if (this.f70299b.f78757a != 0) {
            mo54500c();
        }
    }

    /* renamed from: b */
    public final void mo54499b() {
        C26542y yVar = this.f70301d;
        if (!(!yVar.mo54223b() || yVar.mo54222a() == null || yVar.f69883f == null)) {
            yVar.f69883f.mo95284a(yVar.f69881d);
            yVar.f69883f.mo95281a(yVar.f69880c.mo97952b());
            yVar.f69883f.mo95274a(yVar.f69882e.mo54099a(yVar.f69878a), true);
        }
        this.f70301d.mo54224c();
        this.f70299b.f78757a = 2;
    }

    /* renamed from: c */
    public final void mo54500c() {
        this.f70301d.mo54224c();
        C26542y yVar = this.f70301d;
        if (!(!yVar.mo54223b() || yVar.mo54222a() == null || yVar.f69883f == null)) {
            yVar.f69883f.mo95284a(yVar.f69881d);
            yVar.f69883f.mo95281a(yVar.f69880c.mo97952b());
            yVar.f69883f.mo95272a(yVar.f69882e.mo54099a(yVar.f69878a), yVar.f69881d);
        }
        this.f70299b.f78757a = 4;
    }

    /* renamed from: d */
    public final void mo54501d() {
        C26542y yVar = this.f70301d;
        if (yVar.f69883f != null) {
            yVar.f69883f.mo95293z();
        }
        this.f70299b.f78757a = 3;
        if (!C48121w.m104087I()) {
            this.f70302e.mo95269F();
            return;
        }
        C26542y yVar2 = this.f70301d;
        if (yVar2.f69883f != null) {
            yVar2.f69883f.mo95269F();
        }
    }

    /* renamed from: a */
    public final void mo53523a(float f) {
        for (C38871j a : this.f70298a) {
            a.mo53523a(f);
        }
    }

    /* renamed from: b */
    public final void mo53530b(C50112d dVar) {
        for (C38871j b : this.f70298a) {
            b.mo53530b(dVar);
        }
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
        for (C38871j c : this.f70298a) {
            c.mo53533c(str);
        }
    }

    /* renamed from: d */
    public final void mo53534d(String str) {
        for (C38871j d : this.f70298a) {
            d.mo53534d(str);
        }
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
        for (C38871j e : this.f70298a) {
            e.mo53535e(str);
        }
    }

    /* renamed from: a */
    public final void mo54498a(int i) {
        C26542y yVar = this.f70301d;
        if (!(!yVar.mo54223b() || yVar.mo54222a() == null || yVar.f69883f == null)) {
            yVar.f69883f.mo95284a(yVar.f69881d);
            yVar.f69883f.mo95281a(yVar.f69880c.mo97952b());
            yVar.f69883f.mo95275a(yVar.f69882e.mo54099a(yVar.f69878a), true, i);
        }
        this.f70301d.mo54224c();
        this.f70299b.f78757a = 2;
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        for (C38871j a : this.f70298a) {
            a.mo53524a(dVar);
        }
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        for (C38871j b : this.f70298a) {
            b.mo53531b(str);
        }
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        for (C38871j a : this.f70298a) {
            a.mo53525a(fVar);
        }
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
        for (C38871j b : this.f70298a) {
            b.mo53532b(z);
        }
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
        for (C38871j a : this.f70298a) {
            a.mo53526a(gVar);
        }
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        for (C38871j a : this.f70298a) {
            a.mo53527a(str);
        }
    }

    /* renamed from: a */
    public final void mo53529a(boolean z) {
        for (C38871j a : this.f70298a) {
            a.mo53529a(z);
        }
    }

    public C26682c(ViewGroup viewGroup, Aweme aweme) {
        C52711k.m112240b(viewGroup, "mRootView");
        this.f70306j = viewGroup;
        this.f70307k = aweme;
        this.f70300c.mo97916a(this.f70306j);
        C50160i iVar = this.f70300c.f125619b;
        C52711k.m112236a((Object) iVar, "mVideoViewComponent.surfaceHolder");
        View a = iVar.mo97949a();
        C52711k.m112236a((Object) a, "mVideoViewComponent.surfaceHolder.view");
        this.f70305i = a;
        this.f70301d = new C26542y(this.f70300c, this);
        if (!C48121w.m104087I()) {
            this.f70301d.f69883f = this.f70302e;
        }
        C26542y yVar = this.f70301d;
        Aweme aweme2 = this.f70307k;
        if (aweme2 != null) {
            if (aweme2.getAwemeType() == 13) {
                yVar.f69879b = aweme2;
                yVar.f69878a = aweme2.getForwardItem();
            } else {
                yVar.f69879b = null;
                yVar.f69878a = aweme2;
            }
        }
        this.f70300c.mo97918a((C50161j) this.f70304g);
    }
}
