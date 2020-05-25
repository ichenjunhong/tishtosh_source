package com.bytedance.android.livesdk.drawerfeed;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.DrawerLayout;
import android.support.p030v4.widget.DrawerLayout.C1072c;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.livesdk.C4642b;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.chatroom.C4995b;
import com.bytedance.android.livesdk.chatroom.p325ui.DoubleColorBallLoadingLayout;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p450h.C8751b;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.drawerfeed.a */
public final class C6744a extends C6736d {

    /* renamed from: a */
    public View f18429a;

    /* renamed from: b */
    public DrawerLayout f18430b;

    /* renamed from: c */
    public Fragment f18431c;

    /* renamed from: d */
    public DoubleColorBallLoadingLayout f18432d;

    /* renamed from: e */
    public Bundle f18433e;

    /* renamed from: f */
    String f18434f;

    /* renamed from: g */
    long f18435g;

    /* renamed from: h */
    private List<C1072c> f18436h;

    /* renamed from: i */
    private C1072c f18437i = new C1072c() {
        public final void onDrawerSlide(View view, float f) {
        }

        public final void onDrawerClosed(View view) {
            C4642b.m11130a().mo10429c();
            if (C6744a.this.getUserVisibleHint()) {
                C6744a.this.mo12853a();
            }
            C6744a.this.dismissAllowingStateLoss();
        }

        public final void onDrawerStateChanged(int i) {
            if (i == 0 && C6744a.this.f18430b != null && !C6744a.this.f18430b.isDrawerOpen(8388613)) {
                C6744a.this.f18430b.closeDrawer(8388613);
                C6744a.this.dismissAllowingStateLoss();
            }
        }

        public final void onDrawerOpened(View view) {
            C4642b.m11130a().mo10428b();
            if (C6744a.this.getUserVisibleHint()) {
                C6744a aVar = C6744a.this;
                String str = "button";
                if (!C9431p.m18664a(aVar.f18434f)) {
                    str = aVar.f18434f;
                }
                HashMap hashMap = new HashMap();
                aVar.f18435g = SystemClock.elapsedRealtime();
                hashMap.put("request_page", C4995b.m11478a().mo10874f());
                C8049c.m15979a().mo14202a("livesdk_more_anchor_show", hashMap, new C8059j().mo14218f(str), Room.class);
            }
        }
    };

    /* renamed from: h */
    public final boolean mo11100h() {
        if (this.f18430b == null || !C1056u.m3018B(this.f18430b) || !this.f18430b.isDrawerOpen(8388613)) {
            return false;
        }
        this.f18430b.closeDrawer(8388613);
        return true;
    }

    /* renamed from: a */
    public final void mo12853a() {
        String str = "button";
        if (!C9431p.m18664a(this.f18434f)) {
            str = this.f18434f;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.f18435g));
        hashMap.put("request_page", C4995b.m11478a().mo10874f());
        C8049c.m15979a().mo14202a("livesdk_more_anchor_duration", hashMap, new C8059j().mo14218f(str), Room.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.a7a);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.addFlags(DynamicTabYellowPointVersion.DEFAULT);
                window.setNavigationBarColor(-16777216);
                window.setLayout(-1, -1);
            }
            if (getActivity() != null && C3894h.m9842a(getActivity())) {
                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f18430b = (DrawerLayout) this.f18429a.findViewById(R.id.a8s);
        this.f18430b.addDrawerListener(this.f18437i);
        if (C9414h.m18631b(this.f18436h)) {
            for (C1072c addDrawerListener : this.f18436h) {
                this.f18430b.addDrawerListener(addDrawerListener);
            }
        }
        ViewGroup viewGroup = (ViewGroup) this.f18429a.findViewById(R.id.bw4);
        int a = (int) (((float) C9432q.m18670a(getContext())) - C9432q.m18687b(getContext(), 50.0f));
        if (a > 0) {
            LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = a;
            viewGroup.setLayoutParams(layoutParams);
            this.f18430b.post(new Runnable() {
                public final void run() {
                    if (C6744a.this.isVisible()) {
                        if (C6744a.this.f18430b != null) {
                            C6744a.this.f18430b.openDrawer(8388613);
                        }
                        if (C6744a.this.f18431c == null) {
                            C6744a.this.f18432d = (DoubleColorBallLoadingLayout) C6744a.this.f18429a.findViewById(R.id.a6s);
                            C6744a.this.f18432d.setVisibility(0);
                            C6744a.this.f18431c = C8830k.m17331e().mo13055q().mo13237a((C8751b) new C8751b() {
                                /* renamed from: b */
                                public final void mo12856b() {
                                    C6744a.this.mo12853a();
                                    C6744a.this.dismiss();
                                }

                                /* renamed from: c */
                                public final void mo12857c() {
                                    C6744a aVar = C6744a.this;
                                    if (aVar.f18432d != null) {
                                        aVar.f18432d.setVisibility(8);
                                    }
                                }

                                /* renamed from: a */
                                public final void mo12855a() {
                                    C6744a aVar = C6744a.this;
                                    if (aVar.f18430b != null && C1056u.m3018B(aVar.f18430b)) {
                                        aVar.f18430b.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            });
                            if (C6744a.this.f18431c != null) {
                                C6744a.this.f18431c.setArguments(C6744a.this.f18433e);
                            }
                        }
                        if (C6744a.this.f18431c != null && !C6744a.this.f18431c.isAdded()) {
                            C0679r a = C6744a.this.getChildFragmentManager().mo2225a();
                            a.mo2175a((int) R.id.bw3, C6744a.this.f18431c);
                            a.mo2195c();
                        }
                    }
                }
            });
            getDialog().setOnKeyListener(new OnKeyListener() {
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (4 == i && 1 == keyEvent.getAction()) {
                        return C6744a.this.mo11100h();
                    }
                    return false;
                }
            });
        }
    }

    /* renamed from: a */
    public static C6744a m14135a(List<C1072c> list, Bundle bundle, String str) {
        C6744a aVar = new C6744a();
        aVar.f18436h = list;
        aVar.f18433e = bundle;
        aVar.f18434f = str;
        return aVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f18429a = layoutInflater.inflate(R.layout.b98, viewGroup, false);
        return this.f18429a;
    }
}
