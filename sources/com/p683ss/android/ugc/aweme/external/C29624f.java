package com.p683ss.android.ugc.aweme.external;

import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg.C39598a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.filter.IFilterService;

/* renamed from: com.ss.android.ugc.aweme.external.f */
public class C29624f implements IFilterService {
    public void refreshData() {
        C39618d.f101150N.mo80676a(C39618d.f101160a, false, new C39598a() {
            public final void onSuccess() {
                C39618d.f101144H.mo58584o().mo64333c().mo64345a();
            }
        });
    }

    public C31459g getFilter(int i) {
        return C39618d.f101144H.mo58584o().mo64333c().mo64346b(i);
    }

    public String getFilterEnName(int i) {
        return C39618d.f101144H.mo58584o().mo64333c().mo64350d(i);
    }
}
