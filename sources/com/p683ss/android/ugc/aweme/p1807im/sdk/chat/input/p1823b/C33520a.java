package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.p1823b;

import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33437u;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1855d.C34472c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.viewmodel.MediaPanelChooseViewModel.C34491a;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.b.a */
public final class C33520a {

    /* renamed from: a */
    public static final C33520a f86869a = new C33520a();

    private C33520a() {
    }

    /* renamed from: a */
    public static final void m76819a(FragmentActivity fragmentActivity, C34472c cVar) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(cVar, "chooseResult");
        C34491a.m78429a(fragmentActivity).mo72516o().setValue(cVar);
    }

    /* renamed from: a */
    public static final void m76820a(FragmentActivity fragmentActivity, String str, C34472c cVar) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(cVar, "chooseResult");
        m76819a(fragmentActivity, new C34472c(false, new ArrayList()));
        C33437u.m76637a(str, cVar.getSelectedList(), cVar.getSendRaw());
    }
}
