package com.bytedance.android.livesdk.message.p397b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.message.model.C8001m;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IInterceptor;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.message.b.f */
public final class C7786f implements IInterceptor {

    /* renamed from: a */
    public final Handler f21408a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final List<C7859c> f21409b = new ArrayList();

    /* renamed from: c */
    public boolean f21410c;

    /* renamed from: a */
    public final void mo14130a() {
        this.f21410c = true;
    }

    public C7786f() {
        this.f21408a.postDelayed(new Runnable() {
            public final void run() {
                if (!C7786f.this.f21409b.isEmpty()) {
                    C2201v.m6601a((C2205y<T>) new C7788g<T>(new ArrayList(C7786f.this.f21409b))).mo6529b(C2168a.m6521b()).mo6551j();
                    C7786f.this.f21409b.clear();
                }
                if (!C7786f.this.f21410c) {
                    C7786f.this.f21408a.postDelayed(this, 3000);
                }
            }
        }, 3000);
    }

    public final boolean onMessage(IMessage iMessage) {
        if (((Boolean) LiveConfigSettingKeys.LIVE_MSG_TYPE_ALOG_ENABLE.mo9431a()).booleanValue() && (iMessage instanceof C7859c) && !(iMessage instanceof C8001m)) {
            C7859c cVar = (C7859c) iMessage;
            if (!cVar.isLocalInsertMsg) {
                this.f21409b.add(cVar);
                return false;
            }
        }
        return false;
    }
}
