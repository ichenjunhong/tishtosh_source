package com.bytedance.geckox.p600e.p604b.p606b;

import android.util.Pair;
import com.bytedance.geckox.buffer.C10053a;
import com.bytedance.geckox.buffer.p597a.C10054a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p611i.C10117b;
import com.bytedance.geckox.utils.C10154d;
import com.bytedance.geckox.utils.C10169n;
import com.bytedance.p782n.C12378b;
import com.bytedance.p782n.C12382d;
import java.io.File;

/* renamed from: com.bytedance.geckox.e.b.b.f */
public class C10084f extends C12382d<Pair<C10053a, UpdatePackage>, Pair<File, UpdatePackage>> {
    /* renamed from: a_ */
    public final /* synthetic */ Object mo18063a_(C12378b bVar, Object obj) throws Throwable {
        return m20336a(bVar, (Pair) obj);
    }

    /* renamed from: a */
    private static Object m20336a(C12378b<Pair<File, UpdatePackage>> bVar, Pair<C10053a, UpdatePackage> pair) throws Throwable {
        C10117b.m20388a("gecko-debug-tag", "开始解压合成后的zip包 channel:", ((UpdatePackage) pair.second).getChannel());
        C10053a aVar = (C10053a) pair.first;
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        aVar.mo18041b(0);
        File parentFile = aVar.mo18045f().getParentFile();
        try {
            C10169n.m20494a(new C10054a(aVar), parentFile.getAbsolutePath(), updatePackage.getChannel());
            aVar.mo18035a();
            File file = new File(parentFile, "res");
            C10154d.m20480a(file);
            if (new File(parentFile, updatePackage.getChannel()).renameTo(file)) {
                return bVar.mo23391a(new Pair(aVar.mo18045f(), updatePackage));
            }
            StringBuilder sb = new StringBuilder("重命名解压合成后的zip包失败:");
            sb.append(parentFile.getAbsolutePath());
            throw new RuntimeException(sb.toString());
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("解压合成后的zip包失败 channel:");
            sb2.append(updatePackage.getChannel());
            sb2.append(", pkg id:");
            sb2.append(updatePackage.getPatch().getId());
            sb2.append(e.getMessage());
            throw new RuntimeException(sb2.toString(), e);
        }
    }
}
