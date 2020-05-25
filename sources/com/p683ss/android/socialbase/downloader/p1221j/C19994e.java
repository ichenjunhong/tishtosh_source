package com.p683ss.android.socialbase.downloader.p1221j;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.SparseArray;
import com.C2240a;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.socialbase.downloader.depend.C19822aa;
import com.p683ss.android.socialbase.downloader.downloader.C19884b;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.p683ss.android.socialbase.downloader.impls.C19971l;
import com.p683ss.android.socialbase.downloader.model.C20048b;
import com.p683ss.android.socialbase.downloader.model.DownloadChunk;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.HttpHeader;
import com.p683ss.android.socialbase.downloader.p1212b.C19787h;
import com.p683ss.android.socialbase.downloader.p1212b.C19788i;
import com.p683ss.android.socialbase.downloader.p1214d.C19819a;
import com.p683ss.android.socialbase.downloader.p1216f.C19924c;
import com.p683ss.android.socialbase.downloader.p1219h.C19938a;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.internal.p2687e.C53622n;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.j.e */
public class C19994e {

    /* renamed from: a */
    public static volatile SparseArray<Boolean> f54955a = new SparseArray<>();

    /* renamed from: b */
    public static volatile SparseArray<List<C19822aa>> f54956b = new SparseArray<>();

    /* renamed from: c */
    private static final String f54957c = "e";

    /* renamed from: d */
    private static final Pattern f54958d = Pattern.compile(".*\\d+ *- *(\\d+) */ *\\d+");

    /* renamed from: e */
    private static String f54959e = null;

    /* renamed from: f */
    private static final char[] f54960f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: g */
    private static Pattern f54961g = null;

    /* renamed from: h */
    private static Pattern f54962h = null;

    /* renamed from: i */
    private static Boolean f54963i;

    /* renamed from: j */
    private static Boolean f54964j;

    /* renamed from: a */
    public static boolean m49348a(int i) {
        return i == 200 || i == 201 || i == 0;
    }

    /* renamed from: b */
    public static boolean m49367b(long j) {
        return j == -1;
    }

    /* renamed from: a */
    public static List<DownloadChunk> m49339a(List<DownloadChunk> list) {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null) {
                if (downloadChunk.mo41792b()) {
                    sparseArray.put(downloadChunk.f55028e, downloadChunk);
                    List<DownloadChunk> list2 = (List) sparseArray2.get(downloadChunk.f55028e);
                    if (list2 != null) {
                        for (DownloadChunk a : list2) {
                            a.mo41789a(downloadChunk);
                        }
                        downloadChunk.f55030g = list2;
                    }
                } else {
                    DownloadChunk downloadChunk2 = (DownloadChunk) sparseArray.get(downloadChunk.mo41785a());
                    if (downloadChunk2 != null) {
                        List list3 = downloadChunk2.f55030g;
                        if (list3 == null) {
                            list3 = new ArrayList();
                            downloadChunk2.f55030g = list3;
                        }
                        downloadChunk.mo41789a(downloadChunk2);
                        list3.add(downloadChunk);
                    } else {
                        List list4 = (List) sparseArray2.get(downloadChunk.mo41785a());
                        if (list4 == null) {
                            list4 = new ArrayList();
                            sparseArray2.put(downloadChunk.mo41785a(), list4);
                        }
                        list4.add(downloadChunk);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i)));
        }
        return arrayList.isEmpty() ? list : arrayList;
    }

    /* renamed from: a */
    public static void m49343a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            m49365b(downloadInfo.getSavePath(), downloadInfo.getName());
            m49365b(downloadInfo.getTempPath(), downloadInfo.getTempName());
            if (downloadInfo.isSavePathRedirected()) {
                m49363b(downloadInfo);
            }
        }
    }

    /* renamed from: a */
    public static boolean m49351a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m49353a(DownloadInfo downloadInfo, boolean z, String str) {
        if (z || TextUtils.isEmpty(downloadInfo.getSavePath()) || TextUtils.isEmpty(downloadInfo.getName())) {
            return false;
        }
        try {
            if (new File(downloadInfo.getSavePath(), downloadInfo.getName()).exists() && m49333a(downloadInfo.getSavePath(), downloadInfo.getName(), str) == C19788i.VALID) {
                return true;
            }
        } catch (OutOfMemoryError unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m49356a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            if (new File(str, str2).exists() && m49333a(str, str2, (String) null) == C19788i.VALID) {
                return true;
            }
        } catch (OutOfMemoryError unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static void m49341a(int i, boolean z, BaseException baseException) {
        synchronized (f54955a) {
            List<C19822aa> list = (List) f54956b.get(i);
            if (list != null) {
                for (C19822aa aaVar : list) {
                    if (aaVar != null) {
                        if (z) {
                            aaVar.mo41311a();
                        } else {
                            aaVar.mo41312a(baseException);
                        }
                    }
                }
            }
            new StringBuilder("handleTempSaveCallback id:").append(i);
            f54955a.remove(i);
        }
    }

    /* renamed from: a */
    public static void m49344a(DownloadInfo downloadInfo, String str) throws BaseException {
        if (downloadInfo != null && !TextUtils.isEmpty(str) && !str.equals(downloadInfo.getName())) {
            File file = new File(downloadInfo.getSavePath(), str);
            File file2 = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            if (file2.exists() && !file2.delete()) {
                throw new BaseException(1037, "targetPath file exists but can't delete");
            } else if (!m49371b(file, file2)) {
                throw new BaseException(1001, C2240a.m6772a("Can't copy the exist file(%s/%s) to the target file(%s/%s)", new Object[]{downloadInfo.getSavePath(), str, downloadInfo.getSavePath(), downloadInfo.getName()}));
            }
        }
    }

    /* renamed from: a */
    private static boolean m49355a(File file, File file2, boolean z) throws BaseException {
        if (!(file == null || file2 == null)) {
            try {
                if (file.exists() && !file.isDirectory()) {
                    if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
                        File parentFile = file2.getParentFile();
                        if (parentFile != null && !parentFile.mkdirs()) {
                            if (!parentFile.isDirectory()) {
                                StringBuilder sb = new StringBuilder("Destination '");
                                sb.append(parentFile);
                                sb.append("' directory cannot be created");
                                throw new BaseException(1053, sb.toString());
                            }
                        }
                        if (file2.exists() && !file2.canWrite()) {
                            if (!file2.delete()) {
                                StringBuilder sb2 = new StringBuilder("Destination '");
                                sb2.append(file2);
                                sb2.append("' exists but is read-only and delete failed");
                                throw new IOException(sb2.toString());
                            }
                        }
                        m49364b(file, file2, true);
                        return true;
                    }
                }
            } catch (BaseException e) {
                throw e;
            } catch (Throwable th) {
                m49346a(th, "CopyFile");
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m49354a(File file, File file2) throws BaseException {
        boolean renameTo = file.renameTo(file2);
        if (!renameTo) {
            renameTo = m49371b(file, file2);
            try {
                file.delete();
            } catch (Throwable unused) {
            }
        }
        return renameTo;
    }

    /* renamed from: a */
    public static boolean m49349a(int i, String str) {
        if (C19991b.m49327a(16777216)) {
            return i == 206 || i == 1;
        }
        if (i >= 400) {
            return false;
        }
        return i == 206 || i == 1 || "bytes".equals(str);
    }

    /* renamed from: b */
    public static boolean m49370b(C19924c cVar) {
        if (cVar == null) {
            return false;
        }
        return C19991b.m49327a(8) ? "chunked".equals(cVar.mo13392a("Transfer-Encoding")) || m49331a(cVar) == -1 : m49331a(cVar) == -1;
    }

    /* renamed from: a */
    public static List<HttpHeader> m49340a(List<HttpHeader> list, String str, long j, long j2) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (HttpHeader httpHeader : list) {
                if (httpHeader != null) {
                    arrayList.add(httpHeader);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new HttpHeader("If-Match", str));
        }
        arrayList.add(new HttpHeader("Accept-Encoding", "identity"));
        StringBuilder sb = new StringBuilder("range CurrentOffset:");
        sb.append(j);
        sb.append(" EndOffset:");
        sb.append(j2);
        if (j2 == 0) {
            str2 = C2240a.m6772a("bytes=%s-", new Object[]{String.valueOf(j)});
        } else {
            str2 = C2240a.m6772a("bytes=%s-%s", new Object[]{String.valueOf(j), String.valueOf(j2)});
        }
        arrayList.add(new HttpHeader("Range", str2));
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m49350a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo a = C19995f.m49390a(connectivityManager);
            if (a != null) {
                if (a.isAvailable()) {
                    if (1 == a.getType()) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m49368b(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo a = C19995f.m49390a(connectivityManager);
            if (a == null) {
                return false;
            }
            return a.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m49347a() {
        if (f54963i != null) {
            return f54963i.booleanValue();
        }
        String c = m49375c(C19884b.m48627x());
        Boolean valueOf = Boolean.valueOf((c == null || !c.contains(":")) && c != null && c.equals(C19884b.m48627x().getPackageName()));
        f54963i = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: b */
    public static boolean m49366b() {
        return !m49377c() && C19884b.m48606c() && C19971l.m49132a(true).mo41608g();
    }

    /* renamed from: a */
    public static boolean m49357a(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m49384e(th);
        if (TextUtils.isEmpty(e) || !e.contains("Precondition Failed")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m49372b(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m49384e(th);
        if (TextUtils.isEmpty(e) || !e.contains("Requested Range Not Satisfiable")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m49352a(BaseException baseException) {
        return baseException.getErrorCode() == 1051;
    }

    /* renamed from: b */
    public static boolean m49369b(BaseException baseException) {
        if (baseException instanceof DownloadHttpException) {
            DownloadHttpException downloadHttpException = (DownloadHttpException) baseException;
            if (downloadHttpException.getHttpStatusCode() == 412 || downloadHttpException.getHttpStatusCode() == 416) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m49346a(Throwable th, String str) throws BaseException {
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("-");
            sb.append(baseException.getErrorMessage());
            baseException.setErrorMsg(sb.toString());
            throw baseException;
        } else if (th instanceof SSLHandshakeException) {
            throw new BaseException(1011, m49362b(th, str2));
        } else if (m49386f(th)) {
            throw new BaseException(1048, m49362b(th, str2));
        } else if (m49357a(th)) {
            throw new DownloadHttpException(1004, 412, m49362b(th, str2));
        } else if (m49372b(th)) {
            throw new DownloadHttpException(1004, 416, m49362b(th, str2));
        } else if (m49387g(th)) {
            throw new BaseException(1047, m49362b(th, str2));
        } else if (m49388h(th)) {
            throw new BaseException(1049, m49362b(th, str2));
        } else if (m49389i(th)) {
            throw new BaseException(1041, m49362b(th, str2));
        } else if (th instanceof IOException) {
            m49345a((IOException) th, str);
        } else {
            throw new BaseException(1000, m49362b(th, str2));
        }
    }

    /* renamed from: a */
    private static void m49345a(IOException iOException, String str) throws BaseException {
        if (str == null) {
            str = "";
        }
        String b = m49362b((Throwable) iOException, str);
        if (iOException instanceof ConnectException) {
            throw new BaseException(1041, b);
        } else if (iOException instanceof UnknownHostException) {
            throw new BaseException(1055, b);
        } else if (iOException instanceof NoRouteToHostException) {
            throw new BaseException(1056, b);
        } else if (iOException instanceof UnknownServiceException) {
            throw new BaseException(1057, b);
        } else if (iOException instanceof PortUnreachableException) {
            throw new BaseException(1058, b);
        } else if (iOException instanceof SocketTimeoutException) {
            throw new BaseException(1048, b);
        } else if (iOException instanceof SocketException) {
            throw new BaseException(1059, b);
        } else if (iOException instanceof HttpRetryException) {
            throw new BaseException(1060, b);
        } else if (iOException instanceof ProtocolException) {
            throw new BaseException(1061, b);
        } else if (iOException instanceof MalformedURLException) {
            throw new BaseException(1062, b);
        } else if (iOException instanceof FileNotFoundException) {
            throw new BaseException(1063, b);
        } else if (iOException instanceof InterruptedIOException) {
            throw new BaseException(1064, b);
        } else if (iOException instanceof UnsupportedEncodingException) {
            throw new BaseException(1065, b);
        } else if (iOException instanceof EOFException) {
            throw new BaseException(1066, b);
        } else if (iOException instanceof C53622n) {
            throw new BaseException(1067, b);
        } else if (iOException instanceof SSLException) {
            throw new BaseException(1011, b);
        } else if (m49378c((Throwable) iOException)) {
            throw new BaseException(1006, b);
        } else {
            throw new BaseException(1023, b);
        }
    }

    /* renamed from: a */
    public static <K> HashMap<Integer, K> m49338a(SparseArray<K> sparseArray) {
        if (sparseArray == null) {
            return null;
        }
        HashMap<Integer, K> hashMap = new HashMap<>();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            hashMap.put(Integer.valueOf(keyAt), sparseArray.valueAt(i));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static <K> void m49342a(SparseArray<K> sparseArray, Map<Integer, K> map) {
        if (map != null && sparseArray != null) {
            for (Integer num : map.keySet()) {
                if (num != null) {
                    sparseArray.put(num.intValue(), map.get(num));
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m49358a(List<HttpHeader> list, List<HttpHeader> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    /* renamed from: d */
    public static boolean m49380d() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d A[SYNTHETIC, Splitter:B:20:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064 A[SYNTHETIC, Splitter:B:28:0x0064] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m49382e() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            r4.append(r5)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0061, all -> 0x005a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            r2.<init>()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            r2.append(r3)     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            goto L_0x002e
        L_0x0039:
            boolean r3 = com.p683ss.android.socialbase.downloader.p1214d.C19819a.m48485a()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            if (r3 == 0) goto L_0x004d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            java.lang.String r4 = "get processName = "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            java.lang.String r4 = r2.toString()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            r3.append(r4)     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
        L_0x004d:
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0062, all -> 0x0055 }
            r1.close()     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            return r2
        L_0x0055:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x005b
        L_0x005a:
            r1 = move-exception
        L_0x005b:
            if (r0 == 0) goto L_0x0060
            r0.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            throw r1
        L_0x0061:
            r1 = r0
        L_0x0062:
            if (r1 == 0) goto L_0x0067
            r1.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49382e():java.lang.String");
    }

    /* renamed from: c */
    public static boolean m49377c() {
        if (f54964j != null) {
            return f54964j.booleanValue();
        }
        String c = m49375c(C19884b.m48627x());
        if (c != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C19884b.m48627x().getPackageName());
            sb.append(":downloader");
            if (c.equals(sb.toString())) {
                f54964j = Boolean.valueOf(true);
                return f54964j.booleanValue();
            }
        }
        f54964j = Boolean.valueOf(false);
        return f54964j.booleanValue();
    }

    /* renamed from: a */
    public static double m49330a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return d / 1048576.0d;
    }

    /* renamed from: e */
    public static String m49384e(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            return th.toString();
        } catch (Throwable unused) {
            return "throwable getMsg error";
        }
    }

    /* renamed from: b */
    public static long m49360b(List<DownloadChunk> list) {
        long j = 0;
        for (DownloadChunk j2 : list) {
            j += j2.mo41801j();
        }
        return j;
    }

    /* renamed from: f */
    private static void m49385f(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.isDirectory()) {
                file.delete();
            }
        }
    }

    /* renamed from: h */
    private static boolean m49388h(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m49384e(th);
        if (TextUtils.isEmpty(e) || !e.contains("network not available")) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m49389i(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m49384e(th);
        if (TextUtils.isEmpty(e) || !e.contains("Exception in connect")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static long m49331a(C19924c cVar) {
        long j;
        if (cVar == null) {
            return -1;
        }
        String a = cVar.mo13392a("Content-Length");
        if (!TextUtils.isEmpty(a) || !C19991b.m49327a(1)) {
            try {
                j = Long.parseLong(a);
            } catch (NumberFormatException unused) {
                return -1;
            }
        } else {
            j = m49373c(cVar);
        }
        return j;
    }

    /* renamed from: b */
    public static long m49359b(String str) throws BaseException {
        try {
            StatFs statFs = new StatFs(str);
            if (VERSION.SDK_INT >= 18) {
                return statFs.getAvailableBytes();
            }
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (IllegalArgumentException e) {
            throw new BaseException(1050, (Throwable) e);
        } catch (Throwable th) {
            throw new BaseException(1052, th);
        }
    }

    /* renamed from: c */
    public static String m49376c(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    byte[] digest = instance.digest();
                    if (digest != null) {
                        return m49337a(digest, 0, digest.length);
                    }
                    throw new NullPointerException("bytes is null");
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m49379d(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(C2240a.m6772a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: e */
    private static String m49383e(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (f54961g == null) {
                f54961g = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
            }
            Matcher matcher = f54961g.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            if (f54962h == null) {
                f54962h = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");
            }
            Matcher matcher2 = f54962h.matcher(str);
            if (matcher2.find()) {
                return matcher2.group(1);
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private static boolean m49386f(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m49384e(th);
        if ((th instanceof SocketTimeoutException) || (!TextUtils.isEmpty(e) && (e.contains("time out") || e.contains("Time-out")))) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m49387g(Throwable th) {
        if (th == null) {
            return false;
        }
        String e = m49384e(th);
        if (th instanceof DownloadHttpException) {
            DownloadHttpException downloadHttpException = (DownloadHttpException) th;
            if ((downloadHttpException != null && downloadHttpException.getHttpStatusCode() == 403) || (!TextUtils.isEmpty(e) && e.contains("403"))) {
                return true;
            }
        }
        if (TextUtils.isEmpty(e) || !e.contains("Forbidden")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static long m49332a(String str) {
        if (str == null) {
            return -1;
        }
        String[] split = str.split("/");
        if (split.length >= 2) {
            try {
                return Long.parseLong(split[1]);
            } catch (NumberFormatException unused) {
                String str2 = f54957c;
                StringBuilder sb = new StringBuilder("parse instance length failed with ");
                sb.append(str);
                C19819a.m48486b(str2, sb.toString());
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static C19787h m49361b(int i) {
        C19787h hVar = C19787h.MAIN;
        if (i == C19787h.SUB.ordinal()) {
            return C19787h.SUB;
        }
        if (i == C19787h.NOTIFICATION.ordinal()) {
            return C19787h.NOTIFICATION;
        }
        return hVar;
    }

    /* renamed from: c */
    private static long m49373c(C19924c cVar) {
        if (cVar == null) {
            return -1;
        }
        String a = cVar.mo13392a("Content-Range");
        if (TextUtils.isEmpty(a)) {
            return -1;
        }
        try {
            Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(a);
            if (matcher.find()) {
                return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            }
        } catch (Exception e) {
            String str = f54957c;
            StringBuilder sb = new StringBuilder("parse content-length from content-range failed ");
            sb.append(e);
            C19819a.m48486b(str, sb.toString());
        }
        return -1;
    }

    /* renamed from: d */
    public static boolean m49381d(Throwable th) {
        if (!(th instanceof BaseException)) {
            return false;
        }
        int errorCode = ((BaseException) th).getErrorCode();
        if (errorCode == 1055 || errorCode == 1023 || errorCode == 1041 || errorCode == 1022 || errorCode == 1048 || errorCode == 1056 || errorCode == 1057 || errorCode == 1058 || errorCode == 1059 || errorCode == 1060 || errorCode == 1061 || errorCode == 1067 || errorCode == 1049 || errorCode == 1047 || errorCode == 1051 || errorCode == 1004 || errorCode == 1011 || errorCode == 1002 || errorCode == 1013) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static long m49374c(List<DownloadChunk> list) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        long j = -1;
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null && ((downloadChunk.mo41800i() <= downloadChunk.f55026c || downloadChunk.f55026c == 0) && (j == -1 || j > downloadChunk.mo41800i()))) {
                j = downloadChunk.mo41800i();
            }
        }
        return j;
    }

    /* renamed from: b */
    public static void m49363b(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            JSONObject b = C19938a.m48931a(downloadInfo).mo41662b("anti_hijack_dir");
            if (b != null) {
                String optString = b.optString("ins_desc");
                if (!TextUtils.isEmpty(optString)) {
                    m49365b(downloadInfo.getSavePath(), optString);
                }
                m49385f(downloadInfo.getSavePath());
            }
        }
    }

    /* renamed from: c */
    public static String m49375c(Context context) {
        String str = f54959e;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        if (C19819a.m48485a()) {
                            new StringBuilder("processName = ").append(runningAppProcessInfo.processName);
                        }
                        String str2 = runningAppProcessInfo.processName;
                        f54959e = str2;
                        return str2;
                    }
                }
            }
        } catch (Exception unused) {
        }
        String e = m49382e();
        f54959e = e;
        return e;
    }

    /* renamed from: c */
    public static boolean m49378c(Throwable th) {
        boolean z;
        if (th == null) {
            return false;
        }
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            int errorCode = baseException.getErrorCode();
            if (errorCode == 1006) {
                return true;
            }
            if (errorCode == 1023 || errorCode == 1039 || errorCode == 1040 || errorCode == 1054 || errorCode == 1064) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String message = baseException.getMessage();
                if (TextUtils.isEmpty(message) || !message.contains("ENOSPC")) {
                    return false;
                }
                return true;
            }
        } else if (th instanceof IOException) {
            String e = m49384e(th);
            if (TextUtils.isEmpty(e) || !e.contains("ENOSPC")) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m49371b(File file, File file2) throws BaseException {
        return m49355a(file, file2, true);
    }

    /* renamed from: a */
    public static String m49335a(C19924c cVar, String str) {
        String e = m49383e(cVar.mo13392a("Content-Disposition"));
        if (TextUtils.isEmpty(e)) {
            return m49376c(str);
        }
        return e;
    }

    /* renamed from: b */
    public static String m49362b(Throwable th, String str) {
        if (str == null) {
            return m49384e(th);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(m49384e(th));
        return sb.toString();
    }

    /* renamed from: a */
    public static String m49336a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return C2240a.m6772a("%s%s%s", new Object[]{str, File.separator, str2});
    }

    /* renamed from: b */
    public static void m49365b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str, str2);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* renamed from: a */
    public static C19788i m49333a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return C19788i.VALID;
        }
        File file = new File(str, str2);
        if (!file.exists()) {
            return C19788i.INVALID_FILE_NO_EXIST;
        }
        String a = C19990a.m49325a(file);
        if (TextUtils.isEmpty(a)) {
            return C19788i.INVALID_FILE_MD5_EMPTY;
        }
        if (!a.equals(str3)) {
            return C19788i.INVALID_MD5_NOT_EQUALS;
        }
        return C19788i.VALID;
    }

    /* renamed from: a */
    public static C20048b m49334a(String str, String str2, int i) throws BaseException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new BaseException(1021, (Throwable) new IOException("path must be not empty"));
        }
        File file = new File(str, str2);
        if (!file.exists() || !file.isDirectory()) {
            if (!file.exists()) {
                try {
                    File file2 = new File(str);
                    if (!file2.exists() || !file2.isDirectory()) {
                        if (file2.exists()) {
                            file2.delete();
                            throw new BaseException(1031, "download savePath is not directory");
                        } else if (!file2.mkdirs()) {
                            throw new BaseException((int) OnRunningErrorCallback.TYPE_SHOT_SCREEN, "download savePath directory can not created");
                        }
                    }
                    file.createNewFile();
                } catch (IOException e) {
                    throw new BaseException(1036, (Throwable) e);
                }
            }
            return new C20048b(file, i);
        }
        throw new BaseException(1035, (Throwable) new IOException(C2240a.m6772a("path is :%s, path is directory:%B:", new Object[]{str, Boolean.valueOf(file.isDirectory())})));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d3, code lost:
        r1 = r0;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d7, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00da, code lost:
        r4 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ed, code lost:
        r1 = r0;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00f1, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00f4, code lost:
        r4 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d2 A[ExcHandler: all (r0v11 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:11:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ec A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:9:0x0034] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m49364b(java.io.File r19, java.io.File r20, boolean r21) throws java.io.IOException {
        /*
            r0 = r19
            r1 = r20
            boolean r2 = r20.exists()
            if (r2 == 0) goto L_0x002a
            boolean r2 = r20.isDirectory()
            if (r2 != 0) goto L_0x0011
            goto L_0x002a
        L_0x0011:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Destination '"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "' exists but is a directory"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x002a:
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r0)
            r3 = 0
            java.nio.channels.FileChannel r10 = r2.getChannel()     // Catch:{ Throwable -> 0x010b }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
            r11.<init>(r1)     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
            java.nio.channels.FileChannel r12 = r11.getChannel()     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
            long r13 = r10.size()     // Catch:{ Throwable -> 0x00ba, all -> 0x00b6 }
            r15 = 0
            r17 = r15
        L_0x0045:
            int r4 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x0064
            long r4 = r13 - r17
            r6 = 31457280(0x1e00000, double:1.55419614E-316)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0054
            r8 = r6
            goto L_0x0055
        L_0x0054:
            r8 = r4
        L_0x0055:
            r4 = r12
            r5 = r10
            r6 = r17
            long r4 = r4.transferFrom(r5, r6, r8)     // Catch:{ Throwable -> 0x00ba, all -> 0x00b6 }
            int r6 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x0064
            long r17 = r17 + r4
            goto L_0x0045
        L_0x0064:
            if (r12 == 0) goto L_0x0069
            r12.close()     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
        L_0x0069:
            r11.close()     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
            if (r10 == 0) goto L_0x0071
            r10.close()     // Catch:{ Throwable -> 0x010b }
        L_0x0071:
            r2.close()
            long r2 = r19.length()
            long r4 = r20.length()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x008a
            if (r21 == 0) goto L_0x0089
            long r2 = r19.lastModified()
            r1.setLastModified(r2)
        L_0x0089:
            return
        L_0x008a:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to copy full contents from '"
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = "' to '"
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = "' Expected length: "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = " Actual: "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r6.<init>(r0)
            throw r6
        L_0x00b6:
            r0 = move-exception
            r1 = r0
            r4 = r3
            goto L_0x00c0
        L_0x00ba:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            r4 = r1
            r1 = r0
        L_0x00c0:
            if (r12 == 0) goto L_0x00d1
            if (r4 == 0) goto L_0x00ce
            r12.close()     // Catch:{ Throwable -> 0x00c8, all -> 0x00d2 }
            goto L_0x00d1
        L_0x00c8:
            r0 = move-exception
            r5 = r0
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43752a(r4, r5)     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
            goto L_0x00d1
        L_0x00ce:
            r12.close()     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
        L_0x00d1:
            throw r1     // Catch:{ Throwable -> 0x00d6, all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            r1 = r0
            r4 = r3
            goto L_0x00dc
        L_0x00d6:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            r4 = r1
            r1 = r0
        L_0x00dc:
            if (r4 == 0) goto L_0x00e8
            r11.close()     // Catch:{ Throwable -> 0x00e2, all -> 0x00ec }
            goto L_0x00eb
        L_0x00e2:
            r0 = move-exception
            r5 = r0
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43752a(r4, r5)     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
            goto L_0x00eb
        L_0x00e8:
            r11.close()     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
        L_0x00eb:
            throw r1     // Catch:{ Throwable -> 0x00f0, all -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            r1 = r0
            r4 = r3
            goto L_0x00f6
        L_0x00f0:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r0 = move-exception
            r4 = r1
            r1 = r0
        L_0x00f6:
            if (r10 == 0) goto L_0x0107
            if (r4 == 0) goto L_0x0104
            r10.close()     // Catch:{ Throwable -> 0x00fe }
            goto L_0x0107
        L_0x00fe:
            r0 = move-exception
            r5 = r0
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43752a(r4, r5)     // Catch:{ Throwable -> 0x010b }
            goto L_0x0107
        L_0x0104:
            r10.close()     // Catch:{ Throwable -> 0x010b }
        L_0x0107:
            throw r1     // Catch:{ Throwable -> 0x010b }
        L_0x0108:
            r0 = move-exception
            r1 = r0
            goto L_0x010e
        L_0x010b:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x0108 }
        L_0x010e:
            if (r3 == 0) goto L_0x011a
            r2.close()     // Catch:{ Throwable -> 0x0114 }
            goto L_0x011d
        L_0x0114:
            r0 = move-exception
            r2 = r0
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43752a(r3, r2)
            goto L_0x011d
        L_0x011a:
            r2.close()
        L_0x011d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.socialbase.downloader.p1221j.C19994e.m49364b(java.io.File, java.io.File, boolean):void");
    }

    /* renamed from: a */
    private static String m49337a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b = bArr[i5 + 0] & 255;
                int i6 = i4 + 1;
                cArr[i4] = f54960f[b >> 4];
                i4 = i6 + 1;
                cArr[i6] = f54960f[b & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
