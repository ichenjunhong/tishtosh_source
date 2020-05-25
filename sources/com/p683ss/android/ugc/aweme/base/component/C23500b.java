package com.p683ss.android.ugc.aweme.base.component;

import android.text.TextUtils;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.analysis.C22582c;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.p1382aq.C23213as;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.base.component.b */
final /* synthetic */ class C23500b implements Callable {

    /* renamed from: a */
    private final AnalysisActivityComponent f62589a;

    /* renamed from: b */
    private final long f62590b;

    C23500b(AnalysisActivityComponent analysisActivityComponent, long j) {
        this.f62589a = analysisActivityComponent;
        this.f62590b = j;
    }

    public final Object call() {
        Analysis analysis;
        AnalysisActivityComponent analysisActivityComponent = this.f62589a;
        long j = this.f62590b;
        C22582c cVar = analysisActivityComponent.f62559a != null ? (C22582c) analysisActivityComponent.f62559a.get() : null;
        if (cVar != null) {
            analysis = cVar.getAnalysis();
        } else {
            analysis = null;
        }
        if (analysis != null && !TextUtils.isEmpty(analysis.getLabelName())) {
            C18898c.m46010a(analysisActivityComponent.f62560b, "stay_time", analysis.getLabelName(), j, analysis.getExt_value());
            String str = "";
            String str2 = "";
            if (analysis.getExt_json() != null) {
                str = analysis.getExt_json().getString("process_id");
                str2 = analysis.getExt_json().getString("challenge_id");
            }
            C23213as b = new C23213as().mo48005a(String.valueOf(j)).mo48006b(analysis.getLabelName());
            b.f61798a = str;
            b.f61799b = str2;
            b.mo47954f(C23324d.m57378a().getAwemeById(String.valueOf(analysis.getValue()))).mo48076e();
        }
        return null;
    }
}
