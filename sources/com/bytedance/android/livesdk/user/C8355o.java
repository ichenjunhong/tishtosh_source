package com.bytedance.android.livesdk.user;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.common.utility.C9431p;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.user.o */
final /* synthetic */ class C8355o implements OnClickListener {

    /* renamed from: a */
    private final String f22731a;

    /* renamed from: b */
    private final long f22732b;

    /* renamed from: c */
    private final String f22733c;

    /* renamed from: d */
    private final boolean f22734d;

    /* renamed from: e */
    private final String f22735e;

    /* renamed from: f */
    private final String f22736f;

    /* renamed from: g */
    private final OnClickListener f22737g;

    C8355o(String str, long j, String str2, boolean z, String str3, String str4, OnClickListener onClickListener) {
        this.f22731a = str;
        this.f22732b = j;
        this.f22733c = str2;
        this.f22734d = z;
        this.f22735e = str3;
        this.f22736f = str4;
        this.f22737g = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = this.f22731a;
        long j = this.f22732b;
        String str2 = this.f22733c;
        boolean z = this.f22734d;
        String str3 = this.f22735e;
        String str4 = this.f22736f;
        OnClickListener onClickListener = this.f22737g;
        try {
            new JSONObject().put("source", str);
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("follow_source", str);
        hashMap.put("user_id", String.valueOf(j));
        hashMap.put("enter_from", str2);
        hashMap.put("source", str2);
        if (z) {
            hashMap.put("event_type", "click");
            hashMap.put("event_belong", "video");
            hashMap.put("event_module", "toast");
            if (!C9431p.m18664a(str3)) {
                hashMap.put("event_page", str3);
            }
            if (!C9431p.m18664a(str4)) {
                hashMap.put("enter_from", str4);
            }
        }
        TTLiveSDKContext.getHostService().mo10311d().mo15567a("unfollow_popup_confirm", hashMap);
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }
}
