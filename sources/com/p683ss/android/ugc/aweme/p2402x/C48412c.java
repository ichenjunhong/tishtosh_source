package com.p683ss.android.ugc.aweme.p2402x;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.p763l.C12152c;
import com.bytedance.p763l.p764a.C12140c;
import com.bytedance.p763l.p765b.C12150a;
import com.google.android.play.core.p1053e.C17342g;
import com.google.android.play.core.p1053e.C17343h;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.dfbase.C27536b;
import com.p683ss.android.ugc.aweme.dfbase.C27558m;
import com.p683ss.android.ugc.aweme.dfbase.C27562q;
import com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27541b;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27547c;
import java.util.Locale;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.x.c */
public final class C48412c extends C27562q implements C17343h {
    /* renamed from: a */
    public final void mo56001a() {
        C12140c.m24571b().f32053a.add(this);
    }

    /* renamed from: b */
    public final void mo56008b() {
        C12140c.m24571b().f32053a.remove(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ Object mo95896d(C12150a aVar) throws Exception {
        mo56009b(aVar);
        return null;
    }

    /* renamed from: a */
    public final boolean mo56007a(AmeSSActivity ameSSActivity) {
        if (this.f72447b == null) {
            return false;
        }
        Locale locale = this.f72447b.f72410n;
        if (locale == null) {
            return false;
        }
        try {
            ameSSActivity.setOnActivityResultListener(1001, new C48414e(this, ameSSActivity));
            C17342g a = C48411b.m104743a(locale.getLanguage());
            if (a != null) {
                return C27558m.m66226b().mo33619a(a, ameSSActivity, 8);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo23054a(Object obj) {
        C17342g gVar = (C17342g) obj;
        if (gVar.mo33641i().size() > 0 && this.f72447b != null) {
            Locale locale = this.f72447b.f72410n;
            if (locale != null) {
                for (String locale2 : gVar.mo33641i()) {
                    if (TextUtils.equals(new Locale(locale2).getLanguage(), locale.getLanguage())) {
                        C48411b.f121770a.put(locale.getLanguage(), gVar);
                        C12150a aVar = new C12150a("com.ss.android.ugc.aweme.dflanguage", C12152c.m24596b().mo23049b(), gVar.mo33634b());
                        aVar.f32072d = gVar.mo33637e();
                        aVar.f32073e = gVar.mo33636d();
                        aVar.f32076h = gVar.mo33642j();
                        aVar.f32075g = gVar.mo33635c();
                        C27547c.m66216a(this.f72447b, aVar);
                        C0013i.m16a((Callable<TResult>) new C48413d<TResult>(this, aVar));
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo95895b(AmeSSActivity ameSSActivity, int i, int i2, Intent intent) {
        if (this.f72447b != null && i == 8) {
            C27547c.m66213a(this.f72447b, i2);
            ameSSActivity.finish();
            if (i2 == -1) {
                this.f72447b.f72411o = C27541b.UNKNOWN;
                return;
            }
            C27536b.m66176a();
            C27536b.m66179b(this.f72447b);
        }
    }
}
