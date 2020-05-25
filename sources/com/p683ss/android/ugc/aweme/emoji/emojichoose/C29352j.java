package com.p683ss.android.ugc.aweme.emoji.emojichoose;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29285a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29475e;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.j */
final /* synthetic */ class C29352j implements OnItemClickListener {

    /* renamed from: a */
    private final List f76872a;

    /* renamed from: b */
    private final C29361p f76873b;

    /* renamed from: c */
    private final C29355m f76874c;

    /* renamed from: d */
    private final int f76875d;

    C29352j(List list, C29361p pVar, C29355m mVar, int i) {
        this.f76872a = list;
        this.f76873b = pVar;
        this.f76874c = mVar;
        this.f76875d = i;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        List list = this.f76872a;
        C29361p pVar = this.f76873b;
        C29355m mVar = this.f76874c;
        int i2 = this.f76875d;
        C29285a aVar = (C29285a) list.get(i);
        if (aVar != null) {
            if (aVar.f76665a == R.drawable.xz) {
                pVar.mo59293b();
            } else if (aVar.f76665a == R.drawable.y7) {
                pVar.mo59294c();
            } else if (aVar.f76665a == R.drawable.y2) {
                pVar.mo59290a();
            } else if (aVar.mo59210a()) {
                pVar.mo59291a(view.findViewById(R.id.a_s), aVar, C29475e.m69554a(mVar, i2));
            } else if (!TextUtils.isEmpty(aVar.f76667c)) {
                pVar.mo59292a(aVar.f76667c);
            }
        }
    }
}
