package com.bytedance.liko.leakdetector.strategy.miniupload;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.bytedance.liko.leakdetector.C12279a;
import com.bytedance.liko.leakdetector.p774a.C12283d;
import com.bytedance.liko.leakdetector.strategy.miniupload.hprofile.C12301a;
import com.bytedance.liko.leakdetector.strategy.miniupload.hprofile.C12302b;
import com.bytedance.liko.leakdetector.strategy.miniupload.hprofile.C12303c;
import com.bytedance.liko.leakdetector.strategy.miniupload.hprofile.UploadOOMHprofApi;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.tailor.Tailor;
import com.google.gson.C17971f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53524e;
import okhttp3.C53526f;
import okhttp3.C53673t;
import okhttp3.C53678w;
import okhttp3.C53679x;
import okhttp3.C53679x.C53680a;
import okhttp3.C53682y;
import okio.Buffer;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;
import p001a.C0013i;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2638e.C52647c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.C53068c.C53069a;
import p2666g.C53095e.C53096a;
import p2666g.C53134n.C53136a;
import p2666g.p2667a.p2668a.C53060h;
import p2666g.p2669b.p2670a.C53062a;

/* renamed from: com.bytedance.liko.leakdetector.strategy.miniupload.a */
public final class C12292a {

    /* renamed from: b */
    public static final C12293a f32414b = new C12293a(null);

    /* renamed from: a */
    final UploadOOMHprofApi f32415a;

    /* renamed from: com.bytedance.liko.leakdetector.strategy.miniupload.a$a */
    public static final class C12293a {
        private C12293a() {
        }

        public /* synthetic */ C12293a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.miniupload.a$b */
    public static final class C12294b extends C53500ac {

        /* renamed from: a */
        final /* synthetic */ C53678w f32416a;

        /* renamed from: b */
        final /* synthetic */ File f32417b;

        public final C53678w contentType() {
            return this.f32416a;
        }

        public final long contentLength() {
            return this.f32417b.length();
        }

        public final void writeTo(BufferedSink bufferedSink) {
            Closeable source;
            Throwable th;
            C52711k.m112240b(bufferedSink, "sink");
            try {
                source = Okio.source(this.f32417b);
                Source source2 = (Source) source;
                Buffer buffer = new Buffer();
                for (long read = source2.read(buffer, 2048); read != -1; read = source2.read(buffer, 2048)) {
                    bufferedSink.write(buffer, read);
                }
                bufferedSink.flush();
                C52647c.m112189a(source, null);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                C52647c.m112189a(source, th);
                throw th2;
            }
        }

        C12294b(C53678w wVar, File file) {
            this.f32416a = wVar;
            this.f32417b = file;
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.miniupload.a$c */
    static final class C12295c<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C12292a f32418a;

        /* renamed from: b */
        final /* synthetic */ Context f32419b;

        /* renamed from: c */
        final /* synthetic */ String f32420c;

        C12295c(C12292a aVar, Context context, String str) {
            this.f32418a = aVar;
            this.f32419b = context;
            this.f32420c = str;
        }

        public final /* synthetic */ Object call() {
            if (C12292a.m24773a(this.f32419b) && !TextUtils.isEmpty(this.f32420c)) {
                try {
                    File file = new File(this.f32420c);
                    if (file.exists()) {
                        if (Tailor.isHprofValid(this.f32420c)) {
                            String parent = file.getParent();
                            String str = this.f32420c;
                            StringBuilder sb = new StringBuilder();
                            sb.append(parent);
                            sb.append("/.mini.hprof");
                            String sb2 = sb.toString();
                            Tailor.tailorHprof(str, sb2);
                            File file2 = new File(sb2);
                            if (file2.exists()) {
                                new File(str).delete();
                            }
                            ArrayList arrayList = new ArrayList(4);
                            if (file2.exists()) {
                                arrayList.add(sb2);
                            } else {
                                arrayList.add(this.f32420c);
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(parent);
                            sb3.append("/.maps");
                            if (new File(sb3.toString()).exists()) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(parent);
                                sb4.append("/.maps");
                                arrayList.add(sb4.toString());
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(parent);
                                sb5.append("/.fds");
                                arrayList.add(sb5.toString());
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(parent);
                                sb6.append("/.threads");
                                arrayList.add(sb6.toString());
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(parent);
                                sb7.append("/.stacks");
                                arrayList.add(sb7.toString());
                            }
                            C12283d.m24766a(parent, "dump.xzip", (List<String>) arrayList);
                            if (file.exists()) {
                                file.delete();
                            }
                            if (file2.exists()) {
                                file2.delete();
                            }
                            if (!TextUtils.isEmpty(parent)) {
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append(parent);
                                sb8.append("/dump.xzip");
                                File file3 = new File(sb8.toString());
                                if (file3.exists()) {
                                    C12292a aVar = this.f32418a;
                                    C52711k.m112240b(file3, "file");
                                    aVar.f32415a.isNeedUploadOOMHprof(MemoryConfig.getMemoryConfig().aid, "Android").mo6529b(C2168a.m6521b()).mo6505a((C1710e<? super T>) new C12296d<Object>(aVar, file3), (C1710e<? super Throwable>) C12297e.f32423a);
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.miniupload.a$d */
    static final class C12296d<T> implements C1710e<C12303c> {

        /* renamed from: a */
        final /* synthetic */ C12292a f32421a;

        /* renamed from: b */
        final /* synthetic */ File f32422b;

        C12296d(C12292a aVar, File file) {
            this.f32421a = aVar;
            this.f32422b = file;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str;
            C12303c cVar = (C12303c) obj;
            StringBuilder sb = new StringBuilder("shouldUpload:");
            sb.append(cVar.f32448a);
            C12279a.m24757a(sb.toString());
            if (cVar.f32448a) {
                C12292a aVar = this.f32421a;
                File file = this.f32422b;
                C53680a a = new C53680a().mo111648a(C53679x.f133173e);
                if (MemoryConfig.getMemoryConfig().oversea) {
                    str = "https://api2.musical.ly/monitor/collect/c/mom_dump_collect";
                } else {
                    str = "https://i.snssdk.com/monitor/collect/c/mom_dump_collect";
                }
                C53673t f = C53673t.m114180f(str);
                if (file.exists() && file.length() != 0 && f != null) {
                    C12301a aVar2 = new C12301a("memory_object_monitor", System.currentTimeMillis());
                    MemoryConfig memoryConfig = MemoryConfig.getMemoryConfig();
                    Map linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("aid", String.valueOf(memoryConfig.aid));
                    String str2 = memoryConfig.channel;
                    C52711k.m112236a((Object) str2, "config.channel");
                    linkedHashMap.put("channel", str2);
                    String str3 = memoryConfig.device_id;
                    C52711k.m112236a((Object) str3, "config.device_id");
                    linkedHashMap.put("device_id", str3);
                    String str4 = memoryConfig.app_version;
                    C52711k.m112236a((Object) str4, "config.app_version");
                    linkedHashMap.put("app_version", str4);
                    String str5 = memoryConfig.update_versioncode;
                    C52711k.m112236a((Object) str5, "config.update_versioncode");
                    linkedHashMap.put("update_version_code", str5);
                    String str6 = memoryConfig.update_versioncode;
                    C52711k.m112236a((Object) str6, "config.update_versioncode");
                    linkedHashMap.put("current_update_version_code", str6);
                    String str7 = memoryConfig.os_version;
                    C52711k.m112236a((Object) str7, "config.os_version");
                    linkedHashMap.put("os_version", str7);
                    linkedHashMap.put("os_api", String.valueOf(memoryConfig.os_api));
                    String str8 = memoryConfig.device_model;
                    C52711k.m112236a((Object) str8, "config.device_model");
                    linkedHashMap.put("device_model", str8);
                    String str9 = memoryConfig.device_brand;
                    C52711k.m112236a((Object) str9, "config.device_brand");
                    linkedHashMap.put("device_brand", str9);
                    String str10 = memoryConfig.device_manufacturer;
                    C52711k.m112236a((Object) str10, "config.device_manufacturer");
                    linkedHashMap.put("device_manufacturer", str10);
                    String str11 = memoryConfig.packageName;
                    C52711k.m112236a((Object) str11, "config.packageName");
                    linkedHashMap.put("process_name", str11);
                    String str12 = memoryConfig.versionName;
                    C52711k.m112236a((Object) str12, "config.versionName");
                    linkedHashMap.put("version_name", str12);
                    linkedHashMap.put("version_code", String.valueOf(memoryConfig.versioncode));
                    String str13 = memoryConfig.region;
                    C52711k.m112236a((Object) str13, "config.region");
                    linkedHashMap.put("region", str13);
                    C52711k.m112240b(linkedHashMap, "map");
                    C12302b bVar = new C12302b((String) linkedHashMap.get("aid"), (String) linkedHashMap.get("channel"), (String) linkedHashMap.get("device_id"), (String) linkedHashMap.get("app_version"), (String) linkedHashMap.get("update_version_code"), (String) linkedHashMap.get("current_update_version_code"), (String) linkedHashMap.get("os_version"), (String) linkedHashMap.get("os_api"), (String) linkedHashMap.get("device_model"), (String) linkedHashMap.get("device_brand"), (String) linkedHashMap.get("device_manufacturer"), (String) linkedHashMap.get("process_name"), (String) linkedHashMap.get("version_name"), (String) linkedHashMap.get("version_code"), (String) linkedHashMap.get("region"), "Android", "android", String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis()));
                    String name = file.getName();
                    C53678w wVar = C53679x.f133173e;
                    C52711k.m112236a((Object) wVar, "MultipartBody.FORM");
                    a.mo111646a("file", name, new C12294b(wVar, file));
                    a.mo111645a("header", new C17971f().mo34889b(bVar));
                    a.mo111645a("data", new C17971f().mo34889b(aVar2));
                    C53524e a2 = new C53682y().mo111325a(new C53499a().mo111268a(f.mo111624j().mo111632b()).mo111265a((C53500ac) a.mo111650a()).mo111272c());
                    C52711k.m112236a((Object) a2, "OkHttpClient().newCall(request)");
                    a2.mo111246a(new C12298f(file));
                }
            }
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.miniupload.a$e */
    static final class C12297e<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C12297e f32423a = new C12297e();

        C12297e() {
        }

        public final /* synthetic */ void accept(Object obj) {
            C12279a.m24757a(((Throwable) obj).toString());
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.miniupload.a$f */
    public static final class C12298f implements C53526f {

        /* renamed from: a */
        final /* synthetic */ File f32424a;

        C12298f(File file) {
            this.f32424a = file;
        }

        public final void onFailure(C53524e eVar, IOException iOException) {
            C52711k.m112240b(eVar, "call");
            C52711k.m112240b(iOException, "e");
            StringBuilder sb = new StringBuilder("onFailure:");
            sb.append(iOException.toString());
            C12279a.m24757a(sb.toString());
        }

        public final void onResponse(C53524e eVar, C53504ad adVar) throws IOException {
            C52711k.m112240b(eVar, "call");
            C52711k.m112240b(adVar, "response");
            StringBuilder sb = new StringBuilder("onResponse:");
            sb.append(adVar.toString());
            C12279a.m24757a(sb.toString());
            if (this.f32424a.exists()) {
                this.f32424a.delete();
            }
        }
    }

    public C12292a() {
        String str;
        C53136a aVar = new C53136a();
        if (MemoryConfig.getMemoryConfig().oversea) {
            str = "https://api2.musical.ly";
        } else {
            str = "https://i.snssdk.com";
        }
        Object a = aVar.mo110655a(str).mo110654a((C53096a) C53062a.m112827a()).mo110653a((C53069a) C53060h.m112820a()).mo110657a().mo110651a(UploadOOMHprofApi.class);
        C52711k.m112236a(a, "retrofit.create(UploadOOMHprofApi::class.java)");
        this.f32415a = (UploadOOMHprofApi) a;
    }

    /* renamed from: a */
    public static boolean m24773a(Context context) {
        Object obj;
        if (context != null) {
            try {
                obj = context.getSystemService("connectivity");
            } catch (Exception unused) {
                return false;
            }
        } else {
            obj = null;
        }
        if (obj != null) {
            NetworkInfo a = C12299b.m24775a((ConnectivityManager) obj);
            if (a != null) {
                if (a.isAvailable()) {
                    if (1 == a.getType()) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        throw new C52857u("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    /* renamed from: a */
    public final void mo23225a(Context context, String str) {
        C52711k.m112240b(str, "dumpFilePath");
        C0013i.m16a((Callable<TResult>) new C12295c<TResult>(this, context, str));
    }
}
