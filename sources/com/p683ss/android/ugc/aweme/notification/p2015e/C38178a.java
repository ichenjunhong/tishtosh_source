package com.p683ss.android.ugc.aweme.notification.p2015e;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.notification.e.a */
public final class C38178a extends MusNotice {

    /* renamed from: c */
    public static final C38179a f97241c = new C38179a(null);

    /* renamed from: a */
    public final int f97242a;

    /* renamed from: b */
    public final User f97243b;

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a$a */
    public static final class C38179a {
        private C38179a() {
        }

        public /* synthetic */ C38179a(C52707g gVar) {
            this();
        }
    }

    public C38178a(int i, User user) {
        super(null, null, null, null, null, null, null, false, NormalGiftView.ALPHA_255, null);
        this.f97242a = i;
        this.f97243b = user;
        setType(this.f97242a);
    }
}
