package com.fcm;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.p1033b.C15175c;
import com.google.android.gms.p1033b.C15179g;
import com.google.firebase.iid.C17888a;
import com.google.firebase.iid.C17933q;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.C17944a;
import com.p683ss.android.message.p1191b.C19453a;
import com.p683ss.android.message.p1191b.C19453a.C19454a;
import com.p683ss.android.message.p1191b.C19453a.C19455b;
import com.p683ss.android.message.p1191b.C19462e;
import com.p683ss.android.push.PushDependManager;
import com.p683ss.android.push.push_3rd_fcm.R$string;
import com.p683ss.android.pushmanager.p1205b.C19679d;
import com.p683ss.android.pushmanager.thirdparty.IPushAdapter;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.Arrays;
import java.util.Collections;

public class FcmPushAdapter implements IPushAdapter {
    public boolean isPushAvailable(Context context, int i) {
        return true;
    }

    public void trackPush(Context context, int i, Object obj) {
    }

    public void unregisterPush(Context context, int i) {
        if (context != null && i == 5 && PushDependManager.inst().loggerDebug()) {
            PushDependManager.inst().loggerD("FcmPush", "unregisterPush");
        }
    }

    public boolean checkThirdPushConfig(String str, Context context) throws Exception {
        boolean z;
        String string = context.getResources().getString(R$string.google_api_key);
        String string2 = context.getResources().getString(R$string.google_app_id);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            z = false;
        } else {
            z = true;
        }
        return C19462e.m47623b(context, str, "Fcm Push 错误", Arrays.asList(new C19453a[]{C19454a.m47606c("com.fcm.service.SSGcmListenerService").mo40588a(context.getPackageName()).mo40587a(new C19455b(Collections.singletonList("com.google.firebase.MESSAGING_EVENT"))).f53774a, C19454a.m47606c("com.fcm.service.FcmRegistrationJobIntentService").mo40588a(context.getPackageName()).mo40589b("android.permission.BIND_JOB_SERVICE").f53774a})) & z;
    }

    public void registerPush(Context context, int i) {
        if (context == null || i != 5) {
            String str = null;
            if (context == null) {
                str = "空 context";
            } else if (i != 5) {
                str = "通道注册错误";
            }
            C19679d.m48075a(i, BaseNotice.HASHTAG, "0", str);
            return;
        }
        if (PushDependManager.inst().loggerDebug()) {
            StringBuilder sb = new StringBuilder("registerPush:");
            sb.append(i);
            PushDependManager.inst().loggerD("FcmPush", sb.toString());
        }
        try {
            FirebaseInstanceId a = FirebaseInstanceId.m43841a();
            a.mo34715a(C17933q.m43949a(a.f49699c), "*").mo27991a((C15175c<TResult>) new C15175c<C17888a>(context, 1) {

                /* renamed from: a */
                final /* synthetic */ Context f38105a;

                /* renamed from: b */
                final /* synthetic */ int f38106b;

                /* renamed from: a */
                public final void mo26975a(C15179g<C17888a> gVar) {
                    if (gVar != null && gVar.mo28000b() && gVar.mo28002d() != null) {
                        C14705a.m30080a(this.f38105a, ((C17888a) gVar.mo28002d()).mo34728a(), this.f38106b);
                    }
                }

                {
                    this.f38105a = r1;
                    this.f38106b = r2;
                }
            });
        } catch (Throwable unused) {
        }
    }

    public void setAlias(Context context, String str, int i) {
        String str2;
        if (context != null && i == 5) {
            if (PushDependManager.inst().loggerDebug()) {
                PushDependManager.inst().loggerD("FcmPush", "setAlias");
            }
            C17944a a = C17944a.m43985a();
            if (str != null && str.startsWith("/topics/")) {
                str = str.substring(8);
            }
            if (str == null || !C17944a.f49833a.matcher(str).matches()) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                sb.append("Invalid topic name: ");
                sb.append(str);
                sb.append(" does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}");
                throw new IllegalArgumentException(sb.toString());
            }
            FirebaseInstanceId firebaseInstanceId = a.f49835b;
            String valueOf = String.valueOf("S!");
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str2 = valueOf.concat(valueOf2);
            } else {
                str2 = new String(valueOf);
            }
            firebaseInstanceId.mo34714a(str2).mo27991a((C15175c<TResult>) new C15175c<Void>() {
                /* renamed from: a */
                public final void mo26975a(C15179g<Void> gVar) {
                }
            });
        }
    }
}
