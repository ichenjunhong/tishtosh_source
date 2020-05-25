package com.p683ss.android.ugc.aweme.shortvideo.p2204h;

import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.h.c */
public class C43873c implements C43872b {
    /* renamed from: a */
    public C40796a mo89424a() {
        return C40796a.BackCameraFilter;
    }

    /* renamed from: b */
    public C40796a mo89426b() {
        return C40796a.FrontCameraFilter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo89423a(int r4) {
        /*
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L_0x001c
            com.ss.android.ugc.aweme.property.l r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r2 = r3.mo89424a()
            boolean r1 = r1.mo83122f(r2)
            if (r1 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.property.l r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r2 = r3.mo89424a()
            int r1 = r1.mo83118b(r2)
            goto L_0x0032
        L_0x001a:
            r1 = -1
            goto L_0x0032
        L_0x001c:
            com.ss.android.ugc.aweme.property.l r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r2 = r3.mo89426b()
            boolean r1 = r1.mo83122f(r2)
            if (r1 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.property.l r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r2 = r3.mo89426b()
            int r1 = r1.mo83118b(r2)
        L_0x0032:
            if (r1 == r0) goto L_0x0035
            return r1
        L_0x0035:
            com.ss.android.ugc.aweme.port.in.u r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.filter.c.a r0 = r0.mo58584o()
            com.ss.android.ugc.aweme.filter.repository.a.l r0 = r0.mo64334d()
            int r4 = r3.mo89427a(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43873c.mo89423a(int):int");
    }

    /* renamed from: a */
    public final void mo89425a(int i, int i2) {
        if (i == 0) {
            C39618d.f101151O.mo83113a(mo89424a(), i2);
        } else {
            C39618d.f101151O.mo83113a(mo89426b(), i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo89427a(int i, C31499l lVar) {
        C31459g gVar;
        Map c = C31483a.m73321c((List) C39618d.m88215d().mo64419b().getValue());
        C31459g gVar2 = null;
        if (c != null) {
            gVar = null;
            C31459g gVar3 = null;
            int i2 = 0;
            for (Entry entry : c.entrySet()) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        break;
                    } else if (!(entry == null || entry.getValue() == null || ((List) entry.getValue()).isEmpty())) {
                        gVar3 = (C31459g) ((List) entry.getValue()).get(0);
                    }
                } else if (!(entry == null || entry.getValue() == null || ((List) entry.getValue()).isEmpty())) {
                    gVar = (C31459g) ((List) entry.getValue()).get(0);
                }
                i2++;
            }
            gVar2 = gVar3;
        } else {
            gVar = null;
        }
        if (gVar2 != null && i == 0 && C31487c.m73326b(lVar.mo64415e(), gVar2.f82324a) != null) {
            return gVar2.f82324a;
        }
        if (gVar == null || i != 1 || C31487c.m73326b(lVar.mo64415e(), gVar.f82324a) == null) {
            return C31487c.m73324a(lVar.mo64415e(), 0).f82324a;
        }
        return gVar.f82324a;
    }
}
