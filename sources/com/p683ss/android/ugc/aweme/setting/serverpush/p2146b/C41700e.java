package com.p683ss.android.ugc.aweme.setting.serverpush.p2146b;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.e */
public final class C41700e extends C26851b<C26832a<C41686c>, C41693b> {
    public C41700e() {
        mo54799a(new C26832a<C41686c>() {
            public final boolean checkParams(Object... objArr) {
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
                    public final Object call() throws Exception {
                        return PushSettingsApiManager.m91544a();
                    }
                }, 0);
                return true;
            }
        });
    }

    /* renamed from: b */
    public final void mo44838b() {
        C41686c cVar;
        if (this.f70700f == null) {
            cVar = null;
        } else {
            cVar = (C41686c) this.f70700f.getData();
        }
        if (cVar != null && this.f70701g != null) {
            C23859b.m58575b().mo49465a(C11010c.m22280a(), "last_user_setting_version", cVar.f105459B);
            ((C41693b) this.f70701g).mo55281a(cVar);
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null) {
            ((C41693b) this.f70701g).mo55285e_(exc);
        }
    }
}
