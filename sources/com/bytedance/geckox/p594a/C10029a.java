package com.bytedance.geckox.p594a;

import android.content.Context;
import com.bytedance.geckox.C10044b;
import com.bytedance.geckox.model.CheckRequestBodyModel.Channel;
import com.bytedance.geckox.model.CheckRequestBodyModel.Channels;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.p599d.C10064b;
import com.bytedance.geckox.p611i.C10117b;
import com.bytedance.geckox.statistic.model.StatisticModel;
import com.bytedance.geckox.statistic.model.StatisticModel.PackageStatisticModel;
import com.bytedance.geckox.utils.C10151a;
import com.bytedance.geckox.utils.C10162j;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.geckox.a.a */
public final class C10029a {

    /* renamed from: com.bytedance.geckox.a.a$a */
    static class C10031a {

        /* renamed from: a */
        String f27263a;

        /* renamed from: b */
        String f27264b;

        /* renamed from: c */
        int f27265c;

        /* renamed from: d */
        long f27266d;

        /* renamed from: e */
        File f27267e;

        C10031a(String str, String str2, int i, long j, File file) {
            this.f27263a = str;
            this.f27264b = str2;
            this.f27265c = i;
            this.f27266d = j;
            this.f27267e = file;
        }
    }

    /* renamed from: a */
    public static List<PackageStatisticModel> m20185a(Context context) {
        return C10038b.m20195a(context).mo18011a();
    }

    /* renamed from: b */
    public static Map<String, Object> m20188b(C10044b bVar) {
        HashMap hashMap = new HashMap();
        File[] listFiles = bVar.f27293n.listFiles();
        if (listFiles == null) {
            return hashMap;
        }
        for (File file : listFiles) {
            File[] listFiles2 = file.listFiles();
            if (listFiles2 != null) {
                Channels channels = (Channels) hashMap.get(file.getName());
                if (channels == null) {
                    channels = new Channels();
                    hashMap.put(file.getName(), channels);
                }
                for (File file2 : listFiles2) {
                    if (!file2.isFile()) {
                        if (channels.channels.size() > 200) {
                            return hashMap;
                        }
                        String name = file2.getName();
                        if (name.endsWith("--pending-delete")) {
                            name = name.substring(0, name.indexOf("--pending-delete"));
                        }
                        channels.channels.add(new Channel(name));
                    }
                }
                continue;
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m20187a(C10044b bVar) {
        Common common = new Common(bVar.mo18020b(), C10151a.m20473a(bVar.f27280a), bVar.f27289j, C10151a.m20474b(bVar.f27280a), C10162j.m20488a(bVar.f27280a), bVar.f27292m, bVar.f27291l);
        StatisticModel statisticModel = new StatisticModel();
        statisticModel.common = common;
        statisticModel.packages.addAll(m20185a(bVar.f27280a));
        if (!statisticModel.packages.isEmpty()) {
            StringBuilder sb = new StringBuilder("https://");
            sb.append(bVar.f27290k);
            sb.append("/gecko/server/packages/stats");
            String sb2 = sb.toString();
            String b = C10064b.m20295a().f27360a.mo34889b(statisticModel);
            int i = 0;
            while (i < 3) {
                try {
                    if (new JSONObject(bVar.f27284e.mo18094a(sb2, b).f27419b).getInt("status") != 0) {
                        throw new RuntimeException("上传失败");
                    }
                    return;
                } catch (Exception unused) {
                    i++;
                }
            }
            C10117b.m20388a("clean-channel", "上报失败", b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r20 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01af, code lost:
        r0 = r20;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20186a(android.content.Context r24, java.util.Map<java.lang.String, com.bytedance.geckox.model.ComponentModel.C10133b> r25, java.io.File r26, com.bytedance.geckox.p607f.C10105a r27) {
        /*
            if (r25 == 0) goto L_0x01c8
            boolean r1 = r25.isEmpty()
            if (r1 == 0) goto L_0x000a
            goto L_0x01c8
        L_0x000a:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x01b3 }
            r2.<init>()     // Catch:{ Exception -> 0x01b3 }
            java.util.Set r0 = r25.entrySet()     // Catch:{ Exception -> 0x01b3 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x01b3 }
        L_0x0017:
            boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x01b3 }
            if (r3 == 0) goto L_0x01b4
            java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x01b3 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Exception -> 0x01b3 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x01b3 }
            java.io.File r12 = new java.io.File     // Catch:{ Exception -> 0x01b3 }
            r13 = r26
            r12.<init>(r13, r4)     // Catch:{ Exception -> 0x01b3 }
            boolean r5 = r12.isDirectory()     // Catch:{ Exception -> 0x01b3 }
            if (r5 == 0) goto L_0x0017
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x01b3 }
            com.bytedance.geckox.model.ComponentModel$b r3 = (com.bytedance.geckox.model.ComponentModel.C10133b) r3     // Catch:{ Exception -> 0x01b3 }
            if (r3 == 0) goto L_0x0017
            java.util.List<com.bytedance.geckox.model.ComponentModel$a> r5 = r3.f27440a     // Catch:{ Exception -> 0x01b3 }
            if (r5 == 0) goto L_0x0017
            java.util.List<com.bytedance.geckox.model.ComponentModel$a> r5 = r3.f27440a     // Catch:{ Exception -> 0x01b3 }
            boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x01b3 }
            if (r5 != 0) goto L_0x0017
            java.util.List<com.bytedance.geckox.model.ComponentModel$a> r3 = r3.f27440a     // Catch:{ Exception -> 0x01b3 }
            java.util.HashSet r14 = new java.util.HashSet     // Catch:{ Exception -> 0x01b3 }
            r14.<init>()     // Catch:{ Exception -> 0x01b3 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x01b3 }
        L_0x0055:
            boolean r5 = r3.hasNext()     // Catch:{ Exception -> 0x01b3 }
            if (r5 == 0) goto L_0x0017
            java.lang.Object r5 = r3.next()     // Catch:{ Exception -> 0x01b3 }
            com.bytedance.geckox.model.ComponentModel$a r5 = (com.bytedance.geckox.model.ComponentModel.C10132a) r5     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r15 = r5.f27433a     // Catch:{ Exception -> 0x01b3 }
            boolean r6 = r14.contains(r15)     // Catch:{ Exception -> 0x01b3 }
            if (r6 != 0) goto L_0x0055
            r14.add(r15)     // Catch:{ Exception -> 0x01b3 }
            int r11 = r5.f27434b     // Catch:{ Exception -> 0x01b3 }
            java.util.List<java.lang.Long> r9 = r5.f27435c     // Catch:{ Exception -> 0x01b3 }
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x01b3 }
            r10.<init>(r12, r15)     // Catch:{ Exception -> 0x01b3 }
            switch(r11) {
                case 1: goto L_0x0136;
                case 2: goto L_0x00ad;
                case 3: goto L_0x007c;
                default: goto L_0x0078;
            }     // Catch:{ Exception -> 0x01b3 }
        L_0x0078:
            r20 = r0
            goto L_0x01af
        L_0x007c:
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x01b3 }
            r5.<init>(r12, r15)     // Catch:{ Exception -> 0x01b3 }
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x01b3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b3 }
            r6.<init>()     // Catch:{ Exception -> 0x01b3 }
            r6.append(r15)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r7 = "--pending-delete"
            r6.append(r7)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01b3 }
            r9.<init>(r12, r6)     // Catch:{ Exception -> 0x01b3 }
            r5.renameTo(r9)     // Catch:{ Exception -> 0x01b3 }
            com.bytedance.geckox.a.a$a r10 = new com.bytedance.geckox.a.a$a     // Catch:{ Exception -> 0x01b3 }
            r16 = 0
            r5 = r10
            r6 = r4
            r7 = r15
            r8 = r11
            r11 = r9
            r15 = r10
            r9 = r16
            r5.<init>(r6, r7, r8, r9, r11)     // Catch:{ Exception -> 0x01b3 }
            r2.add(r15)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x0078
        L_0x00ad:
            if (r9 == 0) goto L_0x0078
            java.util.List r5 = com.bytedance.geckox.utils.C10166m.m20493b(r10)     // Catch:{ Exception -> 0x01b3 }
            if (r5 == 0) goto L_0x0078
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x01b3 }
            if (r6 != 0) goto L_0x0078
            java.util.Iterator r16 = r5.iterator()     // Catch:{ Exception -> 0x01b3 }
        L_0x00bf:
            boolean r5 = r16.hasNext()     // Catch:{ Exception -> 0x01b3 }
            if (r5 == 0) goto L_0x0055
            java.lang.Object r5 = r16.next()     // Catch:{ Exception -> 0x01b3 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ Exception -> 0x01b3 }
            r6 = 0
            java.lang.Object r6 = r9.get(r6)     // Catch:{ Exception -> 0x01b3 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x01b3 }
            long r6 = r6.longValue()     // Catch:{ Exception -> 0x01b3 }
            long r17 = r5.longValue()     // Catch:{ Exception -> 0x01b3 }
            int r8 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r8 <= 0) goto L_0x0127
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x01b3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b3 }
            r6.<init>()     // Catch:{ Exception -> 0x01b3 }
            r6.append(r5)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r7 = "--pending-delete"
            r6.append(r7)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01b3 }
            r8.<init>(r10, r6)     // Catch:{ Exception -> 0x01b3 }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01b3 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b3 }
            r7.<init>()     // Catch:{ Exception -> 0x01b3 }
            r7.append(r5)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x01b3 }
            r6.<init>(r10, r7)     // Catch:{ Exception -> 0x01b3 }
            r6.renameTo(r8)     // Catch:{ Exception -> 0x01b3 }
            com.bytedance.geckox.a.a$a r7 = new com.bytedance.geckox.a.a$a     // Catch:{ Exception -> 0x01b3 }
            long r17 = r5.longValue()     // Catch:{ Exception -> 0x01b3 }
            r5 = r7
            r6 = r4
            r1 = r7
            r7 = r15
            r19 = r8
            r8 = r11
            r20 = r0
            r0 = r9
            r21 = r10
            r9 = r17
            r17 = r11
            r11 = r19
            r5.<init>(r6, r7, r8, r9, r11)     // Catch:{ Exception -> 0x01b3 }
            r2.add(r1)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x012e
        L_0x0127:
            r20 = r0
            r0 = r9
            r21 = r10
            r17 = r11
        L_0x012e:
            r9 = r0
            r11 = r17
            r0 = r20
            r10 = r21
            goto L_0x00bf
        L_0x0136:
            r20 = r0
            r0 = r9
            r21 = r10
            r17 = r11
            if (r0 == 0) goto L_0x01af
            java.util.List r1 = com.bytedance.geckox.utils.C10166m.m20493b(r21)     // Catch:{ Exception -> 0x01b3 }
            if (r1 == 0) goto L_0x01af
            boolean r5 = r1.isEmpty()     // Catch:{ Exception -> 0x01b3 }
            if (r5 != 0) goto L_0x01af
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x01b3 }
        L_0x014f:
            boolean r5 = r1.hasNext()     // Catch:{ Exception -> 0x01b3 }
            if (r5 == 0) goto L_0x01af
            java.lang.Object r5 = r1.next()     // Catch:{ Exception -> 0x01b3 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ Exception -> 0x01b3 }
            boolean r6 = r0.contains(r5)     // Catch:{ Exception -> 0x01b3 }
            if (r6 == 0) goto L_0x01a6
            java.io.File r11 = new java.io.File     // Catch:{ Exception -> 0x01b3 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b3 }
            r6.<init>()     // Catch:{ Exception -> 0x01b3 }
            r6.append(r5)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r7 = "--pending-delete"
            r6.append(r7)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01b3 }
            r9 = r21
            r11.<init>(r9, r6)     // Catch:{ Exception -> 0x01b3 }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01b3 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b3 }
            r7.<init>()     // Catch:{ Exception -> 0x01b3 }
            r7.append(r5)     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x01b3 }
            r6.<init>(r9, r7)     // Catch:{ Exception -> 0x01b3 }
            r6.renameTo(r11)     // Catch:{ Exception -> 0x01b3 }
            com.bytedance.geckox.a.a$a r10 = new com.bytedance.geckox.a.a$a     // Catch:{ Exception -> 0x01b3 }
            long r21 = r5.longValue()     // Catch:{ Exception -> 0x01b3 }
            r5 = r10
            r6 = r4
            r7 = r15
            r8 = r17
            r23 = r0
            r16 = r9
            r0 = r10
            r9 = r21
            r5.<init>(r6, r7, r8, r9, r11)     // Catch:{ Exception -> 0x01b3 }
            r2.add(r0)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x01aa
        L_0x01a6:
            r23 = r0
            r16 = r21
        L_0x01aa:
            r21 = r16
            r0 = r23
            goto L_0x014f
        L_0x01af:
            r0 = r20
            goto L_0x0055
        L_0x01b3:
            r2 = 0
        L_0x01b4:
            if (r2 != 0) goto L_0x01b7
            return
        L_0x01b7:
            com.bytedance.geckox.utils.f r0 = com.bytedance.geckox.utils.C10157f.m20483a()
            com.bytedance.geckox.a.a$1 r1 = new com.bytedance.geckox.a.a$1
            r3 = r24
            r4 = r27
            r1.<init>(r3, r2, r4)
            r0.execute(r1)
            return
        L_0x01c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.p594a.C10029a.m20186a(android.content.Context, java.util.Map, java.io.File, com.bytedance.geckox.f.a):void");
    }
}
