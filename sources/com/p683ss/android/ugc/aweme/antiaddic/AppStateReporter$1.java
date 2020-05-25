package com.p683ss.android.ugc.aweme.antiaddic;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.AppStateReporter$1 */
class AppStateReporter$1 implements LegoTask {
    final /* synthetic */ C22688a this$0;

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    AppStateReporter$1(C22688a aVar) {
        this.this$0 = aVar;
    }

    public void run(Context context) {
        this.this$0.mo47076f();
    }
}
