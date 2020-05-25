package com.p683ss.android.ugc.aweme.live.alphaplayer;

import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.c */
public final class C36029c {

    /* renamed from: a */
    public static String f92356a = "";

    /* renamed from: b */
    public boolean f92357b;

    /* renamed from: c */
    public String f92358c;

    /* renamed from: d */
    public long f92359d;

    /* renamed from: e */
    private String f92360e;

    /* renamed from: f */
    private JSONObject f92361f;

    /* renamed from: g */
    private String f92362g;

    /* renamed from: h */
    private String f92363h;

    /* renamed from: i */
    private C36030a f92364i;

    /* renamed from: j */
    private C36030a f92365j;

    /* renamed from: k */
    private String f92366k;

    /* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.c$a */
    public enum C36030a {
        ScaleToFill(0),
        ScaleAspectFitCenter(1),
        ScaleAspectFill(2),
        TopFill(3),
        BottomFill(4),
        LeftFill(5),
        RightFill(6),
        TopFit(7),
        BottomFit(8),
        LeftFit(9),
        RightFit(10);
        

        /* renamed from: a */
        int f92368a;

        public static C36030a convertFrom(int i) {
            switch (i) {
                case 0:
                    return ScaleToFill;
                case 1:
                    return ScaleAspectFitCenter;
                case 2:
                    return ScaleAspectFill;
                case 3:
                    return TopFill;
                case 4:
                    return BottomFill;
                case 5:
                    return LeftFill;
                case 6:
                    return RightFill;
                case 7:
                    return TopFit;
                case 8:
                    return BottomFit;
                case 9:
                    return LeftFit;
                case 10:
                    return RightFit;
                default:
                    return ScaleAspectFill;
            }
        }

        private C36030a(int i) {
            this.f92368a = i;
        }
    }

    /* renamed from: b */
    public final C36030a mo74787b(int i) {
        if (this.f92364i == null || this.f92365j == null) {
            String str = "landscape";
            if (1 == i) {
                str = "portrait";
            }
            try {
                return C36030a.convertFrom(this.f92361f.getJSONObject(str).getInt("align"));
            } catch (JSONException e) {
                this.f92358c = Log.getStackTraceString(e);
                return C36030a.ScaleAspectFill;
            }
        } else if (1 == i) {
            return this.f92364i;
        } else {
            return this.f92365j;
        }
    }

    /* renamed from: a */
    public final String mo74786a(int i) {
        if (TextUtils.isEmpty(this.f92362g) || TextUtils.isEmpty(this.f92363h)) {
            String str = "landscape";
            if (1 == i) {
                str = "portrait";
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f92366k);
                sb.append(File.separator);
                sb.append(this.f92361f.getJSONObject(str).getString(LeakCanaryFileProvider.f132050j));
                return sb.toString();
            } catch (JSONException e) {
                this.f92358c = Log.getStackTraceString(e);
                return "";
            }
        } else if (1 == i) {
            return this.f92362g;
        } else {
            return this.f92363h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        r3 = r0;
        r0 = r5;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        r3 = r0;
        r0 = r5;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c8, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cc, code lost:
        r4.f92358c = android.util.Log.getStackTraceString(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075 A[ExcHandler: all (r0v17 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:14:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091 A[SYNTHETIC, Splitter:B:37:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0096 A[Catch:{ IOException -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c0 A[SYNTHETIC, Splitter:B:50:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c8 A[Catch:{ IOException -> 0x00c4 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c mo74785a(java.lang.String r5) {
        /*
            r4 = this;
            r4.f92366k = r5
            java.lang.String r5 = r4.f92366k
            java.lang.String r0 = java.io.File.separator
            boolean r5 = r5.endsWith(r0)
            if (r5 == 0) goto L_0x0020
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r4.f92366k
        L_0x0013:
            r5.append(r0)
            java.lang.String r0 = "config.json"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L_0x002d
        L_0x0020:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r4.f92366k
            r5.append(r0)
            java.lang.String r0 = java.io.File.separator
            goto L_0x0013
        L_0x002d:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r4.f92366k
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x00d3
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x00d3
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0086, all -> 0x0083 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0080 }
            java.lang.String r2 = "UTF-8"
            r5.<init>(r1, r2)     // Catch:{ IOException -> 0x0080 }
            int r2 = r1.available()     // Catch:{ IOException -> 0x007a, all -> 0x0075 }
            char[] r2 = new char[r2]     // Catch:{ IOException -> 0x007a, all -> 0x0075 }
            r5.read(r2)     // Catch:{ IOException -> 0x0070, all -> 0x0075 }
            r5.close()     // Catch:{ IOException -> 0x0070, all -> 0x0075 }
            r1.close()     // Catch:{ IOException -> 0x0070, all -> 0x0075 }
            r5.close()     // Catch:{ IOException -> 0x0068 }
            r1.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x0099
        L_0x0068:
            r5 = move-exception
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)
            r4.f92358c = r5
            goto L_0x0099
        L_0x0070:
            r0 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L_0x0089
        L_0x0075:
            r0 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L_0x00be
        L_0x007a:
            r2 = move-exception
            r3 = r0
            r0 = r5
            r5 = r2
            r2 = r3
            goto L_0x0089
        L_0x0080:
            r5 = move-exception
            r2 = r0
            goto L_0x0089
        L_0x0083:
            r5 = move-exception
            r1 = r0
            goto L_0x00be
        L_0x0086:
            r5 = move-exception
            r1 = r0
            r2 = r1
        L_0x0089:
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)     // Catch:{ all -> 0x00bd }
            r4.f92358c = r5     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0094
            r0.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0094:
            if (r1 == 0) goto L_0x0099
            r1.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0099:
            if (r2 == 0) goto L_0x00b8
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
            r4.f92360e = r5
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ad }
            r0.<init>(r5)     // Catch:{ JSONException -> 0x00ad }
            r4.f92361f = r0     // Catch:{ JSONException -> 0x00ad }
            r5 = 1
            r4.f92357b = r5     // Catch:{ JSONException -> 0x00ad }
            goto L_0x00ed
        L_0x00ad:
            r5 = move-exception
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)
            r4.f92358c = r5
            r5 = 0
            r4.f92357b = r5
            goto L_0x00ed
        L_0x00b8:
            java.lang.String r5 = "read file by FileInputStream failure."
            r4.f92358c = r5
            goto L_0x00ed
        L_0x00bd:
            r5 = move-exception
        L_0x00be:
            if (r0 == 0) goto L_0x00c6
            r0.close()     // Catch:{ IOException -> 0x00c4 }
            goto L_0x00c6
        L_0x00c4:
            r0 = move-exception
            goto L_0x00cc
        L_0x00c6:
            if (r1 == 0) goto L_0x00d2
            r1.close()     // Catch:{ IOException -> 0x00c4 }
            goto L_0x00d2
        L_0x00cc:
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r4.f92358c = r0
        L_0x00d2:
            throw r5
        L_0x00d3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "resourceDir or resPath is not exist. resourceDir: "
            r0.<init>(r1)
            java.lang.String r1 = r4.f92366k
            r0.append(r1)
            java.lang.String r1 = ", resPath: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.f92358c = r5
        L_0x00ed:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.mo74785a(java.lang.String):com.ss.android.ugc.aweme.live.alphaplayer.c");
    }
}
