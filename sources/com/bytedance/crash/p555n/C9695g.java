package com.bytedance.crash.p555n;

import android.text.TextUtils;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p546f.C9587d;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.n.g */
public final class C9695g {
    /* renamed from: a */
    public static boolean m19358a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m19357a(new File(str));
    }

    /* renamed from: a */
    public static boolean m19357a(File file) {
        boolean z = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int i = 0;
            boolean z2 = true;
            while (listFiles != null && i < listFiles.length) {
                z2 = listFiles[i].isFile() ? listFiles[i].canWrite() ? z2 & listFiles[i].delete() : false : z2 & m19357a(listFiles[i]);
                i++;
            }
            z = z2 & file.delete();
        }
        return z;
    }

    /* renamed from: a */
    public static void m19355a(String str, File file) throws Exception {
        ZipOutputStream zipOutputStream = null;
        try {
            new File(str).getParentFile().mkdirs();
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str));
            try {
                m19356a(zipOutputStream2, file, "");
                C9697i.m19370a((Closeable) zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                C9697i.m19370a((Closeable) zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C9697i.m19370a((Closeable) zipOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m19356a(ZipOutputStream zipOutputStream, File file, String str) throws IOException {
        FileInputStream fileInputStream;
        String str2;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/");
            zipOutputStream.putNextEntry(new ZipEntry(sb.toString()));
            if (str.length() == 0) {
                str2 = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("/");
                str2 = sb2.toString();
            }
            for (int i = 0; i < listFiles.length; i++) {
                File file2 = listFiles[i];
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(listFiles[i].getName());
                m19356a(zipOutputStream, file2, sb3.toString());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (-1 != read) {
                        zipOutputStream.write(bArr, 0, read);
                    } else {
                        C9697i.m19370a((Closeable) fileInputStream);
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                C9697i.m19370a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            C9697i.m19370a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: c */
    public static String m19362c(String str) throws IOException {
        return m19350a(str, (String) null);
    }

    /* renamed from: b */
    public static boolean m19360b(File file) {
        String[] list = file.list();
        if (list == null || list.length == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m19366e(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            NativeImpl.m19466a(file2.getAbsolutePath());
        } catch (Throwable th) {
            C9577e.m18999a().mo17384a("NPTH_CATCH", th);
        }
    }

    /* renamed from: b */
    public static JSONArray m19359b(String str) throws IOException {
        BufferedReader bufferedReader = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        JSONArray jSONArray = new JSONArray();
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        jSONArray.put(readLine);
                    } else {
                        C9697i.m19370a((Closeable) bufferedReader2);
                        return jSONArray;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    C9697i.m19370a((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            C9697i.m19370a((Closeable) bufferedReader);
            throw th;
        }
    }

    /* renamed from: d */
    public static C9587d m19364d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(m19362c(str));
            C9587d dVar = new C9587d();
            dVar.f26151a = jSONObject.optString("url");
            dVar.f26152b = jSONObject.optJSONObject("body");
            dVar.f26153c = jSONObject.optString("dump_file");
            dVar.f26154d = jSONObject.optBoolean("encrypt", false);
            return dVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m19367f(File file) {
        if (!file.isFile()) {
            file = new File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            int a = NativeImpl.m19466a(file.getAbsolutePath());
            if (a > 0) {
                NativeImpl.m19465a(a);
                return false;
            }
            if (a < 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9577e.m18999a().mo17384a("NPTH_CATCH", th);
        }
    }

    /* renamed from: e */
    public static C9587d m19365e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(m19362c(str));
            C9587d dVar = new C9587d();
            dVar.f26156f = jSONObject.optString("aid");
            dVar.f26155e = jSONObject.optString("did");
            dVar.f26157g = jSONObject.optString("processName");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("alogFiles");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
                dVar.f26158h = arrayList;
            }
            return dVar;
        } catch (IOException | JSONException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static String[] m19368f(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)), 1000);
            try {
                String readLine = bufferedReader.readLine();
                int indexOf = readLine.indexOf(")");
                if (indexOf > 0) {
                    readLine = readLine.substring(indexOf + 2);
                }
                String[] split = readLine.split(" ");
                C9697i.m19370a((Closeable) bufferedReader);
                return split;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                C9697i.m19370a((Closeable) bufferedReader2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C9697i.m19370a((Closeable) bufferedReader2);
            throw th;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.crash.p546f.C9587d m19361c(java.io.File r9) {
        /*
            com.bytedance.crash.f.a r0 = new com.bytedance.crash.f.a
            r0.<init>()
            r1 = 0
            r2 = 0
        L_0x0007:
            r3 = 6
            if (r2 >= r3) goto L_0x0049
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "."
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r9.getName()
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.io.File r4 = new java.io.File
            r4.<init>(r9, r3)
            boolean r3 = r4.exists()
            if (r3 == 0) goto L_0x0046
            java.lang.String r3 = r4.getAbsolutePath()     // Catch:{ Throwable -> 0x0046 }
            java.lang.String r3 = m19362c(r3)     // Catch:{ Throwable -> 0x0046 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0046 }
            r4.<init>(r3)     // Catch:{ Throwable -> 0x0046 }
            r0.mo17407e(r4)     // Catch:{ Throwable -> 0x0046 }
        L_0x0046:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0049:
            org.json.JSONObject r2 = r0.f26141a
            int r2 = r2.length()
            r3 = 0
            if (r2 != 0) goto L_0x0053
            return r3
        L_0x0053:
            java.lang.String r9 = r9.getName()
            r2 = 95
            int r2 = r9.lastIndexOf(r2)
            r4 = 1
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            org.json.JSONObject r2 = r0.f26141a
            java.lang.String r5 = "header"
            org.json.JSONObject r2 = r2.optJSONObject(r5)
            if (r2 != 0) goto L_0x0084
            android.content.Context r2 = com.bytedance.crash.C9616k.m19154f()
            org.json.JSONObject r5 = r0.f26141a
            java.lang.String r6 = "crash_time"
            r7 = 0
            long r5 = r5.optLong(r6, r7)
            com.bytedance.crash.f.c r2 = com.bytedance.crash.p546f.C9586c.m19048a(r2, r5)
            org.json.JSONObject r2 = r2.f26149a
            r0.mo17402c(r2)
        L_0x0084:
            com.bytedance.crash.p546f.C9586c.m19050a(r2)
            java.lang.String r5 = "unique_key"
            java.lang.String r5 = r2.optString(r5, r3)
            if (r5 != 0) goto L_0x00d0
            java.lang.String r5 = "aid"
            java.lang.String r5 = com.bytedance.crash.p547g.C9590b.m19078b(r5)     // Catch:{ Throwable -> 0x00cf }
            int r5 = com.bytedance.crash.p547g.C9590b.m19081d(r5)     // Catch:{ Throwable -> 0x00cf }
            java.lang.String r6 = "unique_key"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00cf }
            java.lang.String r8 = "android_"
            r7.<init>(r8)     // Catch:{ Throwable -> 0x00cf }
            r7.append(r5)     // Catch:{ Throwable -> 0x00cf }
            java.lang.String r5 = "_"
            r7.append(r5)     // Catch:{ Throwable -> 0x00cf }
            com.bytedance.crash.k.i r5 = com.bytedance.crash.C9616k.m19151c()     // Catch:{ Throwable -> 0x00cf }
            java.lang.String r5 = r5.mo17507a()     // Catch:{ Throwable -> 0x00cf }
            r7.append(r5)     // Catch:{ Throwable -> 0x00cf }
            java.lang.String r5 = "_"
            r7.append(r5)     // Catch:{ Throwable -> 0x00cf }
            r7.append(r9)     // Catch:{ Throwable -> 0x00cf }
            java.lang.String r5 = "_"
            r7.append(r5)     // Catch:{ Throwable -> 0x00cf }
            com.bytedance.crash.d r5 = com.bytedance.crash.C9571d.LAUNCH     // Catch:{ Throwable -> 0x00cf }
            r7.append(r5)     // Catch:{ Throwable -> 0x00cf }
            java.lang.String r5 = r7.toString()     // Catch:{ Throwable -> 0x00cf }
            r2.put(r6, r5)     // Catch:{ Throwable -> 0x00cf }
            goto L_0x00d0
        L_0x00cf:
        L_0x00d0:
            java.lang.String r2 = "crash_type"
            java.lang.String r5 = "step"
            r0.mo17390a(r2, r5)
            com.bytedance.crash.f.d r2 = new com.bytedance.crash.f.d
            r2.<init>()
            org.json.JSONObject r5 = r0.f26141a
            java.lang.String r6 = "data"
            java.lang.Object r5 = r5.opt(r6)
            boolean r6 = r5 instanceof org.json.JSONArray
            if (r6 == 0) goto L_0x00fd
            com.bytedance.crash.k.a r6 = com.bytedance.crash.C9616k.m19147a()
            java.util.Map r6 = r6.mo17446a()
            java.lang.String r6 = com.bytedance.crash.p554m.C9668b.m19292b(r6)
            r2.f26151a = r6
            org.json.JSONArray r5 = (org.json.JSONArray) r5     // Catch:{ JSONException -> 0x010f }
            org.json.JSONObject r1 = r5.getJSONObject(r1)     // Catch:{ JSONException -> 0x010f }
            goto L_0x0110
        L_0x00fd:
            com.bytedance.crash.k.a r1 = com.bytedance.crash.C9616k.m19147a()
            java.util.Map r1 = r1.mo17446a()
            java.lang.String r1 = com.bytedance.crash.p554m.C9668b.m19285a(r1)
            r2.f26151a = r1
            r1 = r5
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{  }
            goto L_0x0110
        L_0x010f:
            r1 = r3
        L_0x0110:
            if (r1 == 0) goto L_0x0117
            java.lang.String r3 = "crash_uuid"
            r1.put(r3, r9)     // Catch:{ JSONException -> 0x0117 }
        L_0x0117:
            org.json.JSONObject r9 = r0.f26141a
            r2.f26152b = r9
            r2.f26154d = r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p555n.C9695g.m19361c(java.io.File):com.bytedance.crash.f.d");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0152 A[Catch:{ Throwable -> 0x0155 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02ce A[Catch:{ Throwable -> 0x02f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02d1 A[Catch:{ Throwable -> 0x02f9 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.crash.p546f.C9587d m19363d(java.io.File r18) {
        /*
            com.bytedance.crash.f.a r1 = new com.bytedance.crash.f.a
            r1.<init>()
            java.lang.String r0 = r18.getName()
            r2 = 95
            int r2 = r0.lastIndexOf(r2)
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r2 = r0.substring(r2)
            java.lang.String r4 = "oom"
            boolean r4 = r0.startsWith(r4)
            java.lang.String r5 = "_"
            java.lang.String[] r0 = r0.split(r5)
            int r5 = r0.length
            r6 = 3
            if (r5 <= r6) goto L_0x0030
            r5 = r0[r3]
            java.lang.Long r5 = java.lang.Long.decode(r5)
            long r7 = r5.longValue()
            goto L_0x0032
        L_0x0030:
            r7 = 0
        L_0x0032:
            r5 = 2
            r0 = r0[r5]
            java.lang.String r9 = "launch"
            boolean r9 = r0.startsWith(r9)
            boolean r0 = r18.exists()
            if (r0 == 0) goto L_0x0124
            java.lang.String r0 = r18.getAbsolutePath()     // Catch:{ IOException -> 0x004c }
            java.lang.String r11 = "\n"
            java.lang.String r0 = m19350a(r0, r11)     // Catch:{ IOException -> 0x004c }
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 == 0) goto L_0x005d
            if (r4 == 0) goto L_0x0059
            java.lang.String r0 = "InvalidStack.NoStackAvailable: 确实发生了崩溃, 但无可用堆栈信息, 是OOM.\n"
            goto L_0x012b
        L_0x0059:
            java.lang.String r0 = "InvalidStack.NoStackAvailable: 确实发生了崩溃, 但无可用堆栈信息, 且不是OOM.\n"
            goto L_0x012b
        L_0x005d:
            java.lang.String r11 = "\n"
            java.lang.String[] r0 = r0.split(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            int r13 = r0.length
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0072:
            if (r15 >= r13) goto L_0x0093
            r10 = r0[r15]
            java.lang.String r6 = "stack:"
            boolean r6 = r10.startsWith(r6)
            if (r6 == 0) goto L_0x0081
            r16 = 1
            goto L_0x008f
        L_0x0081:
            if (r16 == 0) goto L_0x008c
            r12.append(r10)
            java.lang.String r6 = "\n"
            r12.append(r6)
            goto L_0x008f
        L_0x008c:
            r11.add(r10)
        L_0x008f:
            int r15 = r15 + 1
            r6 = 3
            goto L_0x0072
        L_0x0093:
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x00a1
            java.lang.Object r0 = r11.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            goto L_0x00a2
        L_0x00a1:
            r10 = 0
        L_0x00a2:
            int r0 = r11.size()
            if (r0 < r5) goto L_0x00af
            java.lang.Object r0 = r11.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            int r6 = r11.size()
            r13 = 3
            if (r6 < r13) goto L_0x00be
            java.lang.Object r5 = r11.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x00bf
        L_0x00be:
            r5 = 0
        L_0x00bf:
            int r6 = r11.size()
            r14 = 4
            if (r6 < r14) goto L_0x00cf
            java.lang.Object r6 = r11.get(r13)
            java.lang.String r6 = (java.lang.String) r6
            r17 = r6
            goto L_0x00d1
        L_0x00cf:
            r17 = 0
        L_0x00d1:
            if (r16 == 0) goto L_0x00de
            int r6 = r12.length()
            if (r6 <= 0) goto L_0x00de
            java.lang.String r0 = r12.toString()
            goto L_0x0121
        L_0x00de:
            if (r5 == 0) goto L_0x00fc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "\nCaused by: "
            r0.append(r5)
            if (r4 == 0) goto L_0x00f2
            java.lang.String r5 = "InvalidStack.NoStackAvailable: 确实发生了崩溃, 但无可用堆栈信息, 是OOM.\n"
            goto L_0x00f4
        L_0x00f2:
            java.lang.String r5 = "InvalidStack.NoStackAvailable: 确实发生了崩溃, 但无可用堆栈信息, 且不是OOM.\n"
        L_0x00f4:
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            goto L_0x0121
        L_0x00fc:
            if (r0 == 0) goto L_0x011a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = "\nCaused by: "
            r5.append(r0)
            if (r4 == 0) goto L_0x0110
            java.lang.String r0 = "InvalidStack.NoStackAvailable: 确实发生了崩溃, 但无可用堆栈信息, 是OOM.\n"
            goto L_0x0112
        L_0x0110:
            java.lang.String r0 = "InvalidStack.NoStackAvailable: 确实发生了崩溃, 但无可用堆栈信息, 且不是OOM.\n"
        L_0x0112:
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            goto L_0x0121
        L_0x011a:
            if (r4 == 0) goto L_0x011f
            java.lang.String r0 = "InvalidStack.NoStackAvailable: 确实发生了崩溃, 但无可用堆栈信息, 是OOM.\n"
            goto L_0x0121
        L_0x011f:
            java.lang.String r0 = "InvalidStack.NoStackAvailable: 确实发生了崩溃, 但无可用堆栈信息, 且不是OOM.\n"
        L_0x0121:
            r5 = r17
            goto L_0x012d
        L_0x0124:
            if (r4 == 0) goto L_0x0129
            java.lang.String r0 = "InvalidStack.NoStackAvailable: 确实发生了崩溃, 但无可用堆栈信息, 是OOM.\n"
            goto L_0x012b
        L_0x0129:
            java.lang.String r0 = "InvalidStack.NoStackAvailable: 确实发生了崩溃, 但无可用堆栈信息, 且不是OOM.\n"
        L_0x012b:
            r5 = 0
            r10 = 0
        L_0x012d:
            android.content.Context r6 = com.bytedance.crash.C9616k.m19154f()
            com.bytedance.crash.f.c r6 = com.bytedance.crash.p546f.C9586c.m19048a(r6, r7)
            org.json.JSONObject r11 = r6.f26149a
            java.lang.String r12 = "aid"
            java.lang.String r12 = com.bytedance.crash.p547g.C9590b.m19078b(r12)
            int r12 = com.bytedance.crash.p547g.C9590b.m19081d(r12)
            java.io.File r13 = new java.io.File
            java.lang.String r14 = r18.getParent()
            java.lang.String r15 = "logcat.txt"
            r13.<init>(r14, r15)
            boolean r14 = r13.exists()     // Catch:{ Throwable -> 0x0155 }
            if (r14 == 0) goto L_0x0155
            r13.delete()     // Catch:{ Throwable -> 0x0155 }
        L_0x0155:
            if (r9 == 0) goto L_0x0212
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r15 = "stack"
            r14.put(r15, r0)     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r0 = "process_name"
            r14.put(r0, r10)     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r0 = "crash_thread_name"
            r14.put(r0, r5)     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r0 = "crash_time"
            r14.put(r0, r7)     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r0 = "isOOM"
            r14.put(r0, r4)     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r0 = "crash_uuid"
            r14.put(r0, r2)     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r0 = "event_type"
            java.lang.String r4 = "start_crash"
            r14.put(r0, r4)     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r0 = "logcat"
            java.io.File r4 = r13.getParentFile()     // Catch:{ Throwable -> 0x0202 }
            org.json.JSONArray r4 = com.bytedance.crash.p551k.C9644d.m19235a(r4)     // Catch:{ Throwable -> 0x0202 }
            r14.put(r0, r4)     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r0 = "launch_did"
            android.content.Context r4 = com.bytedance.crash.C9616k.m19154f()     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r4 = com.bytedance.crash.p550j.C9613a.m19141a(r4)     // Catch:{ Throwable -> 0x0202 }
            r14.put(r0, r4)     // Catch:{ Throwable -> 0x0202 }
            android.content.Context r0 = com.bytedance.crash.C9616k.m19154f()     // Catch:{ Throwable -> 0x0202 }
            org.json.JSONObject r0 = com.bytedance.crash.p555n.C9715u.m19452a(r0)     // Catch:{ Throwable -> 0x0202 }
            com.bytedance.crash.p546f.C9584a.m19016a(r14, r0)     // Catch:{ Throwable -> 0x0202 }
            org.json.JSONObject r0 = r6.f26149a     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r4 = "unique_key"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r7 = "android_"
            r5.<init>(r7)     // Catch:{ Throwable -> 0x0202 }
            r5.append(r12)     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r7 = "_"
            r5.append(r7)     // Catch:{ Throwable -> 0x0202 }
            com.bytedance.crash.k.i r7 = com.bytedance.crash.C9616k.m19151c()     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r7 = r7.mo17507a()     // Catch:{ Throwable -> 0x0202 }
            r5.append(r7)     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r7 = "_"
            r5.append(r7)     // Catch:{ Throwable -> 0x0202 }
            r5.append(r2)     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r2 = "_"
            r5.append(r2)     // Catch:{ Throwable -> 0x0202 }
            com.bytedance.crash.d r2 = com.bytedance.crash.C9571d.LAUNCH     // Catch:{ Throwable -> 0x0202 }
            r5.append(r2)     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r2 = r5.toString()     // Catch:{ Throwable -> 0x0202 }
            r0.put(r4, r2)     // Catch:{ Throwable -> 0x0202 }
            java.lang.String r0 = "filters"
            java.lang.String r2 = "crash_type"
            java.lang.String r4 = "simple"
            com.bytedance.crash.p546f.C9584a.m19013a(r14, r0, r2, r4)     // Catch:{ Throwable -> 0x0202 }
            boolean r0 = com.bytedance.crash.p546f.C9586c.m19055c(r11)     // Catch:{ Throwable -> 0x0202 }
            if (r0 == 0) goto L_0x01f5
            java.lang.String r0 = "filters"
            java.lang.String r2 = "unauthentic_version"
            java.lang.String r4 = "unauthentic_version"
            com.bytedance.crash.p546f.C9584a.m19013a(r14, r0, r2, r4)     // Catch:{ Throwable -> 0x0202 }
        L_0x01f5:
            java.lang.String r0 = com.bytedance.crash.p546f.C9586c.m19057d(r11)     // Catch:{ Throwable -> 0x0202 }
            if (r0 == 0) goto L_0x0202
            java.lang.String r2 = "filters"
            java.lang.String r4 = "dex_err_manifest"
            com.bytedance.crash.p546f.C9584a.m19013a(r14, r2, r4, r0)     // Catch:{ Throwable -> 0x0202 }
        L_0x0202:
            java.lang.String r0 = "data"
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            org.json.JSONArray r2 = r2.put(r14)
            r1.mo17395a(r0, r2)
            goto L_0x02bc
        L_0x0212:
            java.lang.String r14 = "data"
            r1.mo17395a(r14, r0)
            java.lang.String r0 = "process_name"
            r1.mo17395a(r0, r10)
            java.lang.String r0 = "crash_thread_name"
            r1.mo17395a(r0, r5)
            java.lang.String r0 = "crash_time"
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r1.mo17395a(r0, r5)
            java.lang.String r0 = "isOOM"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.mo17395a(r0, r4)
            java.lang.String r0 = "crash_uuid"
            r1.mo17395a(r0, r2)
            java.lang.String r0 = "logcat"
            java.io.File r4 = r13.getParentFile()
            org.json.JSONArray r4 = com.bytedance.crash.p551k.C9644d.m19235a(r4)
            r1.mo17395a(r0, r4)
            android.content.Context r0 = com.bytedance.crash.C9616k.m19154f()
            org.json.JSONObject r0 = com.bytedance.crash.p555n.C9715u.m19452a(r0)
            r1.mo17404d(r0)
            java.lang.String r0 = "isJava"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.mo17395a(r0, r4)
            java.lang.String r0 = "launch_did"
            android.content.Context r4 = com.bytedance.crash.C9616k.m19154f()
            java.lang.String r4 = com.bytedance.crash.p550j.C9613a.m19141a(r4)
            r1.mo17395a(r0, r4)
            java.lang.String r0 = "crash_type"
            java.lang.String r4 = "simple"
            r1.mo17390a(r0, r4)
            boolean r0 = com.bytedance.crash.p546f.C9586c.m19055c(r11)
            if (r0 == 0) goto L_0x027a
            java.lang.String r0 = "unauthentic_version"
            java.lang.String r4 = "unauthentic_version"
            r1.mo17390a(r0, r4)
        L_0x027a:
            java.lang.String r0 = com.bytedance.crash.p546f.C9586c.m19057d(r11)
            if (r0 == 0) goto L_0x0285
            java.lang.String r4 = "dex_err_manifest"
            r1.mo17390a(r4, r0)
        L_0x0285:
            org.json.JSONObject r0 = r6.f26149a     // Catch:{ Throwable -> 0x02bc }
            java.lang.String r4 = "unique_key"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02bc }
            java.lang.String r7 = "android_"
            r5.<init>(r7)     // Catch:{ Throwable -> 0x02bc }
            r5.append(r12)     // Catch:{ Throwable -> 0x02bc }
            java.lang.String r7 = "_"
            r5.append(r7)     // Catch:{ Throwable -> 0x02bc }
            com.bytedance.crash.k.i r7 = com.bytedance.crash.C9616k.m19151c()     // Catch:{ Throwable -> 0x02bc }
            java.lang.String r7 = r7.mo17507a()     // Catch:{ Throwable -> 0x02bc }
            r5.append(r7)     // Catch:{ Throwable -> 0x02bc }
            java.lang.String r7 = "_"
            r5.append(r7)     // Catch:{ Throwable -> 0x02bc }
            r5.append(r2)     // Catch:{ Throwable -> 0x02bc }
            java.lang.String r2 = "_"
            r5.append(r2)     // Catch:{ Throwable -> 0x02bc }
            com.bytedance.crash.d r2 = com.bytedance.crash.C9571d.JAVA     // Catch:{ Throwable -> 0x02bc }
            r5.append(r2)     // Catch:{ Throwable -> 0x02bc }
            java.lang.String r2 = r5.toString()     // Catch:{ Throwable -> 0x02bc }
            r0.put(r4, r2)     // Catch:{ Throwable -> 0x02bc }
        L_0x02bc:
            r1.mo17387a(r6)
            java.lang.String r0 = "sdk_version"
            java.lang.String r2 = "3.1.2-rc.1-oversea"
            r1.mo17390a(r0, r2)     // Catch:{ Throwable -> 0x02f9 }
            java.lang.String r0 = "is_root"
            boolean r2 = com.bytedance.crash.nativecrash.C9721c.m19482k()     // Catch:{ Throwable -> 0x02f9 }
            if (r2 == 0) goto L_0x02d1
            java.lang.String r2 = "true"
            goto L_0x02d3
        L_0x02d1:
            java.lang.String r2 = "false"
        L_0x02d3:
            r1.mo17390a(r0, r2)     // Catch:{ Throwable -> 0x02f9 }
            r1.mo17400b()     // Catch:{ Throwable -> 0x02f9 }
            java.lang.String r0 = "has_meminfo_file"
            org.json.JSONObject r2 = r1.f26141a     // Catch:{ Throwable -> 0x02f9 }
            boolean r2 = com.bytedance.crash.p546f.C9584a.m19017a(r2)     // Catch:{ Throwable -> 0x02f9 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x02f9 }
            r1.mo17390a(r0, r2)     // Catch:{ Throwable -> 0x02f9 }
            java.lang.String r0 = "memory_leak"
            boolean r2 = r1.mo17405d()     // Catch:{ Throwable -> 0x02f9 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x02f9 }
            r1.mo17390a(r0, r2)     // Catch:{ Throwable -> 0x02f9 }
            r1.mo17403c()     // Catch:{ Throwable -> 0x02f9 }
            goto L_0x0303
        L_0x02f9:
            r0 = move-exception
            com.bytedance.crash.f r2 = com.bytedance.crash.C9577e.m18999a()
            java.lang.String r4 = "NPTH_CATCH"
            r2.mo17384a(r4, r0)
        L_0x0303:
            com.bytedance.crash.f.d r0 = new com.bytedance.crash.f.d
            r0.<init>()
            if (r9 == 0) goto L_0x0319
            com.bytedance.crash.k.a r2 = com.bytedance.crash.C9616k.m19147a()
            java.util.Map r2 = r2.mo17446a()
            java.lang.String r2 = com.bytedance.crash.p554m.C9668b.m19292b(r2)
            r0.f26151a = r2
            goto L_0x0327
        L_0x0319:
            com.bytedance.crash.k.a r2 = com.bytedance.crash.C9616k.m19147a()
            java.util.Map r2 = r2.mo17446a()
            java.lang.String r2 = com.bytedance.crash.p554m.C9668b.m19285a(r2)
            r0.f26151a = r2
        L_0x0327:
            org.json.JSONObject r1 = r1.f26141a
            r0.f26152b = r1
            r0.f26154d = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p555n.C9695g.m19363d(java.io.File):com.bytedance.crash.f.d");
    }

    /* renamed from: a */
    public static void m19354a(OutputStream outputStream, File file) throws IOException {
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStream);
            try {
                m19356a(zipOutputStream2, file, "");
                C9697i.m19370a((Closeable) zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                C9697i.m19370a((Closeable) zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C9697i.m19370a((Closeable) zipOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m19350a(String str, String str2) throws IOException {
        BufferedReader bufferedReader = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        if (str2 != null) {
                            sb.append(str2);
                        }
                    } else {
                        C9697i.m19370a((Closeable) bufferedReader2);
                        return sb.toString();
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    C9697i.m19370a((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            C9697i.m19370a((Closeable) bufferedReader);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m19351a(File file, File file2) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            file2.getParentFile().mkdirs();
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Exception unused) {
                C9697i.m19370a((Closeable) fileInputStream);
                C9697i.m19370a((Closeable) fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                C9697i.m19370a((Closeable) fileInputStream);
                C9697i.m19370a((Closeable) fileOutputStream2);
                throw th;
            }
            try {
                byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        C9697i.m19370a((Closeable) fileInputStream);
                        C9697i.m19370a((Closeable) fileOutputStream);
                        return;
                    }
                }
            } catch (Exception unused2) {
                fileOutputStream2 = fileOutputStream;
                C9697i.m19370a((Closeable) fileInputStream);
                C9697i.m19370a((Closeable) fileOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                C9697i.m19370a((Closeable) fileInputStream);
                C9697i.m19370a((Closeable) fileOutputStream2);
                throw th;
            }
        } catch (Exception unused3) {
            fileInputStream = null;
            C9697i.m19370a((Closeable) fileInputStream);
            C9697i.m19370a((Closeable) fileOutputStream2);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            C9697i.m19370a((Closeable) fileInputStream);
            C9697i.m19370a((Closeable) fileOutputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m19352a(File file, String str, boolean z) throws IOException {
        FileOutputStream fileOutputStream;
        if (!TextUtils.isEmpty(str)) {
            file.getParentFile().mkdirs();
            try {
                fileOutputStream = new FileOutputStream(file, z);
                try {
                    fileOutputStream.write(str.getBytes());
                    fileOutputStream.flush();
                    C9697i.m19370a((Closeable) fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    C9697i.m19370a((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                C9697i.m19370a((Closeable) fileOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m19353a(File file, JSONObject jSONObject, boolean z) throws IOException {
        if (jSONObject != null) {
            file.getParentFile().mkdirs();
            BufferedWriter bufferedWriter = null;
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
                try {
                    C9699k.m19382a(jSONObject, (Writer) bufferedWriter2);
                    C9697i.m19370a((Closeable) bufferedWriter2);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    C9697i.m19370a((Closeable) bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C9697i.m19370a((Closeable) bufferedWriter);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static String m19349a(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        return m19348a(file, str, str2, jSONObject, (String) null, z);
    }

    /* renamed from: a */
    public static String m19347a(File file, String str, String str2, String str3, String str4, List<String> list) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aid", str3);
            jSONObject.put("did", str2);
            jSONObject.put("processName", str4);
            jSONObject.put("alogFiles", new JSONArray(list));
            m19353a(file2, jSONObject, false);
        } catch (IOException | JSONException unused) {
        }
        return file2.getAbsolutePath();
    }

    /* renamed from: a */
    private static String m19348a(File file, String str, String str2, JSONObject jSONObject, String str3, boolean z) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            jSONObject2.put("dump_file", "");
            jSONObject2.put("encrypt", z);
            m19353a(file2, jSONObject2, false);
        } catch (IOException | JSONException unused) {
        }
        return file2.getAbsolutePath();
    }
}
