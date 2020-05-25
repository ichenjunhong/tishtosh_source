package com.p683ss.video.rtc.base.net;

import com.google.gson.C17971f;
import com.google.gson.C17978g;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53524e;
import okhttp3.C53662o;
import okhttp3.C53673t;
import okhttp3.C53673t.C53674a;
import okhttp3.C53682y.C53684a;
import okio.Buffer;

/* renamed from: com.ss.video.rtc.base.net.RtcNet */
public class RtcNet {
    private static HashMap<String, WeakReference<C53524e>> callStorage = new HashMap<>();
    private static C17971f gson = new C17978g().mo34900d();

    /* renamed from: com.ss.video.rtc.base.net.RtcNet$HttpCallBack */
    public interface HttpCallBack<T> {
        void onError(RequestErrTime requestErrTime, Exception exc, String str, int i);

        void onResponse(T t, String str);

        void onUUIDGen(String str);
    }

    /* renamed from: com.ss.video.rtc.base.net.RtcNet$RequestErrTime */
    public enum RequestErrTime {
        ON_BUILD_REQUEST,
        ON_EXECUTE_REQUEST,
        ON_HANDLE_RESPONSE
    }

    public static String toJson(Object obj) {
        return gson.mo34889b(obj);
    }

    private static String buildUrl(RtcNetBaseRequestModel rtcNetBaseRequestModel) {
        C53674a j = C53673t.m114180f(rtcNetBaseRequestModel.getRequestUrl()).mo111624j();
        setQueryParameter(j, rtcNetBaseRequestModel);
        return j.mo111632b().toString();
    }

    private static String bodyToString(C53498ab abVar) {
        try {
            C53498ab c = abVar.mo111256a().mo111272c();
            Buffer buffer = new Buffer();
            if (c.f132381d == null) {
                return "";
            }
            c.f132381d.writeTo(buffer);
            return buffer.readUtf8();
        } catch (IOException unused) {
            return "has exception when get body.";
        }
    }

    public static void cancelRequest(String str) {
        if (callStorage.containsKey(str)) {
            C53524e eVar = (C53524e) ((WeakReference) callStorage.get(str)).get();
            if (eVar != null) {
                eVar.mo111248c();
            }
            callStorage.remove(str);
        }
    }

    private static String convertWithIteration(Map<String, String> map) {
        StringBuilder sb = new StringBuilder("{");
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append("=");
                sb.append((String) map.get(str));
                sb.append(", ");
            }
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("}");
        return sb.toString();
    }

    private static void setCustomDnsReslov(C53684a aVar, RtcNetBaseRequestModel rtcNetBaseRequestModel) {
        aVar.mo111662a((C53662o) new RtcNet$$Lambda$0(rtcNetBaseRequestModel));
    }

    static final /* synthetic */ List lambda$setCustomDnsReslov$0$RtcNet(RtcNetBaseRequestModel rtcNetBaseRequestModel, String str) throws UnknownHostException {
        try {
            List customDnsReslov = rtcNetBaseRequestModel.setCustomDnsReslov(str);
            if (customDnsReslov == null) {
                return C53662o.f133125b.lookup(str);
            }
            rtcNetBaseRequestModel.setCallDnsLog(str, ((InetAddress) customDnsReslov.get(0)).getHostAddress());
            return customDnsReslov;
        } catch (IOException unused) {
            return C53662o.f133125b.lookup(str);
        }
    }

    private static void setHeaderParameter(C53499a aVar, RtcNetBaseRequestModel rtcNetBaseRequestModel) {
        rtcNetBaseRequestModel.setHeaderParameter();
        for (Entry entry : rtcNetBaseRequestModel.getRequestHeader().entrySet()) {
            aVar.mo111271b((String) entry.getKey(), (String) entry.getValue());
        }
    }

    private static void setQueryParameter(C53674a aVar, RtcNetBaseRequestModel rtcNetBaseRequestModel) {
        rtcNetBaseRequestModel.setQueryParameter();
        for (Entry entry : rtcNetBaseRequestModel.getQueryParameter().entrySet()) {
            aVar.mo111629a((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e5, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e8, code lost:
        if (r2 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00eb, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ec, code lost:
        r2.onError(com.p683ss.video.rtc.base.net.RtcNet.RequestErrTime.ON_HANDLE_RESPONSE, r0, com.C2240a.m6772a("JsonSyntaxException, URL = %s, Header = %s, QueryParams = %s, Body = %s", new java.lang.Object[]{r16.getRequestUrl(), convertWithIteration(r16.getRequestHeader()), convertWithIteration(r16.getQueryParameter()), bodyToString(r7)}), -1);
        cancelRequest(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0123, code lost:
        cancelRequest(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0126, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0127, code lost:
        r2.onError(com.p683ss.video.rtc.base.net.RtcNet.RequestErrTime.ON_EXECUTE_REQUEST, r0, com.C2240a.m6772a("IOException, URL = %s, Header = %s, QueryParams = %s, Body = %s", new java.lang.Object[]{r16.getRequestUrl(), convertWithIteration(r16.getRequestHeader()), convertWithIteration(r16.getQueryParameter()), bodyToString(r7)}), -1);
        cancelRequest(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0159, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e7 A[ExcHandler: u (r0v6 'e' com.google.gson.u A[CUSTOM_DECLARE]), Splitter:B:12:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T request(com.p683ss.video.rtc.base.net.RtcNetBaseRequestModel r16, com.p683ss.video.rtc.base.net.RtcNet.HttpCallBack<T> r17) {
        /*
            r1 = r16
            r2 = r17
            r3 = -1
            r4 = 0
            okhttp3.ac r0 = r16.getRequestBody()     // Catch:{ Exception -> 0x000b }
            goto L_0x0017
        L_0x000b:
            r0 = move-exception
            r5 = r0
            if (r2 == 0) goto L_0x0016
            com.ss.video.rtc.base.net.RtcNet$RequestErrTime r0 = com.p683ss.video.rtc.base.net.RtcNet.RequestErrTime.ON_BUILD_REQUEST
            java.lang.String r6 = "Error on build request"
            r2.onError(r0, r5, r6, r3)
        L_0x0016:
            r0 = r4
        L_0x0017:
            okhttp3.ab$a r5 = new okhttp3.ab$a
            r5.<init>()
            java.lang.String r6 = buildUrl(r16)
            okhttp3.ab$a r5 = r5.mo111262a(r6)
            java.lang.String r6 = r16.getRequestMethod()
            okhttp3.ab$a r0 = r5.mo111264a(r6, r0)
            okhttp3.y$a r5 = new okhttp3.y$a
            r5.<init>()
            int r6 = r16.connectTimeout()
            long r6 = (long) r6
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            r5.mo111654a(r6, r8)
            setHeaderParameter(r0, r1)
            setCustomDnsReslov(r5, r1)
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
            okhttp3.ab r7 = r0.mo111272c()
            okhttp3.y r0 = r5.mo111667a()
            okhttp3.e r0 = r0.mo111325a(r7)
            java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<okhttp3.e>> r5 = callStorage
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            r8.<init>(r0)
            r5.put(r6, r8)
            if (r2 == 0) goto L_0x0064
            r2.onUUIDGen(r6)
        L_0x0064:
            r5 = 3
            r8 = 2
            r9 = 1
            r10 = 4
            r11 = 0
            okhttp3.ad r0 = r0.mo111247b()     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            if (r2 != 0) goto L_0x0073
            cancelRequest(r6)     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            return r4
        L_0x0073:
            int r12 = r0.f132400c     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            r13 = 200(0xc8, float:2.8E-43)
            if (r12 != r13) goto L_0x00ab
            okhttp3.ae r12 = r0.f132404g     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            if (r12 == 0) goto L_0x00a1
            okhttp3.ae r0 = r0.f132404g     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            java.lang.String r0 = r0.string()     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            java.lang.Class r12 = r17.getClass()     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            java.lang.reflect.Type[] r12 = r12.getGenericInterfaces()     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            r12 = r12[r11]     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            java.lang.reflect.Type[] r12 = r12.getActualTypeArguments()     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            r12 = r12[r11]     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            java.lang.Class r12 = (java.lang.Class) r12     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            com.google.gson.f r13 = gson     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            java.lang.Object r12 = r13.mo34884a(r0, r12)     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            r2.onResponse(r12, r0)     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            goto L_0x00a7
        L_0x00a1:
            java.lang.String r0 = ""
            r2.onResponse(r4, r0)     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            r12 = r4
        L_0x00a7:
            cancelRequest(r6)     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            return r12
        L_0x00ab:
            java.lang.String r0 = r16.getRequestUrl()     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            java.util.HashMap r13 = r16.getRequestHeader()     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            java.lang.String r13 = convertWithIteration(r13)     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            java.util.HashMap r14 = r16.getQueryParameter()     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            java.lang.String r14 = convertWithIteration(r14)     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            java.lang.String r15 = bodyToString(r7)     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            java.lang.String r3 = "Response Error, URL = %s, ErrorCode = %s, Header = %s, QueryParams = %s, Body = %s"
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00e4, u -> 0x00e7 }
            r4[r11] = r0     // Catch:{ IOException -> 0x00e4, u -> 0x00e7 }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ IOException -> 0x00e4, u -> 0x00e7 }
            r4[r9] = r0     // Catch:{ IOException -> 0x00e4, u -> 0x00e7 }
            r4[r8] = r13     // Catch:{ IOException -> 0x00e4, u -> 0x00e7 }
            r4[r5] = r14     // Catch:{ IOException -> 0x00e4, u -> 0x00e7 }
            r4[r10] = r15     // Catch:{ IOException -> 0x00e4, u -> 0x00e7 }
            java.lang.String r0 = com.C2240a.m6772a(r3, r4)     // Catch:{ IOException -> 0x00e4, u -> 0x00e7 }
            com.ss.video.rtc.base.net.RtcNet$RequestErrTime r3 = com.p683ss.video.rtc.base.net.RtcNet.RequestErrTime.ON_HANDLE_RESPONSE     // Catch:{ IOException -> 0x00e4, u -> 0x00e7 }
            r4 = 0
            r2.onError(r3, r4, r0, r12)     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            cancelRequest(r6)     // Catch:{ IOException -> 0x011f, u -> 0x00e7 }
            return r4
        L_0x00e4:
            r0 = move-exception
            r3 = 0
            goto L_0x0121
        L_0x00e7:
            r0 = move-exception
            if (r2 != 0) goto L_0x00ec
            r3 = 0
            return r3
        L_0x00ec:
            java.lang.String r3 = r16.getRequestUrl()
            java.util.HashMap r4 = r16.getRequestHeader()
            java.lang.String r4 = convertWithIteration(r4)
            java.util.HashMap r1 = r16.getQueryParameter()
            java.lang.String r1 = convertWithIteration(r1)
            java.lang.String r7 = bodyToString(r7)
            java.lang.String r12 = "JsonSyntaxException, URL = %s, Header = %s, QueryParams = %s, Body = %s"
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r11] = r3
            r10[r9] = r4
            r10[r8] = r1
            r10[r5] = r7
            java.lang.String r1 = com.C2240a.m6772a(r12, r10)
            com.ss.video.rtc.base.net.RtcNet$RequestErrTime r3 = com.p683ss.video.rtc.base.net.RtcNet.RequestErrTime.ON_HANDLE_RESPONSE
            r4 = -1
            r2.onError(r3, r0, r1, r4)
            cancelRequest(r6)
            r3 = 0
            return r3
        L_0x011f:
            r0 = move-exception
            r3 = r4
        L_0x0121:
            if (r2 != 0) goto L_0x0127
            cancelRequest(r6)
            return r3
        L_0x0127:
            java.lang.String r3 = r16.getRequestUrl()
            java.util.HashMap r4 = r16.getRequestHeader()
            java.lang.String r4 = convertWithIteration(r4)
            java.util.HashMap r1 = r16.getQueryParameter()
            java.lang.String r1 = convertWithIteration(r1)
            java.lang.String r7 = bodyToString(r7)
            java.lang.String r12 = "IOException, URL = %s, Header = %s, QueryParams = %s, Body = %s"
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r11] = r3
            r10[r9] = r4
            r10[r8] = r1
            r10[r5] = r7
            java.lang.String r1 = com.C2240a.m6772a(r12, r10)
            com.ss.video.rtc.base.net.RtcNet$RequestErrTime r3 = com.p683ss.video.rtc.base.net.RtcNet.RequestErrTime.ON_EXECUTE_REQUEST
            r4 = -1
            r2.onError(r3, r0, r1, r4)
            cancelRequest(r6)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.video.rtc.base.net.RtcNet.request(com.ss.video.rtc.base.net.RtcNetBaseRequestModel, com.ss.video.rtc.base.net.RtcNet$HttpCallBack):java.lang.Object");
    }
}
