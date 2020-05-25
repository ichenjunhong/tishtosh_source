package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Message;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.livedata.C23552a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.C33205o;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.profile.api.BlockApi;
import com.p683ss.android.ugc.aweme.profile.api.RemarkApi;
import com.p683ss.android.ugc.aweme.profile.model.BlockStruct;
import com.p683ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39804h;
import com.p683ss.android.ugc.aweme.profile.util.C40572w;
import com.p683ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.aweme.utils.C47881fd;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileMoreFragment */
public class ProfileMoreFragment extends C23526a implements C9382a {

    /* renamed from: a */
    User f102506a;

    /* renamed from: b */
    RemarkApi f102507b;

    /* renamed from: c */
    FollowViewModel f102508c;

    /* renamed from: d */
    private String f102509d;

    /* renamed from: e */
    private String f102510e;

    /* renamed from: j */
    private String f102511j;

    /* renamed from: k */
    private String f102512k;

    /* renamed from: l */
    private String f102513l;

    /* renamed from: m */
    private int f102514m;
    protected AvatarImageView mAvatarIv;
    protected View mBackBtn;
    protected CommonItemView mBlock;
    protected CommonItemView mRemarkName;
    protected View mRemarkNameUnderline;
    protected CommonItemView mRemoveFollower;
    protected View mRemoveFollowerUnderline;
    protected RemoteImageView mSendMsgImage;
    protected ButtonTitleBar mTitleBar;

    /* renamed from: n */
    private List<Aweme> f102515n;

    /* renamed from: o */
    private C9381g f102516o;
    protected View shareView;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    /* renamed from: a */
    private void m89353a() {
        if (!((Boolean) SharePrefCache.inst().getRemoveFollowerSwitch().mo47782d()).booleanValue() || this.f102506a.getFollowerStatus() != 1) {
            this.mRemoveFollower.setVisibility(8);
        } else {
            this.mRemoveFollower.setVisibility(0);
        }
    }

    /* renamed from: e */
    private void m89354e() {
        if (this.f102514m == 0 || this.f102514m == 4 || !TextUtils.isEmpty(this.f102506a.getEnterpriseVerifyReason())) {
            this.mRemarkName.setVisibility(8);
            this.mRemarkNameUnderline.findViewById(R.id.cb9).setVisibility(8);
        } else if (TextUtils.isEmpty(this.f102506a.getRemarkName())) {
            this.mRemarkName.setRightText(getString(R.string.a3k));
        } else {
            this.mRemarkName.setRightText(this.f102506a.getRemarkName());
        }
    }

    @C53771m
    public void onEvent(C35471h hVar) {
        if (TextUtils.equals("user", hVar.itemType)) {
            C47881fd.m103578a(getActivity(), this.mTitleBar, hVar);
        }
    }

    @C53771m
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (isViewValid()) {
            if ((!C47915gg.m103652b(this.f102506a, false) || followStatus.followStatus != 1) && TextUtils.equals(followStatus.userId, this.f102506a.getUid())) {
                this.f102514m = followStatus.followStatus;
                m89354e();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo82345a(C0013i iVar) throws Exception {
        if (iVar.mo33d() || iVar.mo31c()) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.d_4).mo19066a();
        } else {
            CommitRemarkNameResponse commitRemarkNameResponse = (CommitRemarkNameResponse) iVar.mo34e();
            if (commitRemarkNameResponse.isOK()) {
                this.f102506a.setRemarkName(((CommitRemarkNameResponse) iVar.mo34e()).remarkName);
                C33194e.m76279d().updateIMUser(C33194e.m76261a(this.f102506a));
                this.mRemarkName.setRightText(this.f102506a.getRemarkName());
                C23552a.m57751a().mo48724a("aweme.main.profile.more_page_user_info_change", User.class).postValue(this.f102506a);
            } else if (commitRemarkNameResponse.statusCode == 2550) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.d6k).mo19066a();
            } else {
                C10691a.m21545b((Context) getActivity(), commitRemarkNameResponse.statusMsg).mo19066a();
            }
        }
        return null;
    }

    public void handleMsg(Message message) {
        if (getActivity() != null && !getActivity().isFinishing()) {
            int i = message.what;
            Object obj = message.obj;
            if (i == 31) {
                if (obj instanceof C23459a) {
                    C10691a.m21545b(C11010c.m22280a(), ((C23459a) obj).getErrorMsg()).mo19066a();
                } else if (obj instanceof Exception) {
                    C10691a.m21542b(C11010c.m22280a(), (int) R.string.cfw).mo19066a();
                } else if (obj instanceof BlockStruct) {
                    int i2 = ((BlockStruct) obj).blockStatus;
                    boolean z = true;
                    if (i2 != 1) {
                        z = false;
                    }
                    this.f102506a.setBlock(z);
                    if (z && this.f102514m != 0) {
                        this.f102506a.setFollowStatus(0);
                    }
                    C23552a.m57751a().mo48724a("aweme.main.profile.more_page_user_info_change", User.class).postValue(this.f102506a);
                    this.f102506a.setRemarkName("");
                    if (this.f102514m != 0) {
                        this.f102514m = 0;
                        C47718bf.m103288a(new FollowStatus(this.f102506a.getUid(), this.f102514m));
                    }
                    C47718bf.m103288a(new C39804h(this.f102506a.getUid(), i2));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82347a(BaseResponse baseResponse) throws Exception {
        this.f102506a.setFollowerStatus(0);
        if (this.f102506a.getFollowStatus() == 2) {
            this.f102506a.setFollowStatus(1);
        }
        m89353a();
        C23552a.m57751a().mo48724a("aweme.main.profile.more_page_user_info_change", User.class).postValue(this.f102506a);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ik) {
            if (getActivity() != null) {
                getActivity().onBackPressed();
            }
        } else if (view.getId() == R.id.cb8) {
            if (getActivity() != null) {
                C0679r a = getActivity().getSupportFragmentManager().mo2225a();
                a.mo2174a(R.anim.bm, R.anim.bv, R.anim.bk, R.anim.by);
                a.mo2175a((int) R.id.ajf, (Fragment) MultilineInputFragment.m89216a(R.string.avz, R.string.d6j, R.string.cpt, 20, this.f102506a.getRemarkName(), this.f102506a.getUid(), new Bundle()));
                a.mo2179a((String) null);
                a.mo2189b();
            }
            C26890h.m65011a("click_edit_remarks", C23089d.m56640a().mo47829a("enter_from", "others_homepage").mo47829a("to_user_id", this.f102506a.getUid()).f61491a);
        } else if (view.getId() == R.id.cbk) {
            if (!C20902b.m53242a().isLogin()) {
                C27965f.m66723a((Fragment) this, this.f102509d, "report");
            } else if (this.f102506a != null) {
                String str = "";
                C18085o oVar = new C18085o();
                try {
                    oVar.mo35020a("nickname", this.f102506a.getNickname());
                    oVar.mo35020a("uid", this.f102506a.getUid());
                    str = C47760cd.m103385a(oVar);
                } catch (Exception unused) {
                }
                C27013a.m65227a().report(getActivity(), new Builder().appendQueryParameter("owner_id", this.f102506a.getUid()).appendQueryParameter("object_id", this.f102506a.getUid()).appendQueryParameter("report_type", "user").appendQueryParameter("extra", str));
                C26890h.m65011a("click_report", C23089d.m56640a().mo47829a("enter_from", "others_homepage").mo47829a("to_user_id", this.f102506a.getUid()).f61491a);
            }
        } else if (view.getId() == R.id.l9) {
            if (!C20902b.m53242a().isLogin()) {
                C27965f.m66723a((Fragment) this, this.f102509d, "click_block");
            } else {
                if (this.f102506a != null) {
                    boolean z = false;
                    if (this.f102506a.isBlock()) {
                        BlockApi.m88498a(this.f102516o, this.f102506a.getUid(), this.f102506a.getSecUid(), 0, 0);
                        C33205o.m76296a("others_homepage", this.f102506a.getUid());
                        this.mBlock.setLeftText(getResources().getString(R.string.t7));
                        C26890h.m65011a("click_unblock", C23089d.m56640a().mo47829a("enter_from", "others_homepage").mo47829a("to_user_id", this.f102506a.getUid()).f61491a);
                    } else {
                        C40324dg dgVar = new C40324dg(this, 0);
                        if (this.f102506a.getFollowStatus() == 2) {
                            z = true;
                        }
                        C33194e.m76279d().wrapperSyncXBlockWithDialog(getContext(), z, dgVar);
                        C33205o.m76297a("others_homepage", this.f102506a.getUid(), "");
                        C26890h.m65011a("click_block", C23089d.m56640a().mo47829a("enter_from", "others_homepage").mo47829a("to_user_id", this.f102506a.getUid()).f61491a);
                    }
                }
            }
        } else if (view.getId() == R.id.clb) {
            if (this.f102506a != null) {
                C33205o.m76295a(this.f102506a.getUid());
                C33205o.m76298a(this.f102506a.getUid(), this.f102510e, this.f102509d, this.f102511j, "click_stranger_chat_button");
                C33194e.m76279d().wrapperChatWithSyncXAlert(getActivity(), C33194e.m76261a(this.f102506a), 3, null);
            }
        } else if (view.getId() == R.id.cmg) {
            if (this.f102506a != null) {
                GeneralPermission generalPermission = this.f102506a.getGeneralPermission();
                if (generalPermission == null || TextUtils.isEmpty(generalPermission.getShareProfileToast())) {
                    C40572w.m90009a(getActivity(), this.f102506a, this.f102512k, this.f102515n);
                    C26890h.m65011a("click_share_person", C23089d.m56640a().mo47829a("enter_from", "others_homepage").mo47829a("to_user_id", this.f102506a.getUid()).f61491a);
                    return;
                }
                C10691a.m21545b((Context) getActivity(), generalPermission.getShareProfileToast()).mo19066a();
            }
        } else if (view.getId() == R.id.cba) {
            C26890h.m65011a("click_remove_fans", C23089d.m56640a().mo47829a("enter_from", "others_homepage").f61491a);
            Dialog c = new C10643a(getContext()).mo18885a((int) R.string.d6q).mo18899b((int) R.string.d6p).mo18900b((int) R.string.wf, (OnClickListener) null).mo18886a((int) R.string.d6o, (OnClickListener) new C40323df(this)).mo18897a().mo18883c();
            if (c.findViewById(R.id.dez) instanceof TextView) {
                ((TextView) c.findViewById(R.id.dez)).setTextColor(getResources().getColor(R.color.j7));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0138, code lost:
        if (r3 == false) goto L_0x0140;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            super.onViewCreated(r8, r9)
            com.bytedance.common.utility.b.g r9 = new com.bytedance.common.utility.b.g
            r9.<init>(r7)
            r7.f102516o = r9
            android.os.Bundle r9 = r7.getArguments()
            java.lang.String r0 = "user"
            java.io.Serializable r9 = r9.getSerializable(r0)
            com.ss.android.ugc.aweme.profile.model.User r9 = (com.p683ss.android.ugc.aweme.profile.model.User) r9
            r7.f102506a = r9
            android.os.Bundle r9 = r7.getArguments()
            java.lang.String r0 = "enter_from"
            java.lang.String r9 = r9.getString(r0)
            r7.f102509d = r9
            android.os.Bundle r9 = r7.getArguments()
            java.lang.String r0 = "aweme_id"
            java.lang.String r9 = r9.getString(r0)
            r7.f102510e = r9
            android.os.Bundle r9 = r7.getArguments()
            java.lang.String r0 = "request_id"
            java.lang.String r9 = r9.getString(r0)
            r7.f102511j = r9
            android.os.Bundle r9 = r7.getArguments()
            java.lang.String r0 = "from"
            java.lang.String r9 = r9.getString(r0)
            r7.f102512k = r9
            android.os.Bundle r9 = r7.getArguments()
            java.lang.String r0 = "profile_from"
            java.lang.String r9 = r9.getString(r0)
            r7.f102513l = r9
            android.os.Bundle r9 = r7.getArguments()
            java.lang.String r0 = "follow_status"
            int r9 = r9.getInt(r0)
            r7.f102514m = r9
            android.os.Bundle r9 = r7.getArguments()
            java.lang.String r0 = "aweme_list"
            java.io.Serializable r9 = r9.getSerializable(r0)
            java.util.List r9 = (java.util.List) r9
            r7.f102515n = r9
            com.ss.android.ugc.aweme.profile.model.User r9 = r7.f102506a
            r0 = 8
            if (r9 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.profile.model.User r9 = r7.f102506a
            boolean r9 = r9.isSecret()
            if (r9 == 0) goto L_0x0081
            android.view.View r9 = r7.shareView
            r9.setVisibility(r0)
        L_0x0081:
            com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar r9 = r7.mTitleBar
            r1 = 2132546559(0x7f1c13ff, float:2.074634E38)
            r9.setTitle(r1)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r9 = r7.mAvatarIv
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f102506a
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103657f(r1)
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r9, r1)
            android.support.v4.app.FragmentActivity r9 = r7.getActivity()
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r1 = r7.mAvatarIv
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.f102506a
            r3 = 0
            if (r1 == 0) goto L_0x00e1
            if (r2 != 0) goto L_0x00a2
            goto L_0x00e1
        L_0x00a2:
            java.lang.String r4 = r2.getRemarkName()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r5 = 1
            r6 = 2132541608(0x7f1c00a8, float:2.0736297E38)
            if (r4 != 0) goto L_0x00c4
            android.content.res.Resources r9 = r9.getResources()
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r2 = r2.getRemarkName()
            r4[r3] = r2
            java.lang.String r9 = r9.getString(r6, r4)
            r1.setContentDescription(r9)
            goto L_0x00e1
        L_0x00c4:
            java.lang.String r4 = r2.getNickname()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00e1
            android.content.res.Resources r9 = r9.getResources()
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r2 = r2.getNickname()
            r4[r3] = r2
            java.lang.String r9 = r9.getString(r6, r4)
            r1.setContentDescription(r9)
        L_0x00e1:
            r9 = 2132021280(0x7f141020, float:1.9680947E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f102506a
            java.lang.String r1 = r1.getNickname()
            r9.setText(r1)
            r9 = 2132024396(0x7f141c4c, float:1.9687267E38)
            android.view.View r8 = r8.findViewById(r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r1 = 2132549209(0x7f1c1e59, float:2.0751714E38)
            java.lang.String r1 = r7.getString(r1)
            r9.append(r1)
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f102506a
            java.lang.String r1 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103656e(r1)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.setText(r9)
            r7.m89354e()
            boolean r8 = com.p683ss.android.ugc.aweme.p1807im.C33194e.m76264a()
            if (r8 == 0) goto L_0x013b
            com.ss.android.ugc.aweme.profile.model.User r8 = r7.f102506a
            boolean r8 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103661j(r8)
            if (r8 != 0) goto L_0x0140
            com.ss.android.ugc.aweme.im.service.IIMService r8 = com.p683ss.android.ugc.aweme.p1807im.DefaultIMService.provideIMService_Monster()
            com.ss.android.ugc.aweme.im.service.IIMService r8 = (com.p683ss.android.ugc.aweme.p1807im.service.IIMService) r8
            if (r8 == 0) goto L_0x0138
            boolean r3 = r8.isImReduction()
        L_0x0138:
            if (r3 != 0) goto L_0x013b
            goto L_0x0140
        L_0x013b:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r8 = r7.mSendMsgImage
            r8.setVisibility(r0)
        L_0x0140:
            com.ss.android.ugc.aweme.profile.model.User r8 = r7.f102506a
            boolean r8 = r8.isBlock()
            if (r8 == 0) goto L_0x0158
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r8 = r7.mBlock
            android.content.res.Resources r9 = r7.getResources()
            r0 = 2132551608(0x7f1c27b8, float:2.075658E38)
            java.lang.String r9 = r9.getString(r0)
            r8.setLeftText(r9)
        L_0x0158:
            com.ss.android.ugc.aweme.base.livedata.a r8 = com.p683ss.android.ugc.aweme.base.livedata.C23552a.m57751a()
            java.lang.String r9 = "aweme.main.profile.multi_line_input.remark_name"
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            com.ss.android.ugc.aweme.arch.widgets.base.b r8 = r8.mo48724a(r9, r0)
            com.ss.android.ugc.aweme.profile.ui.de r9 = new com.ss.android.ugc.aweme.profile.ui.de
            r9.<init>(r7)
            r8.observe(r7, r9)
            r7.m89353a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileMoreFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pg, viewGroup, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82346a(int i, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        if (i2 == -2 || i2 != -1) {
            C33205o.m76297a("cancel", this.f102506a.getUid(), "others_homepage");
            return;
        }
        BlockApi.m88498a(this.f102516o, this.f102506a.getUid(), this.f102506a.getSecUid(), 1, i);
        C33205o.m76297a("success", this.f102506a.getUid(), "others_homepage");
        if (TextUtils.equals(this.f102513l, "chat")) {
            C33205o.m76299b(this.f102506a.getUid());
        }
        this.mBlock.setLeftText(getResources().getString(R.string.f69));
    }
}
