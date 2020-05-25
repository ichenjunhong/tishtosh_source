package com.p683ss.android.ugc.effectmanager.common.p2441h;

import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.g */
public final class C48669g {
    /* renamed from: a */
    public static String m105306a(ProviderEffect providerEffect) {
        if (providerEffect.getSticker() == null || providerEffect.getSticker().getUrl() == null) {
            return "";
        }
        return providerEffect.getSticker().getUrl();
    }

    /* renamed from: b */
    public static List<String> m105313b(UrlModel urlModel) {
        if (urlModel == null || m105311a(urlModel)) {
            return new ArrayList();
        }
        return urlModel.getUrlList();
    }

    /* renamed from: a */
    public static boolean m105311a(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m105312a(Effect effect) {
        if (effect != null && !m105311a(effect.getFileUrl())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static List<String> m105307a(List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m105309a(String str, List<Effect> list) {
        if (list != null) {
            for (Effect effect : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(File.separator);
                sb.append(effect.getId());
                sb.append(".zip");
                effect.setZipPath(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(File.separator);
                sb2.append(effect.getId());
                effect.setUnzipPath(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m105310a(List<String> list, List<Effect> list2) {
        if (list2 != null) {
            for (Effect effect : list2) {
                effect.getFileUrl().setUrlList(m105307a(list, effect.getFileUrl().getUri()));
                effect.getIconUrl().setUrlList(m105307a(list, effect.getIconUrl().getUri()));
                if (effect.getHintIcon() != null) {
                    effect.getHintIcon().setUrlList(m105307a(list, effect.getHintIcon().getUri()));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m105308a(String str, String str2, List<Effect> list) {
        if (list != null) {
            for (Effect effect : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(File.separator);
                sb.append(effect.getId());
                sb.append(".zip");
                effect.setZipPath(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(File.separator);
                sb2.append(effect.getId());
                effect.setUnzipPath(sb2.toString());
                effect.setPanel(str2);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|5|(2:6|(3:8|(2:14|42)|15)(1:41))|(2:17|18)|19|20|21) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0053 A[SYNTHETIC, Splitter:B:33:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005a A[SYNTHETIC, Splitter:B:37:0x005a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File m105305a(java.io.InputStream r9, java.lang.String r10, long r11, com.p683ss.android.ugc.effectmanager.common.p2436c.C48625b r13) throws java.io.IOException {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x004a }
            r1.<init>(r10)     // Catch:{ IOException -> 0x004a }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004a }
            r2.<init>(r1)     // Catch:{ IOException -> 0x004a }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r3 = 0
            r4 = 0
        L_0x0011:
            int r5 = r9.read(r0)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r6 = -1
            if (r5 == r6) goto L_0x0039
            int r4 = r4 + r5
            if (r13 == 0) goto L_0x0035
            long r6 = (long) r4     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x0035
            r6 = 0
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0035
            float r6 = (float) r4     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 * r7
            float r7 = (float) r11     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            float r6 = r6 / r7
            r7 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r7
            int r6 = (int) r6     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            r13.mo96205a(r6, r11)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
        L_0x0035:
            r2.write(r0, r3, r5)     // Catch:{ IOException -> 0x0045, all -> 0x0042 }
            goto L_0x0011
        L_0x0039:
            if (r9 == 0) goto L_0x003e
            r9.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r2.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            return r1
        L_0x0042:
            r10 = move-exception
            r0 = r2
            goto L_0x0051
        L_0x0045:
            r11 = move-exception
            r0 = r2
            goto L_0x004b
        L_0x0048:
            r10 = move-exception
            goto L_0x0051
        L_0x004a:
            r11 = move-exception
        L_0x004b:
            com.ss.android.ugc.effectmanager.common.h.i r12 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.f122310a     // Catch:{ all -> 0x0048 }
            r12.mo96260b(r10)     // Catch:{ all -> 0x0048 }
            throw r11     // Catch:{ all -> 0x0048 }
        L_0x0051:
            if (r9 == 0) goto L_0x0058
            r9.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x0058
        L_0x0057:
        L_0x0058:
            if (r0 == 0) goto L_0x005d
            r0.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2441h.C48669g.m105305a(java.io.InputStream, java.lang.String, long, com.ss.android.ugc.effectmanager.common.c.b):java.io.File");
    }
}
