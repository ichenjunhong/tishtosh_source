package com.p683ss.android.ugc.aweme.message;

import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.notice.api.C38027b;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.message.a */
public class C36776a implements C38027b {

    /* renamed from: c */
    private static volatile C36776a f93985c;

    /* renamed from: a */
    private List<Long> f93986a = new ArrayList();

    /* renamed from: b */
    private boolean f93987b = false;

    /* renamed from: d */
    private boolean f93988d = true;

    /* renamed from: e */
    private boolean f93989e = false;

    /* renamed from: f */
    private Keva f93990f = Keva.getRepo("live_push_data_keva");

    /* renamed from: b */
    public static C38027b m82767b() {
        if (C27991b.f73440X == null) {
            synchronized (C38027b.class) {
                if (C27991b.f73440X == null) {
                    C27991b.f73440X = C27628bo.m66320o();
                }
            }
        }
        return (C38027b) C27991b.f73440X;
    }

    /* renamed from: a */
    public static C36776a m82766a() {
        if (f93985c == null) {
            synchronized (C36776a.class) {
                if (f93985c == null) {
                    f93985c = new C36776a();
                }
            }
        }
        return f93985c;
    }
}
