package com.p683ss.android.ugc.aweme.longvideonew.p1935a;

import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25724m;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30178a;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30181a;
import com.p683ss.android.ugc.aweme.longvideo.C36385k;
import com.p683ss.android.ugc.aweme.newfollow.util.C37937e;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.video.preload.C48072b;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.ArrayList;
import java.util.Iterator;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.a.a */
public final class C36397a implements C38871j, C48072b {

    /* renamed from: o */
    public static final C36398a f93208o = new C36398a(null);

    /* renamed from: a */
    public final ArrayList<C36399b> f93209a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<C38871j> f93210b = new ArrayList<>();

    /* renamed from: c */
    public final C30178a f93211c = new C30178a();

    /* renamed from: d */
    public final VideoViewComponent f93212d = new VideoViewComponent();

    /* renamed from: e */
    public final C37937e f93213e;

    /* renamed from: f */
    public final C48121w f93214f = new C48121w(true);

    /* renamed from: g */
    public C36400c f93215g;

    /* renamed from: h */
    public C25724m f93216h;

    /* renamed from: i */
    public final C50161j f93217i = new C36401d(this);

    /* renamed from: j */
    public final ViewGroup f93218j;

    /* renamed from: k */
    public final Aweme f93219k;

    /* renamed from: l */
    public final boolean f93220l;

    /* renamed from: m */
    public final boolean f93221m;

    /* renamed from: n */
    public final int f93222n;

    /* renamed from: p */
    private View f93223p;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.a.a$a */
    public static final class C36398a {
        private C36398a() {
        }

        public /* synthetic */ C36398a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.a.a$b */
    public interface C36399b {
        /* renamed from: a */
        boolean mo75341a();
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.a.a$c */
    public interface C36400c {
        /* renamed from: a */
        void mo75342a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.a.a$d */
    public static final class C36401d implements C50161j {

        /* renamed from: a */
        final /* synthetic */ C36397a f93224a;

        public final void aD_() {
        }

        /* renamed from: b */
        public final void mo54505b(int i, int i2) {
        }

        C36401d(C36397a aVar) {
            this.f93224a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo54503a(int r3, int r4) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.longvideonew.a.a r3 = r2.f93224a
                com.ss.android.ugc.aweme.feed.d.a r3 = r3.f93211c
                int r3 = r3.f78757a
                if (r3 != 0) goto L_0x008b
                com.ss.android.ugc.aweme.longvideonew.a.a r3 = r2.f93224a
                int r3 = r3.f93222n
                if (r3 <= 0) goto L_0x0018
                com.ss.android.ugc.aweme.longvideonew.a.a r3 = r2.f93224a
                com.ss.android.ugc.aweme.longvideonew.a.a r4 = r2.f93224a
                int r4 = r4.f93222n
                r3.mo75336a(r4)
                return
            L_0x0018:
                com.ss.android.ugc.aweme.longvideonew.a.a r3 = r2.f93224a
                boolean r3 = r3.f93220l
                if (r3 == 0) goto L_0x0085
                com.ss.android.ugc.aweme.longvideonew.a.a r3 = r2.f93224a
                boolean r3 = r3.f93221m
                if (r3 == 0) goto L_0x0085
                com.ss.android.ugc.aweme.longvideonew.a.a r3 = r2.f93224a
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f93219k
                com.ss.android.ugc.aweme.feed.model.LongVideo r3 = com.p683ss.android.ugc.aweme.longvideo.C36380h.m82107a(r3)
                if (r3 == 0) goto L_0x0033
                int r3 = r3.getTrailerStartTime()
                goto L_0x0034
            L_0x0033:
                r3 = -1
            L_0x0034:
                if (r3 != 0) goto L_0x007f
                com.ss.android.ugc.aweme.longvideonew.a.a r3 = r2.f93224a
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f93219k
                if (r3 == 0) goto L_0x0041
                java.lang.String r3 = r3.getAid()
                goto L_0x0042
            L_0x0041:
                r3 = 0
            L_0x0042:
                com.ss.android.ugc.aweme.video.a r3 = com.p683ss.android.ugc.aweme.video.C48121w.m104267c(r3)
                int r4 = r3.f120604b
                long r0 = r3.f120603a
                int r3 = (int) r0
                r0 = 1950(0x79e, float:2.733E-42)
                if (r4 <= 0) goto L_0x0070
                com.ss.android.ugc.aweme.longvideonew.a.a r3 = r2.f93224a
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f93219k
                if (r3 == 0) goto L_0x0060
                com.ss.android.ugc.aweme.feed.model.Video r3 = r3.getVideo()
                if (r3 == 0) goto L_0x0060
                int r3 = r3.getDuration()
                goto L_0x0061
            L_0x0060:
                r3 = 0
            L_0x0061:
                if (r3 <= r0) goto L_0x006a
                int r3 = r3 - r0
                com.ss.android.ugc.aweme.longvideonew.a.a r4 = r2.f93224a
                r4.mo75336a(r3)
                goto L_0x0090
            L_0x006a:
                com.ss.android.ugc.aweme.longvideonew.a.a r3 = r2.f93224a
                r3.mo75335a()
                goto L_0x0090
            L_0x0070:
                if (r3 <= r0) goto L_0x0079
                int r3 = r3 - r0
                com.ss.android.ugc.aweme.longvideonew.a.a r4 = r2.f93224a
                r4.mo75336a(r3)
                goto L_0x0090
            L_0x0079:
                com.ss.android.ugc.aweme.longvideonew.a.a r3 = r2.f93224a
                r3.mo75335a()
                goto L_0x0090
            L_0x007f:
                com.ss.android.ugc.aweme.longvideonew.a.a r3 = r2.f93224a
                r3.mo75335a()
                goto L_0x0090
            L_0x0085:
                com.ss.android.ugc.aweme.longvideonew.a.a r3 = r2.f93224a
                r3.mo75335a()
                return
            L_0x008b:
                com.ss.android.ugc.aweme.longvideonew.a.a r3 = r2.f93224a
                r3.mo75338b()
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.longvideonew.p1935a.C36397a.C36401d.mo54503a(int, int):void");
        }
    }

    /* renamed from: a */
    public final void mo53528a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        for (C38871j a : this.f93210b) {
            a.mo53527a(str);
        }
    }

    /* renamed from: a */
    public final void mo53529a(boolean z) {
        for (C38871j a : this.f93210b) {
            a.mo53529a(z);
        }
    }

    /* renamed from: a */
    public final void mo62821a(String str, long j, long j2) {
        int i = j == 0 ? 0 : (int) (((float) j2) / ((float) j));
        C36400c cVar = this.f93215g;
        if (cVar != null) {
            cVar.mo75342a(i);
        }
    }

    /* renamed from: d */
    private final boolean m82130d() {
        Iterator it = this.f93209a.iterator();
        while (it.hasNext()) {
            if (!((C36399b) it.next()).mo75341a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo75335a() {
        if (m82130d()) {
            this.f93213e.mo77409f();
            this.f93213e.mo77411i();
            this.f93211c.f78757a = 2;
        }
    }

    /* renamed from: b */
    public final void mo75338b() {
        if (m82130d()) {
            this.f93213e.mo77411i();
            this.f93213e.mo77410g();
            this.f93211c.f78757a = 4;
        }
    }

    /* renamed from: c */
    public final void mo75340c() {
        this.f93213e.mo77408e();
        this.f93211c.f78757a = 3;
        if (!C48121w.m104087I()) {
            this.f93214f.mo95269F();
        } else {
            this.f93213e.mo77412j();
        }
    }

    /* renamed from: a */
    public final void mo75336a(int i) {
        if (m82130d()) {
            this.f93213e.mo77403a(i);
            this.f93213e.mo77411i();
            this.f93211c.f78757a = 2;
        }
    }

    /* renamed from: b */
    public final void mo75339b(float f) {
        if (!C48121w.m104087I()) {
            this.f93214f.mo95279a(f);
        } else {
            this.f93213e.mo77402a(f);
        }
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
        mo75340c();
        mo75339b(0.0f);
        for (C38871j c : this.f93210b) {
            c.mo53533c(str);
        }
    }

    /* renamed from: d */
    public final void mo53534d(String str) {
        for (C38871j d : this.f93210b) {
            d.mo53534d(str);
        }
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
        C48107j.m104193f().mo95342a((C48072b) this);
        for (C38871j e : this.f93210b) {
            e.mo53535e(str);
        }
    }

    /* renamed from: a */
    public final void mo53523a(float f) {
        long j;
        long j2;
        for (C38871j a : this.f93210b) {
            a.mo53523a(f);
        }
        C25724m mVar = this.f93216h;
        if (mVar != null && mVar.f68037a) {
            C25724m mVar2 = this.f93216h;
            if (mVar2 != null) {
                j = mVar2.f68038b;
            } else {
                j = 0;
            }
            C25724m mVar3 = this.f93216h;
            if (mVar3 != null) {
                j2 = mVar3.f68039c;
            } else {
                j2 = 0;
            }
            long d = this.f93213e.mo77407d();
            long c = this.f93213e.mo77406c();
            if (d >= 0 && c > 0 && (j > d || j2 < d)) {
                mo75339b((((float) j) / ((float) c)) * 100.0f);
            }
        }
    }

    /* renamed from: b */
    public final void mo53530b(C50112d dVar) {
        for (C38871j b : this.f93210b) {
            b.mo53530b(dVar);
        }
    }

    /* renamed from: a */
    public final void mo75337a(C38871j jVar) {
        if (jVar != null && !this.f93210b.contains(jVar)) {
            this.f93210b.add(jVar);
        }
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        for (C38871j b : this.f93210b) {
            b.mo53531b(str);
        }
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        for (C38871j a : this.f93210b) {
            a.mo53524a(dVar);
        }
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
        for (C38871j b : this.f93210b) {
            b.mo53532b(z);
        }
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        for (C38871j a : this.f93210b) {
            a.mo53525a(fVar);
        }
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
        for (C38871j a : this.f93210b) {
            a.mo53526a(gVar);
        }
    }

    public C36397a(ViewGroup viewGroup, Aweme aweme, boolean z, boolean z2, int i) {
        C52711k.m112240b(viewGroup, "mRootView");
        this.f93218j = viewGroup;
        this.f93219k = aweme;
        this.f93220l = z;
        this.f93221m = z2;
        this.f93222n = i;
        this.f93212d.mo97916a(this.f93218j);
        C50160i iVar = this.f93212d.f125619b;
        C52711k.m112236a((Object) iVar, "mVideoViewComponent.surfaceHolder");
        View a = iVar.mo97949a();
        C52711k.m112236a((Object) a, "mVideoViewComponent.surfaceHolder.view");
        this.f93223p = a;
        C36385k kVar = C36385k.f93161b;
        if (kVar.mo75308a(this.f93219k) == null) {
            kVar = C36385k.f93160a;
        }
        this.f93213e = new C37937e(this.f93212d, (C38871j) this, (C30181a) null, kVar);
        if (!C48121w.m104087I()) {
            this.f93213e.f96594a = this.f93214f;
        }
        this.f93213e.mo77404a(this.f93219k);
        this.f93212d.mo97918a(this.f93217i);
    }
}
