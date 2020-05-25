package com.p683ss.android.ugc.trill.share;

import android.app.Activity;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1417h.C23540d;
import com.p683ss.android.ugc.aweme.base.widget.CanCancelRadioButton;
import com.p683ss.android.ugc.aweme.base.widget.CanCancelRadioButton.C23737a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.share.C42227o;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42271i;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42273j;
import com.p683ss.android.ugc.aweme.shortvideo.festival.FestivalBlockInsShareViewModel;
import com.p683ss.android.ugc.trill.p2521f.C50323b;
import com.p683ss.android.ugc.trill.share.helo.C50460a;
import com.p683ss.android.ugc.trill.share.helo.p2526a.C50475a;
import com.p683ss.android.ugc.trill.share.helo.p2526a.C50476b;
import com.p683ss.android.ugc.trill.share.helo.p2527b.C50481b;
import com.p683ss.android.ugc.trill.share.helo.p2529d.C50485a;
import com.p683ss.android.ugc.trill.share.helo.p2529d.C50486b;
import com.p683ss.android.ugc.trill.share.p2525a.C50413a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.ss.android.ugc.trill.share.SyncShareView */
public class SyncShareView extends C42227o {

    /* renamed from: b */
    String f126386b = "";

    /* renamed from: c */
    private C10641a f126387c;

    /* renamed from: d */
    private int f126388d = 0;

    /* renamed from: e */
    private Unbinder f126389e;

    /* renamed from: f */
    private boolean f126390f;

    /* renamed from: g */
    private int f126391g;
    CanCancelRadioButton mBtnHelo;
    CanCancelRadioButton mBtnIns;
    CanCancelRadioButton mBtnInsStory;
    CanCancelRadioButton mBtnSave;
    ImageView mBtnTwitter;
    RadioGroup mGroupHelo;
    LinearLayout mLayoutAutoShare;
    RadioGroup mRadioGroup;
    TextView mSyncTitle;

    /* renamed from: a */
    public final void mo86179a(int i, boolean z) {
        if (i == 1) {
            this.mBtnSave.setChecked(z);
            if (z) {
                this.mRadioGroup.check(R.id.p1);
            } else if (this.mRadioGroup.getCheckedRadioButtonId() == R.id.p1) {
                this.mRadioGroup.clearCheck();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo98319a(boolean z, String str) {
        Object tag = getTag();
        if (tag instanceof Map) {
            Map map = (Map) tag;
            C26890h.m65011a(z ? "publish_share_confirm" : "publish_share_cancel", C23089d.m56640a().mo47829a("creation_id", m108694a(map.get("creation_id"))).mo47829a("enter_from", m108694a(map.get("enter_from"))).mo47829a("content_type", m108694a(map.get("content_type"))).mo47829a("shoot_way", m108694a(map.get("shoot_way"))).mo47829a("share_to", str).f61491a);
        }
    }

    /* renamed from: f */
    private static boolean m108700f() {
        C50460a.m108793c();
        return C50460a.m108792a();
    }

    private int getLayoutResId() {
        if (this.f126388d == 0) {
            return R.layout.awn;
        }
        return R.layout.c1;
    }

    /* renamed from: c */
    public final boolean mo98320c() {
        if (this.mBtnHelo == null || !this.mBtnHelo.isChecked()) {
            return false;
        }
        return true;
    }

    private String getUserName() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster.getCurrentUser() == null) {
            return "";
        }
        return baseUserService_Monster.getCurrentUser().getNickname();
    }

    /* renamed from: h */
    private static boolean m108702h() {
        User curUser = C20902b.m53242a().getCurUser();
        if (curUser == null || !curUser.isSecret()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo98321d() {
        if (!this.f126390f) {
            this.f126390f = true;
            AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().cancelSynthetise(getContext());
        }
    }

    /* renamed from: e */
    private void m108699e() {
        if (this.f126391g == 2) {
            C10691a.m21551c(getContext(), getContext().getString(R.string.wd)).mo19066a();
        } else {
            C10691a.m21551c(getContext(), getContext().getString(R.string.cxx)).mo19066a();
        }
    }

    /* renamed from: g */
    private boolean m108701g() {
        if (AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enableSaveUploadVideo()) {
            return true;
        }
        this.mRadioGroup.setVisibility(8);
        C23183v.m56778a().mo47926v().mo47776a(Integer.valueOf(0));
        return false;
    }

    private boolean getTwitterRealStatus() {
        if (!C20902b.m53242a().getCurUser().isHasTwitterToken() || C20902b.m53242a().getCurUser().isTwitterExpire() || !((Boolean) SharePrefCache.inst().getAutoSendTwitter().mo47782d()).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final String mo86180b() {
        ArrayList arrayList = new ArrayList();
        if (mo98320c()) {
            arrayList.add(Integer.valueOf(100));
        }
        if (m108698a(this.mBtnTwitter)) {
            arrayList.add(Integer.valueOf(BaseNotice.HASHTAG));
        }
        int saveUploadType = getSaveUploadType();
        if (saveUploadType != 0) {
            arrayList.add(Integer.valueOf(saveUploadType));
        }
        return C50323b.m108603a(";", arrayList);
    }

    public int getSaveUploadType() {
        int i = 0;
        if (this.mRadioGroup == null) {
            return 0;
        }
        int checkedRadioButtonId = this.mRadioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.p1) {
            i = 1;
        } else if (checkedRadioButtonId == R.id.o2) {
            i = 2;
        } else if (checkedRadioButtonId == R.id.o3) {
            i = 3;
        }
        return i;
    }

    private String getUserAvatarUrl() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster.getCurrentUser() == null || baseUserService_Monster.getCurrentUser().getAvatarMedium() == null || baseUserService_Monster.getCurrentUser().getAvatarMedium().getUrlList() == null || baseUserService_Monster.getCurrentUser().getAvatarMedium().getUrlList().size() == 0) {
            return "";
        }
        return (String) baseUserService_Monster.getCurrentUser().getAvatarMedium().getUrlList().get(0);
    }

    /* renamed from: a */
    public final void mo86175a() {
        if (this.f126389e != null) {
            this.f126389e.unbind();
        }
        C50460a.m108793c().mo98373b().mo98375a();
    }

    public void setSyncShareViewTextColor(int i) {
        this.mSyncTitle.setTextColor(i);
    }

    public void setSyncShareViewTextSize(float f) {
        this.mSyncTitle.setTextSize(f);
    }

    public void setSyncShareViewTitle(String str) {
        this.mSyncTitle.setText(str);
    }

    /* renamed from: a */
    private static String m108694a(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    public void setSaveLocalEnabled(boolean z) {
        int i;
        CanCancelRadioButton canCancelRadioButton = this.mBtnSave;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        canCancelRadioButton.setVisibility(i);
    }

    /* renamed from: a */
    private static boolean m108697a(FragmentActivity fragmentActivity) {
        return ((FestivalBlockInsShareViewModel) C0214z.m440a(fragmentActivity).mo359a(FestivalBlockInsShareViewModel.class)).f110949a;
    }

    public void setSyncIconSize(int i) {
        LayoutParams layoutParams = this.mBtnTwitter.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        LayoutParams layoutParams2 = this.mBtnIns.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = i;
        LayoutParams layoutParams3 = this.mBtnInsStory.getLayoutParams();
        layoutParams3.width = i;
        layoutParams3.height = i;
        LayoutParams layoutParams4 = this.mBtnSave.getLayoutParams();
        layoutParams4.width = i;
        layoutParams4.height = i;
    }

    /* renamed from: a */
    private void m108696a(boolean z) {
        if (z) {
            int checkedRadioButtonId = this.mRadioGroup.getCheckedRadioButtonId();
            this.mBtnIns.setCanChecked(false);
            this.mBtnInsStory.setCanChecked(false);
            if (checkedRadioButtonId == this.mBtnIns.getId() || checkedRadioButtonId == this.mBtnInsStory.getId()) {
                this.mRadioGroup.check(-1);
            }
            return;
        }
        this.mBtnIns.setCanChecked(true);
        this.mBtnInsStory.setCanChecked(true);
    }

    public void onClickHelo(View view) {
        boolean z;
        C50413a aVar = (C50413a) C23540d.m57713a(getContext(), C50413a.class);
        if (this.mBtnHelo == null || !this.mBtnHelo.f63268a) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C50481b.m108818c().mo98380b(mo98320c());
            mo98319a(mo98320c(), "helo");
            return;
        }
        this.mBtnHelo.toggle();
        if (aVar.mo48484b(false)) {
            m108699e();
            return;
        }
        if (!m108700f()) {
            this.f126386b = "helo";
            C50460a.m108793c().mo98373b().mo98377a((Activity) getFragment().getActivity(), new C50485a(getUserName(), getUserAvatarUrl()), new C50475a() {
                /* renamed from: a */
                public final void mo98324a() {
                    SyncShareView.this.mBtnHelo.setCanChecked(true);
                    SyncShareView.this.mBtnHelo.setChecked(true);
                    C50481b.m108818c().mo98380b(SyncShareView.this.mo98320c());
                    C50481b.m108818c().mo98378a(true);
                }

                /* renamed from: a */
                public final void mo98325a(int i, String str, String str2) {
                    SyncShareView.this.mBtnHelo.setCanChecked(false);
                    SyncShareView.this.mBtnHelo.setChecked(false);
                    C50481b.m108818c().mo98380b(SyncShareView.this.mo98320c());
                    C50481b.m108818c().mo98378a(false);
                }
            });
        }
    }

    /* renamed from: a */
    private static boolean m108698a(ImageView imageView) {
        if (imageView == null || imageView.getAlpha() != 1.0f) {
            return false;
        }
        return true;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ph) {
            if (m108698a(this.mBtnTwitter)) {
                m108695a(this.mBtnTwitter, false);
                SharePrefCache.inst().getAutoSendTwitter().mo47776a(Boolean.valueOf(false));
                mo98319a(false, "twitter");
            } else if (((Boolean) SharePrefCache.inst().getIsAwemePrivate().mo47782d()).booleanValue()) {
                m108699e();
            } else if (!C20902b.m53242a().getCurUser().isHasTwitterToken() || C20902b.m53242a().getCurUser().isTwitterExpire()) {
                this.f126387c.mo18882b();
                C26890h.onEvent(MobClick.obtain().setEventName("sync_permission").setLabelName("show"));
            } else {
                m108695a(this.mBtnTwitter, true);
                SharePrefCache.inst().getAutoSendTwitter().mo47776a(Boolean.valueOf(true));
                mo98319a(true, "twitter");
            }
        }
    }

    /* renamed from: a */
    public final void mo86176a(int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f126391g = i;
        SharePrefCache.inst().getIsAwemePrivate().mo47776a(Boolean.valueOf(z));
        ((C50413a) C23540d.m57713a(getContext(), C50413a.class)).mo48483a(z);
        m108696a(z);
        if (C50412a.m108715a()) {
            if (z) {
                this.mBtnHelo.setCanChecked(false);
                if (this.mGroupHelo != null && this.mGroupHelo.getCheckedRadioButtonId() == this.mBtnHelo.getId()) {
                    this.mGroupHelo.check(-1);
                }
            } else {
                this.mBtnHelo.setCanChecked(m108700f());
            }
        }
        if (z) {
            m108695a(this.mBtnTwitter, false);
        } else {
            m108695a(this.mBtnTwitter, getTwitterRealStatus());
        }
    }

    /* renamed from: a */
    static void m108695a(ImageView imageView, boolean z) {
        if (imageView.getId() == R.id.ph) {
            if (z) {
                imageView.setBackgroundResource(R.drawable.ahf);
            } else {
                imageView.setBackgroundResource(R.drawable.aw4);
            }
        }
        if (z) {
            imageView.setAlpha(1.0f);
        } else {
            imageView.setAlpha(0.99f);
        }
    }

    public SyncShareView(Context context, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        super(context);
        View inflate = LayoutInflater.from(context).inflate(getLayoutResId(), this, true);
        this.f126389e = ButterKnife.bind(inflate);
        if (!m108701g()) {
            inflate.setVisibility(8);
            return;
        }
        SharePrefCache inst = SharePrefCache.inst();
        m108695a(this.mBtnTwitter, getTwitterRealStatus());
        SharePrefCache.inst().getAutoSendTwitter().mo47776a(Boolean.valueOf(getTwitterRealStatus()));
        if (((Boolean) inst.getIsAwemePrivate().mo47782d()).booleanValue()) {
            m108695a(this.mBtnTwitter, false);
        }
        if (this.mGroupHelo != null && C50412a.m108715a()) {
            this.mGroupHelo.setVisibility(0);
            C50413a aVar = (C50413a) C23540d.m57713a(getContext(), C50413a.class);
            boolean b = C50481b.m108818c().mo98381b();
            final boolean z5 = !aVar.mo48484b(false);
            CanCancelRadioButton canCancelRadioButton = this.mBtnHelo;
            if (!z5 || !m108700f()) {
                z3 = false;
            } else {
                z3 = true;
            }
            canCancelRadioButton.setCanChecked(z3);
            CanCancelRadioButton canCancelRadioButton2 = this.mBtnHelo;
            if (!z5 || !m108700f() || !b) {
                z4 = false;
            } else {
                z4 = true;
            }
            canCancelRadioButton2.setChecked(z4);
            C50460a.m108793c().mo98372a(new C50476b() {
                /* renamed from: a */
                public final void mo98326a(boolean z, boolean z2) {
                    boolean z3;
                    boolean z4;
                    CanCancelRadioButton canCancelRadioButton = SyncShareView.this.mBtnHelo;
                    boolean z5 = true;
                    if (!z5 || !z || !z2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    canCancelRadioButton.setCanChecked(z3);
                    CanCancelRadioButton canCancelRadioButton2 = SyncShareView.this.mBtnHelo;
                    if (!z5 || !z || !z2 || !SyncShareView.this.mBtnHelo.isChecked()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    canCancelRadioButton2.setChecked(z4);
                    C50481b.m108818c().mo98380b(SyncShareView.this.mo98320c());
                    C50481b c = C50481b.m108818c();
                    if (!z || !z2) {
                        z5 = false;
                    }
                    c.mo98378a(z5);
                }
            });
        }
        C10643a aVar2 = new C10643a(getContext());
        if (C20902b.m53242a().getCurUser().isHasTwitterToken()) {
            aVar2.mo18902b(getContext().getString(R.string.bd9, new Object[]{"Twitter"}));
        } else {
            aVar2.mo18902b(getContext().getString(R.string.bd8, new Object[]{"Twitter", "Twitter"}));
        }
        aVar2.mo18893a(getContext().getString(R.string.bd6), (OnClickListener) new C50443c(this));
        aVar2.mo18903b(getContext().getString(R.string.bd7), C50444d.f126494a);
        this.f126387c = aVar2.mo18897a();
        if (C50412a.m108715a()) {
            C50460a.m108793c().mo98370a(getContext(), new C50486b(TutorialVideoApiManager.f96873a, "https://open-api.tiktok.com"));
        }
        if (m108701g()) {
            if (!new C42271i().mo86141a(getContext()) || !AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enableUploadSyncIns() || m108702h() || !AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enableInstagramSilentShare() || m108697a((FragmentActivity) getContext())) {
                this.mBtnIns.setVisibility(8);
                z = false;
            } else {
                z = true;
            }
            if (!new C42273j().mo86141a(getContext()) || !AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enableUploadSyncInsStory() || m108702h() || !AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enableInstagramSilentShare() || m108697a((FragmentActivity) getContext())) {
                this.mBtnInsStory.setVisibility(8);
                z2 = false;
            } else {
                z2 = true;
            }
            if (!AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enableUploadSyncTwitter() || m108702h()) {
                this.mBtnTwitter.setVisibility(8);
            }
            switch (((Integer) C23183v.m56778a().mo47926v().mo47782d()).intValue()) {
                case 1:
                    this.mBtnSave.setChecked(true);
                    break;
                case 2:
                    if (z) {
                        this.mBtnIns.setChecked(true);
                        break;
                    } else {
                        C23183v.m56778a().mo47926v().mo47776a(Integer.valueOf(0));
                        break;
                    }
                case 3:
                    if (z2) {
                        this.mBtnInsStory.setChecked(true);
                        break;
                    } else {
                        C23183v.m56778a().mo47926v().mo47776a(Integer.valueOf(0));
                        break;
                    }
                default:
                    this.mRadioGroup.clearCheck();
                    break;
            }
            if (((Boolean) SharePrefCache.inst().getIsAwemePrivate().mo47782d()).booleanValue()) {
                m108696a(true);
            }
        }
        this.mBtnIns.setOnClickListener(new C50453e(this));
        this.mBtnInsStory.setOnClickListener(new C50454f(this));
        this.mBtnSave.setOnClickListener(new C50455g(this));
        this.mRadioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.p1) {
                    C23183v.m56778a().mo47926v().mo47776a(Integer.valueOf(1));
                    SyncShareView.this.mo98321d();
                } else if (i == R.id.o2) {
                    C23183v.m56778a().mo47926v().mo47776a(Integer.valueOf(2));
                    SyncShareView.this.mo98321d();
                } else if (i == R.id.o3) {
                    C23183v.m56778a().mo47926v().mo47776a(Integer.valueOf(3));
                    SyncShareView.this.mo98321d();
                } else {
                    C23183v.m56778a().mo47926v().mo47776a(Integer.valueOf(0));
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo86178a(int i, C23737a aVar) {
        if (i == 1) {
            this.mBtnSave.f63269b.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo86177a(int i, int i2, Intent intent) {
        if (TextUtils.equals("helo", this.f126386b)) {
            C50460a.m108793c().mo98373b().mo98376a(i, i2, intent);
        }
    }
}
