package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.profile.edit.C39835a;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.profile.util.C40537b;
import com.p683ss.android.ugc.aweme.profile.util.C40570u;
import com.p683ss.android.ugc.aweme.utils.C47806dd;
import com.p683ss.android.ugc.trill.p2519d.C50316a;
import com.ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment */
public class MusProfileEditFragment extends ProfileEditFragment implements C39985s, C40265bp {

    /* renamed from: a */
    protected boolean f102310a;
    @BindView(2131493688)
    MusAvatarImageView mAvatarVideoImageView;
    @BindView(2131493689)
    ImageView mHeaderImageVideoIcon;
    @BindView(2131494526)
    RelativeLayout mRlAvatarChangeByVideo;

    /* renamed from: r */
    private C39835a f102311r;

    /* renamed from: a */
    public final void mo50432a(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo82250f() {
        return R.layout.bpz;
    }

    /* renamed from: e */
    public final void mo70161e() {
        this.f102421j = true;
        this.f102424m.mo80823a("");
        this.f102419d.mo81853a(this.f102424m.mo80822a());
        C23515d.m57678a((RemoteImageView) this.mAvatarVideoImageView, "", 0, 0);
        this.mHeaderImageVideoIcon.setImageDrawable(getResources().getDrawable(R.drawable.dof));
    }

    /* access modifiers changed from: 0000 */
    @OnClick({2131494526})
    public void editHeaderImageVideo() {
        boolean z;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - C47806dd.f120357a;
        C47806dd.f120357a = currentTimeMillis;
        if (j <= 0 || j >= 650) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            User curUser = C20902b.m53242a().getCurUser();
            if (curUser != null) {
                if (curUser.getAvatarVideoUri() == null) {
                    str = null;
                } else {
                    str = curUser.getAvatarVideoUri().getUri();
                }
                if (TextUtils.isEmpty(str)) {
                    C39835a aVar = this.f102311r;
                    if (aVar.f101826b != null) {
                        ((C40537b) aVar.f101826b).mo82806a();
                    }
                } else {
                    C39835a aVar2 = this.f102311r;
                    MusAvatarImageView musAvatarImageView = this.mAvatarVideoImageView;
                    if (aVar2.f101826b != null) {
                        ((C40537b) aVar2.f101826b).mo82808a((View) musAvatarImageView);
                    }
                }
                C40570u.m90005a("replace_profile_video", "click_video");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        if (((java.lang.String) r1.getAvatarThumb().getUrlList().get(0)).contains(r4) != false) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82251g() {
        /*
            r7 = this;
            super.mo82251g()
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f102423l
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            android.widget.RelativeLayout r0 = r7.mRlAvatarChangeByVideo
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f102423l
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0013
        L_0x0010:
            r5 = 1
            goto L_0x0080
        L_0x0013:
            java.lang.String r4 = "1594805258216454"
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r1.getAvatarThumb()
            if (r5 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r1.getAvatarThumb()
            java.util.List r5 = r5.getUrlList()
            boolean r5 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r5)
            if (r5 == 0) goto L_0x0052
        L_0x0029:
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r1.getAvatarMedium()
            if (r5 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r1.getAvatarMedium()
            java.util.List r5 = r5.getUrlList()
            boolean r5 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r5)
            if (r5 == 0) goto L_0x0052
        L_0x003d:
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r1.getAvatarLarger()
            if (r5 == 0) goto L_0x0054
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r1.getAvatarLarger()
            java.util.List r5 = r5.getUrlList()
            boolean r5 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r5)
            if (r5 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r5 = 0
            goto L_0x0055
        L_0x0054:
            r5 = 1
        L_0x0055:
            if (r5 != 0) goto L_0x0080
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r1.getAvatarThumb()
            if (r6 == 0) goto L_0x0080
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r1.getAvatarThumb()
            java.util.List r6 = r6.getUrlList()
            boolean r6 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r6)
            if (r6 != 0) goto L_0x0080
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getAvatarThumb()
            java.util.List r1 = r1.getUrlList()
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L_0x0080
            goto L_0x0010
        L_0x0080:
            if (r5 != 0) goto L_0x008e
            com.ss.android.ugc.aweme.services.function.FunctionSupportService r1 = com.p683ss.android.ugc.aweme.services.function.FunctionSupportService.INSTANCE
            com.ss.android.ugc.aweme.services.function.IFunctionKey r4 = com.p683ss.android.ugc.aweme.services.function.IFunctionKey.PROFILE_VIDEO_HEAD
            boolean r1 = r1.notSupport(r4)
            if (r1 != 0) goto L_0x008e
            r1 = 1
            goto L_0x008f
        L_0x008e:
            r1 = 0
        L_0x008f:
            if (r1 != 0) goto L_0x0093
            r2 = 8
        L_0x0093:
            r0.setVisibility(r2)
            com.ss.android.ugc.aweme.profile.ui.MusAvatarImageView r0 = r7.mAvatarVideoImageView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00aa
            com.ss.android.ugc.aweme.profile.ui.MusAvatarImageView r0 = r7.mAvatarVideoImageView
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.f102423l
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.getAvatarVideoUri()
            r2 = 0
            com.p683ss.android.ugc.aweme.base.C23515d.m57673a(r0, r1, r2, r3)
        L_0x00aa:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f102423l
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarVideoUri()
            if (r0 == 0) goto L_0x00e0
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f102423l
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarVideoUri()
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L_0x00e0
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f102423l
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarVideoUri()
            java.util.List r0 = r0.getUrlList()
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00cf
            goto L_0x00e0
        L_0x00cf:
            android.widget.ImageView r0 = r7.mHeaderImageVideoIcon
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131954986(0x7f130d2a, float:1.9546487E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setImageDrawable(r1)
            return
        L_0x00e0:
            android.widget.ImageView r0 = r7.mHeaderImageVideoIcon
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131954985(0x7f130d29, float:1.9546485E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setImageDrawable(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.MusProfileEditFragment.mo82251g():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo82248a(View view) {
        super.mo82248a(view);
        this.f102311r = new C39835a();
        this.f102311r.f101827c = this;
        this.f102311r.mo80921a((Activity) getActivity(), (Fragment) this);
        this.mAvatarVideoImageView.mo48984a(true, false);
    }

    /* renamed from: b */
    public final void mo70156b(AvatarUri avatarUri) {
        if (isViewValid() && getActivity() != null) {
            this.f102311r.mo81848e();
            if (this.f102419d == null || avatarUri == null) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cq).mo19066a();
            } else {
                this.f102424m.mo80823a(avatarUri.uri);
            }
        }
    }

    /* renamed from: a */
    public final void mo50430a(AvatarUri avatarUri) {
        if (this.f102419d == null || avatarUri == null || C23715d.m58202a((Collection<T>) avatarUri.urlList) || TextUtils.isEmpty((CharSequence) avatarUri.urlList.get(0))) {
            this.f102420e.mo81848e();
            C10691a.m21542b((Context) getActivity(), (int) R.string.cq).mo19066a();
            return;
        }
        this.f102422k = true;
        this.f102421j = true;
        this.f102420e.mo81848e();
        this.f102424m.f101359d = avatarUri.uri;
        C23515d.m57686b(this.mHeaderImage, (String) avatarUri.urlList.get(0), (int) C9432q.m18687b(getContext(), 84.0f), (int) C9432q.m18687b(getContext(), 84.0f));
    }

    /* renamed from: b */
    public final void mo70157b(Exception exc) {
        mo82323j();
        if (isViewValid() && this.f102311r != null) {
            if ((exc instanceof C23459a) && ((C23459a) exc).getErrorCode() == 20022) {
                C18898c.m46009a(getActivity(), "profile_image_setting", "review_failure");
            }
            C22971a.m56494a(getActivity(), exc, R.string.cq);
            C50316a.m108594a(exc.getMessage(), "avatar");
        }
    }

    /* renamed from: a */
    public final void mo50431a(Exception exc) {
        mo82323j();
        if (isViewValid() && this.f102420e != null) {
            if ((exc instanceof C23459a) && ((C23459a) exc).getErrorCode() == 20022) {
                C18898c.m46009a(getActivity(), "profile_image_setting", "review_failure");
            }
            C22971a.m56494a(getActivity(), exc, R.string.cq);
        }
    }

    /* renamed from: b */
    public final void mo70158b(String str) {
        if (isViewValid() && getActivity() != null) {
            this.f102421j = true;
            this.f102310a = true;
            this.mAvatarVideoImageView.setVisibility(0);
            try {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(str);
                Uri parse = Uri.parse(sb.toString());
                C13771c.m27875c().mo26191b(parse);
                C23515d.m57678a((RemoteImageView) this.mAvatarVideoImageView, parse.toString(), 0, 0);
                this.mHeaderImageVideoIcon.setImageDrawable(getResources().getDrawable(R.drawable.dog));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
        super.mo54359a(user, i);
        this.f102422k = true;
        if (i == 112) {
            this.f102423l.setAvatarVideoUri(user.getAvatarVideoUri());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1000 && i != 1001 && !this.f102311r.mo80923a(i, i2, intent)) {
        }
    }
}
