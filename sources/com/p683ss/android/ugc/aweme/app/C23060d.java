package com.p683ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.newmedia.C19555f;
import com.p683ss.android.ugc.aweme.app.C23057c.C23058a;
import com.p683ss.android.ugc.aweme.app.p1379i.C23106a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.p683ss.android.ugc.aweme.bullet.utils.C24348b;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.net.URLDecoder;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.app.d */
public final class C23060d {

    /* renamed from: a */
    public static final String f61427a = f61427a;

    /* renamed from: b */
    public static final String f61428b = f61428b;

    /* renamed from: c */
    public static final String f61429c = f61429c;

    /* renamed from: d */
    public static final String f61430d = f61430d;

    /* renamed from: e */
    public static final C23061a f61431e = new C23061a(null);

    /* renamed from: com.ss.android.ugc.aweme.app.d$a */
    public static final class C23061a {
        private C23061a() {
        }

        /* renamed from: a */
        private static String m56599a() {
            return C23060d.f61428b;
        }

        public /* synthetic */ C23061a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static Intent m56597a(Context context, Uri uri, boolean z) {
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            String str;
            String str2;
            C52711k.m112240b(context, "context");
            if (uri == null) {
                return null;
            }
            try {
                Intent intent = new Intent(context, CrossPlatformActivity.class);
                String queryParameter = uri.getQueryParameter("url");
                if (C9431p.m18664a(queryParameter)) {
                    return null;
                }
                String decode = URLDecoder.decode(queryParameter, "UTF-8");
                Uri parse = Uri.parse(decode);
                if (parse == null) {
                    z2 = false;
                } else {
                    z2 = C23085f.f61488a.mo47817a(parse.getQueryParameter("rotate"));
                }
                if (parse == null) {
                    z3 = false;
                } else {
                    z3 = C23085f.f61488a.mo47817a(parse.getQueryParameter("no_hw"));
                }
                if (parse == null) {
                    z4 = false;
                } else {
                    z4 = C23085f.f61488a.mo47817a(parse.getQueryParameter("hide_more"));
                }
                if (parse == null) {
                    z5 = false;
                } else {
                    z5 = C23085f.f61488a.mo47817a(parse.getQueryParameter("hide_bar"));
                }
                if (parse == null) {
                    z6 = false;
                } else {
                    z6 = C23085f.f61488a.mo47817a(parse.getQueryParameter("hide_status_bar"));
                }
                if (parse == null) {
                    z7 = false;
                } else {
                    z7 = C23085f.f61488a.mo47817a(parse.getQueryParameter("hide_nav_bar"));
                }
                if (parse == null) {
                    z8 = false;
                } else {
                    z8 = C23085f.f61488a.mo47817a(parse.getQueryParameter("hide_more"));
                }
                if (parse != null) {
                    str = parse.getQueryParameter("previous_page");
                } else {
                    str = null;
                }
                if (parse != null) {
                    str2 = parse.getQueryParameter("backurl");
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra("backurl", str2);
                }
                C23085f fVar = C23085f.f61488a;
                C52711k.m112236a((Object) decode, "url");
                boolean b = z8 | fVar.mo47818b(decode);
                if (!TextUtils.isEmpty(str)) {
                    intent.putExtra("enter_from", str);
                }
                if (z5 || z7) {
                    intent.putExtra("hide_nav_bar", true);
                }
                if (z6) {
                    intent.putExtra("hide_status_bar", true);
                }
                String queryParameter2 = parse.getQueryParameter("ad_id");
                if (!C9431p.m18664a(queryParameter2)) {
                    try {
                        intent.putExtra("ad_id", Long.parseLong(queryParameter2));
                    } catch (Exception unused) {
                    }
                }
                if (z) {
                    String a = C23106a.m56673a(decode, "push");
                    if (!C52711k.m112239a((Object) decode, (Object) a)) {
                        intent.putExtra("safeTemplate", true);
                    }
                    decode = a;
                }
                intent.setData(Uri.parse(decode));
                intent.putExtra("swipe_mode", 2);
                intent.putExtra("show_toolbar", true);
                if (z2) {
                    intent.putExtra("orientation", 0);
                }
                if (z3) {
                    intent.putExtra("bundle_no_hw_acceleration", z3);
                }
                if (z4) {
                    intent.putExtra("hide_more", z4);
                }
                if (!b) {
                    intent.putExtra("hide_more", b);
                }
                String queryParameter3 = parse.getQueryParameter("title");
                if (C9431p.m18664a(queryParameter3)) {
                    queryParameter3 = Uri.parse(decode).getQueryParameter("title");
                }
                String queryParameter4 = parse.getQueryParameter("title_extra");
                if (C9431p.m18664a(queryParameter4)) {
                    queryParameter4 = queryParameter3;
                }
                if (!C9431p.m18664a(queryParameter4)) {
                    intent.putExtra("title", queryParameter4);
                } else {
                    intent.putExtra("title", " ");
                    intent.putExtra("use_webview_title", true);
                }
                String queryParameter5 = parse.getQueryParameter("gd_label");
                if (!C9431p.m18664a(queryParameter5)) {
                    intent.putExtra("gd_label", queryParameter5);
                }
                String queryParameter6 = parse.getQueryParameter("gd_ext_json");
                if (!C9431p.m18664a(queryParameter6)) {
                    intent.putExtra("gd_ext_json", queryParameter6);
                }
                String queryParameter7 = parse.getQueryParameter("webview_track_key");
                if (!C9431p.m18664a(queryParameter7)) {
                    intent.putExtra("webview_track_key", queryParameter7);
                }
                String queryParameter8 = parse.getQueryParameter("wap_headers");
                if (!C9431p.m18664a(queryParameter8)) {
                    intent.putExtra("wap_headers", queryParameter8);
                }
                intent.putExtra("bundle_auto_play_audio", C23085f.f61488a.mo47817a(parse.getQueryParameter("auto_play_bgm")));
                intent.putExtra("show_load_dialog", !C23085f.f61488a.mo47817a(parse.getQueryParameter("hide_loading")));
                return intent;
            } catch (Exception unused2) {
                return null;
            }
        }

        /* renamed from: a */
        public final boolean mo47789a(Context context, String str, String str2) {
            String str3;
            boolean z = false;
            if (context == null) {
                return false;
            }
            try {
                if (!C9431p.m18664a(str)) {
                    if (context instanceof BulletContainerActivity) {
                        if (C19547d.m47842a(str)) {
                            str = C24348b.m59717b(str);
                        } else {
                            Uri parse = Uri.parse(str);
                            String queryParameter = parse.getQueryParameter("url");
                            if (queryParameter != null) {
                                str3 = C24348b.m59717b(queryParameter);
                            } else {
                                str3 = null;
                            }
                            str = String.valueOf(C24348b.m59709a(parse, "url", str3));
                        }
                    }
                    Uri parse2 = Uri.parse(str);
                    if (C19547d.m47842a(str)) {
                        try {
                            C52711k.m112240b(context, "context");
                            if (I18nBridgeService.getBridgeService_Monster().tryOpenPolarisPage(context, str)) {
                                return true;
                            }
                            Intent intent = new Intent(context, CrossPlatformActivity.class);
                            intent.setData(parse2);
                            intent.putExtra("swipe_mode", 2);
                            context.startActivity(intent);
                            return true;
                        } catch (Exception unused) {
                            z = true;
                        }
                    } else {
                        C52711k.m112236a((Object) parse2, "uri");
                        String scheme = parse2.getScheme();
                        C23058a aVar = C23057c.f61426d;
                        C52711k.m112236a((Object) scheme, "scheme");
                        boolean b = aVar.mo47788b(scheme) | C52711k.m112239a((Object) scheme, (Object) "aweme");
                        String host = parse2.getHost();
                        if (b && C52711k.m112239a((Object) C23060d.f61427a, (Object) host)) {
                            Intent a = C23085f.m56626a(context, parse2);
                            if (a != null) {
                                a.putExtra("swipe_mode", 2);
                            }
                            if (a != null) {
                                context.startActivity(a);
                            }
                            return true;
                        } else if (!b) {
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setData(parse2);
                            if (C18920g.m46049a(context, intent2)) {
                                intent2.putExtra(m56599a(), str);
                                context.startActivity(intent2);
                                return true;
                            } else if (C52830p.m112411b(scheme, C23058a.m56585a(), false, 2, null)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(C23060d.f61430d);
                                sb.append(scheme);
                                Intent intent3 = new Intent(sb.toString());
                                if (C18920g.m46049a(context, intent3)) {
                                    intent3.putExtra(m56599a(), str);
                                    context.startActivity(intent3);
                                    return true;
                                }
                            }
                        } else if (C19555f.m47851a() != null) {
                            Intent intent4 = new Intent(context, DeepLinkHandlerActivity.class);
                            intent4.setData(parse2);
                            intent4.putExtra(C23060d.f61429c, true);
                            context.startActivity(intent4);
                            return true;
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.app.AwemeAppData");
                        }
                    }
                }
                if (!C9431p.m18664a(str2) && C18920g.m46052b(context, str2)) {
                    context.startActivity(C18920g.m46046a(context, str2));
                    return true;
                }
            } catch (Exception unused2) {
            }
            return z;
        }
    }

    /* renamed from: a */
    public static final Intent m56596a(Context context, Uri uri, boolean z) {
        return C23061a.m56597a(context, uri, z);
    }
}
