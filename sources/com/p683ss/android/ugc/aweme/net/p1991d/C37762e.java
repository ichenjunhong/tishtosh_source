package com.p683ss.android.ugc.aweme.net.p1991d;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.p574e.C9917l;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.ttnet.p885c.C13302e;
import com.bytedance.ttnet.p887e.C13333g;
import com.p683ss.android.common.p1144c.C18889b;
import com.p683ss.android.common.p1144c.C18891d;
import com.p683ss.android.common.p1144c.p1145a.C18884a;
import com.p683ss.android.common.p1144c.p1145a.C18884a.C18885a;
import com.p683ss.android.common.p1144c.p1145a.C18884a.C18886b;
import com.p683ss.android.common.p1144c.p1145a.C18884a.C18887c;
import com.p683ss.android.common.p1144c.p1145a.C18884a.C18888d;
import com.p683ss.android.common.util.C18915b;
import com.p683ss.android.common.util.C18916c;
import com.p683ss.android.common.util.C18919f;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.common.util.NetworkUtils.C18912i;
import com.p683ss.android.http.p1169a.C19170a;
import com.p683ss.android.http.p1169a.p1170a.C19174b;
import com.p683ss.android.http.p1169a.p1172b.C19176a;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.http.p1169a.p1172b.C19181f;
import com.p683ss.android.ugc.aweme.net.IIESNetworkApi;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.apache.http.client.RedirectHandler;

/* renamed from: com.ss.android.ugc.aweme.net.d.e */
public class C37762e implements C18889b {

    /* renamed from: e */
    private static Map<String, C12792q> f96217e = new HashMap();

    /* renamed from: a */
    C13302e f96218a;

    /* renamed from: b */
    C37761d f96219b;

    /* renamed from: c */
    private final String f96220c = " cronet/1.0.3.2";

    /* renamed from: d */
    private List<C12727a> f96221d = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.net.d.e$a */
    public static class C37764a implements C18891d {

        /* renamed from: a */
        C12690b f96225a;

        /* renamed from: a */
        public final void mo18243a() {
            if (this.f96225a != null) {
                this.f96225a.cancel();
            }
        }

        public C37764a(C12690b bVar) {
            this.f96225a = bVar;
        }
    }

    /* renamed from: a */
    public final byte[] mo18240a(int i, String str) throws Exception {
        if (C9431p.m18664a(str)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair a = C9917l.m19876a(str, (Map<String, String>) linkedHashMap);
        String str2 = (String) a.first;
        String str3 = (String) a.second;
        IIESNetworkApi a2 = m84315a(str2);
        if (a2 != null) {
            C12799u execute = a2.downloadFile(true, i, str3, linkedHashMap).execute();
            if (execute.mo23960c()) {
                TypedInput typedInput = (TypedInput) execute.f33552b;
                if (typedInput != null) {
                    InputStream in = typedInput.mo9554in();
                    String a3 = m84318a(execute.mo23959b(), "Content-Length");
                    long j = -1;
                    if (a3 != null) {
                        j = Long.parseLong(a3);
                    }
                    return NetworkUtils.stream2ByteArray(i, in, j);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo18238a(int i, String str, String str2, String str3, String str4, C18915b<String> bVar, String str5, C18919f fVar, List<C19180e> list, String[] strArr, int[] iArr) throws Exception {
        final String str6 = str;
        C18919f fVar2 = fVar;
        String[] strArr2 = strArr;
        int[] iArr2 = iArr;
        if (C9431p.m18664a(str)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        String str7 = null;
        try {
            String userAgent = NetworkUtils.getUserAgent();
            if (TextUtils.isEmpty(userAgent)) {
                StringBuilder sb = new StringBuilder();
                sb.append(userAgent);
                sb.append(" cronet/1.0.3.2");
                userAgent = sb.toString();
            }
            arrayList.add(new C12685b("User-Agent", userAgent));
            if (list != null) {
                for (C19180e eVar : list) {
                    arrayList.add(new C12685b(eVar.mo39131a(), eVar.mo39132b()));
                }
            }
            if (fVar2 == null || !fVar2.f52125a) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair a = C9917l.m19876a(str6, (Map<String, String>) linkedHashMap);
                String str8 = (String) a.second;
                IIESNetworkApi a2 = m84315a((String) a.first);
                if (a2 != null) {
                    final C12690b downloadFile = a2.downloadFile(true, i, str8, linkedHashMap, arrayList, this.f96218a);
                    C12799u execute = downloadFile.execute();
                    if (execute.mo23960c()) {
                        TypedInput typedInput = (TypedInput) execute.f33552b;
                        if (typedInput != null) {
                            InputStream in = typedInput.mo9554in();
                            List<C12685b> b = execute.mo23959b();
                            long j = -1;
                            if (b != null && !b.isEmpty()) {
                                for (C12685b bVar2 : b) {
                                    if ("Content-Length".equals(bVar2.f33318a)) {
                                        String str9 = bVar2.f33319b;
                                        if (!TextUtils.isEmpty(str9)) {
                                            j = Long.parseLong(str9);
                                        }
                                    } else if ("Content-Encoding".equals(bVar2.f33318a)) {
                                        String str10 = bVar2.f33319b;
                                        if (!TextUtils.isEmpty(str10) && "gzip".equalsIgnoreCase(str10)) {
                                            in = new GZIPInputStream(in);
                                        }
                                    } else if ("x-snssdk.remoteaddr".equals(bVar2.f33318a)) {
                                        str7 = bVar2.f33319b;
                                    }
                                }
                            }
                            String str11 = str7;
                            if (iArr2 != null) {
                                try {
                                    if (iArr2.length > 0) {
                                        iArr2[0] = 0;
                                        if (j <= 2147483647L) {
                                            iArr2[0] = (int) j;
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    str7 = str11;
                                    m84319a(strArr2, str7);
                                    throw th;
                                }
                            }
                            boolean stream2File = NetworkUtils.stream2File(in, j, new C18912i() {
                                /* renamed from: a */
                                public final URI mo18241a() {
                                    try {
                                        return new URI(str6);
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }

                                /* renamed from: b */
                                public final void mo18242b() {
                                    if (downloadFile != null) {
                                        downloadFile.cancel();
                                    }
                                }
                            }, i, str2, str3, str4, bVar, str5, fVar);
                            m84319a(strArr2, str11);
                            return stream2File;
                        }
                    } else {
                        throw new C19174b(execute.mo23958a(), m84318a(execute.mo23959b(), "Reason-Phrase"));
                    }
                }
                m84319a(strArr2, (String) null);
                return false;
            }
            m84319a(strArr2, (String) null);
            return false;
        } catch (Throwable th2) {
            th = th2;
            m84319a(strArr2, str7);
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo18239a(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, C18915b<String> bVar, String str2, C18919f fVar, List<C19180e> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) throws Exception {
        return mo18238a(i, str, stringBuffer.toString(), stringBuffer2.toString(), stringBuffer3.toString(), bVar, str2, fVar, list, strArr, iArr);
    }

    /* renamed from: a */
    public final String mo18237a(int i, String str, C18884a aVar, C18916c<Long> cVar, long j, C18891d[] dVarArr) throws Exception {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        for (C18887c cVar2 : aVar.f52090a) {
            if (cVar2 instanceof C18888d) {
                multipartTypedOutput.addPart(cVar2.mo38694a(), new TypedString((String) cVar2.mo38695b()));
            } else if (cVar2 instanceof C18885a) {
                C18885a aVar2 = (C18885a) cVar2;
                multipartTypedOutput.addPart(aVar2.mo38694a(), new TypedByteArray(null, (byte[]) aVar2.mo38695b(), aVar2.f52093c));
            } else if (cVar2 instanceof C18886b) {
                multipartTypedOutput.addPart(cVar2.mo38694a(), new TypedFile(null, (File) cVar2.mo38695b()));
            }
        }
        return m84316a(0, i, str, null, (TypedOutput) multipartTypedOutput, null, (Object) this.f96218a, dVarArr);
    }

    /* renamed from: a */
    public final String mo18233a(int i, int i2, String str, List<C19170a> list, boolean z, boolean z2, C19181f fVar, boolean z3) throws Exception {
        long j;
        String str2 = str;
        C19181f fVar2 = fVar;
        if (C9431p.m18664a(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (C19170a aVar : list) {
                    String a = aVar.mo39116a();
                    String b = aVar.mo39117b();
                    if (a != null && a.length() > 0) {
                        arrayList.add(new C12685b(a, b));
                    }
                }
            } catch (Exception e) {
                e = e;
                j = currentTimeMillis;
                NetworkUtils.handleApiError(str2, e, System.currentTimeMillis() - j, null);
                throw e;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair a2 = C9917l.m19876a(str2, (Map<String, String>) linkedHashMap);
        String str3 = (String) a2.second;
        IIESNetworkApi a3 = m84315a((String) a2.first);
        if (a3 == null) {
            return null;
        }
        if (this.f96219b != null) {
            this.f96219b.mo77249a(str2);
        }
        C12690b doGet = a3.doGet(true, i2, str3, linkedHashMap, arrayList, this.f96218a);
        j = System.currentTimeMillis();
        try {
            C12799u execute = doGet.execute();
            if (this.f96219b != null) {
                this.f96219b.mo77250a(str2, execute);
            }
            long currentTimeMillis2 = System.currentTimeMillis() - j;
            m84318a(execute.mo23959b(), "X-TT-LOGID");
            if (NetworkUtils.getCommandListener() != null) {
                String a4 = NetworkUtils.getCommandListener().mo38764a();
                if (!C9431p.m18664a(a4)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C12685b bVar : execute.mo23959b()) {
                        if (a4.equalsIgnoreCase(bVar.f33318a)) {
                            arrayList2.add(bVar.f33319b);
                        }
                    }
                    NetworkUtils.getCommandListener().mo38765a(arrayList2);
                }
            }
            if (fVar2 != null) {
                for (C12685b bVar2 : execute.mo23959b()) {
                    String str4 = bVar2.f33318a;
                    if ("ETag".equalsIgnoreCase(str4) || "Last-Modified".equalsIgnoreCase(str4) || "Cache-Control".equalsIgnoreCase(str4) || "X-SS-SIGN".equalsIgnoreCase(str4) || "X-TT-LOGID".equalsIgnoreCase(str4)) {
                        fVar2.mo39137a((C19170a) new C19176a(str4, bVar2.f33319b));
                    }
                }
            }
            if (execute.mo23960c()) {
                String str5 = (String) execute.f33552b;
                NetworkUtils.handleTimeStampFromResponse(str5);
                NetworkUtils.handleApiOk(str2, currentTimeMillis2, null);
                return str5;
            }
            throw new C19174b(execute.mo23958a(), m84318a(execute.mo23959b(), "Reason-Phrase"));
        } catch (Exception e2) {
            e = e2;
            NetworkUtils.handleApiError(str2, e, System.currentTimeMillis() - j, null);
            throw e;
        }
    }

    /* renamed from: a */
    public final String mo18234a(int i, int i2, String str, List<C19180e> list, boolean z, C18891d[] dVarArr, List<C19170a> list2) throws Exception {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C19180e eVar : list) {
            hashMap.put(eVar.mo39131a(), eVar.mo39132b());
        }
        if (list2 != null) {
            for (C19170a aVar : list2) {
                arrayList.add(new C12685b(aVar.mo39116a(), aVar.mo39117b()));
            }
        }
        return m84316a(i, i2, str, (Map<String, String>) hashMap, (TypedOutput) null, (List<C12685b>) arrayList, (Object) this.f96218a, dVarArr);
    }

    /* renamed from: a */
    public final String mo18236a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<C19170a> list) throws Exception {
        String str4 = str2;
        String str5 = str3;
        ArrayList arrayList = new ArrayList();
        if (str4 != null) {
            arrayList.add(new C12685b("Content-Encoding", str2));
        }
        if (str5 != null && str3.length() > 0) {
            arrayList.add(new C12685b("Content-Type", str5));
        }
        if (list != null) {
            for (C19170a aVar : list) {
                arrayList.add(new C12685b(aVar.mo39116a(), aVar.mo39117b()));
            }
        }
        byte[] bArr2 = bArr;
        return m84316a(i, i2, str, null, (TypedOutput) new TypedByteArray(str5, bArr, new String[0]), (List<C12685b>) arrayList, (Object) this.f96218a, (C18891d[]) null);
    }

    /* renamed from: a */
    public final C37762e mo77251a(C12727a aVar) {
        if (aVar != null) {
            this.f96221d.add(aVar);
        }
        return this;
    }

    /* renamed from: a */
    private IIESNetworkApi m84315a(String str) {
        if (C9431p.m18664a(str)) {
            return null;
        }
        C12792q qVar = (C12792q) f96217e.get(str);
        if (qVar == null) {
            qVar = C13333g.m26857a(str, this.f96221d, null);
            f96217e.put(str, qVar);
        }
        return (IIESNetworkApi) C13333g.m26860a(qVar, IIESNetworkApi.class);
    }

    /* renamed from: a */
    private static String m84318a(List<C12685b> list, String str) {
        if (list != null && !TextUtils.isEmpty(str)) {
            for (C12685b bVar : list) {
                if (str.equalsIgnoreCase(bVar.f33318a)) {
                    return bVar.f33319b;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m84319a(String[] strArr, String str) {
        if (strArr != null && strArr.length != 0 && !TextUtils.isEmpty(str)) {
            try {
                strArr[0] = str;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final String mo38696a(int i, int i2, String str, List<C19170a> list) throws Exception {
        long j;
        if (C9431p.m18664a(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (C19170a aVar : list) {
                    String a = aVar.mo39116a();
                    String b = aVar.mo39117b();
                    if (a != null && a.length() > 0) {
                        arrayList.add(new C12685b(a, b));
                    }
                }
            } catch (Exception e) {
                e = e;
                j = currentTimeMillis;
                NetworkUtils.handleApiError(str, e, System.currentTimeMillis() - j, null);
                throw e;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair a2 = C9917l.m19876a(str, (Map<String, String>) linkedHashMap);
        String str2 = (String) a2.second;
        IIESNetworkApi a3 = m84315a((String) a2.first);
        if (a3 == null) {
            return null;
        }
        if (this.f96219b != null) {
            this.f96219b.mo77249a(str);
        }
        C12690b doDetete = a3.doDetete(i2, str2, linkedHashMap, arrayList, this.f96218a);
        j = System.currentTimeMillis();
        try {
            C12799u execute = doDetete.execute();
            if (this.f96219b != null) {
                this.f96219b.mo77250a(str, execute);
            }
            long currentTimeMillis2 = System.currentTimeMillis() - j;
            if (NetworkUtils.getCommandListener() != null) {
                String a4 = NetworkUtils.getCommandListener().mo38764a();
                if (!C9431p.m18664a(a4)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C12685b bVar : execute.mo23959b()) {
                        if (a4.equalsIgnoreCase(bVar.f33318a)) {
                            arrayList2.add(bVar.f33319b);
                        }
                    }
                    NetworkUtils.getCommandListener().mo38765a(arrayList2);
                }
            }
            if (execute.mo23960c()) {
                String str3 = (String) execute.f33552b;
                NetworkUtils.handleTimeStampFromResponse(str3);
                NetworkUtils.handleApiOk(str, currentTimeMillis2, null);
                return str3;
            }
            throw new C19174b(execute.mo23958a(), m84318a(execute.mo23959b(), "Reason-Phrase"));
        } catch (Exception e2) {
            e = e2;
            NetworkUtils.handleApiError(str, e, System.currentTimeMillis() - j, null);
            throw e;
        }
    }

    /* renamed from: a */
    public final String mo18235a(int i, int i2, String str, byte[] bArr, String str2, String str3) throws Exception {
        return mo18236a(i, i2, str, bArr, str2, str3, null);
    }

    /* renamed from: a */
    public final String mo18232a(int i, int i2, String str, List<C19180e> list, C18884a aVar, C18891d[] dVarArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        for (C19180e eVar : list) {
            multipartTypedOutput.addPart(eVar.mo39131a(), new TypedString(eVar.mo39132b()));
        }
        for (C18887c cVar : aVar.f52090a) {
            if (cVar instanceof C18888d) {
                multipartTypedOutput.addPart(cVar.mo38694a(), new TypedString((String) cVar.mo38695b()));
            } else if (cVar instanceof C18885a) {
                C18885a aVar2 = (C18885a) cVar;
                multipartTypedOutput.addPart(aVar2.mo38694a(), new TypedByteArray(null, (byte[]) aVar2.mo38695b(), aVar2.f52093c));
            } else if (cVar instanceof C18886b) {
                multipartTypedOutput.addPart(cVar.mo38694a(), new TypedFile(null, (File) cVar.mo38695b()));
            }
        }
        return m84316a(i, i2, str, null, (TypedOutput) multipartTypedOutput, (List<C12685b>) arrayList, (Object) this.f96218a, dVarArr);
    }

    /* renamed from: b */
    public final String mo38697b(int i, int i2, String str, List<C19180e> list, boolean z, C18891d[] dVarArr, List<C19170a> list2) throws Exception {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C19180e eVar : list) {
            hashMap.put(eVar.mo39131a(), eVar.mo39132b());
        }
        if (list2 != null) {
            for (C19170a aVar : list2) {
                arrayList.add(new C12685b(aVar.mo39116a(), aVar.mo39117b()));
            }
        }
        return m84320b(i, i2, str, hashMap, null, arrayList, this.f96218a, dVarArr);
    }

    /* renamed from: b */
    public final String mo38698b(int i, int i2, String str, byte[] bArr, String str2, String str3, List<C19170a> list) throws Exception {
        String str4 = str2;
        String str5 = str3;
        ArrayList arrayList = new ArrayList();
        if (str4 != null) {
            arrayList.add(new C12685b("Content-Encoding", str2));
        }
        if (str5 != null && str3.length() > 0) {
            arrayList.add(new C12685b("Content-Type", str5));
        }
        if (list != null) {
            for (C19170a aVar : list) {
                arrayList.add(new C12685b(aVar.mo39116a(), aVar.mo39117b()));
            }
        }
        byte[] bArr2 = bArr;
        return m84320b(i, i2, str, null, new TypedByteArray(str5, bArr, new String[0]), arrayList, this.f96218a, null);
    }

    /* renamed from: a */
    private String m84316a(int i, int i2, String str, Map<String, String> map, TypedOutput typedOutput, List<C12685b> list, Object obj, C18891d[] dVarArr) throws Exception {
        return m84317a("post", i, i2, str, map, typedOutput, list, obj, dVarArr);
    }

    /* renamed from: b */
    private String m84320b(int i, int i2, String str, Map<String, String> map, TypedOutput typedOutput, List<C12685b> list, Object obj, C18891d[] dVarArr) throws Exception {
        return m84317a("put", i, i2, str, map, typedOutput, list, obj, dVarArr);
    }

    /* renamed from: a */
    private String m84317a(String str, int i, int i2, String str2, Map<String, String> map, TypedOutput typedOutput, List<C12685b> list, Object obj, C18891d[] dVarArr) throws Exception {
        long j;
        C12690b bVar;
        Map<String, String> map2;
        String str3 = str;
        String str4 = str2;
        C18891d[] dVarArr2 = dVarArr;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        if ("get".equals(str3)) {
            throw new RuntimeException("doInternal不支持get");
        } else if (!"delete".equals(str3)) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair a = C9917l.m19876a(str4, (Map<String, String>) linkedHashMap);
                String str5 = (String) a.second;
                IIESNetworkApi a2 = m84315a((String) a.first);
                if (a2 == null) {
                    return null;
                }
                if (typedOutput == null) {
                    if (map == null) {
                        map2 = new HashMap<>();
                    } else {
                        map2 = map;
                    }
                    if ("put".equals(str3)) {
                        bVar = a2.doPut(i2, str5, linkedHashMap, map2, list, obj);
                    } else {
                        bVar = a2.doPost(i2, str5, linkedHashMap, map2, list, obj);
                    }
                } else if ("put".equals(str3)) {
                    bVar = a2.putBody(i2, str5, linkedHashMap, typedOutput, list, obj);
                } else {
                    bVar = a2.postBody(i2, str5, linkedHashMap, typedOutput, list, obj);
                }
                if (dVarArr2 != null && dVarArr2.length > 0) {
                    dVarArr2[0] = new C37764a(bVar);
                }
                j = System.currentTimeMillis();
                try {
                    if (this.f96219b != null) {
                        this.f96219b.mo77249a(str4);
                    }
                    C12799u execute = bVar.execute();
                    if (this.f96219b != null) {
                        this.f96219b.mo77250a(str4, execute);
                    }
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    m84318a(execute.mo23959b(), "X-TT-LOGID");
                    if (NetworkUtils.getCommandListener() != null) {
                        String a3 = NetworkUtils.getCommandListener().mo38764a();
                        if (!C9431p.m18664a(a3)) {
                            ArrayList arrayList = new ArrayList();
                            for (C12685b bVar2 : execute.mo23959b()) {
                                if (a3.equalsIgnoreCase(bVar2.f33318a)) {
                                    arrayList.add(bVar2.f33319b);
                                }
                            }
                            NetworkUtils.getCommandListener().mo38765a(arrayList);
                        }
                    }
                    if (execute.mo23960c()) {
                        String str6 = (String) execute.f33552b;
                        NetworkUtils.handleTimeStampFromResponse(str6);
                        NetworkUtils.handleApiOk(str4, currentTimeMillis, null);
                        return str6;
                    }
                    throw new C19174b(execute.mo23958a(), m84318a(execute.mo23959b(), "Reason-Phrase"));
                } catch (Exception e) {
                    e = e;
                    NetworkUtils.handleApiError(str4, e, System.currentTimeMillis() - j, null);
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
                j = System.currentTimeMillis();
                NetworkUtils.handleApiError(str4, e, System.currentTimeMillis() - j, null);
                throw e;
            }
        } else {
            throw new RuntimeException("doInternal暂时不支持delete");
        }
    }
}
