package com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1833c;

import android.widget.TextView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.c.a */
public final class C34151a {

    /* renamed from: a */
    public static final C34151a f88260a = new C34151a();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.c.a$a */
    public static final class C34152a<T> implements Comparator<C33367a> {

        /* renamed from: a */
        public static final C34152a f88261a = new C34152a();

        C34152a() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            IMUser iMUser;
            C33367a aVar = (C33367a) obj;
            C33367a aVar2 = (C33367a) obj2;
            IMUser iMUser2 = null;
            if (aVar != null) {
                iMUser = aVar.getUser();
            } else {
                iMUser = null;
            }
            if (aVar2 != null) {
                iMUser2 = aVar2.getUser();
            }
            if (iMUser == null && iMUser2 == null) {
                return 0;
            }
            if (iMUser != null && iMUser2 != null) {
                return Integer.compare(iMUser2.getSearchType(), iMUser.getSearchType());
            }
            if (iMUser == null) {
                return -1;
            }
            return 1;
        }
    }

    private C34151a() {
    }

    /* renamed from: a */
    public static void m77969a(TextView textView, C33367a aVar) {
        textView.setVisibility(8);
    }
}
