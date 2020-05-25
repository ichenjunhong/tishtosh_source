package com.bytedance.apm.p501q;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStats.Bucket;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Process;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.p485h.C9046h;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.apm.q.q */
public final class C9201q {

    /* renamed from: a */
    private static volatile int f25173a = -1;

    /* renamed from: a */
    public static boolean m18282a() {
        if (VERSION.SDK_INT <= 22 || VERSION.SDK_INT >= 28 || C0726c.m2090a(C8976c.m17736a(), "android.permission.READ_PHONE_STATE") != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static C9046h m18283b() {
        if (VERSION.SDK_INT >= 28) {
            return null;
        }
        int myUid = Process.myUid();
        List a = m18281a(new File("/proc/net/xt_qtaguid/stats"), "utf-8");
        if (C9190h.m18253a(a)) {
            return null;
        }
        return m18280a(myUid, a);
    }

    /* renamed from: a */
    private static int m18278a(Context context) {
        if (f25173a == -1) {
            try {
                PackageInfo packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 128);
                if (packageInfo != null) {
                    f25173a = packageInfo.applicationInfo.uid;
                }
            } catch (NameNotFoundException unused) {
            }
        }
        return f25173a;
    }

    /* renamed from: a */
    private static List<String> m18281a(File file, String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            ArrayList arrayList = new ArrayList();
            int i = 1;
            if (str.trim().length() == 0) {
                bufferedReader = new BufferedReader(new FileReader(file));
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), str));
            }
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (i >= 0) {
                            arrayList.add(readLine);
                        }
                        i++;
                    } else {
                        C9184f.m18231a(bufferedReader);
                        return arrayList;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    C9184f.m18231a(bufferedReader2);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            C9184f.m18231a(bufferedReader2);
            throw th;
        }
    }

    /* renamed from: a */
    private static C9046h m18280a(int i, List<String> list) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        C9046h hVar = new C9046h();
        Iterator it = list.iterator();
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        while (it.hasNext()) {
            String[] split = ((String) it.next()).split(" ");
            Iterator it2 = it;
            try {
                if (TextUtils.equals(split[3], "uid_tag_int")) {
                    it = it2;
                } else {
                    if (i == Integer.parseInt(split[3])) {
                        try {
                            long parseLong = Long.parseLong(split[5]);
                            long parseLong2 = Long.parseLong(split[7]);
                            if (Long.valueOf(split[4]).longValue() == 0) {
                                j = j10;
                                j15 += parseLong + parseLong2;
                                try {
                                    if (split[1].startsWith("rmnet_data")) {
                                        j7 += parseLong2;
                                        j6 += parseLong;
                                    } else if (split[1].startsWith("wlan")) {
                                        j9 += parseLong2;
                                        j8 += parseLong;
                                    }
                                    j2 = j12;
                                    j3 = j13;
                                } catch (Exception unused) {
                                    j2 = j12;
                                    j3 = j13;
                                    j4 = j15;
                                }
                                j13 = j3;
                                j12 = j2;
                            } else {
                                j = j10;
                                j4 = j15;
                                j14 += parseLong + parseLong2;
                                try {
                                    if (split[1].startsWith("rmnet_data")) {
                                        j11 += parseLong2;
                                        j += parseLong;
                                        j2 = j12;
                                        j3 = j13;
                                        j15 = j4;
                                        j13 = j3;
                                        j12 = j2;
                                    } else {
                                        if (split[1].startsWith("wlan")) {
                                            j13 += parseLong2;
                                            j12 += parseLong;
                                        } else {
                                            long j16 = j12;
                                            long j17 = j13;
                                        }
                                        j15 = j4;
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        } catch (Exception unused3) {
                            j = j10;
                            j2 = j12;
                            j3 = j13;
                            j5 = j14;
                            j4 = j15;
                            j14 = j5;
                            j15 = j4;
                            j13 = j3;
                            j12 = j2;
                            it = it2;
                            j10 = j;
                        }
                    } else {
                        j = j10;
                        long j18 = j12;
                        long j19 = j13;
                        long j20 = j14;
                        long j21 = j15;
                    }
                    it = it2;
                    j10 = j;
                }
            } catch (Exception unused4) {
                int i2 = i;
                j = j10;
                j2 = j12;
                j3 = j13;
                j5 = j14;
                j4 = j15;
                j14 = j5;
                j15 = j4;
                j13 = j3;
                j12 = j2;
                it = it2;
                j10 = j;
            }
        }
        long j22 = j10;
        long j23 = j12;
        long j24 = j13;
        long j25 = j14;
        long j26 = j15;
        hVar.f24705h = j6;
        hVar.f24704g = j7;
        hVar.f24703f = j8;
        hVar.f24702e = j9;
        hVar.f24701d = j22;
        hVar.f24700c = j11;
        hVar.f24699b = j23;
        hVar.f24698a = j24;
        hVar.f24706i = j25;
        hVar.f24707j = j26;
        return hVar;
    }

    /* renamed from: a */
    public static long m18279a(Context context, long j, long j2, int i) {
        long j3 = 0;
        if (!m18282a()) {
            return 0;
        }
        NetworkStatsManager networkStatsManager = (NetworkStatsManager) context.getApplicationContext().getSystemService("netstats");
        if (networkStatsManager == null) {
            return 0;
        }
        NetworkStats networkStats = null;
        Bucket bucket = new Bucket();
        try {
            networkStats = networkStatsManager.querySummary(i, null, j, j2);
        } catch (Exception unused) {
        }
        long j4 = 0;
        while (networkStats != null && networkStats.hasNextBucket()) {
            networkStats.getNextBucket(bucket);
            if (m18278a(context) == bucket.getUid()) {
                j3 += bucket.getRxBytes();
                j4 += bucket.getTxBytes();
            }
        }
        return j3 + j4;
    }
}
