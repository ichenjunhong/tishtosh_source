package com.p683ss.android.ugc.aweme.shortvideo;

import android.os.Bundle;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.photo.C38683l;
import com.p683ss.android.ugc.aweme.photo.publish.C38704c;
import com.p683ss.android.ugc.aweme.photomovie.C38803k;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoPublishService.Factory;
import com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44481g;
import com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44483i;
import com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44484j;
import com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k;
import com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44507t;
import com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44508u;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44386j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.PublishServiceFactoryImpl */
public class PublishServiceFactoryImpl implements Factory {
    public static Factory createShortVideoPublishService$FactorybyMonsterPlugin() {
        Object a = C27991b.m66756a(Factory.class);
        if (a != null) {
            return (Factory) a;
        }
        if (C27991b.f73473ad == null) {
            synchronized (Factory.class) {
                if (C27991b.f73473ad == null) {
                    C27991b.f73473ad = new PublishServiceFactoryImpl();
                }
            }
        }
        return (PublishServiceFactoryImpl) C27991b.f73473ad;
    }

    public C43907k buildFutureFactory(C44386j jVar) {
        boolean z;
        int i = jVar.f112318g;
        int i2 = jVar.f112317f;
        if (i == 0) {
            if (i2 != 1) {
                return new C43781eh(new TTUploaderService(0), i, i2);
            }
            TTUploaderService tTUploaderService = new TTUploaderService(0);
            String str = jVar.f112312a;
            if (jVar.f112314c != 0) {
                z = true;
            } else {
                z = false;
            }
            C42402ab abVar = new C42402ab(tTUploaderService, str, z, i, i2);
            return abVar;
        } else if (i == 5) {
            return new C38683l(new TTUploaderService(0), i, i2);
        } else {
            if (i == 6) {
                return new C38803k(new TTUploaderService(0), i, i2);
            }
            StringBuilder sb = new StringBuilder("videoType == ");
            sb.append(i);
            throw new AssertionError(sb.toString());
        }
    }

    public C44334o<C42421al> buildCallback(int i, Object obj) {
        if (i == 0 || i == 6) {
            return new C43787ek(i, obj);
        }
        return null;
    }

    public Object buildArgs(int i, Bundle bundle) {
        if (i == 0) {
            return bundle.getSerializable("args");
        }
        if (i == 5) {
            return bundle.getSerializable("args");
        }
        if (i == 6) {
            return bundle.getParcelable("args");
        }
        if (C38704c.m86062c(i)) {
            return bundle.getSerializable("args");
        }
        StringBuilder sb = new StringBuilder("video publish not surpported ");
        sb.append(i);
        C32458a.m75144a(sb.toString());
        return null;
    }

    public C43907k buildFutureFactory(int i, int i2, Bundle bundle) {
        boolean z;
        if (i == 0) {
            if (i2 != 1) {
                return new C43781eh(new TTUploaderService(0), i, i2);
            }
            TTUploaderService tTUploaderService = new TTUploaderService(0);
            String string = bundle.getString("shoot_way");
            if (bundle.getInt("pre_publish_type", 0) != 0) {
                z = true;
            } else {
                z = false;
            }
            C42402ab abVar = new C42402ab(tTUploaderService, string, z, i, i2);
            return abVar;
        } else if (i == 5) {
            return new C38683l(new TTUploaderService(0), i, i2);
        } else {
            if (i == 6) {
                return new C38803k(new TTUploaderService(0), i, i2);
            }
            StringBuilder sb = new StringBuilder("videoType == ");
            sb.append(i);
            throw new AssertionError(sb.toString());
        }
    }

    public C44481g buildPublisher(int i, boolean z, C43907k kVar, int i2, int i3, String str, boolean z2, C44334o<C42421al> oVar) {
        int i4 = i;
        if (!C39618d.f101152P.mo83103a(C40790a.EnablePublisherOpt)) {
            C44485k kVar2 = new C44485k(kVar, i, i2, i3, str, z2, oVar);
            return kVar2;
        } else if (z) {
            C44507t tVar = new C44507t(kVar, i, i2, i3, str, false, oVar);
            return tVar;
        } else if (i4 == 2) {
            C44484j jVar = new C44484j(kVar, i, i2, i3, str, z2, oVar);
            return jVar;
        } else if (i4 == 1) {
            C44483i iVar = new C44483i(kVar, i, i2, i3, str, z2, oVar);
            return iVar;
        } else {
            C44508u uVar = new C44508u(kVar, i, i2, i3, str, z2, oVar);
            return uVar;
        }
    }
}
