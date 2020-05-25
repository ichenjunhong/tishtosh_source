package com.bytedance.android.livesdk.rank;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.core.setting.C4085g;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C5182ba;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8052c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.rank.p410c.C8141a;
import com.bytedance.android.livesdk.rank.p411d.C8145a;
import com.bytedance.android.livesdk.rank.view.UserRankListView.C8227a;
import com.bytedance.android.livesdk.user.C8325b.C8326a;
import com.bytedance.android.livesdk.user.C8329d.C8332b;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdk.user.C8334f;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.user.C8344l;
import com.bytedance.android.livesdk.user.C8344l.C8347b;
import com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.depend.p434b.C8615a;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.rank.n */
public final class C8221n extends C6736d implements C0997e, C8227a {

    /* renamed from: a */
    C8145a[] f22454a;

    /* renamed from: b */
    long f22455b;

    /* renamed from: c */
    boolean f22456c;

    /* renamed from: d */
    public boolean f22457d;

    /* renamed from: e */
    String f22458e;

    /* renamed from: f */
    public final C1689b f22459f = new C1689b();

    /* renamed from: g */
    private Room f22460g;

    /* renamed from: h */
    private boolean f22461h;

    /* renamed from: i */
    private String[] f22462i;

    /* renamed from: k */
    private long f22463k;

    /* renamed from: l */
    private String f22464l = "live_room_rank";

    /* renamed from: m */
    private Activity f22465m;

    /* renamed from: n */
    private String f22466n;

    /* renamed from: o */
    private boolean f22467o;

    /* renamed from: p */
    private List<String> f22468p = new ArrayList(Arrays.asList(new String[]{"live_room_rank", "weekly_rank", "totally_rank"}));

    /* renamed from: q */
    private DataCenter f22469q;

    /* renamed from: r */
    private int f22470r = 0;

    /* renamed from: s */
    private C8335g<C3009i> f22471s = new C8335g<C3009i>() {
        public final void onSubscribe(C1690c cVar) {
            super.onSubscribe(cVar);
            C8221n.this.f22459f.mo6181a(cVar);
        }

        public final /* synthetic */ void onNext(Object obj) {
            super.onNext((C3009i) obj);
            C8221n nVar = C8221n.this;
            if (nVar.f18412j && TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                if (nVar.f22455b > 0) {
                    nVar.onEvent(new C8141a(nVar.f22455b));
                    nVar.f22455b = 0;
                    nVar.f22456c = true;
                    return;
                }
                for (C8145a b : nVar.f22454a) {
                    b.mo14345b();
                }
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.rank.n$a */
    static class C8226a extends C0677p {

        /* renamed from: a */
        private final Fragment[] f22476a;

        /* renamed from: b */
        private final String[] f22477b;

        public final int getCount() {
            if (this.f22476a != null) {
                return this.f22476a.length;
            }
            return 0;
        }

        public final CharSequence getPageTitle(int i) {
            return this.f22477b[i];
        }

        /* renamed from: a */
        public final Fragment mo2309a(int i) {
            if (this.f22476a == null || i >= this.f22476a.length) {
                return null;
            }
            return this.f22476a[i];
        }

        C8226a(C0654k kVar, Fragment[] fragmentArr, String[] strArr) {
            super(kVar);
            this.f22476a = fragmentArr;
            this.f22477b = strArr;
        }
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    /* renamed from: b */
    private int m16301b() {
        String[] stringArray = getResources().getStringArray(R.array.ao);
        if (stringArray != null && this.f22470r < stringArray.length) {
            this.f22458e = stringArray[this.f22470r];
        }
        if (!(this.f22458e == null || this.f22462i == null)) {
            for (int i = 0; i < this.f22462i.length; i++) {
                if (this.f22462i[i] != null && this.f22462i[i].equals(this.f22458e)) {
                    return i;
                }
            }
        }
        return 0;
    }

    public final void onDestroyView() {
        String str;
        super.onDestroyView();
        this.f22459f.dispose();
        HashMap hashMap = new HashMap();
        hashMap.put("duration", String.valueOf(System.currentTimeMillis() - this.f22463k));
        hashMap.put("type", this.f22464l);
        C8049c a = C8049c.m15979a();
        String str2 = "livesdk_contribution_ranklist_duration";
        Object[] objArr = new Object[3];
        objArr[0] = Room.class;
        C8059j b = new C8059j().mo14214b("live_interact");
        if (this.f22461h) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        objArr[1] = b.mo14213a(str).mo14215c("popup");
        objArr[2] = new C8060k();
        a.mo14202a(str2, hashMap, objArr);
    }

    /* renamed from: a */
    public final void mo14367a() {
        C8145a[] aVarArr;
        if (this.f22454a != null) {
            for (C8145a aVar : this.f22454a) {
                if (aVar != null) {
                    aVar.mo14344a();
                }
            }
        }
    }

    public final void onEvent(C5182ba baVar) {
        if (isVisible() && baVar.f13879a == 1) {
            dismiss();
        }
    }

    /* renamed from: a */
    private <T> void m16299a(Class<T> cls) {
        this.f22459f.mo6181a(C4495a.m10823a().mo10300a(cls).mo6545f((C1710e<? super T>) new C1710e<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C8141a) {
                    C8221n.this.onEvent((C8141a) t);
                } else if (t instanceof C8615a) {
                    C8221n.this.onEvent((C8615a) t);
                } else {
                    if (t instanceof C5182ba) {
                        C8221n.this.onEvent((C5182ba) t);
                    }
                }
            }
        }));
    }

    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f22467o) {
            i = R.style.xy;
        } else {
            i = R.style.xz;
        }
        setStyle(1, i);
    }

    public final void onEvent(C8615a aVar) {
        if (this.f18412j && this.f22456c) {
            for (C8145a b : this.f22454a) {
                b.mo14345b();
            }
        }
    }

    /* renamed from: a */
    private static boolean m16300a(int i) {
        if ((((Integer) LiveSettingKeys.LIVE_USER_RANK.mo9431a()).intValue() & i) == i) {
            return true;
        }
        return false;
    }

    public final void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (this.f22467o) {
                window.setGravity(80);
                window.setLayout(-1, -2);
            } else {
                int a = C4577ap.m10991a(getContext());
                window.setGravity(8388629);
                LayoutParams attributes = window.getAttributes();
                if (getContext() != null) {
                    attributes.horizontalMargin = C4577ap.m10990a(getContext(), 8.0f) / ((float) C4577ap.m10993b(getContext()));
                }
                window.setAttributes(attributes);
                window.setLayout(a, a - ((int) C4577ap.m10990a(getContext(), 16.0f)));
            }
            LayoutParams attributes2 = window.getAttributes();
            attributes2.dimAmount = 0.0f;
            window.setAttributes(attributes2);
        }
    }

    public final void onPageSelected(int i) {
        String str;
        this.f22464l = (String) this.f22468p.get(i);
        HashMap hashMap = new HashMap();
        hashMap.put("rank_type", this.f22464l);
        C8049c a = C8049c.m15979a();
        String str2 = "livesdk_contribution_ranklist_show";
        Object[] objArr = new Object[3];
        C8059j b = new C8059j().mo14214b("live_interact");
        if (this.f22461h) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        objArr[0] = b.mo14213a(str).mo14215c("popup");
        objArr[1] = new C8060k();
        objArr[2] = Room.class;
        a.mo14202a(str2, hashMap, objArr);
    }

    public final void onEvent(C8141a aVar) {
        String str;
        String str2;
        if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
            this.f22455b = aVar.f22225a;
            TTLiveSDKContext.getHostService().mo10315h().mo14516a(this.f22465m, C8337i.m16520a().mo14540a(C4085g.m10200a()).mo14542b(C4085g.m10201b()).mo14539a(0).mo14541a()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) this.f22471s);
            return;
        }
        if (C4600j.m11040b(this.f22469q) && this.f22460g != null && aVar.f22225a == this.f22460g.author().getId()) {
            C4116c.m10249a(C8612a.class);
            C4600j.m11041c(this.f22469q);
        }
        if (aVar.f22226b) {
            C8333e h = TTLiveSDKContext.getHostService().mo10315h();
            C8326a aVar2 = (C8326a) C8334f.m16518b().mo14503a(aVar.f22225a);
            if (this.f22460g != null) {
                str2 = this.f22460g.getRequestId();
            } else {
                str2 = "";
            }
            h.mo14518a(((C8332b) ((C8332b) ((C8332b) ((C8332b) ((C8332b) ((C8332b) ((C8332b) ((C8332b) aVar2.mo14504a(str2)).mo14507b("live_detail")).mo14508c("")).mo14506b(0)).mo14509d("")).mo14511a(this.f22465m)).mo14512e("live_detail")).mo14513f("follow")).mo14514c()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C1674ab<C8686a>() {
                public final void onComplete() {
                }

                public final void onSubscribe(C1690c cVar) {
                }

                public final /* synthetic */ void onNext(Object obj) {
                    C8221n.this.onEvent(new C8615a((C8686a) obj));
                }

                public final void onError(Throwable th) {
                    if (C8221n.this.f18412j) {
                        if (th instanceof C2949a) {
                            C4204a.m10423a(C8221n.this.getContext(), ((C2949a) th).getPrompt());
                        } else {
                            C4204a.m10421a(C8221n.this.getContext(), (int) R.string.ehf);
                        }
                    }
                }
            });
        } else {
            C8333e h2 = TTLiveSDKContext.getHostService().mo10315h();
            C8347b bVar = (C8347b) ((C8347b) ((C8347b) ((C8347b) new C8347b().mo14503a(aVar.f22225a)).mo14548a("")).mo14550b(0)).mo14547a(this.f22465m);
            bVar.f22709f = "live_detail";
            C8347b bVar2 = (C8347b) bVar.mo14549b();
            bVar2.f22710g = "unfollow";
            h2.mo14520a(new C8344l((C8347b) bVar2.mo14549b())).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C1674ab<C8686a>() {
                public final void onComplete() {
                }

                public final void onSubscribe(C1690c cVar) {
                }

                public final /* synthetic */ void onNext(Object obj) {
                    C8221n.this.onEvent(new C8615a((C8686a) obj));
                }

                public final void onError(Throwable th) {
                    if (C8221n.this.f18412j) {
                        if (th instanceof C2949a) {
                            C4204a.m10423a(C8221n.this.getContext(), ((C2949a) th).getPrompt());
                        } else {
                            C4575an.m10981a((int) R.string.eon);
                        }
                    }
                }
            });
        }
        HashMap hashMap = new HashMap();
        hashMap.put("growth_deepevent", "1");
        C8049c a = C8049c.m15979a();
        String str3 = "follow";
        Object[] objArr = new Object[3];
        objArr[0] = new C8059j().mo14214b("live_interact").mo14218f("core").mo14213a("live_detail").mo14215c("popup");
        if (TextUtils.equals(this.f22464l, "live_room_rank")) {
            str = "single_room_rank";
        } else {
            str = this.f22464l;
        }
        objArr[1] = new C8052c(str, aVar.f22225a);
        objArr[2] = Room.class;
        a.mo14202a(str3, hashMap, objArr);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long j;
        long j2;
        char c;
        int i;
        C8145a[] aVarArr;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j3;
        View inflate = layoutInflater.inflate(R.layout.ajj, viewGroup, false);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.drk);
        if (this.f22460g == null) {
            j = 0;
        } else {
            j = this.f22460g.getId();
        }
        if (this.f22460g == null || this.f22460g.getOwner() == null) {
            j2 = 0;
        } else {
            j2 = this.f22460g.getOwner().getId();
        }
        String[] stringArray = getResources().getStringArray(R.array.ao);
        if (this.f22457d) {
            if (m16300a(1)) {
                this.f22454a = new C8145a[1];
                c = 1;
                String[] strArr = stringArray;
                this.f22454a[0] = C8145a.m16227a(j, j2, this.f22461h, 17, 0, this);
                this.f22462i = strArr;
            } else {
                c = 1;
            }
            i = 2;
        } else {
            String[] strArr2 = stringArray;
            c = 1;
            ArrayList arrayList3 = new ArrayList(3);
            ArrayList arrayList4 = new ArrayList();
            if (m16300a(1)) {
                arrayList2 = arrayList4;
                arrayList = arrayList3;
                i2 = 2;
                arrayList.add(C8145a.m16227a(j, j2, this.f22461h, 17, arrayList3.size(), this));
                arrayList2.add(strArr2[0]);
            } else {
                arrayList2 = arrayList4;
                arrayList = arrayList3;
                i2 = 2;
            }
            if (m16300a(i2)) {
                if (this.f22460g == null) {
                    j3 = 0;
                } else {
                    j3 = this.f22460g.getId();
                }
                arrayList.add(C8145a.m16227a(j3, j2, this.f22461h, 7, arrayList.size(), this));
                arrayList2.add(strArr2[1]);
            }
            if (m16300a(4)) {
                arrayList.add(C8145a.m16227a(j, j2, this.f22461h, 9, this.f22470r, this));
                i = 2;
                arrayList2.add(strArr2[2]);
            } else {
                i = 2;
            }
            this.f22454a = new C8145a[arrayList.size()];
            this.f22454a = (C8145a[]) arrayList.toArray(this.f22454a);
            this.f22462i = new String[arrayList2.size()];
            this.f22462i = (String[]) arrayList2.toArray(this.f22462i);
        }
        if (this.f22454a != null) {
            int b = m16301b();
            for (C8145a aVar : this.f22454a) {
                aVar.f22230a = this.f22469q;
                aVar.f22231b = this.f22471s;
                aVar.f22235f = b;
            }
        }
        viewPager.setAdapter(new C8226a(getChildFragmentManager(), this.f22454a, this.f22462i));
        viewPager.setOffscreenPageLimit(3);
        viewPager.addOnPageChangeListener(this);
        viewPager.setCurrentItem(m16301b());
        LivePagerSlidingTabStrip livePagerSlidingTabStrip = (LivePagerSlidingTabStrip) inflate.findViewById(R.id.cx5);
        if (this.f22454a == null || this.f22454a.length < i) {
            livePagerSlidingTabStrip.setIndicatorHeight(0);
            livePagerSlidingTabStrip.setTabBackground(R.color.a8w);
        } else {
            livePagerSlidingTabStrip.setIndicatorColorResource(R.color.abh);
            livePagerSlidingTabStrip.setTextColorResource(R.color.ajn);
        }
        livePagerSlidingTabStrip.setViewPager(viewPager);
        m16299a(C8141a.class);
        m16299a(C8615a.class);
        m16299a(C5182ba.class);
        this.f22463k = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("rank_type", this.f22464l);
        Object[] objArr = new Object[3];
        objArr[0] = new C8059j().mo14214b("live_interact").mo14213a("live_detail").mo14215c("popup");
        objArr[c] = new C8060k();
        objArr[i] = Room.class;
        C8049c.m15979a().mo14202a("contribution_ranklist_show", hashMap, objArr);
        return inflate;
    }

    /* renamed from: a */
    public static C8221n m16298a(Activity activity, Room room, boolean z, boolean z2, String str, DataCenter dataCenter) {
        if (room != null) {
            C8221n nVar = new C8221n();
            nVar.f22465m = activity;
            nVar.f22460g = room;
            nVar.f22461h = z;
            nVar.f22466n = str;
            nVar.f22467o = z2;
            nVar.f22469q = dataCenter;
            if (((Boolean) LiveSettingKeys.LIVE_SDK_NOBLE_INTRODUCE_SHOW_ANDROID.mo9431a()).booleanValue()) {
                nVar.f22468p.add("nobility");
            }
            return nVar;
        }
        throw new IllegalArgumentException("room is null");
    }
}
