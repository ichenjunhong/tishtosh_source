package com.p683ss.android.pushmanager.thirdparty;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.message.p1191b.C19453a;
import com.p683ss.android.message.p1191b.C19453a.C19454a;
import com.p683ss.android.message.p1191b.C19453a.C19455b;
import com.p683ss.android.message.p1191b.C19462e;
import com.p683ss.android.pushmanager.p1205b.C19679d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.pushmanager.thirdparty.PushManager */
public class PushManager implements IPushAdapter {
    private static volatile PushManager sPushManager;
    private Map<Integer, C19711a> mPush3rdTypeMap = new HashMap();
    private Map<Integer, IPushAdapter> mPushAdapterMap;

    public static PushManager inst() {
        if (sPushManager == null) {
            synchronized (PushManager.class) {
                if (sPushManager == null) {
                    sPushManager = new PushManager();
                }
            }
        }
        return sPushManager;
    }

    private PushManager() {
        this.mPush3rdTypeMap.put(Integer.valueOf(14), new C19711a(14, "com.adm.push.AdmPushAdapter"));
        this.mPush3rdTypeMap.put(Integer.valueOf(5), new C19711a(5, "com.fcm.FcmPushAdapter"));
        this.mPush3rdTypeMap.put(Integer.valueOf(1), new C19711a(1, "com.xiaomi.MiPushAdapter"));
        this.mPush3rdTypeMap.put(Integer.valueOf(6), new C19711a(6, "com.umeng.UmengPushAdapter"));
        this.mPush3rdTypeMap.put(Integer.valueOf(7), new C19711a(7, "com.huawei.HWPushAdapter"));
        this.mPush3rdTypeMap.put(Integer.valueOf(8), new C19711a(8, "com.meizu.MzPushAdapter"));
        this.mPush3rdTypeMap.put(Integer.valueOf(10), new C19711a(10, "com.coloros.OppoPushAdapter"));
        this.mPush3rdTypeMap.put(Integer.valueOf(11), new C19711a(11, "com.vivo.VivoPushAdapter"));
        this.mPushAdapterMap = new HashMap();
    }

    private void tryResolveImpl(int i) {
        if (!this.mPushAdapterMap.containsKey(Integer.valueOf(i))) {
            C19711a aVar = (C19711a) this.mPush3rdTypeMap.get(Integer.valueOf(i));
            String str = null;
            if (aVar != null) {
                str = aVar.f54264b;
            }
            if (!C9431p.m18664a(str)) {
                try {
                    Object newInstance = Class.forName(str).newInstance();
                    if (newInstance instanceof IPushAdapter) {
                        this.mPushAdapterMap.put(Integer.valueOf(i), (IPushAdapter) newInstance);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public boolean isPushAvailable(Context context, int i) {
        tryResolveImpl(i);
        IPushAdapter iPushAdapter = (IPushAdapter) this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                return iPushAdapter.isPushAvailable(context, i);
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public void registerPush(Context context, int i) {
        tryResolveImpl(i);
        IPushAdapter iPushAdapter = (IPushAdapter) this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                C19679d.m48074a(i);
                iPushAdapter.registerPush(context, i);
            } catch (Throwable unused) {
            }
        }
    }

    public void unregisterPush(Context context, int i) {
        tryResolveImpl(i);
        IPushAdapter iPushAdapter = (IPushAdapter) this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                iPushAdapter.unregisterPush(context, i);
            } catch (Throwable unused) {
            }
        }
    }

    public boolean checkThirdPushConfig(String str, Context context) {
        boolean z;
        String str2;
        String str3 = str;
        Context context2 = context;
        boolean z2 = true;
        for (Integer num : this.mPush3rdTypeMap.keySet()) {
            tryResolveImpl(num.intValue());
            IPushAdapter iPushAdapter = (IPushAdapter) this.mPushAdapterMap.get(num);
            if (iPushAdapter != null) {
                try {
                    z2 &= iPushAdapter.checkThirdPushConfig(str3, context2);
                } catch (Throwable unused) {
                    z2 = false;
                }
            }
        }
        try {
            Set<Integer> keySet = this.mPushAdapterMap.keySet();
            C19454a c = C19454a.m47606c("com.ss.android.message.NotifyService");
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(":push");
            C19454a a = c.mo40588a(sb.toString());
            String[] strArr = {"com.ss.android.message.action.PUSH_SERVICE"};
            C19454a c2 = C19454a.m47606c("com.ss.android.message.NotifyIntentService");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getPackageName());
            sb2.append(":push");
            C19454a c3 = C19454a.m47606c("com.ss.android.message.PushJobService");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(context.getPackageName());
            sb3.append(":push");
            C19454a c4 = C19454a.m47606c("com.ss.android.message.log.LogService");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(context.getPackageName());
            sb4.append(":push");
            C19454a c5 = C19454a.m47606c("com.ss.android.push.daemon.PushService");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(context.getPackageName());
            sb5.append(":pushservice");
            C19454a c6 = C19454a.m47606c("com.baidu.android.pushservice.CommandService");
            StringBuilder sb6 = new StringBuilder();
            sb6.append(context.getPackageName());
            sb6.append(":push");
            C19454a c7 = C19454a.m47606c("com.igexin.sdk.PushService");
            StringBuilder sb7 = new StringBuilder();
            sb7.append(context.getPackageName());
            sb7.append(":push");
            boolean b = C19462e.m47623b(context2, str3, "Push", Arrays.asList(new C19453a[]{a.mo40587a(new C19455b(Arrays.asList(strArr))).f53774a, c2.mo40588a(sb2.toString()).f53774a, c3.mo40588a(sb3.toString()).mo40589b("android.permission.BIND_JOB_SERVICE").f53774a, c4.mo40588a(sb4.toString()).f53774a, c5.mo40588a(sb5.toString()).f53774a, C19454a.m47606c("com.ss.android.push.DefaultService").mo40588a(context.getPackageName()).f53774a, c6.mo40588a(sb6.toString()).f53774a, c7.mo40588a(sb7.toString()).mo40587a(new C19455b(Arrays.asList(new String[]{"com.igexin.sdk.action.service.message"}))).f53774a}));
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("com.ss.android.message");
            if (keySet != null) {
                for (Integer intValue : keySet) {
                    int intValue2 = intValue.intValue();
                    if (intValue2 == 1) {
                        str2 = "com.ss.android.xiaomi.message";
                    } else if (intValue2 != 14) {
                        switch (intValue2) {
                            case 5:
                                str2 = "com.ss.android.fcm.message";
                                break;
                            case 6:
                                str2 = "com.ss.android.umeng.message";
                                break;
                            case 7:
                                str2 = "com.ss.android.hw.message";
                                break;
                            case 8:
                                str2 = "com.ss.android.mz.message";
                                break;
                            default:
                                switch (intValue2) {
                                    case 10:
                                        str2 = "com.ss.android.oppo.message";
                                        break;
                                    case 11:
                                        str2 = "com.ss.android.vivo.message";
                                        break;
                                    default:
                                        throw new IllegalArgumentException("not supported push channel");
                                }
                        }
                    } else {
                        str2 = "com.ss.android.adm.message";
                    }
                    arrayList.add(str2);
                }
            }
            boolean z3 = true;
            for (String str4 : arrayList) {
                Intent intent = new Intent();
                intent.setPackage(context.getPackageName());
                intent.setAction(str4);
                List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 64);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    z3 = false;
                }
            }
            if (!b || !z3) {
                z = false;
            } else {
                z = true;
            }
            C19454a c8 = C19454a.m47606c("com.ss.android.message.MessageReceiver");
            StringBuilder sb8 = new StringBuilder();
            sb8.append(context.getPackageName());
            sb8.append(":push");
            C19454a a2 = c8.mo40588a(sb8.toString()).mo40587a(new C19455b(Arrays.asList(new String[]{"android.intent.action.BOOT_COMPLETED", "android.net.conn.CONNECTIVITY_CHANGE", "android.intent.action.MEDIA_MOUNTED", "android.intent.action.MEDIA_UNMOUNTED", "android.intent.action.USER_PRESENT", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.ACTION_POWER_CONNECTED", "android.intent.action.ACTION_POWER_DISCONNECTED"})));
            List asList = Arrays.asList(new String[]{"android.intent.action.PACKAGE_ADDED", "android.intent.action.PACKAGE_REMOVED"});
            StringBuilder sb9 = new StringBuilder("package://");
            sb9.append(context.getPackageName());
            C19454a c9 = C19454a.m47606c("com.ss.android.push.daemon.PushReceiver");
            StringBuilder sb10 = new StringBuilder();
            sb10.append(context.getPackageName());
            sb10.append(":pushservice");
            C19454a c10 = C19454a.m47606c("com.baidu.android.pushservice.RegistrationReceiver");
            StringBuilder sb11 = new StringBuilder();
            sb11.append(context.getPackageName());
            sb11.append(":push");
            C19454a a3 = c10.mo40588a(sb11.toString()).mo40587a(new C19455b(Arrays.asList(new String[]{"com.baidu.android.pushservice.action.METHOD", "com.baidu.android.pushservice.action.BIND_SYNC"})));
            List asList2 = Arrays.asList(new String[]{"android.intent.action.PACKAGE_REMOVED"});
            StringBuilder sb12 = new StringBuilder("package://");
            sb12.append(context.getPackageName());
            C19454a c11 = C19454a.m47606c("com.igexin.sdk.PushReceiver");
            StringBuilder sb13 = new StringBuilder();
            sb13.append(context.getPackageName());
            sb13.append(":push");
            C19454a a4 = c11.mo40588a(sb13.toString());
            String[] strArr2 = {"com.igexin.sdk.action.refreshls"};
            C19454a c12 = C19454a.m47606c("com.ss.android.message.sswo.SswoReceiver");
            StringBuilder sb14 = new StringBuilder();
            sb14.append(context.getPackageName());
            sb14.append(":push");
            C19453a[] aVarArr = {a2.mo40587a(new C19455b(asList, null, Uri.parse(sb9.toString()))).f53774a, c9.mo40588a(sb10.toString()).f53774a, a3.mo40587a(new C19455b(asList2, null, Uri.parse(sb12.toString()))).f53774a, a4.mo40587a(new C19455b(Arrays.asList(strArr2))).f53774a, C19454a.m47606c("com.ss.android.push.DefaultReceiver").mo40588a(context.getPackageName()).f53774a, c12.mo40588a(sb14.toString()).mo40587a(new C19455b(Arrays.asList(new String[]{"android.intent.action.USER_PRESENT", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON"}))).f53774a};
            boolean c13 = z & C19462e.m47626c(context2, str3, "Push", Arrays.asList(aVarArr));
            C19454a c14 = C19454a.m47606c("com.ss.android.message.sswo.SswoActivity");
            StringBuilder sb15 = new StringBuilder();
            sb15.append(context.getPackageName());
            sb15.append(":push");
            C19453a[] aVarArr2 = {c14.mo40588a(sb15.toString()).f53774a};
            boolean d = c13 & C19462e.m47628d(context2, str3, "Push", Arrays.asList(aVarArr2));
            C19454a a5 = C19454a.m47606c("com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider").mo40588a(context.getPackageName());
            StringBuilder sb16 = new StringBuilder();
            sb16.append(context.getPackageName());
            sb16.append(".push.SHARE_PROVIDER_AUTHORITY");
            a5.f53774a.f53773e = sb16.toString();
            C19453a[] aVarArr3 = {a5.f53774a};
            return z2 & C19462e.m47630e(context2, str3, "Push", Arrays.asList(aVarArr3)) & d;
        } catch (NameNotFoundException unused2) {
            return false;
        }
    }

    public void setAlias(Context context, String str, int i) {
        tryResolveImpl(i);
        IPushAdapter iPushAdapter = (IPushAdapter) this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                iPushAdapter.setAlias(context, str, i);
            } catch (Throwable unused) {
            }
        }
    }

    public void trackPush(Context context, int i, Object obj) {
        tryResolveImpl(i);
        IPushAdapter iPushAdapter = (IPushAdapter) this.mPushAdapterMap.get(Integer.valueOf(i));
        if (iPushAdapter != null) {
            try {
                iPushAdapter.trackPush(context, i, obj);
            } catch (Throwable unused) {
            }
        }
    }
}
