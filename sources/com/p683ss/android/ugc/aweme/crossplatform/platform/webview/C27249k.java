package com.p683ss.android.ugc.aweme.crossplatform.platform.webview;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.net.IIESNetworkApi;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.k */
public final class C27249k {

    /* renamed from: a */
    public static final C27250a f71901a = new C27250a(null);

    /* renamed from: b */
    private static final IIESNetworkApi f71902b = ((IIESNetworkApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(Api.f61282b).mo19927c(false).mo19925a().mo19930a(IIESNetworkApi.class));

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.k$a */
    public static final class C27250a {
        private C27250a() {
        }

        public /* synthetic */ C27250a(C52707g gVar) {
            this();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final WebResourceResponse mo55640a(C12799u<TypedInput> uVar) {
        String str;
        String str2;
        WebResourceResponse webResourceResponse;
        if (uVar != null) {
            List b = uVar.mo23959b();
            C52711k.m112236a((Object) b, "ssResponse.headers()");
            if (!C23715d.m58202a((Collection<T>) b)) {
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C12685b bVar = (C12685b) it.next();
                    if (!TextUtils.isEmpty(bVar.f33318a) && !TextUtils.isEmpty(bVar.f33319b)) {
                        String str3 = bVar.f33318a;
                        C52711k.m112236a((Object) str3, "header.name");
                        if (str3 != null) {
                            String lowerCase = str3.toLowerCase();
                            C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                            if (C52711k.m112239a((Object) lowerCase, (Object) "content-type")) {
                                str = bVar.f33319b;
                                C52711k.m112236a((Object) str, "header.value");
                                break;
                            }
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
            }
            str = "";
            CharSequence charSequence = str;
            if (TextUtils.isEmpty(charSequence)) {
                return null;
            }
            if (TextUtils.isEmpty(charSequence)) {
                str2 = null;
            } else if (str != null) {
                String lowerCase2 = str.toLowerCase();
                C52711k.m112236a((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                CharSequence charSequence2 = lowerCase2;
                if (C52830p.m112456b(charSequence2, (CharSequence) "js", false, 2, (Object) null) || C52830p.m112456b(charSequence2, (CharSequence) "application/javascript", false, 2, (Object) null) || C52830p.m112456b(charSequence2, (CharSequence) "javascript", false, 2, (Object) null)) {
                    lowerCase2 = "application/x-javascript";
                } else if (C52830p.m112413c(lowerCase2, "text/css", false, 2, null) || C52830p.m112413c(lowerCase2, "css", false, 2, null)) {
                    lowerCase2 = "text/css";
                } else if (C52830p.m112456b(charSequence2, (CharSequence) "test/html", false, 2, (Object) null) || C52830p.m112456b(charSequence2, (CharSequence) "html", false, 2, (Object) null)) {
                    lowerCase2 = "text/html";
                } else if (C52830p.m112456b(charSequence2, (CharSequence) "image", false, 2, (Object) null)) {
                    int a = C52830p.m112419a(charSequence2, ";", 0, false, 6, (Object) null);
                    if (a >= 0) {
                        if (lowerCase2 != null) {
                            lowerCase2 = lowerCase2.substring(0, a);
                            C52711k.m112236a((Object) lowerCase2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                } else if (C52830p.m112456b(charSequence2, (CharSequence) "jpeg", false, 2, (Object) null) || C52830p.m112456b(charSequence2, (CharSequence) "jpg", false, 2, (Object) null)) {
                    lowerCase2 = "image/jpeg";
                } else if (C52830p.m112456b(charSequence2, (CharSequence) "png", false, 2, (Object) null)) {
                    lowerCase2 = "image/png";
                } else if (C52830p.m112456b(charSequence2, (CharSequence) "gif", false, 2, (Object) null)) {
                    lowerCase2 = "image/gif";
                } else if (C52830p.m112456b(charSequence2, (CharSequence) "woff", false, 2, (Object) null)) {
                    lowerCase2 = "font/woff";
                } else if (C52830p.m112456b(charSequence2, (CharSequence) "svg", false, 2, (Object) null)) {
                    lowerCase2 = "image/svg+xml";
                } else if (C52830p.m112456b(charSequence2, (CharSequence) ".ttf", false, 2, (Object) null)) {
                    lowerCase2 = "font/ttf";
                } else {
                    int a2 = C52830p.m112419a(charSequence2, ";", 0, false, 6, (Object) null);
                    if (a2 >= 0) {
                        if (lowerCase2 != null) {
                            lowerCase2 = lowerCase2.substring(0, a2);
                            C52711k.m112236a((Object) lowerCase2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
                str2 = lowerCase2;
            } else {
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            String str4 = "";
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Access-Control-Allow-Origin", "*");
                if (VERSION.SDK_INT < 21 || !C52711k.m112239a((Object) "font/ttf", (Object) str)) {
                    webResourceResponse = new WebResourceResponse(str2, str4, ((TypedInput) uVar.f33552b).mo9554in());
                    if (VERSION.SDK_INT >= 21) {
                        webResourceResponse.setResponseHeaders(hashMap);
                    } else {
                        try {
                            Field field = webResourceResponse.getClass().getField("mResponseHeaders");
                            C52711k.m112236a((Object) field, "headerField");
                            field.setAccessible(true);
                            field.set(webResourceResponse, hashMap);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    webResourceResponse = new WebResourceResponse(str2, str4, 200, "OK", hashMap, ((TypedInput) uVar.f33552b).mo9554in());
                }
                return webResourceResponse;
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    static C12799u<TypedInput> m65688a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12685b("accept", "*/*"));
        arrayList.add(new C12685b("accept-encoding", "gzip, deflate, br"));
        arrayList.add(new C12685b("accept-language", "en-GB,en;q=0.9,zh-CN;q=0.8,zh-TW;q=0.7,zh;q=0.6,en-US;q=0.5"));
        arrayList.add(new C12685b("x-requested-with", "com.ss.android.ugc.aweme"));
        arrayList.add(new C12685b("ttnet", "1"));
        if (!C52711k.m112239a((Object) str, (Object) str2)) {
            arrayList.add(new C12685b("referer", str));
        }
        try {
            C12799u<TypedInput> execute = f71902b.downloadFile(false, -1, str2, null, arrayList).execute();
            C52711k.m112236a((Object) execute, "response");
            if (execute.mo23960c()) {
                return execute;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
