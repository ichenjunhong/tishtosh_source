package com.bytedance.geckox.p600e.p604b.p606b;

import android.util.Pair;
import com.bytedance.geckox.C10044b;
import com.bytedance.geckox.buffer.C10053a;
import com.bytedance.geckox.buffer.impl.C10057a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p611i.C10117b;
import com.bytedance.geckox.utils.BsPatch;
import com.bytedance.geckox.utils.C10154d;
import com.bytedance.p782n.C12378b;
import com.bytedance.p782n.C12382d;
import java.io.File;

/* renamed from: com.bytedance.geckox.e.b.b.d */
public class C10082d extends C12382d<Pair<C10053a, UpdatePackage>, Pair<C10053a, UpdatePackage>> {

    /* renamed from: g */
    private C10044b f27370g;

    /* renamed from: a */
    public final void mo18064a(Object... objArr) {
        super.mo18064a(objArr);
        this.f27370g = objArr[0];
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object mo18063a_(C12378b<Pair<C10053a, UpdatePackage>> bVar, Pair<C10053a, UpdatePackage> pair) throws Throwable {
        C10117b.m20388a("gecko-debug-tag", "开始合成zip包 channel:", ((UpdatePackage) pair.second).getChannel());
        C10053a aVar = (C10053a) pair.first;
        File f = aVar.mo18045f();
        aVar.mo18035a();
        aVar.mo18044e();
        File parentFile = f.getParentFile().getParentFile();
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        StringBuilder sb = new StringBuilder();
        sb.append(updatePackage.getLocalVersion());
        sb.append(File.separator);
        sb.append("res.zip");
        File file = new File(parentFile, sb.toString());
        File file2 = new File(f.getParentFile(), "res.zip");
        C10154d.m20480a(file2);
        try {
            BsPatch.m20465a(file, f, file2.getParentFile(), file2.getName());
            C10154d.m20480a(f);
            C10053a a = C10057a.m20267a(this.f27370g.f27280a, file2, file2.length());
            try {
                return bVar.mo23391a(new Pair(a, updatePackage));
            } finally {
                a.mo18044e();
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("合成zip包失败 channel：");
            sb2.append(updatePackage.getChannel());
            sb2.append(", pkg id:");
            sb2.append(updatePackage.getPatch().getId());
            sb2.append(", caused by:");
            sb2.append(e.getMessage());
            throw new RuntimeException(sb2.toString(), e);
        } catch (Throwable th) {
            C10154d.m20480a(f);
            throw th;
        }
    }
}
