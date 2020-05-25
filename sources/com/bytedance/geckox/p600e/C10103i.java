package com.bytedance.geckox.p600e;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p598c.C10060a;
import com.bytedance.geckox.p598c.C10061b;
import com.bytedance.p782n.C12394k;
import java.util.List;

/* renamed from: com.bytedance.geckox.e.i */
public class C10103i extends C12394k<UpdatePackage, Pair<Uri, UpdatePackage>> {

    /* renamed from: h */
    private int f27392h;

    /* renamed from: a */
    public final /* synthetic */ Object mo18071a() {
        UpdatePackage updatePackage = (UpdatePackage) this.f32637g;
        List urlList = updatePackage.getPatch().getUrlList();
        int i = this.f27392h;
        this.f27392h = i + 1;
        return new Pair(Uri.parse((String) urlList.get(i)), updatePackage);
    }

    /* renamed from: a */
    public final boolean mo18072a(Throwable th) {
        if (this.f27392h >= ((UpdatePackage) this.f32637g).getPatch().getUrlList().size()) {
            return false;
        }
        if ((th instanceof C10060a) || (th instanceof C10061b)) {
            return true;
        }
        return false;
    }
}
