package com.p683ss.android.message;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import com.bytedance.common.utility.p523c.C9384a;
import com.p683ss.android.pushmanager.p1204a.C19670f;
import com.p683ss.android.pushmanager.setting.C19710b;
import java.io.File;
import java.io.IOException;

/* renamed from: com.ss.android.message.g */
public final class C19479g {

    /* renamed from: a */
    Context f53800a = this.f53801b.getApplicationContext();

    /* renamed from: b */
    NotifyService f53801b;

    /* renamed from: c */
    public String f53802c;

    /* renamed from: b */
    public final void mo40618b() throws IOException {
        C19670f.m48063a(this.f53800a.getApplicationContext(), new String[]{"noPushFile"});
    }

    /* renamed from: a */
    public final void mo40617a() {
        String a = C19670f.m48061a(this.f53800a.getApplicationContext());
        if (a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("/files/noPushFile");
            File file = new File(sb.toString());
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo40619c() {
        if (VERSION.SDK_INT < 21 && C19710b.m48173a().mo41110t() && C19670f.m48061a(this.f53800a.getApplicationContext()) != null) {
            C9384a.m18565a(new AsyncTask<Void, Void, Void>() {
                /* access modifiers changed from: private */
                /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|5|6|(3:7|8|(30:10|(1:12)|13|(1:15)|16|(1:18)|19|(1:21)|22|(1:24)|25|(4:27|(1:29)|30|(1:32))|33|34|35|36|(1:40)|41|42|44|45|(4:48|(2:50|78)(1:77)|75|46)|76|51|(1:53)|54|(1:56)|57|58|73)(3:59|60|61))|(1:(0))) */
                /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
                    r0 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
                    r11 = r0;
                    r0 = null;
                    r13 = r11;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
                    r0.close();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:69:0x027a, code lost:
                    r0 = null;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:71:0x027b, code lost:
                    if (r0 != null) goto L_0x026b;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000f */
                /* JADX WARNING: Removed duplicated region for block: B:10:0x0060 A[Catch:{ Throwable -> 0x027b, all -> 0x0273 }] */
                /* JADX WARNING: Removed duplicated region for block: B:59:0x026f A[SYNTHETIC, Splitter:B:59:0x026f] */
                /* JADX WARNING: Removed duplicated region for block: B:65:0x0276 A[SYNTHETIC, Splitter:B:65:0x0276] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Void doInBackground(java.lang.Void... r13) {
                    /*
                        r12 = this;
                        r13 = 0
                        java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x000f }
                        r1 = 1000(0x3e8, double:4.94E-321)
                        r0.sleep(r1)     // Catch:{ InterruptedException -> 0x000f }
                        goto L_0x000f
                    L_0x0009:
                        r0 = move-exception
                        r11 = r0
                        r0 = r13
                        r13 = r11
                        goto L_0x0274
                    L_0x000f:
                        android.net.LocalSocket r0 = new android.net.LocalSocket     // Catch:{ Throwable -> 0x027a, all -> 0x0009 }
                        r0.<init>()     // Catch:{ Throwable -> 0x027a, all -> 0x0009 }
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r1.<init>()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        com.ss.android.message.g r2 = com.p683ss.android.message.C19479g.this     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        android.content.Context r2 = r2.f53800a     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r2 = r2.getPackageName()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r1.append(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r2 = "/"
                        r1.append(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        com.ss.android.message.g r2 = com.p683ss.android.message.C19479g.this     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r2 = r2.f53802c     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r1.append(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        android.net.LocalSocketAddress r2 = new android.net.LocalSocketAddress     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        android.net.LocalSocketAddress$Namespace r3 = android.net.LocalSocketAddress.Namespace.ABSTRACT     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r0.connect(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.io.OutputStream r2 = r0.getOutputStream()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r1.<init>(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r2.<init>()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        com.p683ss.android.pushmanager.setting.C19710b.m48174a(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        com.ss.android.pushmanager.setting.b r3 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r3 = r3.mo41097f()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        if (r4 != 0) goto L_0x026f
                        com.ss.android.pushmanager.e r4 = com.p683ss.android.pushmanager.C19700f.m48124a()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        com.ss.android.message.g r5 = com.p683ss.android.message.C19479g.this     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        android.content.Context r5 = r5.f53800a     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        android.content.Context r5 = r5.getApplicationContext()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r3 = r4.mo41054a(r5, r3)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        com.bytedance.common.utility.C9415i.m18635b()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = "\""
                        r4.<init>(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r4.append(r3)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r5 = 63
                        int r3 = r3.indexOf(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        if (r3 >= 0) goto L_0x008a
                        java.lang.String r3 = "?"
                        r4.append(r3)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                    L_0x008a:
                        java.util.TreeMap r3 = new java.util.TreeMap     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.<init>()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = com.p683ss.android.pushmanager.C19703i.f54232a     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.Object r5 = r2.get(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        if (r6 != 0) goto L_0x00a6
                        java.lang.String r6 = "did"
                        java.lang.String r5 = com.bytedance.common.utility.C9431p.m18667c(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.put(r6, r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                    L_0x00a6:
                        java.lang.String r5 = com.p683ss.android.pushmanager.C19703i.f54233b     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.Object r5 = r2.get(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        if (r6 != 0) goto L_0x00bd
                        java.lang.String r6 = "iid"
                        java.lang.String r5 = com.bytedance.common.utility.C9431p.m18667c(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.put(r6, r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                    L_0x00bd:
                        java.lang.String r5 = com.p683ss.android.pushmanager.C19703i.f54234c     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.Object r5 = r2.get(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        if (r6 != 0) goto L_0x00d4
                        java.lang.String r6 = "user_id"
                        java.lang.String r5 = com.bytedance.common.utility.C9431p.m18667c(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.put(r6, r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                    L_0x00d4:
                        java.lang.String r5 = com.p683ss.android.pushmanager.C19703i.f54235d     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.Object r2 = r2.get(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        if (r5 != 0) goto L_0x00eb
                        java.lang.String r5 = "openudid"
                        java.lang.String r2 = com.bytedance.common.utility.C9431p.m18667c(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.put(r5, r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                    L_0x00eb:
                        com.ss.android.pushmanager.a.d r2 = com.p683ss.android.pushmanager.p1204a.C19667d.m48045a()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        com.ss.android.pushmanager.d r2 = r2.mo41018b()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        if (r2 == 0) goto L_0x015e
                        java.lang.String r5 = "aid"
                        int r6 = r2.mo41049c()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r6 = com.bytedance.common.utility.C9431p.m18667c(r6)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.put(r5, r6)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = "channel"
                        java.lang.String r6 = r2.mo41050d()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r6 = com.bytedance.common.utility.C9431p.m18667c(r6)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.put(r5, r6)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = "app_version"
                        java.lang.String r6 = r2.mo41051e()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r6 = com.bytedance.common.utility.C9431p.m18667c(r6)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.put(r5, r6)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = "version_code"
                        int r6 = r2.mo41052f()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r6 = com.bytedance.common.utility.C9431p.m18667c(r6)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.put(r5, r6)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = r2.mo41048b()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        if (r5 != 0) goto L_0x0148
                        java.lang.String r5 = "app_name"
                        java.lang.String r2 = r2.mo41048b()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r2 = com.bytedance.common.utility.C9431p.m18667c(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.put(r5, r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                    L_0x0148:
                        com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r2 = com.p683ss.android.pushmanager.setting.C19710b.m48175m()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        boolean r5 = com.p683ss.android.message.p1191b.C19464g.m47641b(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        if (r5 != 0) goto L_0x015e
                        java.lang.String r5 = "uuid"
                        java.lang.String r2 = com.bytedance.common.utility.C9431p.m18667c(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.put(r5, r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                    L_0x015e:
                        java.lang.String r2 = "device_model"
                        java.lang.String r5 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = com.bytedance.common.utility.C9431p.m18667c(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.put(r2, r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r2 = "os_api"
                        int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = com.bytedance.common.utility.C9431p.m18667c(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.put(r2, r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r2 = 0
                        java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x0192 }
                        if (r5 == 0) goto L_0x0189
                        int r6 = r5.length()     // Catch:{ Exception -> 0x0192 }
                        r7 = 10
                        if (r6 <= r7) goto L_0x0189
                        java.lang.String r5 = r5.substring(r2, r7)     // Catch:{ Exception -> 0x0192 }
                    L_0x0189:
                        java.lang.String r6 = "os_version"
                        java.lang.String r5 = com.bytedance.common.utility.C9431p.m18667c(r5)     // Catch:{ Exception -> 0x0192 }
                        r3.put(r6, r5)     // Catch:{ Exception -> 0x0192 }
                    L_0x0192:
                        java.lang.String r5 = "device_platform"
                        java.lang.String r6 = "android"
                        java.lang.String r6 = com.bytedance.common.utility.C9431p.m18667c(r6)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.put(r5, r6)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r5.<init>()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.util.Set r6 = r3.entrySet()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r7 = 0
                    L_0x01ab:
                        boolean r8 = r6.hasNext()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r9 = 1
                        if (r8 == 0) goto L_0x01dc
                        java.lang.Object r8 = r6.next()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.Object r10 = r8.getKey()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r10 = (java.lang.String) r10     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r5.append(r10)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r10 = "="
                        r5.append(r10)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.Object r8 = r8.getValue()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r8 = (java.lang.String) r8     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r5.append(r8)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        int r7 = r7 + r9
                        int r8 = r3.size()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        if (r7 == r8) goto L_0x01ab
                        java.lang.String r8 = "&"
                        r5.append(r8)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        goto L_0x01ab
                    L_0x01dc:
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.<init>()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r6 = r5.toString()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r3.append(r6)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r6 = "device_info_url_salt_650fa7"
                        r3.append(r6)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r4.append(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = "&sign="
                        r4.append(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r5 = "MD5"
                        java.lang.String r3 = com.bytedance.common.utility.C9430o.m18659a(r3, r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r4.append(r3)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r3 = "\""
                        r4.append(r3)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r3 = r4.toString()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        if (r5 != 0) goto L_0x0232
                        byte[] r5 = com.p683ss.android.message.C19488l.m47715a(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r1.write(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        byte[] r5 = r3.getBytes()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        int r5 = r5.length     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        byte[] r5 = com.p683ss.android.message.C19488l.m47715a(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r1.write(r5)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        byte[] r3 = r3.getBytes()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r1.write(r3)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r1.flush()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                    L_0x0232:
                        int r3 = r4.length()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r4.delete(r2, r3)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        com.ss.android.message.g r2 = com.p683ss.android.message.C19479g.this     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        android.content.Context r2 = r2.f53800a     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r2 = com.p683ss.android.message.p1191b.C19470k.m47656b(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r4.append(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        java.lang.String r2 = r4.toString()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        if (r3 != 0) goto L_0x026b
                        byte[] r3 = com.p683ss.android.message.C19488l.m47715a(r9)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r1.write(r3)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        byte[] r3 = r2.getBytes()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        int r3 = r3.length     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        byte[] r3 = com.p683ss.android.message.C19488l.m47715a(r3)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r1.write(r3)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        byte[] r2 = r2.getBytes()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r1.write(r2)     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                        r1.flush()     // Catch:{ Throwable -> 0x027b, all -> 0x0273 }
                    L_0x026b:
                        r0.close()     // Catch:{ IOException -> 0x027e }
                        goto L_0x027e
                    L_0x026f:
                        r0.close()     // Catch:{ IOException -> 0x0272 }
                    L_0x0272:
                        return r13
                    L_0x0273:
                        r13 = move-exception
                    L_0x0274:
                        if (r0 == 0) goto L_0x0279
                        r0.close()     // Catch:{ IOException -> 0x0279 }
                    L_0x0279:
                        throw r13
                    L_0x027a:
                        r0 = r13
                    L_0x027b:
                        if (r0 == 0) goto L_0x027e
                        goto L_0x026b
                    L_0x027e:
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.C19479g.C194801.doInBackground(java.lang.Void[]):java.lang.Void");
                }
            }, new Void[0]);
        }
    }

    public C19479g(NotifyService notifyService) {
        this.f53801b = notifyService;
    }
}
