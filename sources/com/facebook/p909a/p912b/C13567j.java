package com.facebook.p909a.p912b;

import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.C14533n;

/* renamed from: com.facebook.a.b.j */
final class C13567j {

    /* renamed from: a */
    public String f35405a;

    /* renamed from: b */
    public boolean f35406b;

    /* renamed from: a */
    public final void mo25389a() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(C14533n.m29773g()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f35405a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f35406b);
        edit.apply();
    }

    public final String toString() {
        String str = "Unclassified";
        if (this.f35406b) {
            str = "Applink";
        }
        if (this.f35405a == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("(");
        sb.append(this.f35405a);
        sb.append(")");
        return sb.toString();
    }

    C13567j(String str, boolean z) {
        this.f35405a = str;
        this.f35406b = z;
    }
}
