package com.p683ss.android.ugc.aweme.sticker.types.game;

import android.content.SharedPreferences.Editor;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.util.Pair;
import android.widget.FrameLayout;
import com.bytedance.als.ApiCenter;
import com.bytedance.common.utility.p525e.C9402b;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45861d;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46297f;
import com.p683ss.android.ugc.aweme.sticker.types.game.p2329a.C46550a;
import com.p683ss.android.ugc.aweme.tools.C47063h;
import com.p683ss.android.ugc.aweme.tools.C47064i;
import com.p683ss.android.ugc.aweme.tools.C47323n;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.aweme.tools.C47349x;
import com.p683ss.android.ugc.aweme.tools.C47351z;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.a */
public final class C46546a {

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.game.a$a */
    static class C46548a implements C46560i {

        /* renamed from: a */
        private final ApiCenter f117444a;

        /* renamed from: a */
        public final int mo93334a() {
            return ((C45004a) this.f117444a.mo7339a(C45004a.class)).mo91315U();
        }

        /* renamed from: b */
        public final void mo93336b() {
            ((C45004a) this.f117444a.mo7339a(C45004a.class)).mo91357c(false);
        }

        /* renamed from: c */
        public final void mo93337c() {
            C45861d.m99707a((C46297f) this.f117444a.mo7339a(C50048n.class), (Effect) null);
        }

        private C46548a(AppCompatActivity appCompatActivity) {
            this.f117444a = ApiCenter.m7844a((FragmentActivity) appCompatActivity);
        }

        /* renamed from: a */
        public final void mo93335a(int i) {
            Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
            edit.putInt("record_mode", 1);
            C9402b.m18594a(edit);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.game.a$b */
    static class C46549b implements C46561j {

        /* renamed from: a */
        private final ApiCenter f117445a;

        /* renamed from: f */
        private C45004a m101027f() {
            return (C45004a) this.f117445a.mo7339a(C45004a.class);
        }

        /* renamed from: a */
        public final void mo93338a() {
            m101027f().mo91385a(new C47063h());
        }

        /* renamed from: b */
        public final void mo93340b() {
            m101027f().mo91334a(new C47349x(C47339t.NORMAL));
        }

        /* renamed from: c */
        public final void mo93341c() {
            m101027f().mo91385a(new C47063h());
        }

        /* renamed from: d */
        public final void mo93342d() {
            m101027f().mo91328a(new C47064i());
        }

        /* renamed from: e */
        public final void mo93343e() {
            m101027f().mo91335a(new C47351z());
        }

        private C46549b(AppCompatActivity appCompatActivity) {
            this.f117445a = ApiCenter.m7844a((FragmentActivity) appCompatActivity);
        }

        /* renamed from: a */
        public final void mo93339a(Pair<Boolean, Integer> pair) {
            m101027f().mo91335a(new C47351z());
            m101027f().mo91329a(new C47323n("record_full"));
        }
    }

    /* renamed from: a */
    public static C46562k m101022a(AppCompatActivity appCompatActivity, C50207b bVar, ASCameraView aSCameraView, FrameLayout frameLayout, C46550a aVar) {
        C46552b bVar2 = new C46552b(appCompatActivity, bVar, aSCameraView, new C46557f(frameLayout), new C46548a(appCompatActivity), new C46549b(appCompatActivity), aVar);
        return bVar2;
    }
}
