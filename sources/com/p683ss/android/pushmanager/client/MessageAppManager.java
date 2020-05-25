package com.p683ss.android.pushmanager.client;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.C9383c;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.p827q.p828a.C12659a;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.message.C19408a;
import com.p683ss.android.message.C19481h;
import com.p683ss.android.message.C19483j;
import com.p683ss.android.message.C19483j.C19486a;
import com.p683ss.android.message.p1191b.C19470k;
import com.p683ss.android.pushmanager.C19681c;
import com.p683ss.android.pushmanager.C19698d;
import com.p683ss.android.pushmanager.C19700f;
import com.p683ss.android.pushmanager.C19702h;
import com.p683ss.android.pushmanager.C19703i;
import com.p683ss.android.pushmanager.C19704j;
import com.p683ss.android.pushmanager.IMessageAppAdapter;
import com.p683ss.android.pushmanager.p1205b.C19672a;
import com.p683ss.android.pushmanager.p1205b.C19676b;
import com.p683ss.android.pushmanager.p1205b.C19678c;
import com.p683ss.android.pushmanager.p1205b.C19679d;
import com.p683ss.android.pushmanager.setting.C19709a;
import com.p683ss.android.pushmanager.setting.C19710b;
import com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.p683ss.android.pushmanager.thirdparty.PushDependAdapter;
import com.p683ss.android.pushmanager.thirdparty.PushManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.client.MessageAppManager */
public class MessageAppManager implements IMessageAppAdapter {
    private static volatile MessageAppManager sMessageAppManager;
    private volatile AtomicBoolean hasRegisteredWithLastChannels = new AtomicBoolean(false);
    private volatile AtomicBoolean isRequestingUpdateSender = new AtomicBoolean(false);
    private String mChannelName;
    private boolean mEnableCreateChannel = true;
    public Handler mHandler = new Handler(Looper.getMainLooper());
    private Map<Integer, Boolean> mPushRegistedMap = new HashMap();

    private void pushDependAdapterInject() {
        try {
            PushDependAdapter.inJect();
        } catch (Throwable unused) {
        }
    }

    public Context getContext() {
        return C19408a.m47500a();
    }

    public static MessageAppManager inst() {
        if (sMessageAppManager == null) {
            synchronized (MessageAppManager.class) {
                if (sMessageAppManager == null) {
                    sMessageAppManager = new MessageAppManager();
                }
            }
        }
        return sMessageAppManager;
    }

    private MessageAppManager() {
    }

    public void setDebuggable(boolean z) {
        C12659a.f33253a = z;
    }

    public void setIExtraMessageDepend(C19681c cVar) {
        C19700f.f54218i = cVar;
    }

    public void setMonitorEnable(boolean z) {
        C19678c.f54180b = z;
    }

    public void setMonitorImpl(C19672a aVar) {
        C19678c.f54179a = aVar;
    }

    public void synNotifySwitchStatus(Context context) {
        C19692e.m48100a(context);
    }

    public void initPushSetting(Context context) {
        C19408a.m47501a((Application) context.getApplicationContext());
    }

    private void registerAliPushObserver(final Context context) {
        try {
            context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.m48145a(context, "ali_push_type", "integer"), true, new ContentObserver(this.mHandler) {
                public final void onChange(boolean z) {
                    MessageAppManager.this.registerAliPushOnChannelProcess(context);
                }
            });
        } catch (Throwable unused) {
        }
    }

    public String handleMySelfPushIntent(Intent intent) {
        if (intent != null && "com.ss.android.message".equals(intent.getAction())) {
            return intent.getStringExtra("message_data");
        }
        return null;
    }

    public void registerAliPushOnChannelProcess(Context context) {
        int a = C19710b.m48173a().f54262b.mo41078a("ali_push_type", -1);
        if (a >= 0) {
            registerPush(context, a);
        }
    }

    public void registerSelfPush(Context context) {
        if (context != null) {
            C19483j a = C19483j.m47697a();
            C19486a a2 = C19486a.m47706a(context);
            a.f53807a = context.getApplicationContext();
            C19483j.f53805c = a2;
            a.mo40621a(a.f53807a, C19481h.m47690a(a.f53807a));
        }
    }

    public void tryRegisterWithLastValidChannels(Context context) {
        if (this.hasRegisteredWithLastChannels.compareAndSet(false, true)) {
            tryRegistAllSelectedPush(context, C19710b.m48173a().mo41103l(), false);
        }
    }

    private boolean registerAliPush(Context context) {
        int i = 6;
        boolean z = false;
        try {
            if (C19702h.m48132a(6)) {
                z = tryConfigPush(context, 6);
            } else {
                i = -1;
            }
            C19710b.m48173a().f54262b.mo41080a().mo41072a("ali_push_type", i).mo41076a();
        } catch (Throwable unused) {
        }
        return z;
    }

    private boolean saveSsids(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            String str = (String) map.get(C19703i.f54232a);
            String str2 = (String) map.get(C19703i.f54233b);
            if (!C9431p.m18664a((String) map.get(C19703i.f54236e)) && !C9431p.m18664a(str) && !C9431p.m18664a(str2)) {
                C19710b.m48173a();
                C19709a.m48167a().mo41084a(map);
                return true;
            }
        }
        return false;
    }

    private void trySendPushDaemonMonitor(Context context) {
        try {
            String a = C19710b.m48173a().f54262b.mo41081a("push_daemon_monitor_result", "");
            if (!C9431p.m18664a(a)) {
                C19700f.m48124a();
                new JSONObject(a);
                C19710b.m48173a().mo41089a("");
            }
        } catch (Throwable unused) {
        }
    }

    public void unRegisterAllThirdPush(Context context) {
        unregisterPush(context, 1);
        unregisterPush(context, 7);
        unregisterPush(context, 8);
        unregisterPush(context, 6);
        unregisterPush(context, 10);
        unregisterPush(context, 11);
        unregisterPush(context, 5);
        unregisterPush(context, 14);
        this.mPushRegistedMap.clear();
    }

    public boolean registerAllThirdPush(Context context) {
        boolean registerAliPush = registerAliPush(context);
        if (C19710b.m48173a().mo41094c()) {
            return registerAliPush | tryConfigPush(context, 1) | tryConfigPush(context, 7) | tryConfigPush(context, 8) | tryConfigPush(context, 10) | tryConfigPush(context, 5) | registerPush(context, 11) | tryConfigPush(context, 14);
        }
        unRegisterAllThirdPush(context);
        return registerAliPush;
    }

    public void getSSIDs(Context context, Map<String, String> map) {
        C19710b.m48173a();
        C19710b.m48174a(map);
    }

    public void initOnApplication(Context context, C19698d dVar) {
        initOnApplication(context, dVar, null);
    }

    public void setDefaultChannelName(boolean z, String str) {
        this.mEnableCreateChannel = z;
        this.mChannelName = str;
    }

    private boolean isPushAvailable(Context context, int i) {
        if (context == null) {
            return false;
        }
        return PushManager.inst().isPushAvailable(context, i);
    }

    public boolean checkPushConfiguration(String str, Context context) {
        return PushManager.inst().checkThirdPushConfig(str, context);
    }

    public synchronized void handleAppLogUpdate(Context context, Map<String, String> map) {
        handleAppLogUpdate(context, map, false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        com.p683ss.android.message.p1191b.C19456b.m47610a(r3.mo41047a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void createMessageData(android.content.Context r2, com.p683ss.android.pushmanager.C19698d r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x001e
            if (r2 != 0) goto L_0x0005
            goto L_0x001e
        L_0x0005:
            com.ss.android.pushmanager.a.d r0 = new com.ss.android.pushmanager.a.d     // Catch:{ Exception -> 0x0015 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0015 }
            com.p683ss.android.pushmanager.p1204a.C19667d.m48046a(r0)     // Catch:{ Exception -> 0x0015 }
            com.ss.android.pushmanager.a.d r0 = com.p683ss.android.pushmanager.p1204a.C19667d.m48045a()     // Catch:{ Exception -> 0x0015 }
            r0.mo41008a(r2)     // Catch:{ Exception -> 0x0015 }
            return
        L_0x0015:
            android.content.Context r2 = r3.mo41047a()     // Catch:{ Throwable -> 0x001d }
            com.p683ss.android.message.p1191b.C19456b.m47610a(r2)     // Catch:{ Throwable -> 0x001d }
            return
        L_0x001d:
            return
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.client.MessageAppManager.createMessageData(android.content.Context, com.ss.android.pushmanager.d):void");
    }

    private boolean registerPush(Context context, int i) {
        if (!C19702h.m48132a(i) || context == null) {
            return false;
        }
        PushManager.inst().registerPush(context, i);
        return true;
    }

    private void unregisterPush(Context context, int i) {
        if (i == 8 && !C19470k.m47654a()) {
            return;
        }
        if ((i != 7 || C9383c.m18564a()) && context != null) {
            PushManager.inst().unregisterPush(context.getApplicationContext(), i);
        }
    }

    private boolean tryConfigPush(Context context, int i) {
        if (context == null || C19710b.m48173a().mo41101j()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (!C19702h.m48132a(i) || !isPushAvailable(applicationContext, i)) {
            unregisterPush(applicationContext.getApplicationContext(), i);
            this.mPushRegistedMap.put(Integer.valueOf(i), Boolean.valueOf(false));
            return false;
        } else if (this.mPushRegistedMap.containsKey(Integer.valueOf(i)) && ((Boolean) this.mPushRegistedMap.get(Integer.valueOf(i))).booleanValue()) {
            return true;
        } else {
            this.mPushRegistedMap.put(Integer.valueOf(i), Boolean.valueOf(true));
            return registerPush(applicationContext, i);
        }
    }

    public void trackPush(Context context, int i, Object obj) {
        if (context != null) {
            PushManager.inst().trackPush(context.getApplicationContext(), i, obj);
        }
    }

    public void tryRegistAllSelectedPush(final Context context, String str, boolean z) {
        boolean z2;
        C19710b.m48173a();
        boolean a = C19702h.m48130a(context).mo41063a(str);
        boolean z3 = false;
        if (z && !a) {
            str = C19710b.m48173a().mo41103l();
            if (!C19702h.m48130a(context).mo41063a(str)) {
                C19679d.m48078a(false, str);
                return;
            }
        }
        if (!z || !a) {
            z2 = false;
        } else {
            z2 = true;
        }
        C19702h.m48131a(str, z2);
        boolean registerAllThirdPush = registerAllThirdPush(context);
        registerSelfPush(context);
        trySendPushDaemonMonitor(context);
        this.mHandler.post(new Runnable() {
            public final void run() {
                Context context = context;
                if (C19470k.m47658c(context)) {
                    C19688b.m48089a(context);
                }
            }
        });
        if (registerAllThirdPush || C19710b.m48173a().mo41102k()) {
            z3 = true;
        }
        C19679d.m48078a(z3, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleAppLogUpdate(final android.content.Context r9, java.util.Map<java.lang.String, java.lang.String> r10, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.saveSsids(r10)     // Catch:{ all -> 0x00f5 }
            com.ss.android.pushmanager.j r1 = com.p683ss.android.pushmanager.C19704j.m48136b()     // Catch:{ all -> 0x00f5 }
            r1.mo40613a(r9, r10)     // Catch:{ all -> 0x00f5 }
            com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{ all -> 0x00f5 }
            r10 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0066
            boolean r2 = com.p683ss.android.pushmanager.p1205b.C19678c.m48071a()     // Catch:{ all -> 0x00f5 }
            if (r2 == 0) goto L_0x0066
            java.util.concurrent.atomic.AtomicBoolean r2 = com.p683ss.android.pushmanager.p1205b.C19676b.f54176c     // Catch:{ all -> 0x00f5 }
            boolean r2 = r2.get()     // Catch:{ all -> 0x00f5 }
            if (r2 != 0) goto L_0x0030
            boolean r2 = com.bytedance.p827q.p828a.C12659a.m25441a()     // Catch:{ all -> 0x00f5 }
            if (r2 != 0) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            com.ss.android.pushmanager.b.a.a r9 = new com.ss.android.pushmanager.b.a.a     // Catch:{ all -> 0x00f5 }
            java.lang.String r10 = "调用时序错误，请先调用 MessageAppManager.inst().initOnApplication();然后再调用MessageAppManager.inst().handleAppLogUpdate()"
            r9.<init>(r10)     // Catch:{ all -> 0x00f5 }
            throw r9     // Catch:{ all -> 0x00f5 }
        L_0x0030:
            java.util.concurrent.atomic.AtomicBoolean r2 = com.p683ss.android.pushmanager.p1205b.C19676b.f54174a     // Catch:{ all -> 0x00f5 }
            boolean r2 = r2.compareAndSet(r10, r1)     // Catch:{ all -> 0x00f5 }
            if (r2 == 0) goto L_0x0066
            android.os.Handler r2 = com.p683ss.android.pushmanager.p1205b.C19676b.m48066a()     // Catch:{ all -> 0x00f5 }
            boolean r2 = r2.hasMessages(r1)     // Catch:{ all -> 0x00f5 }
            if (r2 == 0) goto L_0x0049
            android.os.Handler r2 = com.p683ss.android.pushmanager.p1205b.C19676b.m48066a()     // Catch:{ all -> 0x00f5 }
            r2.removeMessages(r1)     // Catch:{ all -> 0x00f5 }
        L_0x0049:
            android.os.Handler r2 = com.p683ss.android.pushmanager.p1205b.C19676b.m48066a()     // Catch:{ all -> 0x00f5 }
            r3 = 2
            boolean r2 = r2.hasMessages(r3)     // Catch:{ all -> 0x00f5 }
            if (r2 == 0) goto L_0x005b
            android.os.Handler r2 = com.p683ss.android.pushmanager.p1205b.C19676b.m48066a()     // Catch:{ all -> 0x00f5 }
            r2.removeMessages(r3)     // Catch:{ all -> 0x00f5 }
        L_0x005b:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f5 }
            long r4 = com.p683ss.android.pushmanager.p1205b.C19676b.f54175b     // Catch:{ all -> 0x00f5 }
            r6 = 0
            long r2 = r2 - r4
            com.p683ss.android.pushmanager.p1205b.C19676b.m48067a(r10, r2)     // Catch:{ all -> 0x00f5 }
        L_0x0066:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00f5 }
            com.ss.android.pushmanager.setting.b r4 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{ all -> 0x00f5 }
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r4 = r4.f54262b     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = "last_get_update_sender_time_mil"
            r6 = 0
            long r4 = r4.mo41079a(r5, r6)     // Catch:{ all -> 0x00f5 }
            r6 = 0
            long r2 = r2 - r4
            com.ss.android.pushmanager.setting.b r4 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{ all -> 0x00f5 }
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r4 = r4.f54262b     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = "update_sender_interval_time_second"
            r6 = 10800(0x2a30, float:1.5134E-41)
            int r4 = r4.mo41078a(r5, r6)     // Catch:{ all -> 0x00f5 }
            int r4 = r4 * 1000
            long r4 = (long) r4     // Catch:{ all -> 0x00f5 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0091
            r2 = 1
            goto L_0x0092
        L_0x0091:
            r2 = 0
        L_0x0092:
            if (r0 == 0) goto L_0x0096
            if (r2 == 0) goto L_0x0098
        L_0x0096:
            if (r11 == 0) goto L_0x009a
        L_0x0098:
            r11 = 1
            goto L_0x009b
        L_0x009a:
            r11 = 0
        L_0x009b:
            if (r11 == 0) goto L_0x00af
            java.util.concurrent.atomic.AtomicBoolean r11 = r8.isRequestingUpdateSender     // Catch:{ all -> 0x00f5 }
            boolean r11 = r11.compareAndSet(r10, r1)     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00af
            com.ss.android.pushmanager.client.MessageAppManager$2 r10 = new com.ss.android.pushmanager.client.MessageAppManager$2     // Catch:{ all -> 0x00f5 }
            r10.<init>(r9)     // Catch:{ all -> 0x00f5 }
            com.bytedance.common.utility.p523c.C9393e.submitRunnable(r10)     // Catch:{ all -> 0x00f5 }
            monitor-exit(r8)
            return
        L_0x00af:
            java.util.concurrent.atomic.AtomicBoolean r11 = r8.isRequestingUpdateSender     // Catch:{ all -> 0x00f5 }
            boolean r11 = r11.get()     // Catch:{ all -> 0x00f5 }
            if (r11 != 0) goto L_0x00f3
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x00f5 }
            r11.<init>()     // Catch:{ all -> 0x00f5 }
            com.ss.android.pushmanager.setting.a r0 = com.p683ss.android.pushmanager.setting.C19709a.m48167a()     // Catch:{ all -> 0x00f5 }
            r0.mo41086b(r11)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = com.p683ss.android.pushmanager.C19703i.f54236e     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = r11.get(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = com.p683ss.android.pushmanager.C19703i.f54232a     // Catch:{ all -> 0x00f5 }
            java.lang.Object r2 = r11.get(r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = com.p683ss.android.pushmanager.C19703i.f54233b     // Catch:{ all -> 0x00f5 }
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00f5 }
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x00ee
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r2)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x00ee
            boolean r11 = com.bytedance.common.utility.C9431p.m18664a(r11)     // Catch:{ all -> 0x00f5 }
            if (r11 != 0) goto L_0x00ee
            r10 = 1
        L_0x00ee:
            if (r10 == 0) goto L_0x00f3
            r8.tryRegisterWithLastValidChannels(r9)     // Catch:{ all -> 0x00f5 }
        L_0x00f3:
            monitor-exit(r8)
            return
        L_0x00f5:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.client.MessageAppManager.handleAppLogUpdate(android.content.Context, java.util.Map, boolean):void");
    }

    public void initOnApplication(final Context context, C19698d dVar, String str) {
        C19408a.m47501a((Application) context.getApplicationContext());
        if (!C9431p.m18664a(str)) {
            C19470k.f53796a = str;
        } else {
            str = C18920g.m46051b(context);
        }
        createMessageData(context, dVar);
        pushDependAdapterInject();
        C19704j.m48136b().mo40612a(context, dVar);
        if (str.endsWith(":pushservice")) {
            registerAliPushOnChannelProcess(context);
            registerAliPushObserver(context);
        }
        if (C19470k.m47658c(context)) {
            this.mHandler.postDelayed(new Runnable() {
                public final void run() {
                    C19710b.m48173a();
                    C19692e.m48100a(context);
                }
            }, TimeUnit.SECONDS.toMillis(15));
            if (this.mEnableCreateChannel) {
                C9393e.submitRunnable(new Runnable(this.mChannelName, context) {

                    /* renamed from: a */
                    final /* synthetic */ String f54207a;

                    /* renamed from: b */
                    final /* synthetic */ Context f54208b;

                    public final void run() {
                        if (VERSION.SDK_INT >= 26) {
                            String str = "push";
                            String str2 = this.f54207a;
                            if (TextUtils.isEmpty(str2)) {
                                str2 = this.f54208b.getString(R.string.d1z);
                            }
                            NotificationManager notificationManager = (NotificationManager) this.f54208b.getSystemService("notification");
                            if (notificationManager != null && notificationManager.getNotificationChannel(str) == null) {
                                NotificationChannel notificationChannel = new NotificationChannel(str, str2, 4);
                                notificationChannel.setShowBadge(true);
                                notificationChannel.enableVibration(true);
                                notificationChannel.enableLights(true);
                                notificationManager.createNotificationChannel(notificationChannel);
                            }
                        }
                    }

                    {
                        this.f54207a = r1;
                        this.f54208b = r2;
                    }
                });
            }
        }
        if (C19678c.m48071a()) {
            C19676b.f54176c.set(true);
            if (C19470k.m47658c(C19408a.m47500a())) {
                C19676b.f54175b = System.currentTimeMillis();
                C19676b.m48066a().sendEmptyMessageDelayed(1, TimeUnit.SECONDS.toMillis(20));
                C19676b.m48066a().sendEmptyMessageDelayed(2, TimeUnit.SECONDS.toMillis(30));
            }
        }
    }

    public void trackClickPush(Context context, long j, boolean z, String str, JSONObject jSONObject) {
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
        C19700f.m48124a().mo41057a("push_click", jSONObject);
    }
}
