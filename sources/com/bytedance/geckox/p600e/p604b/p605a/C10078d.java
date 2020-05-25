package com.bytedance.geckox.p600e.p604b.p605a;

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

/* renamed from: com.bytedance.geckox.e.b.a.d */
public class C10078d extends C12382d<Pair<C10053a, UpdatePackage>, Pair<File, UpdatePackage>> {
    /* renamed from: a_ */
    public final /* synthetic */ Object mo18063a_(C12378b bVar, Object obj) throws Throwable {
        return m20323a(bVar, (Pair) obj);
    }

    /* renamed from: a */
    private static Object m20323a(C12378b<Pair<File, UpdatePackage>> bVar, Pair<C10053a, UpdatePackage> pair) throws Throwable {
        C10117b.m20388a("gecko-debug-tag", "开始解压全量zip包 channel:", ((UpdatePackage) pair.second).getChannel());
        C10053a aVar = (C10053a) pair.first;
        aVar.mo18041b(0);
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File parentFile = aVar.mo18045f().getParentFile();
        try {
            C10169n.m20494a(new C10054a(aVar), parentFile.getAbsolutePath(), updatePackage.getChannel());
            aVar.mo18035a();
            File file = new File(parentFile, "res");
            C10154d.m20480a(file);
            if (new File(parentFile, updatePackage.getChannel()).renameTo(file)) {
                return bVar.mo23391a(new Pair(aVar.mo18045f(), updatePackage));
            }
            StringBuilder sb = new StringBuilder("重命名解压后的全量zip文件失败:");
            sb.append(parentFile.getAbsolutePath());
            sb.append(", dest:");
            sb.append(file.getAbsolutePath());
            sb.append(", exist?");
            sb.append(file.exists());
            throw new RuntimeException(sb.toString());
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("解压全量zip包失败，channel:");
            sb2.append(updatePackage.getChannel());
            sb2.append(", pkg id:");
            sb2.append(updatePackage.getFullPackage().getId());
            sb2.append(", dir:");
            sb2.append(parentFile.getAbsolutePath());
            sb2.append(", caused by:");
            sb2.append(e.getMessage());
            throw new RuntimeException(sb2.toString(), e);
        }
    }
}
