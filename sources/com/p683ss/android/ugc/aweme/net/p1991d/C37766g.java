package com.p683ss.android.ugc.aweme.net.p1991d;

import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.p574e.C9917l;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.retrofit2.p830a.C12685b;
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
import com.p683ss.android.http.p1169a.C19170a;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.http.p1169a.p1172b.C19181f;
import com.p683ss.android.ugc.aweme.net.IIESNetworkApi;
import com.p683ss.android.ugc.aweme.net.p1991d.C37762e.C37764a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.client.RedirectHandler;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.net.d.g */
public final class C37766g implements C18889b {

    /* renamed from: a */
    public final String f96227a;

    /* renamed from: b */
    public final C18889b f96228b;

    /* renamed from: a */
    public final boolean mo18238a(int i, String str, String str2, String str3, String str4, C18915b<String> bVar, String str5, C18919f fVar, List<C19180e> list, String[] strArr, int[] iArr) {
        return this.f96228b.mo18238a(i, str, str2, str3, str4, bVar, str5, fVar, list, strArr, iArr);
    }

    /* renamed from: a */
    public final boolean mo18239a(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, C18915b<String> bVar, String str2, C18919f fVar, List<C19180e> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) {
        return this.f96228b.mo18239a(i, str, stringBuffer, stringBuffer2, stringBuffer3, bVar, str2, fVar, list, strArr, iArr, redirectHandler);
    }

    /* renamed from: a */
    public final String mo18237a(int i, String str, C18884a aVar, C18916c<Long> cVar, long j, C18891d[] dVarArr) {
        String a = this.f96228b.mo18237a(i, str, aVar, cVar, j, dVarArr);
        C52711k.m112236a((Object) a, "abOriginClient.uploadFil…sher, id, requestHolders)");
        return a;
    }

    /* renamed from: a */
    public final String mo18235a(int i, int i2, String str, byte[] bArr, String str2, String str3) {
        C52711k.m112240b(str, "url");
        return mo18236a(i, i2, str, bArr, str2, str3, null);
    }

    /* renamed from: a */
    public final String mo18236a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<C19170a> list) {
        C52711k.m112240b(str, "url");
        ArrayList b = m84341b(list);
        m84340a(str2, b, str3);
        return m84338a(i2, str, (Map<String, String>) new HashMap<String,String>(), (TypedOutput) new TypedByteArray(str3, bArr, new String[0]), (List<C12685b>) b, (C18891d[]) null);
    }

    public C37766g(C18889b bVar) {
        C52711k.m112240b(bVar, "abOriginClient");
        this.f96228b = bVar;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(C11010c.m22282b().f29547a);
        this.f96227a = sb.toString();
    }

    /* renamed from: a */
    private static HashMap<String, String> m84339a(List<C19180e> list) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (list != null) {
            for (C19180e eVar : list) {
                Map map = hashMap;
                String a = eVar.mo39131a();
                C52711k.m112236a((Object) a, "basicNameValuePair.getName()");
                String b = eVar.mo39132b();
                C52711k.m112236a((Object) b, "basicNameValuePair.getValue()");
                map.put(a, b);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    private static ArrayList<C12685b> m84341b(List<C19170a> list) {
        boolean z;
        ArrayList<C12685b> arrayList = new ArrayList<>();
        if (list != null) {
            for (C19170a aVar : list) {
                String a = aVar.mo39116a();
                String b = aVar.mo39117b();
                if (a != null) {
                    if (a.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(new C12685b(a, b));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final byte[] mo18240a(int i, String str) {
        byte[] a = this.f96228b.mo18240a(i, str);
        C52711k.m112236a((Object) a, "abOriginClient.downloadFile(maxBytes, url)");
        return a;
    }

    /* renamed from: a */
    private static void m84340a(String str, ArrayList<C12685b> arrayList, String str2) {
        boolean z;
        if (str != null) {
            arrayList.add(new C12685b("Content-Encoding", str));
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(new C12685b("Content-Type", str2));
            }
        }
    }

    /* renamed from: a */
    public final String mo38696a(int i, int i2, String str, List<C19170a> list) {
        C52711k.m112240b(str, "url");
        return m84338a(i2, str, (Map<String, String>) new HashMap<String,String>(), (TypedOutput) null, (List<C12685b>) m84341b(list), (C18891d[]) null);
    }

    /* renamed from: a */
    private static String m84338a(int i, String str, Map<String, String> map, TypedOutput typedOutput, List<C12685b> list, C18891d[] dVarArr) throws Exception {
        C12690b bVar;
        boolean z;
        Map linkedHashMap = new LinkedHashMap();
        Pair a = C9917l.m19876a(str, linkedHashMap);
        String str2 = (String) a.second;
        IIESNetworkApi iIESNetworkApi = (IIESNetworkApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder((String) a.first).mo19925a().mo19930a(IIESNetworkApi.class);
        if (typedOutput != null) {
            bVar = iIESNetworkApi.postBody(i, str2, linkedHashMap, typedOutput, list, null);
            C52711k.m112236a((Object) bVar, "api.postBody(maxLength, …Map, body, headers, null)");
        } else {
            bVar = iIESNetworkApi.doPost(i, str2, linkedHashMap, map, list, null);
            C52711k.m112236a((Object) bVar, "api.doPost(maxLength, re… fieldMap, headers, null)");
        }
        if (dVarArr != null) {
            if (dVarArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                dVarArr[0] = new C37764a(bVar);
            }
        }
        T t = bVar.execute().f33552b;
        C52711k.m112236a((Object) t, "call.execute().body()");
        return (String) t;
    }

    /* renamed from: a */
    public final String mo18232a(int i, int i2, String str, List<C19180e> list, C18884a aVar, C18891d[] dVarArr) {
        C52711k.m112240b(str, "url");
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        if (list != null) {
            for (C19180e eVar : list) {
                multipartTypedOutput.addPart(eVar.mo39131a(), new TypedString(eVar.mo39132b()));
            }
        }
        if (aVar != null) {
            for (C18887c cVar : aVar.f52090a) {
                if (cVar instanceof C18888d) {
                    Object b = cVar.mo38695b();
                    if (b != null) {
                        multipartTypedOutput.addPart(cVar.mo38694a(), new TypedString((String) b));
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.String");
                    }
                } else if (cVar instanceof C18885a) {
                    C18885a aVar2 = (C18885a) cVar;
                    Object b2 = aVar2.mo38695b();
                    if (b2 != null) {
                        multipartTypedOutput.addPart(aVar2.mo38694a(), new TypedByteArray(null, (byte[]) b2, aVar2.f52093c));
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.ByteArray");
                    }
                } else if (cVar instanceof C18886b) {
                    Object b3 = cVar.mo38695b();
                    if (b3 != null) {
                        multipartTypedOutput.addPart(cVar.mo38694a(), new TypedFile(null, (File) b3));
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.io.File");
                    }
                } else {
                    continue;
                }
            }
        }
        return m84338a(i2, str, (Map<String, String>) new HashMap<String,String>(), (TypedOutput) multipartTypedOutput, null, dVarArr);
    }

    /* renamed from: b */
    public final String mo38697b(int i, int i2, String str, List<C19180e> list, boolean z, C18891d[] dVarArr, List<C19170a> list2) {
        C52711k.m112240b(str, "url");
        return m84338a(i2, str, (Map<String, String>) m84339a(list), (TypedOutput) null, (List<C12685b>) m84341b(list2), (C18891d[]) null);
    }

    /* renamed from: b */
    public final String mo38698b(int i, int i2, String str, byte[] bArr, String str2, String str3, List<C19170a> list) {
        C52711k.m112240b(str, "url");
        ArrayList b = m84341b(list);
        m84340a(str2, b, str3);
        return m84338a(i2, str, (Map<String, String>) new HashMap<String,String>(), (TypedOutput) new TypedByteArray(str3, bArr, new String[0]), (List<C12685b>) b, (C18891d[]) null);
    }

    /* renamed from: a */
    public final String mo18234a(int i, int i2, String str, List<C19180e> list, boolean z, C18891d[] dVarArr, List<C19170a> list2) {
        C52711k.m112240b(str, "url");
        return m84338a(i2, str, (Map<String, String>) m84339a(list), (TypedOutput) null, (List<C12685b>) m84341b(list2), dVarArr);
    }

    /* renamed from: a */
    public final String mo18233a(int i, int i2, String str, List<C19170a> list, boolean z, boolean z2, C19181f fVar, boolean z3) {
        int i3 = i2;
        String str2 = str;
        T t = ((IIESNetworkApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(this.f96227a).mo19925a().mo19930a(IIESNetworkApi.class)).doGet(true, i3, str2, new HashMap(), m84341b(list), null).execute().f33552b;
        C52711k.m112236a((Object) t, "ServiceManager.get().get…)\n                .body()");
        return (String) t;
    }
}
