package com.bytedance.android.livesdk.chatroom.p307c;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.C4494aa;
import com.bytedance.android.livesdk.chatroom.widget.MTSlideUpGuideView;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.p450h.C8755f.C8756a;
import com.bytedance.android.livesdkapi.p450h.C8758h;
import com.bytedance.ies.p672e.C10753b;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.f */
public final class C5045f implements C0199s<Boolean>, C8756a {

    /* renamed from: g */
    private static volatile C5045f f13506g;

    /* renamed from: a */
    public boolean f13507a;

    /* renamed from: b */
    public C8758h f13508b;

    /* renamed from: c */
    boolean f13509c;

    /* renamed from: d */
    public C1690c f13510d;

    /* renamed from: e */
    public ViewGroup f13511e;

    /* renamed from: f */
    public int f13512f = -1;

    /* renamed from: h */
    private final Handler f13513h = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final void mo10910c() {
        if (this.f13507a) {
            m11545f();
        }
    }

    private C5045f() {
    }

    /* renamed from: a */
    public static C5045f m11544a() {
        if (f13506g == null) {
            synchronized (C5045f.class) {
                if (f13506g == null) {
                    f13506g = new C5045f();
                }
            }
        }
        return f13506g;
    }

    /* renamed from: f */
    private void m11545f() {
        switch (this.f13512f) {
            case 0:
                mo10911d();
                return;
            case 1:
                mo10912e();
                break;
        }
    }

    /* renamed from: b */
    public final void mo10909b() {
        if (this.f13507a) {
            this.f13507a = false;
            this.f13511e = null;
            this.f13512f = -1;
            C4494aa.m10815a().mo10299f();
            C4494aa.m10815a().f12265a.removeObserver(this);
            this.f13509c = false;
            if (this.f13508b != null) {
                this.f13508b.mo15416b((C8756a) this);
                this.f13508b = null;
            }
            if (this.f13510d != null) {
                this.f13510d.dispose();
                this.f13510d = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo10911d() {
        C10753b bVar;
        if (((Boolean) LiveConfigSettingKeys.LIVE_MT_FORYOU_SLIDE_UP_ENABLE.mo9431a()).booleanValue()) {
            Context e = C3922z.m9915e();
            if (e != null) {
                bVar = C10753b.m21793a(e);
            } else {
                bVar = null;
            }
            if ((bVar == null || bVar.mo19444a("live.mt.slide_up_guide.need_show", true)) && !C4494aa.m10815a().mo10297d() && this.f13509c && this.f13508b != null && this.f13508b.mo13141b() >= 2) {
                MTSlideUpGuideView.m14038a(this.f13511e, ((Integer) LiveConfigSettingKeys.LIVE_MT_FORYOU_SLIDE_UP_DISMISS_STYLE.mo9431a()).intValue());
                mo10908a("live.mt.slide_up_guide.need_show");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo10912e() {
        C10753b bVar;
        if (((Boolean) LiveConfigSettingKeys.TOPLIVE_ENTER_FULLSCREEN_SLIDE_UP_ENABLE.mo9431a()).booleanValue()) {
            Context e = C3922z.m9915e();
            if (e != null) {
                bVar = C10753b.m21793a(e);
            } else {
                bVar = null;
            }
            if ((bVar == null || bVar.mo19444a("toplive.fullscreen.browsing.slide_up_guide.need_show", true)) && !C4494aa.m10815a().mo10297d() && this.f13509c && this.f13508b != null && this.f13508b.mo13141b() >= 2) {
                MTSlideUpGuideView.m14038a(this.f13511e, ((Integer) LiveConfigSettingKeys.TOPLIVE_ENTER_FULLSCREEN_SLIDE_UP_DISMISS_STYLE.mo9431a()).intValue());
                mo10908a("toplive.fullscreen.browsing.slide_up_guide.need_show");
            }
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.f13507a && bool != null && bool.booleanValue()) {
            m11545f();
        }
    }

    /* renamed from: a */
    public final void mo10907a(int i) {
        mo10909b();
        this.f13507a = true;
        this.f13512f = i;
        C4494aa.m10815a().mo10298e();
        C4494aa.m10815a().f12265a.observeForever(this);
    }

    /* renamed from: a */
    public void mo10908a(String str) {
        C10753b bVar;
        if (this.f13507a) {
            Context e = C3922z.m9915e();
            if (e != null) {
                bVar = C10753b.m21793a(e);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                bVar.mo19445b(str, Boolean.valueOf(false));
            }
        }
    }
}
