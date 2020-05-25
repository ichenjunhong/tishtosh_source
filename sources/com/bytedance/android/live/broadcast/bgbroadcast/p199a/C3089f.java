package com.bytedance.android.live.broadcast.bgbroadcast.p199a;

import android.animation.TimeInterpolator;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.bgbroadcast.C3106b;
import com.bytedance.android.live.broadcast.bgbroadcast.C3133n;
import com.bytedance.android.live.broadcast.p198b.C3061a;
import com.bytedance.android.live.broadcast.p198b.C3073i;
import com.bytedance.android.live.broadcast.widget.C3764d;
import com.bytedance.android.live.broadcast.widget.C3786r;
import com.bytedance.android.live.broadcast.widget.C3786r.C3791a;
import com.bytedance.android.live.core.p230g.C3865ac;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.event.C5204w;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.floatwindow.C7171b;
import com.bytedance.android.livesdk.floatwindow.C7174e;
import com.bytedance.android.livesdk.floatwindow.C7175f;
import com.bytedance.android.livesdk.floatwindow.C7176g;
import com.bytedance.android.livesdk.floatwindow.C7182h;
import com.bytedance.android.livesdk.floatwindow.C7184i;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.f */
public final class C3089f extends C3106b {

    /* renamed from: e */
    Dialog f9033e;

    /* renamed from: f */
    public boolean f9034f;

    /* renamed from: g */
    public C1690c f9035g;

    /* renamed from: h */
    public C3764d f9036h;

    /* renamed from: i */
    boolean f9037i;

    /* renamed from: j */
    public C3073i f9038j;

    /* renamed from: k */
    private Dialog f9039k;

    /* renamed from: l */
    private C3061a f9040l;

    /* renamed from: m */
    private boolean f9041m;

    /* renamed from: n */
    private C1690c f9042n;

    /* renamed from: o */
    private boolean f9043o;

    /* renamed from: p */
    private BroadcastReceiver f9044p;

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.f$a */
    class C3099a implements C6601a {
        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C3099a() {
        }

        public final void onClick(View view) {
            if (C3089f.this.f9038j != null) {
                C3089f.this.f9038j.dismiss();
                C3089f.this.f9038j = null;
            }
            C3089f fVar = C3089f.this;
            C3073i iVar = new C3073i(C3089f.this.f9066c, ((Boolean) C4525b.f12364ag.mo10345a()).booleanValue(), ((Boolean) C4525b.f12365ah.mo10345a()).booleanValue(), ((Boolean) C4525b.f12366ai.mo10345a()).booleanValue(), C3089f.this.f9034f);
            fVar.f9038j = iVar;
            C3089f.this.f9038j.show();
        }
    }

    /* renamed from: f */
    public final void mo8397f() {
    }

    /* renamed from: g */
    public final boolean mo8398g() {
        return true;
    }

    /* renamed from: h */
    public final boolean mo8399h() {
        return this.f9034f;
    }

    /* renamed from: c */
    public final void mo8394c() {
        this.f9042n = C2201v.m6592a(500, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3100g<Object>(this), C3101h.f9059a);
    }

    /* renamed from: k */
    private void m8585k() {
        this.f9039k = new C8552a(this.f9066c, 0).mo15012d((int) R.string.f0t).mo15008c((int) R.string.eo3).mo15003b(0, (int) R.string.exh, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C7184i.m14912b(C3089f.this.f9066c);
                dialogInterface.dismiss();
            }
        }).mo15003b(1, (int) R.string.e45, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo15001b();
    }

    /* renamed from: a */
    public final void mo8392a() {
        super.mo8392a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
        this.f9066c.registerReceiver(this.f9044p, intentFilter);
        C6610k.m13986b().mo12668a(C6605h.MESSAGE_PUSH, (C6601a) new C3099a());
    }

    /* renamed from: i */
    public final void mo8400i() {
        super.mo8400i();
        if (this.f9033e != null && this.f9033e.isShowing()) {
            C3105l.m8611a(this.f9033e);
        }
        if (this.f9039k != null && this.f9039k.isShowing()) {
            C3105l.m8611a(this.f9039k);
        }
    }

    /* renamed from: j */
    public final void mo8401j() {
        C7176g gVar = (C7176g) C7182h.m14893a("control_view");
        if (gVar != null) {
            if (this.f9035g != null) {
                this.f9035g.dispose();
            }
            C7175f fVar = gVar.f19485a;
            if (fVar == null || fVar.mo13308a() <= 0) {
                this.f9035g = C2201v.m6592a(3000, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3103j<Object>(this, gVar), C3104k.f9063a);
            }
        }
    }

    /* renamed from: b */
    public final void mo8393b() {
        if (C7182h.m14893a("control_view") != null) {
            C7182h.m14893a("control_view").mo13315b();
        }
        if (C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW) != null) {
            C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW).mo13315b();
        }
        if (!((Boolean) C4525b.f12361ad.mo10345a()).booleanValue() && !this.f9041m) {
            if (C7184i.m14909a(this.f9066c)) {
                m8586l();
            } else if (!this.f9039k.isShowing() && (((Integer) LiveSettingKeys.LIVE_ENABLE_TT_CAPTURE.mo9431a()).intValue() != 1 || !this.f9037i)) {
                m8585k();
                this.f9039k.show();
            }
        }
    }

    /* renamed from: d */
    public final void mo8395d() {
        super.mo8395d();
        if (this.f9033e != null && this.f9033e.isShowing()) {
            C3105l.m8611a(this.f9033e);
        }
        if (this.f9038j != null) {
            this.f9038j.dismiss();
        }
        if (!((Boolean) C4525b.f12361ad.mo10345a()).booleanValue()) {
            if (this.f9039k != null && this.f9039k.isShowing()) {
                C3105l.m8611a(this.f9039k);
            }
            if (this.f9035g != null) {
                this.f9035g.dispose();
            }
            try {
                C7171b a = C7182h.m14893a("control_view");
                if (a != null && a.mo13316c()) {
                    a.dismiss();
                }
            } catch (Throwable unused) {
            }
            try {
                C7171b a2 = C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW);
                if (a2 != null && a2.mo13316c()) {
                    a2.dismiss();
                }
            } catch (Throwable unused2) {
            }
        }
        if (this.f9042n != null) {
            this.f9042n.dispose();
        }
        this.f9066c.unregisterReceiver(this.f9044p);
        this.f9033e = null;
    }

    /* renamed from: e */
    public final void mo8396e() {
        if (this.f9033e == null) {
            this.f9033e = new C8552a(this.f9066c, 1).mo15012d((int) R.string.f0t).mo15008c((int) R.string.f0s).mo15003b(2, (int) R.string.exh, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).mo15001b();
        }
        if (!this.f9033e.isShowing()) {
            this.f9033e.show();
        }
        if (C7184i.m14909a(this.f9066c)) {
            m8586l();
            return;
        }
        this.f9041m = false;
        m8585k();
        if (!this.f9039k.isShowing()) {
            this.f9039k.show();
        }
    }

    /* renamed from: l */
    private void m8586l() {
        if (!this.f9043o) {
            try {
                if (C7182h.m14893a("control_view") != null && C7182h.m14893a("control_view").mo13316c()) {
                    C7182h.m14893a("control_view").dismiss();
                }
            } catch (Throwable unused) {
            }
            try {
                if (C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW) != null && C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW).mo13316c()) {
                    C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW).dismiss();
                }
            } catch (Throwable unused2) {
            }
            if (this.f9066c != null) {
                if (VERSION.SDK_INT < 17 || !this.f9066c.isDestroyed()) {
                    final C3786r rVar = new C3786r(this.f9066c);
                    this.f9036h = new C3764d(this.f9066c);
                    if (this.f9065b.mo8445e() != null) {
                        this.f9036h.setPresenter(this.f9065b.mo8445e());
                    }
                    C7182h.m14894a(C3922z.m9915e()).mo13330a((View) rVar).mo13332a("control_view").mo13326a((int) C9432q.m18687b(C3922z.m9915e(), 220.0f)).mo13335b((int) C9432q.m18687b(C3922z.m9915e(), 40.0f)).mo13327a(0, 0.1f).mo13336b(1, 0.5f).mo13337c(2).mo13328a(0, 0).mo13329a(300, (TimeInterpolator) new AccelerateDecelerateInterpolator()).mo13333a(true).mo13331a((C7174e) new C7174e() {
                        /* renamed from: a */
                        public final void mo8407a() {
                            C3089f.this.mo8401j();
                        }

                        /* renamed from: b */
                        public final void mo8409b() {
                            C7176g gVar = (C7176g) C7182h.m14893a("control_view");
                            if (gVar != null) {
                                C3786r rVar = (C3786r) gVar.mo13317d();
                                if (rVar.f10704d.getVisibility() == 0) {
                                    rVar.mo9158a();
                                } else {
                                    rVar.f10704d.setVisibility(0);
                                }
                                float a = ((float) C9432q.m18670a(C3922z.m9915e())) - C9432q.m18687b(C3922z.m9915e(), 220.0f);
                                if (rVar.mo9159b() && ((float) gVar.f19485a.mo13308a()) > a) {
                                    gVar.f19485a.mo13309a((int) a);
                                }
                                if (!rVar.mo9159b()) {
                                    C3089f.this.mo8401j();
                                }
                            }
                        }

                        /* renamed from: a */
                        public final void mo8408a(int i, int i2) {
                            float f;
                            if (C3089f.this.f9035g != null) {
                                C3089f.this.f9035g.dispose();
                            }
                            if (rVar.mo9159b()) {
                                f = 220.0f;
                            } else {
                                f = 38.0f;
                            }
                            C3089f.m8584a(1, i, i2, (int) f);
                        }
                    }).mo13334a();
                    C7182h.m14894a(C3922z.m9915e()).mo13330a((View) this.f9036h).mo13332a(IBroadcastService.TAG_MSG_VIEW).mo13337c(2).mo13326a((int) C9432q.m18687b(C3922z.m9915e(), 280.0f)).mo13335b((int) C9432q.m18687b(C3922z.m9915e(), 24.0f)).mo13327a(0, 0.1f).mo13336b(1, 0.1f).mo13328a(0, 0).mo13329a(300, (TimeInterpolator) new AccelerateDecelerateInterpolator()).mo13331a((C7174e) new C7174e() {
                        /* renamed from: a */
                        public final void mo8407a() {
                        }

                        /* renamed from: b */
                        public final void mo8409b() {
                        }

                        /* renamed from: a */
                        public final void mo8408a(int i, int i2) {
                            C3089f.m8584a(2, i, i2, 0);
                        }
                    }).mo13333a(true).mo13334a();
                    rVar.setOnViewClickListener(new C3791a() {
                        /* renamed from: b */
                        public final void mo8412b() {
                            C3089f.this.f9065b.mo8451k();
                        }

                        /* renamed from: a */
                        public final void mo8410a() {
                            C3089f.this.f9065b.mo8440b(true);
                        }

                        /* renamed from: a */
                        public final void mo8411a(boolean z) {
                            if (z) {
                                C3089f.this.f9065b.mo8446f();
                            } else {
                                C3089f.this.f9065b.mo8450j();
                            }
                        }

                        /* renamed from: b */
                        public final void mo8413b(boolean z) {
                            if (z) {
                                C4525b.f12363af.mo10346a(Integer.valueOf(0));
                                C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW).mo13314a();
                                return;
                            }
                            C4525b.f12363af.mo10346a(Integer.valueOf(1));
                            C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW).mo13315b();
                        }
                    });
                    this.f9036h.setOnViewClickListener(C3102i.f9060a);
                    this.f9043o = true;
                }
            }
        }
    }

    public final void onEvent(C5204w wVar) {
        if (wVar.f13924a == 27) {
            if (this.f9040l == null) {
                this.f9040l = new C3061a(this.f9066c);
            }
            if (!this.f9040l.isShowing()) {
                this.f9040l.show();
            }
        }
    }

    public C3089f(Room room, C3133n nVar) {
        super(room, nVar);
        this.f9034f = true;
        this.f9041m = true;
        this.f9037i = true;
        this.f9044p = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED")) {
                    C7176g gVar = (C7176g) C7182h.m14893a("control_view");
                    C7176g gVar2 = (C7176g) C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW);
                    int a = C9432q.m18670a(context);
                    int b = C9432q.m18688b(context);
                    if (gVar != null && gVar.mo13316c()) {
                        gVar.f19485a.mo13309a(0);
                        gVar.f19485a.mo13312b((int) (((float) b) * 0.5f));
                    }
                    if (gVar2 != null && gVar2.mo13316c()) {
                        gVar2.f19485a.mo13309a((int) (((float) a) * 0.1f));
                        gVar2.f19485a.mo13312b((int) (((float) b) * 0.1f));
                    }
                }
            }
        };
        this.f9034f = this.f9066c.getIntent().getBooleanExtra("hotsoon.intent.extra.IS_LANDSCAPE", true);
        if (this.f9034f) {
            this.f9066c.setRequestedOrientation(0);
            C3865ac.m9796a(this.f9066c);
        }
    }

    /* renamed from: a */
    public static void m8584a(int i, int i2, int i3, int i4) {
        String str;
        float f;
        float f2;
        if (i == 1) {
            str = "control_view";
        } else {
            str = IBroadcastService.TAG_MSG_VIEW;
        }
        Context e = C3922z.m9915e();
        if (i == 1) {
            f = 220.0f;
        } else {
            f = 280.0f;
        }
        int b = (int) C9432q.m18687b(e, f);
        Context e2 = C3922z.m9915e();
        if (i == 1) {
            f2 = 40.0f;
        } else {
            f2 = 24.0f;
        }
        int b2 = (int) C9432q.m18687b(e2, f2);
        C7176g gVar = (C7176g) C7182h.m14893a(str);
        if (gVar != null && gVar.f19485a != null) {
            int a = C9432q.m18670a(C3922z.m9915e());
            int b3 = (int) C9432q.m18687b(C3922z.m9915e(), 46.0f);
            int b4 = C9432q.m18688b(C3922z.m9915e()) - b2;
            int b5 = (int) (((float) b4) - C9432q.m18687b(C3922z.m9915e(), 46.0f));
            if (i4 <= 0) {
                i4 = b;
            }
            int i5 = a - i4;
            if (i3 < C9432q.m18695e(C3922z.m9915e()) * 2) {
                gVar.f19485a.mo13312b(b3);
            }
            if (i3 > b4) {
                gVar.f19485a.mo13312b(b5);
            }
            if (i2 < 0) {
                gVar.f19485a.mo13309a(0);
            }
            if (i2 > i5) {
                gVar.f19485a.mo13309a(i5);
            }
        }
    }
}
