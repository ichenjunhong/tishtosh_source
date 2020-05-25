package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.setting.C4085g;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.api.StickerDonationRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C5164aj;
import com.bytedance.android.livesdk.chatroom.event.C5174at;
import com.bytedance.android.livesdk.chatroom.event.C5176av;
import com.bytedance.android.livesdk.chatroom.event.C5200s;
import com.bytedance.android.livesdk.chatroom.model.C5727ap;
import com.bytedance.android.livesdk.chatroom.p325ui.C6107dn;
import com.bytedance.android.livesdk.chatroom.p325ui.C6183ew;
import com.bytedance.android.livesdk.chatroom.p325ui.C6187ey;
import com.bytedance.android.livesdk.chatroom.p325ui.C6187ey.C6189a;
import com.bytedance.android.livesdk.chatroom.presenter.C5880m;
import com.bytedance.android.livesdk.chatroom.presenter.C5880m.C5883a;
import com.bytedance.android.livesdk.chatroom.presenter.C5884n;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k;
import com.bytedance.android.livesdk.chatroom.widget.C6640a;
import com.bytedance.android.livesdk.chatroom.widget.C6640a.C6642a;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4605o;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.p421v.C8374c;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdkapi.depend.model.live.C8721u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.p672e.C10753b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class DecorationWrapperWidget extends LiveWidget implements C0199s<KVData>, C5883a, C6642a {

    /* renamed from: h */
    public static boolean f16928h = false;

    /* renamed from: m */
    public static boolean f16929m = false;

    /* renamed from: o */
    private static final String f16930o = "DecorationWrapperWidget";

    /* renamed from: u */
    private static long f16931u;

    /* renamed from: v */
    private static long f16932v;

    /* renamed from: A */
    private C6189a f16933A = new C6189a() {
        /* renamed from: b */
        public final void mo12235b(String str) {
            DecorationWrapperWidget.this.f16945n = null;
        }

        /* renamed from: a */
        public final void mo12234a(String str) {
            if (DecorationWrapperWidget.this.f16938e != null) {
                if (!DecorationWrapperWidget.this.f16938e.mo11766b()) {
                    C4204a.m10423a(DecorationWrapperWidget.this.context, DecorationWrapperWidget.this.context.getString(R.string.ew3, new Object[]{C6718b.f18316M.mo9431a()}));
                } else if (!DecorationWrapperWidget.this.f16938e.f15394b) {
                    if (TextUtils.isEmpty(str)) {
                        str = DecorationWrapperWidget.this.f16940g;
                    }
                    if (str.length() <= DecorationWrapperWidget.this.f16943k) {
                        DecorationWrapperWidget.this.f16938e.mo11765a(str);
                    } else {
                        C4204a.m10423a(DecorationWrapperWidget.this.context, DecorationWrapperWidget.this.context.getString(R.string.e96, new Object[]{Integer.valueOf(DecorationWrapperWidget.this.f16943k)}));
                    }
                }
            }
        }
    };

    /* renamed from: a */
    boolean f16934a;

    /* renamed from: b */
    boolean f16935b;

    /* renamed from: c */
    int[] f16936c = new int[4];

    /* renamed from: d */
    List<C6640a> f16937d = new ArrayList();

    /* renamed from: e */
    public C5880m f16938e;

    /* renamed from: f */
    Room f16939f;

    /* renamed from: g */
    public String f16940g = "";

    /* renamed from: i */
    public C6183ew f16941i;

    /* renamed from: j */
    public C6275a f16942j;

    /* renamed from: k */
    public int f16943k;

    /* renamed from: l */
    public C5727ap f16944l;

    /* renamed from: n */
    public C6187ey f16945n = null;

    /* renamed from: p */
    private int[] f16946p = new int[4];

    /* renamed from: q */
    private long f16947q;

    /* renamed from: r */
    private boolean f16948r;

    /* renamed from: s */
    private boolean f16949s = false;

    /* renamed from: t */
    private boolean f16950t = false;

    /* renamed from: w */
    private C1690c f16951w;

    /* renamed from: x */
    private C1690c f16952x;

    /* renamed from: y */
    private C6277c f16953y;

    /* renamed from: z */
    private final C1689b f16954z = new C1689b();

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget$a */
    public interface C6275a {
        /* renamed from: d */
        void mo11917d(boolean z);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget$b */
    class C6276b implements C6601a {
        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C6276b() {
        }

        public final void onClick(View view) {
            int i;
            if (DecorationWrapperWidget.this.f16941i == null) {
                DecorationWrapperWidget decorationWrapperWidget = DecorationWrapperWidget.this;
                Context context = DecorationWrapperWidget.this.getContext();
                if (C3922z.m9916f()) {
                    i = R.style.yq;
                } else {
                    i = R.style.yr;
                }
                decorationWrapperWidget.f16941i = new C6183ew(context, i, DecorationWrapperWidget.this.f16944l);
            }
            if (!DecorationWrapperWidget.this.f16941i.isShowing()) {
                DecorationWrapperWidget.this.f16941i.show();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget$c */
    class C6277c implements C6601a {

        /* renamed from: a */
        C8374c f16957a;

        /* renamed from: b */
        C1690c f16958b;

        /* renamed from: d */
        private View f16960d;

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: a */
        private void m13500a() {
            if (this.f16957a != null && this.f16957a.mo14577e()) {
                this.f16957a.dismiss();
            }
        }

        private C6277c() {
        }

        public final void onClick(View view) {
            C10753b bVar;
            m13500a();
            Context context = view.getContext();
            HashMap hashMap = new HashMap();
            if (DecorationWrapperWidget.f16928h) {
                C4204a.m10421a(context, (int) R.string.h0v);
                hashMap.put("is_valid", "0");
            } else if (context instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                C4104a.m10232a(fragmentActivity, new C6107dn(fragmentActivity, false));
                hashMap.put("is_valid", "1");
            }
            C8049c.m15979a().mo14202a("livesdk_donation_stick_anchor_click", hashMap, Room.class);
            if (this.f16960d != null) {
                View findViewById = this.f16960d.findViewById(R.id.exr);
                if (findViewById != null && findViewById.getVisibility() == 0) {
                    findViewById.setVisibility(8);
                    if (context != null) {
                        bVar = C10753b.m21793a(context);
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        bVar.mo19445b("live.mt.sticker_donation.clicked", Boolean.valueOf(true));
                    }
                }
            }
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
            m13500a();
            this.f16957a = null;
            if (this.f16958b != null && !this.f16958b.isDisposed()) {
                this.f16958b.dispose();
            }
            this.f16958b = null;
        }

        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
            C10753b bVar;
            boolean z;
            boolean z2;
            int i;
            this.f16960d = view;
            Context context = view.getContext();
            if (context != null) {
                bVar = C10753b.m21793a(context);
            } else {
                bVar = null;
            }
            if (bVar == null || !bVar.mo19444a("live.mt.sticker_donation.shown", false)) {
                z = false;
            } else {
                z = true;
            }
            if (bVar == null || !bVar.mo19444a("live.mt.sticker_donation.clicked", false)) {
                z2 = false;
            } else {
                z2 = true;
            }
            View findViewById = view.findViewById(R.id.exr);
            if (findViewById != null) {
                if (z2) {
                    i = 8;
                } else {
                    i = 0;
                }
                findViewById.setVisibility(i);
            }
            if (!z) {
                m13500a();
                view.postDelayed(new C6448aj(this, view, bVar), 500);
            }
            C8049c.m15979a().mo14203a("livesdk_donation_stick_anchor_show", Room.class);
        }
    }

    /* renamed from: e */
    public static long m13474e() {
        return f16931u;
    }

    /* renamed from: f */
    public static long m13476f() {
        return f16932v;
    }

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.asa;
    }

    /* renamed from: h */
    private void m13477h() {
        if (this.f16945n != null) {
            this.f16945n.mo12227a();
        }
    }

    /* renamed from: d */
    public final int[] mo11774d() {
        return new int[]{C9432q.m18670a(this.context), C9432q.m18688b(this.context)};
    }

    /* renamed from: a */
    public final void mo11767a() {
        if (isViewValid()) {
            m13477h();
        }
    }

    /* renamed from: c */
    public final void mo11773c() {
        if (isViewValid()) {
            for (C6640a aVar : this.f16937d) {
                if (aVar != null && aVar.getType() == 1) {
                    aVar.mo12760e();
                }
            }
            mo12360g();
        }
    }

    public void onPause() {
        super.onPause();
        boolean equals = Build.BRAND.equals("HUAWEI");
        if (!this.f16948r && equals) {
            if (this.f16950t) {
                this.f16950t = false;
            }
            ((ViewGroup) this.contentView).removeAllViews();
        }
    }

    public void onResume() {
        super.onResume();
        boolean equals = Build.BRAND.equals("HUAWEI");
        if (!this.f16948r && equals && !this.f16950t && !C9376b.m18558a((Collection<T>) this.f16939f.getDecorationList())) {
            ArrayList arrayList = new ArrayList();
            for (C8721u uVar : this.f16939f.getDecorationList()) {
                arrayList.add(new C8721u(uVar));
            }
            mo11772b((List<C8721u>) arrayList);
        }
    }

    /* renamed from: g */
    public final void mo12360g() {
        if (isViewValid() && this.f16948r && this.f16938e != null) {
            JSONArray jSONArray = new JSONArray();
            for (C6640a aVar : this.f16937d) {
                if (aVar != null) {
                    JSONObject decorationInfo = aVar.getDecorationInfo();
                    if (decorationInfo != null) {
                        jSONArray.put(decorationInfo);
                    }
                }
            }
            C5880m mVar = this.f16938e;
            ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).setDecoration(mVar.f15393a, new C4605o().mo10399a("deco_list", String.valueOf(jSONArray.toString())).f12568a).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a(C4064k.m10188c(), (C1710e<? super Throwable>) new C5884n<Object>(mVar));
            ArrayList arrayList = new ArrayList();
            for (C6640a aVar2 : this.f16937d) {
                if (aVar2 != null) {
                    arrayList.add(aVar2.getRoomDecoration());
                }
            }
            String b = C2942b.m8369a().mo34889b(arrayList);
            C4525b.f12337aF.mo10346a(Long.valueOf(this.f16947q));
            C4525b.f12338aG.mo10346a(b);
        }
    }

    public void onDestroy() {
        String str;
        String str2;
        super.onDestroy();
        this.dataCenter.removeObserver(this);
        m13477h();
        this.f16938e.mo8247a();
        long j = 0;
        f16932v = 0;
        f16931u = 0;
        f16928h = false;
        f16929m = false;
        if (this.f16941i != null) {
            this.f16941i.dismiss();
        }
        m13472a(this.f16951w);
        m13472a(this.f16952x);
        if (this.f16948r) {
            if (this.f16935b) {
                str = "use";
            } else {
                str = "unused";
            }
            if (this.f16934a) {
                str2 = "use";
            } else {
                str2 = "unused";
            }
            if (this.f16939f != null) {
                j = this.f16939f.getId();
            }
            HashMap hashMap = new HashMap();
            if (!(this.f16939f == null || this.f16939f.getOwner() == null)) {
                hashMap.put("anchor_id", String.valueOf(this.f16939f.getOwner().getId()));
            }
            hashMap.put("room_id", String.valueOf(j));
            hashMap.put("use_status", str2);
            C8049c.m15979a().mo14202a("live_picture_prop_use", hashMap, new C8059j().mo14213a("live_take_detail").mo14218f("other").mo14214b("live_take"), new C8060k());
            hashMap.put("use_status", str);
            C8049c.m15979a().mo14202a("live_character_prop_use", hashMap, new C8059j().mo14213a("live_take_detail").mo14218f("other").mo14214b("live_take"), new C8060k());
        }
        this.f16954z.dispose();
        this.f16954z.mo6180a();
        C6610k.m13985a().mo12670b(C6605h.STICKER_DONATION, this.f16953y);
    }

    public void onCreate() {
        super.onCreate();
        if (isViewValid() && this.context != null) {
            this.f16936c[0] = 0;
            this.f16936c[1] = ((C9432q.m18688b(this.context) - C3922z.m9913d(R.dimen.s3)) - C3922z.m9913d(R.dimen.r4)) - ((int) C9432q.m18687b(this.context, 20.0f));
            this.f16936c[2] = 0;
            this.f16936c[3] = C9432q.m18670a(this.context);
            this.f16946p = Arrays.copyOf(this.f16936c, this.f16936c.length);
        }
        this.f16948r = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f16939f = (Room) this.dataCenter.get("data_room");
        if (this.f16939f.getOwner() != null) {
            this.f16947q = this.f16939f.getOwner().getId();
        }
        C5880m mVar = new C5880m(this.f16939f.getId(), this.f16939f.getOwner().getId(), this.f16948r);
        this.f16938e = mVar;
        this.f16938e.mo8520a((C5883a) this);
        C6610k.m13986b().mo12668a(C6605h.DECORATION, (C6601a) new C6276b());
        this.f16953y = new C6277c();
        C6610k.m13985a().mo12668a(C6605h.STICKER_DONATION, (C6601a) this.f16953y);
        if (!this.f16948r && !C9376b.m18558a((Collection<T>) this.f16939f.getDecorationList())) {
            ArrayList arrayList = new ArrayList();
            for (C8721u uVar : this.f16939f.getDecorationList()) {
                arrayList.add(new C8721u(uVar));
            }
            mo11772b((List<C8721u>) arrayList);
            this.f16950t = true;
        }
        this.f16954z.mo6181a(C4495a.m10823a().mo10300a(C5164aj.class).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6545f((C1710e<? super T>) new C6441ac<Object>(this)));
        this.f16954z.mo6181a(C4495a.m10823a().mo10300a(C5174at.class).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6545f((C1710e<? super T>) new C6442ad<Object>(this)));
        this.dataCenter.observeForever("cmd_pk_state_change", this).observe("cmd_update_sticker_position", this, true);
    }

    /* renamed from: a */
    public final void mo11768a(C5727ap apVar) {
        this.f16944l = apVar;
    }

    /* renamed from: a */
    private static void m13472a(C1690c cVar) {
        if (cVar != null && !cVar.isDisposed()) {
            cVar.dispose();
        }
    }

    /* renamed from: b */
    public final void mo11772b(List<C8721u> list) {
        this.contentView.post(new C6444af(this, list));
    }

    /* renamed from: a */
    private FragmentActivity m13471a(Context context) {
        while (!(context instanceof FragmentActivity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (FragmentActivity) context;
    }

    /* renamed from: b */
    public final void mo12358b(C8721u uVar) {
        C1690c cVar;
        if (isViewValid() && uVar != null) {
            boolean z = true;
            if (uVar.f23946g != 1) {
                z = false;
            }
            if (z) {
                cVar = this.f16951w;
            } else {
                cVar = this.f16952x;
            }
            m13472a(cVar);
            m13473d(uVar);
        }
    }

    public void onEvent(C5164aj ajVar) {
        if (isViewValid() && ajVar != null && ajVar.f13844a != null) {
            C8721u uVar = ajVar.f13844a;
            mo12355a(uVar);
            mo12359c(uVar);
        }
    }

    /* renamed from: e */
    private void m13475e(C8721u uVar) {
        C1690c cVar;
        boolean z = true;
        if (uVar.f23946g != 1) {
            z = false;
        }
        if (z) {
            cVar = this.f16951w;
        } else {
            cVar = this.f16952x;
        }
        m13472a(cVar);
        C1690c f = C2201v.m6592a(30, TimeUnit.SECONDS).mo6529b(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C6447ai<Object>(this, uVar));
        if (z) {
            this.f16951w = f;
        } else {
            this.f16952x = f;
        }
    }

    /* renamed from: b */
    public final void mo11771b(String str) {
        if (isViewValid()) {
            for (C6640a aVar : this.f16937d) {
                if (aVar != null && aVar.getType() == 1) {
                    aVar.setText(str);
                }
            }
            mo12360g();
        }
    }

    /* renamed from: d */
    private void m13473d(C8721u uVar) {
        if (isViewValid()) {
            Iterator it = this.f16937d.iterator();
            while (it.hasNext()) {
                C6640a aVar = (C6640a) it.next();
                if (aVar != null && aVar.getType() == uVar.f23946g) {
                    ((ViewGroup) this.contentView).removeView(aVar);
                    it.remove();
                }
            }
            if (this.f16948r) {
                if (1 == uVar.f23946g) {
                    f16931u = 0;
                    return;
                }
                if (2 == uVar.f23946g) {
                    f16932v = 0;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.View, java.lang.Object, com.bytedance.android.livesdk.chatroom.widget.a] */
    /* JADX WARNING: type inference failed for: r7v0, types: [com.bytedance.android.livesdk.chatroom.widget.e] */
    /* JADX WARNING: type inference failed for: r2v9, types: [com.bytedance.android.livesdk.chatroom.widget.g] */
    /* JADX WARNING: type inference failed for: r7v2, types: [com.bytedance.android.livesdk.chatroom.widget.e] */
    /* JADX WARNING: type inference failed for: r2v10, types: [com.bytedance.android.livesdk.chatroom.widget.g] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v2, types: [com.bytedance.android.livesdk.chatroom.widget.e]
      assigns: [com.bytedance.android.livesdk.chatroom.widget.e, com.bytedance.android.livesdk.chatroom.widget.g]
      uses: [com.bytedance.android.livesdk.chatroom.widget.e, java.lang.Object, android.view.View, com.bytedance.android.livesdk.chatroom.widget.a, com.bytedance.android.livesdk.chatroom.widget.g]
      mth insns count: 53
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12355a(com.bytedance.android.livesdkapi.depend.model.live.C8721u r14) {
        /*
            r13 = this;
            boolean r0 = r13.isViewValid()
            if (r0 == 0) goto L_0x0076
            if (r14 != 0) goto L_0x000a
            goto L_0x0076
        L_0x000a:
            r13.m13473d(r14)
            int r0 = r14.f23946g
            r1 = 3
            if (r0 != r1) goto L_0x0021
            com.bytedance.android.livesdk.chatroom.widget.g r0 = new com.bytedance.android.livesdk.chatroom.widget.g
            android.content.Context r3 = r13.context
            boolean r5 = r13.f16948r
            int[] r6 = r13.f16936c
            r2 = r0
            r4 = r14
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x002f
        L_0x0021:
            com.bytedance.android.livesdk.chatroom.widget.e r0 = new com.bytedance.android.livesdk.chatroom.widget.e
            android.content.Context r8 = r13.context
            boolean r10 = r13.f16948r
            int[] r11 = r13.f16936c
            r7 = r0
            r9 = r14
            r12 = r13
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x002f:
            int r2 = r14.f23946g
            r3 = 1
            if (r2 != r3) goto L_0x0045
            com.bytedance.android.livesdk.chatroom.presenter.m r2 = r13.f16938e
            if (r2 == 0) goto L_0x0045
            com.bytedance.android.livesdk.chatroom.presenter.m r2 = r13.f16938e
            java.lang.String r2 = r2.mo11762a(r14)
            r0.setText(r2)
            java.lang.String r2 = r14.f23943d
            r13.f16940g = r2
        L_0x0045:
            java.util.List<com.bytedance.android.livesdk.chatroom.widget.a> r2 = r13.f16937d
            r2.add(r0)
            android.view.View r2 = r13.contentView
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r5 = -1
            r4.<init>(r5, r5)
            r2.addView(r0, r4)
            boolean r0 = r13.f16948r
            if (r0 != 0) goto L_0x005c
            return
        L_0x005c:
            int r0 = r14.f23946g
            if (r3 != r0) goto L_0x0065
            long r0 = r14.f23947h
            f16931u = r0
            return
        L_0x0065:
            r0 = 2
            int r2 = r14.f23946g
            if (r0 != r2) goto L_0x006f
            long r0 = r14.f23947h
            f16932v = r0
            return
        L_0x006f:
            int r14 = r14.f23946g
            if (r1 != r14) goto L_0x0075
            f16928h = r3
        L_0x0075:
            return
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget.mo12355a(com.bytedance.android.livesdkapi.depend.model.live.u):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo12359c(C8721u uVar) {
        boolean z;
        long j;
        String str;
        if (this.f16948r) {
            if (uVar.f23946g == 1) {
                z = true;
            } else {
                z = false;
            }
            if (this.f16939f != null) {
                j = this.f16939f.getId();
            } else {
                j = 0;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(j));
            hashMap.put("prop_id", String.valueOf(uVar.f23947h));
            if (z) {
                hashMap.put("words", uVar.f23943d);
            }
            C8049c a = C8049c.m15979a();
            if (z) {
                str = "live_character_prop_show";
            } else {
                str = "live_picture_prop_show";
            }
            a.mo14202a(str, hashMap, new C8059j().mo14213a("live_take_detail").mo14218f("other").mo14214b("live_take"), new C8060k());
            m13475e(uVar);
        }
    }

    /* renamed from: a */
    public final void mo11769a(String str) {
        if (isViewValid()) {
            C4204a.m10423a(this.context, str);
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (isViewValid() && kVData != null && !TextUtils.isEmpty(kVData.getKey()) && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1540323875) {
                if (hashCode == 421233308 && key.equals("cmd_update_sticker_position")) {
                    c = 1;
                }
            } else if (key.equals("cmd_pk_state_change")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    C5200s sVar = (C5200s) kVData.getData();
                    if (sVar.f13914a == 0) {
                        this.f16936c[1] = LinkCrossRoomWidget.m13613j() + LinkCrossRoomWidget.m13614k();
                    } else if (sVar.f13914a == 1) {
                        this.f16936c = this.f16946p;
                    }
                    for (C6640a a : this.f16937d) {
                        a.mo12755a(this.f16936c);
                    }
                    return;
                case 1:
                    C5176av avVar = (C5176av) kVData.getData();
                    if (isViewValid() && this.context != null) {
                        this.contentView.post(new C6443ae(this, avVar));
                        break;
                    } else {
                        return;
                    }
                    break;
            }
        }
    }

    public void onEvent(C5174at atVar) {
        long j;
        if (isViewValid() && atVar != null && !TextUtils.isEmpty(atVar.f13866a) && !f16929m) {
            f16929m = true;
            if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                TTLiveSDKContext.getHostService().mo10315h().mo14516a(getContext(), C8337i.m16520a().mo14540a(C4085g.m10200a()).mo14542b(C4085g.m10201b()).mo14543c(CustomActionPushReceiver.f104061f).mo14539a(-1).mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
                f16929m = false;
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("item_type", Long.valueOf(2));
            String str = "item_id";
            if (this.f16939f != null) {
                j = this.f16939f.getId();
            } else {
                j = 0;
            }
            hashMap.put(str, Long.valueOf(j));
            this.f16954z.mo6181a(((StickerDonationRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(StickerDonationRetrofitApi.class)).createDonateToken(hashMap).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C6445ag<Object>(this, atVar), (C1710e<? super Throwable>) new C6446ah<Object>(this)));
        }
    }

    /* renamed from: a */
    public final void mo11770a(List<C8721u> list) {
        if (isViewValid() && !this.f16948r) {
            for (C6640a removeView : this.f16937d) {
                ((ViewGroup) this.contentView).removeView(removeView);
            }
            this.f16937d.clear();
            if (list != null) {
                for (C8721u uVar : list) {
                    if (uVar != null) {
                        mo12355a(uVar);
                    }
                }
                if (this.f16939f != null) {
                    this.f16939f.setDecorationList(list);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12357a(boolean z) {
        if (this.f16942j != null) {
            this.f16942j.mo11917d(z);
        }
    }

    /* renamed from: a */
    public final void mo12356a(String str, int i) {
        if (isViewValid()) {
            this.f16943k = i;
            this.dataCenter.lambda$put$1$DataCenter("data_pre_show_keyboard", Boolean.valueOf(true));
            if (this.f16945n == null) {
                FragmentActivity a = m13471a(this.context);
                if (a != null) {
                    String string = this.context.getString(R.string.e96, new Object[]{Integer.valueOf(i)});
                    boolean z = this.f16948r;
                    C6187ey eyVar = new C6187ey();
                    Bundle bundle = new Bundle();
                    bundle.putString("live.intent.extra.INPUT", str);
                    bundle.putString("live.intent.extra.HINT", string);
                    bundle.putInt("live.intent.extra.MAX_LENGTH", i);
                    bundle.putBoolean("live.intent.extra.TOUCH_MODAL", false);
                    bundle.putBoolean("live.intent.extra.IS_BROADCASTER", z);
                    eyVar.setArguments(bundle);
                    this.f16945n = eyVar;
                    this.f16945n.f16624b = this.f16933A;
                    try {
                        this.f16945n.show(a.getSupportFragmentManager(), f16930o);
                    } catch (IllegalStateException unused) {
                        this.f16945n = null;
                    }
                }
                return;
            }
            this.f16945n.mo12230a(str);
        }
    }
}
