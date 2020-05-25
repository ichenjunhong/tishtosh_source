package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import com.p683ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.m */
final /* synthetic */ class C24752m extends C52720t {

    /* renamed from: a */
    public static final C52771j f65533a = new C24752m();

    C24752m() {
    }

    public final String getName() {
        return "challengeDetail";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(ChallengeDetailState.class);
    }

    public final String getSignature() {
        return "getChallengeDetail()Lcom/bytedance/jedi/arch/Async;";
    }

    public final Object get(Object obj) {
        return ((ChallengeDetailState) obj).getChallengeDetail();
    }
}
