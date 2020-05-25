package com.bytedance.geckox.p600e.p601a.p602a;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p611i.C10117b;
import com.bytedance.geckox.utils.C10154d;
import com.bytedance.p782n.C12378b;
import com.bytedance.p782n.C12382d;
import java.io.File;

/* renamed from: com.bytedance.geckox.e.a.a.c */
public class C10068c extends C12382d<Pair<File, UpdatePackage>, Pair<String, Long>> {
    /* renamed from: a_ */
    public final /* synthetic */ Object mo18063a_(C12378b bVar, Object obj) throws Throwable {
        Pair pair = (Pair) obj;
        C10117b.m20388a("gecko-debug-tag", "开始激活全量单文件 channel:", ((UpdatePackage) pair.second).getChannel());
        File parentFile = ((File) pair.first).getParentFile().getParentFile();
        long version = ((UpdatePackage) pair.second).getVersion();
        File parentFile2 = parentFile.getParentFile();
        StringBuilder sb = new StringBuilder();
        sb.append(version);
        File file = new File(parentFile2, sb.toString());
        C10154d.m20480a(file);
        if (parentFile.renameTo(file)) {
            return bVar.mo23391a(new Pair(((UpdatePackage) pair.second).getChannel(), Long.valueOf(version)));
        }
        StringBuilder sb2 = new StringBuilder("激活全量单文件失败:");
        sb2.append(parentFile.getAbsolutePath());
        throw new RuntimeException(sb2.toString());
    }
}
