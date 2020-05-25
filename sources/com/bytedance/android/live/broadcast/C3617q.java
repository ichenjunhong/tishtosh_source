package com.bytedance.android.live.broadcast;

import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.content.res.AssetManager;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.C2592c;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3895i;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.bytedance.android.live.broadcast.q */
public enum C3617q {
    INST;
    

    /* renamed from: d */
    private static final String f10296d = null;

    /* renamed from: e */
    private static final String f10297e = null;

    /* renamed from: f */
    private static final String f10298f = null;

    /* renamed from: g */
    private static final String f10299g = null;

    /* renamed from: h */
    private static final String f10300h = null;

    /* renamed from: i */
    private static final String f10301i = null;

    /* renamed from: j */
    private static final String f10302j = null;

    /* renamed from: k */
    private static final String f10303k = null;

    /* renamed from: l */
    private static final String f10304l = null;

    /* renamed from: m */
    private static final String f10305m = null;

    /* renamed from: n */
    private static final String f10306n = null;

    /* renamed from: o */
    private static final String f10307o = null;

    /* renamed from: p */
    private static final String[] f10308p = null;

    /* renamed from: q */
    private static final String[] f10309q = null;

    /* renamed from: r */
    private static final String[] f10310r = null;

    /* renamed from: s */
    private static String f10311s;

    /* renamed from: a */
    final Map<String, Object> f10313a;

    /* renamed from: b */
    String f10314b;

    /* renamed from: c */
    boolean f10315c;
    public C0198r<Boolean> isLoadedRes;

    public final String getLastTimeFailedReason() {
        return this.f10314b;
    }

    public final String getBeautyComposerFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(f10311s);
        sb.append(f10301i);
        return sb.toString();
    }

    public final String getBeautyFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(f10311s);
        sb.append(f10299g);
        String sb2 = sb.toString();
        if (C3895i.m9849a(sb2)) {
            return sb2;
        }
        return "";
    }

    public final String getFaceReshapeFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(f10311s);
        sb.append(f10303k);
        return sb.toString();
    }

    public final String getFilterFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(f10311s);
        sb.append(f10298f);
        return sb.toString();
    }

    public final String getLiveComposerFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(f10311s);
        sb.append(f10297e);
        return sb.toString();
    }

    public final String getModelFilePath() {
        if (((IHostPlugin) C4116c.m10249a(IHostPlugin.class)).getHostModeFilePath() != null) {
            return ((IHostPlugin) C4116c.m10249a(IHostPlugin.class)).getHostModeFilePath();
        }
        return f10311s;
    }

    public final String getROIResPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(f10311s);
        sb.append(f10307o);
        return sb.toString();
    }

    public final String getReshapeComposerFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(f10311s);
        sb.append(f10304l);
        return sb.toString();
    }

    public final boolean isLoadedRes() {
        if (this.isLoadedRes.getValue() == null) {
            this.isLoadedRes.setValue(Boolean.valueOf("0.0.20".equals(C4525b.f12435i.mo10345a())));
        }
        return ((Boolean) this.isLoadedRes.getValue()).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void loadResources() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f10315c     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return
        L_0x0007:
            java.lang.String r0 = "0.0.20"
            com.bytedance.android.livesdk.ad.c<java.lang.String> r1 = com.bytedance.android.livesdk.p272ad.C4525b.f12435i     // Catch:{ all -> 0x0077 }
            java.lang.Object r1 = r1.mo10345a()     // Catch:{ all -> 0x0077 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0077 }
            r1 = 1
            if (r0 == 0) goto L_0x0046
            android.arch.lifecycle.r<java.lang.Boolean> r0 = r5.isLoadedRes     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x002c
            android.arch.lifecycle.r<java.lang.Boolean> r0 = r5.isLoadedRes     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0077 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0077 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0044
        L_0x002c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0077 }
            c.a.v r0 = p064c.p065a.C2201v.m6614b(r0)     // Catch:{ all -> 0x0077 }
            c.a.ac r1 = p064c.p065a.p066a.p068b.C1667a.m5940a()     // Catch:{ all -> 0x0077 }
            c.a.v r0 = r0.mo6514a(r1)     // Catch:{ all -> 0x0077 }
            com.bytedance.android.live.broadcast.r r1 = new com.bytedance.android.live.broadcast.r     // Catch:{ all -> 0x0077 }
            r1.<init>(r5)     // Catch:{ all -> 0x0077 }
            r0.mo6545f(r1)     // Catch:{ all -> 0x0077 }
        L_0x0044:
            monitor-exit(r5)
            return
        L_0x0046:
            r5.f10315c = r1     // Catch:{ all -> 0x0077 }
            com.bytedance.android.live.broadcast.s r0 = new com.bytedance.android.live.broadcast.s     // Catch:{ all -> 0x0077 }
            r0.<init>(r5)     // Catch:{ all -> 0x0077 }
            c.a.h r0 = p064c.p065a.C2149h.m6452a(r0)     // Catch:{ all -> 0x0077 }
            c.a.ac r1 = p064c.p065a.p093k.C2168a.m6521b()     // Catch:{ all -> 0x0077 }
            c.a.h r0 = r0.mo6452b(r1)     // Catch:{ all -> 0x0077 }
            c.a.ac r1 = p064c.p065a.p066a.p068b.C1667a.m5940a()     // Catch:{ all -> 0x0077 }
            c.a.h r0 = r0.mo6443a(r1)     // Catch:{ all -> 0x0077 }
            com.bytedance.android.live.broadcast.t r1 = new com.bytedance.android.live.broadcast.t     // Catch:{ all -> 0x0077 }
            r1.<init>(r5)     // Catch:{ all -> 0x0077 }
            com.bytedance.android.live.broadcast.u r2 = new com.bytedance.android.live.broadcast.u     // Catch:{ all -> 0x0077 }
            r2.<init>(r5)     // Catch:{ all -> 0x0077 }
            com.bytedance.android.live.broadcast.v r3 = new com.bytedance.android.live.broadcast.v     // Catch:{ all -> 0x0077 }
            r3.<init>(r5)     // Catch:{ all -> 0x0077 }
            c.a.e.e.b.m$a r4 = p064c.p065a.p072e.p077e.p079b.C1828m.C1829a.INSTANCE     // Catch:{ all -> 0x0077 }
            r0.mo6439a(r1, r2, r3, r4)     // Catch:{ all -> 0x0077 }
            monitor-exit(r5)
            return
        L_0x0077:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.C3617q.loadResources():void");
    }

    static {
        f10296d = C3922z.m9903a((int) R.string.ero);
        f10297e = C3922z.m9903a((int) R.string.ern);
        f10303k = C3922z.m9903a((int) R.string.ers);
        f10306n = C3922z.m9903a((int) R.string.ert);
        f10298f = C3922z.m9903a((int) R.string.erv);
        f10299g = C3922z.m9903a((int) R.string.eri);
        f10300h = C3922z.m9903a((int) R.string.erl);
        f10302j = C3922z.m9903a((int) R.string.erg);
        f10301i = C3922z.m9903a((int) R.string.erf);
        f10304l = C3922z.m9903a((int) R.string.erx);
        f10305m = C3922z.m9903a((int) R.string.erz);
        f10307o = C3922z.m9903a((int) R.string.es0);
        String[] f = C3922z.m9917f(R.array.aj);
        f10308p = new String[f.length];
        for (int i = 0; i < f.length; i++) {
            String[] strArr = f10308p;
            StringBuilder sb = new StringBuilder();
            sb.append(f[i]);
            sb.append(".zip");
            strArr[i] = sb.toString();
        }
        f10309q = C3922z.m9917f(R.array.ak);
        f10310r = C3922z.m9917f(R.array.an);
        File dir = C3922z.m9915e().getDir(f10296d, 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dir.getAbsolutePath());
        sb2.append(File.separator);
        f10311s = sb2.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo8985a() {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        AssetManager assets = C3922z.m9915e().getAssets();
        boolean z = true;
        for (String str : f10308p) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(f10311s);
                sb.append(File.separator);
                sb.append(str);
                m9444a(assets, str, sb.toString());
            } catch (IOException e) {
                this.f10313a.put("copy_res_file_error", e.toString());
                C3831a.m9714b("LiveCameraResManager", (Throwable) e);
                z = false;
            }
        }
        for (String str2 : f10309q) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f10311s);
                sb2.append(File.separator);
                sb2.append(str2);
                m9445b(assets, str2, sb2.toString());
            } catch (IOException e2) {
                this.f10313a.put("copy_res_folder_error", e2.toString());
                C3831a.m9714b("LiveCameraResManager", (Throwable) e2);
                z = false;
            }
        }
        for (String str3 : f10310r) {
            try {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f10311s);
                sb3.append(File.separator);
                sb3.append(str3);
                m9444a(assets, str3, sb3.toString());
            } catch (IOException e3) {
                this.f10313a.put("copy_res_file_error", e3.toString());
                C3831a.m9714b("LiveCameraResManager", (Throwable) e3);
                z = false;
            }
        }
        for (String str4 : f10308p) {
            try {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(f10311s);
                sb4.append(str4);
                C3895i.m9846a(sb4.toString(), f10311s);
            } catch (IOException e4) {
                this.f10313a.put("unzip_res_file_error", e4.toString());
                C3831a.m9714b("LiveCameraResManager", (Throwable) e4);
                z = false;
            }
        }
        return z;
    }

    public final C2592c getResourceFinder(Context context) {
        C2592c resourceFinder = ((IHostContext) C4116c.m10249a(IHostContext.class)).getResourceFinder();
        if (resourceFinder == null) {
            return new AssetResourceFinder(context.getAssets(), INST.getModelFilePath());
        }
        return resourceFinder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m9444a(android.content.res.AssetManager r3, java.lang.String r4, java.lang.String r5) throws java.io.IOException {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 0
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ all -> 0x0058 }
            okio.Source r4 = okio.Okio.source(r3)     // Catch:{ all -> 0x0053 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x004f }
            r1.<init>(r5)     // Catch:{ all -> 0x004f }
            boolean r5 = r1.exists()     // Catch:{ all -> 0x004f }
            if (r5 == 0) goto L_0x001e
            r1.delete()     // Catch:{ all -> 0x004f }
        L_0x001e:
            okio.Sink r5 = okio.Okio.sink(r1)     // Catch:{ all -> 0x004f }
            okio.BufferedSink r1 = okio.Okio.buffer(r5)     // Catch:{ all -> 0x0049 }
            r1.writeAll(r4)     // Catch:{ all -> 0x0042 }
            r1.flush()     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            if (r5 == 0) goto L_0x0036
            r5.close()
        L_0x0036:
            if (r4 == 0) goto L_0x003b
            r4.close()
        L_0x003b:
            if (r3 == 0) goto L_0x0041
            r3.close()
            return
        L_0x0041:
            return
        L_0x0042:
            r0 = move-exception
            r2 = r1
            r1 = r3
            r3 = r5
            r5 = r0
            r0 = r2
            goto L_0x005c
        L_0x0049:
            r1 = move-exception
            r2 = r1
            r1 = r3
            r3 = r5
            r5 = r2
            goto L_0x005c
        L_0x004f:
            r5 = move-exception
            r1 = r3
            r3 = r0
            goto L_0x005c
        L_0x0053:
            r5 = move-exception
            r1 = r3
            r3 = r0
            r4 = r3
            goto L_0x005c
        L_0x0058:
            r5 = move-exception
            r3 = r0
            r4 = r3
            r1 = r4
        L_0x005c:
            if (r0 == 0) goto L_0x0061
            r0.close()
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            r3.close()
        L_0x0066:
            if (r4 == 0) goto L_0x006b
            r4.close()
        L_0x006b:
            if (r1 == 0) goto L_0x0070
            r1.close()
        L_0x0070:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.C3617q.m9444a(android.content.res.AssetManager, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    private void m9445b(AssetManager assetManager, String str, String str2) throws IOException {
        String[] list = assetManager.list(str);
        if (list.length > 0) {
            new File(str2).mkdirs();
            for (String str3 : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(File.separator);
                sb.append(str3);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(File.separator);
                sb3.append(str3);
                m9445b(assetManager, sb2, sb3.toString());
            }
            return;
        }
        m9444a(assetManager, str, str2);
    }
}
