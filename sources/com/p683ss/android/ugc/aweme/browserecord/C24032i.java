package com.p683ss.android.ugc.aweme.browserecord;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C27989z;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.browserecord.C23997b.C23998a;
import com.p683ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel;
import com.p683ss.android.ugc.aweme.browserecord.model.BrowseRecordViewModel.C24037a;
import com.p683ss.android.ugc.aweme.browserecord.model.C24042a;
import com.p683ss.android.ugc.aweme.browserecord.model.C24045d;
import com.p683ss.android.ugc.aweme.digg.C27689c.C27690a;
import com.p683ss.android.ugc.aweme.digg.p1634b.C27688a;
import com.p683ss.android.ugc.aweme.familiar.experiment.C29644a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31009h;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.friends.p1792ui.GroupedAvatars;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23238h;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.p2396w.C48221a;
import com.p683ss.android.ugc.aweme.profile.model.RelativeUserInfo;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.setting.services.C41713b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.C53771m;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.browserecord.i */
public final class C24032i extends C31009h implements C0199s<C23274a>, OnClickListener, C24045d {

    /* renamed from: k */
    public static final C24033a f63766k = new C24033a(null);

    /* renamed from: A */
    private View f63767A;

    /* renamed from: B */
    private View f63768B;

    /* renamed from: C */
    private final long f63769C;

    /* renamed from: D */
    private C30669b f63770D;

    /* renamed from: E */
    private C1690c f63771E;

    /* renamed from: F */
    private boolean f63772F;

    /* renamed from: G */
    private final AccelerateDecelerateInterpolator f63773G;

    /* renamed from: H */
    private final C30313ae<C30332aw> f63774H;

    /* renamed from: a */
    public View f63775a;

    /* renamed from: b */
    public View f63776b;

    /* renamed from: c */
    public View f63777c;

    /* renamed from: d */
    public TextView f63778d;

    /* renamed from: e */
    public View f63779e;

    /* renamed from: f */
    public final BrowseRecordViewModel f63780f;

    /* renamed from: g */
    public int f63781g;

    /* renamed from: h */
    public ViewPropertyAnimator f63782h;

    /* renamed from: i */
    public ViewPropertyAnimator f63783i;

    /* renamed from: j */
    public int f63784j;

    /* renamed from: w */
    private GroupedAvatars f63785w;

    /* renamed from: x */
    private View f63786x;

    /* renamed from: y */
    private TextView f63787y;

    /* renamed from: z */
    private TextView f63788z;

    /* renamed from: com.ss.android.ugc.aweme.browserecord.i$a */
    public static final class C24033a {
        private C24033a() {
        }

        public /* synthetic */ C24033a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.i$b */
    public static final class C24034b implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C24032i f63789a;

        C24034b(C24032i iVar) {
            this.f63789a = iVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null || this.f63789a.f63781g != 0) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        C24032i.m58834a(this.f63789a).setAlpha(0.75f);
                        C24032i.m58837b(this.f63789a).setAlpha(0.75f);
                        C24032i.m58839c(this.f63789a).setAlpha(0.75f);
                        break;
                    case 1:
                        break;
                }
            }
            C24032i.m58834a(this.f63789a).setAlpha(1.0f);
            C24032i.m58837b(this.f63789a).setAlpha(1.0f);
            C24032i.m58839c(this.f63789a).setAlpha(1.0f);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.i$c */
    static final class C24035c<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ C24032i f63790a;

        /* renamed from: b */
        final /* synthetic */ List f63791b;

        /* renamed from: c */
        final /* synthetic */ long f63792c;

        /* renamed from: d */
        final /* synthetic */ boolean f63793d;

        C24035c(C24032i iVar, List list, long j, boolean z) {
            this.f63790a = iVar;
            this.f63791b = list;
            this.f63792c = j;
            this.f63793d = z;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            this.f63790a.mo49785a(this.f63791b, this.f63792c, this.f63793d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.i$d */
    static final class C24036d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C24032i f63794a;

        /* renamed from: b */
        final /* synthetic */ C0654k f63795b;

        C24036d(C24032i iVar, C0654k kVar) {
            this.f63794a = iVar;
            this.f63795b = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f63794a.mo49782a(this.f63795b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo49748a(List<C24042a> list, boolean z) {
        C52711k.m112240b(list, "list");
    }

    /* renamed from: b */
    public final void mo49750b(Throwable th) {
        C52711k.m112240b(th, "throwable");
    }

    /* renamed from: b */
    public final void mo49751b(List<? extends User> list, boolean z) {
        C52711k.m112240b(list, "list");
    }

    /* renamed from: c */
    public final void mo49753c(Throwable th) {
        C52711k.m112240b(th, "throwable");
    }

    /* renamed from: e */
    public final void mo49755e() {
    }

    /* renamed from: a */
    public final void mo49747a(List<C24042a> list, long j, boolean z, boolean z2) {
        C52711k.m112240b(list, "list");
        if (z2) {
            C2201v a = C2201v.m6592a(150, TimeUnit.MILLISECONDS).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
            C24035c cVar = new C24035c(this, list, j, z);
            this.f63771E = a.mo6545f((C1710e<? super T>) cVar);
            return;
        }
        mo49785a(list, j, z);
    }

    /* renamed from: a */
    public final void mo49785a(List<C24042a> list, long j, boolean z) {
        boolean z2 = false;
        boolean z3 = j > this.f63769C;
        if (!z3) {
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                m58835a(list);
                m58842l();
                m58843m();
            }
        }
        m58836a(z3);
        m58842l();
        m58843m();
    }

    /* renamed from: a */
    public final void mo49746a(Throwable th) {
        C52711k.m112240b(th, "throwable");
        this.f63781g = 2;
        m58836a(false);
        m58842l();
        m58843m();
    }

    /* renamed from: k */
    private final String m58841k() {
        C30669b bVar = this.f63770D;
        if (bVar != null) {
            String eventType = bVar.getEventType();
            if (eventType != null) {
                return eventType;
            }
        }
        return "";
    }

    /* renamed from: j */
    private final boolean m58840j() {
        long j;
        Aweme aweme = this.f81192l;
        if (aweme != null) {
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                j = statistics.getDiggCount();
                if (j > 0 || !C27989z.f73414b.mo56386a().mo44459b()) {
                    return false;
                }
                return true;
            }
        }
        j = 0;
        if (j > 0) {
        }
        return false;
    }

    /* renamed from: m */
    private final void m58843m() {
        ViewPropertyAnimator viewPropertyAnimator = this.f63783i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f63782h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        View view = this.f63776b;
        if (view == null) {
            C52711k.m112237a("mContentLayout");
        }
        this.f63783i = view.animate().setInterpolator(this.f63773G).alpha(1.0f).setDuration(150);
        ViewPropertyAnimator viewPropertyAnimator3 = this.f63783i;
        if (viewPropertyAnimator3 != null) {
            viewPropertyAnimator3.start();
        }
    }

    /* renamed from: a */
    public final void mo49781a() {
        C47718bf.m103291d(this);
        C1690c cVar = this.f63771E;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* renamed from: n */
    private final void m58844n() {
        switch (this.f63781g) {
            case 1:
                Context context = this.f81198r;
                if (context == null) {
                    context = C11010c.m22280a();
                }
                C10691a.m21548c(context, (int) R.string.hvx).mo19066a();
                return;
            case 2:
            case 3:
                return;
            default:
                FragmentActivity a = m58832a(this.f81198r);
                if (a != null) {
                    C0654k supportFragmentManager = a.getSupportFragmentManager();
                    if (supportFragmentManager != null) {
                        if (!C41713b.f105569a.isBrowseRecordSwitchOn()) {
                            m58838b(supportFragmentManager);
                            return;
                        } else {
                            mo49782a(supportFragmentManager);
                            return;
                        }
                    }
                }
                return;
        }
    }

    /* renamed from: o */
    private final void m58845o() {
        FragmentActivity a = m58832a(this.f81198r);
        if (a != null) {
            C0654k supportFragmentManager = a.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                Aweme aweme = this.f81192l;
                if (aweme != null) {
                    C27688a.m66334a(m58841k(), aweme.getAuthorUid(), aweme.getAid(), C23198ae.m56887w(aweme));
                    String aid = aweme.getAid();
                    int awemeType = aweme.getAwemeType();
                    BrowseRecordViewModel browseRecordViewModel = this.f63780f;
                    String aid2 = aweme.getAid();
                    C52711k.m112236a((Object) aid2, "aid");
                    C27690a.m66356a(aid, awemeType, C47760cd.m103385a(browseRecordViewModel.mo49791a(aid2)), false, 0, "", "video_like_list").show(supportFragmentManager, "LikeUsersFragment");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r3 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r3 == null) goto L_0x002e;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m58846p() {
        /*
            r4 = this;
            java.lang.String r0 = "enter_video_play_list"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r4.m58841k()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r4.f81192l
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = r3.getAuthorUid()
            if (r3 != 0) goto L_0x001e
        L_0x001c:
            java.lang.String r3 = ""
        L_0x001e:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r4.f81192l
            if (r3 == 0) goto L_0x002e
            java.lang.String r3 = r3.getAid()
            if (r3 != 0) goto L_0x0030
        L_0x002e:
            java.lang.String r3 = ""
        L_0x0030:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "rec_uid"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r4.f81192l
            java.lang.String r3 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56887w(r3)
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.browserecord.C24032i.m58846p():void");
    }

    /* renamed from: d */
    public final void mo49754d() {
        long j;
        this.f63781g = 3;
        boolean z = this.f63772F;
        ViewPropertyAnimator viewPropertyAnimator = this.f63783i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f63782h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        View view = this.f63776b;
        if (view == null) {
            C52711k.m112237a("mContentLayout");
        }
        ViewPropertyAnimator alpha = view.animate().setInterpolator(this.f63773G).alpha(0.0f);
        if (z) {
            j = 0;
        } else {
            j = 150;
        }
        this.f63782h = alpha.setDuration(j);
        ViewPropertyAnimator viewPropertyAnimator3 = this.f63782h;
        if (viewPropertyAnimator3 != null) {
            viewPropertyAnimator3.start();
        }
        if (this.f63772F) {
            this.f63772F = false;
        }
    }

    /* renamed from: l */
    private final void m58842l() {
        long j;
        long j2 = 0;
        int i = 8;
        if (m58840j()) {
            TextView textView = this.f63787y;
            if (textView == null) {
                C52711k.m112237a("mDiggContent");
            }
            textView.setVisibility(0);
            View view = this.f63779e;
            if (view == null) {
                C52711k.m112237a("mArrow");
            }
            view.setVisibility(8);
            TextView textView2 = this.f63788z;
            if (textView2 == null) {
                C52711k.m112237a("mSplit");
            }
            textView2.setVisibility(0);
            TextView textView3 = this.f63787y;
            if (textView3 == null) {
                C52711k.m112237a("mDiggContent");
            }
            String string = this.f81198r.getString(R.string.gxs);
            C52711k.m112236a((Object) string, "mContext.getString(R.string.player_likes)");
            Object[] objArr = new Object[1];
            Aweme aweme = this.f81192l;
            if (aweme != null) {
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    j = statistics.getDiggCount();
                    objArr[0] = C33095b.m76068a(j);
                    String a = C2240a.m6772a(string, Arrays.copyOf(objArr, 1));
                    C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
                    textView3.setText(a);
                }
            }
            j = 0;
            objArr[0] = C33095b.m76068a(j);
            String a2 = C2240a.m6772a(string, Arrays.copyOf(objArr, 1));
            C52711k.m112236a((Object) a2, "java.lang.String.format(format, *args)");
            textView3.setText(a2);
        } else {
            TextView textView4 = this.f63787y;
            if (textView4 == null) {
                C52711k.m112237a("mDiggContent");
            }
            textView4.setVisibility(8);
            TextView textView5 = this.f63788z;
            if (textView5 == null) {
                C52711k.m112237a("mSplit");
            }
            textView5.setVisibility(8);
        }
        TextView textView6 = this.f63778d;
        if (textView6 == null) {
            C52711k.m112237a("mBrowseRecordContent");
        }
        String string2 = this.f81198r.getString(R.string.gxt);
        C52711k.m112236a((Object) string2, "mContext.getString(R.string.player_views)");
        Object[] objArr2 = new Object[1];
        Aweme aweme2 = this.f81192l;
        if (aweme2 != null) {
            AwemeStatistics statistics2 = aweme2.getStatistics();
            if (statistics2 != null) {
                j2 = statistics2.getPlayCount();
            }
        }
        objArr2[0] = C33095b.m76068a(j2);
        String a3 = C2240a.m6772a(string2, Arrays.copyOf(objArr2, 1));
        C52711k.m112236a((Object) a3, "java.lang.String.format(format, *args)");
        textView6.setText(a3);
        TextView textView7 = this.f63788z;
        if (textView7 == null) {
            C52711k.m112237a("mSplit");
        }
        if (m58840j()) {
            i = 0;
        }
        textView7.setVisibility(i);
    }

    /* renamed from: a */
    public static final /* synthetic */ View m58834a(C24032i iVar) {
        View view = iVar.f63777c;
        if (view == null) {
            C52711k.m112237a("mAvatarsLayout");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m58837b(C24032i iVar) {
        TextView textView = iVar.f63778d;
        if (textView == null) {
            C52711k.m112237a("mBrowseRecordContent");
        }
        return textView;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m58839c(C24032i iVar) {
        View view = iVar.f63779e;
        if (view == null) {
            C52711k.m112237a("mArrow");
        }
        return view;
    }

    @C53771m
    public final void onVideoEvent(C30332aw awVar) {
        C52711k.m112240b(awVar, "event");
        if (awVar.f79228a == 13) {
            m58842l();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final FragmentActivity m58832a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof FragmentActivity) {
            return (FragmentActivity) context;
        }
        if (context instanceof ContextWrapper) {
            return m58832a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: b */
    private final void m58838b(C0654k kVar) {
        C24017f.f63743e.mo49774a(kVar, m58841k(), new C24036d(this, kVar));
    }

    /* renamed from: a */
    private final void m58836a(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.f63781g = i;
        View view = this.f63779e;
        if (view == null) {
            C52711k.m112237a("mArrow");
        }
        view.setVisibility(8);
        GroupedAvatars groupedAvatars = this.f63785w;
        if (groupedAvatars == null) {
            C52711k.m112237a("mAvatars");
        }
        groupedAvatars.setVisibility(8);
        View view2 = this.f63786x;
        if (view2 == null) {
            C52711k.m112237a("mAvatarNone");
        }
        view2.setVisibility(0);
        TextView textView = this.f63778d;
        if (textView == null) {
            C52711k.m112237a("mBrowseRecordContent");
        }
        textView.setTextColor(C0726c.m2098c(this.f81198r, R.color.ga));
        TextView textView2 = this.f63788z;
        if (textView2 == null) {
            C52711k.m112237a("mSplit");
        }
        textView2.setTextColor(C0726c.m2098c(this.f81198r, R.color.ga));
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -995427962) {
                if (hashCode != -330048708) {
                    if (hashCode == 592241891 && str.equals("init_index")) {
                        Object a = aVar.mo48246a();
                        C52711k.m112236a(a, "t.getData<Int>()");
                        this.f63784j = ((Number) a).intValue();
                    }
                } else if (str.equals("aweme_changed")) {
                    Aweme aweme = (Aweme) aVar.mo48246a();
                    if (aweme != null) {
                        C52711k.m112240b(aweme, "aweme");
                        this.f81192l = aweme;
                        BrowseRecordViewModel browseRecordViewModel = this.f63780f;
                        String aid = aweme.getAid();
                        C52711k.m112236a((Object) aid, "aweme.aid");
                        browseRecordViewModel.mo49793b(aid);
                    }
                }
            } else if (str.equals("params")) {
                this.f63770D = (C30669b) aVar.mo48246a();
            }
        }
    }

    /* renamed from: a */
    private final void m58835a(List<C24042a> list) {
        String str;
        this.f63781g = 0;
        if (!m58840j()) {
            View view = this.f63779e;
            if (view == null) {
                C52711k.m112237a("mArrow");
            }
            view.setVisibility(0);
        }
        GroupedAvatars groupedAvatars = this.f63785w;
        if (groupedAvatars == null) {
            C52711k.m112237a("mAvatars");
        }
        groupedAvatars.setVisibility(0);
        View view2 = this.f63786x;
        if (view2 == null) {
            C52711k.m112237a("mAvatarNone");
        }
        view2.setVisibility(8);
        GroupedAvatars groupedAvatars2 = this.f63785w;
        if (groupedAvatars2 == null) {
            C52711k.m112237a("mAvatars");
        }
        Iterable<C24042a> b = C52575l.m112129b((Iterable<? extends T>) list, 3);
        Collection arrayList = new ArrayList(C52575l.m112104a(b, 10));
        for (C24042a aVar : b) {
            RelativeUserInfo relativeUserInfo = new RelativeUserInfo();
            User user = aVar.getUser();
            UrlModel urlModel = null;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            relativeUserInfo.setUid(str);
            User user2 = aVar.getUser();
            if (user2 != null) {
                urlModel = user2.getAvatarThumb();
            }
            relativeUserInfo.setAvatar(urlModel);
            arrayList.add(relativeUserInfo);
        }
        groupedAvatars2.mo66167a((List) arrayList);
        TextView textView = this.f63778d;
        if (textView == null) {
            C52711k.m112237a("mBrowseRecordContent");
        }
        textView.setTextColor(C0726c.m2098c(this.f81198r, R.color.jg));
        TextView textView2 = this.f63788z;
        if (textView2 == null) {
            C52711k.m112237a("mSplit");
        }
        textView2.setTextColor(C0726c.m2098c(this.f81198r, R.color.jg));
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (!C32800a.m75679a(view)) {
            if (view != null) {
                num = Integer.valueOf(view.getId());
            } else {
                num = null;
            }
            if ((num != null && num.intValue() == R.id.e3l) || (num != null && num.intValue() == R.id.ei0)) {
                m58844n();
            } else if (num != null && num.intValue() == R.id.e3m) {
                m58845o();
            } else if (num == null || num.intValue() != R.id.g_) {
                if (num != null && num.intValue() == R.id.bmy) {
                    C30313ae<C30332aw> aeVar = this.f63774H;
                    if (aeVar != null) {
                        aeVar.mo60714a(new C30332aw(3, this.f81192l));
                    }
                    C23238h d = new C23238h().mo48086d(m58841k());
                    d.f62026e = "click_button_down";
                    d.mo47954f(this.f81192l).mo48076e();
                }
            } else if (C29644a.m69692a()) {
                m58845o();
            } else {
                m58844n();
            }
        }
    }

    /* renamed from: a */
    public final void mo49782a(C0654k kVar) {
        long j;
        C23998a aVar = C23997b.f63707b;
        Aweme aweme = this.f81192l;
        C52711k.m112236a((Object) aweme, "mAweme");
        String aid = aweme.getAid();
        C52711k.m112236a((Object) aid, "mAweme.aid");
        Aweme aweme2 = this.f81192l;
        C52711k.m112236a((Object) aweme2, "mAweme");
        AwemeStatistics statistics = aweme2.getStatistics();
        if (statistics != null) {
            j = statistics.getPlayCount();
        } else {
            j = 0;
        }
        aVar.mo49758a(kVar, new C24016e(aid, j, m58841k()));
        m58846p();
    }

    /* renamed from: a */
    public final void mo49783a(View view) {
        C52711k.m112240b(view, "view");
        C47718bf.m103290c(this);
        View findViewById = view.findViewById(R.id.b9e);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.layout_root)");
        this.f63775a = findViewById;
        View findViewById2 = view.findViewById(R.id.b7b);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.layout_content)");
        this.f63776b = findViewById2;
        View findViewById3 = view.findViewById(R.id.dyi);
        C52711k.m112236a((Object) findViewById3, "view.findViewById(R.id.avatars)");
        this.f63785w = (GroupedAvatars) findViewById3;
        View findViewById4 = view.findViewById(R.id.ei0);
        C52711k.m112236a((Object) findViewById4, "view.findViewById(R.id.layout_avatars)");
        this.f63777c = findViewById4;
        View findViewById5 = view.findViewById(R.id.dyg);
        C52711k.m112236a((Object) findViewById5, "view.findViewById(R.id.avatar_none)");
        this.f63786x = findViewById5;
        View findViewById6 = view.findViewById(R.id.e3l);
        C52711k.m112236a((Object) findViewById6, "view.findViewById(R.id.content_browse_record)");
        this.f63778d = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.e3m);
        C52711k.m112236a((Object) findViewById7, "view.findViewById(R.id.content_digg)");
        this.f63787y = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.cqz);
        C52711k.m112236a((Object) findViewById8, "view.findViewById(R.id.split)");
        this.f63788z = (TextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.g_);
        C52711k.m112236a((Object) findViewById9, "view.findViewById(R.id.arrow)");
        this.f63779e = findViewById9;
        View findViewById10 = view.findViewById(R.id.bmy);
        C52711k.m112236a((Object) findViewById10, "view.findViewById(R.id.more)");
        this.f63767A = findViewById10;
        View findViewById11 = view.findViewById(R.id.a6h);
        C52711k.m112236a((Object) findViewById11, "view.findViewById(R.id.divider)");
        this.f63768B = findViewById11;
        View view2 = this.f63777c;
        if (view2 == null) {
            C52711k.m112237a("mAvatarsLayout");
        }
        OnClickListener onClickListener = this;
        view2.setOnClickListener(onClickListener);
        TextView textView = this.f63778d;
        if (textView == null) {
            C52711k.m112237a("mBrowseRecordContent");
        }
        textView.setOnClickListener(onClickListener);
        TextView textView2 = this.f63787y;
        if (textView2 == null) {
            C52711k.m112237a("mDiggContent");
        }
        textView2.setOnClickListener(onClickListener);
        View view3 = this.f63767A;
        if (view3 == null) {
            C52711k.m112237a("mMore");
        }
        view3.setOnClickListener(onClickListener);
        C24034b bVar = new C24034b(this);
        C48221a aVar = new C48221a(0.75f, 0, null);
        C48221a aVar2 = new C48221a(0.75f, 0, null);
        View view4 = this.f63777c;
        if (view4 == null) {
            C52711k.m112237a("mAvatarsLayout");
        }
        OnTouchListener onTouchListener = bVar;
        view4.setOnTouchListener(onTouchListener);
        TextView textView3 = this.f63778d;
        if (textView3 == null) {
            C52711k.m112237a("mBrowseRecordContent");
        }
        textView3.setOnTouchListener(onTouchListener);
        TextView textView4 = this.f63787y;
        if (textView4 == null) {
            C52711k.m112237a("mDiggContent");
        }
        textView4.setOnTouchListener(aVar);
        View view5 = this.f63767A;
        if (view5 == null) {
            C52711k.m112237a("mMore");
        }
        view5.setOnTouchListener(aVar2);
        View view6 = this.f63767A;
        if (view6 == null) {
            C52711k.m112237a("mMore");
        }
        int i = 8;
        view6.setVisibility(8);
        TextView textView5 = this.f63787y;
        if (textView5 == null) {
            C52711k.m112237a("mDiggContent");
        }
        if (C29644a.m69692a()) {
            i = 0;
        }
        textView5.setVisibility(i);
        C22453b a = C22453b.m55505a();
        View view7 = this.f63775a;
        if (view7 == null) {
            C52711k.m112237a("mRootLayout");
        }
        View view8 = this.f63768B;
        if (view8 == null) {
            C52711k.m112237a("mDivider");
        }
        a.mo46744a(2, view7, view8, null, null);
    }

    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        if (dataCenter != null) {
            C0199s sVar = this;
            dataCenter.mo48227a("aweme_changed", sVar, true).mo48227a("params", sVar, true).mo48227a("init_index", sVar, true);
        }
    }

    public C24032i(View view, C30313ae<C30332aw> aeVar) {
        C52711k.m112240b(view, "view");
        super(view);
        this.f63774H = aeVar;
        Context context = view.getContext();
        if (context != null) {
            this.f63780f = C24037a.m58865a((FragmentActivity) context, this);
            this.f63781g = 3;
            this.f63769C = TimeUnit.DAYS.toSeconds(7);
            this.f63772F = true;
            this.f63784j = -1;
            this.f63773G = new AccelerateDecelerateInterpolator();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
