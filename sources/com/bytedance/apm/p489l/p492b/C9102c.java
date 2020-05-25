package com.bytedance.apm.p489l.p492b;

import com.bytedance.apm.p501q.C9184f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/* renamed from: com.bytedance.apm.l.b.c */
public final class C9102c {
    /* renamed from: a */
    public static LinkedList<C9101b> m18033a(int i) {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder("/proc/");
        sb.append(i);
        sb.append("/task/");
        File[] listFiles = new File(sb.toString()).listFiles();
        LinkedList<C9101b> linkedList = new LinkedList<>();
        int length = listFiles.length;
        BufferedReader bufferedReader2 = null;
        int i2 = 0;
        while (i2 < length) {
            try {
                String path = listFiles[i2].getPath();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(path);
                sb2.append("/stat");
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(sb2.toString())), 1000);
                try {
                    String readLine = bufferedReader.readLine();
                    int lastIndexOf = readLine.lastIndexOf(41);
                    String substring = readLine.substring(0, lastIndexOf);
                    String substring2 = readLine.substring(lastIndexOf + 4);
                    int indexOf = substring.indexOf(40);
                    int intValue = Integer.valueOf(substring.substring(0, indexOf - 1)).intValue();
                    String substring3 = substring.substring(indexOf + 1);
                    String[] split = substring2.split(" ");
                    linkedList.add(new C9101b(intValue, substring3, Long.parseLong(split[10]) + Long.parseLong(split[11]) + Long.parseLong(split[12]) + Long.parseLong(split[13])));
                    C9184f.m18231a(bufferedReader);
                    bufferedReader2 = bufferedReader;
                    i2++;
                } catch (Exception unused) {
                    bufferedReader2 = bufferedReader;
                    C9184f.m18231a(bufferedReader2);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    C9184f.m18231a(bufferedReader);
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                C9184f.m18231a(bufferedReader2);
            } catch (Exception unused3) {
                C9184f.m18231a(bufferedReader2);
                return null;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                C9184f.m18231a(bufferedReader);
                throw th;
            }
        }
        return linkedList;
    }

    /* JADX INFO: used method not loaded: com.bytedance.common.utility.d.b.a(java.io.Closeable):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|19|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r11.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00af, code lost:
        com.bytedance.common.utility.p524d.C9398b.m18586a((java.io.Closeable) r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x00ac */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m18034a(int r10, java.util.List<com.bytedance.apm.p489l.p492b.C9101b> r11, long r12) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "/proc/"
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = "/task/"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.util.ListIterator r11 = r11.listIterator()
            r0 = 0
        L_0x0018:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00bd
            java.lang.Object r1 = r11.next()     // Catch:{ Exception -> 0x00b9, all -> 0x00b4 }
            com.bytedance.apm.l.b.b r1 = (com.bytedance.apm.p489l.p492b.C9101b) r1     // Catch:{ Exception -> 0x00b9, all -> 0x00b4 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x00ac }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x00ac }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00ac }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ac }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x00ac }
            r5.append(r10)     // Catch:{ FileNotFoundException -> 0x00ac }
            int r6 = r1.f24865a     // Catch:{ FileNotFoundException -> 0x00ac }
            r5.append(r6)     // Catch:{ FileNotFoundException -> 0x00ac }
            java.lang.String r6 = "/stat"
            r5.append(r6)     // Catch:{ FileNotFoundException -> 0x00ac }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x00ac }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00ac }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00ac }
            r4 = 1000(0x3e8, float:1.401E-42)
            r2.<init>(r3, r4)     // Catch:{ FileNotFoundException -> 0x00ac }
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            r3 = 41
            int r3 = r0.lastIndexOf(r3)     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            int r3 = r3 + 4
            java.lang.String r0 = r0.substring(r3)     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            java.lang.String r3 = " "
            java.lang.String[] r0 = r0.split(r3)     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            r3 = 10
            r3 = r0[r3]     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            r5 = 11
            r5 = r0[r5]     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            r7 = 0
            long r3 = r3 + r5
            r5 = 12
            r5 = r0[r5]     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            r7 = 0
            long r3 = r3 + r5
            r5 = 13
            r0 = r0[r5]     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            r0 = 0
            long r3 = r3 + r5
            long r5 = r1.f24867c     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            r0 = 0
            long r5 = r3 - r5
            float r0 = (float) r5     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            float r5 = (float) r12     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            float r0 = r0 / r5
            double r5 = (double) r0     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            r7 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x009e
            r1.f24868d = r0     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            r1.f24867c = r3     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
            goto L_0x00a1
        L_0x009e:
            r11.remove()     // Catch:{ Exception -> 0x00aa, all -> 0x00a7 }
        L_0x00a1:
            com.bytedance.common.utility.p524d.C9398b.m18586a(r2)
            r0 = r2
            goto L_0x0018
        L_0x00a7:
            r10 = move-exception
            r0 = r2
            goto L_0x00b5
        L_0x00aa:
            r0 = r2
            goto L_0x00b9
        L_0x00ac:
            r11.remove()     // Catch:{ Exception -> 0x00b9, all -> 0x00b4 }
            com.bytedance.common.utility.p524d.C9398b.m18586a(r0)
            goto L_0x0018
        L_0x00b4:
            r10 = move-exception
        L_0x00b5:
            com.bytedance.common.utility.p524d.C9398b.m18586a(r0)
            throw r10
        L_0x00b9:
            com.bytedance.common.utility.p524d.C9398b.m18586a(r0)
            return
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p489l.p492b.C9102c.m18034a(int, java.util.List, long):void");
    }
}
