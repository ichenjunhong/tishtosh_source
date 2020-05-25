package com.bytedance.android.livesdk.chatroom.interact;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p030v4.app.C0654k.C0656b;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5294c.C5296b;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5297d.C5299b;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5321l.C5322a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5321l.C5323b;
import com.bytedance.android.livesdk.chatroom.interact.p314d.C5328a;
import com.bytedance.android.livesdk.chatroom.interact.p314d.C5330c;
import com.bytedance.android.livesdk.chatroom.interact.p314d.C5332e;
import com.bytedance.android.livesdk.chatroom.interact.p314d.C5335h;
import com.bytedance.android.livesdk.chatroom.interact.p314d.C5339k;
import com.bytedance.android.livesdk.chatroom.interact.p314d.C5345q;
import com.bytedance.android.livesdk.chatroom.interact.p314d.C5347s;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5379a;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5382c;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5417bb;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.a */
public final class C5249a extends C6736d implements C5323b {

    /* renamed from: a */
    public int f14021a;

    /* renamed from: b */
    ViewGroup f14022b;

    /* renamed from: c */
    ViewGroup f14023c;

    /* renamed from: d */
    ViewGroup f14024d;

    /* renamed from: e */
    TextView f14025e;

    /* renamed from: f */
    public DataCenter f14026f;

    /* renamed from: g */
    public C0184k f14027g;

    /* renamed from: h */
    Stack<C5296b> f14028h = new Stack<>();

    /* renamed from: i */
    public C5251a f14029i;

    /* renamed from: k */
    ValueAnimator f14030k;

    /* renamed from: l */
    boolean f14031l = true;

    /* renamed from: m */
    C5299b f14032m;

    /* renamed from: n */
    private View f14033n;

    /* renamed from: o */
    private C5322a f14034o;

    /* renamed from: p */
    private List<Runnable> f14035p = new ArrayList();

    /* renamed from: q */
    private View f14036q;

    /* renamed from: r */
    private int f14037r;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.a$a */
    public static final class C5251a {

        /* renamed from: a */
        public User f14038a;

        /* renamed from: b */
        public Room f14039b;

        /* renamed from: c */
        public long f14040c;

        /* renamed from: d */
        public String f14041d;

        /* renamed from: e */
        public boolean f14042e;

        /* renamed from: f */
        public LinkAutoMatchModel f14043f;

        /* renamed from: g */
        public String f14044g;

        /* renamed from: h */
        public int f14045h;

        /* renamed from: i */
        public C5382c f14046i;

        /* renamed from: j */
        public C5379a f14047j;

        /* renamed from: k */
        public C2949a f14048k;

        /* renamed from: l */
        private DataCenter f14049l;

        /* renamed from: m */
        private C0184k f14050m;

        /* renamed from: a */
        public final C5249a mo11102a(LinkAutoMatchModel linkAutoMatchModel) {
            this.f14043f = linkAutoMatchModel;
            return mo11101a(2);
        }

        /* renamed from: a */
        public C5249a mo11101a(int i) {
            C5249a aVar = new C5249a();
            aVar.f14029i = this;
            aVar.f14027g = this.f14050m;
            aVar.f14026f = this.f14049l;
            aVar.f14021a = i;
            return aVar;
        }

        private C5251a(DataCenter dataCenter, C0184k kVar) {
            this.f14049l = dataCenter;
            this.f14050m = kVar;
        }

        /* renamed from: a */
        public final C5249a mo11103a(C5379a aVar, C2949a aVar2) {
            this.f14047j = aVar;
            this.f14048k = aVar2;
            return mo11101a(4);
        }
    }

    /* renamed from: d */
    public final C0184k mo11098d() {
        return this.f14027g;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f14034o.mo11204a();
    }

    /* renamed from: a */
    public final void mo11093a() {
        if (getDialog() != null && !this.f14028h.isEmpty()) {
            this.f14031l = true;
            m11899a((Runnable) new C5361e(this));
        }
    }

    /* renamed from: c */
    public final Room mo11097c() {
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom == null) {
            return new Room();
        }
        return currentRoom;
    }

    /* renamed from: b */
    public final View mo11095b() {
        if (this.f14033n == null) {
            AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
            autoRTLImageView.setLayoutParams(new LayoutParams(C3922z.m9899a(32.0f), C3922z.m9899a(32.0f)));
            autoRTLImageView.setImageDrawable(C3922z.m9911c(R.drawable.bsi));
            autoRTLImageView.setOnClickListener(new C5378g(this));
            this.f14033n = autoRTLImageView;
        }
        return this.f14033n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo11099e() {
        Dialog dialog = getDialog();
        Context context = getContext();
        if (dialog != null && context != null) {
            View currentFocus = getDialog().getCurrentFocus();
            if (currentFocus != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                if (inputMethodManager != null && inputMethodManager.isActive()) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
            }
        }
    }

    public final void onDestroyView() {
        if (this.f14023c != null) {
            this.f14023c.removeAllViews();
        }
        if (this.f14024d != null) {
            this.f14024d.removeAllViews();
        }
        super.onDestroyView();
        if (this.f14030k != null) {
            this.f14030k.cancel();
        }
        this.f14028h.removeAllElements();
    }

    public final void onResume() {
        super.onResume();
        if (!C9414h.m18630a(this.f14035p)) {
            for (Runnable run : this.f14035p) {
                run.run();
            }
        }
        this.f14035p.clear();
    }

    /* renamed from: h */
    public final boolean mo11100h() {
        if (!this.f14028h.isEmpty()) {
            if (((C5296b) this.f14028h.peek()).mo11151d() != null) {
                ((C5296b) this.f14028h.peek()).mo11151d().performClick();
                return true;
            } else if (this.f14028h.size() == 1) {
                if (this.f14031l) {
                    if (this.f14021a == 1 && (this.f14032m instanceof C5330c)) {
                        ((C5330c) this.f14032m).mo11226a();
                    }
                    dismiss();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m11899a(Runnable runnable) {
        if (isResumed()) {
            runnable.run();
        } else {
            this.f14035p.add(runnable);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11096b(C5296b bVar) {
        m11899a((Runnable) new C5386h(this, bVar));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.z3);
        this.f14034o = new C5417bb();
        this.f14037r = ((Integer) LiveSettingKeys.PK_RECOMMEND_AND_LINEKMIC_OPTMIZE.mo9431a()).intValue();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnCancelListener(new C5285b(this));
        onCreateDialog.setCanceledOnTouchOutside(true);
        return onCreateDialog;
    }

    /* renamed from: a */
    public final void mo11094a(C5296b bVar) {
        if (getDialog() != null && bVar != null) {
            if (bVar instanceof C5332e) {
                this.f14031l = false;
            } else if (!(bVar instanceof C5330c) || this.f14021a != 0) {
                this.f14031l = true;
            } else {
                this.f14031l = false;
            }
            m11899a((Runnable) new C5371f(this, bVar));
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: a */
    public static C5251a m11898a(DataCenter dataCenter, C0184k kVar) {
        return new C5251a(dataCenter, kVar);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getChildFragmentManager().mo2230a((C0656b) new C5327d(this));
        if (this.f14028h.empty()) {
            boolean z = true;
            switch (this.f14021a) {
                case 0:
                    mo11094a((C5296b) C5328a.m12064a(this, this.f14026f));
                    break;
                case 1:
                    if (LinkCrossRoomDataHolder.m11103a().f12627r != 0) {
                        if (!TextUtils.isEmpty(this.f14029i.f14041d)) {
                            this.f14029i.f14041d = getString(R.string.el8);
                        }
                        if (this.f14029i.f14038a != null) {
                            mo11094a((C5296b) C5339k.m12112a(this, 1, this.f14029i.f14041d, this.f14029i.f14038a, this.f14029i.f14040c, 0, this.f14026f, (int) LinkCrossRoomDataHolder.m11103a().f12628s));
                            break;
                        }
                    } else {
                        if (!TextUtils.isEmpty(this.f14029i.f14041d)) {
                            this.f14029i.f14041d = getString(R.string.ekq);
                        }
                        if ((LinkCrossRoomDataHolder.m11103a().f12619j <= 0 || !(this.f14037r == 2 || this.f14037r == 3)) && !(LinkCrossRoomDataHolder.m11103a().f12619j == 0 && (this.f14037r == 1 || this.f14037r == 3))) {
                            z = false;
                        }
                        if (!z) {
                            if (this.f14029i.f14038a != null) {
                                C5332e a = C5332e.m12081a(this, 1, this.f14029i.f14041d, this.f14029i.f14038a, this.f14029i.f14040c, 0, this.f14026f, this.f14029i.f14045h);
                                this.f14032m = a;
                                mo11094a((C5296b) a);
                                break;
                            }
                        } else if (this.f14029i.f14039b != null) {
                            C5299b a2 = C5330c.m12071a(this, 1, this.f14029i.f14041d, this.f14029i.f14039b, this.f14029i.f14044g, this.f14029i.f14040c, 0, this.f14026f, this.f14029i.f14045h, this.f14029i.f14046i);
                            this.f14032m = a2;
                            mo11094a((C5296b) a2);
                            break;
                        }
                    }
                    break;
                case 2:
                    mo11094a((C5296b) C5335h.m12090a(this, this.f14029i.f14043f, 3, this.f14026f));
                    break;
                case 3:
                    mo11094a((C5296b) C5335h.m12090a(this, this.f14029i.f14043f, 2, this.f14026f));
                    break;
                case 4:
                    mo11094a((C5296b) C5345q.m12135a(this, this.f14026f, this.f14029i.f14047j, this.f14029i.f14048k));
                    break;
                case 5:
                    mo11094a((C5296b) C5345q.m12135a(this, this.f14026f, this.f14029i.f14047j, this.f14029i.f14048k));
                    mo11094a((C5296b) C5335h.m12090a(this, null, 1, this.f14026f));
                    break;
                case 6:
                    mo11094a((C5296b) C5347s.m12141a((C5323b) this, 2, this.f14026f, this.f14029i.f14042e));
                    break;
            }
        }
        C4525b.f12352aU.mo10346a(getString(R.string.emg));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f14036q = LayoutInflater.from(getContext()).inflate(R.layout.ak9, viewGroup, false);
        this.f14025e = (TextView) this.f14036q.findViewById(R.id.dhb);
        this.f14023c = (ViewGroup) this.f14036q.findViewById(R.id.b8_);
        this.f14024d = (ViewGroup) this.f14036q.findViewById(R.id.b9d);
        this.f14022b = (ViewGroup) this.f14036q.findViewById(R.id.ajf);
        this.f14036q.findViewById(R.id.bvn).setOnClickListener(new C5287c(this));
        return this.f14036q;
    }
}
