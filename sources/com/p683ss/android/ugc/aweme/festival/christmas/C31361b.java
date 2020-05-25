package com.p683ss.android.ugc.aweme.festival.christmas;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.base.p1417h.C23540d;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27148b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.util.C47625i;
import java.net.URLEncoder;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.b */
public final class C31361b {

    /* renamed from: a */
    public static C31364d f82138a = null;

    /* renamed from: b */
    private static boolean f82139b = true;

    /* renamed from: b */
    public static void m73114b() {
        f82138a.mo48494a(System.currentTimeMillis());
    }

    /* renamed from: a */
    public static boolean m73112a() {
        if (!C31357a.m73095a() || !f82139b) {
            return false;
        }
        f82139b = false;
        return C31357a.m73096a(f82138a.mo48493a(), System.currentTimeMillis());
    }

    static {
        try {
            f82138a = (C31364d) C23540d.m57713a(AwemeApplication.m56199a(), C31364d.class);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Get show xmas tree SP failed.");
            sb.append(th.getMessage());
            C47625i.m103103a(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m73110a(Context context, String str) {
        m73111a(context, str, null);
    }

    /* renamed from: a */
    public static boolean m73113a(Activity activity, Aweme aweme) {
        boolean z = false;
        if (activity == null || aweme == null || C31357a.m73104e() == null) {
            return false;
        }
        if (C31357a.m73095a() && C31357a.m73099b(aweme)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static void m73111a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            if (str.startsWith("https://") || str.startsWith("http://")) {
                try {
                    sb.append("aweme://ame/webview/?url=");
                    sb.append(URLEncoder.encode(str, "ISO-8859-1"));
                } catch (Exception unused) {
                }
                Intent a = C27148b.m65481a(context, Uri.parse(sb.toString()));
                a.setClass(context, CrossPlatformActivity.class);
                a.putExtra("hide_more", false);
                a.putExtra("bundle_auto_play_audio", true);
                context.startActivity(a);
                return;
            }
            sb.append(str);
            C41302w.m91042a().mo83861a(sb.toString());
        }
    }
}
