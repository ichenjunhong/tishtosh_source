package com.bytedance.android.live.broadcast.effect;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.broadcast.api.model.C3056b;
import com.bytedance.android.live.broadcast.api.model.C3058d;
import com.bytedance.android.live.broadcast.effect.C3266p.C3271a;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.broadcast.p213h.p214a.C3413a;
import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3414a;
import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3415b;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.host.C8777a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.live.broadcast.effect.l */
public final class C3261l implements C3271a {

    /* renamed from: a */
    public List<FilterModel> f9418a = C3266p.m8943a().f9434b;

    /* renamed from: b */
    public C3415b f9419b;

    /* renamed from: c */
    private ValueAnimator f9420c;

    /* renamed from: a */
    public final void mo8591a(String str, HashMap<String, String> hashMap) {
        if (!this.f9418a.isEmpty()) {
            int b = mo8593b();
            int i = b + 1;
            if (i >= this.f9418a.size()) {
                i = 0;
            }
            FilterModel filterModel = (FilterModel) this.f9418a.get(i);
            if (!C3266p.m8943a().mo8633b(filterModel)) {
                if (!C3266p.m8943a().mo8635c(filterModel)) {
                    C3266p.m8943a().mo8627a(filterModel);
                }
                return;
            }
            if (!C9431p.m18664a(filterModel.getFilterId()) && !filterModel.getFilterId().equals("0")) {
                hashMap.put("filter_id", filterModel.getFilterId());
                C8049c.m15979a().mo14202a("live_take_filter_select", hashMap, new C8059j().mo14214b("live_take").mo14213a(str).mo14219g("draw").mo14218f("click"));
            }
            m8931a(true, b, i, 1);
        }
    }

    /* renamed from: a */
    public final void mo8592a(boolean z) {
        if (z) {
            this.f9418a = C3266p.m8943a().f9434b;
            if (!C9376b.m18558a((Collection<T>) this.f9418a) && ((Integer) C4525b.f12317M.mo10345a()).intValue() > 0 && ((Integer) C4525b.f12317M.mo10345a()).intValue() < this.f9418a.size() && this.f9419b != null) {
                mo8588a(((Integer) C4525b.f12317M.mo10345a()).intValue());
            }
        }
    }

    /* renamed from: e */
    public final void mo8597e() {
        C3266p.m8943a().mo8632b((C3271a) this);
    }

    protected C3261l() {
        C3266p.m8943a().mo8634c();
        C3266p.m8943a().mo8628a((C3271a) this);
    }

    /* renamed from: b */
    public final int mo8593b() {
        int intValue = ((Integer) C4525b.f12317M.mo10345a()).intValue();
        if (intValue >= this.f9418a.size() || intValue < 0) {
            return 0;
        }
        return intValue;
    }

    /* renamed from: c */
    public final String mo8595c() {
        if (this.f9418a.isEmpty()) {
            return "0";
        }
        return ((FilterModel) this.f9418a.get(mo8593b())).getFilterId();
    }

    /* renamed from: d */
    public final String mo8596d() {
        if (this.f9418a.isEmpty()) {
            return "";
        }
        return ((FilterModel) this.f9418a.get(mo8593b())).getName();
    }

    /* renamed from: a */
    public final String mo8587a() {
        if (mo8593b() == 0 || this.f9418a.isEmpty()) {
            return "";
        }
        return ((FilterModel) this.f9418a.get(mo8593b())).getFilterPath();
    }

    /* renamed from: a */
    public final void mo8589a(C3413a aVar) {
        this.f9419b = new C3415b();
        aVar.mo8758a((C3414a) this.f9419b);
        mo8590a(mo8587a());
    }

    /* renamed from: a */
    public static void m8930a(long j) {
        String str;
        C4116c.m10249a(C8777a.class);
        int intValue = ((Integer) C4525b.f12317M.mo10345a()).intValue();
        if (intValue < C3266p.m8943a().f9434b.size()) {
            boolean a = C3395f.m9156f().mo8744e().mo8219a();
            String str2 = "";
            if (C9376b.m18558a((Collection<T>) C3266p.m8943a().f9434b) || intValue >= C3266p.m8943a().f9434b.size() || C3266p.m8943a().f9434b.get(intValue) == null) {
                str = str2;
            } else {
                str = ((FilterModel) C3266p.m8943a().f9434b.get(intValue)).getName();
            }
            C3395f.m9156f().mo8742c().mo9020c().uploadBeautyParams(j, str, (int) (((Float) C4525b.f12318N.mo10345a()).floatValue() * 100.0f), (int) (((Float) C4525b.f12319O.mo10345a()).floatValue() * 100.0f), (int) (((Float) C4525b.f12320P.mo10345a()).floatValue() * 100.0f), (int) (((Float) C4525b.f12321Q.mo10345a()).floatValue() * 100.0f), a).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a(C3264n.f9428a, C3265o.f9429a);
            C4495a.m10823a().mo10301a((Object) new C3056b(a));
        }
    }

    /* renamed from: a */
    public final void mo8588a(int i) {
        int i2;
        int b = mo8593b();
        if (i >= 0 && i < this.f9418a.size()) {
            if (!C3266p.m8943a().mo8633b((FilterModel) this.f9418a.get(i))) {
                if (!C3266p.m8943a().mo8635c((FilterModel) this.f9418a.get(i))) {
                    C3266p.m8943a().mo8627a((FilterModel) this.f9418a.get(i));
                }
                return;
            }
            if (i > b) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            m8931a(true, b, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo8590a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                C3831a.m9707a("LiveFilterHelper", "FilterEffect unset");
                this.f9419b.mo8768a();
                return;
            }
            StringBuilder sb = new StringBuilder("FilterEffect update file:");
            sb.append(str);
            C3831a.m9707a("LiveFilterHelper", sb.toString());
            this.f9419b.mo8769a(str);
        } catch (FileNotFoundException e) {
            C3831a.m9714b("LiveFilterHelper", (Throwable) e);
        }
    }

    /* renamed from: a */
    public static float m8929a(List<FilterModel> list, int i) {
        if (!C9414h.m18630a(list) && i >= 0 && i < list.size()) {
            FilterModel filterModel = (FilterModel) list.get(i);
            if (filterModel.getTags() != null) {
                for (String split : filterModel.getTags()) {
                    String[] split2 = split.split(":");
                    if (split2.length == 2 && split2[0].equals("white")) {
                        try {
                            return (float) Integer.valueOf(split2[1]).intValue();
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        return 100.0f;
    }

    /* renamed from: b */
    public final void mo8594b(String str, HashMap<String, String> hashMap) {
        if (!this.f9418a.isEmpty()) {
            int b = mo8593b();
            int i = b - 1;
            if (i < 0) {
                i = this.f9418a.size() - 1;
            }
            FilterModel filterModel = (FilterModel) this.f9418a.get(i);
            if (!C3266p.m8943a().mo8633b(filterModel)) {
                if (!C3266p.m8943a().mo8635c(filterModel)) {
                    C3266p.m8943a().mo8627a(filterModel);
                }
                return;
            }
            hashMap.put("filter_id", filterModel.getFilterId());
            if (!C9431p.m18664a(filterModel.getFilterId()) && !filterModel.getFilterId().equals("0")) {
                C8049c.m15979a().mo14202a("live_take_filter_select", hashMap, new C8059j().mo14214b("live_take").mo14213a(str).mo14219g("draw").mo14218f("click"));
            }
            m8931a(true, b, i, 0);
        }
    }

    /* renamed from: a */
    private void m8931a(boolean z, int i, final int i2, int i3) {
        if (i < this.f9418a.size() && i2 < this.f9418a.size()) {
            if (this.f9420c != null && this.f9420c.isRunning()) {
                this.f9420c.cancel();
            }
            this.f9420c = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f9420c.setDuration(600);
            this.f9420c.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f9420c.addUpdateListener(new C3263m(this, i3, i2, i));
            this.f9420c.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (i2 == 0) {
                        C3831a.m9707a("LiveFilterHelper", "FilterEffect unset");
                        C3261l.this.f9419b.mo8768a();
                        return;
                    }
                    StringBuilder sb = new StringBuilder("FilterEffect update file:");
                    sb.append(((FilterModel) C3261l.this.f9418a.get(i2)).getFilterPath());
                    C3831a.m9707a("LiveFilterHelper", sb.toString());
                    C3261l.this.mo8590a(((FilterModel) C3261l.this.f9418a.get(i2)).getFilterPath());
                }
            });
            C4525b.f12317M.mo10346a(Integer.valueOf(i2));
            C4495a.m10823a().mo10301a((Object) new C3058d(i2));
            this.f9420c.start();
        }
    }
}
