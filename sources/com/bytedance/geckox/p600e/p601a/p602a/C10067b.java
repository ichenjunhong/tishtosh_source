package com.bytedance.geckox.p600e.p601a.p602a;

import android.net.Uri;
import android.text.TextUtils;
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

/* renamed from: com.bytedance.geckox.e.a.a.b */
public class C10067b extends C12382d<Pair<Uri, UpdatePackage>, Pair<C10053a, UpdatePackage>> {

    /* renamed from: g */
    private C10044b f27361g;

    /* renamed from: h */
    private File f27362h;

    /* renamed from: a */
    public final void mo18064a(Object... objArr) {
        super.mo18064a(objArr);
        this.f27361g = objArr[0];
        this.f27362h = objArr[1];
    }

    /* renamed from: a */
    public static String m20300a(UpdatePackage updatePackage, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1) {
                String substring = str.substring(lastIndexOf + 1);
                if (!TextUtils.isEmpty(substring)) {
                    return substring;
                }
                StringBuilder sb = new StringBuilder("url path illegal, url:");
                sb.append(str);
                throw new RuntimeException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder("url path illegal, url:");
            sb2.append(str);
            throw new RuntimeException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("url empty, channel:");
        sb3.append(updatePackage.getChannel());
        throw new RuntimeException(sb3.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object mo18063a_(C12378b<Pair<C10053a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        C10117b.m20388a("gecko-debug-tag", "开始下载全量单文件 channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        File file = this.f27362h;
        StringBuilder sb = new StringBuilder();
        sb.append(updatePackage.getAccessKey());
        sb.append(File.separator);
        sb.append(updatePackage.getChannel());
        sb.append(File.separator);
        sb.append(updatePackage.getVersion());
        sb.append("--updating");
        File file2 = new File(file, sb.toString());
        file2.mkdirs();
        StringBuilder sb2 = new StringBuilder("res");
        sb2.append(File.separator);
        sb2.append(m20300a(updatePackage, uri));
        C10053a a = C10057a.m20267a(this.f27361g.f27280a, new File(file2, sb2.toString()), length);
        try {
            this.f27361g.f27284e.mo18095a(uri, length, new C10055b(a));
            try {
                Object a2 = bVar.mo23391a(new Pair(a, updatePackage));
                try {
                    a.mo18044e();
                } catch (Exception unused) {
                }
                return a2;
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    a.mo18044e();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            a.mo18044e();
            StringBuilder sb3 = new StringBuilder("下载全量单文件失败 url:");
            sb3.append(uri);
            sb3.append(", channel:");
            sb3.append(updatePackage.getChannel());
            sb3.append(", pkg id:");
            sb3.append(updatePackage.getFullPackage().getId());
            sb3.append(", caused by:");
            sb3.append(th2.getMessage());
            throw new C10060a(sb3.toString(), th2);
        }
    }
}
