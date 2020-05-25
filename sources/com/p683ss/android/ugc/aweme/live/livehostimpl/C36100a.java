package com.p683ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bef.effectsdk.C2592c;
import com.bytedance.android.live.base.p184a.C2951a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p455i.C8824m;
import com.bytedance.common.utility.p521a.C9373b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p558e.C9741d;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.live.C36148r;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.effectmanager.C48893h;
import java.util.Locale;
import p001a.C0013i;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.a */
public final class C36100a implements IHostContext {

    /* renamed from: a */
    private C48893h f92485a;

    public final int appId() {
        return C23018b.f61359a;
    }

    public final void enterRecorderActivity(Activity activity) {
    }

    public final C8824m getCurrentLocation() {
        return null;
    }

    public final Pair<String, String> getFreeFlowModel() {
        return null;
    }

    public final String getPackageName() {
        return null;
    }

    public final boolean hasLocation() {
        return false;
    }

    public final int liveId() {
        return 12;
    }

    public final void refreshClientABTestValues() {
        C9741d.m19513b();
    }

    public final String appName() {
        return C24095a.m58959p();
    }

    public final Context context() {
        return C11010c.m22280a();
    }

    public final String getChannel() {
        return C11010c.m22295p();
    }

    public final String getServerDeviceId() {
        return C19034d.m46323c();
    }

    public C36100a() {
        C4116c.m10251a(IHostContext.class, this);
    }

    public final Locale currentLocale() {
        return C36148r.m81573a().currentLocale();
    }

    public final int getUpdateVersionCode() {
        try {
            return C9373b.m18554b(context(), "UPDATE_VERSION_CODE");
        } catch (Exception unused) {
            return 0;
        }
    }

    public final String getVersionCode() {
        return String.valueOf(C11010c.m22293n());
    }

    public final boolean isLocalTest() {
        return TextUtils.equals(getChannel(), "local_test");
    }

    public final boolean isNeedProtectUnderage() {
        return C36148r.m81573a().isNeedProtectUnderage();
    }

    public final int getLastVersionCode() {
        return ((Integer) C23183v.m56778a().mo47901L().mo47782d()).intValue();
    }

    public final C48893h getEffectManager() {
        if (this.f92485a == null) {
            C0027j jVar = new C0027j();
            AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().effectService().buildEffectPlatform(context(), new C36101b(jVar), C36102c.f92487a);
            try {
                C0013i<TResult> iVar = jVar.f77a;
                iVar.mo36g();
                if (iVar.mo33d()) {
                    StringBuilder sb = new StringBuilder("So decompress: LiveAppContext, get effect manager wrong,  task error: ");
                    sb.append(Log.getStackTraceString(iVar.mo35f()));
                    C45407ay.m98971b(sb.toString());
                } else {
                    this.f92485a = (C48893h) iVar.mo34e();
                }
            } catch (InterruptedException e) {
                StringBuilder sb2 = new StringBuilder("So decompress: LiveAppContext, get effect manager wrong, ");
                sb2.append(e.getMessage());
                sb2.append("at ");
                sb2.append(Log.getStackTraceString(e));
                C45407ay.m98971b(sb2.toString());
            }
        }
        return this.f92485a;
    }

    public final C2592c getResourceFinder() {
        C0027j jVar = new C0027j();
        AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().effectService().provideResourceFinder(new C36103d(jVar));
        C0013i<TResult> iVar = jVar.f77a;
        try {
            iVar.mo36g();
            if (iVar.mo33d()) {
                StringBuilder sb = new StringBuilder("So decompress: LiveAppContext, get resource finder wrong,  task error: ");
                sb.append(Log.getStackTraceString(iVar.mo35f()));
                C45407ay.m98971b(sb.toString());
            }
        } catch (InterruptedException unused) {
        }
        return (C2592c) iVar.mo34e();
    }

    public final <T> T getClientABTestValue(C2951a<T> aVar, boolean z) {
        return C9741d.m19510a(aVar.f8656a, aVar.f8657b, aVar.f8658c, aVar.f8659d, z);
    }
}
