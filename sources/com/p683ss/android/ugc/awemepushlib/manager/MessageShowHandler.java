package com.p683ss.android.ugc.awemepushlib.manager;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.p672e.C10752a;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.common.util.NetworkUtils.C18908e;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.utils.p2390d.C47801c;
import com.p683ss.android.ugc.awemepushlib.interaction.C48444c;
import com.p683ss.android.ugc.awemepushlib.p2406a.C48427a;
import com.p683ss.android.ugc.awemepushlib.p2406a.C48428b;
import com.p683ss.android.ugc.awemepushlib.p2408c.C48432a;
import com.p683ss.android.ugc.awemepushlib.p2408c.C48434c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler */
public final class MessageShowHandler {

    /* renamed from: a */
    static boolean f121856a = true;

    /* renamed from: b */
    static NotificationManager f121857b;

    /* renamed from: c */
    static final List<C48476a> f121858c = new ArrayList();

    /* renamed from: d */
    static final Comparator<C48476a> f121859d = new Comparator<C48476a>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C48476a aVar = (C48476a) obj;
            C48476a aVar2 = (C48476a) obj2;
            if (aVar.f121868b == aVar2.f121868b) {
                return 0;
            }
            if (aVar.f121868b > aVar2.f121868b) {
                return -1;
            }
            return 1;
        }
    };

    /* renamed from: e */
    private static final Object f121860e = new Object();

    /* renamed from: f */
    private static volatile boolean f121861f = false;

    /* renamed from: g */
    private static DownloadImageApi f121862g;

    /* renamed from: h */
    private static C9381g f121863h = new C9381g(Looper.getMainLooper(), new C9382a() {
        public final void handleMsg(Message message) {
        }
    });

    /* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$DownloadImageApi */
    public interface DownloadImageApi {
        @C12706h
        C12690b<TypedInput> downloadImageWithUrl(@C12699af String str);
    }

    /* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$a */
    static class C48476a {

        /* renamed from: a */
        public int f121867a;

        /* renamed from: b */
        public long f121868b;

        C48476a(int i, long j) {
            this.f121867a = i;
            this.f121868b = j;
        }
    }

    /* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$b */
    static class C48477b implements Runnable {

        /* renamed from: a */
        private final String f121869a;

        public final void run() {
            Context a = C11010c.m22280a();
            if (a != null) {
                try {
                    MessageShowHandler.m104890a(a, this.f121869a);
                } catch (Exception unused) {
                }
            }
        }

        private C48477b(String str) {
            this.f121869a = str;
        }
    }

    /* renamed from: com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$c */
    static class C48478c implements Runnable {

        /* renamed from: a */
        private final String[] f121870a;

        public final void run() {
            if (this.f121870a != null && this.f121870a.length > 0) {
                try {
                    String str = this.f121870a[0];
                    String str2 = this.f121870a[1];
                    String str3 = this.f121870a[2];
                    String str4 = this.f121870a[3];
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject = new JSONObject();
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("did", str2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.put("id", str3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject.put("url", str4);
                        }
                        "success".equals(new JSONObject(NetworkUtils.executePost(-1, str, jSONObject.toString().getBytes("UTF-8"), C18908e.GZIP, "application/json")).optString("message"));
                    }
                } catch (Throwable unused) {
                }
            }
        }

        C48478c(String[] strArr) {
            this.f121870a = strArr;
        }
    }

    /* renamed from: a */
    public static void m104891a(Context context, String str, int i, String str2) {
        if (!C9431p.m18664a(str)) {
            C48428b from = C48428b.from(str);
            if (from != null && !AwemeRedBadgerManager.m104871a().mo95927a(context, from)) {
                C48444c.m104837a(from, i);
                C48444c.m104839a(from.openUrl);
                from.extra.turn_screen_on = false;
                m104887a(context, i, from);
                C48479a.m104895a().mo95937a(System.currentTimeMillis());
            }
        }
    }

    /* renamed from: a */
    private static boolean m104893a(Context context, C48428b bVar, int i, JSONObject jSONObject) {
        C48428b bVar2 = bVar;
        int i2 = i;
        long j = (long) i2;
        Context context2 = context;
        C48444c.m104836a(context2, "news_achieve", (long) bVar2.f121792id, j, jSONObject);
        if (i2 == 6) {
            Context context3 = context;
            C48444c.m104836a(context3, "umeng_news_achieve", (long) bVar2.f121792id, j, jSONObject);
        }
        if (bVar2.isPing == 1) {
            return true;
        }
        if (C9431p.m18664a(bVar2.text)) {
            if (bVar2.pass_through == 0) {
                m104886a(context);
            }
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (bVar2.pass_through == 0 || bVar2.filter == 0 || !C48479a.m104895a().mo95939a(bVar2.f121792id, currentTimeMillis)) {
            return false;
        }
        C48444c.m104836a(context, "news_forbid", (long) bVar2.f121792id, 2, new JSONObject[0]);
        C10752a.m21792a(context, "MessageExisted drop exist message ");
        return true;
    }

    /* renamed from: a */
    private static void m104892a(String str, String str2, String str3, Bitmap bitmap, int i, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        JSONObject b = C23088c.m56631a().mo47824a(C42311c.f106865i, str2).mo47824a("title", str).mo47824a("imageUrl", str3).mo47824a("errorMsg", str4).mo47824a("imageType", sb.toString()).mo47825b();
        if (bitmap != null) {
            C48444c.m104840a("aweme_push_image_load_error_rate", 0, b);
        } else if (TextUtils.isEmpty(str4) || !str4.contains("network not available")) {
            C48444c.m104840a("aweme_push_image_load_error_rate", 1, b);
        }
    }

    /* renamed from: a */
    public static void m104890a(Context context, String str) {
        synchronized (f121860e) {
            Editor edit = C35807d.m80935a(context, "app_notify_info", 0).edit();
            edit.putString("notify_list", str);
            edit.commit();
        }
    }

    /* renamed from: a */
    private static void m104886a(Context context) {
        if (context != null) {
            try {
                Intent a = C18920g.m46046a(context, context.getPackageName());
                if (a != null) {
                    a.addFlags(268435456);
                    a.putExtra("from_notification", true);
                    context.startActivity(a);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static Bitmap m104882a(String str) {
        if (f121862g == null) {
            f121862g = (DownloadImageApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(str).mo19925a().mo19930a(DownloadImageApi.class);
        }
        try {
            return BitmapFactory.decodeStream(((TypedInput) f121862g.downloadImageWithUrl(str).execute().f33552b).mo9554in());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static void m104894b(Context context) {
        String string;
        ArrayList arrayList = new ArrayList();
        try {
            synchronized (f121860e) {
                string = C35807d.m80935a(context, "app_notify_info", 0).getString("notify_list", null);
            }
            if (!C9431p.m18664a(string)) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    long optLong = jSONObject.optLong("time", 0);
                    int optInt = jSONObject.optInt("id", 0);
                    if (optInt > 0) {
                        arrayList.add(new C48476a(optInt, optLong));
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (!arrayList.isEmpty()) {
            try {
                f121858c.clear();
                f121858c.addAll(arrayList);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    private static void m104885a(Notification notification, int i) {
        try {
            Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
            obj.getClass().getDeclaredMethod("setMessageCount", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)});
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0154 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0155 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x01d7 */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01dd A[Catch:{ Throwable -> 0x0155, all -> 0x011e, Throwable -> 0x0154, Exception -> 0x01e9 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01de A[Catch:{ Throwable -> 0x0155, all -> 0x011e, Throwable -> 0x0154, Exception -> 0x01e9 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m104887a(final android.content.Context r13, final int r14, final com.p683ss.android.ugc.awemepushlib.p2406a.C48428b r15) {
        /*
            com.ss.android.ugc.aweme.common.MobClick r0 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = "push_show"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = "perf_monitor"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)     // Catch:{ Exception -> 0x001d }
            int r1 = r15.f121792id     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x001d }
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r1)     // Catch:{ Exception -> 0x001d }
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r0)     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            com.ss.android.ugc.awemepushlib.a.b$a r0 = r15.extra
            java.lang.String r0 = r0.customAction
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 2
            if (r0 != 0) goto L_0x008e
            boolean r0 = com.bytedance.ies.ugc.p694a.C11016e.m22313h()
            if (r0 != 0) goto L_0x008e
            android.content.Intent r14 = m104881a(r13, r14, r15, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r13.getPackageName()
            r0.append(r1)
            java.lang.String r1 = ".action.PUSH_CUSTOM_ACTION"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.setAction(r0)
            com.ss.android.ugc.awemepushlib.a.b$a r0 = r15.extra
            java.lang.String r0 = r0.inAppPushTitle
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = r15.text
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = r15.imageUrl
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = r15.openUrl
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "message_title"
            com.ss.android.ugc.awemepushlib.a.b$a r1 = r15.extra
            java.lang.String r1 = r1.inAppPushTitle
            r14.putExtra(r0, r1)
            java.lang.String r0 = "message_text"
            java.lang.String r1 = r15.text
            r14.putExtra(r0, r1)
            java.lang.String r0 = "message_image_url"
            java.lang.String r1 = r15.imageUrl
            r14.putExtra(r0, r1)
            java.lang.String r0 = "message_open_url"
            java.lang.String r15 = r15.openUrl
            r14.putExtra(r0, r15)
        L_0x008a:
            r13.sendBroadcast(r14)
            return
        L_0x008e:
            boolean r0 = com.p683ss.android.ugc.awemepushlib.p2408c.C48433b.m104800a()     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x009f
            com.ss.android.ugc.awemepushlib.manager.a r0 = com.p683ss.android.ugc.awemepushlib.manager.C48479a.m104895a()     // Catch:{ Exception -> 0x01e9 }
            boolean r0 = r0.mo95948e()     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x009f
            return
        L_0x009f:
            boolean r0 = f121861f     // Catch:{ Exception -> 0x01e9 }
            r2 = 1
            if (r0 != 0) goto L_0x00a9
            m104894b(r13)     // Catch:{ Exception -> 0x01e9 }
            f121861f = r2     // Catch:{ Exception -> 0x01e9 }
        L_0x00a9:
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r13.getSystemService(r0)     // Catch:{ Exception -> 0x01e9 }
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0     // Catch:{ Exception -> 0x01e9 }
            f121857b = r0     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r0 = r15.callback     // Catch:{ Exception -> 0x01e9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01e9 }
            r3 = 0
            if (r0 != 0) goto L_0x0187
            java.lang.String r0 = r15.callback     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r4 = "http"
            boolean r0 = r0.startsWith(r4)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x0187
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Throwable -> 0x0155, all -> 0x011e }
            java.lang.String r4 = r15.callback     // Catch:{ Throwable -> 0x0155, all -> 0x011e }
            r0[r3] = r4     // Catch:{ Throwable -> 0x0155, all -> 0x011e }
            java.lang.String r4 = com.bytedance.ies.ugc.statisticlogger.C11049a.m22367c()     // Catch:{ Throwable -> 0x0155, all -> 0x011e }
            r0[r2] = r4     // Catch:{ Throwable -> 0x0155, all -> 0x011e }
            int r4 = r15.f121792id     // Catch:{ Throwable -> 0x0155, all -> 0x011e }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x0155, all -> 0x011e }
            r0[r1] = r4     // Catch:{ Throwable -> 0x0155, all -> 0x011e }
            r1 = 3
            java.lang.String r4 = r15.openUrl     // Catch:{ Throwable -> 0x0155, all -> 0x011e }
            r0[r1] = r4     // Catch:{ Throwable -> 0x0155, all -> 0x011e }
            com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$c r1 = new com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$c     // Catch:{ Throwable -> 0x0155, all -> 0x011e }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0155, all -> 0x011e }
            com.bytedance.common.utility.p523c.C9393e.submitRunnable(r1)     // Catch:{ Throwable -> 0x0155, all -> 0x011e }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0187 }
            r0.<init>()     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r1 = "callback"
            java.lang.String r4 = r15.callback     // Catch:{ Throwable -> 0x0187 }
            r0.put(r1, r4)     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r1 = "did"
            java.lang.String r4 = com.bytedance.ies.ugc.statisticlogger.C11049a.m22367c()     // Catch:{ Throwable -> 0x0187 }
            r0.put(r1, r4)     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r1 = "id"
            int r4 = r15.f121792id     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x0187 }
            r0.put(r1, r4)     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r1 = "url"
            java.lang.String r4 = r15.openUrl     // Catch:{ Throwable -> 0x0187 }
            r0.put(r1, r4)     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r6 = "message_callback"
            int r1 = r15.f121792id     // Catch:{ Throwable -> 0x0187 }
            long r7 = (long) r1     // Catch:{ Throwable -> 0x0187 }
            long r9 = (long) r14     // Catch:{ Throwable -> 0x0187 }
            org.json.JSONObject[] r11 = new org.json.JSONObject[r2]     // Catch:{ Throwable -> 0x0187 }
            r11[r3] = r0     // Catch:{ Throwable -> 0x0187 }
        L_0x0119:
            r5 = r13
            com.p683ss.android.ugc.awemepushlib.interaction.C48444c.m104836a(r5, r6, r7, r9, r11)     // Catch:{ Throwable -> 0x0187 }
            goto L_0x0187
        L_0x011e:
            r0 = move-exception
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0154 }
            r1.<init>()     // Catch:{ Throwable -> 0x0154 }
            java.lang.String r4 = "callback"
            java.lang.String r5 = r15.callback     // Catch:{ Throwable -> 0x0154 }
            r1.put(r4, r5)     // Catch:{ Throwable -> 0x0154 }
            java.lang.String r4 = "did"
            java.lang.String r5 = com.bytedance.ies.ugc.statisticlogger.C11049a.m22367c()     // Catch:{ Throwable -> 0x0154 }
            r1.put(r4, r5)     // Catch:{ Throwable -> 0x0154 }
            java.lang.String r4 = "id"
            int r5 = r15.f121792id     // Catch:{ Throwable -> 0x0154 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x0154 }
            r1.put(r4, r5)     // Catch:{ Throwable -> 0x0154 }
            java.lang.String r4 = "url"
            java.lang.String r5 = r15.openUrl     // Catch:{ Throwable -> 0x0154 }
            r1.put(r4, r5)     // Catch:{ Throwable -> 0x0154 }
            java.lang.String r7 = "message_callback"
            int r15 = r15.f121792id     // Catch:{ Throwable -> 0x0154 }
            long r8 = (long) r15     // Catch:{ Throwable -> 0x0154 }
            long r10 = (long) r14     // Catch:{ Throwable -> 0x0154 }
            org.json.JSONObject[] r12 = new org.json.JSONObject[r2]     // Catch:{ Throwable -> 0x0154 }
            r12[r3] = r1     // Catch:{ Throwable -> 0x0154 }
            r6 = r13
            com.p683ss.android.ugc.awemepushlib.interaction.C48444c.m104836a(r6, r7, r8, r10, r12)     // Catch:{ Throwable -> 0x0154 }
        L_0x0154:
            throw r0     // Catch:{ Exception -> 0x01e9 }
        L_0x0155:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0187 }
            r0.<init>()     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r1 = "callback"
            java.lang.String r4 = r15.callback     // Catch:{ Throwable -> 0x0187 }
            r0.put(r1, r4)     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r1 = "did"
            java.lang.String r4 = com.bytedance.ies.ugc.statisticlogger.C11049a.m22367c()     // Catch:{ Throwable -> 0x0187 }
            r0.put(r1, r4)     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r1 = "id"
            int r4 = r15.f121792id     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x0187 }
            r0.put(r1, r4)     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r1 = "url"
            java.lang.String r4 = r15.openUrl     // Catch:{ Throwable -> 0x0187 }
            r0.put(r1, r4)     // Catch:{ Throwable -> 0x0187 }
            java.lang.String r6 = "message_callback"
            int r1 = r15.f121792id     // Catch:{ Throwable -> 0x0187 }
            long r7 = (long) r1     // Catch:{ Throwable -> 0x0187 }
            long r9 = (long) r14     // Catch:{ Throwable -> 0x0187 }
            org.json.JSONObject[] r11 = new org.json.JSONObject[r2]     // Catch:{ Throwable -> 0x0187 }
            r11[r3] = r0     // Catch:{ Throwable -> 0x0187 }
            goto L_0x0119
        L_0x0187:
            r0 = 0
            java.lang.String r1 = "power"
            java.lang.Object r1 = r13.getSystemService(r1)     // Catch:{ Exception -> 0x01d6 }
            android.os.PowerManager r1 = (android.os.PowerManager) r1     // Catch:{ Exception -> 0x01d6 }
            boolean r1 = r1.isScreenOn()     // Catch:{ Exception -> 0x01d6 }
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01d6 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01d6 }
            r6 = 20
            if (r5 < r6) goto L_0x01c0
            java.lang.String r5 = "display"
            java.lang.Object r5 = r13.getSystemService(r5)     // Catch:{ Exception -> 0x01d6 }
            android.hardware.display.DisplayManager r5 = (android.hardware.display.DisplayManager) r5     // Catch:{ Exception -> 0x01d6 }
            android.view.Display r5 = r5.getDisplay(r3)     // Catch:{ Exception -> 0x01d6 }
            if (r5 == 0) goto L_0x01c0
            java.lang.Class<android.view.Display> r6 = android.view.Display.class
            java.lang.String r7 = "getState"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x01d6 }
            r2[r3] = r5     // Catch:{ Exception -> 0x01d6 }
            java.lang.Object r2 = com.bytedance.common.utility.p526f.C9412d.m18627a(r6, r7, r2)     // Catch:{ Exception -> 0x01d6 }
            boolean r3 = r2 instanceof java.lang.Integer     // Catch:{ Exception -> 0x01d6 }
            if (r3 == 0) goto L_0x01c0
            r4 = r2
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x01d6 }
        L_0x01c0:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x01d6 }
            r2.<init>()     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r0 = "interactive_state"
            r2.put(r0, r1)     // Catch:{ Exception -> 0x01d7 }
            int r0 = r4.intValue()     // Catch:{ Exception -> 0x01d7 }
            if (r0 < 0) goto L_0x01d7
            java.lang.String r0 = "display_state"
            r2.put(r0, r4)     // Catch:{ Exception -> 0x01d7 }
            goto L_0x01d7
        L_0x01d6:
            r2 = r0
        L_0x01d7:
            boolean r0 = m104893a(r13, r15, r14, r2)     // Catch:{ Exception -> 0x01e9 }
            if (r0 == 0) goto L_0x01de
            return
        L_0x01de:
            com.bytedance.common.utility.b.g r0 = f121863h     // Catch:{ Exception -> 0x01e9 }
            com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$3 r1 = new com.ss.android.ugc.awemepushlib.manager.MessageShowHandler$3     // Catch:{ Exception -> 0x01e9 }
            r1.<init>(r15, r14, r13)     // Catch:{ Exception -> 0x01e9 }
            r0.post(r1)     // Catch:{ Exception -> 0x01e9 }
            return
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.awemepushlib.manager.MessageShowHandler.m104887a(android.content.Context, int, com.ss.android.ugc.awemepushlib.a.b):void");
    }

    /* renamed from: a */
    private static Intent m104881a(Context context, int i, C48428b bVar, int i2) {
        Intent intent = null;
        if (i2 == 2) {
            try {
                Intent intent2 = new Intent();
                try {
                    intent2.setPackage(context.getPackageName());
                    intent = intent2;
                } catch (Throwable unused) {
                    intent = intent2;
                }
            } catch (Throwable unused2) {
            }
        } else {
            Intent a = C48427a.m104780a(context, bVar);
            if (a == null) {
                return null;
            }
            try {
                a.addFlags(268435456);
                intent = a;
            } catch (Throwable unused3) {
                intent = a;
            }
        }
        intent.putExtra("from_notification", true);
        if (i2 == 0) {
            intent.putExtra("msg_from", 1);
        } else if (i2 == 1) {
            intent.putExtra("msg_from", 2);
        }
        intent.putExtra("msg_id", bVar.f121792id);
        intent.putExtra(CustomActionPushReceiver.f104058c, i);
        if (!C9431p.m18664a(bVar.extra.toJsonString())) {
            intent.putExtra(CustomActionPushReceiver.f104059d, bVar.extra.toJsonString());
        }
        intent.putExtra("imageType", bVar.imageType);
        return intent;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m104884a(Bitmap[] bitmapArr, C48428b bVar, Context context, Bitmap[] bitmapArr2, int i) throws Exception {
        String str;
        boolean z;
        C48428b bVar2 = bVar;
        try {
            bitmapArr[0] = m104882a(bVar2.imageUrl);
            if (bitmapArr[0] == null) {
                bitmapArr[0] = m104882a(bVar2.imageUrl);
                C48434c a = C48434c.m104801a();
                String str2 = "retrySuccess";
                if (bitmapArr[0] != null) {
                    z = true;
                } else {
                    z = false;
                }
                a.f121798a.put(str2, Boolean.valueOf(z));
                Context context2 = context;
                C48444c.m104836a(context2, "push_image_retry", 0, 0, a.mo95908b());
            }
            if (!TextUtils.isEmpty(bVar2.extra.largeModeIconUrl)) {
                bitmapArr2[0] = m104882a(bVar2.extra.largeModeIconUrl);
            }
            String str3 = bVar2.title;
            String str4 = bVar2.text;
            String str5 = bVar2.imageUrl;
            Bitmap bitmap = bitmapArr[0];
            int i2 = bVar2.imageType;
            if (bitmapArr[0] == null) {
                str = "imageUrlbitmap==null";
            } else {
                str = "";
            }
            m104892a(str3, str4, str5, bitmap, i2, str);
        } catch (Exception e) {
            m104892a(bVar2.title, bVar2.text, bVar2.imageUrl, (Bitmap) null, bVar2.imageType, Log.getStackTraceString(e));
            m104889a(context, (Bitmap) null, (Bitmap) null, i, (Intent) null, bVar);
        }
        return null;
    }

    /* renamed from: a */
    public static void m104888a(Context context, int i, String str, int i2, String str2) {
        if (context != null && i == 1 && str != null) {
            try {
                if (C48479a.m104895a().mo95949e(context) && !TextUtils.isEmpty(str)) {
                    m104891a(context, str, i2, str2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public static void m104889a(Context context, Bitmap bitmap, Bitmap bitmap2, int i, Intent intent, C48428b bVar) {
        if (bitmap == null && bitmap2 == null) {
            C48444c.m104838a(bVar, false, i);
        } else {
            C48444c.m104838a(bVar, true, i);
        }
        Intent a = m104881a(context, i, bVar, 0);
        if (a != null) {
            a.putExtra("log_data_extra_to_adsapp", (HashMap) C48427a.m104782a(bVar, i, true));
            Notification a2 = C48432a.m104791a(context, bVar, bitmap, bitmap2, a, false);
            if (a2 != null) {
                if (C47801c.m103433b()) {
                    m104885a(a2, bVar.extra.badgeCount);
                }
                try {
                    f121857b.notify("app_notify_ame", bVar.f121792id, a2);
                    C48444c.m104836a(context, "news_notify_show", (long) bVar.f121792id, -1, new JSONObject[0]);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("notify exception: ");
                    sb.append(e);
                    C10752a.m21792a(context, sb.toString());
                }
            }
        }
    }
}
