package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import com.google.gson.C18080j;
import com.google.gson.C18081k;
import com.google.gson.C18082l;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod$parser$2$1 */
public final class LoadFeedsFlowMethod$parser$2$1 implements C18081k<Boolean> {
    LoadFeedsFlowMethod$parser$2$1() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) {
        return m59175b(lVar, type, jVar);
    }

    /* renamed from: b */
    private static Boolean m59175b(C18082l lVar, Type type, C18080j jVar) {
        boolean z;
        boolean z2 = true;
        if (lVar != null) {
            try {
                if (lVar.mo34910g() == 1) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            } catch (Exception unused) {
                if (lVar != null) {
                    try {
                        if (lVar.mo34911h()) {
                            return Boolean.valueOf(z2);
                        }
                    } catch (Exception unused2) {
                        return Boolean.valueOf(false);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
