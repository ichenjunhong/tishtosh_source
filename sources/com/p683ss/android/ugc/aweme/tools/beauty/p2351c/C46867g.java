package com.p683ss.android.ugc.aweme.tools.beauty.p2351c;

import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p683ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p683ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p683ss.android.ugc.aweme.tools.beauty.C46814a;
import com.p683ss.android.ugc.aweme.tools.beauty.C46821b;
import com.p683ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import com.p683ss.android.ugc.aweme.tools.beauty.service.C46894c.C46895a;
import com.p683ss.android.ugc.aweme.utils.C47861es;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.c.g */
public interface C46867g {

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.c.g$a */
    public static final class C46868a {
        /* renamed from: a */
        public static /* synthetic */ void m101785a(C46867g gVar, boolean z, C46814a aVar, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                aVar = gVar.mo94107f();
            }
            gVar.mo94092a(z, aVar);
        }
    }

    /* renamed from: a */
    int mo94082a(ComposerBeauty composerBeauty, String str, int i);

    /* renamed from: a */
    List<BeautyCategory> mo94084a();

    /* renamed from: a */
    List<ComposerInfo> mo94085a(ComposerBeauty composerBeauty, boolean z, boolean z2);

    /* renamed from: a */
    void mo94086a(ComposerBeauty composerBeauty);

    /* renamed from: a */
    void mo94088a(C46821b bVar);

    /* renamed from: a */
    void mo94089a(String str);

    /* renamed from: a */
    void mo94090a(String str, C46895a aVar);

    /* renamed from: a */
    void mo94092a(boolean z, C46814a aVar);

    /* renamed from: b */
    C47861es<Boolean> mo94094b();

    /* renamed from: b */
    void mo94095b(ComposerBeauty composerBeauty, String str, int i);

    /* renamed from: b */
    void mo94096b(C46821b bVar);

    /* renamed from: c */
    C47861es<List<ComposerInfo>> mo94098c();

    /* renamed from: c */
    boolean mo94100c(ComposerBeauty composerBeauty);

    /* renamed from: d */
    C46869h<ComposerInfo> mo94101d();

    /* renamed from: d */
    void mo94103d(ComposerBeauty composerBeauty);

    /* renamed from: e */
    void mo94105e(ComposerBeauty composerBeauty);

    /* renamed from: f */
    C46814a mo94107f();

    /* renamed from: g */
    List<BeautyCategory> mo94108g();

    /* renamed from: h */
    void mo94109h();

    /* renamed from: j */
    C47861es<List<ComposerInfo>> mo94111j();

    /* renamed from: k */
    ComposerBeautyBuriedInfo mo94112k();

    /* renamed from: l */
    BeautyMetadata mo94113l();

    /* renamed from: m */
    List<ComposerBeauty> mo94114m();

    /* renamed from: n */
    BeautyFilterConfig mo94115n();
}
