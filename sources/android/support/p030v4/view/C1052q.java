package android.support.p030v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.PointerIcon;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: android.support.v4.view.q */
public final class C1052q {

    /* renamed from: a */
    public Object f3336a;

    private C1052q(Object obj) {
        this.f3336a = obj;
    }

    /* renamed from: a */
    public static C1052q m3014a(Context context, int i) {
        if (VERSION.SDK_INT >= 24) {
            return new C1052q(PointerIcon.getSystemIcon(context, BaseNotice.CHECK_PROFILE));
        }
        return new C1052q(null);
    }
}
