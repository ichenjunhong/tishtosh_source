package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.p1033b.C15172a;
import com.google.android.gms.p1033b.C15179g;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.aw */
final class C17912aw implements C15172a<Bundle, String> {

    /* renamed from: a */
    private final /* synthetic */ C17909at f49771a;

    C17912aw(C17909at atVar) {
        this.f49771a = atVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo27985a(C15179g gVar) throws Exception {
        Bundle bundle = (Bundle) gVar.mo27997a(IOException.class);
        C17909at atVar = this.f49771a;
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
