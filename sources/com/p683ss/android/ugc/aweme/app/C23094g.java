package com.p683ss.android.ugc.aweme.app;

import android.net.Uri;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.newmedia.C19561i;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.feed.p1721g.C30259a;
import com.p683ss.android.ugc.aweme.push.C40906h;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.g */
public final class C23094g {
    /* renamed from: b */
    private static boolean m56656b(Uri uri) {
        String str;
        boolean z = false;
        if (uri == null) {
            return false;
        }
        if (!"aweme".equals(uri.getHost())) {
            return false;
        }
        try {
            str = uri.getQueryParameter("gd_label");
        } catch (Throwable unused) {
            str = "";
        }
        if ("click_push_recommend".equals(str) || "click_push_newvideo".equals(str) || "click_push_videoat".equals(str)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private List<String> m56655a(Uri uri) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (uri == null) {
            return arrayList;
        }
        String path = uri.getPath();
        if (m56656b(uri)) {
            if (!C9431p.m18664a(path) && path.startsWith("/detail/")) {
                arrayList.add(uri.getLastPathSegment());
            } else if (!C9431p.m18664a(path) && path.startsWith("/detail_list")) {
                String str2 = "";
                try {
                    str2 = uri.getQueryParameter(C22858c.f61209e);
                } catch (Throwable unused) {
                }
                int i = 0;
                if (!C9431p.m18664a(str2)) {
                    String[] split = str2.split(",");
                    int length = split.length;
                    while (i < length) {
                        arrayList.add(split[i]);
                        i++;
                    }
                } else {
                    try {
                        str = uri.getQueryParameter("push_params");
                    } catch (Throwable unused2) {
                        str = "";
                    }
                    if (!C9431p.m18664a(str)) {
                        try {
                            String optString = new JSONObject(str).optString(C22858c.f61209e);
                            if (!C9431p.m18664a(optString)) {
                                String[] split2 = optString.split(",");
                                int length2 = split2.length;
                                while (i < length2) {
                                    arrayList.add(split2[i]);
                                    i++;
                                }
                            }
                        } catch (Exception | JSONException unused3) {
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo47837a(Uri uri, boolean z) {
        String str;
        if (m56656b(uri)) {
            C40906h a = C40906h.m90485a();
            List<String> a2 = m56655a(uri);
            if (a2 != null) {
                for (String a3 : a2) {
                    a.mo83390a(a3);
                }
            }
            C40906h.m90485a().f104107a = true;
            try {
                if (C19561i.m47861a()) {
                    if (z) {
                        if (uri != null) {
                            String path = uri.getPath();
                            if (m56656b(uri) && !C9431p.m18664a(path) && path.startsWith("/detail/")) {
                                str = uri.getLastPathSegment();
                                C30259a.m71089a().mo60621a(str, System.currentTimeMillis());
                            }
                        }
                        str = "";
                        C30259a.m71089a().mo60621a(str, System.currentTimeMillis());
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
