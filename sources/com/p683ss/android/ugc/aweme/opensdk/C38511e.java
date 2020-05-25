package com.p683ss.android.ugc.aweme.opensdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.feed.model.AnchorInfo;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.opensdk.p2038a.C38484a;
import com.p683ss.android.ugc.aweme.opensdk.p2038a.C38484a.C38485a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.opensdk.e */
public final class C38511e {

    /* renamed from: a */
    public static final C38511e f97986a = new C38511e();

    private C38511e() {
    }

    /* renamed from: a */
    public static C38484a m85842a(String str) {
        C52711k.m112240b(str, "extra");
        try {
            return (C38484a) new C17971f().mo34884a(str, C38484a.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m85843a(Context context, Aweme aweme) {
        Integer num;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        AnchorInfo anchorInfo = aweme.getAnchorInfo();
        if (anchorInfo != null) {
            num = anchorInfo.getType();
        } else {
            num = null;
        }
        int type = C25600a.OPEN_PLATFORM_ANCHOR.getTYPE();
        if (num != null && num.intValue() == type) {
            AnchorInfo anchorInfo2 = aweme.getAnchorInfo();
            if (anchorInfo2 != null) {
                String extra = anchorInfo2.getExtra();
                if (extra != null) {
                    C38484a a = m85842a(extra);
                    if (a != null) {
                        C38485a anchorInfo3 = a.getAnchorInfo();
                        if (anchorInfo3 != null) {
                            String url = anchorInfo3.getUrl();
                            if (url != null) {
                                Intent intent = new Intent(context, CrossPlatformActivity.class);
                                intent.setData(Uri.parse(url));
                                intent.putExtra("use_webview_title", true);
                                context.startActivity(intent);
                            }
                        }
                    }
                }
            }
        }
    }
}
