package com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d.C28671c;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.PerformanceMonitorMethod */
public final class PerformanceMonitorMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C28679a f75276a = new C28679a(null);

    /* renamed from: b */
    private WeakReference<Context> f75277b;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.PerformanceMonitorMethod$a */
    public static final class C28679a {
        private C28679a() {
        }

        public /* synthetic */ C28679a(C52707g gVar) {
            this();
        }
    }

    public PerformanceMonitorMethod(WeakReference<Context> weakReference, C10757a aVar) {
        C52711k.m112240b(weakReference, "contextRef");
        C52711k.m112240b(aVar, "jsBridge");
        super(aVar);
        this.f75277b = weakReference;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        JSONObject jSONObject2 = jSONObject;
        C29789a aVar2 = aVar;
        if (jSONObject2 != null) {
            try {
                String string = jSONObject2.getString("pageName");
                String string2 = jSONObject2.getString("logType");
                String string3 = jSONObject2.getString("feFlag");
                String string4 = jSONObject2.getString("timestamp");
                C52711k.m112236a((Object) string4, "params.getString(\"timestamp\")");
                long parseLong = Long.parseLong(string4);
                if (TextUtils.equals(string2, "pageLoadTime")) {
                    if (C28668d.f75241a == null) {
                        C28668d.f75241a = new HashMap<>();
                    }
                    HashMap<String, Long> hashMap = C28668d.f75241a;
                    if (hashMap == null) {
                        C52711k.m112234a();
                    }
                    hashMap.put(string, Long.valueOf(parseLong));
                } else if (TextUtils.equals(string2, "renderTime")) {
                    C52711k.m112236a((Object) string, "pageName");
                    C52711k.m112236a((Object) string3, "feFlag");
                    C52711k.m112240b(string, "pageName");
                    C52711k.m112240b(string3, "feFlag");
                    if (C28668d.f75241a != null) {
                        HashMap<String, Long> hashMap2 = C28668d.f75241a;
                        if (hashMap2 == null) {
                            C52711k.m112234a();
                        }
                        if (hashMap2.containsKey(string) && C28668d.f75242b != null) {
                            HashMap<String, Long> hashMap3 = C28668d.f75242b;
                            if (hashMap3 == null) {
                                C52711k.m112234a();
                            }
                            if (hashMap3.containsKey(string)) {
                                HashMap<String, Long> hashMap4 = C28668d.f75242b;
                                if (hashMap4 == null) {
                                    C52711k.m112234a();
                                }
                                Object remove = hashMap4.remove(string);
                                if (remove == null) {
                                    C52711k.m112234a();
                                }
                                C52711k.m112236a(remove, "monitorStartMap!!.remove(pageName)!!");
                                long longValue = ((Number) remove).longValue();
                                HashMap<String, Long> hashMap5 = C28668d.f75241a;
                                if (hashMap5 == null) {
                                    C52711k.m112234a();
                                }
                                Object remove2 = hashMap5.remove(string);
                                if (remove2 == null) {
                                    C52711k.m112234a();
                                }
                                C52711k.m112236a(remove2, "componentDidMountMap!!.remove(pageName)!!");
                                long longValue2 = ((Number) remove2).longValue();
                                if (longValue > 0 && longValue2 > 0) {
                                    if (parseLong > 0) {
                                        long j = longValue2 - longValue;
                                        long j2 = parseLong - longValue2;
                                        long j3 = parseLong - longValue;
                                        if (j > 0 && j2 > 0) {
                                            if (j3 > 0) {
                                                C28671c cVar = new C28671c(j, j2, j3, string, string3);
                                                C0013i.m18a((Callable<TResult>) cVar, (Executor) C26890h.m65003a());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                C28668d.m67931a(e, "PerformanceMonitorMethod");
                aVar2.mo60038a(0, e.getMessage());
                return;
            }
        }
        aVar2.mo60039a((Object) new JSONArray());
    }
}
