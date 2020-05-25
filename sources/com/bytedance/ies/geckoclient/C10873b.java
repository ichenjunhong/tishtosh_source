package com.bytedance.ies.geckoclient;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.geckoclient.C10880d;
import com.bytedance.ies.geckoclient.model.C10947a;
import com.bytedance.ies.geckoclient.model.C10947a.C10948a;
import com.bytedance.ies.geckoclient.model.C10947a.C10949b;
import com.bytedance.ies.geckoclient.model.C10947a.C10950c;
import com.bytedance.ies.geckoclient.model.C10947a.C10951d;
import com.bytedance.ies.geckoclient.model.C10952b;
import com.bytedance.ies.geckoclient.model.C10956c;
import com.bytedance.ies.geckoclient.model.C10957d;
import com.bytedance.ies.geckoclient.model.C10961h;
import com.bytedance.ies.geckoclient.p680b.C10877b;
import com.bytedance.ies.geckoclient.p682d.C10881a;
import com.bytedance.ies.geckoclient.p686e.C10935b;
import com.bytedance.ies.geckoclient.p686e.C10938c;
import com.bytedance.ies.geckoclient.p686e.C10939d;
import com.bytedance.ies.geckoclient.p686e.C10941f;
import com.bytedance.ies.geckoclient.p686e.C10944h;
import com.google.gson.p1077b.C17956a;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.geckoclient.b */
final class C10873b extends C10864a {

    /* renamed from: b */
    private Context f29182b;

    /* renamed from: c */
    private C10885e f29183c;

    /* renamed from: d */
    private List<C10957d> f29184d;

    /* renamed from: e */
    private C10896f f29185e;

    /* renamed from: f */
    private C10900j f29186f;

    /* renamed from: g */
    private C10956c f29187g;

    /* renamed from: h */
    private boolean f29188h;

    /* renamed from: i */
    private String f29189i;

    /* renamed from: j */
    private String f29190j;

    /* renamed from: k */
    private Map<String, String> f29191k;

    /* renamed from: l */
    private Map<String, Object> f29192l;

    /* renamed from: a */
    private String m22044a() {
        HashMap hashMap = new HashMap();
        if (this.f29191k != null) {
            hashMap.putAll(this.f29191k);
        }
        Context context = this.f29182b;
        C10956c cVar = this.f29187g;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("app_name", C10939d.m22198a(context));
        hashMap2.put("aid", String.valueOf(cVar.f29400d));
        hashMap2.put("ac", C10939d.m22199b(context));
        hashMap2.put("os_version", String.valueOf(VERSION.SDK_INT));
        hashMap2.put("device_platform", "android");
        hashMap2.put("device_type", Build.MODEL);
        hashMap2.put("device_id", cVar.f29399c);
        hashMap.putAll(hashMap2);
        StringBuilder sb = new StringBuilder();
        for (Entry entry : hashMap.entrySet()) {
            sb.append("&");
            sb.append(URLEncoder.encode((String) entry.getKey()));
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue()));
        }
        return sb.substring(1, sb.length());
    }

    /* renamed from: b */
    private Map<String, C10950c> m22045b() {
        HashMap hashMap = new HashMap();
        File[] listFiles = new File(this.f29189i).getParentFile().listFiles();
        if (listFiles == null) {
            return hashMap;
        }
        for (File file : listFiles) {
            File[] listFiles2 = file.listFiles();
            if (listFiles2 != null) {
                C10950c cVar = (C10950c) hashMap.get(file.getName());
                if (cVar == null) {
                    cVar = new C10950c();
                    hashMap.put(file.getName(), cVar);
                }
                for (File file2 : listFiles2) {
                    if (!file2.isFile() && !".inactive".equals(file2.getName())) {
                        if (cVar.f29372a.size() > 200) {
                            return hashMap;
                        }
                        String name = file2.getName();
                        if (name.endsWith("--PendingDelete")) {
                            name = name.substring(0, name.indexOf("--PendingDelete"));
                        }
                        cVar.f29372a.add(new C10948a(name));
                    }
                }
                continue;
            }
        }
        return hashMap;
    }

    public final void run() {
        List list;
        if (this.f29184d != null && this.f29185e != null && this.f29167a != null && !TextUtils.isEmpty(this.f29167a.f29198a)) {
            HashMap hashMap = new HashMap();
            for (C10957d dVar : this.f29184d) {
                hashMap.put(dVar.f29403c, dVar);
            }
            this.f29186f.mo19698a((Map<String, C10957d>) hashMap);
            String str = this.f29187g.f29397a;
            C10941f.m22204a().mo19727a(str);
            if (C10941f.m22204a().f29355a) {
                this.f29186f.mo19697a((Iterable<C10957d>) this.f29184d, this.f29190j, this.f29189i);
            } else {
                this.f29186f.mo19699a((Map<String, C10957d>) hashMap, this.f29190j, this.f29189i);
            }
            C10941f.m22204a().mo19730b(str);
            String a = m22044a();
            String b = C10877b.m22046a().f29196a.mo34889b(m22043a(this.f29184d));
            StringBuilder sb = new StringBuilder("https://");
            sb.append(this.f29167a.f29198a);
            sb.append("gecko/server/v2/package?");
            sb.append(a);
            String sb2 = sb.toString();
            new StringBuilder("check update :").append(sb2);
            try {
                String a2 = C10881a.m22061a(sb2, b);
                C10961h hVar = (C10961h) C10877b.m22046a().f29196a.mo34885a(a2, new C17956a<C10961h<C10952b>>() {
                }.f49843c);
                new JSONObject(a2);
                if (hVar.f29430a != 0) {
                    if (hVar.f29430a != 2000) {
                        StringBuilder sb3 = new StringBuilder("response=");
                        sb3.append(a2);
                        throw new NetworkErrorException(sb3.toString());
                    }
                }
                Context context = this.f29182b;
                try {
                    list = C10935b.m22191a(context, ((C10952b) hVar.f29431b).f29384b, new File(this.f29189i).getParentFile());
                } catch (Exception unused) {
                    list = null;
                }
                if (list != null) {
                    C10944h hVar2 = C10944h.f29357a;
                    hVar2.f29358b.post(new Runnable(context, list) {

                        /* renamed from: a */
                        final /* synthetic */ Context f29345a;

                        /* renamed from: b */
                        final /* synthetic */ List f29346b;

                        public final void run() {
                            String str;
                            String str2;
                            try {
                                Context context = this.f29345a;
                                List<C10937a> list = this.f29346b;
                                if (list != null) {
                                    if (!list.isEmpty()) {
                                        for (C10937a aVar : list) {
                                            File file = aVar.f29351e;
                                            File file2 = aVar.f29352f;
                                            long currentTimeMillis = System.currentTimeMillis();
                                            boolean b = C10880d.m22056b(file);
                                            boolean a = C10880d.m22054a(file2);
                                            long currentTimeMillis2 = System.currentTimeMillis();
                                            if (!b || !a) {
                                                C10938c a2 = C10938c.m22193a(context);
                                                String str3 = aVar.f29347a;
                                                String str4 = aVar.f29348b;
                                                int i = aVar.f29349c;
                                                int i2 = aVar.f29350d;
                                                StringBuilder sb = new StringBuilder();
                                                if (b) {
                                                    str = "";
                                                } else {
                                                    str = "zip包删除失败";
                                                }
                                                sb.append(str);
                                                if (a) {
                                                    str2 = "";
                                                } else {
                                                    str2 = " 解压文件删除失败";
                                                }
                                                sb.append(str2);
                                                a2.mo19724a(str3, str4, i, 201, i2, 601, sb.toString(), currentTimeMillis2 - currentTimeMillis, 1);
                                            } else {
                                                C10938c.m22193a(context).mo19724a(aVar.f29347a, aVar.f29348b, aVar.f29349c, 200, aVar.f29350d, 0, null, currentTimeMillis2 - currentTimeMillis, 1);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }

                        {
                            this.f29345a = r1;
                            this.f29346b = r2;
                        }
                    });
                }
                List list2 = (List) ((C10952b) hVar.f29431b).f29383a.get(this.f29187g.f29397a);
                C10896f fVar = this.f29185e;
                List<C10957d> list3 = this.f29184d;
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                fVar.mo19658a(list3, list2, this.f29188h);
            } catch (Exception e) {
                this.f29185e.mo19654a(e);
                new StringBuilder("check update fail:").append(e.toString());
                try {
                    C10903m mVar = new C10903m(this.f29183c);
                    mVar.f29263a.f29451b.addAll(C10938c.m22193a(this.f29182b).mo19723a());
                    C10904n nVar = new C10904n(this.f29167a);
                    nVar.f29264b = mVar;
                    nVar.run();
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    private C10947a m22043a(List<C10957d> list) {
        C10947a aVar = new C10947a();
        String a = C10939d.m22198a(this.f29182b);
        String b = C10939d.m22199b(this.f29182b);
        StringBuilder sb = new StringBuilder();
        sb.append(C10939d.m22200c(this.f29182b));
        C10951d dVar = new C10951d(this.f29187g.f29400d, this.f29187g.f29398b, this.f29187g.f29399c, a, b, sb.toString());
        aVar.f29364a = dVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C10957d dVar2 = (C10957d) list.get(i);
            if (dVar2 != null) {
                arrayList.add(new C10949b(dVar2.f29403c, dVar2.f29401a));
            }
        }
        aVar.mo19772a(this.f29187g.f29397a, arrayList);
        aVar.f29366c = m22045b();
        HashMap hashMap = new HashMap();
        hashMap.put(this.f29183c.mo19664b(), this.f29192l);
        aVar.f29367d = hashMap;
        return aVar;
    }

    C10873b(Context context, C10885e eVar, C10881a aVar, List<C10957d> list, C10900j jVar, C10956c cVar, boolean z, C10896f fVar, String str, String str2, Map<String, String> map, Map<String, Object> map2) {
        super(aVar);
        this.f29182b = context;
        this.f29183c = eVar;
        this.f29188h = z;
        this.f29184d = list;
        this.f29185e = fVar;
        this.f29186f = jVar;
        this.f29187g = cVar;
        this.f29189i = str2;
        this.f29190j = str;
        this.f29191k = map;
        this.f29192l = map2;
    }
}
