package com.bytedance.android.livesdk.rank;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.android.live.C2940a;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C4239a;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.livesdk.C4642b;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.event.C5184d;
import com.bytedance.android.livesdk.chatroom.event.C5193m;
import com.bytedance.android.livesdk.chatroom.event.C5197p;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.rank.model.C8214a;
import com.bytedance.android.livesdk.rank.p409b.C8131a.C8132a;
import com.bytedance.android.livesdk.rank.p409b.C8131a.C8133b;
import com.bytedance.android.livesdk.rank.p410c.C8143c;
import com.bytedance.android.livesdk.rank.p412e.C8151e;
import com.bytedance.android.livesdk.rank.view.C8232e;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.rank.b */
public class C8127b extends C2940a implements OnClickListener, C8133b {

    /* renamed from: a */
    public static final String f22192a = "b";

    /* renamed from: A */
    private View f22193A;

    /* renamed from: B */
    private C0997e f22194B = new C0997e() {
        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            if (!C8127b.this.f22197d) {
                C8127b.this.f22197d = true;
                return;
            }
            C8127b.this.f22203j = i;
            C8127b.this.mo14316a();
        }
    };

    /* renamed from: b */
    final int f22195b = 375;

    /* renamed from: c */
    boolean f22196c;

    /* renamed from: d */
    public boolean f22197d = true;

    /* renamed from: e */
    View f22198e;

    /* renamed from: f */
    protected LoadingStatusView f22199f;

    /* renamed from: g */
    public String f22200g = "float";

    /* renamed from: h */
    public int f22201h;

    /* renamed from: i */
    public boolean f22202i;

    /* renamed from: j */
    public int f22203j;

    /* renamed from: k */
    private View f22204k;

    /* renamed from: l */
    private RtlViewPager f22205l;

    /* renamed from: m */
    private boolean f22206m;

    /* renamed from: n */
    private Room f22207n;

    /* renamed from: o */
    private C8214a f22208o;

    /* renamed from: p */
    private DataCenter f22209p;

    /* renamed from: q */
    private boolean f22210q;

    /* renamed from: r */
    private LivePagerSlidingTabStrip f22211r;

    /* renamed from: s */
    private C8132a f22212s;

    /* renamed from: t */
    private List<C8232e> f22213t;

    /* renamed from: u */
    private C8130a f22214u;

    /* renamed from: v */
    private boolean f22215v = true;

    /* renamed from: w */
    private ViewStub f22216w;

    /* renamed from: x */
    private C1689b f22217x;

    /* renamed from: y */
    private boolean f22218y;

    /* renamed from: z */
    private View f22219z;

    /* renamed from: com.bytedance.android.livesdk.rank.b$a */
    class C8130a extends PagerAdapter {

        /* renamed from: a */
        List<C8232e> f22222a;

        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public final int getCount() {
            if (this.f22222a == null) {
                return 0;
            }
            return this.f22222a.size();
        }

        public final CharSequence getPageTitle(int i) {
            return ((C8232e) this.f22222a.get(i)).f22532a;
        }

        C8130a(List<C8232e> list) {
            this.f22222a = list;
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (this.f22222a == null) {
                return super.instantiateItem(viewGroup, i);
            }
            C8232e eVar = (C8232e) this.f22222a.get(i);
            viewGroup.addView(eVar);
            return eVar;
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (obj instanceof View) {
                viewGroup.removeView((View) obj);
            }
        }
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: a */
    public final void mo14321a(Exception exc) {
        if (this.f22210q) {
            this.f22199f.setVisibility(0);
            this.f22199f.mo9845d();
        }
    }

    public Context getContext() {
        return super.getContext();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f22217x.dispose();
        this.f22210q = false;
        if (this.f22212s != null) {
            this.f22212s.mo14328b();
        }
    }

    /* renamed from: a */
    public final void mo14316a() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
        hashMap.put("event_type", "show");
        hashMap.put("event_page", "live_detail");
        hashMap.put("event_module", "popup");
        hashMap.put("request_id", this.f22207n.getRequestId());
        hashMap.put("log_pb", this.f22207n.getLog_pb());
        hashMap.put("room_id", String.valueOf(this.f22207n.getId()));
        String str2 = "type";
        if (this.f22203j == 0) {
            str = "hourly";
        } else {
            str = "regional";
        }
        hashMap.put(str2, str);
        C8049c.m15979a().mo14202a("live_rank_show", hashMap, new C8059j().mo14213a("live_detail").mo14215c("popup").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("show"), Room.class);
    }

    /* renamed from: b */
    private void m16202b() {
        String str;
        if (this.f22208o != null) {
            this.f22213t = new ArrayList();
            if (this.f22201h == 0 || this.f22201h == 1) {
                if (m16201a(1)) {
                    this.f22213t.add(C8232e.m16336a(this.f22208o, this.f22207n, this.f22206m, this.f22208o.f22419g, 1, this.f22209p, getContext(), false));
                }
                String str2 = this.f22208o.f22422j;
                if (m16201a(2) && !TextUtils.isEmpty(str2)) {
                    this.f22213t.add(C8232e.m16336a(null, this.f22207n, this.f22206m, str2, 2, this.f22209p, getContext(), false));
                    this.f22212s.mo14327a(16);
                    this.f22218y = true;
                }
                C8213m.m16289a(this.f22206m);
            } else if (this.f22201h == 2) {
                this.f22213t.add(C8232e.m16336a(this.f22208o, this.f22207n, this.f22206m, this.f22208o.f22419g, 1, this.f22209p, getContext(), true));
            } else if (this.f22201h == 3) {
                this.f22213t.add(C8232e.m16336a(this.f22208o, this.f22207n, this.f22206m, this.f22208o.f22419g, 2, this.f22209p, getContext(), true));
            }
            this.f22205l.setVisibility(0);
            this.f22199f.setVisibility(8);
            this.f22214u = new C8130a(this.f22213t);
            this.f22205l.setAdapter(this.f22214u);
            this.f22205l.addOnPageChangeListener(this.f22194B);
            if (this.f22213t.size() < 2) {
                this.f22211r.setIndicatorHeight(0);
            } else {
                LivePagerSlidingTabStrip livePagerSlidingTabStrip = this.f22211r;
                livePagerSlidingTabStrip.f23039g = R.layout.anr;
                livePagerSlidingTabStrip.f23040h = R.id.cx6;
            }
            this.f22211r.setViewPager(this.f22205l);
            if (this.f22201h == 2 || this.f22201h == 3) {
                this.f22219z.setVisibility(0);
            }
            if (!this.f22218y || this.f22201h != 1) {
                HashMap hashMap = new HashMap();
                hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
                hashMap.put("event_type", "show");
                hashMap.put("event_page", "live_detail");
                hashMap.put("event_module", "popup");
                hashMap.put("request_id", this.f22207n.getRequestId());
                hashMap.put("log_pb", this.f22207n.getLog_pb());
                hashMap.put("room_id", String.valueOf(this.f22207n.getId()));
                String str3 = "type";
                switch (this.f22201h) {
                    case 0:
                        str = "hourly";
                        break;
                    case 1:
                        str = "regional";
                        break;
                    case 2:
                        str = "last_hourly";
                        break;
                    case 3:
                        str = "last_regional";
                        break;
                    default:
                        str = "";
                        break;
                }
                hashMap.put(str3, str);
                hashMap.put("click_position", String.valueOf(this.f22200g));
                C8049c.m15979a().mo14202a("live_rank_show", hashMap, new C8059j().mo14213a("live_detail").mo14215c("popup").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("show"), Room.class);
                return;
            }
            this.f22205l.setCurrentItem(1);
            return;
        }
        throw new IllegalArgumentException("not found DailyRankResult data");
    }

    /* renamed from: a */
    private void m16199a(C8132a aVar) {
        this.f22212s = aVar;
    }

    /* renamed from: a */
    public final void mo14322a(boolean z) {
        this.f22202i = z;
        if (!z) {
            mo14316a();
        }
    }

    /* renamed from: a */
    private boolean m16201a(int i) {
        if ((C8213m.m16289a(this.f22206m) & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private <T> void m16200a(Class<T> cls) {
        this.f22217x.mo6181a(C4495a.m10823a().mo10300a(cls).mo6545f((C1710e<? super T>) new C1710e<T>() {
            public final void accept(T t) throws Exception {
                if (!C8127b.this.f22202i) {
                    if (t instanceof C5184d) {
                        C8127b.this.onEvent((C5184d) t);
                        return;
                    }
                    if (t instanceof C5193m) {
                        C8127b.this.onEvent((C5193m) t);
                    }
                }
            }
        }));
    }

    public void onEvent(C5193m mVar) {
        if (mVar != null) {
            if (mVar.f13905a) {
                this.f22198e.setVisibility(0);
            } else {
                this.f22198e.setVisibility(8);
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C4642b.m11130a().mo10429c();
        this.f22197d = false;
        this.f22205l.setCurrentItem(0);
        if (this.f22201h == 2 || this.f22201h == 3) {
            C8143c cVar = new C8143c();
            cVar.f22228b = false;
            C4495a.m10823a().mo10301a((Object) cVar);
        }
        super.onDismiss(dialogInterface);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14317a(View view) {
        this.f22199f.setVisibility(0);
        this.f22199f.mo9843b();
        this.f22212s.mo14326a();
    }

    public void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (this.f22215v) {
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

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f22201h == 2 || this.f22201h == 3 || !this.f22215v) {
            i = R.style.xz;
        } else {
            i = R.style.xy;
        }
        setStyle(1, i);
        C8068g.m16014a(getContext());
        C8068g.m16014a(getContext());
        if (this.f22217x != null) {
            this.f22217x.mo6180a();
            this.f22217x.dispose();
        }
        this.f22217x = new C1689b();
        this.f22217x.mo6180a();
        m16200a(C5184d.class);
        m16200a(C5193m.class);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ir) {
            dismissAllowingStateLoss();
        } else if (id == R.id.cfs && this.f22208o != null && getContext() != null) {
            String str = this.f22208o.f22427o;
            if (str != null && !str.isEmpty()) {
                if (this.f22215v) {
                    C4514j.m10883j().mo10322c().mo10490a(getContext(), C4704c.m11227b(str).mo10506a(true).mo10508b(true));
                    return;
                }
                int b = C4577ap.m10994b(getContext(), (float) C4577ap.m10991a(getContext()));
                C4104a.m10232a(getActivity(), C4514j.m10883j().mo10322c().mo10487a(C4704c.m11226a(str).mo10510a(b + 16).mo10514b(b).mo10511a(8, 8, 8, 8).mo10515b(true).mo10516c(8).mo10520e(8388613).mo10517c(false)));
            }
        }
    }

    public void onEvent(C5184d dVar) {
        int i;
        int i2;
        if (this.f22210q && !this.f22196c) {
            long j = dVar.f13884b;
            this.f22196c = true;
            long j2 = 0;
            if (this.f22206m) {
                if (j <= 0 || j == this.f22207n.getId()) {
                    C4495a a = C4495a.m10823a();
                    if (dVar.f13883a != null) {
                        j2 = dVar.f13883a.getId();
                    }
                    a.mo10301a((Object) new UserProfileEvent(j2));
                } else {
                    C4575an.m10983a(getContext(), (int) R.string.ev3);
                }
            } else if (j > 0 && j != this.f22207n.getId()) {
                boolean a2 = C8123a.m16195a();
                if (!a2 || ((Boolean) C4525b.f12355aX.mo10345a()).booleanValue()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("toast_type", "hourly_rank");
                    Context context = getContext();
                    if (a2) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    C8552a b = new C8552a(context, i).mo14996a(false).mo15009c((CharSequence) getContext().getString(R.string.e_j, new Object[]{dVar.f13883a.getNickName()}));
                    if (a2) {
                        i2 = R.string.hor;
                    } else {
                        i2 = R.string.e42;
                    }
                    b.mo15003b(0, i2, (DialogInterface.OnClickListener) new C8146e(this, dVar, hashMap, a2)).mo15003b(1, (int) R.string.e41, (DialogInterface.OnClickListener) new C8166f(hashMap)).mo15005b((OnDismissListener) new C8206g(this)).mo15011d();
                    C8049c.m15979a().mo14202a("livesdk_toast_show", hashMap, Room.class);
                } else {
                    mo14318a(dVar);
                    return;
                }
            } else if (dVar.f13883a != null) {
                C4495a.m10823a().mo10301a((Object) new UserProfileEvent(dVar.f13883a.getId()));
            }
            this.f22196c = false;
        }
    }

    /* renamed from: a */
    public final void mo14318a(C5184d dVar) {
        if (dVar != null) {
            dismiss();
            Bundle bundle = new Bundle();
            bundle.putString("source", dVar.f13887e);
            bundle.putString("enter_from", "live_detail");
            bundle.putString("source", dVar.f13887e);
            if (dVar.f13883a != null) {
                bundle.putLong("anchor_id", dVar.f13883a.getId());
            }
            C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
            if (!(a == null || a.mo14192a() == null)) {
                bundle.putString("enter_from_merge", "live_detail");
                bundle.putString("enter_method", dVar.f13887e);
            }
            bundle.putString("starlight_rank", String.valueOf(dVar.f13886d));
            Bundle bundle2 = new Bundle();
            bundle2.putString("live.intent.extra.ENTER_LIVE_SOURCE_V1", dVar.f13887e);
            bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA_V1", bundle2);
            if (dVar.f13883a != null) {
                bundle.putLong("anchor_id", dVar.f13883a.getId());
            }
            bundle.putInt("back_source", 3);
            bundle.putLongArray("live.intent.extra.ENTER_ROOM_IDS", dVar.f13885c);
            C8123a.m16197b(this.f22209p, bundle);
            C4495a.m10823a().mo10301a((Object) new C5197p(dVar.f13884b, "live_detail", bundle));
        }
    }

    /* renamed from: a */
    public final void mo14319a(C8214a aVar) {
        this.f22208o = aVar;
        if (this.f22210q) {
            m16202b();
        }
    }

    public void show(C0654k kVar, String str) {
        C4642b.m11130a().mo10428b();
        this.f22197d = true;
        try {
            Field declaredField = kVar.getClass().getDeclaredField("mAdded");
            declaredField.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField.get(kVar);
            if (arrayList != null && arrayList.contains(this)) {
                return;
            }
        } catch (Exception | IllegalAccessException | NoSuchFieldException unused) {
        }
        super.show(kVar, str);
    }

    /* renamed from: a */
    public final void mo14320a(C8214a aVar, int i) {
        int i2;
        if (aVar != null && this.f22213t != null) {
            if (this.f22201h == 2 || this.f22201h == 3) {
                this.f22208o = aVar;
                if (this.f22210q) {
                    m16202b();
                    return;
                }
                return;
            }
            if (this.f22213t != null) {
                List<C8232e> list = this.f22213t;
                if (i == 16) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                ((C8232e) list.get(i2)).mo14332a(aVar);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f22212s != null) {
            if (this.f22201h == 0 || this.f22201h == 1) {
                this.f22212s.mo14326a();
            } else if (this.f22201h == 2) {
                this.f22212s.mo14327a(13);
            } else if (this.f22201h == 3) {
                this.f22212s.mo14327a(20);
            }
        }
        this.f22204k = layoutInflater.inflate(R.layout.aht, viewGroup, false);
        this.f22210q = true;
        C8212l.f22408d = SystemClock.uptimeMillis();
        this.f22205l = (RtlViewPager) this.f22204k.findViewById(R.id.drk);
        this.f22211r = (LivePagerSlidingTabStrip) this.f22204k.findViewById(R.id.bvz);
        this.f22216w = (ViewStub) this.f22204k.findViewById(R.id.a0f);
        this.f22198e = this.f22216w.inflate();
        this.f22198e.setOnClickListener(new C8140c(this));
        this.f22199f = (LoadingStatusView) this.f22204k.findViewById(R.id.a3_);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.bx5, null);
        inflate.setOnClickListener(new C8144d(this));
        this.f22199f.setBuilder(C4239a.m10480a(getContext()).mo9852c(inflate).mo9847a(getResources().getDimensionPixelSize(R.dimen.o4)));
        this.f22199f.setVisibility(0);
        this.f22199f.mo9843b();
        this.f22219z = this.f22204k.findViewById(R.id.ir);
        this.f22193A = this.f22204k.findViewById(R.id.cfs);
        this.f22219z.setOnClickListener(this);
        this.f22193A.setOnClickListener(this);
        getContext();
        return this.f22204k;
    }

    /* renamed from: a */
    public static C8127b m16198a(Room room, boolean z, boolean z2, DataCenter dataCenter, int i) {
        C8127b bVar = new C8127b();
        bVar.f22207n = room;
        bVar.f22206m = z;
        bVar.f22215v = z2;
        bVar.f22209p = dataCenter;
        bVar.f22201h = i;
        C8151e eVar = new C8151e(bVar, room.getId(), room.getOwner().getId());
        bVar.m16199a((C8132a) eVar);
        return bVar;
    }
}
