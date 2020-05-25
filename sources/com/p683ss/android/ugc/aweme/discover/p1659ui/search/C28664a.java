package com.p683ss.android.ugc.aweme.discover.p1659ui.search;

import android.view.View;
import com.p683ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.a */
public final class C28664a extends CrossPlatformWebView {

    /* renamed from: i */
    private HashMap f75232i;

    /* renamed from: a */
    public final View mo55669a(int i) {
        if (this.f75232i == null) {
            this.f75232i = new HashMap();
        }
        View view = (View) this.f75232i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75232i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }
}
