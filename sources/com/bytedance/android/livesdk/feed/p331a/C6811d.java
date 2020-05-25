package com.bytedance.android.livesdk.feed.p331a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p235h.C3924b;
import com.bytedance.android.live.core.paging.p236a.C3930c.C3935d;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.p338f.C6926k;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.a.d */
public final class C6811d extends C6806a {

    /* renamed from: A */
    private final C6926k f18674A;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo12996c(int i) {
        if (i != 1) {
            if (i == 3) {
                return R.layout.alm;
            }
            switch (i) {
                case 1001:
                    return R.layout.aph;
                case BaseNotice.CHECK_PROFILE /*1002*/:
                    return R.layout.apj;
                case BaseNotice.COMMENT_REPLY_WITH_VIDEO /*1003*/:
                    return R.layout.apk;
                case 1004:
                    return R.layout.alt;
                default:
                    return super.mo12996c(i);
            }
        } else if (C6926k.m14508g()) {
            return R.layout.alo;
        } else {
            return R.layout.aln;
        }
    }

    /* renamed from: b */
    public final C1352v mo9320b(ViewGroup viewGroup, int i) {
        return super.mo9320b(viewGroup, i);
    }

    /* renamed from: c */
    public final C1352v mo9321c(ViewGroup viewGroup, int i) {
        return new C3935d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ah1, viewGroup, false));
    }

    public C6811d(Map<Integer, C3924b> map, C6957i iVar, C6926k kVar) {
        super(map, iVar);
        this.f18674A = kVar;
    }
}
