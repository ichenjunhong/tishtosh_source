package com.bytedance.geckox.p600e.p601a.p603b;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.geckox.C10044b;
import com.bytedance.geckox.buffer.C10053a;
import com.bytedance.geckox.buffer.impl.C10057a;
import com.bytedance.geckox.buffer.p597a.C10055b;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p598c.C10060a;
import com.bytedance.geckox.p611i.C10117b;
import com.bytedance.p782n.C12378b;
import com.bytedance.p782n.C12382d;
import java.io.File;

/* renamed from: com.bytedance.geckox.e.a.b.c */
public class C10071c extends C12382d<Pair<Uri, UpdatePackage>, Pair<C10053a, UpdatePackage>> {

    /* renamed from: g */
    private C10044b f27363g;

    /* renamed from: h */
    private File f27364h;

    /* renamed from: a */
    public final void mo18064a(Object... objArr) {
        super.mo18064a(objArr);
        this.f27363g = objArr[0];
        this.f27364h = objArr[1];
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object mo18063a_(C12378b<Pair<C10053a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        C10117b.m20388a("gecko-debug-tag", "开始下载增量单文件 channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getPatch().getLength();
        File file = this.f27364h;
        StringBuilder sb = new StringBuilder();
        sb.append(updatePackage.getAccessKey());
        sb.append(File.separator);
        sb.append(updatePackage.getChannel());
        sb.append(File.separator);
        sb.append(updatePackage.getVersion());
        sb.append("--updating");
        File file2 = new File(file, sb.toString());
        file2.mkdirs();
        C10053a a = C10057a.m20267a(this.f27363g.f27280a, new File(file2, "patch.tmp"), length);
        try {
            this.f27363g.f27284e.mo18095a(uri, length, new C10055b(a));
            try {
                return bVar.mo23391a(new Pair(a, updatePackage));
            } finally {
                a.mo18044e();
            }
        } catch (Throwable th) {
            a.mo18044e();
            StringBuilder sb2 = new StringBuilder("下载增量单文件失败 url:");
            sb2.append(uri);
            sb2.append(", channel:");
            sb2.append(updatePackage.getChannel());
            sb2.append(", pkg id:");
            sb2.append(updatePackage.getPatch().getId());
            sb2.append(", caused by:");
            sb2.append(th.getMessage());
            throw new C10060a(sb2.toString(), th);
        }
    }
}
