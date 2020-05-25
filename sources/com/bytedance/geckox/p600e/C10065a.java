package com.bytedance.geckox.p600e;

import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.p782n.C12376a;
import com.bytedance.p782n.C12378b;

/* renamed from: com.bytedance.geckox.e.a */
public class C10065a extends C12376a<UpdatePackage, UpdatePackage> {
    /* renamed from: a */
    public final /* synthetic */ String mo18062a(C12378b bVar, Object obj) {
        int packageType = ((UpdatePackage) obj).getPackageType();
        switch (packageType) {
            case 0:
                return "branch_zip";
            case 1:
                return "branch_single_file";
            default:
                StringBuilder sb = new StringBuilder("unknow file type: ");
                sb.append(packageType);
                throw new RuntimeException(sb.toString());
        }
    }
}
