package com.p683ss.android.ugc.aweme.p2402x;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.android.play.core.p1053e.C17342g;
import com.p683ss.android.ugc.aweme.dfbase.C27532a;
import com.p683ss.android.ugc.aweme.dfbase.C27536b;
import com.p683ss.android.ugc.aweme.dfbase.C27558m;
import com.p683ss.android.ugc.aweme.dfbase.C27559n;
import com.p683ss.android.ugc.aweme.dfbase.C27562q;
import com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27540a;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27547c;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.trill.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.x.a */
public final class C48410a extends C27532a {
    /* renamed from: d */
    private static boolean m104741d() {
        try {
            if (C11010c.m22280a().getPackageManager().getPackageInfo("com.android.vending", 0).versionCode < 81510000) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo55969b() {
        C27559n nVar = this.f72377a.f72412p;
        Locale locale = this.f72377a.f72410n;
        if (locale == null) {
            return false;
        }
        if (m104739a(locale)) {
            C27547c.m66215a(this.f72377a, 5, this.f72379c);
            if (nVar != null) {
                nVar.mo50033a(this.f72377a.f72403g);
            }
            return true;
        }
        C17342g a = C48411b.m104743a(locale.getLanguage());
        if (a != null) {
            C27547c.m66215a(this.f72377a, a.mo33634b(), this.f72379c);
            if (a.mo33634b() == 2 || a.mo33634b() == 4) {
                C27562q b = C27536b.m66176a().mo55975b(this.f72377a.f72397a);
                if (b != null) {
                    b.mo56010b(this.f72377a);
                    b.mo56012d();
                }
                return false;
            }
        } else {
            C27547c.m66215a(this.f72377a, 0, this.f72379c);
        }
        if (!TextUtils.equals("ceb", locale.getLanguage()) || !m104741d()) {
            if (this.f72378b != null) {
                C27536b.m66176a().mo55974a(this.f72377a.f72397a, this.f72378b);
            }
            C27536b.m66176a().mo55971a(this.f72377a);
            return false;
        }
        if (!this.f72377a.f72403g) {
            Activity validTopActivity = ActivityStack.getValidTopActivity();
            if (validTopActivity != null) {
                new C10643a(validTopActivity).mo18899b((int) R.string.cpe).mo18886a((int) R.string.ah2, (OnClickListener) null).mo18897a().mo18882b();
            }
        }
        if (nVar != null) {
            nVar.mo50034b(this.f72377a.f72403g);
        }
        return false;
    }

    /* renamed from: b */
    private void m104740b(Locale locale) {
        this.f72377a.f72410n = locale;
    }

    public C48410a(Locale locale) {
        StringBuilder sb = new StringBuilder("df_language_");
        sb.append(locale.getLanguage());
        super(sb.toString(), (C27562q) new C48412c());
        m104740b(locale);
    }

    /* renamed from: a */
    public static boolean m104739a(Locale locale) {
        String language = locale.getLanguage();
        if (TextUtils.equals("en", language)) {
            return true;
        }
        return C27558m.m66226b().mo33617a().contains(language);
    }

    public C48410a(Locale locale, C27540a aVar) {
        StringBuilder sb = new StringBuilder("df_language_");
        sb.append(locale.getLanguage());
        super(aVar.mo55989a(sb.toString()), (C27562q) new C48412c());
        m104740b(locale);
    }
}
