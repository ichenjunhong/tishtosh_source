package com.bytedance.android.livesdk.p416t;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.android.livesdk.p416t.p417a.C8278e;
import com.bytedance.android.livesdk.p416t.p419c.C8294e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.t.d */
public final class C8299d {

    /* renamed from: a */
    static final Map<String, Integer> f22641a;

    static {
        HashMap hashMap = new HashMap();
        f22641a = hashMap;
        hashMap.put("android.permission.READ_CALENDAR", Integer.valueOf(R.string.ey6));
        f22641a.put("android.permission.WRITE_CALENDAR", Integer.valueOf(R.string.ey6));
        f22641a.put("android.permission.CAMERA", Integer.valueOf(R.string.ey9));
        f22641a.put("android.permission.READ_CONTACTS", Integer.valueOf(R.string.ey_));
        f22641a.put("android.permission.WRITE_CONTACTS", Integer.valueOf(R.string.ey_));
        f22641a.put("android.permission.GET_ACCOUNTS", Integer.valueOf(R.string.ey_));
        f22641a.put("android.permission.ACCESS_COARSE_LOCATION", Integer.valueOf(R.string.eye));
        f22641a.put("android.permission.ACCESS_FINE_LOCATION", Integer.valueOf(R.string.eye));
        f22641a.put("android.permission.RECORD_AUDIO", Integer.valueOf(R.string.eyg));
        f22641a.put("android.permission.READ_PHONE_STATE", Integer.valueOf(R.string.eyf));
        f22641a.put("android.permission.CALL_PHONE", Integer.valueOf(R.string.ey7));
        f22641a.put("android.permission.READ_CALL_LOG", Integer.valueOf(R.string.ey8));
        f22641a.put("android.permission.WRITE_CALL_LOG", Integer.valueOf(R.string.ey8));
        f22641a.put("com.android.voicemail.permission.ADD_VOICEMAIL", Integer.valueOf(R.string.ey7));
        f22641a.put("android.permission.USE_SIP", Integer.valueOf(R.string.ey7));
        f22641a.put("android.permission.PROCESS_OUTGOING_CALLS", Integer.valueOf(R.string.ey7));
        f22641a.put("android.permission.BODY_SENSORS", Integer.valueOf(R.string.eyh));
        f22641a.put("android.permission.SEND_SMS", Integer.valueOf(R.string.eyi));
        f22641a.put("android.permission.RECEIVE_SMS", Integer.valueOf(R.string.eyi));
        f22641a.put("android.permission.READ_SMS", Integer.valueOf(R.string.eyi));
        f22641a.put("android.permission.RECEIVE_WAP_PUSH", Integer.valueOf(R.string.eyi));
        f22641a.put("android.permission.RECEIVE_MMS", Integer.valueOf(R.string.eyi));
        f22641a.put("android.permission.READ_EXTERNAL_STORAGE", Integer.valueOf(R.string.eyd));
        f22641a.put("android.permission.WRITE_EXTERNAL_STORAGE", Integer.valueOf(R.string.eyd));
    }

    /* renamed from: a */
    public static boolean m16446a(Context context, String... strArr) {
        if (strArr == null) {
            return true;
        }
        if (VERSION.SDK_INT < 23 || C8294e.m16435c().mo14473a()) {
            return C8278e.m16398a().mo14460a(context, strArr);
        }
        return C8289c.m16424a(context, strArr);
    }

    /* renamed from: a */
    public static String[] m16447a(Activity activity, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!m16446a((Context) activity, str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
