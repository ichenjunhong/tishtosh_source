package com.facebook;

import com.C2240a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.t */
public class C14696t {

    /* renamed from: g */
    private static final String f38082g = "t";

    /* renamed from: a */
    public final HttpURLConnection f38083a;

    /* renamed from: b */
    public final JSONObject f38084b;

    /* renamed from: c */
    public final JSONArray f38085c;

    /* renamed from: d */
    public final FacebookRequestError f38086d;

    /* renamed from: e */
    public final String f38087e;

    /* renamed from: f */
    public final GraphRequest f38088f;

    public String toString() {
        String str;
        int i;
        try {
            Locale locale = Locale.US;
            String str2 = "%d";
            Object[] objArr = new Object[1];
            if (this.f38083a != null) {
                i = this.f38083a.getResponseCode();
            } else {
                i = 200;
            }
            objArr[0] = Integer.valueOf(i);
            str = C2240a.m6773a(locale, str2, objArr);
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sb = new StringBuilder("{Response: ");
        sb.append(" responseCode: ");
        sb.append(str);
        sb.append(", graphObject: ");
        sb.append(this.f38084b);
        sb.append(", error: ");
        sb.append(this.f38086d);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.Closeable, java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [java.io.Closeable, java.lang.String]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.io.Closeable, java.lang.String]
      mth insns count: 72
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List<com.facebook.C14696t> m30057a(java.net.HttpURLConnection r11, com.facebook.C14564s r12) {
        /*
            r0 = 0
            r1 = 0
            r2 = 1
            boolean r3 = com.facebook.C14533n.m29767b()     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            if (r3 == 0) goto L_0x0079
            int r3 = r11.getResponseCode()     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            r4 = 400(0x190, float:5.6E-43)
            if (r3 < r4) goto L_0x0017
            java.io.InputStream r3 = r11.getErrorStream()     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
        L_0x0015:
            r0 = r3
            goto L_0x0030
        L_0x0017:
            r3 = r11
            java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            boolean r4 = com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g.m46160a(r3)     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            if (r4 == 0) goto L_0x002b
            java.net.URL r4 = r3.getURL()     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            java.lang.String r3 = r3.getContentType()     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b.m46151a(r4, r0, r0, r3)     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
        L_0x002b:
            java.io.InputStream r3 = r11.getInputStream()     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            goto L_0x0015
        L_0x0030:
            java.lang.String r3 = com.facebook.internal.C14277aa.m29252a(r0)     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            com.facebook.w r4 = com.facebook.C14699w.INCLUDE_RAW_RESPONSES     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            java.lang.String r5 = "Response"
            java.lang.String r6 = "Response (raw)\n  Size: %d\n  Response:\n%s\n"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            int r9 = r3.length()     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            r8[r1] = r9     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            r8[r2] = r3     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            com.facebook.internal.C14349t.m29409a(r4, r5, r6, r8)     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            org.json.JSONTokener r4 = new org.json.JSONTokener     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            r4.<init>(r3)     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            java.lang.Object r4 = r4.nextValue()     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            java.util.List r4 = m30058a(r11, r12, r4)     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            com.facebook.w r5 = com.facebook.C14699w.REQUESTS     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            java.lang.String r6 = "Response"
            java.lang.String r8 = "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            java.lang.String r10 = r12.f37842d     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            r9[r1] = r10     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            int r3 = r3.length()     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            r9[r2] = r3     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            r9[r7] = r4     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            com.facebook.internal.C14349t.m29409a(r5, r6, r8, r9)     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            com.facebook.internal.C14277aa.m29267a(r0)
            return r4
        L_0x0079:
            java.lang.String r3 = "GraphRequest can't be used when Facebook SDK isn't fully initialized"
            com.facebook.k r4 = new com.facebook.k     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            r4.<init>(r3)     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
            throw r4     // Catch:{ k -> 0x009e, Exception -> 0x0083 }
        L_0x0081:
            r11 = move-exception
            goto L_0x00b4
        L_0x0083:
            r3 = move-exception
            com.facebook.w r4 = com.facebook.C14699w.REQUESTS     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = "Response"
            java.lang.String r6 = "Response <Error>: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0081 }
            r2[r1] = r3     // Catch:{ all -> 0x0081 }
            com.facebook.internal.C14349t.m29409a(r4, r5, r6, r2)     // Catch:{ all -> 0x0081 }
            com.facebook.k r1 = new com.facebook.k     // Catch:{ all -> 0x0081 }
            r1.<init>(r3)     // Catch:{ all -> 0x0081 }
            java.util.List r11 = m30059a(r12, r11, r1)     // Catch:{ all -> 0x0081 }
            com.facebook.internal.C14277aa.m29267a(r0)
            return r11
        L_0x009e:
            r3 = move-exception
            com.facebook.w r4 = com.facebook.C14699w.REQUESTS     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = "Response"
            java.lang.String r6 = "Response <Error>: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0081 }
            r2[r1] = r3     // Catch:{ all -> 0x0081 }
            com.facebook.internal.C14349t.m29409a(r4, r5, r6, r2)     // Catch:{ all -> 0x0081 }
            java.util.List r11 = m30059a(r12, r11, r3)     // Catch:{ all -> 0x0081 }
            com.facebook.internal.C14277aa.m29267a(r0)
            return r11
        L_0x00b4:
            com.facebook.internal.C14277aa.m29267a(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C14696t.m30057a(java.net.HttpURLConnection, com.facebook.s):java.util.List");
    }

    private C14696t(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
    }

    /* renamed from: a */
    static List<C14696t> m30059a(List<GraphRequest> list, HttpURLConnection httpURLConnection, C14457k kVar) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C14696t((GraphRequest) list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) kVar)));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.facebook.C14696t> m30058a(java.net.HttpURLConnection r23, java.util.List<com.facebook.GraphRequest> r24, java.lang.Object r25) throws com.facebook.C14457k, org.json.JSONException {
        /*
            r1 = r23
            r2 = r24
            r3 = r25
            int r4 = r24.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r6 = 0
            r7 = 1
            if (r4 != r7) goto L_0x0058
            java.lang.Object r0 = r2.get(r6)
            r8 = r0
            com.facebook.GraphRequest r8 = (com.facebook.GraphRequest) r8
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004a, IOException -> 0x003b }
            r0.<init>()     // Catch:{ JSONException -> 0x004a, IOException -> 0x003b }
            java.lang.String r9 = "body"
            r0.put(r9, r3)     // Catch:{ JSONException -> 0x004a, IOException -> 0x003b }
            if (r1 == 0) goto L_0x002b
            int r9 = r23.getResponseCode()     // Catch:{ JSONException -> 0x004a, IOException -> 0x003b }
            goto L_0x002d
        L_0x002b:
            r9 = 200(0xc8, float:2.8E-43)
        L_0x002d:
            java.lang.String r10 = "code"
            r0.put(r10, r9)     // Catch:{ JSONException -> 0x004a, IOException -> 0x003b }
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x004a, IOException -> 0x003b }
            r9.<init>()     // Catch:{ JSONException -> 0x004a, IOException -> 0x003b }
            r9.put(r0)     // Catch:{ JSONException -> 0x004a, IOException -> 0x003b }
            goto L_0x0059
        L_0x003b:
            r0 = move-exception
            com.facebook.t r9 = new com.facebook.t
            com.facebook.FacebookRequestError r10 = new com.facebook.FacebookRequestError
            r10.<init>(r1, r0)
            r9.<init>(r8, r1, r10)
            r5.add(r9)
            goto L_0x0058
        L_0x004a:
            r0 = move-exception
            com.facebook.t r9 = new com.facebook.t
            com.facebook.FacebookRequestError r10 = new com.facebook.FacebookRequestError
            r10.<init>(r1, r0)
            r9.<init>(r8, r1, r10)
            r5.add(r9)
        L_0x0058:
            r9 = r3
        L_0x0059:
            boolean r0 = r9 instanceof org.json.JSONArray
            if (r0 == 0) goto L_0x0167
            org.json.JSONArray r9 = (org.json.JSONArray) r9
            int r0 = r9.length()
            if (r0 != r4) goto L_0x0167
            r4 = 0
        L_0x0066:
            int r0 = r9.length()
            if (r4 >= r0) goto L_0x0166
            java.lang.Object r0 = r2.get(r4)
            r8 = r0
            com.facebook.GraphRequest r8 = (com.facebook.GraphRequest) r8
            java.lang.Object r0 = r9.get(r4)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            boolean r10 = r0 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            r11 = 0
            if (r10 == 0) goto L_0x0116
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            com.facebook.FacebookRequestError r10 = com.facebook.FacebookRequestError.m27262a(r0, r3, r1)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            if (r10 == 0) goto L_0x00ec
            int r0 = r10.f35201d     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            r12 = 190(0xbe, float:2.66E-43)
            if (r0 != r12) goto L_0x00e5
            com.facebook.AccessToken r0 = r8.f35221c     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            if (r0 == 0) goto L_0x009a
            com.facebook.AccessToken r12 = com.facebook.AccessToken.m27253a()     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            boolean r0 = r0.equals(r12)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            if (r0 == 0) goto L_0x009a
            r0 = 1
            goto L_0x009b
        L_0x009a:
            r0 = 0
        L_0x009b:
            if (r0 == 0) goto L_0x00e5
            int r0 = r10.f35202e     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            r12 = 493(0x1ed, float:6.91E-43)
            if (r0 == r12) goto L_0x00a7
            com.facebook.AccessToken.m27256a(r11)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            goto L_0x00e5
        L_0x00a7:
            com.facebook.AccessToken r0 = com.facebook.AccessToken.m27253a()     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            boolean r0 = r0.mo25279c()     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            if (r0 != 0) goto L_0x00e5
            com.facebook.b r0 = com.facebook.C13607b.m27474a()     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            com.facebook.AccessToken r0 = r0.f35508b     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            if (r0 == 0) goto L_0x00e5
            com.facebook.AccessToken r22 = new com.facebook.AccessToken     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.lang.String r12 = r0.f35176e     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.lang.String r13 = r0.f35179h     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.lang.String r14 = r0.f35180i     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.util.Set<java.lang.String> r15 = r0.f35173b     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.util.Set<java.lang.String> r11 = r0.f35174c     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.util.Set<java.lang.String> r6 = r0.f35175d     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            com.facebook.d r7 = r0.f35177f     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.util.Date r19 = new java.util.Date     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            r19.<init>()     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.util.Date r20 = new java.util.Date     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            r20.<init>()     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.util.Date r0 = r0.f35181j     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            r16 = r11
            r11 = r22
            r17 = r6
            r18 = r7
            r21 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            com.facebook.AccessToken.m27256a(r22)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
        L_0x00e5:
            com.facebook.t r0 = new com.facebook.t     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            r0.<init>(r8, r1, r10)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            r6 = r0
            goto L_0x0123
        L_0x00ec:
            java.lang.String r6 = "body"
            java.lang.String r7 = "FACEBOOK_NON_JSON_RESULT"
            java.lang.Object r0 = com.facebook.internal.C14277aa.m29248a(r0, r6, r7)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            boolean r6 = r0 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            if (r6 == 0) goto L_0x0104
            com.facebook.t r6 = new com.facebook.t     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.lang.String r7 = r0.toString()     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            r6.<init>(r8, r1, r7, r0)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            goto L_0x0123
        L_0x0104:
            boolean r6 = r0 instanceof org.json.JSONArray     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            if (r6 == 0) goto L_0x0114
            com.facebook.t r6 = new com.facebook.t     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.lang.String r7 = r0.toString()     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            r6.<init>(r8, r1, r7, r0)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            goto L_0x0123
        L_0x0114:
            java.lang.Object r0 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
        L_0x0116:
            java.lang.Object r6 = org.json.JSONObject.NULL     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            if (r0 != r6) goto L_0x0127
            com.facebook.t r6 = new com.facebook.t     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            r6.<init>(r8, r1, r0, r11)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
        L_0x0123:
            r5.add(r6)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            goto L_0x0160
        L_0x0127:
            com.facebook.k r6 = new com.facebook.k     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.lang.String r10 = "Got unexpected object type in response, class: "
            r7.<init>(r10)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.lang.String r0 = r0.getSimpleName()     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            r7.append(r0)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            java.lang.String r0 = r7.toString()     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
            throw r6     // Catch:{ JSONException -> 0x0152, k -> 0x0143 }
        L_0x0143:
            r0 = move-exception
            com.facebook.t r6 = new com.facebook.t
            com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
            r7.<init>(r1, r0)
            r6.<init>(r8, r1, r7)
            r5.add(r6)
            goto L_0x0160
        L_0x0152:
            r0 = move-exception
            com.facebook.t r6 = new com.facebook.t
            com.facebook.FacebookRequestError r7 = new com.facebook.FacebookRequestError
            r7.<init>(r1, r0)
            r6.<init>(r8, r1, r7)
            r5.add(r6)
        L_0x0160:
            int r4 = r4 + 1
            r6 = 0
            r7 = 1
            goto L_0x0066
        L_0x0166:
            return r5
        L_0x0167:
            com.facebook.k r0 = new com.facebook.k
            java.lang.String r1 = "Unexpected number of results"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C14696t.m30058a(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
    }

    private C14696t(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
    }

    private C14696t(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
    }

    private C14696t(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.f38088f = graphRequest;
        this.f38083a = httpURLConnection;
        this.f38087e = str;
        this.f38084b = jSONObject;
        this.f38085c = jSONArray;
        this.f38086d = facebookRequestError;
    }
}
