package com.bytedance.geckox.p600e.p601a.p603b;

import android.util.Pair;
import com.bytedance.geckox.C10044b;
import com.bytedance.geckox.buffer.C10053a;
import com.bytedance.geckox.buffer.impl.C10057a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p600e.p601a.p602a.C10067b;
import com.bytedance.geckox.p611i.C10117b;
import com.bytedance.geckox.utils.BsPatch;
import com.bytedance.geckox.utils.C10154d;
import com.bytedance.p782n.C12378b;
import com.bytedance.p782n.C12382d;
import java.io.File;

/* renamed from: com.bytedance.geckox.e.a.b.d */
public class C10072d extends C12382d<Pair<C10053a, UpdatePackage>, Pair<C10053a, UpdatePackage>> {

    /* renamed from: g */
    private C10044b f27365g;

    /* renamed from: a */
    public final void mo18064a(Object... objArr) {
        super.mo18064a(objArr);
        this.f27365g = objArr[0];
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object mo18063a_(C12378b<Pair<C10053a, UpdatePackage>> bVar, Pair<C10053a, UpdatePackage> pair) throws Throwable {
        C10117b.m20388a("gecko-debug-tag", "开始合成单文件 channel:", ((UpdatePackage) pair.second).getChannel());
        C10053a aVar = (C10053a) pair.first;
        File f = aVar.mo18045f();
        aVar.mo18035a();
        aVar.mo18044e();
        File parentFile = f.getParentFile().getParentFile();
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        StringBuilder sb = new StringBuilder();
        sb.append(updatePackage.getLocalVersion());
        sb.append(File.separator);
        sb.append("res");
        File file = new File(parentFile, sb.toString());
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            StringBuilder sb2 = new StringBuilder("找不到旧的全量单文件:");
            sb2.append(file.getAbsolutePath());
            throw new RuntimeException(sb2.toString());
        }
        File file2 = listFiles[0];
        File parentFile2 = f.getParentFile();
        StringBuilder sb3 = new StringBuilder("res");
        sb3.append(File.separator);
        sb3.append(C10067b.m20300a(updatePackage, (String) updatePackage.getFullPackage().getUrlList().get(0)));
        File file3 = new File(parentFile2, sb3.toString());
        C10154d.m20480a(file3);
        try {
            BsPatch.m20465a(file2, f, file3.getParentFile(), file3.getName());
            C10154d.m20480a(f);
            C10053a a = C10057a.m20267a(this.f27365g.f27280a, file3, file3.length());
            try {
                return bVar.mo23391a(new Pair(a, updatePackage));
            } finally {
                a.mo18044e();
            }
        } catch (Exception e) {
            StringBuilder sb4 = new StringBuilder("合成单文件失败 channel：");
            sb4.append(updatePackage.getChannel());
            sb4.append(", pkg id:");
            sb4.append(updatePackage.getPatch().getId());
            sb4.append(", caused by:");
            sb4.append(e.getMessage());
            throw new RuntimeException(sb4.toString(), e);
        } catch (Throwable th) {
            C10154d.m20480a(f);
            throw th;
        }
    }
}
