package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10737c;
import com.bytedance.ies.dmt.p664ui.widget.tablayout.DmtTabLayout.C10742f;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.choosemusic.C24803a;
import com.p683ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.C24814a;
import com.p683ss.android.ugc.aweme.choosemusic.adapter.C24816b;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24804a;
import com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24806c;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24833b;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24836e;
import com.p683ss.android.ugc.aweme.choosemusic.p1505d.C24842a;
import com.p683ss.android.ugc.aweme.choosemusic.p1506e.C24871a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24955a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24955a.C24961a;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24963c;
import com.p683ss.android.ugc.aweme.choosemusic.widgets.MusicBannerWidget;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26990b.C26991a;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.C26988b;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.p683ss.android.ugc.aweme.music.p1975c.C37351d;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37518aw.C37523a;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37625m;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;
import java.util.UUID;
import leakcanary.internal.LeakCanaryFileProvider;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment */
public class NewMusicTabFragment extends C23526a implements C0199s<C23274a>, C24833b, C24836e, C26988b, C26991a, C37306l<C24806c>, C37625m {

    /* renamed from: c */
    public static final String f65876c;

    /* renamed from: A */
    private String f65877A = "popular_song";

    /* renamed from: B */
    private Music f65878B;

    /* renamed from: C */
    private boolean f65879C;

    /* renamed from: D */
    private boolean f65880D;

    /* renamed from: a */
    public C24940p f65881a;

    /* renamed from: b */
    protected C24871a f65882b;

    /* renamed from: d */
    protected DataCenter f65883d;

    /* renamed from: e */
    public MusicModel f65884e;

    /* renamed from: j */
    public DiscoverMusicFragment f65885j;

    /* renamed from: k */
    public C24934k f65886k;

    /* renamed from: l */
    public C24943s f65887l;

    /* renamed from: m */
    protected C24955a f65888m;
    DmtStatusView mDmtStatusView;
    ScrollableLayout mScrollableLayout;
    ViewPager mVpFragmentContainer;
    View mVwDivideLine;

    /* renamed from: n */
    protected C24842a f65889n;

    /* renamed from: o */
    public boolean f65890o;

    /* renamed from: p */
    private C23279d f65891p;

    /* renamed from: q */
    private int f65892q;

    /* renamed from: r */
    private MusicBannerWidget f65893r;

    /* renamed from: s */
    private String f65894s;

    /* renamed from: t */
    private String f65895t;
    DmtTabLayout tabLayout;

    /* renamed from: u */
    private String f65896u;

    /* renamed from: v */
    private boolean f65897v;

    /* renamed from: w */
    private String f65898w;

    /* renamed from: x */
    private int f65899x;

    /* renamed from: y */
    private int f65900y;

    /* renamed from: z */
    private boolean f65901z = true;

    /* renamed from: Y_ */
    public boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public void mo50833a() {
        mo50841e();
    }

    /* renamed from: a */
    public final void mo50813a(MusicModel musicModel, Exception exc) {
    }

    public boolean ap_() {
        return false;
    }

    /* renamed from: g */
    public MusicModel mo50819g() {
        return this.f65884e;
    }

    /* renamed from: p */
    public int mo50849p() {
        return this.f65899x;
    }

    /* renamed from: a */
    public void mo50838a(boolean z) {
        this.f65879C = true;
    }

    /* renamed from: a */
    public void mo50816a(String str, final MusicModel musicModel, String str2) {
        C37378c.m83698a(musicModel);
        final FragmentActivity activity = getActivity();
        if (mo50849p() == 0 || mo50849p() == 2) {
            Intent intent = new Intent();
            intent.putExtra(LeakCanaryFileProvider.f132050j, str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        String string = getArguments().getString("shoot_way");
        final Builder builder = new Builder();
        builder.shootWay(string).creationId(UUID.randomUUID().toString()).musicOrigin(str2).musicPath(str).musicModel(musicModel);
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new AsyncServiceLoader() {
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                asyncAVService.uiService().recordService().startRecord(activity, builder.build(), musicModel, false);
            }
        });
    }

    /* renamed from: i */
    public Activity mo50821i() {
        return getActivity();
    }

    /* renamed from: j */
    public boolean mo50822j() {
        return isViewValid();
    }

    /* renamed from: f */
    public final void mo50842f() {
        if (this.mDmtStatusView != null) {
            this.mDmtStatusView.mo19212f();
        }
    }

    /* renamed from: h */
    public final void mo50843h() {
        if (this.mDmtStatusView != null) {
            this.mDmtStatusView.mo19209d();
        }
    }

    /* renamed from: k */
    public final void mo50844k() {
        if (this.mDmtStatusView != null) {
            this.mDmtStatusView.mo19214h();
        }
    }

    /* renamed from: m */
    public void mo50845m() {
        if (this.f65888m != null) {
            this.f65888m.mo50911a();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f65888m != null) {
            this.f65888m.f95726n = false;
        }
    }

    static {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.agz);
        sb.append(":");
        f65876c = sb.toString();
    }

    /* renamed from: s */
    private static boolean m60477s() {
        boolean z;
        boolean z2 = false;
        try {
            z = C32816h.m75716b().getEnableLocalMusicEntrance().booleanValue();
        } catch (C10174a unused) {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (C37249a.m83512c() != 0) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo50841e() {
        mo50842f();
        if (this.f65894s != null) {
            this.f65889n.mo50748a(this.f65894s, false, this.f65895t, this.f65878B);
        } else {
            this.f65889n.mo50749a(false, this.f65895t, this.f65878B, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo50847o() {
        C1322a n = mo50846n();
        if (n != null) {
            if (n instanceof C24816b) {
                ((C24816b) n).mo50699b();
                return;
            }
            if (n instanceof C24814a) {
                ((C24814a) n).mo50695b();
            }
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f65888m != null) {
            this.f65888m.mo50911a();
            this.f65888m.mo50916d();
        }
        if (this.f65882b != null) {
            this.f65882b.dismiss();
        }
    }

    /* renamed from: l */
    public final View mo50471l() {
        if (this.f65892q == 0) {
            return this.f65885j.mo50471l();
        }
        if (this.f65892q == 1) {
            return this.f65886k.mo50471l();
        }
        if (this.f65892q == 2) {
            return this.f65887l.mo50471l();
        }
        throw new IllegalStateException("Just has three types of View.");
    }

    /* renamed from: n */
    public C1322a mo50846n() {
        if (this.f65892q == 0) {
            return this.f65885j.f65842c;
        }
        if (this.f65892q == 1) {
            return this.f65886k.mo50874k();
        }
        if (this.f65892q == 2) {
            return this.f65887l.mo50874k();
        }
        throw new IllegalStateException("Just has three types of View.");
    }

    public void onPause() {
        super.onPause();
        if (this.f65888m != null) {
            this.f65888m.mo50911a();
            this.f65888m.f95726n = true;
        }
        this.f65883d.mo48228a("music_position", (Object) Integer.valueOf(-1));
        this.f65883d.mo48228a("music_index", (Object) Integer.valueOf(-1));
    }

    /* renamed from: q */
    public final void mo50850q() {
        if (this.mScrollableLayout != null && this.mScrollableLayout.getParent() != null) {
            int measuredHeight = ((View) this.mScrollableLayout.getParent()).getMeasuredHeight();
            this.f65885j.mo50809a((measuredHeight + this.mScrollableLayout.getCurScrollY()) - this.mScrollableLayout.getChildAt(0).getMeasuredHeight());
        }
    }

    /* renamed from: c */
    public void mo50737c(int i) {
        this.f65900y = i;
    }

    /* renamed from: a */
    public void mo50834a(int i) {
        this.f65900y = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo50835a(View view) {
        mo50841e();
    }

    /* renamed from: b */
    public void mo50734b(MusicModel musicModel) {
        this.f65888m.f95723k = this.f65877A;
        this.f65888m.mo77059b(musicModel, this.f65900y);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_CURRENT_TAB", this.f65892q);
    }

    /* renamed from: a */
    public void mo50731a(C37523a aVar) {
        this.f65888m.f95722j = aVar;
    }

    /* renamed from: a */
    public void mo50815a(C24806c cVar) {
        String str = cVar.f65657b;
        MusicModel musicModel = cVar.f65656a;
        if ("follow_type".equals(str)) {
            this.f65889n.mo50746a(musicModel, musicModel.getMusicId(), 1, cVar.f65658c, cVar.f65659d);
            return;
        }
        if ("unfollow_type".equals(str)) {
            this.f65889n.mo50746a(musicModel, musicModel.getMusicId(), 0, cVar.f65658c, cVar.f65659d);
        }
    }

    @C53771m(mo112976b = true)
    public void onMusicCollectEvent(C37351d dVar) {
        if (this.f65883d != null && dVar != null && "music_detail".equals(dVar.f95313c)) {
            C24804a aVar = new C24804a(0, dVar.f95311a, -1, -1, dVar.f95312b);
            this.f65883d.mo48228a("music_collect_status", (Object) aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo50840b(int i) {
        if (i == 1) {
            this.f65889n.mo50750b(0, 20);
            this.mVpFragmentContainer.setCurrentItem(1);
            this.mScrollableLayout.getHelper().f71219b = this.f65886k;
        } else if (i == 0) {
            this.mVpFragmentContainer.setCurrentItem(0);
            this.mScrollableLayout.getHelper().f71219b = this.f65885j;
        } else if (i == 2) {
            this.mVpFragmentContainer.setCurrentItem(2);
            this.mScrollableLayout.getHelper().f71219b = this.f65887l;
        }
        this.f65892q = i;
        switch (this.f65892q) {
            case 0:
                this.f65900y = 0;
                return;
            case 1:
                this.f65900y = 1;
                return;
            case 2:
                this.f65900y = 6;
                break;
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (getArguments() != null && arguments.containsKey("challenge")) {
            this.f65894s = arguments.getString("challenge");
        }
        Music music = null;
        this.f65895t = arguments.getString("first_sticker_music_ids", null);
        boolean z = false;
        this.f65897v = arguments.getBoolean("is_busi_sticker", false);
        this.f65896u = arguments.getString("first_sticker_id", null);
        if (arguments != null) {
            i = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE");
        } else {
            i = 0;
        }
        this.f65899x = i;
        if (arguments != null) {
            music = (Music) arguments.getSerializable("sticker_music");
        }
        this.f65878B = music;
        if (getArguments() != null && arguments.containsKey("shoot_way")) {
            this.f65898w = arguments.getString("shoot_way");
        }
        this.f65880D = m60477s();
        if (C37249a.m83512c() == 2) {
            z = true;
        }
        this.f65890o = z;
    }

    /* renamed from: a */
    public void mo50732a(MusicModel musicModel) {
        mo50845m();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChanged(com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.f62242a
            int r1 = r0.hashCode()
            r2 = -2080369200(0xffffffff840015d0, float:-1.5056343E-36)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x003c
            r2 = -1833731743(0xffffffff92b37961, float:-1.132641E-27)
            if (r1 == r2) goto L_0x0032
            r2 = -1635157503(0xffffffff9e897a01, float:-1.4555899E-20)
            if (r1 == r2) goto L_0x0028
            r2 = -1322093457(0xffffffffb132746f, float:-2.5968594E-9)
            if (r1 == r2) goto L_0x001e
            goto L_0x0046
        L_0x001e:
            java.lang.String r1 = "play_compeleted"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 3
            goto L_0x0047
        L_0x0028:
            java.lang.String r1 = "music_collect_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 2
            goto L_0x0047
        L_0x0032:
            java.lang.String r1 = "data_banner"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x003c:
            java.lang.String r1 = "pick_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0046
            r0 = 0
            goto L_0x0047
        L_0x0046:
            r0 = -1
        L_0x0047:
            switch(r0) {
                case 0: goto L_0x010f;
                case 1: goto L_0x0102;
                case 2: goto L_0x005f;
                case 3: goto L_0x004c;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x017a
        L_0x004c:
            android.support.v7.widget.RecyclerView$a r8 = r7.mo50846n()
            boolean r8 = r8 instanceof com.p683ss.android.ugc.aweme.choosemusic.adapter.C24816b
            if (r8 == 0) goto L_0x017a
            android.support.v7.widget.RecyclerView$a r8 = r7.mo50846n()
            com.ss.android.ugc.aweme.choosemusic.adapter.b r8 = (com.p683ss.android.ugc.aweme.choosemusic.adapter.C24816b) r8
            r8.mo50699b()
            goto L_0x017a
        L_0x005f:
            android.support.v4.app.Fragment r0 = r7.getParentFragment()
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.choosemusic.fragment.C24923c
            if (r1 == 0) goto L_0x006b
            com.ss.android.ugc.aweme.choosemusic.fragment.c r0 = (com.p683ss.android.ugc.aweme.choosemusic.fragment.C24923c) r0
            boolean r4 = r0.f65991c
        L_0x006b:
            if (r4 == 0) goto L_0x006e
            return
        L_0x006e:
            java.lang.Object r8 = r8.mo48246a()
            com.ss.android.ugc.aweme.choosemusic.a.a r8 = (com.p683ss.android.ugc.aweme.choosemusic.p1502a.C24804a) r8
            int r0 = r8.f65653d
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r8.f65654e
            int r8 = r8.f65650a
            if (r0 != r5) goto L_0x0101
            if (r8 != 0) goto L_0x0101
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout r8 = r7.tabLayout
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$f r8 = r8.mo19357b(r5)
            com.ss.android.ugc.aweme.choosemusic.e.a r0 = r7.f65882b
            com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$h r8 = r8.f28863h
            java.lang.String r2 = "anchor"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r2)
            java.lang.String r2 = "musicModel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            java.lang.String r2 = r1.getPicPremium()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00a8
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r0.f65817b
            java.lang.String r1 = r1.getPicPremium()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r2, r1)
            goto L_0x00bd
        L_0x00a8:
            java.lang.String r2 = r1.getPicBig()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00bd
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r0.f65817b
            java.lang.String r1 = r1.getPicBig()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r2, r1)
        L_0x00bd:
            int r1 = r8.getWidth()
            r4 = 4627448617123184640(0x4038000000000000, double:24.0)
            int r2 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r4)
            int r1 = r1 + r2
            r0.setWidth(r1)
            boolean r1 = r0.isShowing()
            if (r1 != 0) goto L_0x00f1
            int r1 = r8.getWidth()
            int r2 = r0.getWidth()
            int r1 = r1 - r2
            int r1 = r1 / r3
            int r2 = r8.getHeight()
            android.view.View r3 = r0.f65818c
            int r3 = r3.getMeasuredHeight()
            int r2 = r2 + r3
            r3 = 4625196817309499392(0x4030000000000000, double:16.0)
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r3)
            int r2 = r2 - r3
            int r2 = -r2
            r0.showAsDropDown(r8, r1, r2)
        L_0x00f1:
            android.view.View r8 = r0.f65818c
            java.lang.Runnable r1 = r0.f65816a
            r8.removeCallbacks(r1)
            android.view.View r8 = r0.f65818c
            java.lang.Runnable r0 = r0.f65816a
            r1 = 2000(0x7d0, double:9.88E-321)
            r8.postDelayed(r0, r1)
        L_0x0101:
            return
        L_0x0102:
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout r8 = r7.mScrollableLayout
            com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment$5 r0 = new com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment$5
            r0.<init>()
            r1 = 100
            r8.postDelayed(r0, r1)
            return
        L_0x010f:
            java.lang.Object r8 = r8.mo48246a()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r5) goto L_0x011f
            r7.mo50844k()
            return
        L_0x011f:
            r7.mo50843h()
            android.support.v4.app.Fragment r8 = r7.getParentFragment()
            boolean r0 = r8 instanceof com.p683ss.android.ugc.aweme.choosemusic.fragment.C24923c
            if (r0 == 0) goto L_0x0174
            com.ss.android.ugc.aweme.choosemusic.fragment.c r8 = (com.p683ss.android.ugc.aweme.choosemusic.fragment.C24923c) r8
            boolean r0 = r8.isViewValid()
            if (r0 == 0) goto L_0x0174
            android.support.v4.app.FragmentActivity r0 = r8.getActivity()
            if (r0 == 0) goto L_0x0174
            boolean r0 = r8.f65996l
            if (r0 != 0) goto L_0x013d
            goto L_0x0174
        L_0x013d:
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.p683ss.android.ugc.aweme.services.IExternalService) r0
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.getCurMusic()
            if (r0 == 0) goto L_0x0174
            android.view.View r1 = r8.f65993e
            r1.setVisibility(r4)
            android.widget.TextView r1 = r8.f65994j
            android.support.v4.app.FragmentActivity r2 = r8.getActivity()
            r3 = 2132542859(0x7f1c058b, float:2.0738835E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r0.getMusicName()
            r5[r4] = r6
            java.lang.String r2 = r2.getString(r3, r5)
            r1.setText(r2)
            android.view.View r1 = r8.f65995k
            com.ss.android.ugc.aweme.choosemusic.fragment.c$1 r2 = new com.ss.android.ugc.aweme.choosemusic.fragment.c$1
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x0174:
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout r8 = r7.mScrollableLayout
            r8.setVisibility(r4)
            return
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment.onChanged(com.ss.android.ugc.aweme.arch.widgets.base.a):void");
    }

    /* renamed from: b */
    public void mo50613b(int i, int i2) {
        if (this.f65881a != null) {
            if (i != 0) {
                this.f65881a.mo50905b();
            } else {
                this.f65881a.mo50904a();
            }
        }
        mo50850q();
    }

    /* renamed from: a */
    public void mo50607a(float f, float f2) {
        if (isViewValid()) {
            RecyclerView recyclerView = null;
            if (this.f65892q == 0) {
                recyclerView = (RecyclerView) this.f65885j.mo50471l();
            } else if (this.f65892q == 1) {
                recyclerView = (RecyclerView) this.f65886k.mo50471l();
            }
            if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                if (childCount == 0) {
                    this.mScrollableLayout.mo55117a();
                    this.mScrollableLayout.setMaxScrollHeight(0);
                    return;
                }
                View g = recyclerView.getLayoutManager().mo5050g(childCount - 1);
                int childCount2 = this.mScrollableLayout.getChildCount();
                if (childCount2 >= 2 && g != null) {
                    this.mScrollableLayout.setMaxScrollHeight(((recyclerView.getTop() + g.getBottom()) + this.mScrollableLayout.getChildAt(childCount2 - 1).getTop()) - ((View) this.mScrollableLayout.getParent()).getMeasuredHeight());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo50733a(MusicModel musicModel, C24803a aVar) {
        this.f65884e = musicModel;
        if (this.f65901z) {
            this.f65888m.f66059c = aVar;
            if (aVar != null && aVar.f65648h) {
                this.f65883d.mo48228a("last_play_music_id", (Object) musicModel.getMusicId());
            }
            this.f65888m.mo50913a(musicModel, this.f65900y, false);
            return;
        }
        this.f65888m.mo77059b(musicModel, this.f65900y);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        PagerAdapter pagerAdapter;
        View inflate = layoutInflater.inflate(R.layout.oo, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        this.mScrollableLayout.setVisibility(4);
        this.mScrollableLayout.setOnScrollListener(this);
        this.mDmtStatusView.setBuilder(C10719a.m21676a(getContext()).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new C24916ah(this)).mo19233c(0));
        if (bundle == null) {
            i = 0;
        } else {
            i = bundle.getInt("KEY_CURRENT_TAB", 0);
        }
        this.f65892q = i;
        this.f65883d = DataCenter.m57235a(C0214z.m438a((Fragment) this), (C0184k) this);
        this.f65883d.mo48226a("pick_status", (C0199s<C23274a>) this).mo48226a("data_banner", (C0199s<C23274a>) this).mo48226a("play_compeleted", (C0199s<C23274a>) this).mo48226a("music_collect_status", (C0199s<C23274a>) this);
        this.f65883d.mo48228a("key_choose_music_type", (Object) Integer.valueOf(this.f65899x));
        this.f65883d.mo48228a("sticker_id", (Object) this.f65896u);
        this.f65883d.mo48228a("challenge_id", (Object) this.f65894s);
        this.f65883d.mo48228a("mvtheme_music_type", (Object) Boolean.valueOf(this.f65879C));
        this.f65883d.mo48228a("is_busi_sticker", (Object) Boolean.valueOf(this.f65897v));
        this.f65883d.mo48228a("shoot_way", (Object) this.f65898w);
        this.f65891p = C23279d.m57256a((Fragment) this, inflate);
        this.f65891p.mo48252a(this.f65883d);
        this.f65893r = new MusicBannerWidget();
        this.f65889n = new C24842a(getContext(), this.f65883d);
        this.f65891p.mo48255b(R.id.bf_, this.f65893r);
        C0654k childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        sb.append(f65876c);
        sb.append(0);
        this.f65885j = (DiscoverMusicFragment) childFragmentManager.mo2224a(sb.toString());
        if (this.f65885j == null) {
            int i2 = this.f65899x;
            String str = this.f65894s;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
            if (!TextUtils.isEmpty(str)) {
                bundle2.putString("challenge", str);
            }
            DiscoverMusicFragment discoverMusicFragment = new DiscoverMusicFragment();
            discoverMusicFragment.setArguments(bundle2);
            this.f65885j = discoverMusicFragment;
        }
        this.f65885j.f65840a = this.f65883d;
        this.f65885j.f65841b = this.f65891p;
        this.f65885j.f65846k = this.f65889n;
        DiscoverMusicFragment discoverMusicFragment2 = this.f65885j;
        discoverMusicFragment2.f65843d = this;
        if (discoverMusicFragment2.f65842c != null) {
            discoverMusicFragment2.f65842c.f65682d = discoverMusicFragment2.f65843d;
        }
        DiscoverMusicFragment discoverMusicFragment3 = this.f65885j;
        discoverMusicFragment3.f65844e = this;
        if (discoverMusicFragment3.f65842c != null) {
            discoverMusicFragment3.f65842c.f65683e = discoverMusicFragment3.f65844e;
        }
        DiscoverMusicFragment discoverMusicFragment4 = this.f65885j;
        discoverMusicFragment4.f65845j = this;
        if (discoverMusicFragment4.f65842c != null) {
            discoverMusicFragment4.f65842c.f65686h = discoverMusicFragment4.f65845j;
        }
        C0654k childFragmentManager2 = getChildFragmentManager();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f65876c);
        sb2.append(1);
        this.f65886k = (C24934k) childFragmentManager2.mo2224a(sb2.toString());
        if (this.f65886k == null) {
            int i3 = this.f65899x;
            String str2 = this.f65894s;
            Bundle bundle3 = new Bundle();
            bundle3.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i3);
            if (!TextUtils.isEmpty(str2)) {
                bundle3.putString("challenge", str2);
            }
            C24934k kVar = new C24934k();
            kVar.setArguments(bundle3);
            this.f65886k = kVar;
        }
        this.f65886k.f65964e = this.f65883d;
        this.f65886k.f66024l = this;
        if (this.f65880D) {
            int i4 = this.f65899x;
            C24943s sVar = new C24943s();
            Bundle bundle4 = new Bundle();
            bundle4.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i4);
            sVar.setArguments(bundle4);
            this.f65887l = sVar;
        }
        this.f65888m = new C24955a(this, new C24961a() {
            /* renamed from: a */
            public final void mo50851a() {
                if (NewMusicTabFragment.this.f65884e != null) {
                    NewMusicTabFragment.this.f65883d.mo48228a("play_compeleted", (Object) NewMusicTabFragment.this.f65884e.getMusicId());
                }
            }

            /* renamed from: a */
            public final void mo50852a(int i, int i2) {
                if (NewMusicTabFragment.this.f65884e != null) {
                    NewMusicTabFragment.this.f65883d.mo48228a("play_error", (Object) NewMusicTabFragment.this.f65884e.getMusicId());
                }
            }
        });
        this.f65888m.mo50915c();
        this.f65888m.mo77053a(this.f65899x);
        this.f65882b = new C24871a(getContext());
        if (this.f65880D) {
            this.mVpFragmentContainer.setOffscreenPageLimit(3);
        } else {
            this.mVpFragmentContainer.setOffscreenPageLimit(2);
        }
        ViewPager viewPager = this.mVpFragmentContainer;
        if (this.f65880D) {
            pagerAdapter = new C0677p(getChildFragmentManager()) {

                /* renamed from: b */
                private final int[] f65904b = {R.string.aqg, R.string.cej, R.string.cel};

                /* renamed from: c */
                private final int[] f65905c = {R.string.aqg, R.string.cej, R.string.cem};

                public final int getCount() {
                    return 3;
                }

                /* renamed from: a */
                public final Fragment mo2309a(int i) {
                    if (i == 0) {
                        return NewMusicTabFragment.this.f65885j;
                    }
                    if (i == 1) {
                        return NewMusicTabFragment.this.f65886k;
                    }
                    if (NewMusicTabFragment.this.f65887l != null) {
                        return NewMusicTabFragment.this.f65887l;
                    }
                    throw new IllegalStateException("LocalMusicFragment must not be null!");
                }

                public final CharSequence getPageTitle(int i) {
                    if (NewMusicTabFragment.this.f65890o) {
                        return NewMusicTabFragment.this.getResources().getString(this.f65905c[i]);
                    }
                    return NewMusicTabFragment.this.getResources().getString(this.f65904b[i]);
                }
            };
        } else {
            pagerAdapter = new C0677p(getChildFragmentManager()) {

                /* renamed from: b */
                private final int[] f65907b = {R.string.aqg, R.string.cej};

                public final int getCount() {
                    return 2;
                }

                /* renamed from: a */
                public final Fragment mo2309a(int i) {
                    if (i == 0) {
                        return NewMusicTabFragment.this.f65885j;
                    }
                    return NewMusicTabFragment.this.f65886k;
                }

                public final CharSequence getPageTitle(int i) {
                    return NewMusicTabFragment.this.getResources().getString(this.f65907b[i]);
                }
            };
        }
        viewPager.setAdapter(pagerAdapter);
        this.tabLayout.setCustomTabViewResId(R.layout.x9);
        this.tabLayout.setTabMode(0);
        this.tabLayout.setAutoFillWhenScrollable(true);
        this.tabLayout.setupWithViewPager(this.mVpFragmentContainer);
        ((LinearLayout) this.tabLayout.getChildAt(0)).setShowDividers(0);
        this.tabLayout.setOnTabClickListener(new C24915ag(this));
        this.tabLayout.setSelectedTabIndicatorHeight(C23728o.m58241a(2.0d));
        this.tabLayout.mo19349a((C10737c) new C10737c() {
            /* renamed from: a */
            public final void mo19400a(C10742f fVar) {
                int i = fVar.f28860e;
                if (i == 1 && NewMusicTabFragment.this.f65882b != null) {
                    NewMusicTabFragment.this.f65882b.dismiss();
                }
                C24963c.m60727b(i);
                NewMusicTabFragment.this.mo50847o();
                NewMusicTabFragment.this.mo50840b(i);
            }
        });
        this.tabLayout.mo19357b(this.f65892q).mo19417a();
        this.mScrollableLayout.setTabsMarginTop(C23728o.m58241a(44.0d));
        mo50840b(this.f65892q);
        mo50833a();
        Activity i5 = mo50821i();
        if (i5 instanceof ChooseMusicActivity) {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = ((ChooseMusicActivity) i5).f65663c;
            if (viewPagerBottomSheetBehavior != null) {
                viewPagerBottomSheetBehavior.mo48762a(this.mVpFragmentContainer);
            }
        }
        return inflate;
    }
}
