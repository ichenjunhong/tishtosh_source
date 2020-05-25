package com.google.android.gms.tagmanager;

import com.google.android.gms.ads.p1029b.C14902a;
import com.google.android.gms.ads.p1029b.C14902a.C14903a;
import com.google.android.gms.common.C15373d;
import com.google.android.gms.common.C15382e;
import java.io.IOException;

/* renamed from: com.google.android.gms.tagmanager.p */
final class C17220p implements C17229y {

    /* renamed from: a */
    private final /* synthetic */ C17209e f48680a;

    C17220p(C17209e eVar) {
        this.f48680a = eVar;
    }

    /* renamed from: a */
    public final C14903a mo33483a() {
        try {
            return C14902a.m30575a(this.f48680a.f48657e);
        } catch (C15382e | IOException | Exception | IllegalStateException unused) {
            return null;
        } catch (C15373d unused2) {
            C17209e eVar = this.f48680a;
            eVar.f48654b = true;
            eVar.f48659g.interrupt();
            return null;
        }
    }
}
