package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.h */
public final class C48348h implements C10762d {

    /* renamed from: a */
    public C10757a f121636a;

    /* renamed from: b */
    private WeakReference<Context> f121637b;

    public C48348h(WeakReference<Context> weakReference, C10757a aVar) {
        this.f121637b = weakReference;
        this.f121636a = aVar;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        if (hVar != null && hVar.f28947d != null) {
            hVar.f28951h = false;
            float scale = this.f121636a.f28930d.getScale();
            int i = (int) (((float) hVar.f28947d.getInt("width")) * scale);
            int i2 = (int) (((float) hVar.f28947d.getInt("height")) * scale);
            int i3 = (int) (((float) hVar.f28947d.getInt("left")) * scale);
            int i4 = (int) (((float) hVar.f28947d.getInt("top")) * scale);
            int optInt = hVar.f28947d.optInt("format", 0);
            final String str = hVar.f28945b;
            if (this.f121636a != null && this.f121636a.f28930d != null) {
                C48350i iVar = new C48350i(this, i, i2, i3, i4);
                C0013i.m18a((Callable<TResult>) iVar, C0013i.f25b).mo20a((C0011g<TResult, TContinuationResult>) new C48351j<TResult,TContinuationResult>(optInt), (Executor) C0013i.f24a).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<JSONObject, Void>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(C0013i<JSONObject> iVar) throws Exception {
                        if (iVar.mo34e() != null) {
                            C48348h.this.f121636a.mo19455a(str, (JSONObject) iVar.mo34e());
                        }
                        return null;
                    }
                }, C0013i.f25b);
            }
        }
    }
}
