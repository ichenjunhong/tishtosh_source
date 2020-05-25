package com.p683ss.android.ugc.aweme.effectplatform;

import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43882k;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.utils.C50201e;
import com.p683ss.android.ugc.tools.utils.C50203g;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.b */
public final class C29241b {
    /* renamed from: a */
    public static void m68866a(Effect effect, long j) {
        if (effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!C50201e.m108355a(effect.getRequirements())) {
                for (String append : effect.getRequirements()) {
                    sb.append(append);
                    sb.append(",");
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("effect id:");
            sb2.append(effect.getEffectId());
            sb2.append("; effect url:");
            sb2.append(effect.getFileUrl());
            sb2.append("; effect req:");
            sb2.append(sb.toString());
            sb2.append("; total size:");
            sb2.append(j / 1024);
            sb2.append(C43882k.f111137a);
            StringBuilder sb3 = new StringBuilder("report start download effect alog: ");
            sb3.append(sb2);
            C50203g.m108358a(sb3.toString());
            C47702b.f120193a.mo94984a("start_download_effect", C42438az.m93209a().mo86526a("extra_info", sb2.toString()).f107329a);
        }
    }

    /* renamed from: a */
    public static void m68867a(Effect effect, long j, long j2, int i, C48649d dVar) {
        if (effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!C50201e.m108355a(effect.getRequirements())) {
                for (String append : effect.getRequirements()) {
                    sb.append(append);
                    sb.append(",");
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("effect id:");
            sb2.append(effect.getEffectId());
            sb2.append("; effect url:");
            sb2.append(effect.getFileUrl());
            sb2.append("; effect req:");
            sb2.append(sb.toString());
            sb2.append("; total size:");
            sb2.append(j / 1024);
            sb2.append("k; duration:");
            sb2.append(j2);
            sb2.append("ms");
            if (i == 0) {
                sb2.append("; errorcode: 0");
            } else if (dVar != null) {
                sb2.append("; errorcode:");
                sb2.append(dVar.f122279a);
                sb2.append("; errormsg:");
                sb2.append(dVar.f122280b);
            }
            StringBuilder sb3 = new StringBuilder("report effect download alog: ");
            sb3.append(sb2);
            C50203g.m108358a(sb3.toString());
            C47702b.f120193a.mo94984a("end_download_effect", C42438az.m93209a().mo86526a("extra_info", sb2.toString()).f107329a);
        }
    }
}
