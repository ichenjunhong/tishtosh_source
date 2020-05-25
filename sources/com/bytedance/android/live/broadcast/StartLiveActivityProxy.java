package com.bytedance.android.live.broadcast;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C8768a;
import com.bytedance.android.livesdkapi.p456j.C8828a;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9425l.C9426a;
import com.ss.android.ugc.trill.R;

public class StartLiveActivityProxy extends LiveActivityProxy {

    /* renamed from: a */
    C8548h f8898a;

    /* renamed from: b */
    int f8899b;

    /* renamed from: c */
    public int f8900c;

    /* renamed from: a */
    public final void mo8210a() {
        C3617q.INST.isLoadedRes.observe(this.f23571d, new C3802x(this));
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
        if (this.f8898a != null && this.f8898a.isShowing()) {
            this.f8898a.dismiss();
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        if (!C3617q.INST.isLoadedRes() && (this.f8898a == null || !this.f8898a.isShowing())) {
            this.f8898a = new C8552a(this.f23571d, 2).mo15005b((OnDismissListener) new C3648w(this)).mo15011d();
        }
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public void onCreate() {
        this.f23571d.setContentView(R.layout.ajz);
        C3023a.m8461a().mo8215b();
        this.f23571d.getWindow().addFlags(128);
        if (C8828a.LiveResource.isInstalled()) {
            mo8210a();
        } else if (!C3804z.m9662a(this.f23571d)) {
            C4204a.m10421a((Context) this.f23571d, (int) R.string.e79);
        } else if (C9425l.m18652c(this.f23571d) == C9426a.MOBILE_2G) {
            C4204a.m10421a((Context) this.f23571d, (int) R.string.ex9);
        } else {
            if (this.f8900c <= 3) {
                C8828a.LiveResource.checkInstall(this.f23571d, new C8768a() {
                    /* renamed from: a */
                    public final void mo8214a(String str) {
                        if (!C3803y.m9661a(StartLiveActivityProxy.this.f23571d)) {
                            C4204a.m10421a((Context) StartLiveActivityProxy.this.f23571d, (int) R.string.e79);
                        } else if (C9425l.m18652c(StartLiveActivityProxy.this.f23571d) == C9426a.MOBILE_2G) {
                            C4204a.m10421a((Context) StartLiveActivityProxy.this.f23571d, (int) R.string.ex9);
                        } else {
                            StartLiveActivityProxy.this.mo8210a();
                        }
                    }
                });
            }
        }
    }

    public StartLiveActivityProxy(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
}
