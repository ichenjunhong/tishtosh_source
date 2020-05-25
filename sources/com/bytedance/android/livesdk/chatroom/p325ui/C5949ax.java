package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Dialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.p196c.C3048a;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.event.C5207z;
import com.bytedance.android.livesdk.chatroom.interact.C5281ao;
import com.bytedance.android.livesdk.chatroom.viewmodule.ActionMessageWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.OBSBarrageWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.message.model.C7818aw;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p449g.C8745a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ax */
public final class C5949ax extends C5957b implements OnClickListener, OnTouchListener {

    /* renamed from: T */
    private static final int[] f15663T = {R.id.ue, R.id.dmr, R.id.c6m, R.id.bc9, R.id.d3e, R.id.m7, R.id.cao, R.id.a32, R.id.blh, R.id.x_, R.id.bcm, R.id.adj, R.id.dw1, R.id.dvz, R.id.d3u};

    /* renamed from: S */
    public boolean f15664S = false;

    /* renamed from: U */
    private List<Integer> f15665U = new ArrayList();

    /* renamed from: V */
    private int f15666V = 0;

    /* renamed from: W */
    private View[] f15667W;

    /* renamed from: X */
    private List<Integer> f15668X = new ArrayList();

    /* renamed from: Y */
    private List<View> f15669Y;

    /* renamed from: Z */
    private List<Integer> f15670Z;

    /* renamed from: aa */
    private C1690c f15671aa;

    /* renamed from: ab */
    private long f15672ab = 0;

    /* renamed from: ac */
    private LinearLayout f15673ac;

    /* renamed from: ad */
    private View f15674ad;

    /* renamed from: ae */
    private boolean f15675ae = false;

    /* renamed from: af */
    private View f15676af;

    /* renamed from: ag */
    private View f15677ag;

    /* renamed from: ah */
    private long f15678ah;

    /* renamed from: ai */
    private Dialog f15679ai = null;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ax$a */
    class C5951a implements C6601a {
        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C5951a() {
        }

        public final void onClick(View view) {
            C5949ax.this.f15664S = false;
            C5949ax.this.mo11895x();
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()));
            C8049c.m15979a().mo14202a("clear_screen_click", hashMap, C8059j.class, Room.class);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ax$b */
    class C5952b implements C6601a {
        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C5952b() {
        }

        public final void onClick(View view) {
            C4495a.m10823a().mo10301a((Object) new C8745a(1));
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(C5949ax.this.f15715a.getId()));
            hashMap.put("type", "landscape_to_portrait");
            C8049c.m15979a().mo14202a("screen_rotate", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click").mo14213a("live_detail"));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ax$c */
    class C5953c implements C6601a {

        /* renamed from: b */
        private View f15683b;

        /* renamed from: c */
        private Dialog f15684c;

        /* renamed from: d */
        private C1690c f15685d;

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        private C5953c() {
        }

        public final void onEvent(C5207z zVar) {
            if (this.f15683b instanceof TextView) {
                if (zVar.f13934d != null) {
                    ((TextView) this.f15683b).setText(zVar.f13934d.name);
                    return;
                }
                ((TextView) this.f15683b).setText(zVar.f13931a);
            }
        }

        public final void onClick(View view) {
            if (this.f15684c == null && C5949ax.this.getContext() != null) {
                this.f15684c = new C6204ff(C5949ax.this.getContext(), C5949ax.this.f15715a);
            }
            if (!this.f15684c.isShowing()) {
                this.f15684c.show();
            }
            C8049c.m15979a().mo14203a("definition_setting_button", Room.class, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click").mo14213a("live_detail"));
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
            if (this.f15684c != null) {
                this.f15684c.dismiss();
            }
            this.f15684c = null;
            if (this.f15685d != null && !this.f15685d.isDisposed()) {
                this.f15685d.dispose();
            }
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            String str;
            this.f15683b = view;
            if (this.f15683b instanceof TextView) {
                Room room = C5949ax.this.f15715a;
                boolean z = true;
                if (!room.isMultiPullDataValid() ? room.getStreamUrl().mo15384d().size() <= 1 : room.getStreamUrl().qualityList.size() <= 1) {
                    z = false;
                }
                if (z) {
                    if (this.f15685d != null && !this.f15685d.isDisposed()) {
                        this.f15685d.dispose();
                    }
                    this.f15685d = C4495a.m10823a().mo10300a(C5207z.class).mo6545f((C1710e<? super T>) new C1710e<C5207z>() {
                        public final /* synthetic */ void accept(Object obj) throws Exception {
                            C5953c.this.onEvent((C5207z) obj);
                        }
                    });
                    TextView textView = (TextView) this.f15683b;
                    if (C5949ax.this.f15715a.isMultiPullDataValid()) {
                        str = C5949ax.this.f15715a.getStreamUrl().mo15385e();
                    } else {
                        str = C5949ax.this.f15715a.getStreamUrl().f23790r;
                    }
                    textView.setVisibility(0);
                    textView.setText(str);
                    return;
                }
            }
            this.f15683b.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo9582a(C3048a aVar) {
    }

    /* renamed from: a */
    public final void mo9583a(C5281ao aoVar) {
    }

    /* renamed from: f */
    public final void mo9591f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo11891j() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo11892k() {
        super.mo11892k();
        this.f15675ae = true;
        m12947a(true);
    }

    /* renamed from: g */
    public final boolean mo11890g() {
        if (getContext() == null || getContext().getResources().getConfiguration().orientation != 1) {
            return false;
        }
        return true;
    }

    public final void onPause() {
        super.onPause();
        if (this.f15671aa != null && !this.f15671aa.isDisposed()) {
            this.f15671aa.dispose();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f15678ah = System.currentTimeMillis();
        if (this.f15675ae) {
            m12947a(true);
        }
    }

    public final void onStop() {
        super.onStop();
        HashMap hashMap = new HashMap();
        hashMap.put("time", String.valueOf(System.currentTimeMillis() - this.f15678ah));
        C8049c.m15979a().mo14202a("transverse_screen_duration", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other").mo14213a("live_detail"), Room.class);
    }

    /* renamed from: x */
    public final void mo11895x() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        this.f15664S = !this.f15664S;
        C6600d c = C6610k.m13987c();
        C6605h hVar = C6605h.DOUYIN_OFFICIAL_IMMERSE;
        int i10 = 0;
        if (this.f15664S) {
            i = 8;
        } else {
            i = 0;
        }
        c.mo12666a(hVar, i);
        C6600d c2 = C6610k.m13987c();
        C6605h hVar2 = C6605h.DOUYIN_OFFICIAL_QUALITY;
        if (this.f15664S) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        c2.mo12666a(hVar2, i2);
        C6600d c3 = C6610k.m13987c();
        C6605h hVar3 = C6605h.GIFT;
        if (this.f15664S) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        c3.mo12666a(hVar3, i3);
        C8064d.m16005b();
        StringBuilder sb = new StringBuilder("Gift icon status changed, visiable:");
        sb.append(!this.f15664S);
        sb.append(", reason:LandscapeInteractionFragment#toggleImmerseMode()");
        C8064d.m9720b("ttlive_gift", sb.toString());
        View view = this.f15802k;
        if (this.f15664S) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        C9432q.m18691b(view, i4);
        View findViewById = this.f15674ad.findViewById(R.id.x_);
        if (this.f15664S) {
            i5 = 8;
        } else {
            i5 = 0;
        }
        C9432q.m18691b(findViewById, i5);
        View findViewById2 = this.f15674ad.findViewById(R.id.jd);
        if (this.f15664S) {
            i6 = 8;
        } else {
            i6 = 0;
        }
        C9432q.m18691b(findViewById2, i6);
        View findViewById3 = this.f15674ad.findViewById(R.id.m7);
        if (this.f15664S) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        C9432q.m18691b(findViewById3, i7);
        View findViewById4 = this.f15674ad.findViewById(R.id.bub);
        if (this.f15664S) {
            i8 = 8;
        } else {
            i8 = 0;
        }
        C9432q.m18691b(findViewById4, i8);
        View findViewById5 = this.f15674ad.findViewById(R.id.cf8);
        if (this.f15664S) {
            i10 = 8;
        }
        C9432q.m18691b(findViewById5, i10);
        C4495a a = C4495a.m10823a();
        if (!this.f15664S) {
            i9 = 4;
        } else {
            i9 = 3;
        }
        a.mo10301a((Object) new C8745a(i9));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11889a(Long l) throws Exception {
        if (this.f15666V == 0) {
            mo11887a(8);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
        }
        return onCreateDialog;
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.enj && this.f15679ai != null) {
            mo11887a(8);
            this.f15679ai.show();
        }
    }

    /* renamed from: a */
    private void m12947a(boolean z) {
        long j;
        if (this.f15666V != 8) {
            if (this.f15671aa != null && !this.f15671aa.isDisposed()) {
                this.f15671aa.dispose();
            }
            if (z) {
                j = 10000;
            } else {
                j = 3000;
            }
            this.f15671aa = C2201v.m6592a(j, TimeUnit.MILLISECONDS).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C5955ay<Object>(this), C5956az.f15688a);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7818aw awVar = new C7818aw();
        awVar.f21524a = (int) getResources().getDimension(R.dimen.qz);
        if (this.f15815x != null) {
            this.f15815x.lambda$put$1$DataCenter("cmd_normal_gift_layout_bottom_margin_update", Integer.valueOf(awVar.f21524a));
        }
        C7818aw awVar2 = new C7818aw();
        awVar2.f21524a = (int) getResources().getDimension(R.dimen.qy);
        if (this.f15815x != null) {
            this.f15815x.lambda$put$1$DataCenter("cmd_enter_widget_layout_change", awVar2);
        }
    }

    /* renamed from: a */
    public final void mo11887a(int i) {
        int i2 = 0;
        if (this.f15715a == null || !this.f15715a.isOfficial()) {
            this.f15666V = i;
            if (i == 0) {
                m12947a(false);
            }
            if (this.f15667W == null) {
                this.f15667W = new View[this.f15665U.size()];
                for (int i3 = 0; i3 < this.f15667W.length; i3++) {
                    this.f15667W[i3] = this.f15674ad.findViewById(((Integer) this.f15665U.get(i3)).intValue());
                }
            }
            if (i == 8) {
                for (int i4 = 0; i4 < this.f15665U.size(); i4++) {
                    if (this.f15667W[i4] != null) {
                        this.f15668X.set(i4, Integer.valueOf(this.f15667W[i4].getVisibility()));
                        this.f15667W[i4].setVisibility(8);
                    }
                }
                if (this.f15673ac == null) {
                    this.f15673ac = (LinearLayout) this.f15674ad.findViewById(R.id.ac);
                }
                if (this.f15673ac != null) {
                    this.f15670Z = new ArrayList();
                    this.f15669Y = new ArrayList();
                    while (i2 < this.f15673ac.getChildCount()) {
                        View childAt = this.f15673ac.getChildAt(i2);
                        if (mo11891j() || !(childAt.getTag() == C6605h.RECHARGE_GUIDE || childAt.getTag() == C6605h.FAST_GIFT || childAt.getTag() == C6605h.GIFT || childAt.getTag() == C6605h.SWITCH_SCREEN_ORIENTATION)) {
                            this.f15669Y.add(childAt);
                            this.f15670Z.add(Integer.valueOf(childAt.getVisibility()));
                            childAt.setVisibility(8);
                        }
                        i2++;
                    }
                    return;
                }
            } else {
                for (int i5 = 0; i5 < this.f15665U.size(); i5++) {
                    if (this.f15667W[i5] != null) {
                        this.f15667W[i5].setVisibility(((Integer) this.f15668X.get(i5)).intValue());
                        if (i == 0 && this.f15667W[i5].getId() == R.id.ue && !mo11891j()) {
                            C9432q.m18691b(this.f15667W[i5], i);
                        }
                    }
                }
                if (this.f15669Y != null) {
                    int size = this.f15669Y.size();
                    while (i2 < size) {
                        ((View) this.f15669Y.get(i2)).setVisibility(((Integer) this.f15670Z.get(i2)).intValue());
                        i2++;
                    }
                }
            }
            return;
        }
        this.f15666V = i;
        if (i == 0) {
            m12947a(false);
            if (!(this.f15676af == null || this.f15676af.getVisibility() == 0)) {
                this.f15676af.setVisibility(0);
            }
            if (!(this.f15677ag == null || this.f15677ag.getVisibility() == 0)) {
                this.f15677ag.setVisibility(0);
            }
            return;
        }
        if (i == 8) {
            if (this.f15676af != null && this.f15676af.getVisibility() == 0) {
                this.f15676af.setVisibility(4);
            }
            if (!(this.f15677ag == null || this.f15677ag.getVisibility() == 8)) {
                this.f15677ag.setVisibility(8);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null) {
            view.findViewById(R.id.aoq).setOnTouchListener(this);
            view.findViewById(R.id.d37).setOnTouchListener(this);
            view.findViewById(R.id.enj).setOnClickListener(this);
            view.findViewById(R.id.blh).setVisibility(8);
        }
        for (int valueOf : f15663T) {
            this.f15665U.add(Integer.valueOf(valueOf));
            this.f15668X.add(Integer.valueOf(8));
        }
        C6600d a = C6610k.m13985a();
        a.mo12668a(C6605h.SWITCH_VIDEO_QUALITY, (C6601a) new C5953c());
        a.mo12668a(C6605h.SWITCH_SCREEN_ORIENTATION, (C6601a) new C5952b());
        if (C3894h.m9842a(getContext())) {
            this.f15674ad.setPadding(C9432q.m18695e(getContext()), -3, -3, -3);
        }
        if (view != null) {
            C9432q.m18691b(view.findViewById(R.id.ij), 8);
            if (mo11891j()) {
                C9432q.m18691b(view.findViewById(R.id.ue), 8);
            }
        }
        if (this.f15715a != null && this.f15715a.isOfficial()) {
            C6610k.m13985a().mo12668a(C6605h.DOUYIN_OFFICIAL_IMMERSE, (C6601a) new C5951a());
            C6610k.m13985a().mo12668a(C6605h.DOUYIN_OFFICIAL_QUALITY, (C6601a) new C5953c());
            LayoutParams layoutParams = (LayoutParams) this.f15804m.getLayoutParams();
            LayoutParams layoutParams2 = new LayoutParams(layoutParams.width, layoutParams.height);
            layoutParams2.addRule(11);
            layoutParams2.addRule(6, R.id.a7p);
            layoutParams2.topMargin = (int) C9432q.m18687b(getContext(), 46.0f);
            layoutParams2.rightMargin = (int) C9432q.m18687b(getContext(), 8.0f);
            this.f15804m.setLayoutParams(layoutParams2);
            if (view != null) {
                View findViewById = view.findViewById(R.id.bu7);
                if (findViewById != null && getContext() != null) {
                    C9432q.m18679a(findViewById, -3, (int) (((float) C9432q.m18688b(getContext())) * 0.6f));
                    C9432q.m18680a(findViewById, -3, (int) C9432q.m18687b(getContext(), 40.0f), -3, -3);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11888a(View view, Bundle bundle) {
        this.f15690A.load(R.id.aj, new ActionMessageWidget());
        if (!mo11891j()) {
            this.f15690A.load(R.id.bu7, new OBSBarrageWidget());
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (view.getId() == R.id.aoq) {
            if (this.f15675ae) {
                switch (motionEvent.getAction()) {
                    case 0:
                        if (SystemClock.elapsedRealtime() - this.f15672ab > 300) {
                            z = true;
                        }
                        this.f15672ab = SystemClock.elapsedRealtime();
                        return z;
                    case 1:
                        mo11887a(0);
                        break;
                }
            } else {
                return false;
            }
        } else if (view.getId() == R.id.d37) {
            m12947a(false);
            return false;
        }
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f15674ad = LayoutInflater.from(getContext()).inflate(R.layout.akh, viewGroup, false);
        this.f15676af = this.f15674ad.findViewById(R.id.a7p);
        if (this.f15715a == null || !this.f15715a.isOfficial()) {
            this.f15676af.setVisibility(8);
        }
        this.f15677ag = this.f15674ad.findViewById(R.id.lt);
        return this.f15674ad;
    }
}
