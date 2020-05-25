package com.p683ss.android.ugc.aweme.p1807im.disableim;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Handler;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a;
import com.bytedance.ies.dmt.p664ui.p666b.C10657o.C10658a;
import com.p683ss.android.ugc.aweme.protection.gradientpunish.C40878a;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.disableim.b */
public final class C33185b {

    /* renamed from: d */
    public static final C33186a f86180d = new C33186a(null);

    /* renamed from: a */
    public boolean f86181a;

    /* renamed from: b */
    public C10641a f86182b;

    /* renamed from: c */
    public final Activity f86183c;

    /* renamed from: e */
    private final Handler f86184e = new Handler();

    /* renamed from: com.ss.android.ugc.aweme.im.disableim.b$a */
    public static final class C33186a {
        private C33186a() {
        }

        public /* synthetic */ C33186a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.disableim.b$b */
    static final class C33187b implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C33185b f86185a;

        C33187b(C33185b bVar) {
            this.f86185a = bVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C33185b bVar = this.f86185a;
            if (bVar.f86181a) {
                if (!C48121w.m104087I()) {
                    C48121w.m104249M().mo95291x();
                } else {
                    C50130a.m108170a().mo60214ae();
                }
                bVar.f86181a = false;
            }
            C40878a.m90441a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.disableim.b$c */
    public static final class C33188c implements C10658a {

        /* renamed from: a */
        final /* synthetic */ C33185b f86186a;

        C33188c(C33185b bVar) {
            this.f86186a = bVar;
        }

        /* renamed from: a */
        public final void mo18949a(boolean z) {
            if (z) {
                this.f86186a.mo70365a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.disableim.b$d */
    static final class C33189d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33185b f86187a;

        C33189d(C33185b bVar) {
            this.f86187a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C33192c.m76260a(this.f86187a.f86183c);
            ImUnder16Manger.m76247a().uploadStatus(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.disableim.b$e */
    static final class C33190e implements OnClickListener {

        /* renamed from: a */
        public static final C33190e f86188a = new C33190e();

        C33190e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ImUnder16Manger.m76247a().uploadStatus(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.disableim.b$f */
    static final class C33191f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C33185b f86189a;

        C33191f(C33185b bVar) {
            this.f86189a = bVar;
        }

        public final void run() {
            C10641a aVar = this.f86189a.f86182b;
            if (aVar != null && !aVar.mo18881a()) {
                return;
            }
            if (!C48121w.m104087I()) {
                C48021h M = C48121w.m104249M();
                C52711k.m112236a((Object) M, "PlayerManager.inst()");
                if (M.mo95257o()) {
                    C48121w.m104249M().mo95293z();
                    this.f86189a.f86181a = true;
                    return;
                }
                this.f86189a.mo70365a();
                return;
            }
            C50130a a = C50130a.m108170a();
            C52711k.m112236a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
            if (a.mo97926b()) {
                C50130a.m108170a().mo60215af();
                this.f86189a.f86181a = true;
                return;
            }
            this.f86189a.mo70365a();
        }
    }

    /* renamed from: a */
    public final void mo70365a() {
        if (!C48121w.m104087I()) {
            C48021h M = C48121w.m104249M();
            C52711k.m112236a((Object) M, "PlayerManager.inst()");
            if (M.mo95257o()) {
                C48121w.m104249M().mo95293z();
                this.f86181a = true;
                return;
            }
        } else {
            C50130a a = C50130a.m108170a();
            C52711k.m112236a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
            if (a.mo97926b()) {
                C50130a.m108170a().mo60215af();
                this.f86181a = true;
                return;
            }
        }
        this.f86184e.postDelayed(new C33191f(this), 1000);
    }

    public C33185b(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f86183c = activity;
    }
}
