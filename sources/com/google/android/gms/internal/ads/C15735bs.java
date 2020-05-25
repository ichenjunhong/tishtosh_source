package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.bs */
public final class C15735bs {

    /* renamed from: a */
    final Collection<C15726bl<?>> f43751a = new ArrayList();

    /* renamed from: b */
    final Collection<C15726bl<String>> f43752b = new ArrayList();

    /* renamed from: c */
    final Collection<C15726bl<String>> f43753c = new ArrayList();

    /* renamed from: a */
    public final void mo30650a(Editor editor, int i, JSONObject jSONObject) {
        for (C15726bl blVar : this.f43751a) {
            if (blVar.f42832a == 1) {
                blVar.mo30321a(editor, blVar.mo30320a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            afc.m32794c("Flag Json is null.");
        }
    }

    /* renamed from: a */
    public final List<String> mo30649a() {
        ArrayList arrayList = new ArrayList();
        for (C15726bl a : this.f43752b) {
            String str = (String) caf.m37099d().mo30717a(a);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<String> mo30651b() {
        List<String> a = mo30649a();
        for (C15726bl a2 : this.f43753c) {
            String str = (String) caf.m37099d().mo30717a(a2);
            if (str != null) {
                a.add(str);
            }
        }
        return a;
    }
}
