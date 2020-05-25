package com.p683ss.android.ugc.aweme.p1807im.sdk.detail;

import android.os.Bundle;
import android.support.p043v7.widget.SwitchCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11202k;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.selectmsg.C33707b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34214b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52714n;
import p2628d.p2639f.p2641b.C52715o;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2644h.C52737a;
import p2628d.p2644h.C52738b;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.BaseChatDetailActivity */
public abstract class BaseChatDetailActivity extends AmeActivity implements OnClickListener, OnCheckedChangeListener {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88039a = {C52728w.m112247a((C52714n) new C52715o(C52728w.m112245a(BaseChatDetailActivity.class), "mIsMute", "getMIsMute()Z")), C52728w.m112247a((C52714n) new C52715o(C52728w.m112245a(BaseChatDetailActivity.class), "mIsStickTop", "getMIsStickTop()Z"))};

    /* renamed from: b */
    protected ImTextTitleBar f88040b;

    /* renamed from: c */
    public SwitchCompat f88041c;

    /* renamed from: d */
    public SwitchCompat f88042d;

    /* renamed from: e */
    public C11190e f88043e;

    /* renamed from: f */
    private ViewGroup f88044f;

    /* renamed from: g */
    private TextView f88045g;

    /* renamed from: h */
    private TextView f88046h;

    /* renamed from: i */
    private final C52738b f88047i;

    /* renamed from: j */
    private final C52738b f88048j;

    /* renamed from: k */
    private HashMap f88049k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.BaseChatDetailActivity$a */
    public static final class C34054a extends C52737a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f88050a;

        /* renamed from: b */
        final /* synthetic */ BaseChatDetailActivity f88051b;

        public C34054a(Object obj, Object obj2, BaseChatDetailActivity baseChatDetailActivity) {
            this.f88050a = obj;
            this.f88051b = baseChatDetailActivity;
            super(obj2);
        }

        /* renamed from: a */
        public final void mo52013a(C52767h<?> hVar, Boolean bool, Boolean bool2) {
            C52711k.m112240b(hVar, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            if (BaseChatDetailActivity.m77826a(this.f88051b).isChecked() ^ booleanValue) {
                BaseChatDetailActivity.m77826a(this.f88051b).setChecked(booleanValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.BaseChatDetailActivity$b */
    public static final class C34055b extends C52737a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f88052a;

        /* renamed from: b */
        final /* synthetic */ BaseChatDetailActivity f88053b;

        public C34055b(Object obj, Object obj2, BaseChatDetailActivity baseChatDetailActivity) {
            this.f88052a = obj;
            this.f88053b = baseChatDetailActivity;
            super(obj2);
        }

        /* renamed from: a */
        public final void mo52013a(C52767h<?> hVar, Boolean bool, Boolean bool2) {
            C52711k.m112240b(hVar, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            if (BaseChatDetailActivity.m77828b(this.f88053b).isChecked() ^ booleanValue) {
                BaseChatDetailActivity.m77828b(this.f88053b).setChecked(booleanValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.BaseChatDetailActivity$c */
    public static final class C34056c implements C11162b<C11180b> {

        /* renamed from: a */
        final /* synthetic */ BaseChatDetailActivity f88054a;

        C34056c(BaseChatDetailActivity baseChatDetailActivity) {
            this.f88054a = baseChatDetailActivity;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20506a(Object obj) {
            C52711k.m112240b((C11180b) obj, "result");
            this.f88054a.mo72011a(!this.f88054a.mo72013b());
            BaseChatDetailActivity.m77826a(this.f88054a).setEnabled(true);
        }

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            C34214b.m78054a(this.f88054a, kVar);
            BaseChatDetailActivity.m77826a(this.f88054a).setChecked(this.f88054a.mo72013b());
            BaseChatDetailActivity.m77826a(this.f88054a).setEnabled(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.BaseChatDetailActivity$d */
    public static final class C34057d implements C11162b<C11180b> {

        /* renamed from: a */
        final /* synthetic */ BaseChatDetailActivity f88055a;

        C34057d(BaseChatDetailActivity baseChatDetailActivity) {
            this.f88055a = baseChatDetailActivity;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20506a(Object obj) {
            C52711k.m112240b((C11180b) obj, "result");
            this.f88055a.mo72012b(!this.f88055a.mo72014c());
            BaseChatDetailActivity.m77828b(this.f88055a).setEnabled(true);
        }

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            C52711k.m112240b(kVar, "error");
            C34214b.m78054a(this.f88055a, kVar);
            BaseChatDetailActivity.m77828b(this.f88055a).setChecked(this.f88055a.mo72014c());
            BaseChatDetailActivity.m77828b(this.f88055a).setEnabled(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.BaseChatDetailActivity$e */
    public static final class C34058e implements C35356a {

        /* renamed from: a */
        final /* synthetic */ BaseChatDetailActivity f88056a;

        /* renamed from: b */
        public final void mo70670b() {
        }

        /* renamed from: c */
        public final void mo70671c() {
        }

        /* renamed from: a */
        public final void mo70669a() {
            this.f88056a.finish();
        }

        C34058e(BaseChatDetailActivity baseChatDetailActivity) {
            this.f88056a = baseChatDetailActivity;
        }
    }

    /* renamed from: a */
    public View mo72009a(int i) {
        if (this.f88049k == null) {
            this.f88049k = new HashMap();
        }
        View view = (View) this.f88049k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f88049k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo72011a(boolean z) {
        this.f88047i.mo110334a(this, f88039a[0], Boolean.valueOf(z));
    }

    /* renamed from: b */
    public final void mo72012b(boolean z) {
        this.f88048j.mo110334a(this, f88039a[1], Boolean.valueOf(z));
    }

    /* renamed from: b */
    public final boolean mo72013b() {
        return ((Boolean) this.f88047i.mo110333a(this, f88039a[0])).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo72014c() {
        return ((Boolean) this.f88048j.mo110333a(this, f88039a[1])).booleanValue();
    }

    /* renamed from: d */
    public abstract int mo72015d();

    /* renamed from: e */
    public void mo72016e() {
    }

    public void setStatusBarColor() {
    }

    public BaseChatDetailActivity() {
        Boolean valueOf = Boolean.valueOf(false);
        this.f88047i = new C34054a(valueOf, valueOf, this);
        Boolean valueOf2 = Boolean.valueOf(false);
        this.f88048j = new C34055b(valueOf2, valueOf2, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ImTextTitleBar mo72010a() {
        ImTextTitleBar imTextTitleBar = this.f88040b;
        if (imTextTitleBar == null) {
            C52711k.m112237a("mTitleBar");
        }
        return imTextTitleBar;
    }

    public void onDestroy() {
        String str;
        super.onDestroy();
        C11190e eVar = this.f88043e;
        if (eVar != null) {
            str = eVar.f30190a;
        } else {
            str = null;
        }
        HashMap<String, Integer> hashMap = C33707b.f87418b;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        C33707b.m77192a(str);
    }

    /* renamed from: g */
    public void mo72018g() {
        TextView textView = this.f88045g;
        if (textView == null) {
            C52711k.m112237a("mMuteText");
        }
        OnClickListener onClickListener = this;
        textView.setOnClickListener(onClickListener);
        TextView textView2 = this.f88046h;
        if (textView2 == null) {
            C52711k.m112237a("mStickTopText");
        }
        textView2.setOnClickListener(onClickListener);
        SwitchCompat switchCompat = this.f88041c;
        if (switchCompat == null) {
            C52711k.m112237a("mMuteSwitch");
        }
        OnCheckedChangeListener onCheckedChangeListener = this;
        switchCompat.setOnCheckedChangeListener(onCheckedChangeListener);
        SwitchCompat switchCompat2 = this.f88042d;
        if (switchCompat2 == null) {
            C52711k.m112237a("mStickTopSwitch");
        }
        switchCompat2.setOnCheckedChangeListener(onCheckedChangeListener);
        ImTextTitleBar imTextTitleBar = this.f88040b;
        if (imTextTitleBar == null) {
            C52711k.m112237a("mTitleBar");
        }
        imTextTitleBar.setOnTitlebarClickListener(new C34058e(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f6  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72017f() {
        /*
            r5 = this;
            r0 = 2132023404(0x7f14186c, float:1.9685255E38)
            android.view.View r0 = r5.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.title_bar)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar) r0
            r5.f88040b = r0
            r0 = 2132020461(0x7f140ced, float:1.9679286E38)
            android.view.View r0 = r5.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.layout_mute)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.f88044f = r0
            r0 = 2132023948(0x7f141a8c, float:1.9686358E38)
            android.view.View r0 = r5.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.tv_mute)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.f88045g = r0
            r0 = 2132023203(0x7f1417a3, float:1.9684847E38)
            android.view.View r0 = r5.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.switch_mute)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.support.v7.widget.SwitchCompat r0 = (android.support.p043v7.widget.SwitchCompat) r0
            r5.f88041c = r0
            r0 = 2132024123(0x7f141b3b, float:1.9686713E38)
            android.view.View r0 = r5.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.tv_stick_top)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.f88046h = r0
            r0 = 2132023206(0x7f1417a6, float:1.9684853E38)
            android.view.View r0 = r5.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.switch_stick_top)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.support.v7.widget.SwitchCompat r0 = (android.support.p043v7.widget.SwitchCompat) r0
            r5.f88042d = r0
            boolean r0 = com.bytedance.ies.dmt.p664ui.common.C10675b.m21497b()
            if (r0 == 0) goto L_0x006a
            r0 = 2131820961(0x7f1101a1, float:1.9274652E38)
            goto L_0x006d
        L_0x006a:
            r0 = 2131820960(0x7f1101a0, float:1.927465E38)
        L_0x006d:
            boolean r1 = com.bytedance.ies.dmt.p664ui.common.C10675b.m21497b()
            if (r1 == 0) goto L_0x0077
            r1 = 2131820959(0x7f11019f, float:1.9274648E38)
            goto L_0x007a
        L_0x0077:
            r1 = 2131820958(0x7f11019e, float:1.9274646E38)
        L_0x007a:
            android.support.v7.widget.SwitchCompat r2 = r5.f88041c
            if (r2 != 0) goto L_0x0083
            java.lang.String r3 = "mMuteSwitch"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0083:
            r3 = r5
            android.content.Context r3 = (android.content.Context) r3
            android.content.res.ColorStateList r4 = android.support.p043v7.p044a.p045a.C1124a.m3313a(r3, r0)
            r2.setTrackTintList(r4)
            android.support.v7.widget.SwitchCompat r2 = r5.f88041c
            if (r2 != 0) goto L_0x0096
            java.lang.String r4 = "mMuteSwitch"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0096:
            android.content.res.ColorStateList r4 = android.support.p043v7.p044a.p045a.C1124a.m3313a(r3, r1)
            r2.setThumbTintList(r4)
            android.support.v7.widget.SwitchCompat r2 = r5.f88042d
            if (r2 != 0) goto L_0x00a6
            java.lang.String r4 = "mStickTopSwitch"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x00a6:
            android.content.res.ColorStateList r0 = android.support.p043v7.p044a.p045a.C1124a.m3313a(r3, r0)
            r2.setTrackTintList(r0)
            android.support.v7.widget.SwitchCompat r0 = r5.f88042d
            if (r0 != 0) goto L_0x00b6
            java.lang.String r2 = "mStickTopSwitch"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00b6:
            android.content.res.ColorStateList r1 = android.support.p043v7.p044a.p045a.C1124a.m3313a(r3, r1)
            r0.setThumbTintList(r1)
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices.IMService.get()
            java.lang.String r1 = "IMService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r0 = r0.isImReduction()
            if (r0 == 0) goto L_0x00da
            android.view.ViewGroup r0 = r5.f88044f
            if (r0 != 0) goto L_0x00d5
            java.lang.String r1 = "mMuteLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00d5:
            r1 = 8
            r0.setVisibility(r1)
        L_0x00da:
            com.bytedance.im.core.c.e r0 = r5.f88043e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00ee
            com.bytedance.im.core.c.b r0 = r0.mo20685a()
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r0.isStickTop()
            if (r0 != r2) goto L_0x00ee
            r0 = 1
            goto L_0x00ef
        L_0x00ee:
            r0 = 0
        L_0x00ef:
            r5.mo72012b(r0)
            com.bytedance.im.core.c.e r0 = r5.f88043e
            if (r0 == 0) goto L_0x0103
            com.bytedance.im.core.c.b r0 = r0.mo20685a()
            if (r0 == 0) goto L_0x0103
            boolean r0 = r0.isMute()
            if (r0 != r2) goto L_0x0103
            r1 = 1
        L_0x0103:
            r5.mo72011a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.BaseChatDetailActivity.mo72017f():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ SwitchCompat m77826a(BaseChatDetailActivity baseChatDetailActivity) {
        SwitchCompat switchCompat = baseChatDetailActivity.f88041c;
        if (switchCompat == null) {
            C52711k.m112237a("mMuteSwitch");
        }
        return switchCompat;
    }

    /* renamed from: b */
    public static final /* synthetic */ SwitchCompat m77828b(BaseChatDetailActivity baseChatDetailActivity) {
        SwitchCompat switchCompat = baseChatDetailActivity.f88042d;
        if (switchCompat == null) {
            C52711k.m112237a("mStickTopSwitch");
        }
        return switchCompat;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo72015d());
        C34004b.m77718b().setupStatusBar(this);
        mo72016e();
        mo72017f();
        mo72018g();
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C52711k.m112240b(view, "v");
        int id = view.getId();
        if (id == R.id.dcj) {
            SwitchCompat switchCompat = this.f88041c;
            if (switchCompat == null) {
                C52711k.m112237a("mMuteSwitch");
            }
            SwitchCompat switchCompat2 = this.f88041c;
            if (switchCompat2 == null) {
                C52711k.m112237a("mMuteSwitch");
            }
            switchCompat.setChecked(!switchCompat2.isChecked());
            return;
        }
        if (id == R.id.dgk) {
            SwitchCompat switchCompat3 = this.f88042d;
            if (switchCompat3 == null) {
                C52711k.m112237a("mStickTopSwitch");
            }
            SwitchCompat switchCompat4 = this.f88042d;
            if (switchCompat4 == null) {
                C52711k.m112237a("mStickTopSwitch");
            }
            switchCompat3.setChecked(!switchCompat4.isChecked());
        }
    }

    /* renamed from: a */
    private final void m77827a(boolean z, String str) {
        String str2 = "off";
        if (z) {
            str2 = "on";
        }
        C11190e eVar = this.f88043e;
        String str3 = null;
        if (eVar != null) {
            C11180b a = eVar.mo20685a();
            if (a != null && a.getConversationType() == C11170a.f30116b) {
                C35190af.m79442a();
                C11190e eVar2 = this.f88043e;
                if (eVar2 != null) {
                    str3 = eVar2.f30190a;
                }
                C35190af.m79486b(str3, "group", str2, str);
                return;
            }
        }
        C11190e eVar3 = this.f88043e;
        if (eVar3 != null) {
            C11180b a2 = eVar3.mo20685a();
            if (a2 != null && a2.getConversationType() == C11170a.f30115a) {
                C35190af.m79442a();
                C11190e eVar4 = this.f88043e;
                if (eVar4 != null) {
                    str3 = eVar4.f30190a;
                }
                C35190af.m79486b(str3, "private", str2, str);
            }
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton != null) {
            int id = compoundButton.getId();
            if (id == R.id.cw_) {
                if (z != mo72013b()) {
                    SwitchCompat switchCompat = this.f88041c;
                    if (switchCompat == null) {
                        C52711k.m112237a("mMuteSwitch");
                    }
                    switchCompat.setEnabled(false);
                    m77827a(!mo72013b(), "chat_mute_click");
                    C11190e eVar = this.f88043e;
                    if (eVar != null) {
                        eVar.mo20699b(!mo72013b(), (C11162b<C11180b>) new C34056c<C11180b>(this));
                    }
                }
            } else if (id == R.id.cwc && z != mo72014c()) {
                SwitchCompat switchCompat2 = this.f88042d;
                if (switchCompat2 == null) {
                    C52711k.m112237a("mStickTopSwitch");
                }
                switchCompat2.setEnabled(false);
                m77827a(!mo72014c(), "chat_top_click");
                C11190e eVar2 = this.f88043e;
                if (eVar2 != null) {
                    eVar2.mo20694a(!mo72014c(), (C11162b<C11180b>) new C34057d<C11180b>(this));
                }
            }
        }
    }
}
