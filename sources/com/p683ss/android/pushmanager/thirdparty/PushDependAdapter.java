package com.p683ss.android.pushmanager.thirdparty;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.p523c.C9384a;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.common.utility.p526f.C9412d;
import com.p683ss.android.message.log.C19492c;
import com.p683ss.android.pushmanager.C19700f;
import com.p683ss.android.pushmanager.C19702h;
import com.p683ss.android.pushmanager.p1204a.C19662b;
import com.p683ss.android.pushmanager.p1204a.C19670f;
import com.p683ss.android.pushmanager.setting.C19710b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.thirdparty.PushDependAdapter */
public class PushDependAdapter implements IPushDepend {
    public static PushDependAdapter INSTANCE = new PushDependAdapter();

    private PushDependAdapter() {
    }

    public void loggerD(String str, String str2) {
    }

    public void setAdapter(IPushDepend iPushDepend) {
    }

    public boolean loggerDebug() {
        return C9415i.m18635b();
    }

    public static void inJect() throws Throwable {
        Object a = C9412d.m18627a(Class.forName("com.ss.android.push.PushDependManager"), "inst", new Object[0]);
        if (a instanceof IPushDepend) {
            ((IPushDepend) a).setAdapter(INSTANCE);
        }
    }

    public void hackJobHandler(Service service) {
        C19662b.m48032a(service);
    }

    public void tryHookInit(Context context) {
        C19700f.m48124a();
    }

    public void executeAsyncTask(AsyncTask asyncTask) {
        C9384a.m18565a(asyncTask, new Object[0]);
    }

    public boolean isAllowPushService(int i) {
        return C19702h.m48132a(i);
    }

    public Pair<String, String> getPushConfig(int i) {
        if (i == 1) {
            return C19700f.m48124a().mo41058b();
        }
        if (i == 8) {
            return C19700f.m48124a().mo41059c();
        }
        if (i == 10) {
            return C19700f.m48124a().mo41060d();
        }
        return null;
    }

    public List<String> getWakeupBlacklistPkg(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            String a = C19710b.m48173a().f54262b.mo41081a("wakeup_black_list_package", "");
            if (TextUtils.isEmpty(a)) {
                return arrayList;
            }
            JSONArray jSONArray = new JSONArray(a);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.optString(i));
            }
            return arrayList;
        } catch (Exception unused) {
        }
    }

    public JSONObject getMessage(byte[] bArr, boolean z) throws DataFormatException, IOException {
        return C19670f.m48062a(bArr, z);
    }

    public void saveMapToProvider(Context context, Map<String, ?> map) {
        C19710b.m48173a().mo41091b(map);
    }

    public String getToken(Context context, int i) {
        return C19710b.m48173a().mo41088a(C19712b.m48200a(i), "");
    }

    public void sendToken(Context context, ISendTokenCallBack iSendTokenCallBack) {
        C19712b bVar = new C19712b(context, iSendTokenCallBack);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C9393e.submitRunnable(bVar);
        } else {
            bVar.run();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0093 A[SYNTHETIC, Splitter:B:14:0x0093] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotificationArrived(android.content.Context r5, org.json.JSONObject r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x00a6
            if (r6 != 0) goto L_0x0006
            goto L_0x00a6
        L_0x0006:
            com.ss.android.pushmanager.setting.b r5 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r5 = r5.f54262b
            java.lang.String r0 = "is_send_mz_message_receiver_data"
            r1 = 0
            boolean r5 = r5.mo41082a(r0, r1)
            if (r5 == 0) goto L_0x00a5
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00a5 }
            r5.<init>()     // Catch:{ Throwable -> 0x00a5 }
            java.lang.String r0 = "id"
            java.lang.String r2 = "id"
            int r6 = r6.optInt(r2, r1)     // Catch:{ Throwable -> 0x00a5 }
            long r2 = (long) r6     // Catch:{ Throwable -> 0x00a5 }
            r5.put(r0, r2)     // Catch:{ Throwable -> 0x00a5 }
            java.lang.String r6 = "did"
            com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{ Throwable -> 0x00a5 }
            java.lang.String r0 = com.p683ss.android.pushmanager.setting.C19710b.m48175m()     // Catch:{ Throwable -> 0x00a5 }
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ Throwable -> 0x00a5 }
            r5.put(r6, r2)     // Catch:{ Throwable -> 0x00a5 }
            java.lang.String r6 = "code"
            r5.put(r6, r1)     // Catch:{ Throwable -> 0x00a5 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x00a5 }
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch:{ Throwable -> 0x00a5 }
            com.ss.android.pushmanager.a.d r6 = com.p683ss.android.pushmanager.p1204a.C19667d.m48045a()     // Catch:{ Throwable -> 0x00a5 }
            java.util.Map r6 = r6.mo41019c()     // Catch:{ Throwable -> 0x00a5 }
            com.ss.android.pushmanager.c r0 = com.p683ss.android.pushmanager.C19700f.f54218i     // Catch:{ Throwable -> 0x00a5 }
            if (r0 == 0) goto L_0x006b
            com.ss.android.pushmanager.c r0 = com.p683ss.android.pushmanager.C19700f.f54218i     // Catch:{ Throwable -> 0x00a5 }
            java.lang.String r0 = r0.mo41023b()     // Catch:{ Throwable -> 0x00a5 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x00a5 }
            if (r0 == 0) goto L_0x005e
            goto L_0x006b
        L_0x005e:
            com.ss.android.pushmanager.c r0 = com.p683ss.android.pushmanager.C19700f.f54218i     // Catch:{ Throwable -> 0x00a5 }
            java.lang.String r0 = r0.mo41023b()     // Catch:{ Throwable -> 0x00a5 }
            java.lang.String r1 = "/cloudpush/callback/meizu/"
            java.lang.String r0 = com.p683ss.android.pushmanager.C19700f.m48125a(r0, r1)     // Catch:{ Throwable -> 0x00a5 }
            goto L_0x006d
        L_0x006b:
            java.lang.String r0 = com.p683ss.android.pushmanager.C19700f.f54214e     // Catch:{ Throwable -> 0x00a5 }
        L_0x006d:
            java.lang.String r6 = com.p683ss.android.message.p1191b.C19470k.m47653a(r0, r6)     // Catch:{ Throwable -> 0x00a5 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x00a5 }
            r0.<init>()     // Catch:{ Throwable -> 0x00a5 }
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json; charset=utf-8"
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00a5 }
            com.bytedance.common.utility.k$a r1 = new com.bytedance.common.utility.k$a     // Catch:{ Throwable -> 0x00a5 }
            r1.<init>()     // Catch:{ Throwable -> 0x00a5 }
            r2 = 1
            r1.f25670a = r2     // Catch:{ Throwable -> 0x00a5 }
            com.bytedance.common.utility.k r2 = com.bytedance.common.utility.C9423k.m18637a()     // Catch:{ Throwable -> 0x00a5 }
            java.lang.String r5 = r2.mo17023a(r6, r5, r0, r1)     // Catch:{ Throwable -> 0x00a5 }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r5)     // Catch:{ Throwable -> 0x00a5 }
            if (r6 != 0) goto L_0x00a4
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a4 }
            r6.<init>(r5)     // Catch:{ JSONException -> 0x00a4 }
            java.lang.String r5 = "success"
            java.lang.String r0 = "reason"
            java.lang.String r6 = r6.getString(r0)     // Catch:{ JSONException -> 0x00a4 }
            r5.equals(r6)     // Catch:{ JSONException -> 0x00a4 }
            goto L_0x00a5
        L_0x00a4:
            return
        L_0x00a5:
            return
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.thirdparty.PushDependAdapter.onNotificationArrived(android.content.Context, org.json.JSONObject):void");
    }

    public void sendMonitor(Context context, String str, JSONObject jSONObject) {
        C19700f.m48124a();
    }

    public int getProviderInt(Context context, String str, int i) {
        return C19710b.m48173a().f54262b.mo41078a(str, i);
    }

    public long getProviderLong(Context context, String str, long j) {
        return C19710b.m48173a().f54262b.mo41079a(str, j);
    }

    public String getProviderString(Context context, String str, String str2) {
        return C19710b.m48173a().mo41088a(str, str2);
    }

    public Boolean getProviderBoolean(Context context, String str, Boolean bool) {
        return Boolean.valueOf(C19710b.m48173a().f54262b.mo41082a(str, bool.booleanValue()));
    }

    public void onClickNotPassThroughNotification(Context context, int i, String str, int i2, String str2) {
        C19700f.m48124a().mo41055a(context, i, str, i2, str2);
    }

    public void logEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        C19492c.m47724a(context, str, str2, str3, j, j2, jSONObject);
    }
}
