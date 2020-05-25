package com.p683ss.android.ugc.aweme.filter;

import com.p683ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31594j;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31596l;
import com.p683ss.android.ugc.aweme.filter.repository.internal.downloader.C31565f;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.tools.utils.C50203g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.an */
public final class C31413an implements C31594j {
    /* renamed from: a */
    public final void mo64311a(C31493f fVar, String str, long j, C31596l lVar) {
        C52711k.m112240b(fVar, "filterMeta");
        C52711k.m112240b(str, "url");
        C52711k.m112240b(lVar, "downloader");
        C39629l.m88232a().mo58567E().mo49426a("filter_download_error_rate", 0, C42437ay.m93202a().mo86517a("tools_use_downloader", Boolean.valueOf(lVar instanceof C31565f)).mo86521a("url", str).mo86521a("duration", String.valueOf(j)).mo86522b());
        C47702b.f120193a.mo94984a("tool_performance_resource_download", C42438az.m93209a().mo86526a("resource_type", "color_filter").mo86524a("duration", j).mo86523a("status", 0).mo86523a("resource_id", fVar.f82404a).f107329a);
    }

    /* renamed from: a */
    public final void mo64312a(C31493f fVar, String str, long j, C31596l lVar, Exception exc, Integer num) {
        C52711k.m112240b(fVar, "filterMeta");
        C52711k.m112240b(str, "url");
        C52711k.m112240b(lVar, "downloader");
        C52711k.m112240b(exc, "e");
        String b = C50203g.m108360b((Throwable) exc);
        C52711k.m112236a((Object) b, "ToolsLogUtil.getStackTraceString(e)");
        C39629l.m88232a().mo58567E().mo49426a("filter_download_error_rate", 1, C42437ay.m93202a().mo86521a("exception", b).mo86517a("tools_use_downloader", Boolean.valueOf(lVar instanceof C31565f)).mo86521a("url", str).mo86519a("filter_id", Integer.valueOf(fVar.f82404a)).mo86521a("filter_name", fVar.f82405b).mo86522b());
        C47702b.f120193a.mo94984a("tool_performance_resource_download", C42438az.m93209a().mo86526a("resource_type", "color_filter").mo86524a("duration", j).mo86523a("status", 1).mo86523a("resource_id", fVar.f82404a).mo86525a("error_domain", EffectPlatformFactory.createIEffectPlatformFactorybyMonsterPlugin().getHosts().get(0)).mo86525a("error_code", (Object) num).f107329a);
    }
}
