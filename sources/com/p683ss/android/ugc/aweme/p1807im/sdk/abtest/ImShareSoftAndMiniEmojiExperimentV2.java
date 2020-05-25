package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.emoji.p1685e.C29314c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel.SharePanelAndroidViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel.SharePanelAndroidViewModel.C35166a;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

@C10178a(mo18163a = "im_share_auto_display_keyboard_and_emoji_new")
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2 */
public final class ImShareSoftAndMiniEmojiExperimentV2 {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ImShareSoftAndMiniEmojiExperimentV2.class), "experiment", "getExperiment()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ImShareSoftAndMiniEmojiExperimentV2.class), "repo", "getRepo()Lcom/bytedance/keva/Keva;"))};
    private static final int EIGHT = 8;
    @C10179b
    private static final int EXPERIMENT_1 = 1;
    @C10179b
    private static final int EXPERIMENT_2 = 2;
    @C10179b
    private static final int EXPERIMENT_3 = 3;
    @C10179b
    public static final int EXPERIMENT_4 = 4;
    private static final String GUIDE_KEY = "scroll_anim_key";
    public static final ImShareSoftAndMiniEmojiExperimentV2 INSTANCE = new ImShareSoftAndMiniEmojiExperimentV2();
    @C10179b(mo18165a = true)
    private static final int ONLINE = 0;
    private static final int SEVEN = 7;
    private static final int SIXTEEN = 16;
    private static final C52668f experiment$delegate = C52732g.m112285a(C33215a.f86209a);
    private static final C52668f repo$delegate = C52732g.m112285a(C33218c.f86212a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2$a */
    static final class C33215a extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C33215a f86209a = new C33215a();

        C33215a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C10181b.m20511a().mo18168a(ImShareSoftAndMiniEmojiExperimentV2.class, true, "im_share_auto_display_keyboard_and_emoji_new", 31744, 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2$b */
    public static final class C33216b implements C29314c {

        /* renamed from: a */
        public static final C33216b f86210a = new C33216b();

        C33216b() {
        }

        /* renamed from: a */
        public final void mo59258a(RecyclerView recyclerView) {
            C32458a.m75141a(4, "Emoji", "we hook here,need do guide anim");
            C52711k.m112236a((Object) recyclerView, "recyclerView");
            Context context = recyclerView.getContext();
            if (context instanceof C0184k) {
                SharePanelAndroidViewModel a = C35166a.m79403a(context);
                if (a != null) {
                    C0198r a2 = a.mo73279a();
                    if (a2 != null) {
                        a2.observe((C0184k) context, C332171.f86211a);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImShareSoftAndMiniEmojiExperimentV2$c */
    static final class C33218c extends C52712l implements C52670a<Keva> {

        /* renamed from: a */
        public static final C33218c f86212a = new C33218c();

        C33218c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Keva.getRepo("im_share_auto_display_keyboard_and_emoji_new");
        }
    }

    private ImShareSoftAndMiniEmojiExperimentV2() {
    }

    /* renamed from: a */
    public final int mo70513a() {
        return ((Number) experiment$delegate.getValue()).intValue();
    }

    /* renamed from: f */
    public final Keva mo70520f() {
        return (Keva) repo$delegate.getValue();
    }

    /* renamed from: b */
    public final boolean mo70516b() {
        if (mo70513a() != ONLINE) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo70518d() {
        if (mo70513a() == EXPERIMENT_3) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo70519e() {
        if (mo70513a() == EXPERIMENT_2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int mo70517c() {
        int a = mo70513a();
        if (a == EXPERIMENT_3) {
            return 7;
        }
        if (a == EXPERIMENT_4) {
            return 16;
        }
        return (a == EXPERIMENT_1 || a == EXPERIMENT_2) ? 8 : 8;
    }

    /* renamed from: a */
    public final View mo70514a(Context context) {
        C52711k.m112240b(context, "context");
        if (mo70513a() != EXPERIMENT_3) {
            return null;
        }
        return LayoutInflater.from(context).inflate(R.layout.bcz, null, false);
    }

    /* renamed from: b */
    public final C1332i mo70515b(Context context) {
        C52711k.m112240b(context, "context");
        if (mo70513a() != EXPERIMENT_4) {
            return null;
        }
        return new LinearLayoutManager(context, 0, false);
    }
}
