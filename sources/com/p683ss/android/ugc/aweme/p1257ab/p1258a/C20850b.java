package com.p683ss.android.ugc.aweme.p1257ab.p1258a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.ab.a.b */
public final class C20850b {
    /* renamed from: a */
    public static boolean m53158a(Aweme aweme) {
        return false;
    }

    /* renamed from: b */
    public static boolean m53159b(Aweme aweme) {
        return false;
    }

    /* renamed from: c */
    public static UrlModel m53160c(Aweme aweme) {
        if (aweme == null || aweme.getXiGuaTask() == null || !aweme.getXiGuaTask().isXiGuaTask()) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(aweme.getXiGuaTask().getIconUrl());
        urlModel.setUri(aweme.getXiGuaTask().getIconUrl());
        urlModel.setUrlList(arrayList);
        return urlModel;
    }

    /* renamed from: a */
    public static void m53157a(Context context, Aweme aweme) {
        if (context != null && aweme != null && aweme.getXiGuaTask() != null) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setData(Uri.parse(aweme.getXiGuaTask().getJumpUrl()));
            intent.putExtra("use_webview_title", true);
            context.startActivity(intent);
        }
    }
}
