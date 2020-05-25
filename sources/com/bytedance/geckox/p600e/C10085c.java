package com.bytedance.geckox.p600e;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Pair;
import com.bytedance.geckox.C10044b;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CheckRequestBodyModel.ChannelInfo;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.model.ComponentModel;
import com.bytedance.geckox.model.Response;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p594a.C10029a;
import com.bytedance.geckox.p599d.C10064b;
import com.bytedance.geckox.p607f.C10105a;
import com.bytedance.geckox.p611i.C10117b;
import com.bytedance.geckox.utils.C10151a;
import com.bytedance.geckox.utils.C10154d;
import com.bytedance.geckox.utils.C10157f;
import com.bytedance.geckox.utils.C10162j;
import com.bytedance.p782n.C12378b;
import com.bytedance.p782n.C12382d;
import com.google.gson.p1077b.C17956a;
import java.io.File;
import java.io.FileFilter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.geckox.e.c */
public class C10085c extends C12382d<List<Pair<String, Long>>, List<UpdatePackage>> {

    /* renamed from: g */
    private C10044b f27371g;

    /* renamed from: h */
    private Map<String, Object> f27372h;

    /* renamed from: i */
    private C10105a f27373i;

    /* renamed from: com.bytedance.geckox.e.c$a */
    public static class C10089a extends RuntimeException {
        C10089a(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.geckox.e.c$b */
    public static class C10090b extends RuntimeException {
        C10090b(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: com.bytedance.geckox.e.c$c */
    public static class C10091c extends RuntimeException {
        C10091c(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: a */
    public final void mo18064a(Object... objArr) {
        super.mo18064a(objArr);
        this.f27371g = objArr[0];
        this.f27372h = objArr[1];
        this.f27373i = objArr[2];
    }

    /* renamed from: b */
    private String m20341b(List<Pair<String, Long>> list) {
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        Context context = this.f27371g.f27280a;
        Common common = new Common(this.f27371g.mo18020b(), C10151a.m20473a(context), this.f27371g.f27289j, C10151a.m20474b(context), C10162j.m20488a(context));
        checkRequestBodyModel.setCommon(common);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Pair pair = (Pair) list.get(i);
            if (pair != null) {
                arrayList.add(new ChannelInfo((String) pair.first, ((Long) pair.second).longValue()));
            }
        }
        checkRequestBodyModel.setDeployments(C10029a.m20188b(this.f27371g));
        HashMap hashMap = new HashMap();
        hashMap.put(this.f27371g.mo18019a(), this.f27372h);
        checkRequestBodyModel.setCustom(hashMap);
        checkRequestBodyModel.putChannelInfo(this.f27371g.mo18019a(), arrayList);
        return C10064b.m20295a().f27360a.mo34889b(checkRequestBodyModel);
    }

    /* renamed from: a */
    private List<UpdatePackage> m20339a(List<Pair<String, Long>> list) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put("app_name", C10151a.m20474b(this.f27371g.f27280a));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27371g.mo18020b());
        hashMap.put("aid", sb.toString());
        hashMap.put("ac", C10162j.m20488a(this.f27371g.f27280a));
        hashMap.put("os_version", String.valueOf(VERSION.SDK_INT));
        hashMap.put("device_platform", "android");
        hashMap.put("device_type", Build.MODEL);
        hashMap.put("device_id", this.f27371g.f27289j);
        StringBuilder sb2 = new StringBuilder();
        for (Entry entry : hashMap.entrySet()) {
            sb2.append("&");
            sb2.append(URLEncoder.encode((String) entry.getKey()));
            sb2.append("=");
            sb2.append(URLEncoder.encode((String) entry.getValue()));
        }
        String substring = sb2.substring(1, sb2.length());
        String b = m20341b(list);
        StringBuilder sb3 = new StringBuilder("https://");
        sb3.append(this.f27371g.f27290k);
        sb3.append("/gecko/server/v2/package?");
        sb3.append(substring);
        String sb4 = sb3.toString();
        try {
            String str = this.f27371g.f27284e.mo18094a(sb4, b).f27419b;
            C10117b.m20388a("gecko-debug-tag", "response:", str);
            try {
                Response response = (Response) C10064b.m20295a().f27360a.mo34885a(str, new C17956a<Response<ComponentModel>>() {
                }.f49843c);
                if (response.status == 0) {
                    if (response.data != null) {
                        C10029a.m20186a(this.f27371g.f27280a, ((ComponentModel) response.data).getUniversalStrategies(), this.f27371g.f27293n, this.f27373i);
                        Map packages = ((ComponentModel) response.data).getPackages();
                        if (packages != null) {
                            List<UpdatePackage> list2 = (List) packages.get(this.f27371g.mo18019a());
                            if (list2 != null) {
                                for (UpdatePackage updatePackage : list2) {
                                    updatePackage.setAccessKey(this.f27371g.mo18019a());
                                    updatePackage.setLocalVersion(m20338a(list, updatePackage.getChannel()));
                                }
                                return list2;
                            }
                            throw new C10089a("检查更新接口数据错误：response.data.getPackages().get(mConfig.getAccessKey())==null");
                        }
                        throw new C10089a("检查更新接口数据错误：response.data.getPackages()==null");
                    }
                    throw new C10089a("检查更新接口数据错误：response.data==null");
                } else if (response.status == 2000) {
                    C10029a.m20187a(this.f27371g);
                    return new ArrayList();
                } else {
                    StringBuilder sb5 = new StringBuilder("检查更新接口数据错误，状态码未知，response.status：");
                    sb5.append(response.status);
                    throw new C10089a(sb5.toString());
                }
            } catch (Exception e) {
                StringBuilder sb6 = new StringBuilder("json解析失败：");
                sb6.append(str);
                sb6.append(" caused by:");
                sb6.append(e.getMessage());
                throw new C10090b(sb6.toString(), e);
            }
        } catch (Exception e2) {
            StringBuilder sb7 = new StringBuilder("请求失败：url:");
            sb7.append(sb4);
            sb7.append(", caused by:");
            sb7.append(e2.getMessage());
            throw new C10091c(sb7.toString(), e2);
        }
    }

    /* renamed from: a */
    private static long m20338a(List<Pair<String, Long>> list, String str) {
        for (Pair pair : list) {
            if (((String) pair.first).equals(str)) {
                return ((Long) pair.second).longValue();
            }
        }
        return 0;
    }

    /* renamed from: a_ */
    public final /* synthetic */ Object mo18063a_(C12378b bVar, Object obj) throws Throwable {
        List list = (List) obj;
        C10117b.m20388a("gecko-debug-tag", "开始获取后台新版本下载链接... 本机channel版本号:", list);
        List a = m20339a(list);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            UpdatePackage updatePackage = (UpdatePackage) it.next();
            long localVersion = updatePackage.getLocalVersion();
            long version = updatePackage.getVersion();
            if (version < localVersion) {
                m20340a(it, updatePackage, localVersion, version);
            }
        }
        return bVar.mo23391a(a);
    }

    /* renamed from: a */
    private void m20340a(Iterator<UpdatePackage> it, UpdatePackage updatePackage, long j, long j2) {
        C10117b.m20388a("gecko-debug-tag", updatePackage.getChannel(), "已回滚：", Long.valueOf(j), "->", Long.valueOf(j2));
        File file = this.f27371g.f27293n;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27371g.mo18019a());
        sb.append(File.separator);
        sb.append(updatePackage.getChannel());
        File[] listFiles = new File(file, sb.toString()).listFiles(new FileFilter() {
            public final boolean accept(File file) {
                return file.isDirectory();
            }
        });
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                try {
                    long parseLong = Long.parseLong(file2.getName());
                    if (parseLong > j2) {
                        String parent = file2.getParent();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(file2.getName());
                        sb2.append("--pending-delete");
                        final File file3 = new File(parent, sb2.toString());
                        file2.renameTo(file3);
                        C10157f.m20483a().execute(new Runnable() {
                            public final void run() {
                                C10154d.m20480a(file3);
                            }
                        });
                    } else if (parseLong == j2) {
                        it.remove();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
