package com.igexin.sdk;

import android.content.BroadcastReceiver;
import com.p683ss.android.pushmanager.setting.C19710b;

public class PushReceiver extends BroadcastReceiver {

    class _lancet {
        private _lancet() {
        }

        static boolean com_ss_android_ugc_aweme_lancet_I18nLancet_isAllowNetwork(C19710b bVar) {
            return true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:8|9|(1:11)|12|(1:14)|15|16|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r1, android.content.Intent r2) {
        /*
            r0 = this;
            com.ss.android.pushmanager.setting.b r2 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{ Throwable -> 0x0028 }
            boolean r2 = r2.mo41101j()     // Catch:{ Throwable -> 0x0028 }
            if (r2 == 0) goto L_0x000f
            com.p683ss.android.message.p1191b.C19456b.m47610a(r1)     // Catch:{ Throwable -> 0x000e }
            return
        L_0x000e:
            return
        L_0x000f:
            com.ss.android.pushmanager.a.c$a r2 = com.p683ss.android.pushmanager.p1204a.C19664c.m48033a()     // Catch:{ Exception -> 0x0023 }
            if (r2 == 0) goto L_0x0018
            r2.mo41008a(r1)     // Catch:{ Exception -> 0x0023 }
        L_0x0018:
            com.ss.android.pushmanager.setting.b r2 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{ Exception -> 0x0023 }
            boolean r2 = com.igexin.sdk.PushReceiver._lancet.com_ss_android_ugc_aweme_lancet_I18nLancet_isAllowNetwork(r2)     // Catch:{ Exception -> 0x0023 }
            if (r2 != 0) goto L_0x0023
            return
        L_0x0023:
            com.p683ss.android.message.C19481h.m47695d(r1)     // Catch:{ Exception -> 0x0027 }
            goto L_0x0028
        L_0x0027:
            return
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.sdk.PushReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
