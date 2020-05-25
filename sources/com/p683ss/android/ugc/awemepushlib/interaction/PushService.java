package com.p683ss.android.ugc.awemepushlib.interaction;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.message.C19481h;
import com.p683ss.android.message.sswo.SswoActivity;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.push.C19623a;
import com.p683ss.android.push.window.oppo.C19645c;
import com.p683ss.android.pushmanager.C19700f;
import com.p683ss.android.pushmanager.client.C19697g;
import com.p683ss.android.pushmanager.client.MessageAppManager;
import com.p683ss.android.pushmanager.setting.C19710b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.C23966br;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.awemepushapi.C48426a;
import com.p683ss.android.ugc.awemepushapi.IPushApi;
import com.p683ss.android.ugc.awemepushlib.manager.AwemeRedBadgerManager;
import com.p683ss.android.ugc.awemepushlib.manager.C48479a;
import com.p683ss.android.ugc.awemepushlib.p2410os.lifecycle.LifecycleCallbackAdapter;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.PushService */
public class PushService implements IPushApi {
    public void initNotificationChannel() {
        C48442b.m104831a(C11010c.m22280a());
    }

    public static IPushApi createIPushApibyMonsterPlugin() {
        Object a = C27991b.m66756a(IPushApi.class);
        if (a != null) {
            return (IPushApi) a;
        }
        return new PushService();
    }

    public void initMessageDepend() {
        C19700f.m48126a(C48445d.m104842a());
        C19645c.m48007a(C11010c.m22280a(), C48445d.m104850b());
    }

    public boolean isSswoAct(Activity activity) {
        return activity instanceof SswoActivity;
    }

    public void setAutoDisappear(int i) {
        C48445d.f121813b = i;
    }

    public void initPushAccountService(boolean z) {
        C48445d.m104845a(C11010c.m22280a(), z);
    }

    public void removeRedBadge(Context context) {
        AwemeRedBadgerManager.m104871a().mo95929b(context);
    }

    public void startPushProcess(Context context) {
        C19481h.m47692a(context, 2);
    }

    private synchronized boolean getConfirmPush(Context context) {
        return C48479a.m104895a().mo95947d(context);
    }

    private boolean getNotifyEnabled(Context context) {
        return C48479a.m104895a().mo95949e(context);
    }

    private String getParameterString(Uri uri, String str) {
        try {
            return uri.getQueryParameter(str);
        } catch (Exception unused) {
            return "";
        }
    }

    private void setNotifyEnabled(Context context, boolean z) {
        C48479a.m104895a().mo95943b(context, z);
    }

    private synchronized void setConfirmPush(Context context, boolean z) {
        C48479a.m104895a().mo95938a(context, z);
    }

    public void init(Context context, C48426a aVar) {
        boolean a = C18920g.m46048a(context);
        C48445d.m104846a(context, a, aVar, false);
        C23966br.m58771a(a, context);
    }

    public void initImmediately(Context context, C48426a aVar) {
        boolean a = C18920g.m46048a(context);
        C48445d.m104846a(context, a, aVar, true);
        C23966br.m58771a(a, context);
    }

    public void notifyOnLocationChanged(Context context, String str) {
        C19697g.m48105a();
        C19710b.m48173a().f54262b.mo41080a().mo41074a("loc", str).mo41076a();
    }

    public void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri) {
        long j;
        Intent intent2 = intent;
        Uri uri2 = uri;
        if (!z) {
            C48444c.m104839a(uri.toString());
            return;
        }
        try {
            int a = C19623a.m47973a(intent2, "msg_from", -1);
            int a2 = C19623a.m47973a(intent2, "msg_id", -1);
            HashMap hashMap = (HashMap) intent2.getSerializableExtra("log_data_extra_to_adsapp");
            if (hashMap == null) {
                hashMap = new HashMap(8);
                if (uri2 != null) {
                    String parameterString = getParameterString(uri2, "push_id");
                    if (!TextUtils.isEmpty(parameterString)) {
                        hashMap.put("rule_id", parameterString);
                    }
                    String parameterString2 = getParameterString(uri2, "gd_label");
                    if (!TextUtils.isEmpty(parameterString2)) {
                        hashMap.put("push_label", parameterString2);
                    }
                    String host = uri.getHost();
                    String parameterString3 = getParameterString(uri2, "id");
                    if (C22858c.f61208d.equals(host) && !TextUtils.isEmpty(parameterString3)) {
                        hashMap.put("group_id", getParameterString(uri2, "id"));
                    } else if (!TextUtils.isEmpty(host) && "aweme".equals(host) && !TextUtils.isEmpty(uri.getLastPathSegment())) {
                        hashMap.put("group_id", uri.getLastPathSegment());
                    }
                }
            }
            String stringExtra = intent2.getStringExtra("post_back");
            String str = (String) hashMap.get("rule_id");
            if (TextUtils.isEmpty(intent2.getStringExtra("rule_id"))) {
                intent2.putExtra("rule_id", str);
            }
            String parameterString4 = getParameterString(uri2, "push_params");
            if (!TextUtils.isEmpty(parameterString4)) {
                hashMap.put("feed_batch_params", parameterString4);
            }
            String parameterString5 = getParameterString(uri2, C22858c.f61209e);
            if (!TextUtils.isEmpty(parameterString5) && TextUtils.equals("aweme", uri.getHost())) {
                if (parameterString5.contains(",")) {
                    parameterString5 = parameterString5.substring(0, parameterString5.indexOf(","));
                }
                hashMap.put("group_id", parameterString5);
            }
            int a3 = C19623a.m47973a(intent2, CustomActionPushReceiver.f104058c, -1);
            String stringExtra2 = intent2.getStringExtra(CustomActionPushReceiver.f104059d);
            JSONObject jSONObject = new JSONObject(hashMap);
            if (TextUtils.isEmpty(str)) {
                j = (long) a2;
            } else {
                j = Long.valueOf(str).longValue();
            }
            switch (a) {
                case 1:
                    C48444c.m104836a(context, "news_notify_view", (long) a2, -1, new JSONObject[0]);
                    trackClickPush(context, j, true, stringExtra, jSONObject);
                    break;
                case 2:
                    C48444c.m104836a(context, "news_notify_view", (long) a2, -1, new JSONObject[0]);
                    trackClickPush(context, j, false, stringExtra, jSONObject);
                    break;
            }
            if (a3 != -1 && !C9431p.m18664a(stringExtra2)) {
                MessageAppManager.inst().trackPush(context, a3, stringExtra2);
            }
        } catch (Exception unused) {
        }
    }

    private void trackClickPush(Context context, long j, boolean z, String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            try {
                jSONObject2 = new JSONObject();
            } catch (Exception unused) {
            }
        } else {
            jSONObject2 = jSONObject;
        }
        if (z) {
            jSONObject2.put("click_position", "notify");
        } else {
            jSONObject2.put("click_position", "alert");
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject2.put("post_back", str);
        }
        jSONObject2.put("rule_id", j);
        C26890h.m65012a("push_click", jSONObject2);
        Application a = C32463a.m75161a();
        final long j2 = j;
        final boolean z2 = z;
        final String str2 = str;
        final JSONObject jSONObject3 = jSONObject;
        C484391 r0 = new LifecycleCallbackAdapter() {
            public final void onActivityResumed(Activity activity) {
                C32463a.m75161a().unregisterActivityLifecycleCallbacks(this);
                C18842a.m45934b(new Runnable() {
                    public final void run() {
                        long j = j2;
                        boolean z = z2;
                        String str = str2;
                        JSONObject jSONObject = jSONObject3;
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        if (z) {
                            jSONObject.put("click_position", "notify");
                        } else {
                            jSONObject.put("click_position", "alert");
                        }
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("post_back", str);
                        }
                        jSONObject.put("rule_id", j);
                        C26890h.m65012a("push_click_v2", jSONObject);
                    }
                });
            }
        };
        a.registerActivityLifecycleCallbacks(r0);
    }
}
