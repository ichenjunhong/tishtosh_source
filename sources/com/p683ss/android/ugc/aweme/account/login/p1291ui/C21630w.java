package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.login.model.C21386a;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.w */
final /* synthetic */ class C21630w implements OnClickListener {

    /* renamed from: a */
    private final MusCountryListActivity f58635a;

    /* renamed from: b */
    private final C21626v f58636b;

    C21630w(MusCountryListActivity musCountryListActivity, C21626v vVar) {
        this.f58635a = musCountryListActivity;
        this.f58636b = vVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        MusCountryListActivity musCountryListActivity = this.f58635a;
        C21626v vVar = this.f58636b;
        String lowerCase = musCountryListActivity.etSearch.getText().toString().toLowerCase();
        musCountryListActivity.f58398b.clear();
        Iterator it = musCountryListActivity.f58399c.iterator();
        while (it.hasNext()) {
            C21386a aVar = (C21386a) it.next();
            if (musCountryListActivity.getString(aVar.f58041a).toLowerCase().contains(lowerCase)) {
                musCountryListActivity.f58398b.add(aVar);
            }
        }
        vVar.notifyDataSetChanged();
    }
}
