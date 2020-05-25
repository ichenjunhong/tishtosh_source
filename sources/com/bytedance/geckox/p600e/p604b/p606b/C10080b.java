package com.bytedance.geckox.p600e.p604b.p606b;

import android.util.Pair;
import com.bytedance.geckox.buffer.C10053a;
import com.bytedance.geckox.buffer.p597a.C10054a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p598c.C10061b;
import com.bytedance.geckox.p611i.C10117b;
import com.bytedance.geckox.utils.C10161i;
import com.bytedance.p782n.C12378b;
import com.bytedance.p782n.C12382d;

/* renamed from: com.bytedance.geckox.e.b.b.b */
public class C10080b extends C12382d<Pair<C10053a, UpdatePackage>, Pair<C10053a, UpdatePackage>> {
    /* renamed from: a_ */
    public final /* synthetic */ Object mo18063a_(C12378b bVar, Object obj) throws Throwable {
        return m20327a(bVar, (Pair) obj);
    }

    /* renamed from: a */
    private static Object m20327a(C12378b<Pair<C10053a, UpdatePackage>> bVar, Pair<C10053a, UpdatePackage> pair) throws Throwable {
        C10117b.m20388a("gecko-debug-tag", "开始校验zip增量包 channel:", ((UpdatePackage) pair.second).getChannel());
        C10053a aVar = (C10053a) pair.first;
        aVar.mo18041b(0);
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        try {
            C10161i.m20487a(new C10054a(aVar), updatePackage.getPatch().getMd5());
            return bVar.mo23391a(pair);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("校验zip增量包失败 channel:");
            sb.append(updatePackage.getChannel());
            sb.append(", pkg id:");
            sb.append(updatePackage.getPatch().getId());
            sb.append(", caused by:");
            sb.append(th.getMessage());
            throw new C10061b(sb.toString(), th);
        }
    }
}
