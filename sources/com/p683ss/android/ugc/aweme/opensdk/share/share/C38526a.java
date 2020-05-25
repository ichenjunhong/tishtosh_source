package com.p683ss.android.ugc.aweme.opensdk.share.share;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.common.C26855c;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.opensdk.share.share.Share.Request;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.share.a */
public final class C38526a {

    /* renamed from: com.ss.android.ugc.aweme.opensdk.share.share.a$a */
    static class C38527a {
        @C17952c(mo34828a = "create_by")

        /* renamed from: a */
        String f98008a;

        C38527a(String str) {
            this.f98008a = str;
        }
    }

    /* renamed from: a */
    public static void m85865a() {
        for (Activity finish : ActivityStack.getActivityStack()) {
            finish.finish();
        }
    }

    /* renamed from: a */
    public static C26916m m85862a(Intent intent) {
        Bundle c = m85869c(intent);
        if (c == null) {
            return null;
        }
        return new C26916m(c);
    }

    /* renamed from: a */
    public static C26916m m85863a(Object obj) {
        if (obj == null) {
            return null;
        }
        return AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().shareContextInfo(obj);
    }

    /* renamed from: c */
    private static Bundle m85869c(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !TextUtils.isEmpty(extras.getString("_aweme_open_sdk_params_client_key"))) {
            return extras;
        }
        return null;
    }

    /* renamed from: a */
    public static Request m85864a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Request request = new Request();
        request.fromBundle(bundle);
        return request;
    }

    /* renamed from: b */
    public static C26916m m85868b(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        extras.putString("_open_platform_content_json", new C17971f().mo34889b(new C38527a("system_share")));
        return new C26916m(extras);
    }

    /* renamed from: a */
    public static boolean m85866a(C26855c cVar) {
        if (cVar == null || TextUtils.isEmpty(cVar.mClientKey) || !cVar.mNeedShowDialog) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m85867a(String str) {
        if (str != null) {
            return str.startsWith("video/");
        }
        return false;
    }
}
