package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.base.C2950a;
import com.bytedance.android.live.base.p185b.C2953a;
import com.bytedance.android.live.base.p185b.C2955b;
import com.bytedance.android.live.base.p185b.C2956c;
import com.bytedance.android.live.core.C3808a;
import com.bytedance.android.live.core.C3828b;
import com.bytedance.android.live.core.p225d.C3834b;
import com.bytedance.android.live.core.setting.C4098q;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.C4518ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p392l.C7734a;
import com.bytedance.android.livesdk.p426x.C8567c;
import com.bytedance.android.livesdk.p426x.C8575j;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.live.C8669s;
import com.bytedance.android.livesdkapi.host.C8804h;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.android.livesdkapi.p432d.C8612a.C8613a;
import com.bytedance.android.livesdkapi.service.C8861d;
import com.bytedance.android.livesdkapi.service.C8862e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p064c.p065a.p090h.C2150a;

public class SDKServiceInitTask extends C7734a {
    C8861d mHostService;

    public int getTaskId() {
        return 0;
    }

    public void run() {
        C3834b.f10809a = System.currentTimeMillis();
        if (C2150a.m6495b() == null && !isDebug(this.mHostService)) {
            C2150a.m6491a(C7701b.f21196a);
        }
        TTLiveSDKContext.registerService(C8862e.class, new C8567c());
        TTLiveSDKContext.registerService(C8861d.class, this.mHostService);
        TTLiveSDKContext.registerService(C8669s.class, new C8575j());
        C2950a.m8372a((C2955b) new C2955b() {
            /* renamed from: a */
            public final <T> T mo7596a(Class<T> cls) {
                if (cls == C2956c.class) {
                    return C7702c.f21197a;
                }
                if (cls == C2953a.class) {
                    return SDKServiceInitTask.this.mHostService.mo13042d();
                }
                return C8830k.m17325a(cls);
            }
        });
        C8830k.f24109a = new C4518ac();
        if ("local_test".equals(this.mHostService.mo13039a().getChannel())) {
            C4098q.m10217a(true);
        }
        C3828b.m9701a(new C3808a() {
        });
        if (C4116c.m10249a(C8612a.class) == null) {
            C4116c.m10251a(C8612a.class, new C8613a());
        }
        C8804h i = TTLiveSDKContext.getHostService().mo10316i();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) C8830k.m17330d().mo15033a("live_gurd_patterns", new ArrayList())).iterator();
        while (it.hasNext()) {
            arrayList.add(Pattern.compile((String) it.next()));
        }
        i.mo15571a((List<Pattern>) arrayList);
    }

    public SDKServiceInitTask(C8861d dVar) {
        this.mHostService = dVar;
    }

    private static boolean isDebug(C8861d dVar) {
        if (dVar == null || !dVar.mo13039a().isLocalTest()) {
            return false;
        }
        return true;
    }

    static final /* synthetic */ void lambda$run$0$SDKServiceInitTask(Throwable th) throws Exception {
        if (th == null) {
            th = new UnknownError("unknown error");
        }
        if (th.getStackTrace() != null) {
            th.getStackTrace();
        }
    }
}
