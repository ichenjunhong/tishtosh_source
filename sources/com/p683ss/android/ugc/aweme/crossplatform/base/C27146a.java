package com.p683ss.android.ugc.aweme.crossplatform.base;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.p1372c.C23059a;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils.C23709a;
import com.p683ss.android.ugc.aweme.crossplatform.abtest.WebviewProgressBarExperiment;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27182a;
import com.p683ss.android.ugc.aweme.utils.C47888fj;
import com.p683ss.android.ugc.aweme.web.C48372k;
import com.ss.android.ugc.trill.R;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.base.a */
public abstract class C27146a {
    /* renamed from: a */
    private static <T> T m65487a(Object obj) {
        return obj;
    }

    /* renamed from: a */
    public static String m65488a(int i) {
        switch (i) {
            case 1:
                return C23060d.f61427a;
            case 2:
                return "react-native";
            case 3:
                return "webview_back";
            default:
                return "unknown";
        }
    }

    /* renamed from: a */
    public static boolean m65495a(C27182a aVar, Activity activity) {
        if (!C47888fj.m103588a() || aVar == null || activity == null || !aVar.f71721d.f71813s || (!aVar.f71721d.f71811q && C23059a.m56592a(activity))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m65492a(Activity activity) {
        final View findViewById = activity.findViewById(R.id.a2k);
        findViewById.setPadding(0, 0, 0, 0);
        if (activity instanceof C0184k) {
            KeyboardUtils.m58181a((C0184k) activity, findViewById, new C23709a() {
                /* renamed from: a */
                public final void mo49145a() {
                    findViewById.setPadding(0, 0, 0, 0);
                }

                /* renamed from: b */
                public final void mo49146b() {
                    findViewById.setPadding(0, 0, 0, 0);
                }
            });
        }
    }

    /* renamed from: a */
    public static String m65490a(String str, int i) {
        if (str == null || !C19547d.m47842a(str)) {
            return str;
        }
        try {
            if (!C48372k.f121668a.contains(Uri.parse(str).getHost())) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            if (!str.contains("?")) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            StringBuilder sb2 = new StringBuilder("status_bar_height=");
            sb2.append(i);
            sb.append(sb2.toString());
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static boolean m65496a(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        return charSequence2.startsWith(WebKitApi.SCHEME_HTTP) || charSequence2.startsWith(WebKitApi.SCHEME_HTTPS) || charSequence2.startsWith("about:");
    }

    /* renamed from: a */
    public static List<String> m65491a() {
        return Arrays.asList(new String[]{"iesdouyin.com", "douyincdn.com", "douyin.com", "snssdk.com", "amemv.com"});
    }

    /* renamed from: a */
    public static boolean m65493a(Uri uri, Bundle bundle, String str, boolean z) {
        if (uri == null || !uri.isHierarchical() || uri.getQueryParameter(str) == null) {
            return bundle != null ? bundle.getBoolean(str, z) : z;
        }
        return TextUtils.equals(uri.getQueryParameter(str), "1");
    }

    /* renamed from: a */
    public static boolean m65497a(String str) {
        return !C9431p.m18664a(str) && "1".equals(str);
    }

    /* renamed from: a */
    public static boolean m65494a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("webview_progress_bar", C10181b.m20511a().mo18172a(WebviewProgressBarExperiment.class, true, "webview_progress_bar", 31744, false));
    }

    /* renamed from: b */
    public static int m65498b(Activity activity) {
        if (C47888fj.m103588a()) {
            return ImmersionBar.getStatusBarHeight(activity);
        }
        return 0;
    }

    /* renamed from: b */
    public static Uri m65500b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str);
    }

    /* renamed from: a */
    public static Intent m65482a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (!str.startsWith("https://") && !str.startsWith("http://")) {
            return null;
        }
        try {
            sb.append("aweme://ame/webview/?url=");
            sb.append(URLEncoder.encode(str, "ISO-8859-1"));
        } catch (Exception unused) {
        }
        return C27148b.m65481a(context, Uri.parse(sb.toString()));
    }

    /* renamed from: a */
    public static Intent m65481a(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            String queryParameter = uri.getQueryParameter("url");
            if (C9431p.m18664a(queryParameter)) {
                return null;
            }
            boolean a = C27148b.m65497a(uri.getQueryParameter("no_hw"));
            boolean a2 = C27148b.m65497a(uri.getQueryParameter("hide_more"));
            boolean a3 = C27148b.m65497a(uri.getQueryParameter("hide_bar"));
            boolean a4 = C27148b.m65497a(uri.getQueryParameter("hide_status_bar"));
            boolean a5 = C27148b.m65497a(uri.getQueryParameter("hide_nav_bar"));
            boolean a6 = C27148b.m65497a(uri.getQueryParameter("hide_more"));
            if (a3 || a5) {
                intent.putExtra("hide_nav_bar", true);
            }
            if (a4) {
                intent.putExtra("hide_status_bar", true);
            }
            String queryParameter2 = uri.getQueryParameter("ad_id");
            if (!C9431p.m18664a(queryParameter2)) {
                try {
                    intent.putExtra("ad_id", Long.parseLong(queryParameter2));
                } catch (Exception unused) {
                }
            }
            String decode = URLDecoder.decode(queryParameter, "UTF-8");
            intent.setData(Uri.parse(decode));
            intent.putExtra("swipe_mode", 2);
            intent.putExtra("show_toolbar", true);
            if (a) {
                intent.putExtra("bundle_no_hw_acceleration", true);
            }
            if (a2) {
                intent.putExtra("hide_more", true);
            }
            if (!a6) {
                intent.putExtra("hide_more", a6);
            }
            String queryParameter3 = uri.getQueryParameter("title");
            if (C9431p.m18664a(queryParameter3)) {
                queryParameter3 = Uri.parse(decode).getQueryParameter("title");
            }
            String queryParameter4 = uri.getQueryParameter("title_extra");
            if (C9431p.m18664a(queryParameter4)) {
                queryParameter4 = queryParameter3;
            }
            if (!C9431p.m18664a(queryParameter4)) {
                intent.putExtra("title", queryParameter4);
            } else {
                intent.putExtra("title", " ");
                intent.putExtra("use_webview_title", true);
            }
            String queryParameter5 = uri.getQueryParameter("gd_label");
            if (!C9431p.m18664a(queryParameter5)) {
                intent.putExtra("gd_label", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("gd_ext_json");
            if (!C9431p.m18664a(queryParameter6)) {
                intent.putExtra("gd_ext_json", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("webview_track_key");
            if (!C9431p.m18664a(queryParameter7)) {
                intent.putExtra("webview_track_key", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("wap_headers");
            if (!C9431p.m18664a(queryParameter8)) {
                intent.putExtra("wap_headers", queryParameter8);
            }
            return intent;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public static int m65499b(Uri uri, Bundle bundle, String str) {
        if (uri == null) {
            return -1;
        }
        String str2 = null;
        if (uri.isHierarchical()) {
            str2 = uri.getQueryParameter(str);
        }
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            if (bundle != null) {
                return bundle.getInt(str);
            }
            return -1;
        }
    }

    /* renamed from: a */
    public static int m65480a(Uri uri, Bundle bundle, int i) {
        String str;
        String str2 = "bundle_webview_background";
        if (bundle != null) {
            i = bundle.getInt(str2, i);
        }
        if (uri == null || !uri.isHierarchical() || uri.getQueryParameter(str2) == null) {
            str = null;
        } else {
            str = uri.getQueryParameter(str2);
        }
        try {
            if (TextUtils.isEmpty(str) || str.contains("#")) {
                return i;
            }
            StringBuilder sb = new StringBuilder("#");
            sb.append(str);
            return Color.parseColor(sb.toString());
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: c */
    public static int m65502c(Uri uri, Bundle bundle, String str) {
        String str2 = null;
        if (uri != null) {
            try {
                if (uri.isHierarchical() && uri.getQueryParameter(str) != null) {
                    str2 = uri.getQueryParameter(str);
                }
            } catch (Exception unused) {
                return -2;
            }
        }
        if (!(!TextUtils.isEmpty(str2) || bundle == null || bundle.getString(str) == null)) {
            str2 = bundle.getString(str);
        }
        if (!TextUtils.isEmpty(str2) && !str2.contains("#")) {
            StringBuilder sb = new StringBuilder("#");
            sb.append(str2);
            str2 = sb.toString();
        }
        if (!TextUtils.isEmpty(str2)) {
            return Color.parseColor(str2);
        }
        return -2;
    }

    /* renamed from: a */
    private static Object m65485a(Uri uri, String str, Class cls) {
        try {
            String queryParameter = uri.getQueryParameter(str);
            if (queryParameter == null) {
                return null;
            }
            if (cls == String.class) {
                return queryParameter;
            }
            if (cls == Integer.class) {
                return Integer.valueOf(Integer.parseInt(queryParameter));
            }
            if (cls == Long.class) {
                return Long.valueOf(Long.parseLong(queryParameter));
            }
            if (cls == Boolean.class) {
                return Boolean.valueOf(Boolean.parseBoolean(queryParameter));
            }
            if (cls == Float.class) {
                return Float.valueOf(Float.parseFloat(queryParameter));
            }
            if (cls == Double.class) {
                return Double.valueOf(Double.parseDouble(queryParameter));
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static String m65489a(Uri uri, Bundle bundle, String str) {
        if (uri != null && uri.isHierarchical() && !TextUtils.isEmpty(uri.getQueryParameter(str))) {
            return uri.getQueryParameter(str);
        }
        if (bundle == null || TextUtils.isEmpty(bundle.getString(str))) {
            return null;
        }
        return bundle.getString(str);
    }

    /* renamed from: a */
    public static <T> T m65486a(Uri uri, String str, Class<T> cls, T t) {
        if (uri == null) {
            return t;
        }
        T a = m65487a(m65485a(uri, str, (Class) cls));
        if (a != null) {
            return a;
        }
        return t;
    }

    /* renamed from: b */
    public static boolean m65501b(Uri uri, Bundle bundle, String str, boolean z) {
        if (uri == null || !uri.isHierarchical() || TextUtils.isEmpty(uri.getQueryParameter(str))) {
            if (bundle != null) {
                return bundle.getBoolean(str, false);
            }
            return false;
        } else if (uri.getQueryParameter(str).equals("1") || uri.getQueryParameter(str).equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static <T> T m65483a(Uri uri, String str, Bundle bundle, String str2, Class<T> cls) {
        if (uri != null) {
            try {
                if (!TextUtils.isEmpty(str) && uri.isHierarchical() && uri.getQueryParameter(str) != null) {
                    Object a = m65485a(uri, str, (Class) cls);
                    if (cls.isInstance(a)) {
                        return m65487a(a);
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (bundle != null && !TextUtils.isEmpty(str2)) {
            return m65487a(bundle.get(str2));
        }
        return null;
    }

    /* renamed from: a */
    public static <T> T m65484a(Uri uri, String str, Bundle bundle, String str2, Class<T> cls, T t) {
        T a = m65483a(uri, str, bundle, str2, cls);
        if (a != null) {
            return a;
        }
        return t;
    }
}
