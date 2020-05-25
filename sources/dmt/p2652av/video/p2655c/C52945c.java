package dmt.p2652av.video.p2655c;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.c.c */
final /* synthetic */ class C52945c {
    /* renamed from: a */
    public static final boolean m112644a(Activity activity) {
        C52711k.m112240b(activity, "activity");
        if (!C48016e.m103957g()) {
            C50203g.m108361b("record check SD卡不可用");
            C10691a.m21542b((Context) activity, (int) R.string.da8).mo19066a();
            return false;
        }
        long b = ((long) C39629l.m88232a().mo58583n().mo83104b(C40790a.RecordMinDiskAmountMB)) * 1024 * 1024;
        long h = C48016e.m103958h();
        if (h >= b || m112643a(b, h)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("RecordCheck 磁盘空间不足 sdAvailableSize:");
        sb.append(h);
        sb.append(" minDiskAmountByte:");
        sb.append(b);
        C50203g.m108361b(sb.toString());
        C10691a.m21542b(activity.getApplicationContext(), (int) R.string.ar9).mo19066a();
        return false;
    }

    /* renamed from: a */
    private static final boolean m112643a(long j, long j2) {
        long j3 = j - j2;
        if (j3 > 0) {
            return C39618d.f101162c.mo74153a(j3);
        }
        return true;
    }
}
