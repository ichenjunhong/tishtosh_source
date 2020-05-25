package com.p683ss.android.ugc.aweme.sticker.p2278b;

import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.p574e.C9917l;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p683ss.android.ugc.aweme.common.p1592d.C26864a;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1677a.C29190b;
import com.p683ss.android.ugc.aweme.effect.p1676e.p1678b.C29192b;
import com.p683ss.android.ugc.aweme.effectplatform.EffectNetworkAPI;
import com.p683ss.android.ugc.aweme.filter.C31418as.C31419a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39576ax;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2638e.C52647c;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52725c;

/* renamed from: com.ss.android.ugc.aweme.sticker.b.i */
public final class C45840i extends C29192b<C45830f, Void> {

    /* renamed from: h */
    private int f115857h;

    /* renamed from: a */
    public final boolean mo59082a() {
        return C45841j.m99680c((C45830f) this.f76498g);
    }

    /* renamed from: b */
    public final void mo59084b(C29190b<C45830f, Void> bVar) {
        C26864a aVar;
        Closeable closeable;
        Throwable th;
        Throwable th2;
        Closeable closeable2;
        C29190b<C45830f, Void> bVar2 = bVar;
        C52711k.m112240b(bVar2, "callback");
        String str = (String) ((C45830f) this.f76498g).f115836d.f118259b.get(this.f115857h);
        C45842k kVar = new C45842k(this, bVar2);
        String b = C45841j.m99676b((C45830f) this.f76498g);
        C52711k.m112236a((Object) str, "downloadUrl");
        C26864a aVar2 = kVar;
        C52711k.m112240b(str, "url");
        C52711k.m112240b(b, "filePath");
        C52711k.m112240b(aVar2, "listener");
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair a = C9917l.m19876a(str, (Map<String, String>) linkedHashMap);
            C52711k.m112236a((Object) a, "UrlUtils.parseUrl(url, queryMap)");
            String str2 = (String) a.first;
            String str3 = (String) a.second;
            C39576ax z = C39629l.m88232a().mo58595z();
            C52711k.m112236a((Object) str2, "baseUrl");
            C12799u execute = ((EffectNetworkAPI) z.retrofitCreate(str2, EffectNetworkAPI.class)).doGet(true, Integer.MAX_VALUE, str3, linkedHashMap).execute();
            InputStream in = ((TypedInput) execute.f33552b).mo9554in();
            long length = ((TypedInput) execute.f33552b).length();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(b));
            C52725c cVar = new C52725c();
            cVar.element = 0;
            C52725c cVar2 = new C52725c();
            cVar2.element = 0;
            byte[] bArr = new byte[4096];
            Closeable closeable3 = in;
            Throwable th3 = null;
            try {
                InputStream inputStream = (InputStream) closeable3;
                Closeable closeable4 = fileOutputStream;
                try {
                    FileOutputStream fileOutputStream2 = (FileOutputStream) closeable4;
                    while (true) {
                        r3 = r3;
                        Closeable closeable5 = closeable4;
                        byte[] bArr2 = bArr;
                        Closeable closeable6 = closeable3;
                        FileOutputStream fileOutputStream3 = fileOutputStream2;
                        byte[] bArr3 = bArr;
                        C26864a aVar3 = aVar2;
                        C26864a aVar4 = aVar2;
                        C52725c cVar3 = cVar2;
                        String str4 = str;
                        FileOutputStream fileOutputStream4 = fileOutputStream;
                        try {
                            C31419a aVar5 = new C31419a(inputStream, fileOutputStream, cVar, bArr2, cVar2, aVar3, str, length);
                            if (((Number) aVar5.invoke()).intValue() != -1) {
                                try {
                                    cVar3.element += cVar.element;
                                    FileOutputStream fileOutputStream5 = fileOutputStream3;
                                    fileOutputStream5.write(bArr3, 0, cVar.element);
                                    bArr = bArr3;
                                    fileOutputStream2 = fileOutputStream5;
                                    cVar2 = cVar3;
                                    closeable4 = closeable5;
                                    closeable3 = closeable6;
                                    aVar2 = aVar4;
                                    fileOutputStream = fileOutputStream4;
                                    str = str4;
                                } catch (Throwable th4) {
                                    th = th4;
                                    closeable2 = closeable5;
                                    closeable = closeable6;
                                    aVar = aVar4;
                                    str = str4;
                                    th = null;
                                    th3 = null;
                                    try {
                                        C52647c.m112189a(closeable2, th3);
                                        throw th;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        C52647c.m112189a(closeable, th);
                                        throw th;
                                    }
                                }
                            } else {
                                th = null;
                                try {
                                    C52647c.m112189a(closeable5, null);
                                    try {
                                        C52647c.m112189a(closeable6, null);
                                        aVar = aVar4;
                                        str = str4;
                                        try {
                                            aVar.mo54823a(str);
                                            return;
                                        } catch (Exception e) {
                                            e = e;
                                            aVar.mo54824a(str, e);
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        aVar = aVar4;
                                        str = str4;
                                        aVar.mo54824a(str, e);
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    closeable = closeable6;
                                    aVar = aVar4;
                                    str = str4;
                                    C52647c.m112189a(closeable, th);
                                    throw th;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            closeable2 = closeable5;
                            closeable = closeable6;
                            aVar = aVar4;
                            str = str4;
                            th = null;
                            th3 = null;
                            C52647c.m112189a(closeable2, th3);
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable2 = closeable4;
                    th = null;
                    closeable = closeable3;
                    aVar = aVar2;
                    C52647c.m112189a(closeable2, th3);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                th = null;
                closeable = closeable3;
                aVar = aVar2;
                C52647c.m112189a(closeable, th);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            aVar = aVar2;
            aVar.mo54824a(str, e);
        }
    }

    public C45840i(String str, C45830f fVar) {
        C52711k.m112240b(str, "mTaskId");
        C52711k.m112240b(fVar, "mParam");
        super(str, fVar);
    }
}
