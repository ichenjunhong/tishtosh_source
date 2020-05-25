package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseThirdPartyCheckFragment */
public abstract class BaseThirdPartyCheckFragment extends C21168a {
    @BindView(2131492930)
    DmtButton mBtnConfirm;
    @BindView(2131493590)
    DmtTextView mCountDownFive;
    @BindView(2131493235)
    ImageView mIvPlatForm;
    @BindView(2131493226)
    ImageView mIvback;
    @BindView(2131493622)
    DmtTextView mTvBindDetail;

    /* renamed from: o */
    protected CountDownTimer f57493o;

    /* renamed from: p */
    protected String f57494p = "";

    /* renamed from: q */
    protected String f57495q;

    /* renamed from: r */
    protected String f57496r;

    /* renamed from: s */
    protected String f57497s;

    /* renamed from: a */
    public abstract void mo45314a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo45315a(long j);

    /* renamed from: a */
    public abstract void mo45316a(Intent intent);

    public void onDestroy() {
        super.onDestroy();
        if (this.f57493o != null) {
            this.f57493o.cancel();
        }
    }

    @OnClick({2131493226, 2131492930})
    public void onClick(View view) {
        if (view.getId() == R.id.ay9) {
            getActivity().onBackPressed();
            return;
        }
        if (view.getId() == R.id.nl) {
            mo45314a();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f57495q = getArguments().getString("access_token");
            this.f57496r = getArguments().getString("access_token_secret");
            this.f57497s = getArguments().getString("code");
            this.f57494p = getArguments().getString("platform");
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4321) {
            mo45316a(intent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007b, code lost:
        if (r12.equals("facebook") == false) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            super.onCreateView(r11, r12, r13)
            r13 = 0
            r0 = 2132214024(0x7f170108, float:2.0071878E38)
            android.view.View r11 = r11.inflate(r0, r12, r13)
            butterknife.ButterKnife.bind(r10, r11)
            android.content.Context r12 = r10.getContext()
            int r12 = com.bytedance.common.utility.C9432q.m18688b(r12)
            float r12 = (float) r12
            android.content.Context r0 = r10.getContext()
            r1 = 1110441984(0x42300000, float:44.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r1)
            float r12 = r12 - r0
            double r0 = (double) r12
            r2 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            java.lang.Double.isNaN(r0)
            double r0 = r0 * r2
            int r12 = (int) r0
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r10.mTvBindDetail
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            android.content.Context r1 = r10.getContext()
            r2 = 1101004800(0x41a00000, float:20.0)
            float r1 = com.bytedance.common.utility.C9432q.m18687b(r1, r2)
            int r1 = (int) r1
            android.content.Context r3 = r10.getContext()
            float r2 = com.bytedance.common.utility.C9432q.m18687b(r3, r2)
            int r2 = (int) r2
            r0.setMargins(r1, r12, r2, r13)
            java.lang.String r12 = r10.f57494p
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x00d7
            java.lang.String r12 = r10.f57494p
            r0 = -1
            int r1 = r12.hashCode()
            r2 = -1240244679(0xffffffffb6135e39, float:-2.1959552E-6)
            if (r1 == r2) goto L_0x009c
            r2 = -916346253(0xffffffffc961aa73, float:-924327.2)
            if (r1 == r2) goto L_0x0092
            r2 = 3765(0xeb5, float:5.276E-42)
            if (r1 == r2) goto L_0x0088
            r2 = 28903346(0x1b907b2, float:6.796931E-38)
            if (r1 == r2) goto L_0x007e
            r2 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r1 == r2) goto L_0x0075
            goto L_0x00a6
        L_0x0075:
            java.lang.String r1 = "facebook"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x007e:
            java.lang.String r13 = "instagram"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x00a6
            r13 = 2
            goto L_0x00a7
        L_0x0088:
            java.lang.String r13 = "vk"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x00a6
            r13 = 4
            goto L_0x00a7
        L_0x0092:
            java.lang.String r13 = "twitter"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x00a6
            r13 = 3
            goto L_0x00a7
        L_0x009c:
            java.lang.String r13 = "google"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x00a6
            r13 = 1
            goto L_0x00a7
        L_0x00a6:
            r13 = -1
        L_0x00a7:
            switch(r13) {
                case 0: goto L_0x00cf;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00bd;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00ab;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            goto L_0x00d7
        L_0x00ab:
            android.widget.ImageView r12 = r10.mIvPlatForm
            r13 = 2131952007(0x7f130187, float:1.9540445E38)
            r12.setBackgroundResource(r13)
            goto L_0x00d7
        L_0x00b4:
            android.widget.ImageView r12 = r10.mIvPlatForm
            r13 = 2131952006(0x7f130186, float:1.9540443E38)
            r12.setBackgroundResource(r13)
            goto L_0x00d7
        L_0x00bd:
            android.widget.ImageView r12 = r10.mIvPlatForm
            r13 = 2131952005(0x7f130185, float:1.954044E38)
            r12.setBackgroundResource(r13)
            goto L_0x00d7
        L_0x00c6:
            android.widget.ImageView r12 = r10.mIvPlatForm
            r13 = 2131952004(0x7f130184, float:1.9540438E38)
            r12.setBackgroundResource(r13)
            goto L_0x00d7
        L_0x00cf:
            android.widget.ImageView r12 = r10.mIvPlatForm
            r13 = 2131952003(0x7f130183, float:1.9540436E38)
            r12.setBackgroundResource(r13)
        L_0x00d7:
            com.bytedance.ies.dmt.ui.widget.DmtButton r12 = r10.mBtnConfirm
            com.ss.android.ugc.aweme.w.a r13 = new com.ss.android.ugc.aweme.w.a
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 150(0x96, double:7.4E-322)
            r3 = 0
            r13.<init>(r0, r1, r3)
            r12.setOnTouchListener(r13)
            com.ss.android.ugc.aweme.account.login.fragment.BaseThirdPartyCheckFragment$1 r12 = new com.ss.android.ugc.aweme.account.login.fragment.BaseThirdPartyCheckFragment$1
            r6 = 5500(0x157c, double:2.7174E-320)
            r8 = 1000(0x3e8, double:4.94E-321)
            r4 = r12
            r5 = r10
            r4.<init>(r6, r8)
            r10.f57493o = r12
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.fragment.BaseThirdPartyCheckFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
