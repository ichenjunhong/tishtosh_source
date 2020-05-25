package com.p683ss.android.download;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.ss.android.download.DownloadDeleteActivity */
public class DownloadDeleteActivity extends Activity {

    /* renamed from: a */
    private Dialog f52507a;

    /* renamed from: b */
    private Uri f52508b;

    /* renamed from: c */
    private Intent f52509c;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r0 != null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r7 = this;
            super.onResume()
            android.content.Intent r0 = r7.getIntent()
            r7.f52509c = r0
            if (r0 == 0) goto L_0x0054
            r0 = 0
            r7.setIntent(r0)
            android.app.Dialog r0 = r7.f52507a
            if (r0 != 0) goto L_0x0054
            android.content.Intent r0 = r7.f52509c
            if (r0 != 0) goto L_0x0018
            goto L_0x0054
        L_0x0018:
            android.content.Intent r0 = r7.f52509c
            android.net.Uri r0 = r0.getData()
            r7.f52508b = r0
            android.net.Uri r0 = r7.f52508b
            if (r0 == 0) goto L_0x0054
            android.content.Context r0 = r7.getApplicationContext()
            com.ss.android.download.g r1 = com.p683ss.android.download.C19117g.m46591a(r0)
            android.net.Uri r2 = r7.f52508b
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r0 = r1.mo39054a(r2, r3, r4, r5, r6)
            boolean r1 = r0.moveToFirst()     // Catch:{ Exception -> 0x0051, all -> 0x004a }
            if (r1 != 0) goto L_0x0044
            if (r0 == 0) goto L_0x0054
        L_0x003e:
            r0.close()     // Catch:{ Exception -> 0x0042 }
            goto L_0x0054
        L_0x0042:
            goto L_0x0054
        L_0x0044:
            r7.m46452a(r0)     // Catch:{ Exception -> 0x0051, all -> 0x004a }
            if (r0 == 0) goto L_0x0054
            goto L_0x003e
        L_0x004a:
            r1 = move-exception
            if (r0 == 0) goto L_0x0050
            r0.close()     // Catch:{ Exception -> 0x0050 }
        L_0x0050:
            throw r1
        L_0x0051:
            if (r0 == 0) goto L_0x0054
            goto L_0x003e
        L_0x0054:
            android.app.Dialog r0 = r7.f52507a
            if (r0 == 0) goto L_0x0065
            android.app.Dialog r0 = r7.f52507a
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x0065
            android.app.Dialog r0 = r7.f52507a
            r0.show()
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.DownloadDeleteActivity.onResume():void");
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=android.database.Cursor, code=boolean, for r6v0, types: [android.database.Cursor] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m46452a(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = "title"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "_id"
            int r1 = r6.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0072 }
            long r1 = r6.getLong(r1)     // Catch:{ all -> 0x0072 }
            if (r6 == 0) goto L_0x001f
            r6.close()     // Catch:{ Exception -> 0x001f }
        L_0x001f:
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 == 0) goto L_0x0026
            return
        L_0x0026:
            r6 = 2132547117(0x7f1c162d, float:2.0747471E38)
            java.lang.String r6 = r5.getString(r6)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r6 = com.C2240a.m6772a(r6, r3)
            com.bytedance.ies.uikit.dialog.b$a r0 = com.p683ss.android.download.C19129n.m46629b(r5)
            r3 = 2132549854(0x7f1c20de, float:2.0753022E38)
            com.bytedance.ies.uikit.dialog.b$a r3 = r0.mo20135a(r3)
            com.bytedance.ies.uikit.dialog.b$a r6 = r3.mo20146b(r6)
            r3 = 2132545988(0x7f1c11c4, float:2.0745181E38)
            com.ss.android.download.DownloadDeleteActivity$3 r4 = new com.ss.android.download.DownloadDeleteActivity$3
            r4.<init>(r1)
            com.bytedance.ies.uikit.dialog.b$a r6 = r6.mo20136a(r3, r4)
            r1 = 2132545980(0x7f1c11bc, float:2.0745165E38)
            com.ss.android.download.DownloadDeleteActivity$2 r2 = new com.ss.android.download.DownloadDeleteActivity$2
            r2.<init>()
            com.bytedance.ies.uikit.dialog.b$a r6 = r6.mo20145b(r1, r2)
            com.ss.android.download.DownloadDeleteActivity$1 r1 = new com.ss.android.download.DownloadDeleteActivity$1
            r1.<init>()
            r6.mo20137a(r1)
            r0.mo20148b()
            return
        L_0x006a:
            if (r6 == 0) goto L_0x0071
            r6.close()     // Catch:{ Exception -> 0x0070 }
            goto L_0x0071
        L_0x0070:
            return
        L_0x0071:
            return
        L_0x0072:
            r0 = move-exception
            if (r6 == 0) goto L_0x0078
            r6.close()     // Catch:{ Exception -> 0x0078 }
        L_0x0078:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.download.DownloadDeleteActivity.m46452a(android.database.Cursor):void");
    }
}
