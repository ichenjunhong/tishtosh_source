package com.bytedance.geckox.p600e;

import android.content.Context;
import android.util.Pair;
import com.bytedance.geckox.C10044b;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CheckRequestBodyModel.Group;
import com.bytedance.geckox.model.CheckRequestBodyModel.LocalChannel;
import com.bytedance.geckox.model.CheckRequestBodyModel.TargetChannel;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.model.ComponentModel;
import com.bytedance.geckox.model.Response;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p594a.C10029a;
import com.bytedance.geckox.p594a.C10039c;
import com.bytedance.geckox.p599d.C10064b;
import com.bytedance.geckox.p607f.C10105a;
import com.bytedance.geckox.p610h.C10112a;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.geckox.e.d */
public class C10092d extends C12382d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {

    /* renamed from: g */
    private C10044b f27378g;

    /* renamed from: h */
    private Map<String, Map<String, Object>> f27379h;

    /* renamed from: i */
    private Map<String, List<TargetChannel>> f27380i;

    /* renamed from: j */
    private C10105a f27381j;

    /* renamed from: k */
    private String f27382k;

    /* renamed from: com.bytedance.geckox.e.d$a */
    public static class C10096a extends RuntimeException {
        C10096a(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.geckox.e.d$b */
    public static class C10097b extends RuntimeException {
        C10097b(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: com.bytedance.geckox.e.d$c */
    public static class C10098c extends RuntimeException {
        C10098c(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: b */
    private static void m20349b(List<Pair<String, C10112a>> list) {
        if (list != null) {
            for (Pair pair : list) {
                try {
                    ((C10112a) pair.second).mo18090a();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m20348a(List<UpdatePackage> list) {
        if (!list.isEmpty()) {
            for (UpdatePackage updatePackage : list) {
                C10039c.m20200a(new File(new File(this.f27378g.f27293n, updatePackage.getAccessKey()), updatePackage.getChannel()).getAbsolutePath());
            }
        }
    }

    /* renamed from: c */
    private List<Pair<String, C10112a>> m20350c(List<UpdatePackage> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UpdatePackage updatePackage : list) {
            try {
                File file = new File(new File(this.f27378g.f27293n, updatePackage.getAccessKey()), updatePackage.getChannel());
                if (file.isFile()) {
                    C10154d.m20480a(file);
                }
                if (!file.mkdirs()) {
                    if (!file.isDirectory()) {
                        C10117b.m20388a("gecko-debug-tag", "无法创建channel目录：", file.getAbsolutePath());
                        StringBuilder sb = new StringBuilder("can not create channel dir:");
                        sb.append(file.getAbsolutePath());
                        throw new RuntimeException(sb.toString());
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(file.getAbsolutePath());
                sb2.append(File.separator);
                sb2.append("update.lock");
                C10112a a = C10112a.m20382a(sb2.toString());
                if (a != null) {
                    arrayList.add(new Pair(updatePackage.getChannel(), a));
                    arrayList2.add(updatePackage);
                } else {
                    updatePackage.getChannel();
                }
            } catch (Exception e) {
                String channel = updatePackage.getChannel();
                C10105a aVar = this.f27381j;
                if (aVar != null) {
                    aVar.mo18076a(channel, (Throwable) e);
                }
            } catch (Throwable unused) {
            }
        }
        list.clear();
        list.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: a */
    private Map<String, List<UpdatePackage>> m20346a(Map<String, List<Pair<String, Long>>> map) throws Exception {
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        Context context = this.f27378g.f27280a;
        Common common = new Common(this.f27378g.mo18020b(), C10151a.m20473a(context), this.f27378g.f27289j, C10151a.m20474b(context), C10162j.m20488a(context), this.f27378g.f27292m, this.f27378g.f27291l);
        checkRequestBodyModel.setCommon(common);
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Pair pair : (List) entry.getValue()) {
                LocalChannel localChannel = new LocalChannel();
                localChannel.localVersion = (Long) pair.second;
                hashMap2.put(pair.first, localChannel);
            }
            hashMap.put(entry.getKey(), hashMap2);
        }
        checkRequestBodyModel.setLocal(hashMap);
        HashMap hashMap3 = new HashMap();
        for (String str : this.f27378g.f27285f) {
            Group group = new Group();
            group.groupName = this.f27382k;
            if (this.f27380i != null && !this.f27380i.isEmpty()) {
                List list = (List) this.f27380i.get(str);
                if (list != null && !list.isEmpty()) {
                    group.targetChannels = new ArrayList();
                    group.targetChannels.addAll(list);
                }
            }
            hashMap3.put(str, group);
        }
        checkRequestBodyModel.setDeployments(hashMap3);
        if (this.f27379h != null) {
            checkRequestBodyModel.setCustom(this.f27379h);
        }
        String b = C10064b.m20295a().f27360a.mo34889b(checkRequestBodyModel);
        StringBuilder sb = new StringBuilder("https://");
        sb.append(this.f27378g.f27290k);
        sb.append("/gecko/server/v3/package");
        String sb2 = sb.toString();
        try {
            String str2 = this.f27378g.f27284e.mo18094a(sb2, b).f27419b;
            C10117b.m20388a("gecko-debug-tag", "response:", str2);
            try {
                Response response = (Response) C10064b.m20295a().f27360a.mo34885a(str2, new C17956a<Response<ComponentModel>>() {
                }.f49843c);
                if (response.status == 0) {
                    if (response.data != null) {
                        C10029a.m20186a(this.f27378g.f27280a, ((ComponentModel) response.data).getUniversalStrategies(), this.f27378g.f27293n, this.f27381j);
                        Map<String, List<UpdatePackage>> packages = ((ComponentModel) response.data).getPackages();
                        if (packages != null) {
                            for (String str3 : this.f27378g.f27285f) {
                                List<UpdatePackage> list2 = (List) packages.get(str3);
                                if (list2 != null && !list2.isEmpty()) {
                                    for (UpdatePackage updatePackage : list2) {
                                        updatePackage.setAccessKey(str3);
                                        updatePackage.setLocalVersion(m20344a((List) map.get(str3), updatePackage.getChannel()));
                                    }
                                }
                            }
                            return packages;
                        }
                        throw new C10096a("检查更新接口数据错误：response.data.getPackages()==null");
                    }
                    throw new C10096a("检查更新接口数据错误：response.data==null");
                } else if (response.status == 2000) {
                    C10029a.m20187a(this.f27378g);
                    return new HashMap();
                } else {
                    StringBuilder sb3 = new StringBuilder("检查更新接口数据错误，状态码未知，response.status：");
                    sb3.append(response.status);
                    throw new C10096a(sb3.toString());
                }
            } catch (Exception e) {
                StringBuilder sb4 = new StringBuilder("json解析失败：");
                sb4.append(str2);
                sb4.append(" caused by:");
                sb4.append(e.getMessage());
                throw new C10097b(sb4.toString(), e);
            }
        } catch (Exception e2) {
            StringBuilder sb5 = new StringBuilder("请求失败：url:");
            sb5.append(sb2);
            sb5.append(", caused by:");
            sb5.append(e2.getMessage());
            throw new C10098c(sb5.toString(), e2);
        }
    }

    /* renamed from: a */
    public final void mo18064a(Object... objArr) {
        super.mo18064a(objArr);
        this.f27378g = objArr[0];
        this.f27379h = objArr[1];
        this.f27380i = objArr[2];
        this.f27381j = objArr[3];
        this.f27382k = objArr[4];
    }

    /* renamed from: a */
    private static long m20344a(List<Pair<String, Long>> list, String str) {
        for (Pair pair : list) {
            if (((String) pair.first).equals(str)) {
                return ((Long) pair.second).longValue();
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object mo18063a_(C12378b<List<UpdatePackage>> bVar, Map<String, List<Pair<String, Long>>> map) throws Throwable {
        Object obj;
        List list;
        C10117b.m20388a("gecko-debug-tag", "开始获取后台新版本下载链接... 本机channel版本号:", map);
        Map a = m20346a(map);
        for (Entry value : a.entrySet()) {
            Iterator it = ((List) value.getValue()).iterator();
            while (it.hasNext()) {
                UpdatePackage updatePackage = (UpdatePackage) it.next();
                long localVersion = updatePackage.getLocalVersion();
                long version = updatePackage.getVersion();
                if (version < localVersion) {
                    m20347a(it, updatePackage, localVersion, version);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Entry value2 : a.entrySet()) {
            arrayList.addAll((Collection) value2.getValue());
        }
        List list2 = null;
        try {
            list = m20350c(arrayList);
            try {
                obj = bVar.mo23391a(arrayList);
                m20349b(list);
                C10117b.m20388a("gecko-debug-tag", "所有channel更新结束");
            } catch (Throwable th) {
                th = th;
                list2 = list;
                m20349b(list2);
                C10117b.m20388a("gecko-debug-tag", "所有channel更新结束");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            m20349b(list2);
            C10117b.m20388a("gecko-debug-tag", "所有channel更新结束");
            throw th;
        }
        m20348a((List<UpdatePackage>) arrayList);
        return obj;
    }

    /* renamed from: a */
    private void m20347a(Iterator<UpdatePackage> it, UpdatePackage updatePackage, long j, long j2) {
        C10117b.m20388a("gecko-debug-tag", updatePackage.getChannel(), "已回滚：", Long.valueOf(j), "->", Long.valueOf(j2));
        File file = this.f27378g.f27293n;
        StringBuilder sb = new StringBuilder();
        sb.append(updatePackage.getAccessKey());
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
