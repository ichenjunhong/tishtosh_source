package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.a */
public abstract class C24626a extends C23526a {

    /* renamed from: a */
    private HashMap f65181a;

    /* renamed from: a */
    public void mo50459a(Challenge challenge) {
    }

    /* renamed from: f */
    public String mo50468f() {
        return "";
    }

    /* renamed from: g */
    public void mo50491g() {
        if (this.f65181a != null) {
            this.f65181a.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo50491g();
    }

    /* renamed from: e */
    public JSONObject mo50467e() {
        return new JSONObject();
    }
}
