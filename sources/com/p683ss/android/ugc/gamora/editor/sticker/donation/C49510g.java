package com.p683ss.android.ugc.gamora.editor.sticker.donation;

import com.p683ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.g */
final /* synthetic */ class C49510g extends C52720t {

    /* renamed from: a */
    public static final C52771j f124225a = new C49510g();

    C49510g() {
    }

    public final String getName() {
        return "result";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(OrganizationListState.class);
    }

    public final String getSignature() {
        return "getResult()Lcom/ss/android/ugc/gamora/editor/sticker/donation/viewmodel/Result;";
    }

    public final Object get(Object obj) {
        return ((OrganizationListState) obj).getResult();
    }
}
