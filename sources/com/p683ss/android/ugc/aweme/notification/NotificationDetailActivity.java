package com.p683ss.android.ugc.aweme.notification;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.widget.SwipeRefreshLayout;
import android.support.p030v4.widget.SwipeRefreshLayout.C1091b;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23697k;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38041h;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.p683ss.android.ugc.aweme.notification.model.NoticeModel;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38415g;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38267i;
import com.p683ss.android.ugc.aweme.notification.p2011a.C38144x;
import com.p683ss.android.ugc.aweme.notification.p2014d.C38170h;
import com.p683ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.push.C40885b;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.notification.NotificationDetailActivity */
public class NotificationDetailActivity extends AmeSSActivity implements C1091b, C26846a, C26877c<BaseNotice> {

    /* renamed from: c */
    private static final String f96967c = "NotificationDetailActivity";

    /* renamed from: a */
    View f96968a;

    /* renamed from: b */
    public DmtStatusView f96969b;

    /* renamed from: d */
    private boolean f96970d;

    /* renamed from: e */
    private int f96971e;

    /* renamed from: f */
    private int f96972f;

    /* renamed from: g */
    private RecyclerView f96973g;

    /* renamed from: h */
    private SwipeRefreshLayout f96974h;

    /* renamed from: i */
    private C38144x f96975i;

    /* renamed from: j */
    private C38170h f96976j;

    /* renamed from: k */
    private TextTitleBar f96977k;

    /* renamed from: l */
    private String f96978l;

    /* renamed from: m */
    private int f96979m;

    /* renamed from: n */
    private Integer f96980n;

    /* renamed from: o */
    private ImmersionBar f96981o;

    /* renamed from: p */
    private DiggNotice f96982p;

    /* renamed from: q */
    private String f96983q;

    /* renamed from: R_ */
    public final void mo47017R_() {
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<BaseNotice> list, boolean z) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: e */
    public final void mo47031e() {
        this.f96975i.am_();
    }

    public final void ar_() {
        this.f96976j.mo44934a_(Integer.valueOf(4), Integer.valueOf(this.f96972f), this.f96980n);
    }

    public void finish() {
        setResult(-1);
        C40885b.m90457a().onFinish(this);
        super.finish();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f96976j != null) {
            this.f96976j.mo46991S_();
        }
        if (this.f96981o != null) {
            this.f96981o.destroy();
            this.f96981o = null;
        }
    }

    public void setStatusBarColor() {
        super.setStatusBarColor();
        this.f96981o = ImmersionBar.with((Activity) this);
        this.f96981o.statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    public final void aJ_() {
        if (this.f96975i.f70699x) {
            this.f96975i.mo54798c(false);
            this.f96975i.notifyDataSetChanged();
            this.f96975i.an_();
        }
        this.f96974h.setRefreshing(false);
        if (this.f96975i.getItemCount() == 0) {
            this.f96969b.mo19213g();
        }
    }

    public Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        String str = "fans";
        switch (this.f96971e) {
            case 0:
                str = "fans";
                break;
            case 1:
                str = "like";
                break;
            case 2:
                str = "at";
                break;
            case 3:
                str = "comment";
                break;
        }
        return analysis.setLabelName(str);
    }

    public void onRefresh() {
        if (this.f96982p != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f96982p.getUsers().size(); i++) {
                User user = (User) this.f96982p.getUsers().get(i);
                BaseNotice baseNotice = new BaseNotice();
                DiggNotice diggNotice = new DiggNotice(this.f96982p);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(user);
                diggNotice.setUsers(arrayList2);
                diggNotice.setMergeCount(1);
                baseNotice.setDiggNotice(diggNotice);
                arrayList.add(baseNotice);
            }
            this.f96969b.mo19209d();
            this.f96975i.mo50303a(arrayList);
            this.f96975i.notifyDataSetChanged();
        } else if (C38217k.m85388a(this)) {
            if (this.f96975i.getItemCount() == 0) {
                this.f96969b.mo19212f();
            }
            this.f96976j.mo44934a_(Integer.valueOf(1), Integer.valueOf(this.f96972f), this.f96980n);
        } else if (this.f96975i.getItemCount() == 0) {
            C18842a.m45933a(new Runnable() {
                public final void run() {
                    if (NotificationDetailActivity.this.isViewValid()) {
                        NotificationDetailActivity.this.f96969b.mo19214h();
                        C10691a.m21542b((Context) NotificationDetailActivity.this, (int) R.string.cg1).mo19066a();
                    }
                }
            }, 100);
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        this.f96975i.mo54793i();
    }

    /* renamed from: a */
    private void m85164a(boolean z) {
        if (!z) {
            this.f96975i.mo54798c(false);
        } else {
            this.f96975i.ao_();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo78075a(int i) {
        if (i == 0) {
            aJ_();
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (this.f96975i.f70699x) {
            this.f96975i.mo54798c(false);
            this.f96975i.notifyDataSetChanged();
        }
        this.f96974h.setRefreshing(false);
        if (this.f96975i.getItemCount() == 0) {
            this.f96969b.mo19214h();
        }
    }

    @C53771m
    public void onProfileFollowEvent(C24530d dVar) {
        Object obj = dVar.f64952b;
        if (obj != null && (obj instanceof User)) {
            User user = (User) obj;
            int i = dVar.f64951a;
            C38144x xVar = this.f96975i;
            int i2 = 2;
            int i3 = 0;
            if (!(i == 1 || i == 2)) {
                i2 = 0;
            }
            if (xVar.f97142a == 0 || xVar.f97142a == 11) {
                if (xVar.f97142a == 0) {
                    while (i3 < xVar.f70670n.size()) {
                        FollowNotice followNotice = ((BaseNotice) xVar.f70670n.get(i3)).getFollowNotice();
                        if (!(followNotice == null || followNotice.getUser() == null || !TextUtils.equals(followNotice.getUser().getUid(), user.getUid()))) {
                            followNotice.getUser().setFollowStatus(i2);
                            xVar.notifyItemChanged(i3);
                        }
                        i3++;
                    }
                    return;
                }
                while (i3 < xVar.f70670n.size()) {
                    FriendNotice friendNotice = ((BaseNotice) xVar.f70670n.get(i3)).getFriendNotice();
                    if (friendNotice == null || friendNotice.getUser() == null || !TextUtils.equals(friendNotice.getUser().getUid(), user.getUid())) {
                        i3++;
                    } else {
                        friendNotice.getUser().setFollowStatus(i2);
                        xVar.notifyItemChanged(i3);
                        return;
                    }
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int[] iArr;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b25);
        this.f96983q = getIntent().getStringExtra("enter_from");
        if (TextUtils.isEmpty(this.f96983q)) {
            this.f96983q = "message";
        }
        this.f96971e = getIntent().getIntExtra("from_where", -1);
        this.f96979m = getIntent().getIntExtra("unRead_message_count", 0);
        this.f96982p = (DiggNotice) getIntent().getSerializableExtra("digg_notice_data");
        if (this.f96971e < 0) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onCreate", false);
            return;
        }
        if (this.f96971e == 0) {
            this.f96972f = 7;
            this.f96978l = getResources().getString(R.string.b57);
            if (I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getCurrentI18nItem(this).mo70126f().equals("Indonesia")) {
                this.f96978l = "Pengikut terbaru";
            }
        } else if (this.f96971e == 1) {
            this.f96972f = 3;
            this.f96978l = getResources().getString(R.string.ck5);
        } else if (this.f96971e == 2) {
            this.f96972f = 6;
            this.f96978l = getResources().getString(R.string.ck1);
        } else if (this.f96971e == 3) {
            this.f96972f = 44;
            this.f96978l = getResources().getString(R.string.ck2);
        } else if (this.f96971e == 4) {
            this.f96972f = 46;
            this.f96978l = getResources().getString(R.string.bgo);
        } else if (this.f96971e == 7) {
            this.f96972f = 21;
            this.f96978l = getResources().getString(R.string.bea);
        } else if (this.f96971e == 62) {
            this.f96972f = 62;
            this.f96978l = getResources().getString(R.string.gj4);
        } else {
            this.f96972f = 47;
            this.f96978l = getResources().getString(R.string.boo);
        }
        this.f96977k = (TextTitleBar) findViewById(R.id.d10);
        this.f96977k.setTitle((CharSequence) this.f96978l);
        this.f96974h = (SwipeRefreshLayout) findViewById(R.id.bu2);
        this.f96973g = (RecyclerView) findViewById(R.id.btx);
        ((C1440au) this.f96973g.getItemAnimator()).f5184m = false;
        this.f96969b = (DmtStatusView) findViewById(R.id.csv);
        DmtStatusView dmtStatusView = this.f96969b;
        C10719a a = C10719a.m21676a((Context) this).mo19223a();
        MtEmptyView a2 = MtEmptyView.m21697a((Context) this);
        if (this.f96971e == 0) {
            a2.setStatus(new C10723a(this).mo19277a((int) R.drawable.cl_).mo19280b((int) R.string.cjx).mo19282c(R.string.cjw).f28711a);
        } else if (this.f96971e == 1) {
            a2.setStatus(new C10723a(this).mo19277a((int) R.drawable.cla).mo19280b((int) R.string.ckb).mo19282c(R.string.cka).f28711a);
        } else if (this.f96971e == 2) {
            a2.setStatus(new C10723a(this).mo19277a((int) R.drawable.cl8).mo19280b((int) R.string.ckh).mo19282c(R.string.ckg).f28711a);
        } else if (this.f96971e == 3) {
            a2.setStatus(new C10723a(this).mo19277a((int) R.drawable.cl9).mo19280b((int) R.string.cjb).mo19282c(R.string.cja).f28711a);
        } else {
            a2.setStatus(new C10723a(this).mo19280b((int) R.string.bx4).mo19281b("").f28711a);
        }
        dmtStatusView.setBuilder(a.mo19231b((View) a2).mo19226a(R.drawable.dgk, R.string.f5o, R.string.f5k, R.string.f5u, new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                NotificationDetailActivity.this.onRefresh();
            }
        }));
        if (C38415g.m85731c()) {
            C38267i iVar = new C38267i(this, this.f96983q, this.f96972f, this.f96971e, this.f96979m);
            this.f96975i = iVar;
        } else {
            this.f96975i = new C38144x(this.f96971e, this, this.f96979m, this.f96983q);
        }
        this.f96975i.f97144c = new C38216j(this);
        this.f96976j = new C38170h();
        C23697k kVar = new C23697k(1, (int) C9432q.m18687b((Context) this, 1.0f), 0);
        this.f96973g.setLayoutManager(new FixedLinearlayoutManager(this));
        this.f96973g.mo4798a((C1331h) kVar);
        this.f96968a = findViewById(R.id.csm);
        if (VERSION.SDK_INT >= 19) {
            this.f96968a.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        this.f96974h.setOnRefreshListener(this);
        this.f96977k.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                NotificationDetailActivity.this.finish();
            }
        });
        this.f96973g.mo4801a((C1340m) new C32461a(this));
        this.f96976j.mo54799a(new NoticeModel());
        this.f96976j.mo54800a(this);
        this.f96975i.mo54788a((C26846a) this);
        this.f96975i.mo54798c(true);
        this.f96975i.an_();
        this.f96973g.setAdapter(this.f96975i);
        this.f96969b.mo19212f();
        onRefresh();
        int i = this.f96971e;
        if (i == 12) {
            iArr = new int[]{28, 6, 44, 2, 43};
        } else if (i != 22) {
            switch (i) {
                case 0:
                    iArr = new int[]{7};
                    break;
                case 1:
                    iArr = new int[]{3};
                    break;
                case 2:
                    iArr = new int[]{6};
                    break;
                case 3:
                    iArr = new int[]{44, 2, 43};
                    break;
                case 4:
                    iArr = new int[]{46};
                    break;
                case 5:
                    iArr = new int[]{47};
                    break;
                case 6:
                    iArr = new int[]{16};
                    break;
                case 7:
                    iArr = new int[]{21};
                    break;
                default:
                    switch (i) {
                        case 15:
                            iArr = new int[]{29};
                            break;
                        case 16:
                            iArr = new int[]{32};
                            break;
                        case 17:
                            iArr = new int[]{103};
                            break;
                        case 18:
                            iArr = new int[]{45};
                            break;
                        case 19:
                            iArr = new int[]{31};
                            break;
                        case 20:
                            iArr = new int[]{57};
                            break;
                        default:
                            switch (i) {
                                case 63:
                                    iArr = new int[]{63};
                                    break;
                                case UnReadVideoExperiment.RELATION_LIST /*64*/:
                                    iArr = new int[]{64, 3, 6, 44, 2, 43};
                                    break;
                                default:
                                    iArr = new int[0];
                                    break;
                            }
                    }
            }
        } else {
            iArr = new int[]{65};
        }
        C38046d.m85103c(iArr);
        for (int hVar : iArr) {
            C47718bf.m103288a(new C38041h(hVar, 0));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.NotificationDetailActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo47026b(List<BaseNotice> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        m85164a(z);
        this.f96975i.mo50304b(list);
    }

    /* renamed from: a */
    public final void mo47018a(List<BaseNotice> list, boolean z) {
        this.f96975i.mo54798c(true);
        if (this.f96970d) {
            this.f96975i.mo78118g();
        }
        this.f96970d = true;
        m85164a(z);
        this.f96974h.setRefreshing(false);
        this.f96975i.mo50303a(list);
        this.f96969b.mo19209d();
        if (this.f96975i.mo50673a() != null) {
        }
    }

    /* renamed from: a */
    public static void m85162a(Context context, int i, int i2) {
        m85163a(context, i, i2, null);
    }

    /* renamed from: a */
    private static void m85163a(Context context, int i, int i2, String str) {
        Intent intent = new Intent(context, NotificationDetailActivity.class);
        intent.putExtra("from_where", i);
        intent.putExtra("unRead_message_count", i2);
        if (!TextUtils.isEmpty(null)) {
            intent.putExtra("notice_name", null);
        }
        context.startActivity(intent);
    }
}
