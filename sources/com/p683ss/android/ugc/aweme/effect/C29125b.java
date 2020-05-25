package com.p683ss.android.ugc.aweme.effect;

import android.util.Log;
import com.bytedance.p582g.p583a.p593e.C10022a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.services.effect.IEffectModelLoggerService;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.model.ModelInfo;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.b */
public final class C29125b implements IEffectModelLoggerService {
    /* renamed from: a */
    private static String m68613a(ModelInfo modelInfo) {
        StringBuilder sb = new StringBuilder("model name:");
        sb.append(modelInfo.getName());
        sb.append("; model version:");
        sb.append(modelInfo.getVersion());
        sb.append("; model url:");
        sb.append(modelInfo.getFile_url());
        sb.append("; model size:");
        sb.append(modelInfo.getTotalSize());
        sb.append(C43882k.f111137a);
        return sb.toString();
    }

    public final void startDownloadEffectModelAlog(Effect effect, Object obj) {
        C52711k.m112240b(obj, "modelInfo");
        if ((obj instanceof ModelInfo) && effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!C10022a.m20170a(effect.getRequirements())) {
                for (String append : effect.getRequirements()) {
                    sb.append(append);
                    sb.append(",");
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m68613a((ModelInfo) obj));
            sb2.append("; effect id:");
            sb2.append(effect.getEffectId());
            sb2.append("; requirements");
            sb2.append(sb.toString());
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder("report start download effect model alog: ");
            sb4.append(sb3);
            C45407ay.m98968a(sb4.toString());
            C26890h.m65011a("start_download_effect_model", C23089d.m56640a().mo47829a("extra_info", sb3).f61491a);
        }
    }

    public final void endDownloadEffectModelAlog(Effect effect, Object obj, long j, int i, Exception exc) {
        C52711k.m112240b(obj, "modelInfo");
        if ((obj instanceof ModelInfo) && effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!C10022a.m20170a(effect.getRequirements())) {
                for (String append : effect.getRequirements()) {
                    sb.append(append);
                    sb.append(",");
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m68613a((ModelInfo) obj));
            sb2.append("; effect id:");
            sb2.append(effect.getEffectId());
            sb2.append("; requirements");
            sb2.append(sb.toString());
            sb2.append("; duration:");
            sb2.append(j);
            sb2.append("ms");
            String sb3 = sb2.toString();
            if (i == 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                sb4.append("; errorcode: 0");
                sb3 = sb4.toString();
            } else if (exc != null) {
                String stackTraceString = Log.getStackTraceString(exc);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb3);
                sb5.append("; errorcode:");
                sb5.append(i);
                sb5.append("; errormsg:");
                sb5.append(stackTraceString);
                sb3 = sb5.toString();
            }
            StringBuilder sb6 = new StringBuilder("report effect model download alog: ");
            sb6.append(sb3);
            C45407ay.m98968a(sb6.toString());
            C26890h.m65011a("end_download_effect_model", C23089d.m56640a().mo47829a("extra_info", sb3).f61491a);
        }
    }
}
