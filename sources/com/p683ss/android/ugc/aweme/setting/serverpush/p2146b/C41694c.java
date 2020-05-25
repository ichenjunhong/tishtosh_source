package com.p683ss.android.ugc.aweme.setting.serverpush.p2146b;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.c */
public final class C41694c extends C26851b<C26832a<BaseResponse>, C41692a> {
    public C41694c() {
        mo54799a(new C26832a<BaseResponse>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr.length == 2 || objArr.length == 3 || objArr.length == 4) {
                    return true;
                }
                return false;
            }

            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                final String str = objArr[0];
                final int intValue = objArr[1].intValue();
                C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
                    public final Object call() throws Exception {
                        if (objArr.length == 2) {
                            return PushSettingsApiManager.m91545b(str, intValue);
                        }
                        if (objArr.length != 4) {
                            return PushSettingsApiManager.m91543a(str, intValue, (String) objArr[2]);
                        }
                        PushSettingsApiManager.m91545b(str, intValue);
                        return PushSettingsApiManager.m91545b((String) objArr[2], ((Integer) objArr[3]).intValue());
                    }
                }, 0);
                return true;
            }
        });
    }

    /* renamed from: b */
    public final void mo44838b() {
        BaseResponse baseResponse;
        if (this.f70700f == null) {
            baseResponse = null;
        } else {
            baseResponse = (BaseResponse) this.f70700f.getData();
        }
        if (baseResponse != null && this.f70701g != null) {
            ((C41692a) this.f70701g).mo55287g();
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        if (this.f70701g != null) {
            ((C41692a) this.f70701g).mo55288l();
        }
    }
}
