package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.net.Uri;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.core.p230g.C3889d;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.livesdk.browser.p289c.C4697b;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4699a;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4700b;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.schema.interfaces.C8263c;
import com.bytedance.common.utility.C9431p;
import com.p683ss.ttm.player.MediaPlayer;

/* renamed from: com.bytedance.android.livesdk.schema.l */
public final class C8267l implements C8263c {
    /* renamed from: a */
    private static String m16383a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("url");
        if (C9431p.m18664a(queryParameter)) {
            return null;
        }
        Uri parse = Uri.parse(queryParameter);
        String queryParameter2 = uri.getQueryParameter("status_bar_height");
        if (!C9431p.m18664a(queryParameter2)) {
            parse = parse.buildUpon().appendQueryParameter("status_bar_height", queryParameter2).build();
        }
        return parse.toString();
    }

    public final boolean canHandle(Uri uri) {
        boolean z;
        if (!TextUtils.equals("webcast_webview", uri.getHost())) {
            if (uri == null) {
                z = false;
            } else {
                z = TextUtils.equals(uri.getQueryParameter("__live_platform__"), "webcast");
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final boolean handle(Context context, Uri uri) {
        boolean z;
        String str;
        String str2;
        String a = m16383a(uri);
        boolean z2 = false;
        if (C9431p.m18664a(a)) {
            return false;
        }
        if (mo14455a(context, uri) != null) {
            return true;
        }
        C4697b c = C4514j.m10883j().mo10322c();
        C4699a b = C4704c.m11227b(a);
        if (m16381a(uri, "hide_nav_bar", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        C4699a a2 = b.mo10506a(z);
        if (uri != null) {
            str = uri.getQueryParameter("status_bar_color");
        } else {
            str = "";
        }
        C4699a b2 = a2.mo10507b(str);
        if (uri != null) {
            str2 = uri.getQueryParameter("status_bar_bg_color");
        } else {
            str2 = "";
        }
        C4699a c2 = b2.mo10509c(str2);
        if (m16381a(uri, "hide_status_bar", 0) == 1) {
            z2 = true;
        }
        c.mo10490a(context, c2.mo10508b(z2));
        return true;
    }

    /* renamed from: a */
    public final C4104a mo14455a(Context context, Uri uri) {
        String a = m16383a(uri);
        if (C9431p.m18664a(a)) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("type");
        if (queryParameter == null) {
            queryParameter = "";
        }
        char c = 65535;
        int hashCode = queryParameter.hashCode();
        if (hashCode != 106852524) {
            if (hashCode == 110066619 && queryParameter.equals("fullscreen")) {
                c = 1;
            }
        } else if (queryParameter.equals("popup")) {
            c = 0;
        }
        if (c != 0) {
            return null;
        }
        if (TextUtils.equals("bottom", uri.getQueryParameter("gravity"))) {
            return m16382a(a, context, uri);
        }
        return m16384b(a, context, uri);
    }

    /* renamed from: a */
    private static int m16381a(Uri uri, String str, int i) {
        try {
            String queryParameter = uri.getQueryParameter(str);
            queryParameter.getClass();
            return Integer.parseInt(queryParameter);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: a */
    private static C4104a m16382a(String str, Context context, Uri uri) {
        C4104a a = C4514j.m10883j().mo10322c().mo10487a(C4704c.m11226a(str).mo10511a(m16381a(uri, "radius", 8), m16381a(uri, "radius", 8), 0, 0).mo10514b(m16381a(uri, "height", (int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL)).mo10510a((int) C3922z.m9914e(C3922z.m9910c())).mo10520e(80));
        FragmentActivity b = C3889d.m9832b(context);
        if (b == null) {
            return null;
        }
        C4104a.m10232a(b, a);
        return a;
    }

    /* renamed from: b */
    private static C4104a m16384b(String str, Context context, Uri uri) {
        boolean z;
        if (m16381a(uri, "mask_click_disable", 0) == 0) {
            z = true;
        } else {
            z = false;
        }
        C4700b e = C4704c.m11226a(str).mo10518d(m16381a(uri, "radius", 8)).mo10514b(m16381a(uri, "height", (int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL)).mo10510a(m16381a(uri, "width", 300)).mo10519d(z).mo10520e(17);
        String queryParameter = uri.getQueryParameter("close_button");
        if (!C9431p.m18664a(queryParameter) && queryParameter.equals("true")) {
            e.mo10513a(true);
        }
        String queryParameter2 = uri.getQueryParameter("disable_background");
        if (!C9431p.m18664a(queryParameter2) && queryParameter2.equals("true")) {
            e.mo10519d(false);
        }
        C4104a a = C4514j.m10883j().mo10322c().mo10487a(e);
        FragmentActivity b = C3889d.m9832b(context);
        if (b == null) {
            return null;
        }
        C4104a.m10232a(b, a);
        return a;
    }
}
