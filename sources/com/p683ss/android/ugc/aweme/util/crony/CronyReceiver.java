package com.p683ss.android.ugc.aweme.util.crony;

import android.content.BroadcastReceiver;

/* renamed from: com.ss.android.ugc.aweme.util.crony.CronyReceiver */
public class CronyReceiver extends BroadcastReceiver {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r6 = r7.getAction()
            int r0 = r6.hashCode()
            r1 = -2002725875(0xffffffff88a0d40d, float:-9.679503E-34)
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 == r1) goto L_0x0045
            r1 = -290818900(0xffffffffeeaa74ac, float:-2.637675E28)
            if (r0 == r1) goto L_0x003b
            r1 = 100274856(0x5fa12a8, float:2.351674E-35)
            if (r0 == r1) goto L_0x0031
            r1 = 534977624(0x1fe31c58, float:9.618513E-20)
            if (r0 == r1) goto L_0x0027
            goto L_0x004f
        L_0x0027:
            java.lang.String r0 = "com.ss.android.ugc.aweme.util.crony.action_clipboard"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x004f
            r6 = 0
            goto L_0x0050
        L_0x0031:
            java.lang.String r0 = "com.ss.android.ugc.aweme.util.crony.action_clipboard_put"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x004f
            r6 = 1
            goto L_0x0050
        L_0x003b:
            java.lang.String r0 = "com.ss.android.ugc.aweme.util.crony.action_info"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x004f
            r6 = 3
            goto L_0x0050
        L_0x0045:
            java.lang.String r0 = "com.ss.android.ugc.aweme.util.crony.action_activity"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x004f
            r6 = 2
            goto L_0x0050
        L_0x004f:
            r6 = -1
        L_0x0050:
            switch(r6) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00b5;
                case 2: goto L_0x0089;
                case 3: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0107
        L_0x0055:
            com.ss.android.ugc.aweme.util.crony.c r6 = com.p683ss.android.ugc.aweme.util.crony.C47616a.f120086c
            if (r6 == 0) goto L_0x0082
            java.lang.String r6 = "key"
            java.lang.String r6 = r7.getStringExtra(r6)
            java.lang.String r7 = "default"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0069
            java.lang.String r6 = ""
        L_0x0069:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "\n1\n"
            r7.<init>(r0)
            com.ss.android.ugc.aweme.util.crony.c r0 = com.p683ss.android.ugc.aweme.util.crony.C47616a.f120086c
            java.lang.String r6 = r0.mo94932a(r6)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.setResultData(r6)
            goto L_0x0107
        L_0x0082:
            java.lang.String r6 = "\n2\n"
            r5.setResultData(r6)
            goto L_0x0107
        L_0x0089:
            android.app.Application r6 = com.p683ss.android.ugc.aweme.util.crony.C47616a.f120084a
            java.lang.String r7 = "activity"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            java.util.List r6 = r6.getRunningTasks(r2)
            java.lang.Object r6 = r6.get(r4)
            android.app.ActivityManager$RunningTaskInfo r6 = (android.app.ActivityManager.RunningTaskInfo) r6
            android.content.ComponentName r6 = r6.topActivity
            java.lang.String r6 = r6.getClassName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "\n1\n"
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.setResultData(r6)
            goto L_0x0107
        L_0x00b5:
            java.lang.String r6 = "content"
            java.lang.String r6 = r7.getStringExtra(r6)
            android.app.Application r7 = com.p683ss.android.ugc.aweme.util.crony.C47616a.f120084a
            java.lang.String r0 = "clipboard"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.content.ClipboardManager r7 = (android.content.ClipboardManager) r7
            java.lang.String r0 = "Crony"
            android.content.ClipData r6 = android.content.ClipData.newPlainText(r0, r6)
            r7.setPrimaryClip(r6)
            java.lang.String r6 = "\n1\n"
            r5.setResultData(r6)
            goto L_0x0107
        L_0x00d4:
            android.app.Application r6 = com.p683ss.android.ugc.aweme.util.crony.C47616a.f120084a
            java.lang.String r7 = "clipboard"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.content.ClipboardManager r6 = (android.content.ClipboardManager) r6
            android.content.ClipData r6 = r6.getPrimaryClip()
            if (r6 == 0) goto L_0x0102
            android.content.ClipData$Item r6 = r6.getItemAt(r4)
            java.lang.CharSequence r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "\n1\n"
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.setResultData(r6)
            goto L_0x0107
        L_0x0102:
            java.lang.String r6 = "\n0\n"
            r5.setResultData(r6)
        L_0x0107:
            r5.setResultCode(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.util.crony.CronyReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
