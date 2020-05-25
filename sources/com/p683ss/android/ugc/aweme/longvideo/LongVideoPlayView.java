package com.p683ss.android.ugc.aweme.longvideo;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30178a;
import com.p683ss.android.ugc.aweme.longvideo.feature.NoOperateModeController;
import com.p683ss.android.ugc.aweme.longvideo.p1933a.C36349a;
import com.p683ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel;
import com.p683ss.android.ugc.aweme.newfollow.util.C37937e;
import com.p683ss.android.ugc.aweme.p1382aq.C23216au;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.video.preload.C48072b;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.ArrayList;
import java.util.Iterator;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayView */
public final class LongVideoPlayView implements C0183j, C36348a, C38871j, C48072b {

    /* renamed from: q */
    public static final C36344a f93034q = new C36344a(null);

    /* renamed from: a */
    C37937e f93035a;

    /* renamed from: b */
    public final C30178a f93036b = new C30178a();

    /* renamed from: c */
    C36345b f93037c;

    /* renamed from: d */
    public C36350b f93038d;

    /* renamed from: e */
    final ArrayList<C36366c> f93039e = new ArrayList<>();

    /* renamed from: f */
    public Aweme f93040f;

    /* renamed from: g */
    public String f93041g = "";

    /* renamed from: h */
    public int f93042h;

    /* renamed from: i */
    public final C50161j f93043i;

    /* renamed from: j */
    public final OnClickListener f93044j;

    /* renamed from: k */
    public final LongVideoPlayActivity f93045k;

    /* renamed from: l */
    public final C36385k f93046l;

    /* renamed from: m */
    public final VideoViewComponent f93047m;

    /* renamed from: n */
    public final AnimatedImageView f93048n;

    /* renamed from: o */
    public final ImageView f93049o;

    /* renamed from: p */
    public final C48121w f93050p;

    /* renamed from: r */
    private final String f93051r = "LongVideoPlayView";

    /* renamed from: s */
    private final ArrayList<C38871j> f93052s = new ArrayList<>();

    /* renamed from: t */
    private LongVideoMobViewModel f93053t;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$a */
    public static final class C36344a {
        private C36344a() {
        }

        public /* synthetic */ C36344a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$b */
    public interface C36345b {
        /* renamed from: a */
        View mo75248a();

        /* renamed from: b */
        void mo75249b();

        /* renamed from: c */
        void mo75250c();
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$c */
    static final class C36346c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayView f93055a;

        C36346c(LongVideoPlayView longVideoPlayView) {
            this.f93055a = longVideoPlayView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C47718bf.m103288a(new C36349a());
            LongVideoPlayView longVideoPlayView = this.f93055a;
            if (longVideoPlayView.f93036b.f78757a == 3) {
                longVideoPlayView.f93049o.setVisibility(8);
                longVideoPlayView.mo75258b();
                return;
            }
            new C23216au().mo48019c(longVideoPlayView.f93040f, longVideoPlayView.f93042h).mo48018a(longVideoPlayView.f93041g).mo48017a(1).mo48076e();
            longVideoPlayView.mo75260c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$d */
    public static final class C36347d implements C50161j {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayView f93056a;

        public final void aD_() {
        }

        /* renamed from: b */
        public final void mo54505b(int i, int i2) {
        }

        C36347d(LongVideoPlayView longVideoPlayView) {
            this.f93056a = longVideoPlayView;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo54503a(int r3, int r4) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f93056a
                com.ss.android.ugc.aweme.feed.d.a r3 = r3.f93036b
                int r3 = r3.f78757a
                if (r3 != 0) goto L_0x0069
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f93056a
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f93040f
                com.ss.android.ugc.aweme.feed.model.LongVideo r3 = com.p683ss.android.ugc.aweme.longvideo.C36380h.m82107a(r3)
                if (r3 == 0) goto L_0x0017
                int r3 = r3.getTrailerStartTime()
                goto L_0x0018
            L_0x0017:
                r3 = -1
            L_0x0018:
                if (r3 != 0) goto L_0x0063
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f93056a
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f93040f
                if (r3 == 0) goto L_0x0025
                java.lang.String r3 = r3.getAid()
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                com.ss.android.ugc.aweme.video.a r3 = com.p683ss.android.ugc.aweme.video.C48121w.m104267c(r3)
                int r4 = r3.f120604b
                long r0 = r3.f120603a
                int r3 = (int) r0
                r0 = 1950(0x79e, float:2.733E-42)
                if (r4 <= 0) goto L_0x0054
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f93056a
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f93040f
                if (r3 == 0) goto L_0x0044
                com.ss.android.ugc.aweme.feed.model.Video r3 = r3.getVideo()
                if (r3 == 0) goto L_0x0044
                int r3 = r3.getDuration()
                goto L_0x0045
            L_0x0044:
                r3 = 0
            L_0x0045:
                if (r3 <= r0) goto L_0x004e
                int r3 = r3 - r0
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r4 = r2.f93056a
                r4.mo75256a(r3)
                return
            L_0x004e:
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f93056a
                r3.mo75255a()
                return
            L_0x0054:
                if (r3 <= r0) goto L_0x005d
                int r3 = r3 - r0
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r4 = r2.f93056a
                r4.mo75256a(r3)
                return
            L_0x005d:
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f93056a
                r3.mo75255a()
                return
            L_0x0063:
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f93056a
                r3.mo75255a()
                return
            L_0x0069:
                com.ss.android.ugc.aweme.longvideo.LongVideoPlayView r3 = r2.f93056a
                r3.mo75258b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.longvideo.LongVideoPlayView.C36347d.mo54503a(int, int):void");
        }
    }

    /* renamed from: a */
    public final void mo53528a(String str, boolean z) {
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        mo75260c();
    }

    /* renamed from: a */
    public final void mo62821a(String str, long j, long j2) {
        int i = j == 0 ? 0 : (int) (((float) j2) / ((float) j));
        C36350b bVar = this.f93038d;
        if (bVar != null) {
            bVar.mo75267a(i);
        }
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        m82003d();
        for (C38871j a : this.f93052s) {
            a.mo53527a(str);
        }
    }

    /* renamed from: a */
    public final void mo53529a(boolean z) {
        for (C38871j a : this.f93052s) {
            a.mo53529a(z);
        }
    }

    /* renamed from: d */
    private final void m82003d() {
        AnimatedImageView animatedImageView = this.f93048n;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(8);
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        if (this.f93036b.f78757a != 0) {
            mo75258b();
        }
    }

    /* renamed from: e */
    private final boolean m82004e() {
        Iterator it = this.f93039e.iterator();
        while (it.hasNext()) {
            ((C36366c) it.next()).mo75277a();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo75255a() {
        if (m82004e()) {
            C36345b bVar = this.f93037c;
            if (bVar != null) {
                bVar.mo75250c();
            }
            C37937e eVar = this.f93035a;
            if (eVar != null) {
                eVar.mo77409f();
            }
            C37937e eVar2 = this.f93035a;
            if (eVar2 != null) {
                eVar2.mo77411i();
            }
            this.f93036b.f78757a = 2;
        }
    }

    /* renamed from: b */
    public final void mo75258b() {
        if (m82004e()) {
            C37937e eVar = this.f93035a;
            if (eVar != null) {
                eVar.mo77411i();
            }
            C36345b bVar = this.f93037c;
            if (bVar != null) {
                bVar.mo75250c();
            }
            C37937e eVar2 = this.f93035a;
            if (eVar2 != null) {
                eVar2.mo77410g();
            }
            this.f93036b.f78757a = 4;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo75260c() {
        C36345b bVar = this.f93037c;
        if (bVar != null) {
            bVar.mo75249b();
        }
        C37937e eVar = this.f93035a;
        if (eVar != null) {
            eVar.mo77408e();
        }
        this.f93036b.f78757a = 3;
        if (!C48121w.m104087I()) {
            this.f93050p.mo95269F();
            return;
        }
        C37937e eVar2 = this.f93035a;
        if (eVar2 != null) {
            eVar2.mo77412j();
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        this.f93047m.mo97920b(this.f93043i);
        if (this.f93050p.mo95287b((C38871j) this)) {
            C37937e eVar = this.f93035a;
            if (eVar != null) {
                eVar.mo77401a();
            }
        }
        this.f93039e.clear();
        this.f93052s.clear();
        C48107j.m104193f().mo95349b((C48072b) this);
        try {
            this.f93050p.mo95267D();
            this.f93050p.mo95264A();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo75257a(C38871j jVar) {
        if (jVar != null && !this.f93052s.contains(jVar)) {
            this.f93052s.add(jVar);
        }
    }

    /* renamed from: b */
    public final void mo53530b(C50112d dVar) {
        for (C38871j b : this.f93052s) {
            b.mo53530b(dVar);
        }
    }

    /* renamed from: d */
    public final void mo53534d(String str) {
        for (C38871j d : this.f93052s) {
            d.mo53534d(str);
        }
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
        C48107j.m104193f().mo95342a((C48072b) this);
        for (C38871j e : this.f93052s) {
            e.mo53535e(str);
        }
    }

    /* renamed from: a */
    public final void mo53523a(float f) {
        if (f > 0.0f && this.f93049o.getVisibility() == 0) {
            this.f93049o.setVisibility(8);
        }
        C36350b bVar = this.f93038d;
        if (bVar != null) {
            bVar.mo75266a(f);
        }
        for (C38871j a : this.f93052s) {
            a.mo53523a(f);
        }
    }

    /* renamed from: b */
    public final void mo75259b(float f) {
        m82003d();
        if (f > 0.0f) {
            this.f93049o.setVisibility(8);
        }
        if (!C48121w.m104087I()) {
            this.f93050p.mo95279a(f);
            return;
        }
        C37937e eVar = this.f93035a;
        if (eVar != null) {
            eVar.mo77402a(f);
        }
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
        mo75260c();
        C36350b bVar = this.f93038d;
        if (bVar != null) {
            bVar.mo75266a(0.0f);
        }
        mo75259b(0.0f);
        AnimatedImageView animatedImageView = this.f93048n;
        if (animatedImageView != null) {
            animatedImageView.setVisibility(0);
        }
        this.f93049o.setVisibility(0);
        for (C38871j c : this.f93052s) {
            c.mo53533c(str);
        }
        LongVideoPlayActivity longVideoPlayActivity = this.f93045k;
        if (!longVideoPlayActivity.f92984D) {
            ImageView imageView = longVideoPlayActivity.f93000c;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            longVideoPlayActivity.mo75238i();
            NoOperateModeController noOperateModeController = longVideoPlayActivity.f92992L;
            if (noOperateModeController == null) {
                C52711k.m112237a("noOperationModeController");
            }
            noOperateModeController.f93110c = false;
        }
    }

    /* renamed from: a */
    public final void mo75256a(int i) {
        if (m82004e()) {
            C36345b bVar = this.f93037c;
            if (bVar != null) {
                bVar.mo75250c();
            }
            C37937e eVar = this.f93035a;
            if (eVar != null) {
                eVar.mo77403a(i);
            }
            C37937e eVar2 = this.f93035a;
            if (eVar2 != null) {
                eVar2.mo77411i();
            }
            this.f93036b.f78757a = 2;
        }
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        for (C38871j b : this.f93052s) {
            b.mo53531b(str);
        }
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        for (C38871j a : this.f93052s) {
            a.mo53524a(dVar);
        }
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
        for (C38871j b : this.f93052s) {
            b.mo53532b(z);
        }
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        for (C38871j a : this.f93052s) {
            a.mo53525a(fVar);
        }
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
        m82003d();
        this.f93049o.setVisibility(8);
        for (C38871j a : this.f93052s) {
            a.mo53526a(gVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0060, code lost:
        if (r2 == null) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LongVideoPlayView(com.p683ss.android.ugc.aweme.longvideo.LongVideoPlayActivity r2, com.p683ss.android.ugc.aweme.longvideo.C36385k r3, com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent r4, com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView r5, android.widget.ImageView r6, com.p683ss.android.ugc.aweme.video.C48121w r7) {
        /*
            r1 = this;
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            java.lang.String r0 = "mVideoView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.String r0 = "mIvReplay"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            java.lang.String r0 = "mPlayerManager"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            r1.<init>()
            r1.f93045k = r2
            r1.f93046l = r3
            r1.f93047m = r4
            r1.f93048n = r5
            r1.f93049o = r6
            r1.f93050p = r7
            java.lang.String r2 = "LongVideoPlayView"
            r1.f93051r = r2
            com.ss.android.ugc.aweme.feed.d.a r2 = new com.ss.android.ugc.aweme.feed.d.a
            r2.<init>()
            r1.f93036b = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f93052s = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f93039e = r2
            java.lang.String r2 = ""
            r1.f93041g = r2
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity r2 = r1.f93045k
            android.arch.lifecycle.h r2 = r2.getLifecycle()
            r3 = r1
            android.arch.lifecycle.j r3 = (android.arch.lifecycle.C0183j) r3
            r2.mo324a(r3)
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity r2 = r1.f93045k
            android.support.v4.app.FragmentActivity r2 = (android.support.p030v4.app.FragmentActivity) r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = com.p683ss.android.ugc.aweme.longvideo.p1934b.C36351a.C36352a.m82036a(r2)
            r1.f93053t = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f93053t
            if (r2 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.longvideo.f r2 = r2.f93193a
            if (r2 == 0) goto L_0x0062
            java.lang.String r2 = r2.f93088a
            if (r2 != 0) goto L_0x0064
        L_0x0062:
            java.lang.String r2 = ""
        L_0x0064:
            r1.f93041g = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f93053t
            if (r2 == 0) goto L_0x0071
            com.ss.android.ugc.aweme.longvideo.f r2 = r2.f93193a
            if (r2 == 0) goto L_0x0071
            int r2 = r2.f93089b
            goto L_0x0072
        L_0x0071:
            r2 = 0
        L_0x0072:
            r1.f93042h = r2
            android.widget.ImageView r2 = r1.f93049o
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$1 r3 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$1
            r3.<init>(r1)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            android.widget.ImageView r2 = r1.f93049o
            r3 = 8
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$d r2 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$d
            r2.<init>(r1)
            com.ss.android.ugc.playerkit.videoview.j r2 = (com.p683ss.android.ugc.playerkit.videoview.C50161j) r2
            r1.f93043i = r2
            com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$c r2 = new com.ss.android.ugc.aweme.longvideo.LongVideoPlayView$c
            r2.<init>(r1)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.f93044j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.longvideo.LongVideoPlayView.<init>(com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity, com.ss.android.ugc.aweme.longvideo.k, com.ss.android.ugc.playerkit.videoview.VideoViewComponent, com.ss.android.ugc.aweme.base.ui.AnimatedImageView, android.widget.ImageView, com.ss.android.ugc.aweme.video.w):void");
    }
}
