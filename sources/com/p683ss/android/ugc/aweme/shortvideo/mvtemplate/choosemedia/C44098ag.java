package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ag */
final /* synthetic */ class C44098ag implements Comparator {

    /* renamed from: a */
    static final Comparator f111722a = new C44098ag();

    private C44098ag() {
    }

    public final int compare(Object obj, Object obj2) {
        return -(((MyMediaModel) obj).f95384c > ((MyMediaModel) obj2).f95384c ? 1 : (((MyMediaModel) obj).f95384c == ((MyMediaModel) obj2).f95384c ? 0 : -1));
    }
}
