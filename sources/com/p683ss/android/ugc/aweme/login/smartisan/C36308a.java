package com.p683ss.android.ugc.aweme.login.smartisan;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.ugc.aweme.C23189aq;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.login.smartisan.a */
public final class C36308a {

    /* renamed from: a */
    public static final C36308a f92917a = new C36308a();

    /* renamed from: b */
    private static final boolean f92918b = false;

    /* renamed from: com.ss.android.ugc.aweme.login.smartisan.a$a */
    static final class C36309a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f92919a;

        /* renamed from: b */
        final /* synthetic */ ContentValues f92920b;

        C36309a(String str, ContentValues contentValues) {
            this.f92919a = str;
            this.f92920b = contentValues;
        }

        public final void run() {
            ContentResolver contentResolver = C11010c.m22280a().getContentResolver();
            if (contentResolver != null) {
                Uri parse = Uri.parse("content://com.smartisanos.keyguard.provider/aweme");
                StringBuilder sb = new StringBuilder("Transmitting data to [");
                sb.append(parse);
                sb.append(']');
                C32458a.m75144a(sb.toString());
                C23089d a = new C23089d().mo47829a("source", this.f92919a);
                try {
                    contentResolver.insert(parse, this.f92920b);
                    a.mo47828a("is_success", (Object) Boolean.valueOf(true));
                } catch (Exception e) {
                    C32458a.m75148a((Throwable) e);
                    a.mo47828a("is_success", (Object) Boolean.valueOf(false));
                    a.mo47829a("error_desc", e.toString());
                }
                C26890h.m65011a("smartisan_data_transmission", a.f61491a);
            }
        }
    }

    private C36308a() {
    }

    /* renamed from: a */
    public static boolean m81949a() {
        return C36310b.m81950a("SmartisanManager");
    }

    /* renamed from: a */
    public static final void m81948a(String str) {
        C52711k.m112240b(str, "source");
        if (m81949a()) {
            C23189aq dataService = C20854a.m53161a().dataService();
            ContentValues contentValues = new ContentValues();
            contentValues.put("session_id", dataService.getSessionKey());
            contentValues.put("install_id", TeaAgent.getInstallId());
            m81947a(contentValues, str);
        }
    }

    /* renamed from: a */
    public static void m81947a(ContentValues contentValues, String str) {
        C47957v.m103769a(new C36309a(str, contentValues), "SmartisanManager");
    }
}
