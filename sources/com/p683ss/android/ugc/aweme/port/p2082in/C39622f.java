package com.p683ss.android.ugc.aweme.port.p2082in;

import android.app.Activity;
import com.google.p1057b.p1058a.C17422l;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45205n;

/* renamed from: com.ss.android.ugc.aweme.port.in.f */
final /* synthetic */ class C39622f implements C17422l {

    /* renamed from: a */
    private final StringBuilder f101190a;

    C39622f(StringBuilder sb) {
        this.f101190a = sb;
    }

    public final boolean apply(Object obj) {
        StringBuilder sb = this.f101190a;
        Activity activity = (Activity) obj;
        if (activity instanceof C45205n) {
            sb.append(activity);
            sb.append(" isRecording: ");
            sb.append(((C45205n) activity).mo78676a());
            sb.append("\n");
        } else {
            sb.append(activity);
            sb.append("\n");
        }
        return false;
    }
}
