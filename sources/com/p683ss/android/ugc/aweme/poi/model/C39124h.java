package com.p683ss.android.ugc.aweme.poi.model;

import android.os.Handler;
import android.os.Message;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37860c;
import java.util.ArrayList;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.h */
public final class C39124h implements C0011g<C39126j, Void> {

    /* renamed from: a */
    Handler f99816a;

    /* renamed from: b */
    int f99817b;

    /* renamed from: c */
    String f99818c;

    public final /* synthetic */ Object then(C0013i iVar) throws Exception {
        C37860c cVar;
        if (this.f99816a == null) {
            return null;
        }
        Message obtainMessage = this.f99816a.obtainMessage(this.f99817b);
        if (iVar.mo31c()) {
            cVar = new C37860c(this.f99818c);
        } else if (iVar.mo33d()) {
            cVar = new C37860c(this.f99818c);
            cVar.f96387h = iVar.mo35f();
        } else {
            cVar = new C37860c(this.f99818c);
            C39126j jVar = (C39126j) iVar.mo34e();
            if (jVar.status_code != 0) {
                cVar.f96387h = new Exception("fail request due to wrong status code");
            } else if (jVar != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                cVar.f96383d = jVar.f99820b;
                cVar.f96381b = (long) jVar.f99821c;
                cVar.f96382c = (long) jVar.f99821c;
                if (jVar.f99819a != null) {
                    for (Aweme aweme : jVar.f99819a) {
                        if (C31753a.m73748h(aweme)) {
                            FollowFeed followFeed = new FollowFeed(aweme);
                            followFeed.setRequestId(jVar.getRequestId());
                            arrayList2.add(followFeed);
                        }
                    }
                    arrayList.addAll(arrayList2);
                }
                cVar.f96380a = arrayList;
            }
        }
        obtainMessage.obj = cVar;
        this.f99816a.sendMessage(obtainMessage);
        return null;
    }

    public C39124h(Handler handler, int i, String str) {
        this.f99816a = handler;
        this.f99817b = i;
        this.f99818c = str;
    }
}
