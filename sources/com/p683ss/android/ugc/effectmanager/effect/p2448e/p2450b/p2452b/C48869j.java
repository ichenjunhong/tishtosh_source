package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import android.util.Log;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e;
import com.p683ss.android.ugc.effectmanager.effect.model.BuildEffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48746b;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.j */
public final class C48869j extends C48656j {

    /* renamed from: a */
    private C48565a f122835a;

    /* renamed from: b */
    private C48620c f122836b;

    /* renamed from: f */
    private C48641b f122837f;

    /* renamed from: g */
    private String f122838g;

    /* renamed from: h */
    private boolean f122839h = false;

    /* renamed from: a */
    public final void mo96139a() {
        EffectChannelModel effectChannelModel;
        InputStream b = this.f122836b.mo96152b(C48667e.m105298a(this.f122835a.f122047a.f122960f, this.f122838g));
        if (b == null) {
            mo96238a(14, new C48746b(new EffectChannelResponse(this.f122838g), new C48649d(10004)));
            return;
        }
        try {
            effectChannelModel = (EffectChannelModel) this.f122837f.mo59189a(b, EffectChannelModel.class);
        } catch (Exception e) {
            Log.getStackTraceString(e);
            effectChannelModel = null;
        }
        if (effectChannelModel == null) {
            mo96238a(14, new C48746b(new EffectChannelResponse(this.f122838g), new C48649d(10004)));
        } else if (!effectChannelModel.checkValued()) {
            mo96238a(14, new C48746b(new EffectChannelResponse(this.f122838g), new C48649d(10004)));
        } else {
            mo96238a(14, new C48746b(new BuildEffectChannelResponse(this.f122838g, this.f122835a.f122047a.f122964j.getAbsolutePath(), true).buildChannelResponse(effectChannelModel), null));
        }
        C48660a.m105288a(b);
    }

    public C48869j(C48565a aVar, String str, String str2, Handler handler, boolean z) {
        super(handler, str2);
        this.f122838g = str;
        this.f122835a = aVar;
        this.f122836b = this.f122835a.f122047a.f122972r;
        this.f122837f = this.f122835a.f122047a.f122976v;
    }
}
