package com.p683ss.android.ugc.aweme.profile.edit;

import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.setting.C41587bf;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.f */
final /* synthetic */ class C39846f implements Runnable {

    /* renamed from: a */
    private final InstagramPresenter f101666a;

    /* renamed from: b */
    private final String f101667b;

    C39846f(InstagramPresenter instagramPresenter, String str) {
        this.f101666a = instagramPresenter;
        this.f101667b = str;
    }

    public final void run() {
        String str;
        InstagramPresenter instagramPresenter = this.f101666a;
        String str2 = this.f101667b;
        instagramPresenter.f101648g = true;
        boolean z = false;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("code", Uri.encode(str2));
            if (C41587bf.m91423a()) {
                hashMap.put("new_flow", "true");
            }
            String str3 = (String) instagramPresenter.f101647f.doPost(InstagramPresenter.f101641a, hashMap).get();
            if (!TextUtils.isEmpty(str3)) {
                String string = new JSONObject(str3).getString("status_code");
                if (TextUtils.equals(string, "0")) {
                    instagramPresenter.f101646e.queryUser(instagramPresenter.f101645d);
                    str = null;
                    z = true;
                } else {
                    StringBuilder sb = new StringBuilder("Failure response, status: ");
                    sb.append(string);
                    str = sb.toString();
                }
            } else {
                str = "Empty response";
            }
        } catch (Exception e) {
            str = e.getMessage();
        }
        if (!z) {
            instagramPresenter.mo80919a(str);
            C47957v.m103768a((Runnable) new C39845e(instagramPresenter));
        }
    }
}
