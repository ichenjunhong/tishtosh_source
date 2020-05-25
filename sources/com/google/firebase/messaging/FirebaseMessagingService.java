package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.C17855b;
import com.google.firebase.analytics.connector.C17849a;
import com.google.firebase.iid.C17941y;
import com.google.firebase.iid.zzb;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class FirebaseMessagingService extends zzb {
    private static final Queue<String> zzdr = new ArrayDeque(10);

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    public final Intent zzb(Intent intent) {
        return (Intent) C17941y.m43971a().f49822b.poll();
    }

    public final boolean zzc(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (CanceledException unused) {
            }
        }
        if (C17945b.m43987a(intent)) {
            if (intent != null) {
                if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                    C17849a aVar = (C17849a) C17855b.m43787c().mo34680a(C17849a.class);
                    if (aVar != null) {
                        String stringExtra = intent.getStringExtra("google.c.a.c_id");
                        aVar.mo34675a("fcm", "_ln", (Object) stringExtra);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "Firebase");
                        bundle.putString("medium", "notification");
                        bundle.putString("campaign", stringExtra);
                        aVar.mo34674a("fcm", "_cmp", bundle);
                    }
                }
            }
            C17945b.m43986a("_no", intent);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f6, code lost:
        if (r0.equals("send_event") == false) goto L_0x0117;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(android.content.Intent r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getAction()
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0055
            java.lang.String r1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0015
            goto L_0x0055
        L_0x0015:
            java.lang.String r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0029
            boolean r0 = com.google.firebase.messaging.C17945b.m43987a(r10)
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "_nd"
            com.google.firebase.messaging.C17945b.m43986a(r0, r10)
            return
        L_0x0029:
            java.lang.String r1 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "token"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.onNewToken(r10)
            return
        L_0x003b:
            java.lang.String r0 = "Unknown intent action: "
            java.lang.String r10 = r10.getAction()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r1 = r10.length()
            if (r1 == 0) goto L_0x004f
            r0.concat(r10)
            return
        L_0x004f:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0)
        L_0x0054:
            return
        L_0x0055:
            java.lang.String r0 = "google.message_id"
            java.lang.String r0 = r10.getStringExtra(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 2
            if (r1 == 0) goto L_0x0068
            r1 = 0
            com.google.android.gms.b.g r1 = com.google.android.gms.p1033b.C15183j.m31395a(r1)
            goto L_0x0083
        L_0x0068:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "google.message_id"
            r1.putString(r3, r0)
            com.google.firebase.iid.e r3 = com.google.firebase.iid.C17921e.m43929a(r9)
            com.google.firebase.iid.m r4 = new com.google.firebase.iid.m
            int r5 = r3.mo34762a()
            r4.<init>(r5, r2, r1)
            com.google.android.gms.b.g r1 = r3.mo34763a(r4)
        L_0x0083:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 3
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x008e
        L_0x008c:
            r0 = 0
            goto L_0x00ca
        L_0x008e:
            java.util.Queue<java.lang.String> r3 = zzdr
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x00b5
            java.lang.String r3 = "FirebaseMessaging"
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x00b3
            java.lang.String r3 = "Received duplicate message: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r7 = r0.length()
            if (r7 == 0) goto L_0x00ae
            r3.concat(r0)
            goto L_0x00b3
        L_0x00ae:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x00b3:
            r0 = 1
            goto L_0x00ca
        L_0x00b5:
            java.util.Queue<java.lang.String> r3 = zzdr
            int r3 = r3.size()
            r7 = 10
            if (r3 < r7) goto L_0x00c4
            java.util.Queue<java.lang.String> r3 = zzdr
            r3.remove()
        L_0x00c4:
            java.util.Queue<java.lang.String> r3 = zzdr
            r3.add(r0)
            goto L_0x008c
        L_0x00ca:
            if (r0 != 0) goto L_0x01b0
            java.lang.String r0 = "message_type"
            java.lang.String r0 = r10.getStringExtra(r0)
            if (r0 != 0) goto L_0x00d6
            java.lang.String r0 = "gcm"
        L_0x00d6:
            r3 = -1
            int r7 = r0.hashCode()
            r8 = -2062414158(0xffffffff85120eb2, float:-6.867586E-36)
            if (r7 == r8) goto L_0x010d
            r8 = 102161(0x18f11, float:1.43158E-40)
            if (r7 == r8) goto L_0x0103
            r8 = 814694033(0x308f3e91, float:1.0422402E-9)
            if (r7 == r8) goto L_0x00f9
            r4 = 814800675(0x3090df23, float:1.0540798E-9)
            if (r7 == r4) goto L_0x00f0
            goto L_0x0117
        L_0x00f0:
            java.lang.String r4 = "send_event"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0117
            goto L_0x0118
        L_0x00f9:
            java.lang.String r2 = "send_error"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0117
            r2 = 3
            goto L_0x0118
        L_0x0103:
            java.lang.String r2 = "gcm"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0117
            r2 = 0
            goto L_0x0118
        L_0x010d:
            java.lang.String r2 = "deleted_messages"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0117
            r2 = 1
            goto L_0x0118
        L_0x0117:
            r2 = -1
        L_0x0118:
            switch(r2) {
                case 0: goto L_0x0157;
                case 1: goto L_0x0153;
                case 2: goto L_0x0149;
                case 3: goto L_0x012c;
                default: goto L_0x011b;
            }
        L_0x011b:
            java.lang.String r10 = "Received message with unknown type: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x01ab
            r10.concat(r0)
            goto L_0x01b0
        L_0x012c:
            java.lang.String r0 = "google.message_id"
            java.lang.String r0 = r10.getStringExtra(r0)
            if (r0 != 0) goto L_0x013a
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r10.getStringExtra(r0)
        L_0x013a:
            com.google.firebase.messaging.c r2 = new com.google.firebase.messaging.c
            java.lang.String r3 = "error"
            java.lang.String r10 = r10.getStringExtra(r3)
            r2.<init>(r10)
            r9.onSendError(r0, r2)
            goto L_0x01b0
        L_0x0149:
            java.lang.String r0 = "google.message_id"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.onMessageSent(r10)
            goto L_0x01b0
        L_0x0153:
            r9.onDeletedMessages()
            goto L_0x01b0
        L_0x0157:
            boolean r0 = com.google.firebase.messaging.C17945b.m43987a(r10)
            if (r0 == 0) goto L_0x0162
            java.lang.String r0 = "_nr"
            com.google.firebase.messaging.C17945b.m43986a(r0, r10)
        L_0x0162:
            android.os.Bundle r0 = r10.getExtras()
            if (r0 != 0) goto L_0x016d
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x016d:
            java.lang.String r2 = "android.support.content.wakelockid"
            r0.remove(r2)
            java.lang.String r2 = "1"
            java.lang.String r3 = "gcm.n.e"
            java.lang.String r3 = com.google.firebase.messaging.C17947d.m43990a(r0, r3)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x018a
            java.lang.String r2 = "gcm.n.icon"
            java.lang.String r2 = com.google.firebase.messaging.C17947d.m43990a(r0, r2)
            if (r2 == 0) goto L_0x0189
            goto L_0x018a
        L_0x0189:
            r5 = 0
        L_0x018a:
            if (r5 == 0) goto L_0x01a2
            com.google.firebase.messaging.d r2 = new com.google.firebase.messaging.d
            r2.<init>(r9)
            boolean r2 = r2.mo34813a(r0)
            if (r2 != 0) goto L_0x01b0
            boolean r2 = com.google.firebase.messaging.C17945b.m43987a(r10)
            if (r2 == 0) goto L_0x01a2
            java.lang.String r2 = "_nf"
            com.google.firebase.messaging.C17945b.m43986a(r2, r10)
        L_0x01a2:
            com.google.firebase.messaging.RemoteMessage r10 = new com.google.firebase.messaging.RemoteMessage
            r10.<init>(r0)
            r9.onMessageReceived(r10)
            goto L_0x01b0
        L_0x01ab:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r10)
        L_0x01b0:
            r2 = 1
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x01b8 }
            com.google.android.gms.p1033b.C15183j.m31397a(r1, r2, r10)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x01b8 }
            return
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.zzd(android.content.Intent):void");
    }

    static void zzj(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }
}
