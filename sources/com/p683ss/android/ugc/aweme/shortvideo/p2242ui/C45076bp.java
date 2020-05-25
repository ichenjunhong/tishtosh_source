package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.C42385a;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.C42386b;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2198b.C43684d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.io.File;
import java.util.concurrent.Callable;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bp */
final /* synthetic */ class C45076bp implements Callable {

    /* renamed from: a */
    private final C45054bg f114168a;

    /* renamed from: b */
    private final C29059c f114169b;

    /* renamed from: c */
    private final boolean f114170c;

    C45076bp(C45054bg bgVar, C29059c cVar, boolean z) {
        this.f114168a = bgVar;
        this.f114169b = cVar;
        this.f114170c = z;
    }

    public final Object call() {
        C45054bg bgVar = this.f114168a;
        C29059c cVar = this.f114169b;
        boolean z = this.f114170c;
        if (bgVar.f114131q.mIsFromDraft) {
            if (C29061d.m68501f(cVar) == null || C29061d.m68501f(cVar).isEmpty()) {
                C50203g.m108358a("draftOpt==>try copy video data when the copySegment is empty for old draft created by fast import");
                C43668b.m95938a(bgVar.f114131q.getPreviewInfo(), cVar, (C52670a<C52860x>) new C45079bs<C52860x>(cVar));
            } else {
                C50203g.m108358a("don't copy draft dir");
            }
            return null;
        }
        C50203g.m108358a("copy draft dir");
        Workspace a = C42386b.m93131a(bgVar.f114131q);
        if (bgVar.f114131q.isMultiVideoEdit()) {
            C43684d dVar = C43684d.f110616b;
            String str = C43307ea.f109492e;
            StringBuilder sb = new StringBuilder();
            sb.append(bgVar.f114131q.uniqueVideoSessionDir(C43307ea.f109493f));
            sb.append(File.separator);
            String sb2 = sb.toString();
            C45081bu buVar = new C45081bu(cVar, z, a);
            C52711k.m112240b(str, "srcDir");
            C52711k.m112240b(sb2, "dstDir");
            C52711k.m112240b(buVar, "callBack");
            if ((cVar != null ? cVar.mo58777an() : null) != null) {
                C43684d.m95973a(str, sb2, true, cVar.mo58777an(), buVar);
            }
        } else {
            a.f107189a.mo86432a((C42385a) new C45082bv(cVar));
        }
        if (bgVar.f114131q.isFastImport) {
            C43668b.m95938a(bgVar.f114131q.getPreviewInfo(), cVar, (C52670a<C52860x>) new C45083bw<C52860x>(cVar));
        }
        return null;
    }
}
