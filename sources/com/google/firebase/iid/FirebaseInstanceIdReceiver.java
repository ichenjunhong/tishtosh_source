package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.p030v4.content.WakefulBroadcastReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C15524o;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {

    /* renamed from: a */
    private static C17900ak f49711a;

    /* renamed from: b */
    private static C17900ak f49712b;

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                m43862a(context, intent2, intent.getAction());
            } else {
                m43862a(context, intent, intent.getAction());
            }
        }
    }

    /* renamed from: a */
    private final void m43862a(Context context, Intent intent, String str) {
        String str2 = null;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if ("google.com/iid".equals(intent.getStringExtra("from")) || "com.google.firebase.INSTANCE_ID_EVENT".equals(str)) {
            str2 = "com.google.firebase.INSTANCE_ID_EVENT";
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(str) || "com.google.firebase.MESSAGING_EVENT".equals(str)) {
            str2 = "com.google.firebase.MESSAGING_EVENT";
        }
        int i = -1;
        if (str2 != null) {
            i = m43860a(this, context, str2, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    /* renamed from: a */
    private static int m43860a(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        boolean z = true;
        boolean z2 = C15524o.m32301i() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        if (z2 && !z) {
            return m43863b(broadcastReceiver, context, str, intent);
        }
        int b = C17941y.m43971a().mo34791b(context, str, intent);
        if (!C15524o.m32301i() || b != 402) {
            return b;
        }
        m43863b(broadcastReceiver, context, str, intent);
        return 403;
    }

    /* renamed from: b */
    private static int m43863b(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String str2 = "Binding to service: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        m43861a(context, str).mo34741a(intent, broadcastReceiver.goAsync());
        return -1;
    }

    /* renamed from: a */
    private static synchronized C17900ak m43861a(Context context, String str) {
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (f49712b == null) {
                    f49712b = new C17900ak(context, str);
                }
                C17900ak akVar = f49712b;
                return akVar;
            }
            if (f49711a == null) {
                f49711a = new C17900ak(context, str);
            }
            C17900ak akVar2 = f49711a;
            return akVar2;
        }
    }
}
