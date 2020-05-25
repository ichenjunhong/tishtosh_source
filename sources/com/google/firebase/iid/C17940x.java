package com.google.firebase.iid;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p1044e.C16483a;
import com.google.firebase.iid.zzl.C17943a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.iid.x */
final class C17940x extends C16483a {

    /* renamed from: a */
    private final /* synthetic */ C17939w f49819a;

    C17940x(C17939w wVar, Looper looper) {
        this.f49819a = wVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        C17939w wVar = this.f49819a;
        if (message != null && (message.obj instanceof Intent)) {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(new C17943a());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof zzl) {
                    wVar.f49815c = (zzl) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    wVar.f49814b = (Messenger) parcelableExtra;
                }
            }
            Intent intent2 = (Intent) message.obj;
            String action = intent2.getAction();
            if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String str = "Unexpected response action: ";
                    String valueOf = String.valueOf(action);
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        new String(str);
                    }
                }
                return;
            }
            String stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 != null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str2 = "Received InstanceID error ";
                        String valueOf2 = String.valueOf(stringExtra2);
                        if (valueOf2.length() != 0) {
                            str2.concat(valueOf2);
                        } else {
                            new String(str2);
                        }
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length <= 2 || !"ID".equals(split[1])) {
                            String str3 = "Unexpected structured response ";
                            String valueOf3 = String.valueOf(stringExtra2);
                            if (valueOf3.length() != 0) {
                                str3.concat(valueOf3);
                            } else {
                                new String(str3);
                            }
                        } else {
                            String str4 = split[2];
                            String str5 = split[3];
                            if (str5.startsWith(":")) {
                                str5 = str5.substring(1);
                            }
                            wVar.mo34789a(str4, intent2.putExtra("error", str5).getExtras());
                        }
                    } else {
                        synchronized (wVar.f49813a) {
                            for (int i = 0; i < wVar.f49813a.size(); i++) {
                                wVar.mo34789a((String) wVar.f49813a.mo2576b(i), intent2.getExtras());
                            }
                        }
                    }
                }
            } else {
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str6 = "Unexpected response string: ";
                        String valueOf4 = String.valueOf(stringExtra);
                        if (valueOf4.length() != 0) {
                            str6.concat(valueOf4);
                        } else {
                            new String(str6);
                        }
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                wVar.mo34789a(group, extras);
            }
        }
    }
}
