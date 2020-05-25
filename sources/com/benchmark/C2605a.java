package com.benchmark;

import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48675k;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.benchmark.a */
public final class C2605a {
    /* renamed from: a */
    public static void m7549a(Throwable th) {
        C9220a.m18312a(th, "benchmark test");
    }

    /* renamed from: a */
    public static float m7546a(float f) {
        return ((float) Math.floor((double) (f * 100.0f))) / 100.0f;
    }

    /* renamed from: a */
    public static boolean m7550a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        return true;
    }

    /* renamed from: b */
    public static String m7554b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        C17840a.m43751a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static long m7547a(boolean z) {
        File externalStorageDirectory;
        if (z) {
            externalStorageDirectory = Environment.getDataDirectory();
        } else {
            externalStorageDirectory = Environment.getExternalStorageDirectory();
        }
        StatFs statFs = new StatFs(externalStorageDirectory.getPath());
        if (VERSION.SDK_INT >= 18) {
            return statFs.getAvailableBytes();
        }
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    /* renamed from: b */
    public static String m7553b(String str) throws IOException {
        Throwable th;
        File file = new File(str);
        StringBuilder sb = new StringBuilder((int) file.length());
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(scanner.nextLine());
                sb2.append("\n");
                sb.append(sb2.toString());
            } catch (Throwable th2) {
                C17840a.m43752a(th, th2);
            }
        }
        String sb3 = sb.toString();
        scanner.close();
        return sb3;
        throw th;
    }

    /* renamed from: a */
    public static JSONArray m7548a(JSONArray jSONArray, List<Integer> list) throws JSONException {
        Collections.sort(list);
        if (VERSION.SDK_INT >= 19) {
            for (int size = list.size() - 1; size >= 0; size--) {
                jSONArray.remove(((Integer) list.get(size)).intValue());
            }
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (!list.contains(Integer.valueOf(i))) {
                jSONArray2.put(jSONArray.get(i));
            }
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static boolean m7551a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        int indexOf = str2.indexOf("?");
        if (indexOf == -1) {
            return false;
        }
        String substring = str2.substring(indexOf + 1);
        if (TextUtils.isEmpty(substring) || !substring.equalsIgnoreCase(C48675k.m105341a(file))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m7552a(String str, String str2, String str3) {
        try {
            return NetworkUtils.downloadFile(-1, str, str2, null, str3, null, null, null, null, null, null);
        } catch (Exception unused) {
            return false;
        }
    }
}
