package com.p683ss.android.ugc.aweme.tools.beauty.p2350b;

import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46898f.C46899a;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46904h;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.b.c */
public class C46825c implements C46899a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f118303a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46825c.class), "settings", "getSettings()Lcom/ss/android/ugc/aweme/property/AVSettings;"))};

    /* renamed from: b */
    private final C52668f f118304b = C52732g.m112285a(C46826a.f118306a);

    /* renamed from: c */
    private final C46899a f118305c;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.b.c$a */
    static final class C46826a extends C52712l implements C52670a<C40795l> {

        /* renamed from: a */
        public static final C46826a f118306a = new C46826a();

        C46826a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C39629l.m88232a().mo58574e();
        }
    }

    /* renamed from: c */
    private final C40795l m101672c() {
        return (C40795l) this.f118304b.getValue();
    }

    /* renamed from: a */
    public final void mo94065a() {
        this.f118305c.mo94065a();
    }

    /* renamed from: a */
    public final void mo94067a(String str, String str2, float f) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        C52711k.m112240b(str2, "nodeTag");
        this.f118305c.mo94067a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo94068a(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "paths");
        this.f118305c.mo94068a(list, i);
    }

    /* renamed from: a */
    public final void mo94069a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C52711k.m112240b(list, "oldPaths");
        C52711k.m112240b(list2, "newPaths");
        this.f118305c.mo94069a(list, list2, i);
    }

    /* renamed from: a */
    public final int[] mo94070a(String str, String str2) {
        C52711k.m112240b(str, "nodePath");
        C52711k.m112240b(str2, "nodeKey");
        return this.f118305c.mo94070a(str, str2);
    }

    /* renamed from: b */
    public final void mo94071b() {
        this.f118305c.mo94071b();
    }

    public C46825c(C46899a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f118305c = aVar;
    }

    /* renamed from: a */
    public final void mo94066a(C46904h hVar, int i, boolean z) {
        C52711k.m112240b(hVar, "type");
        switch (C46827d.f118307a[hVar.ordinal()]) {
            case 1:
                boolean a = m101672c().mo83117a(C40796a.UserChangeSkinLevel) | z;
                m101672c().mo83116a(C40796a.UserChangeSkinLevel, a);
                if (a) {
                    m101672c().mo83113a(C40796a.UserSmoothSkinLevel, i);
                }
                this.f118305c.mo94066a(hVar, i, z);
                return;
            case 2:
                boolean a2 = m101672c().mo83117a(C40796a.UserChangeShapeLevel) | z;
                m101672c().mo83116a(C40796a.UserChangeShapeLevel, a2);
                if (a2) {
                    m101672c().mo83113a(C40796a.UserShapeLevel, i);
                }
                this.f118305c.mo94066a(hVar, i, z);
                return;
            case 3:
                boolean a3 = m101672c().mo83117a(C40796a.UserChangeBigEyeLevel) | z;
                m101672c().mo83116a(C40796a.UserChangeBigEyeLevel, a3);
                if (a3) {
                    m101672c().mo83113a(C40796a.UserBigEyeLevel, i);
                }
                this.f118305c.mo94066a(hVar, i, z);
                return;
            case 4:
                boolean a4 = m101672c().mo83117a(C40796a.UserChangeLipLevel) | z;
                m101672c().mo83116a(C40796a.UserChangeLipLevel, a4);
                if (a4) {
                    m101672c().mo83113a(C40796a.UserLipLevel, i);
                }
                this.f118305c.mo94066a(hVar, i, z);
                return;
            case 5:
                boolean a5 = m101672c().mo83117a(C40796a.UserChangeBlushLevel) | z;
                m101672c().mo83116a(C40796a.UserChangeBlushLevel, a5);
                if (a5) {
                    m101672c().mo83113a(C40796a.UserBlushLevel, i);
                }
                this.f118305c.mo94066a(hVar, i, z);
                break;
        }
    }
}
