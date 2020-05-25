package com.p683ss.android.ugc.aweme.bullet.module.base;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.bullet.api.C24107a;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27148b;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47888fj;
import java.util.Set;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.f */
public final class C24338f implements C24107a {

    /* renamed from: a */
    public final Context f64627a;

    /* renamed from: b */
    private final String f64628b = "CommonWebKitLoadUrlHook";

    /* renamed from: c */
    private final boolean f64629c;

    public C24338f(Context context) {
        C52711k.m112240b(context, "context");
        this.f64627a = context;
    }

    /* renamed from: a */
    public final Uri mo49903a(String str, Bundle bundle) {
        int i;
        Uri uri;
        C52711k.m112240b(str, "originUrl");
        if (C47888fj.m103588a()) {
            i = C11065a.m22390a(this.f64627a);
        } else {
            i = 0;
        }
        String a = C27148b.m65490a(str, i);
        try {
            uri = Uri.parse(a);
        } catch (Throwable unused) {
            if (this.f64629c) {
                C10691a.m21551c(this.f64627a, "拼接带状态栏高度url失败, 张翔-商业化").mo19066a();
            }
            StringBuilder sb = new StringBuilder("拼接带状态栏高度url失败: ");
            sb.append(a);
            C47625i.m103103a(sb.toString());
            uri = Uri.parse(str);
        }
        if (bundle == null) {
            C52711k.m112236a((Object) uri, "uri");
            return uri;
        }
        if (TextUtils.equals("1", uri.getQueryParameter("append_common_params")) || TextUtils.equals("1", bundle.getString("add_common"))) {
            StringBuilder sb2 = new StringBuilder(a);
            AppLog.appendCommonParams(sb2, false);
            String sb3 = sb2.toString();
            C52711k.m112236a((Object) sb3, "strBuilder.toString()");
            if (sb3 != null) {
                uri = Uri.parse(C52830p.m112447b(sb3).toString());
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        if (bundle.getBoolean("safeTemplate", false)) {
            C52711k.m112236a((Object) uri, "uri");
            if (uri.isHierarchical()) {
                String decode = Uri.decode(uri.getQueryParameter("target"));
                if (!TextUtils.isEmpty(decode)) {
                    Builder buildUpon = uri.buildUpon();
                    Uri parse = Uri.parse(decode);
                    C52711k.m112236a((Object) parse, "decodedUri");
                    Set<String> queryParameterNames = parse.getQueryParameterNames();
                    if (queryParameterNames != null && (!queryParameterNames.isEmpty())) {
                        for (String str2 : queryParameterNames) {
                            if (!C52711k.m112239a((Object) "target", (Object) str2)) {
                                buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
                            }
                        }
                    }
                    uri = Uri.parse(buildUpon.build().toString());
                }
            }
        }
        C52711k.m112236a((Object) uri, "uri");
        if (uri.isHierarchical() && TextUtils.equals("1", uri.getQueryParameter("auto_play_bgm"))) {
            bundle.putBoolean("bundle_auto_play_audio", true);
        }
        bundle.putString("bundle_origin_url", uri.toString());
        return uri;
    }
}
