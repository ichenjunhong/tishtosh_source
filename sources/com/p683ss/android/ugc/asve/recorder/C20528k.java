package com.p683ss.android.ugc.asve.recorder;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.asve.context.C20363h;
import com.p683ss.android.ugc.asve.p1241e.C20390b;
import com.p683ss.android.ugc.asve.sandbox.C20652b;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.k */
final /* synthetic */ class C20528k {
    /* renamed from: a */
    public static final C20484e m51509a(Context context, C0184k kVar, C20363h hVar) {
        boolean z;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(hVar, "recorderContext");
        Boolean a = hVar.mo43117a();
        if (a != null) {
            z = a.booleanValue();
        } else {
            z = C20390b.m50588a(C20315a.f55813c);
        }
        if (!z) {
            C20516h hVar2 = new C20516h(context, null, hVar, 2, null);
            return hVar2;
        } else if (!hVar.mo43130n()) {
            return new VERecorderImpl(context, hVar, kVar);
        } else {
            if (hVar.mo43131o() != null) {
                C20484e a2 = C20652b.m51990a(hVar, kVar);
                Map linkedHashMap = new LinkedHashMap();
                if (a2 != null) {
                    linkedHashMap.put("createResult", "0");
                    C20483d d = C20315a.m50092a().mo43150d();
                    if (d != null) {
                        d.mo43439a("create_sandbox_recoder", linkedHashMap);
                    }
                    return a2;
                }
                linkedHashMap.put("createResult", "-1");
                C20483d d2 = C20315a.m50092a().mo43150d();
                if (d2 != null) {
                    d2.mo43439a("create_sandbox_recoder", linkedHashMap);
                }
                return new VERecorderImpl(context, hVar, kVar);
            }
            throw new IllegalStateException("while in sandbox mode,you must setup sandBoxProcessDiedCallBack in recoderContext,pls fix it ".toString());
        }
    }
}
