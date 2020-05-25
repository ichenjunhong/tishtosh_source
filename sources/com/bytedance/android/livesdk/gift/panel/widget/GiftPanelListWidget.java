package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0198r;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.widget.Toast;
import com.bytedance.android.live.gift.C4128f;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.event.C5163ai;
import com.bytedance.android.livesdk.chatroom.p307c.C5035a;
import com.bytedance.android.livesdk.chatroom.p325ui.RtlViewPagerShower;
import com.bytedance.android.livesdk.chatroom.p325ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C7649u;
import com.bytedance.android.livesdk.gift.C7649u.C7650a;
import com.bytedance.android.livesdk.gift.C7654y;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.combo.DouyinGiftCombHelper;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p379a.C7490a;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.model.p379a.C7492c;
import com.bytedance.android.livesdk.gift.model.p379a.C7494e;
import com.bytedance.android.livesdk.gift.model.p379a.C7495f;
import com.bytedance.android.livesdk.gift.model.p379a.C7496g;
import com.bytedance.android.livesdk.gift.model.p379a.C7497h;
import com.bytedance.android.livesdk.gift.model.p379a.C7498i;
import com.bytedance.android.livesdk.gift.model.p379a.C7499j;
import com.bytedance.android.livesdk.gift.model.p379a.C7500k;
import com.bytedance.android.livesdk.gift.p357e.C7305a;
import com.bytedance.android.livesdk.gift.p357e.C7305a.C7307a;
import com.bytedance.android.livesdk.gift.panel.p380a.C7526c;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7564c;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7565d;
import com.bytedance.android.livesdk.message.model.C7870ck;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.schema.interfaces.C8260a;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.C8692a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p458l.p459a.C8839e;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.Widget;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p064c.p065a.p069b.C1690c;

public class GiftPanelListWidget extends Widget implements C7307a, C7650a, C9382a {

    /* renamed from: A */
    private List<C7495f> f20843A = new ArrayList();

    /* renamed from: B */
    private List<C7495f> f20844B = new ArrayList();

    /* renamed from: C */
    private List<C7497h> f20845C = new ArrayList();

    /* renamed from: D */
    private List<C7495f> f20846D = new ArrayList();

    /* renamed from: E */
    private boolean f20847E;

    /* renamed from: F */
    private C4128f f20848F = new C4128f() {
        /* renamed from: a */
        public final void mo8456a(List<C7505d> list) {
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                if (GiftPanelListWidget.this.f20852a.f20770c == C7565d.GUEST) {
                    GiftManager.filterInteractNotSupportGift(arrayList, GiftPanelListWidget.this.f20858g);
                } else {
                    GiftManager.filterNotSupportGift(arrayList, GiftPanelListWidget.this.f20858g);
                }
                GiftManager.filterNotDisplayedOnPanel(arrayList);
                GiftPanelListWidget.this.mo13970e(arrayList);
            }
        }
    };

    /* renamed from: G */
    private SparseArray<C7492c> f20849G = new SparseArray<>();

    /* renamed from: H */
    private C7505d f20850H;

    /* renamed from: I */
    private C1690c f20851I;

    /* renamed from: a */
    public GiftDialogViewModel f20852a;

    /* renamed from: b */
    RecyclerView f20853b;

    /* renamed from: c */
    C7305a f20854c;

    /* renamed from: d */
    DouyinGiftCombHelper f20855d;

    /* renamed from: e */
    Handler f20856e = new C9381g(this);

    /* renamed from: f */
    boolean f20857f;

    /* renamed from: g */
    public boolean f20858g;

    /* renamed from: h */
    C7595ao f20859h = C7595ao.GIFT;

    /* renamed from: i */
    int f20860i;

    /* renamed from: j */
    public int f20861j;

    /* renamed from: k */
    int f20862k = ((Integer) C6718b.f18310G.mo9431a()).intValue();

    /* renamed from: l */
    C7491b f20863l;

    /* renamed from: m */
    List<C7491b> f20864m = new ArrayList();

    /* renamed from: n */
    String f20865n;

    /* renamed from: o */
    final List<GiftPage> f20866o = new ArrayList();

    /* renamed from: p */
    final Map<GiftPage, List<C7491b>> f20867p = new HashMap();

    /* renamed from: q */
    int f20868q = 1;

    /* renamed from: r */
    int f20869r = -1;

    /* renamed from: s */
    private LoadingStatusView f20870s;

    /* renamed from: t */
    private RtlViewPagerShower f20871t;

    /* renamed from: u */
    private Room f20872u;

    /* renamed from: v */
    private boolean f20873v;

    /* renamed from: w */
    private int f20874w;

    /* renamed from: x */
    private View f20875x;

    /* renamed from: y */
    private boolean f20876y;

    /* renamed from: z */
    private List<C7495f> f20877z = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$a */
    enum C7577a {
        DATA_TYPE_GIFT,
        DATA_TYPE_PROP,
        DATA_TYPE_BANNER
    }

    /* renamed from: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$b */
    class C7578b extends SSGridLayoutManager {

        /* renamed from: K */
        public boolean f20888K = true;

        /* renamed from: e */
        public final boolean mo4742e() {
            if (!super.mo4742e() || !this.f20888K) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo4745f() {
            if (!super.mo4745f() || !this.f20888K) {
                return false;
            }
            return true;
        }

        public C7578b(Context context, int i, int i2, boolean z) {
            super(context, 2, 0, false);
        }
    }

    public int getLayoutId() {
        return R.layout.ai4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13964a(C7595ao aoVar) {
        this.f20854c.mo13552a();
        switch (aoVar) {
            case GIFT:
                mo13971f(m15586c());
                return;
            case FANS_CLUB_GIFT:
                mo13971f(m15587d());
                return;
            case PROP:
                mo13971f(mo13965b());
                return;
            case HONOR_LEVEL_GIFT:
                mo13971f(m15588e());
                return;
            case NOBLE_GIFT:
                mo13971f(m15589f());
                return;
            default:
                mo13971f(m15586c());
                return;
        }
    }

    /* renamed from: a */
    public final void mo13539a(List<Prop> list) {
        int i = 0;
        if (list != null && !list.isEmpty()) {
            Prop prop = (Prop) list.get(0);
            if (!(prop == null || prop.banner == null)) {
                this.f20865n = prop.banner.f23799f;
            }
            if (list != null && !list.isEmpty()) {
                this.f20845C.clear();
                for (Prop hVar : list) {
                    this.f20845C.add(new C7497h(hVar));
                }
                if (this.f20869r == 0 || this.f20869r == -1) {
                    mo13963a(C7577a.DATA_TYPE_PROP);
                } else if (this.f20869r == 1) {
                    mo13962a(1);
                }
            }
        }
        View view = this.f20875x;
        if (this.f20876y) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: d */
    private List<C7491b> m15587d() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f20843A);
        return arrayList;
    }

    /* renamed from: e */
    private List<C7491b> m15588e() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f20844B);
        return arrayList;
    }

    /* renamed from: f */
    private List<C7491b> m15589f() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f20846D);
        return arrayList;
    }

    /* renamed from: a */
    public final void mo13538a() {
        int i;
        View view = this.f20875x;
        if (this.f20876y) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f20852a != null) {
            this.f20852a.mo13948a(this);
        }
        C7649u.m15656a().mo14014b((C7650a) this);
        this.f20847E = false;
        C7654y a = C7654y.m15668a();
        if (a.f21085b.contains(this)) {
            a.f21085b.remove(this);
        }
        if (this.f20851I != null && !this.f20851I.isDisposed()) {
            this.f20851I.dispose();
        }
    }

    /* renamed from: c */
    private List<C7491b> m15586c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f20877z);
        for (int i = 0; i < this.f20849G.size(); i++) {
            if (!arrayList.contains(this.f20849G.valueAt(i))) {
                if (this.f20849G.keyAt(i) < 0) {
                    arrayList.add(0, this.f20849G.valueAt(i));
                } else {
                    arrayList.add(Math.min(arrayList.size(), this.f20849G.keyAt(i)), this.f20849G.valueAt(i));
                }
            }
        }
        LongSparseArray<Integer> longSparseArray = new LongSparseArray<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7491b bVar = (C7491b) arrayList.get(i2);
            if (bVar.f20513a == 1) {
                longSparseArray.append(bVar.mo13919p(), Integer.valueOf(i2 + 1));
            }
        }
        this.f20852a.f20764K = longSparseArray;
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public List<C7491b> mo13965b() {
        ArrayList arrayList = new ArrayList();
        if (this.f20850H != null) {
            arrayList.add(new C7499j(this.f20850H));
        }
        arrayList.addAll(this.f20845C);
        if (this.f20863l != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7491b bVar = (C7491b) it.next();
                if (bVar.f20513a == this.f20863l.f20513a && bVar.mo13919p() == this.f20863l.mo13919p()) {
                    bVar.f20514b = true;
                    this.f20863l = bVar;
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [android.support.v7.widget.RecyclerView$i] */
    /* JADX WARNING: type inference failed for: r0v88, types: [com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r9 = this;
            super.onCreate()
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r9.dataCenter
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r9.dataCenter
            java.lang.String r1 = "data_gift_dialog_view_model"
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = (com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel) r0
            r9.f20852a = r0
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r9.f20852a
            if (r0 != 0) goto L_0x0019
            return
        L_0x0019:
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r9.f20852a
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.f20772e
            r9.f20872u = r0
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r9.f20852a
            boolean r0 = r0.f20769b
            r9.f20857f = r0
            boolean r0 = r9.f20857f
            r9.f20873v = r0
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r9.f20852a
            boolean r0 = r0.f20768a
            r9.f20858g = r0
            com.bytedance.android.livesdk.gift.u r0 = com.bytedance.android.livesdk.gift.C7649u.m15656a()
            r0.mo14011a(r9)
            com.bytedance.android.livesdk.gift.y r0 = com.bytedance.android.livesdk.gift.C7654y.m15668a()
            java.util.List<java.lang.Object> r1 = r0.f21085b
            boolean r1 = r1.contains(r9)
            if (r1 != 0) goto L_0x0047
            java.util.List<java.lang.Object> r0 = r0.f21085b
            r0.add(r9)
        L_0x0047:
            android.view.View r0 = r9.contentView
            r1 = 2132023007(0x7f1416df, float:1.968445E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.android.live.uikit.recyclerview.LoadingStatusView r0 = (com.bytedance.android.live.uikit.recyclerview.LoadingStatusView) r0
            r9.f20870s = r0
            android.view.View r0 = r9.contentView
            r1 = 2132020627(0x7f140d93, float:1.9679622E38)
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.RecyclerView r0 = (android.support.p043v7.widget.RecyclerView) r0
            r9.f20853b = r0
            boolean r0 = r9.f20857f
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0071
            com.bytedance.android.livesdk.gift.e.b r0 = new com.bytedance.android.livesdk.gift.e.b
            android.content.Context r3 = r9.context
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r9.f20872u
            r0.<init>(r3, r4, r9, r1)
            goto L_0x007a
        L_0x0071:
            com.bytedance.android.livesdk.gift.e.e r0 = new com.bytedance.android.livesdk.gift.e.e
            android.content.Context r3 = r9.context
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r9.f20872u
            r0.<init>(r3, r4, r9, r2)
        L_0x007a:
            r9.f20854c = r0
            com.bytedance.android.livesdk.gift.e.a r0 = r9.f20854c
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r3 = r9.f20852a
            boolean r3 = r3.f20775h
            r0.f19897d = r3
            com.bytedance.android.livesdk.gift.e.a r0 = r9.f20854c
            com.bytedance.android.livesdk.gift.panel.widget.ac r3 = new com.bytedance.android.livesdk.gift.panel.widget.ac
            r3.<init>(r9)
            com.bytedance.android.livesdk.gift.e.a$c r0 = r0.f19896c
            r0.f19906a = r3
            com.bytedance.android.livesdk.gift.e.a r0 = r9.f20854c
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r3 = r9.f20852a
            r0.f19898e = r3
            android.support.v7.widget.RecyclerView r0 = r9.f20853b
            com.bytedance.android.livesdk.gift.e.a r3 = r9.f20854c
            r0.setAdapter(r3)
            boolean r0 = r9.f20857f
            if (r0 == 0) goto L_0x00ad
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$b r0 = new com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$b
            android.content.Context r5 = r9.context
            r6 = 2
            r7 = 0
            r8 = 0
            r3 = r0
            r4 = r9
            r3.<init>(r5, r6, r7, r8)
            goto L_0x00b4
        L_0x00ad:
            com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager r0 = new com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager
            android.content.Context r3 = r9.context
            r0.<init>(r3, r2, r2)
        L_0x00b4:
            android.support.v7.widget.RecyclerView r3 = r9.f20853b
            r3.setLayoutManager(r0)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r3 = r9.f20852a
            boolean r3 = r3.f20775h
            if (r3 == 0) goto L_0x00c7
            boolean r3 = r9.f20857f
            if (r3 == 0) goto L_0x00c7
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$b r0 = (com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget.C7578b) r0
            r0.f20888K = r2
        L_0x00c7:
            android.support.v7.widget.RecyclerView r0 = r9.f20853b
            r0.setHasFixedSize(r1)
            android.support.v7.widget.RecyclerView r0 = r9.f20853b
            r3 = 16
            r0.setItemViewCacheSize(r3)
            android.view.View r0 = r9.contentView
            r3 = 2132021290(0x7f14102a, float:1.9680967E38)
            android.view.View r0 = r0.findViewById(r3)
            r9.f20875x = r0
            boolean r0 = r9.f20857f
            if (r0 == 0) goto L_0x00ff
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$2 r0 = new com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$2
            r0.<init>()
            r3 = 2
            com.bytedance.android.livesdk.widget.c.a r3 = r0.mo14964a(r3)
            r4 = 4
            r3.mo14967b(r4)
            android.support.v7.widget.RecyclerView r3 = r9.f20853b
            r0.mo14975a(r3)
            android.support.v7.widget.RecyclerView r0 = r9.f20853b
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$3 r3 = new com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$3
            r3.<init>()
            r0.mo4801a(r3)
        L_0x00ff:
            boolean r0 = r9.f20873v
            if (r0 == 0) goto L_0x0139
            android.view.View r0 = r9.contentView
            r3 = 2132021485(0x7f1410ed, float:1.9681363E38)
            android.view.View r0 = r0.findViewById(r3)
            com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower r0 = (com.bytedance.android.livesdk.chatroom.p325ui.RtlViewPagerShower) r0
            r9.f20871t = r0
            com.bytedance.android.livesdk.gift.g.c r0 = com.bytedance.android.livesdk.gift.p377g.C7454d.m15401a()
            int r0 = r0.mo13867h()
            com.bytedance.android.livesdk.gift.g.c r3 = com.bytedance.android.livesdk.gift.p377g.C7454d.m15401a()
            int r3 = r3.mo13868i()
            com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower r4 = r9.f20871t
            android.content.Context r5 = r9.context
            android.content.res.Resources r5 = r5.getResources()
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            android.content.Context r5 = r9.context
            android.content.res.Resources r5 = r5.getResources()
            android.graphics.drawable.Drawable r3 = r5.getDrawable(r3)
            r4.mo11848a(r0, r3)
        L_0x0139:
            com.bytedance.android.live.uikit.recyclerview.LoadingStatusView r0 = r9.f20870s
            android.content.Context r3 = r9.context
            com.bytedance.android.live.uikit.recyclerview.LoadingStatusView$a r3 = com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C4239a.m10480a(r3)
            android.content.Context r4 = r9.context
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131886744(0x7f120298, float:1.9408075E38)
            int r4 = r4.getDimensionPixelSize(r5)
            com.bytedance.android.live.uikit.recyclerview.LoadingStatusView$a r3 = r3.mo9847a(r4)
            r0.setBuilder(r3)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r9.f20872u
            boolean r3 = r9.f20858g
            boolean r0 = com.bytedance.android.livesdk.gift.C7624q.m15620b(r0, r3)
            if (r0 == 0) goto L_0x017e
            java.lang.Class<com.bytedance.android.live.user.a> r0 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            com.bytedance.android.live.user.a r0 = (com.bytedance.android.live.user.C4282a) r0
            com.bytedance.android.livesdk.user.e r0 = r0.user()
            boolean r0 = r0.mo14532c()
            if (r0 == 0) goto L_0x017e
            com.bytedance.android.livesdk.gift.u r0 = com.bytedance.android.livesdk.gift.C7649u.m15656a()
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r9.f20872u
            long r3 = r3.getId()
            r0.mo14013b(r3)
        L_0x017e:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r9.f20872u
            boolean r3 = r9.f20858g
            int r0 = com.bytedance.android.livesdk.gift.C7624q.m15618a(r0, r3)
            if (r0 == 0) goto L_0x018b
            r3 = 3
            if (r0 != r3) goto L_0x018c
        L_0x018b:
            r2 = 1
        L_0x018c:
            if (r2 == 0) goto L_0x01c1
            com.bytedance.android.livesdk.gift.GiftManager r0 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            boolean r0 = r0.isGiftListLoaded()
            if (r0 == 0) goto L_0x01c1
            com.bytedance.android.livesdk.gift.GiftManager r0 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            int r0 = r0.getCurrentStrategyByLiveType()
            r9.f20869r = r0
            int r0 = r9.f20869r
            if (r0 != 0) goto L_0x01b2
            com.bytedance.android.livesdk.gift.GiftManager r0 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            java.util.List r0 = r0.getGiftList()
            r9.mo13967b(r0)
            goto L_0x01c1
        L_0x01b2:
            int r0 = r9.f20869r
            if (r0 != r1) goto L_0x01c1
            com.bytedance.android.livesdk.gift.GiftManager r0 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            java.util.List r0 = r0.getGiftPageList()
            r9.mo13968c(r0)
        L_0x01c1:
            com.bytedance.android.live.core.setting.p<com.bytedance.android.livesdk.gift.panel.a.a> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_GIFT_PANEL_BANNER_LIST
            java.lang.Object r0 = r0.mo9431a()
            if (r0 == 0) goto L_0x0203
            com.bytedance.android.live.core.setting.p<com.bytedance.android.livesdk.gift.panel.a.a> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_GIFT_PANEL_BANNER_LIST
            java.lang.Object r0 = r0.mo9431a()
            com.bytedance.android.livesdk.gift.panel.a.a r0 = (com.bytedance.android.livesdk.gift.panel.p380a.C7524a) r0
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.a> r0 = r0.f20669a
            if (r0 == 0) goto L_0x0203
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x01dc
            goto L_0x0203
        L_0x01dc:
            android.util.SparseArray<com.bytedance.android.livesdk.gift.model.a.c> r1 = r9.f20849G
            r1.clear()
            java.util.Iterator r0 = r0.iterator()
        L_0x01e5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01fe
            java.lang.Object r1 = r0.next()
            com.bytedance.android.livesdkapi.depend.model.live.a r1 = (com.bytedance.android.livesdkapi.depend.model.live.C8692a) r1
            android.util.SparseArray<com.bytedance.android.livesdk.gift.model.a.c> r2 = r9.f20849G
            int r3 = r1.f23802i
            com.bytedance.android.livesdk.gift.model.a.c r4 = new com.bytedance.android.livesdk.gift.model.a.c
            r4.<init>(r1)
            r2.put(r3, r4)
            goto L_0x01e5
        L_0x01fe:
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$a r0 = com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget.C7577a.DATA_TYPE_BANNER
            r9.mo13963a(r0)
        L_0x0203:
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r9.f20852a
            android.arch.lifecycle.r<java.lang.Boolean> r0 = r0.f20781n
            com.bytedance.android.livesdk.gift.panel.widget.v r1 = new com.bytedance.android.livesdk.gift.panel.widget.v
            r1.<init>(r9)
            r0.observe(r9, r1)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r9.f20852a
            android.arch.lifecycle.r<com.bytedance.android.livesdk.gift.panel.widget.ao> r0 = r0.f20776i
            com.bytedance.android.livesdk.gift.panel.widget.w r1 = new com.bytedance.android.livesdk.gift.panel.widget.w
            r1.<init>(r9)
            r0.observe(r9, r1)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r9.f20852a
            android.arch.lifecycle.r<java.lang.Integer> r0 = r0.f20759F
            com.bytedance.android.livesdk.gift.panel.widget.x r1 = new com.bytedance.android.livesdk.gift.panel.widget.x
            r1.<init>(r9)
            r0.observe(r9, r1)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r9.f20852a
            android.arch.lifecycle.r<com.bytedance.android.livesdk.gift.panel.a.b> r0 = r0.f20786s
            com.bytedance.android.livesdk.gift.panel.widget.y r1 = new com.bytedance.android.livesdk.gift.panel.widget.y
            r1.<init>(r9)
            r0.observe(r9, r1)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r9.f20852a
            android.arch.lifecycle.r<com.bytedance.android.livesdk.gift.panel.widget.ao> r0 = r0.f20788u
            com.bytedance.android.livesdk.gift.panel.widget.z r1 = new com.bytedance.android.livesdk.gift.panel.widget.z
            r1.<init>(r9)
            r0.observe(r9, r1)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r9.f20852a
            android.arch.lifecycle.r<java.lang.String> r0 = r0.f20757D
            com.bytedance.android.livesdk.gift.panel.widget.aa r1 = new com.bytedance.android.livesdk.gift.panel.widget.aa
            r1.<init>(r9)
            r0.observe(r9, r1)
            com.bytedance.android.livesdk.aa.a r0 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            java.lang.Class<com.bytedance.android.livesdk.widget.SendGiftAnimationView$a> r1 = com.bytedance.android.livesdk.widget.SendGiftAnimationView.C8480a.class
            c.a.v r0 = r0.mo10300a(r1)
            com.bytedance.android.livesdk.gift.panel.widget.ab r1 = new com.bytedance.android.livesdk.gift.panel.widget.ab
            r1.<init>(r9)
            c.a.b.c r0 = r0.mo6545f(r1)
            r9.f20851I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget.onCreate():void");
    }

    public void handleMsg(Message message) {
        if (message.what == 1100) {
            this.f20852a.mo13949b();
            this.f20852a.mo13950c();
        }
    }

    /* renamed from: a */
    private void m15584a(String str) {
        ((C8260a) C4116c.m10249a(C8260a.class)).handle(this.context, Uri.parse(new C8839e(str).mo15824a()));
    }

    /* renamed from: b */
    private static C7564c m15585b(C7490a aVar) {
        switch (aVar.f20513a) {
            case 1:
                return C7564c.GIFT;
            case 2:
                return C7564c.PROP;
            case 4:
                return C7564c.TASK_GIFT;
            case 6:
                return C7564c.GIFT_AD;
            case 7:
                if (!(aVar.f20516d instanceof C7505d)) {
                    return C7564c.NORMAL;
                }
                if (((C7505d) aVar.f20516d).f20544e == 5) {
                    return C7564c.TASK_GIFT;
                }
                return C7564c.GIFT;
            default:
                return C7564c.NORMAL;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo13969d(List<C7491b> list) {
        LongSparseArray<Integer> longSparseArray = new LongSparseArray<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C7491b bVar = (C7491b) list.get(i);
            if (bVar.f20516d instanceof C7505d) {
                longSparseArray.append(bVar.mo13919p(), Integer.valueOf(i + 1));
            }
        }
        this.f20852a.f20764K = longSparseArray;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1352v mo13961a(C7491b bVar) {
        if (this.f20853b == null || this.f20854c == null || bVar == null) {
            return null;
        }
        C7491b a = this.f20854c.mo13551a(bVar.mo13919p());
        if (a == null) {
            return null;
        }
        return this.f20853b.mo4847f(this.f20854c.mo13549a(a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo13971f(List<C7491b> list) {
        int i;
        int i2;
        int i3;
        if (list != null && this.f20854c != null) {
            this.f20864m = list;
            this.f20876y = !list.isEmpty();
            RecyclerView recyclerView = this.f20853b;
            if (this.f20876y) {
                i = 0;
            } else {
                i = 4;
            }
            recyclerView.setVisibility(i);
            if (this.f20873v) {
                RtlViewPagerShower rtlViewPagerShower = this.f20871t;
                if (this.f20876y) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                rtlViewPagerShower.setVisibility(i3);
            }
            this.f20854c.mo13553a(list);
            if (this.f20876y) {
                i2 = ((list.size() - 1) / 8) + 1;
            } else {
                i2 = 0;
            }
            this.f20874w = i2;
            if (!this.f20857f) {
                this.f20874w = 0;
            }
            this.f20852a.f20789v.postValue(Integer.valueOf(this.f20874w));
            if (this.f20873v) {
                this.f20871t.mo11847a(this.f20874w, this.f20860i);
            }
            if (this.f20863l != null) {
                this.f20863l = this.f20854c.mo13551a(this.f20863l.mo13919p());
            }
        }
    }

    /* renamed from: a */
    private void m15582a(C7490a aVar) {
        C7490a aVar2;
        C0198r<C7490a> rVar = this.f20852a.f20785r;
        if (aVar.f20514b) {
            aVar2 = aVar;
        } else {
            aVar2 = null;
        }
        rVar.postValue(aVar2);
        int i = 0;
        this.f20852a.f20780m.postValue(Boolean.valueOf(false));
        C0198r<Integer> rVar2 = this.f20852a.f20754A;
        if (aVar.f20514b) {
            i = aVar.mo13904a();
        }
        rVar2.postValue(Integer.valueOf(i));
        if (!aVar.f20514b || !aVar.mo13909f()) {
            if (aVar.f20514b && aVar.mo13911h()) {
                m15584a(aVar.mo13912i());
                Set set = (Set) C4525b.f12308D.mo10345a();
                set.add(String.valueOf(aVar.mo13919p()));
                C4525b.f12308D.mo10346a(set);
            }
            return;
        }
        new C8552a(this.context, 1).mo15009c((CharSequence) aVar.mo13910g()).mo15003b(2, (int) R.string.exh, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo15011d();
        Set set2 = (Set) C4525b.f12307C.mo10345a();
        set2.add(Long.valueOf(aVar.mo13919p()));
        C4525b.f12307C.mo10346a(set2);
    }

    /* renamed from: g */
    private void m15590g(List<GiftPage> list) {
        if (list != null && !list.isEmpty()) {
            this.f20867p.clear();
            for (GiftPage giftPage : list) {
                if (giftPage.pageType != 5) {
                    ArrayList arrayList = new ArrayList();
                    for (C7505d dVar : giftPage.gifts) {
                        if (dVar.f20533B == 2) {
                            C8692a aVar = new C8692a();
                            aVar.f23799f = dVar.f20534C;
                            aVar.f23796c = dVar.f20541b;
                            aVar.f23800g = dVar.f20540a;
                            arrayList.add(new C7492c(aVar));
                        } else if (dVar.f20544e == 5) {
                            this.f20850H = dVar;
                        } else if (dVar.f20544e == 3) {
                            arrayList.add(new C7498i(dVar));
                        } else if (dVar.f20544e == 9) {
                            arrayList.add(new C7496g(dVar));
                        } else {
                            arrayList.add(new C7495f(dVar));
                        }
                    }
                    this.f20867p.put(giftPage, arrayList);
                }
            }
            mo13962a(0);
        }
    }

    /* renamed from: b */
    public final void mo13966b(int i) {
        int i2 = i / 8;
        if (i2 >= 0 && i2 < this.f20874w) {
            this.f20860i = i2;
            if (this.f20873v) {
                this.f20871t.mo11846a(this.f20860i);
            }
            this.f20852a.f20790w.postValue(Integer.valueOf(this.f20860i));
        }
    }

    /* renamed from: c */
    public final void mo13968c(List<GiftPage> list) {
        int i;
        if (this.f20869r == -1) {
            this.f20869r = 1;
        }
        if (this.f20869r == 1 && list != null && !list.isEmpty()) {
            if (this.f20852a != null) {
                this.f20852a.f20758E.postValue(list);
            }
            this.f20866o.clear();
            this.f20866o.addAll(list);
            C7565d dVar = this.f20852a.f20770c;
            for (GiftPage giftPage : this.f20866o) {
                if (dVar == C7565d.GUEST) {
                    GiftManager.filterInteractNotSupportGift(giftPage.gifts, this.f20858g);
                } else {
                    GiftManager.filterNotSupportGift(giftPage.gifts, this.f20858g);
                }
                GiftManager.filterNotDisplayedOnPanel(giftPage.gifts);
                if (giftPage.pageType == 5 && !this.f20847E && ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
                    this.f20847E = true;
                    C7649u.m15656a().mo14013b(this.f20872u.getId());
                }
            }
            m15590g(list);
            View view = this.f20875x;
            if (this.f20876y) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: e */
    public final void mo13970e(List<C7505d> list) {
        if (!list.isEmpty()) {
            this.f20843A.clear();
            this.f20844B.clear();
            this.f20846D.clear();
            this.f20877z.clear();
            ArrayList<C7505d> arrayList = new ArrayList<>(list);
            List<C7505d> filterFansClubGifts = GiftManager.inst().filterFansClubGifts(arrayList);
            List<C7505d> filterHonorLevelGifts = GiftManager.inst().filterHonorLevelGifts(arrayList);
            List<C7505d> filterNobleGifts = GiftManager.inst().filterNobleGifts(arrayList);
            if (!C9376b.m18558a((Collection<T>) filterFansClubGifts)) {
                for (C7505d fVar : filterFansClubGifts) {
                    this.f20843A.add(new C7495f(fVar));
                }
            }
            if (!C9376b.m18558a((Collection<T>) filterHonorLevelGifts)) {
                for (C7505d fVar2 : filterHonorLevelGifts) {
                    this.f20844B.add(new C7495f(fVar2));
                }
            }
            if (!C9376b.m18558a((Collection<T>) filterNobleGifts)) {
                for (C7505d fVar3 : filterNobleGifts) {
                    this.f20846D.add(new C7495f(fVar3));
                }
            }
            if (filterFansClubGifts != null) {
                arrayList.removeAll(filterFansClubGifts);
            }
            if (filterHonorLevelGifts != null) {
                arrayList.removeAll(filterHonorLevelGifts);
            }
            if (filterNobleGifts != null) {
                arrayList.removeAll(filterNobleGifts);
            }
            for (C7505d dVar : arrayList) {
                if (dVar.f20544e == 5) {
                    this.f20850H = dVar;
                } else if (dVar.f20544e == 3) {
                    this.f20877z.add(new C7498i(dVar));
                } else if (dVar.f20544e == 9) {
                    this.f20877z.add(new C7496g(dVar));
                } else {
                    this.f20877z.add(new C7495f(dVar));
                }
            }
            mo13963a(C7577a.DATA_TYPE_GIFT);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13962a(int i) {
        if (!this.f20867p.isEmpty() || (this.f20845C != null && !this.f20845C.isEmpty())) {
            this.f20870s.setVisibility(8);
            this.f20854c.mo13552a();
            switch (i) {
                case 0:
                    GiftPage giftPage = null;
                    Iterator it = this.f20866o.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            GiftPage giftPage2 = (GiftPage) it.next();
                            if (giftPage2 != null && giftPage2.display) {
                                giftPage = giftPage2;
                            }
                        }
                    }
                    if (!(giftPage == null || this.f20868q == 5)) {
                        List list = (List) this.f20867p.get(giftPage);
                        if (list != null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(list);
                            if (giftPage.pageType == 1) {
                                mo13969d(arrayList);
                            }
                            mo13971f(arrayList);
                        }
                        return;
                    }
                    break;
                case 1:
                    if (this.f20868q == 5) {
                        mo13971f(mo13965b());
                    }
                    this.f20852a.f20777j.postValue(Boolean.valueOf(C7649u.m15656a().mo14016c()));
                    this.f20852a.f20778k.postValue(Boolean.valueOf(C7649u.m15656a().mo14015b()));
                    break;
            }
            return;
        }
        this.f20870s.mo9844c();
    }

    /* renamed from: b */
    public final void mo13967b(List<C7505d> list) {
        int i = 0;
        if (this.f20869r == -1) {
            this.f20869r = 0;
        }
        if (this.f20869r == 0 && list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            if (this.f20852a.f20770c == C7565d.GUEST) {
                GiftManager.filterInteractNotSupportGift(arrayList, this.f20858g);
            } else {
                GiftManager.filterNotSupportGift(arrayList, this.f20858g);
            }
            GiftManager.filterNotDisplayedOnPanel(arrayList);
            mo13970e(arrayList);
            View view = this.f20875x;
            if (this.f20876y) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13963a(C7577a aVar) {
        if ((this.f20877z == null || this.f20877z.isEmpty()) && (this.f20845C == null || this.f20845C.isEmpty())) {
            this.f20870s.mo9844c();
            return;
        }
        this.f20870s.setVisibility(8);
        switch (aVar) {
            case DATA_TYPE_BANNER:
            case DATA_TYPE_GIFT:
                if (this.f20859h == C7595ao.GIFT) {
                    mo13964a(C7595ao.GIFT);
                    return;
                }
                break;
            case DATA_TYPE_PROP:
                if (this.f20859h == C7595ao.PROP) {
                    mo13964a(C7595ao.PROP);
                }
                this.f20852a.f20777j.postValue(Boolean.valueOf(C7649u.m15656a().mo14016c()));
                this.f20852a.f20778k.postValue(Boolean.valueOf(C7649u.m15656a().mo14015b()));
                break;
        }
    }

    /* renamed from: a */
    private void m15583a(C7490a aVar, boolean z) {
        if (aVar != null) {
            this.f20863l = aVar;
            C7526c cVar = new C7526c(m15585b(aVar), aVar.mo13919p(), 1, z);
            this.f20852a.f20782o.postValue(cVar);
        }
    }

    /* renamed from: a */
    public final void mo13555a(C7491b bVar, boolean z) {
        boolean z2;
        boolean z3 = bVar instanceof C7490a;
        boolean z4 = true;
        if (z3) {
            GiftDialogViewModel giftDialogViewModel = this.f20852a;
            C7490a aVar = (C7490a) bVar;
            if (giftDialogViewModel.f20762I == null || (!(aVar instanceof C7497h) ? giftDialogViewModel.f20762I.f20613e == aVar.mo13919p() : giftDialogViewModel.f20762I.f20620l == aVar.mo13919p())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                this.f20852a.mo13949b();
                this.f20852a.mo13950c();
            }
        }
        boolean z5 = bVar instanceof C7497h;
        if (z5) {
            C7497h hVar = (C7497h) bVar;
            if (((Prop) hVar.f20516d).propType == 4) {
                if (((Prop) hVar.f20516d).banner != null) {
                    HashMap hashMap = new HashMap();
                    if (((Prop) hVar.f20516d).count <= 0) {
                        hashMap.put("has_popularity_card", Boolean.valueOf(false));
                        ((Prop) hVar.f20516d).banner.f23797d = 306;
                    } else {
                        hashMap.put("has_popularity_card", Boolean.valueOf(true));
                        ((Prop) hVar.f20516d).banner.f23797d = 373;
                    }
                    ((Prop) hVar.f20516d).banner.f23798e = 280;
                    ((Prop) hVar.f20516d).banner.f23801h = 3;
                    hashMap.put("count", Integer.valueOf(1));
                    hashMap.put("room_id", Long.valueOf(this.f20872u.getId()));
                    hashMap.put("prop_def_id", Long.valueOf(hVar.mo13919p()));
                    hashMap.put("to_uid", Long.valueOf(this.f20872u.getOwnerUserId()));
                    hashMap.put("is_aweme_free_gift", Integer.valueOf(0));
                    hashMap.put("describe", hVar.mo13915l());
                    hashMap.put("next_expire", Long.valueOf(((Prop) hVar.f20516d).nextExpire));
                    C5035a.m11519a(this.context, ((Prop) hVar.f20516d).banner, hashMap);
                    this.f20852a.f20784q.postValue(Boolean.valueOf(true));
                    GiftDialogViewModel giftDialogViewModel2 = this.f20852a;
                    int i = ((Prop) hVar.f20516d).count;
                    giftDialogViewModel2.f20785r.getValue();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("cards_left", String.valueOf(i));
                    hashMap2.put("room_id", String.valueOf(giftDialogViewModel2.f20772e.getId()));
                    C8049c.m15979a().mo14202a("popular_card_click", hashMap2, new Object[0]);
                    return;
                }
                return;
            }
        }
        if (bVar instanceof C7492c) {
            C5035a.m11518a(this.context, (C7492c) bVar);
            this.f20852a.f20784q.postValue(Boolean.valueOf(true));
        } else if (bVar instanceof C7498i) {
            C4495a.m10823a().mo10301a((Object) new C5163ai(0));
            this.f20852a.f20784q.postValue(Boolean.valueOf(true));
        } else {
            if (!(bVar instanceof C7494e)) {
                if (bVar instanceof C7500k) {
                    C7490a aVar2 = (C7490a) bVar;
                    m15583a(aVar2, aVar2.mo13908e());
                } else if (bVar instanceof C7496g) {
                    this.f20852a.f20785r.postValue(null);
                    if (this.f20857f) {
                        C7870ck ckVar = new C7870ck();
                        ckVar.f21793a = "gift_panel";
                        ckVar.f21794b = bVar.mo13919p();
                        this.dataCenter.lambda$put$1$DataCenter("cmd_show_gift_relay_dialog", ckVar);
                        return;
                    }
                    Toast makeText = Toast.makeText(this.context, this.context.getResources().getString(R.string.ece), 1);
                    if (VERSION.SDK_INT == 25) {
                        C47905fy.m103630a(makeText);
                    }
                    makeText.show();
                } else if (z3) {
                    if (!z5 || ((Prop) ((C7497h) bVar).f20516d).count > 0) {
                        this.f20863l = bVar;
                        if (((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.mo9431a()).intValue() == 1) {
                            if ((bVar.f20516d instanceof C7505d) && ((C7505d) bVar.f20516d).f20537F) {
                                if (!((Boolean) C4525b.f12392bH.mo10345a()).booleanValue()) {
                                    C4525b.f12392bH.mo10346a(Boolean.valueOf(true));
                                    try {
                                        ((C8260a) C4116c.m10249a(C8260a.class)).handle(this.context, Uri.parse((String) LiveConfigSettingKeys.PORTAL_INTRODUCTION_URI.mo9431a()));
                                    } catch (Throwable th) {
                                        C8064d.m16005b();
                                        C8064d.m9718a(5, th.getStackTrace());
                                    }
                                } else if (!((Boolean) this.dataCenter.get("data_allow_send_portal_gift", Boolean.valueOf(true))).booleanValue()) {
                                    C4204a.m10421a(this.context, (int) R.string.hs5);
                                }
                                z4 = false;
                            }
                            if (z4) {
                                m15583a((C7490a) bVar, false);
                            }
                        } else if (!(bVar.f20516d instanceof C7505d)) {
                            m15582a((C7490a) bVar);
                        } else if (((C7505d) bVar.f20516d).f20544e != 11 || this.f20857f) {
                            m15582a((C7490a) bVar);
                        } else {
                            this.f20852a.f20785r.postValue(null);
                            C4575an.m10981a((int) R.string.ece);
                        }
                    } else {
                        this.f20852a.f20757D.postValue("grey_prop");
                    }
                }
            }
        }
    }
}
