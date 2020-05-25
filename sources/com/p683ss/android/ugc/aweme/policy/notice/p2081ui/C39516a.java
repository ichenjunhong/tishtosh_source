package com.p683ss.android.ugc.aweme.policy.notice.p2081ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a;
import com.bytedance.ies.dmt.p664ui.p666b.C10657o.C10658a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12200n;
import com.bytedance.lighten.p766a.p769c.C12168c;
import com.p683ss.android.ugc.aweme.policy.notice.api.C39506a;
import com.p683ss.android.ugc.aweme.policy.notice.api.C39507b;
import com.p683ss.android.ugc.aweme.policy.notice.p2080b.C39509a;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.a */
public final class C39516a {

    /* renamed from: e */
    public static final C39517a f101089e = new C39517a(null);

    /* renamed from: a */
    public boolean f101090a;

    /* renamed from: b */
    public C10641a f101091b;

    /* renamed from: c */
    public final Context f101092c;

    /* renamed from: d */
    public final C39506a f101093d;

    /* renamed from: f */
    private final Handler f101094f = new Handler();

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.a$a */
    public static final class C39517a {
        private C39517a() {
        }

        public /* synthetic */ C39517a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.a$b */
    public static final class C39518b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39516a f101095a;

        public C39518b(C39516a aVar) {
            this.f101095a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f101095a.mo80548a((C39507b) this.f101095a.f101093d.f101063f.get(1));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.a$c */
    public static final class C39519c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39516a f101096a;

        public C39519c(C39516a aVar) {
            this.f101096a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f101096a.mo80548a((C39507b) this.f101096a.f101093d.f101063f.get(2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.a$d */
    public static final class C39520d extends C12168c {

        /* renamed from: a */
        final /* synthetic */ SmartImageView f101097a;

        /* renamed from: a */
        public final void mo23094a(Uri uri, View view, C12200n nVar, Animatable animatable) {
        }

        public C39520d(SmartImageView smartImageView) {
            this.f101097a = smartImageView;
        }

        /* renamed from: a */
        public final void mo23095a(Uri uri, View view, Throwable th) {
            this.f101097a.setImageResource(R.drawable.d3h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.a$e */
    public static final class C39521e implements C10658a {

        /* renamed from: a */
        final /* synthetic */ C39516a f101098a;

        public C39521e(C39516a aVar) {
            this.f101098a = aVar;
        }

        /* renamed from: a */
        public final void mo18949a(boolean z) {
            if (z) {
                this.f101098a.mo80547a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.a$f */
    public static final class C39522f implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C39516a f101099a;

        public C39522f(C39516a aVar) {
            this.f101099a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C39516a aVar = this.f101099a;
            if (aVar.f101090a) {
                if (!C48121w.m104087I()) {
                    C48121w.m104249M().mo95291x();
                } else {
                    C50130a.m108170a().mo60214ae();
                }
                aVar.f101090a = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.a$g */
    public static final class C39523g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39516a f101100a;

        public C39523g(C39516a aVar) {
            this.f101100a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f101100a.mo80548a((C39507b) this.f101100a.f101093d.f101063f.get(0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.a$h */
    static final class C39524h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39516a f101101a;

        C39524h(C39516a aVar) {
            this.f101101a = aVar;
        }

        public final void run() {
            C10641a aVar = this.f101101a.f101091b;
            if (aVar != null && !aVar.mo18881a()) {
                return;
            }
            if (!C48121w.m104087I()) {
                C48021h M = C48121w.m104249M();
                C52711k.m112236a((Object) M, "PlayerManager.inst()");
                if (M.mo95257o()) {
                    C48121w.m104249M().mo95293z();
                    this.f101101a.f101090a = true;
                    return;
                }
                this.f101101a.mo80547a();
                return;
            }
            C50130a a = C50130a.m108170a();
            C52711k.m112236a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
            if (a.mo97926b()) {
                C50130a.m108170a().mo60215af();
                this.f101101a.f101090a = true;
                return;
            }
            this.f101101a.mo80547a();
        }
    }

    /* renamed from: a */
    public final void mo80547a() {
        if (!C48121w.m104087I()) {
            C48021h M = C48121w.m104249M();
            C52711k.m112236a((Object) M, "PlayerManager.inst()");
            if (M.mo95257o()) {
                C48121w.m104249M().mo95293z();
                this.f101090a = true;
                return;
            }
        } else {
            C50130a a = C50130a.m108170a();
            C52711k.m112236a((Object) a, "AppPlayingVideoViewProxy.INSTANCE()");
            if (a.mo97926b()) {
                C50130a.m108170a().mo60215af();
                this.f101090a = true;
                return;
            }
        }
        this.f101094f.postDelayed(new C39524h(this), 1000);
    }

    /* renamed from: b */
    private final void m87846b(C39507b bVar) {
        new C39509a().mo80541a(this.f101093d.f101058a, this.f101093d.f101059b, this.f101093d.f101060c, bVar.f101069e, bVar.f101071g);
        C40869c.f104035d.mo83206g();
        C10641a aVar = this.f101091b;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r0.equals("callback") != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        if (r5.f101070f != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r5.f101070f != false) goto L_0x0064;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80548a(com.p683ss.android.ugc.aweme.policy.notice.api.C39507b r5) {
        /*
            r4 = this;
            java.lang.String r0 = "policyNoticeAction"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r0 = r5.f101067c
            int r1 = r0.hashCode()
            r2 = -1052618729(0xffffffffc1425017, float:-12.144553)
            if (r1 == r2) goto L_0x0047
            r2 = -172220347(0xfffffffff5bc2045, float:-4.769562E32)
            if (r1 == r2) goto L_0x003e
            r2 = 3277(0xccd, float:4.592E-42)
            if (r1 == r2) goto L_0x001a
            goto L_0x0067
        L_0x001a:
            java.lang.String r1 = "h5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0067
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r4.f101092c
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r2 = com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = r5.f101068d
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.setData(r1)
            android.content.Context r1 = r4.f101092c
            r1.startActivity(r0)
            boolean r0 = r5.f101070f
            if (r0 == 0) goto L_0x0067
            goto L_0x0064
        L_0x003e:
            java.lang.String r1 = "callback"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0067
            goto L_0x0064
        L_0x0047:
            java.lang.String r1 = "native"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.router.w r0 = com.p683ss.android.ugc.aweme.router.C41302w.m91042a()
            java.lang.String r1 = r5.f101068d
            com.ss.android.ugc.aweme.router.y r1 = com.p683ss.android.ugc.aweme.router.C41311y.m91065a(r1)
            java.lang.String r1 = r1.mo83871a()
            r0.mo83861a(r1)
            boolean r0 = r5.f101070f
            if (r0 == 0) goto L_0x0067
        L_0x0064:
            r4.m87846b(r5)
        L_0x0067:
            java.lang.String r0 = "qa_tns_general_dialog_click"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "business"
            com.ss.android.ugc.aweme.policy.notice.api.a r3 = r4.f101093d
            java.lang.String r3 = r3.f101058a
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "style"
            java.lang.String r3 = "pop"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "button_info"
            java.lang.String r5 = r5.f101065a
            com.ss.android.ugc.aweme.app.f.d r5 = r1.mo47829a(r2, r5)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.policy.notice.p2081ui.C39516a.mo80548a(com.ss.android.ugc.aweme.policy.notice.api.b):void");
    }

    public C39516a(Context context, C39506a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "mPolicyNotice");
        this.f101092c = context;
        this.f101093d = aVar;
    }
}
