package com.p683ss.android.ugc.aweme.base.p1404a.p1405a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33122m;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.u */
final class C23407u implements C33122m {

    /* renamed from: a */
    private Context f62440a;

    /* renamed from: b */
    private SharedPreferences f62441b = C35807d.m80935a(this.f62440a, "InitialChooseLanguagePreferences", 0);

    /* renamed from: a */
    public final void mo48499a(int i) {
        Editor edit = this.f62441b.edit();
        edit.putInt("languageDialogShowState", 3);
        edit.apply();
    }

    public C23407u(Context context) {
        this.f62440a = context;
    }
}
