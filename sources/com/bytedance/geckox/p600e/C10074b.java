package com.bytedance.geckox.p600e;

import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.model.UpdatePackage.Package;
import com.bytedance.geckox.p611i.C10117b;
import com.bytedance.p782n.C12378b;
import com.bytedance.p782n.C12393j;
import java.util.List;

/* renamed from: com.bytedance.geckox.e.b */
public class C10074b extends C12393j<UpdatePackage, UpdatePackage> {
    /* renamed from: a */
    public final /* synthetic */ String mo18065a(C12378b bVar, Object obj) {
        UpdatePackage updatePackage = (UpdatePackage) obj;
        Package patch = updatePackage.getPatch();
        if (patch == null) {
            C10117b.m20388a("gecko-debug-tag", "开始全量更新 channel:", updatePackage.getChannel());
            return "full";
        }
        List urlList = patch.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            C10117b.m20388a("gecko-debug-tag", "开始全量更新 channel:", updatePackage.getChannel());
            return "full";
        }
        C10117b.m20388a("gecko-debug-tag", "开始增量更新 channel:", updatePackage.getChannel());
        return "patch";
    }

    /* renamed from: a */
    public final /* synthetic */ String mo18066a(C12378b bVar, Object obj, Throwable th, String str) {
        UpdatePackage updatePackage = (UpdatePackage) obj;
        if ("patch".equals(str)) {
            C10117b.m20388a("gecko-debug-tag", "开始全量更新 channel:", updatePackage.getChannel());
            return "full";
        }
        StringBuilder sb = new StringBuilder("全量更新失败 caused by:");
        sb.append(th.getMessage());
        throw new RuntimeException(sb.toString(), th);
    }
}
