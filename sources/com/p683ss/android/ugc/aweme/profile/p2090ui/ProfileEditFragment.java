package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.lobby.auth.C12316a;
import com.bytedance.lobby.auth.C12318c;
import com.bytedance.lobby.auth.C12318c.C12320a;
import com.bytedance.lobby.internal.C12343c;
import com.bytedance.lobby.internal.C12347d;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1411c.C23485d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39045e;
import com.p683ss.android.ugc.aweme.profile.C39718ad;
import com.p683ss.android.ugc.aweme.profile.edit.C39842b;
import com.p683ss.android.ugc.aweme.profile.edit.C39843c;
import com.p683ss.android.ugc.aweme.profile.edit.C39844d;
import com.p683ss.android.ugc.aweme.profile.edit.C39852h;
import com.p683ss.android.ugc.aweme.profile.edit.C39858l;
import com.p683ss.android.ugc.aweme.profile.edit.C39858l.C39860b;
import com.p683ss.android.ugc.aweme.profile.edit.C39858l.C39862d;
import com.p683ss.android.ugc.aweme.profile.edit.C39858l.C39865e;
import com.p683ss.android.ugc.aweme.profile.edit.C39858l.C39866f;
import com.p683ss.android.ugc.aweme.profile.edit.InstagramPresenter;
import com.p683ss.android.ugc.aweme.profile.edit.api.C39839a;
import com.p683ss.android.ugc.aweme.profile.edit.api.C39839a.C39841a;
import com.p683ss.android.ugc.aweme.profile.edit.api.TwitterApi;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39800d;
import com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileEditBioUrlFragment.C40131a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39948a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.profile.service.C40008a;
import com.p683ss.android.ugc.aweme.profile.service.C40010c;
import com.p683ss.android.ugc.aweme.profile.settings.ThirdPartyBindingSettings;
import com.p683ss.android.ugc.aweme.profile.util.C40570u;
import com.p683ss.android.ugc.aweme.setting.verification.C41904b;
import com.p683ss.android.ugc.aweme.setting.verification.C41905c;
import com.p683ss.android.ugc.aweme.setting.verification.C41905c.C41906a;
import com.p683ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47763cg;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import com.p683ss.android.ugc.trill.p2519d.C50316a;
import com.ss.android.ugc.trill.R;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import leakcanary.internal.LeakCanaryFileProvider;
import org.greenrobot.eventbus.C53771m;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment */
public class ProfileEditFragment extends C40391s implements C39842b, C39843c, C39844d {

    /* renamed from: a */
    private static final boolean f102416a = false;
    @BindView(2131493827)
    protected CommonItemView authInstagramName;
    @BindView(2131495202)
    protected CommonItemView authTwitterName;
    @BindView(2131495373)
    protected CommonItemView authYoutubeName;

    /* renamed from: b */
    protected ButtonTitleBar f102417b;

    /* renamed from: c */
    View f102418c;

    /* renamed from: d */
    protected C39954ad f102419d;

    /* renamed from: e */
    protected C39948a f102420e;

    /* renamed from: j */
    protected boolean f102421j;

    /* renamed from: k */
    protected boolean f102422k;

    /* renamed from: l */
    protected User f102423l;

    /* renamed from: m */
    protected C39718ad f102424m;
    @BindView(2131493088)
    protected CommonItemView mBioLayout;
    @BindView(2131494826)
    protected DmtStatusView mDmtStatusView;
    @BindView(2131493687)
    protected AnimatedImageView mHeaderImage;
    @BindView(2131493839)
    protected LinearLayout mHintArea;
    @BindView(2131494144)
    protected CommonItemView mMailLayout;
    @BindView(2131494250)
    protected CommonItemView mNickNameLayout;
    @BindView(2131495273)
    protected CommonItemView mUsernameLayout;
    @BindView(2131495337)
    protected CommonItemView mWebsiteLayout;

    /* renamed from: n */
    protected boolean f102425n;

    /* renamed from: o */
    protected InstagramPresenter f102426o;

    /* renamed from: p */
    protected C39852h f102427p;
    @BindView(2131494315)
    protected DmtTextView personalLink;
    @BindView(2131494094)
    protected LinearLayout personalLinkArea;

    /* renamed from: q */
    User f102428q;

    /* renamed from: r */
    private C39858l f102429r;

    /* renamed from: s */
    private C41905c f102430s;

    /* renamed from: t */
    private int f102431t;

    /* renamed from: u */
    private String f102432u = "";

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo82250f() {
        return R.layout.bp6;
    }

    /* renamed from: a */
    public void mo50432a(String str) {
        this.f102422k = true;
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        Uri parse = Uri.parse(sb.toString());
        C13771c.m27875c().mo26191b(parse);
        C23515d.m57686b(this.mHeaderImage, parse.toString(), (int) C9432q.m18687b(getContext(), 84.0f), (int) C9432q.m18687b(getContext(), 84.0f));
    }

    /* renamed from: a */
    public final void mo54360a(final Exception exc, final int i) {
        if (isViewValid() && this.f102419d != null && this.f102420e != null) {
            if (C23794bh.m58389c().mo50264a(exc)) {
                C23794bh.m58389c().mo50263a(getChildFragmentManager(), (C23459a) exc, new C24493b() {
                    /* renamed from: b */
                    public final void mo45354b() {
                        ProfileEditFragment.this.mo82308b(exc, i);
                    }

                    /* renamed from: a */
                    public final void mo45353a() {
                        if (ProfileEditFragment.this.f102424m != null && ProfileEditFragment.this.f102419d != null) {
                            ProfileEditFragment.this.mDmtStatusView.mo19212f();
                        }
                    }
                });
            } else {
                mo82308b(exc, i);
                C50316a.m108594a(exc.getMessage(), "user");
            }
            this.mDmtStatusView.setVisibility(8);
            this.f102420e.mo81848e();
        }
    }

    /* renamed from: a */
    public final void mo54362a(boolean z) {
        if (z) {
            C10691a.m21534a(C11010c.m22280a(), (int) R.string.fbt, 1).mo19066a();
            C47718bf.m103288a(new C23485d());
        }
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
        if (isViewValid()) {
            this.mDmtStatusView.setVisibility(8);
            if (!TextUtils.isEmpty(str)) {
                C10691a.m21545b(C11010c.m22280a(), str).mo19066a();
                if (z && getActivity() != null) {
                    getActivity().finish();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo82304a(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r10.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x0074
            android.support.v4.app.FragmentActivity r0 = r9.getActivity()
            android.view.View r0 = r0.getCurrentFocus()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0053
            boolean r4 = r0 instanceof android.widget.EditText
            if (r4 == 0) goto L_0x0053
            int[] r4 = new int[r2]
            r4 = {0, 0} // fill-array
            r0.getLocationInWindow(r4)
            r5 = r4[r1]
            r4 = r4[r3]
            int r6 = r0.getHeight()
            int r6 = r6 + r4
            int r7 = r0.getWidth()
            int r7 = r7 + r5
            float r8 = r10.getX()
            float r5 = (float) r5
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0051
            float r5 = r10.getX()
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0051
            float r5 = r10.getY()
            float r4 = (float) r4
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0051
            float r10 = r10.getY()
            float r4 = (float) r6
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 < 0) goto L_0x0053
        L_0x0051:
            r10 = 1
            goto L_0x0054
        L_0x0053:
            r10 = 0
        L_0x0054:
            if (r10 == 0) goto L_0x0074
            android.support.v4.app.FragmentActivity r10 = r9.getActivity()
            java.lang.String r4 = "input_method"
            java.lang.Object r10 = r10.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r10 = (android.view.inputmethod.InputMethodManager) r10
            if (r10 == 0) goto L_0x0070
            android.os.IBinder r0 = r0.getWindowToken()
            boolean r10 = r10.hideSoftInputFromWindow(r0, r2)
            if (r10 == 0) goto L_0x0070
            r10 = 1
            goto L_0x0071
        L_0x0070:
            r10 = 0
        L_0x0071:
            if (r10 == 0) goto L_0x0074
            return r3
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileEditFragment.mo82304a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo80948a(boolean z, String str) {
        C47957v.m103768a((Runnable) new C40313cy(this, str));
    }

    /* renamed from: e */
    private void mo70161e() {
        this.mDmtStatusView.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo82305b() {
        mo82307b((View) null);
    }

    public void onDestroy() {
        super.onDestroy();
        C47718bf.m103291d(this);
        if (this.f102430s != null) {
            this.f102430s.mo85818a();
        }
    }

    public void onResume() {
        super.onResume();
        C47718bf.m103288a(new C39800d(1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo82323j() {
        if (this.mDmtStatusView != null) {
            this.mDmtStatusView.setVisibility(8);
        }
        if (this.f102420e != null) {
            this.f102420e.mo81848e();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f102420e != null) {
            this.f102420e.mo81848e();
        }
        if (this.f102420e != null) {
            this.f102420e.f101827c = null;
        }
        if (this.f102419d != null) {
            this.f102419d.mo81850a((C39985s) null);
        }
        this.mDmtStatusView.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo80946a() {
        if (getContext() != null) {
            this.mDmtStatusView.setVisibility(8);
            C10691a.m21545b(getContext(), getString(R.string.f77)).mo19066a();
        }
    }

    /* renamed from: h */
    public final void mo82319h() {
        if (this.mNickNameLayout != null && this.mNickNameLayout.getTextRight() != null) {
            C40570u.m90005a("enter_profile_name", "click_name");
            ProfileEditContentFragment a = ProfileEditContentFragment.m89280a(getString(R.string.avk), this.mNickNameLayout.getTextRight().toString(), true, "", 20, false);
            a.setUserVisibleHint(true);
            a.mo82290a(new C40305cq(this));
            a.show(getActivity().getSupportFragmentManager(), "EditWebsiteDialog");
        }
    }

    /* renamed from: i */
    public final void mo82321i() {
        boolean z;
        String str;
        int abs = Math.abs((int) ((new Date().getTime() - new Date(this.f102423l.getHandleModified() * 1000).getTime()) / FbUploadTokenTime.group0));
        if (this.f102431t == 0) {
            C40570u.m90005a("enter_profile_username", "click_username");
        }
        if (abs > 30) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = getString(R.string.gb5);
        } else {
            str = getString(R.string.hus);
        }
        if (this.mUsernameLayout != null) {
            String str2 = "";
            if (!m89298q(this.f102432u)) {
                str2 = this.f102432u;
            }
            String str3 = "edit_profile_page";
            if (this.f102431t == 1) {
                str3 = "personal_homepage";
            } else if (this.f102431t == 2) {
                str3 = "modify_username_notify";
            } else if (this.f102431t == 3) {
                str3 = "tiktok_message";
            } else if (this.f102431t == 4) {
                str3 = "comment";
            }
            String string = getString(R.string.avr);
            C52711k.m112240b(string, "contentName");
            C52711k.m112240b(str2, "contentValue");
            C52711k.m112240b(str, "editHint");
            C52711k.m112240b(str3, "enterFrom");
            ProfileEditUsernameFragment profileEditUsernameFragment = new ProfileEditUsernameFragment();
            Bundle bundle = new Bundle();
            bundle.putString("content_name", string);
            bundle.putString("content_value", str2);
            bundle.putString("enter_from", str3);
            bundle.putBoolean("is_edit_enabled", z);
            bundle.putString("edit_hint", str);
            bundle.putInt("content_max_length", 24);
            bundle.putBoolean("is_enable_null", false);
            profileEditUsernameFragment.setArguments(bundle);
            profileEditUsernameFragment.setUserVisibleHint(true);
            C40306cr crVar = new C40306cr(this);
            C52711k.m112240b(crVar, "listener");
            profileEditUsernameFragment.f102478c = crVar;
            profileEditUsernameFragment.show(getActivity().getSupportFragmentManager(), "EditUserNameDialog");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo82251g() {
        this.f102424m = new C39718ad();
        this.f102428q = new User();
        this.f102423l = C20902b.m53242a().getCurUser();
        if (this.f102423l != null) {
            this.mNickNameLayout.setRightText(this.f102423l.getNickname());
            m89296o(C47915gg.m103656e(this.f102423l));
            m89294m(this.f102423l.getSignature());
            m89293l(this.f102423l.getBioUrl());
            mo70158b(this.f102423l.getBioEmail());
            if (Math.abs((int) ((new Date().getTime() - new Date(this.f102423l.getHandleModified() * 1000).getTime()) / FbUploadTokenTime.group0)) >= 30 && this.f102431t != 0) {
                C0013i.m12a(500).mo20a((C0011g<TResult, TContinuationResult>) new C40304cp<TResult,TContinuationResult>(this), C0013i.f25b);
            }
            this.f102428q.setSignature(this.f102423l.getSignature());
            this.f102424m.f101361f = this.f102423l.isBindedWeibo();
            C23515d.m57669a((RemoteImageView) this.mHeaderImage, this.f102423l.getAvatarMedium());
            this.f102421j = false;
            if (!TextUtils.isEmpty(this.f102423l.getInsId())) {
                this.authInstagramName.setRightText(this.f102423l.getInsId());
                this.authInstagramName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.v4));
            }
            if (!TextUtils.isEmpty(this.f102423l.getYoutubeChannelTitle())) {
                this.authYoutubeName.setRightText(this.f102423l.getYoutubeChannelTitle());
                this.authYoutubeName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.v4));
            } else if (!TextUtils.isEmpty(this.f102423l.getGoogleAccount())) {
                this.authYoutubeName.setRightText(this.f102423l.getGoogleAccount());
                this.authYoutubeName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.v4));
            }
            if (!TextUtils.isEmpty(this.f102423l.getTwitterName())) {
                this.authTwitterName.setRightText(this.f102423l.getTwitterName());
                this.authTwitterName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.v4));
            }
            User user = this.f102423l;
            boolean twitter = ThirdPartyBindingSettings.readSettings().getTwitter();
            boolean ins = ThirdPartyBindingSettings.readSettings().getIns();
            boolean youtube = ThirdPartyBindingSettings.readSettings().getYoutube();
            if (twitter || !TextUtils.isEmpty(user.getTwitterName())) {
                this.authTwitterName.setVisibility(0);
            } else {
                this.authTwitterName.setVisibility(8);
            }
            if (ins || !TextUtils.isEmpty(user.getInsId())) {
                this.authInstagramName.setVisibility(0);
            } else {
                this.authInstagramName.setVisibility(8);
            }
            if (youtube || !TextUtils.isEmpty(user.getYoutubeChannelTitle())) {
                this.authYoutubeName.setVisibility(0);
            } else {
                this.authYoutubeName.setVisibility(8);
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo82251g();
    }

    /* renamed from: p */
    private static String m89297p(String str) {
        StringBuilder sb = new StringBuilder("tiktok.com/@");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: r */
    private static boolean m89299r(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo82302a(C0013i iVar) throws Exception {
        if (this.mNickNameLayout != null) {
            editUserName(this.mNickNameLayout);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo82307b(View view) {
        if (isViewValid()) {
            getActivity().finish();
        }
    }

    /* renamed from: e */
    public final void mo80949e(final String str) {
        C47957v.m103768a((Runnable) new Runnable() {
            public final void run() {
                if (ProfileEditFragment.this.getContext() != null) {
                    if (TextUtils.isEmpty(str)) {
                        ProfileEditFragment.this.authYoutubeName.setRightText(ProfileEditFragment.this.getContext().getString(R.string.avu));
                        ProfileEditFragment.this.authYoutubeName.getTvwRight().setTextColor(ProfileEditFragment.this.getContext().getResources().getColor(R.color.a1b));
                    } else {
                        ProfileEditFragment.this.authYoutubeName.setRightText(str);
                        ProfileEditFragment.this.authYoutubeName.getTvwRight().setTextColor(ProfileEditFragment.this.getContext().getResources().getColor(R.color.v4));
                    }
                    ProfileEditFragment.this.mDmtStatusView.setVisibility(8);
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ boolean mo82324j(String str) {
        this.f102425n = true;
        this.f102428q.setBioUrl(str);
        m89293l(str);
        return true;
    }

    /* renamed from: b */
    private void mo70158b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mMailLayout.setRightText(str);
        } else {
            this.mMailLayout.setRightText(getString(R.string.avc));
        }
    }

    /* renamed from: l */
    private void m89293l(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mWebsiteLayout.setRightText(str);
        } else {
            this.mWebsiteLayout.setRightText(getString(R.string.avs));
        }
    }

    /* renamed from: m */
    private void m89294m(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mBioLayout.setRightText(str);
        } else {
            this.mBioLayout.setRightText(getString(R.string.av9));
        }
    }

    /* renamed from: n */
    private static String m89295n(String str) {
        while (str.contains("\n\n")) {
            str = str.replaceAll("\n\n", "\n");
        }
        return str;
    }

    /* renamed from: o */
    private void m89296o(String str) {
        this.f102432u = str;
        this.mUsernameLayout.setRightText(this.f102432u);
        this.personalLink.setText(m89297p(this.f102432u));
        m89291b(m89298q(this.f102432u));
    }

    /* renamed from: q */
    private boolean m89298q(String str) {
        if (!str.matches("[0-9A-Za-z_.]*") || m89299r(str)) {
            return true;
        }
        return false;
    }

    @OnClick({2131494250})
    public void editNickName(View view) {
        if (!C32800a.m75679a(view) && isViewValid()) {
            this.f102430s.mo85819a(this.f102423l, new C41904b() {
                /* renamed from: a */
                public final void mo82330a(VerificationResponse verificationResponse) {
                    String str;
                    String str2;
                    if (verificationResponse.isEmpty()) {
                        ProfileEditFragment.this.mo82319h();
                    } else if (verificationResponse.isCerting() || verificationResponse.isCertedAgain()) {
                        C10691a.m21546b(C11010c.m22280a(), ProfileEditFragment.this.getString(R.string.d7t), 1).mo19066a();
                    } else {
                        if (verificationResponse.isCerted()) {
                            if (C41906a.m91854f()) {
                                str = ProfileEditFragment.this.getString(R.string.d7o);
                                str2 = ProfileEditFragment.this.getString(R.string.d7n);
                            } else {
                                str = null;
                                str2 = null;
                            }
                            if (str == null || str2 == null) {
                                ProfileEditFragment.this.mo82319h();
                                return;
                            }
                            new C10643a(ProfileEditFragment.this.getActivity()).mo18902b(str2).mo18892a(str).mo18886a((int) R.string.d7r, (OnClickListener) new C40316da(this)).mo18900b((int) R.string.wf, (OnClickListener) null).mo18897a().mo18882b();
                        } else if (verificationResponse.isUpdating()) {
                            C10691a.m21546b(C11010c.m22280a(), ProfileEditFragment.this.getString(R.string.d7u), 1).mo19066a();
                        }
                    }
                }
            });
        }
    }

    @OnClick({2131495273, 2131495239})
    public void editUserName(View view) {
        if (!C32800a.m75679a(view) && isViewValid()) {
            this.f102430s.mo85819a(this.f102423l, new C41904b() {
                /* renamed from: a */
                public final void mo82330a(VerificationResponse verificationResponse) {
                    String str;
                    String str2;
                    if (verificationResponse.isEmpty()) {
                        ProfileEditFragment.this.mo82321i();
                    } else if (verificationResponse.isCerting() || verificationResponse.isCertedAgain()) {
                        C10691a.m21546b(C11010c.m22280a(), ProfileEditFragment.this.getString(R.string.d7t), 1).mo19066a();
                    } else {
                        if (verificationResponse.isCerted()) {
                            if (C41906a.m91853e()) {
                                str = ProfileEditFragment.this.getString(R.string.d7m);
                                str2 = ProfileEditFragment.this.getString(R.string.d7l);
                            } else {
                                str = null;
                                str2 = null;
                            }
                            if (str == null || str2 == null) {
                                ProfileEditFragment.this.mo82321i();
                                return;
                            }
                            new C10643a(ProfileEditFragment.this.getActivity()).mo18902b(str2).mo18892a(str).mo18886a((int) R.string.d7r, (OnClickListener) new C40314cz(this)).mo18900b((int) R.string.wf, (OnClickListener) null).mo18897a().mo18882b();
                        } else if (verificationResponse.isUpdating()) {
                            C10691a.m21546b(C11010c.m22280a(), ProfileEditFragment.this.getString(R.string.d7u), 1).mo19066a();
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo82318g(String str) {
        if (isViewValid()) {
            this.mDmtStatusView.setVisibility(8);
            C10691a.m21552c(getContext(), str, 1).mo19066a();
        }
    }

    @OnClick({2131493687})
    public void editHeaderImage(View view) {
        if (isViewValid()) {
            C40570u.m90005a("replace_profile_photo", "click_head");
            this.f102420e.mo81844a(0, getActivity(), this.mHeaderImage, C20902b.m53242a().getCurUser());
        }
    }

    @C53771m
    public void onEvent(C39045e eVar) {
        switch (eVar.f99538a) {
            case 1:
            case 2:
                PoiStruct poiStruct = eVar.f99539b;
                if (poiStruct != null) {
                    String poiId = poiStruct.getPoiId();
                    if (TextUtils.equals(poiId, "-1")) {
                        this.f102424m.f101364i = 2;
                    } else {
                        this.f102424m.f101364i = 1;
                    }
                    this.f102424m.f101363h = poiId;
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m89291b(boolean z) {
        if (z) {
            this.mHintArea.setVisibility(0);
            this.personalLinkArea.setVisibility(8);
            this.mUsernameLayout.getTvwRight().setTextSize(0.0f);
            this.mUsernameLayout.getTvwRight().setCompoundDrawablesWithIntrinsicBounds(R.drawable.dpp, 0, 0, 0);
            return;
        }
        this.mHintArea.setVisibility(8);
        this.personalLinkArea.setVisibility(0);
        this.mUsernameLayout.getTvwRight().setTextSize(1, 15.0f);
        this.mUsernameLayout.getTvwRight().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    /* renamed from: c */
    public final void mo80945c(String str) {
        if (getContext() != null) {
            if (TextUtils.isEmpty(str)) {
                this.authInstagramName.setRightText(getContext().getString(R.string.avb));
                this.authInstagramName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.a1b));
            } else {
                this.authInstagramName.setRightText(str);
                this.authInstagramName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.v4));
            }
            this.mDmtStatusView.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final void mo80947d(String str) {
        if (getContext() != null) {
            if (TextUtils.isEmpty(str)) {
                this.authTwitterName.setRightText(getContext().getString(R.string.avn));
                this.authTwitterName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.a1b));
            } else {
                this.authTwitterName.setRightText(str);
                this.authTwitterName.getTvwRight().setTextColor(getContext().getResources().getColor(R.color.v4));
            }
            this.mDmtStatusView.setVisibility(8);
        }
    }

    @OnClick({2131494094})
    public void edit(View view) {
        Context context = getContext();
        if (context != null) {
            String p = m89297p(this.f102432u);
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            ClipData newPlainText = ClipData.newPlainText(p, p);
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(newPlainText);
                C10691a.m21551c(context, getResources().getString(R.string.gau)).mo19066a();
                C26890h.m65011a("copy_link", C23089d.m56640a().mo47829a("enter_from", "edit_profile_page").mo47829a("link_type", "personal_link").f61491a);
            }
        }
    }

    @OnClick({2131493088})
    public void editBio(View view) {
        if (!C32800a.m75679a(view) && isViewValid()) {
            String charSequence = this.mBioLayout.getTextRight().toString();
            if (charSequence.equals(getString(R.string.av9))) {
                charSequence = "";
            }
            C40570u.m90005a("enter_profile_bio", "click_bio");
            String string = getString(R.string.av_);
            C52711k.m112240b(string, "contentName");
            C52711k.m112240b(charSequence, "contentValue");
            ProfileEditBioFragment profileEditBioFragment = new ProfileEditBioFragment();
            Bundle bundle = new Bundle();
            bundle.putString("content_name", string);
            bundle.putString("content_value", charSequence);
            profileEditBioFragment.setArguments(bundle);
            profileEditBioFragment.setUserVisibleHint(true);
            C40307cs csVar = new C40307cs(this);
            C52711k.m112240b(csVar, "listener");
            profileEditBioFragment.f102369c = csVar;
            profileEditBioFragment.show(getActivity().getSupportFragmentManager(), "EditNicknameDialog");
        }
    }

    @OnClick({2131494144})
    public void editMail(View view) {
        if (!C32800a.m75679a(view) && isViewValid()) {
            String charSequence = this.mMailLayout.getTextRight().toString();
            if (charSequence.equals(getString(R.string.avc))) {
                charSequence = "";
            }
            String str = charSequence;
            C40570u.m90005a("enter_profile_mail", "click_mail");
            ProfileEditContentFragment a = ProfileEditContentFragment.m89280a(getString(R.string.avd), str, true, "", 0, true);
            a.setUserVisibleHint(true);
            a.mo82290a(new C40309cu(this));
            a.mo82569a(this);
            a.show(getActivity().getSupportFragmentManager(), "EditMailDialog");
        }
    }

    @OnClick({2131495337})
    public void editWebsite(View view) {
        if (!C32800a.m75679a(view) && isViewValid()) {
            String charSequence = this.mWebsiteLayout.getTextRight().toString();
            if (charSequence.equals(getString(R.string.avs))) {
                charSequence = "";
            }
            C40570u.m90005a("enter_profile_website", "click_website");
            ProfileEditBioUrlFragment a = C40131a.m89278a(charSequence, true, "", 0, true);
            a.setUserVisibleHint(true);
            a.mo82569a(this);
            C40308ct ctVar = new C40308ct(this);
            C52711k.m112240b(ctVar, "listener");
            a.f102386f = ctVar;
            a.show(getActivity().getSupportFragmentManager(), "EditWebsiteDialog");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo82317f(String str) {
        if (TextUtils.isEmpty(str)) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.cgq).mo19066a();
            this.mDmtStatusView.setVisibility(8);
            return false;
        } else if (TextUtils.isEmpty(str.trim())) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.cgs).mo19066a();
            this.mDmtStatusView.setVisibility(8);
            return false;
        } else if (!TextUtils.equals(str, C20902b.m53242a().getCurUser().getNickname())) {
            this.f102428q.setNickname(str);
            this.f102419d.mo81851a(str);
            this.mDmtStatusView.mo19212f();
            return true;
        } else {
            this.f102424m.f101356a = "";
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ boolean mo82322i(String str) {
        if (!TextUtils.equals(str, C20902b.m53242a().getCurUser().getBioEmail())) {
            String n = m89295n(str);
            int length = n.length() - 1;
            if (length >= 0 && n.charAt(length) == 10) {
                n = n.substring(0, length);
            }
            this.f102425n = true;
            this.f102424m.f101370o = n;
            this.mDmtStatusView.mo19212f();
            this.f102428q.setEmail(n);
            this.f102419d.mo81853a(this.f102424m.mo80822a());
            return true;
        }
        this.f102424m.f101370o = null;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ int mo82325k(String str) {
        String str2;
        User curUser = C20902b.m53242a().getCurUser();
        if (TextUtils.isEmpty(curUser.getUniqueId())) {
            str2 = curUser.getShortId();
        } else {
            str2 = curUser.getUniqueId();
        }
        if (str.equals(str2)) {
            this.f102424m.f101358c = "";
            return 0;
        } else if (C47763cg.m103391a(str, getContext())) {
            C39954ad adVar = this.f102419d;
            if (!adVar.f101838c) {
                adVar.f101838c = true;
                C20854a.m53167g().updateId(adVar.f101839d, str, adVar.f101840e);
            }
            this.mDmtStatusView.mo19212f();
            this.f102428q.setUniqueId(str);
            return 1;
        } else {
            mo70161e();
            this.f102424m.f101358c = "";
            return 2;
        }
    }

    @OnClick({2131493827})
    public void onBindInstagram(View view) {
        int i;
        if (getContext().getString(R.string.avb).equals(this.authInstagramName.getTextRight())) {
            i = 0;
            InstagramPresenter instagramPresenter = this.f102426o;
            instagramPresenter.f101648g = true;
            C12318c a = new C12320a(instagramPresenter.f101644c).mo23309a("instagram").mo23308a((C12316a) instagramPresenter).mo23310a();
            C12343c.m24851a();
            C12347d.m24858a(a);
            this.mDmtStatusView.mo19212f();
        } else {
            m89289a(getResources().getString(R.string.f6f), getResources().getString(R.string.f6g), new C40311cw(this));
            i = 1;
        }
        C26890h.m65011a("click_social_account_bind", C23089d.m56640a().mo47826a("status", i).mo47829a("platform", "instagram").f61491a);
    }

    @OnClick({2131495202})
    public void onBindTwitter(View view) {
        int i;
        if (getContext().getString(R.string.avn).equals(this.authTwitterName.getTextRight())) {
            i = 0;
            C39852h hVar = this.f102427p;
            hVar.f101684d = true;
            C12318c a = new C12320a(hVar.f101682b).mo23309a("twitter").mo23308a((C12316a) hVar).mo23310a();
            C12347d.m24857a();
            C12347d.m24858a(a);
            this.mDmtStatusView.mo19212f();
        } else {
            m89289a(getResources().getString(R.string.f6m), getResources().getString(R.string.f6n), new C40310cv(this));
            i = 1;
        }
        C26890h.m65011a("click_social_account_bind", C23089d.m56640a().mo47826a("status", i).mo47829a("platform", "twitter").f61491a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo82248a(View view) {
        if (VERSION.SDK_INT >= 19) {
            this.f102418c.getLayoutParams().height = C11065a.m22390a((Context) getActivity());
        }
        this.mDmtStatusView.setBuilder(C10719a.m21676a(getContext()));
        this.f102417b = (ButtonTitleBar) view.findViewById(R.id.d10);
        this.f102417b.setTitle(getText(R.string.avm));
        this.f102417b.getEndBtn().setVisibility(8);
        this.f102417b.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                ProfileEditFragment.this.mo82307b(view);
            }
        });
        this.f102420e = new C39948a();
        this.f102420e.f101827c = this;
        this.f102420e.mo80925b(getActivity(), this);
        this.f102419d = new C39954ad();
        this.f102419d.mo81850a((C39985s) this);
        this.f102426o = new InstagramPresenter(getActivity(), this);
        this.f102429r = new C39858l(getActivity(), this);
        this.f102427p = new C39852h(getActivity(), this);
        this.f102430s = new C41905c();
        if (C40008a.f101948a.mo82019d()) {
            this.mWebsiteLayout.setVisibility(0);
        } else {
            this.mWebsiteLayout.setVisibility(8);
        }
        if (C40008a.f101948a.mo82018c()) {
            this.mMailLayout.setVisibility(0);
        } else {
            this.mMailLayout.setVisibility(8);
        }
        this.authTwitterName.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ boolean mo82320h(String str) {
        if (!TextUtils.equals(str, C20902b.m53242a().getCurUser().getSignature())) {
            String n = m89295n(str);
            int length = n.length() - 1;
            if (length >= 0 && n.charAt(length) == 10) {
                n = n.substring(0, length);
            }
            this.f102428q.setSignature(n);
            this.f102424m.f101357b = n;
            this.mDmtStatusView.mo19212f();
            C39954ad adVar = this.f102419d;
            if (!adVar.f101837b) {
                adVar.f101837b = true;
                C20854a.m53167g().updateSignature(adVar.f101839d, n, adVar.f101840e);
            }
            this.f102425n = true;
            return true;
        }
        this.f102424m.f101357b = null;
        return true;
    }

    @OnClick({2131495373})
    public void onBindYouTube(View view) {
        int i;
        if (getContext().getString(R.string.avu).equals(this.authYoutubeName.getTextRight())) {
            i = 0;
            C39858l lVar = this.f102429r;
            if (!((Boolean) lVar.f101707h.getValue()).booleanValue()) {
                C39858l.m88622a(lVar, new Exception("Google service is not available, aborting."), null, null, 6, null);
            } else {
                C47957v.m103769a(new C39860b(lVar), "YoutubeApi");
            }
            this.mDmtStatusView.mo19212f();
        } else {
            i = 1;
            m89289a(getResources().getString(R.string.f6p), getResources().getString(R.string.f6q), new C40312cx(this));
        }
        C26890h.m65011a("click_social_account_bind", C23089d.m56640a().mo47826a("status", i).mo47829a("platform", "youtube").f61491a);
    }

    /* renamed from: a */
    public void mo50430a(AvatarUri avatarUri) {
        this.f102420e.mo81848e();
        if (this.f102419d == null || avatarUri == null) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.cq).mo19066a();
        }
    }

    /* renamed from: a */
    public void mo50431a(Exception exc) {
        mo82323j();
        if (isViewValid() && this.f102420e != null) {
            if ((exc instanceof C23459a) && ((C23459a) exc).getErrorCode() == 20022) {
                C18898c.m46009a(getActivity(), "profile_image_setting", "review_failure");
            }
            C22971a.m56494a(getActivity(), exc, R.string.cq);
            C50316a.m108594a(exc.getMessage(), "avatar");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82303a(DialogInterface dialogInterface, int i) {
        C47957v.m103771b(new C39866f(this.f102429r));
        dialogInterface.dismiss();
        this.mDmtStatusView.mo19212f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo82309c(DialogInterface dialogInterface, int i) {
        C39852h hVar = this.f102427p;
        hVar.f101684d = false;
        C39839a.m88597a(new C39841a() {
            /* renamed from: a */
            public final String mo80942a() throws Exception {
                return TwitterApi.m88592a();
            }

            /* renamed from: b */
            public final void mo80943b() {
                C20854a.m53167g().queryUser(C39852h.this.f101683c);
            }

            /* renamed from: c */
            public final void mo80944c() {
                C39852h.this.f101682b.runOnUiThread(new C39857k(this));
            }
        });
        dialogInterface.dismiss();
        this.mDmtStatusView.mo19212f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo82306b(DialogInterface dialogInterface, int i) {
        InstagramPresenter instagramPresenter = this.f102426o;
        instagramPresenter.f101648g = false;
        instagramPresenter.f101646e.updateInsId(instagramPresenter.f101645d, "", 0);
        dialogInterface.dismiss();
        this.mDmtStatusView.mo19212f();
    }

    /* renamed from: b */
    public final void mo82308b(Exception exc, int i) {
        if (4 == i) {
            this.mDmtStatusView.setVisibility(8);
            this.f102420e.mo81848e();
            if ((exc instanceof C23459a) && ((C23459a) exc).getErrorCode() == 20022) {
                C18898c.m46009a(getActivity(), "profile_image_setting", "review_failure");
            }
        }
        if (i == 116) {
            String str = null;
            if ((exc instanceof ExecutionException) && (exc.getCause() instanceof C23459a)) {
                exc = (Exception) exc.getCause();
            }
            if (exc instanceof C23459a) {
                C23459a aVar = (C23459a) exc;
                String valueOf = String.valueOf(aVar.getErrorCode());
                C47763cg.m103392a(valueOf, aVar.getErrorMsg(), this.f102432u, getContext());
                mo70161e();
                str = valueOf;
            }
            C40570u.f103512a.mo82845a(0, this.f102431t, str);
        }
        if (i != 116) {
            C22971a.m56494a(getActivity(), exc, R.string.czy);
        }
    }

    /* renamed from: a */
    public void mo54359a(User user, int i) {
        this.f102422k = true;
        if (i == 0) {
            this.mNickNameLayout.setRightText(this.f102428q.getNickname());
        } else if (i == 2) {
            m89294m(this.f102428q.getSignature());
        } else if (i == 4) {
            C23515d.m57669a((RemoteImageView) this.mHeaderImage, user.getAvatarMedium());
        } else if (i == 112) {
            m89293l(user.getBioUrl());
            mo70158b(user.getBioEmail());
        } else if (i == 116) {
            C40570u.f103512a.mo82845a(1, this.f102431t, (String) null);
            m89296o(this.f102428q.getUniqueId());
            if (this.f102431t == 4) {
                C40010c.f101950a.mo82037i();
            }
        }
        this.mDmtStatusView.mo19209d();
    }

    /* renamed from: a */
    private void m89289a(String str, String str2, OnClickListener onClickListener) {
        if (mo20100Z_()) {
            new C10643a(getActivity()).mo18892a(str).mo18902b(str2).mo18900b((int) R.string.wf, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).mo18886a((int) R.string.vo, onClickListener).mo18897a().mo18882b();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo82250f(), viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        if (getArguments() != null) {
            this.f102431t = getArguments().getInt("need_focus_id_input", 0);
        }
        this.f102418c = inflate.findViewById(R.id.csm);
        mo82248a(inflate);
        C47718bf.m103290c(this);
        return inflate;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001) {
            C39858l lVar = this.f102429r;
            if (intent == null) {
                C39858l.m88622a(lVar, new Exception("onActivityResult called with null Intent"), null, null, 6, null);
            } else {
                C0013i.m16a((Callable<TResult>) new C39862d<TResult>(lVar, intent)).mo19a((C0011g<TResult, TContinuationResult>) new C39865e<TResult,TContinuationResult>(lVar));
            }
        } else {
            if (i == 10002 && intent != null) {
                UrlModel urlModel = (UrlModel) intent.getSerializableExtra(LeakCanaryFileProvider.f132050j);
                if (urlModel != null) {
                    C23515d.m57669a((RemoteImageView) this.mHeaderImage, urlModel);
                    C20902b.m53242a().getCurUser().setAvatarUpdateReminder(false);
                }
            }
            if (this.f102420e.mo80923a(i, i2, intent)) {
            }
        }
    }
}
