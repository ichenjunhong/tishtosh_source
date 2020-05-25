package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.p683ss.android.account.token.C18500a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.activity.BindMobileActivityV2;
import com.p683ss.android.ugc.aweme.account.fragment.VerificationCodeFragmentV2;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21095ad;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21120y;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.p1302o.C22097f;
import com.p683ss.android.ugc.aweme.account.util.C22262d;
import com.p683ss.android.ugc.aweme.account.util.C22263e;
import com.p683ss.android.ugc.aweme.account.util.C22264f;
import com.p683ss.android.ugc.aweme.account.util.C22281s;
import com.p683ss.android.ugc.aweme.account.util.C22284v;
import com.p683ss.android.ugc.aweme.account.view.StateButton.C22308a;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.main.service.C36692m;
import com.p683ss.android.ugc.aweme.main.service.C36695p;
import com.p683ss.android.ugc.aweme.main.service.C36703x;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.user.C47549c;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.ui.c */
public abstract class C22228c extends BaseAccountFragment implements C22241h {

    /* renamed from: q */
    public static final boolean f59982q = false;

    /* renamed from: A */
    private C13011d f59983A;

    /* renamed from: B */
    private long f59984B;

    /* renamed from: C */
    private long f59985C = -1;

    /* renamed from: a */
    private String f59986a;

    /* renamed from: r */
    public int f59987r;

    /* renamed from: s */
    public String f59988s;

    /* renamed from: t */
    public String f59989t;

    /* renamed from: u */
    public String f59990u;

    /* renamed from: v */
    public String f59991v;

    /* renamed from: w */
    protected int f59992w;

    /* renamed from: x */
    private boolean f59993x = true;

    /* renamed from: y */
    private int f59994y;

    /* renamed from: z */
    private String f59995z;

    /* renamed from: x */
    private int m55076x() {
        return this.f59987r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final int mo46254w() {
        return 1;
    }

    /* renamed from: i */
    public final long mo45361i() {
        return System.currentTimeMillis() - this.f59985C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo46253v() {
        return mo45840j();
    }

    public void onResume() {
        super.onResume();
        if (this.f59992w == 5) {
            this.f59985C = System.currentTimeMillis();
        }
    }

    /* renamed from: t */
    public final void mo46251t() {
        super.mo46251t();
        mo45808a((View) this.f58513o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo46252u() {
        String str;
        if (this.f58513o != null && isViewValid() && this.mBtnLogin != null) {
            final String o = mo45845o();
            if (!mo45840j()) {
                C10691a.m21545b((Context) C23826bi.m58460b(), getResources().getString(R.string.ffy)).mo19066a();
                return;
            }
            mo45827r();
            if (this.f59992w == 1) {
                this.f59987r = C22165u.f59777q;
                this.f59983A.mo24612a(o, "", m55076x(), 0, this.f59990u, 1, 1, "", this.f59991v, new C21120y(this) {
                    /* renamed from: b */
                    public final void mo45170b(C12993e<C13120s> eVar) {
                        C22097f.m54898a(1, C22228c.this.f59987r, eVar.f34000c, eVar.f34001d);
                        if (C22228c.this.isViewValid()) {
                            if (C22228c.this.mBtnLogin != null) {
                                C22308a.m55205a(C22228c.this.mBtnLogin);
                            }
                            if (eVar.f34000c == 1057) {
                                C22228c.this.mo46354a(eVar);
                                return;
                            }
                            if (!TextUtils.isEmpty(eVar.f34001d)) {
                                C22228c.this.mo46341a(eVar.f34000c, eVar.f34001d);
                            }
                        }
                    }

                    public final void onSuccess(C12993e<C13120s> eVar) {
                        super.onSuccess(eVar);
                        C22097f.m54898a(0, C22228c.this.f59987r, 0, "");
                        if (C22228c.this.isViewValid() && C22228c.this.f58513o != null) {
                            if (C22228c.this.mBtnLogin != null) {
                                C22308a.m55205a(C22228c.this.mBtnLogin);
                            }
                            if (TextUtils.isEmpty(C22228c.this.f59991v)) {
                                ((BaseAccountActivity) C22228c.this.getActivity()).mo46248a(VerificationCodeFragment.m55047b(4, o, "", C22228c.this.f59990u, C22228c.this.f59988s));
                                return;
                            }
                            BaseAccountActivity baseAccountActivity = (BaseAccountActivity) C22228c.this.getActivity();
                            String str = o;
                            String str2 = C22228c.this.f59991v;
                            baseAccountActivity.mo46248a(VerificationCodeFragment.m55046a(C22228c.this.f59988s, 4, str, C47661ab.m103163a().mo94972a("password", "").mo94972a("unusable_mobile_ticket", str2).f120139a));
                        }
                    }
                });
            } else if (this.f59992w == 2 || this.f59992w == 5) {
                if (this.f59992w == 5) {
                    KeyboardUtils.m58184c(this.mEditText);
                    C26890h.m65011a("click_next_for_proAccount", new C20856a().mo44774a("is_success", 1).mo44776a("method", "phone").mo44776a("page", "Set up by Phone").mo44775a("duration", System.currentTimeMillis() - this.f59985C).f56798a);
                }
                this.f59987r = C22165u.f59768h;
                this.f59983A.mo24611a(o, "", m55076x(), 0, "", 1, 1, (C13139p) new C21120y(this) {
                    public final void onSuccess(C12993e<C13120s> eVar) {
                        super.onSuccess(eVar);
                        C22097f.m54898a(0, C22228c.this.f59987r, 0, "");
                        if (C22228c.this.isViewValid()) {
                            if (C22228c.this.f58513o != null) {
                                C22228c.this.mo46250s();
                                C22228c.this.mo45865c(o);
                            }
                            if (TextUtils.equals(C22228c.this.f59988s, CustomActionPushReceiver.f104061f)) {
                                C23826bi.m58450a(C36695p.class);
                            }
                        }
                    }

                    /* renamed from: b */
                    public final void mo45170b(C12993e<C13120s> eVar) {
                        String str;
                        C22097f.m54898a(1, C22228c.this.f59987r, eVar.f34000c, eVar.f34001d);
                        if (C22228c.this.isViewValid()) {
                            C22228c.this.mo46250s();
                            if (TextUtils.equals(C22228c.this.f59988s, CustomActionPushReceiver.f104061f)) {
                                C23826bi.m58450a(C36695p.class);
                            }
                            if (eVar.f34000c == 1057) {
                                C22228c.this.mo46354a(eVar);
                            } else if (eVar.f34000c == 2015) {
                                C22228c.this.mo46355a(o, (OnClickListener) new C22238e(this, o));
                            } else {
                                if (eVar.f34000c == 1001) {
                                    if (C22228c.this.f59992w == 5) {
                                        C26890h.m65011a("input_wrong_phone", new C20856a().mo44776a("page", "Set up by Phone").mo44776a("error_code", "2").f56798a);
                                        if (C22228c.this.isViewValid()) {
                                            Context context = C22228c.this.getContext();
                                            if (TextUtils.isEmpty(eVar.f34001d)) {
                                                str = C22228c.this.getResources().getString(R.string.coj);
                                            } else {
                                                str = eVar.f34001d;
                                            }
                                            C10691a.m21545b(context, str).mo19066a();
                                        }
                                    }
                                } else if (eVar.f34000c == 1003) {
                                    if (C22228c.this.f59992w == 5) {
                                        C26890h.m65011a("input_wrong_phone", new C20856a().mo44776a("page", "Set up by Phone").mo44776a("error_code", "1").f56798a);
                                    }
                                } else if (!TextUtils.isEmpty(eVar.f34001d)) {
                                    C22228c.this.mo46341a(eVar.f34000c, eVar.f34001d);
                                }
                            }
                        }
                    }
                });
            } else if (this.f59992w == 4) {
                this.f59987r = C22165u.f59781u;
                this.f59983A.mo24614a(o, "", m55076x(), (C13139p) new C21120y(this) {
                    public final void onSuccess(C12993e<C13120s> eVar) {
                        super.onSuccess(eVar);
                        C22097f.m54898a(0, C22228c.this.f59987r, 0, "");
                        if (C22228c.this.isViewValid() && C22228c.this.f58513o != null) {
                            if (C22228c.this.mBtnLogin != null) {
                                C22308a.m55205a(C22228c.this.mBtnLogin);
                            }
                            C22228c.this.mo46356d(o);
                        }
                    }

                    /* renamed from: b */
                    public final void mo45170b(C12993e<C13120s> eVar) {
                        C22097f.m54898a(1, C22228c.this.f59987r, eVar.f34000c, eVar.f34001d);
                        if (C22228c.this.isViewValid()) {
                            if (C22228c.this.mBtnLogin != null) {
                                C22308a.m55205a(C22228c.this.mBtnLogin);
                            }
                            if (eVar.f34000c == 1057) {
                                C22228c.this.mo46354a(eVar);
                            } else if (eVar.f34000c == 2015) {
                                C22228c.this.mo46355a(o, (OnClickListener) new C22239f(this, o));
                            } else {
                                if (!TextUtils.isEmpty(eVar.f34001d)) {
                                    C22228c.this.mo46341a(eVar.f34000c, eVar.f34001d);
                                }
                            }
                        }
                    }
                });
            } else if (this.f59992w == 3) {
                this.f59987r = C22165u.f59785y;
                this.f59983A.mo24612a(o, "", m55076x(), 0, this.f59990u, 1, 1, "", this.f59991v, new C21120y(this) {
                    /* renamed from: b */
                    public final void mo45170b(C12993e<C13120s> eVar) {
                        C22097f.m54898a(1, C22228c.this.f59987r, eVar.f34000c, eVar.f34001d);
                        if (C22228c.this.isViewValid()) {
                            if (C22228c.this.mBtnLogin != null) {
                                C22308a.m55205a(C22228c.this.mBtnLogin);
                            }
                            if (!TextUtils.isEmpty(eVar.f34001d)) {
                                C22228c.this.mo46341a(eVar.f34000c, eVar.f34001d);
                            }
                        }
                    }

                    public final void onSuccess(C12993e<C13120s> eVar) {
                        super.onSuccess(eVar);
                        C22097f.m54898a(0, C22228c.this.f59987r, 0, "");
                        if (C22228c.this.isViewValid() && C22228c.this.f58513o != null) {
                            if (C22228c.this.mBtnLogin != null) {
                                C22308a.m55205a(C22228c.this.mBtnLogin);
                            }
                            ((BaseAccountActivity) C22228c.this.getActivity()).mo46248a(VerificationCodeFragment.m55047b(3, o, "", "", C22228c.this.f59988s));
                        }
                    }
                });
                C22308a.m55205a(this.mBtnLogin);
            }
            if (this.f59988s == null || !this.f59988s.contains("third_party_")) {
                str = this.f59988s;
            } else {
                str = "log_in";
            }
            C26890h.m65011a("send_sms", new C20856a().mo44776a("send_method", "user_click").mo44774a("send_reason", this.f59987r).mo44776a("enter_from", str).f56798a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo44970b() {
        mo45849q();
        this.f59984B = C35807d.m80935a(C23826bi.m58460b(), "com.ss.spipe_bind", 0).getLong("last_show_bind_dialog_time", 0);
        if (getArguments() != null) {
            this.f59992w = getArguments().getInt("type");
            this.f59988s = getArguments().getString("enter_from");
            this.f59990u = getArguments().getString("ticket");
            this.f59989t = C22262d.m55108a(this.f59988s);
            this.f59991v = getArguments().getString("unusable_mobile_ticket");
            this.f59986a = getArguments().getString("profile_key");
            this.f58513o.setHint(R.string.s4);
            this.f59994y = getArguments().getInt("proaccount_switch_type");
            this.f59995z = getArguments().getString("proaccount_category");
            if (this.f59992w == 1) {
                this.mTitleHint.setText(R.string.ry);
                this.mTxtHint.setText(R.string.rs);
            } else if (this.f59992w == 5) {
                ((BaseBindMobileActivity) getActivity()).f59809p = new C22237d(this);
                this.mSelectCountryDown.setImageResource(R.drawable.cf2);
                this.backBtn.setImageResource(R.drawable.c_p);
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.setMargins((int) C9432q.m18687b(getContext(), 32.0f), (int) C9432q.m18687b(getContext(), 10.0f), (int) C9432q.m18687b(getContext(), 32.0f), 0);
                layoutParams.addRule(3, R.id.dkm);
                this.mLLContainer.setLayoutParams(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins(0, 0, 0, 0);
                layoutParams2.gravity = 16;
                this.f58511m.setLayoutParams(layoutParams2);
                this.mPhoneDownView.setVisibility(0);
                this.f58513o.setHintTextColor(getResources().getColor(R.color.a1_));
                this.f58513o.setTextColor(getResources().getColor(R.color.a17));
                LayoutParams layoutParams3 = new LayoutParams(-2, -2);
                layoutParams3.addRule(9, -1);
                layoutParams3.addRule(3, this.mRlTitle.getId());
                layoutParams3.setMargins((int) C9432q.m18687b(getContext(), 32.0f), (int) C9432q.m18687b(getContext(), 40.0f), (int) C9432q.m18687b(getContext(), 32.0f), 0);
                this.mTitleHint.setLayoutParams(layoutParams3);
                this.mTitleHint.setGravity(8388611);
                this.mTitleHint.setText(R.string.cvy);
                this.mTitleHint.setTextSize(20.0f);
                this.mTitleHint.setTextColor(getResources().getColor(R.color.a17));
                LayoutParams layoutParams4 = new LayoutParams(-2, -2);
                layoutParams4.setMargins((int) C9432q.m18687b(getContext(), 32.0f), (int) C9432q.m18687b(getContext(), 8.0f), (int) C9432q.m18687b(getContext(), 32.0f), (int) C9432q.m18687b(getContext(), 28.0f));
                layoutParams4.addRule(9, -1);
                layoutParams4.addRule(3, this.mTitleHint.getId());
                this.mTxtHint.setGravity(8388611);
                this.mTxtHint.setLayoutParams(layoutParams4);
                this.mTxtHint.setTextColor(getResources().getColor(R.color.a1a));
                this.mTxtHint.setText(R.string.bd1);
                this.mBtnPreAccount.setVisibility(0);
                this.mBtnLogin.setVisibility(8);
                this.mBtnPreAccount.setText(getString(R.string.so));
                LayoutParams layoutParams5 = new LayoutParams(-2, -2);
                layoutParams5.setMargins((int) C9432q.m18687b(getContext(), 32.0f), (int) C9432q.m18687b(getContext(), 12.0f), (int) C9432q.m18687b(getContext(), 32.0f), 0);
                layoutParams5.addRule(3, R.id.a96);
                this.mPasswordTip.setLayoutParams(layoutParams5);
                this.mPasswordTip.setVisibility(0);
                this.mPasswordTip.setText(R.string.c92);
                this.mPasswordTip.setGravity(8388611);
                this.mPasswordTip.setTextColor(getResources().getColor(R.color.a1a));
                this.mDmtStatusView.setBuilder(C10719a.m21676a(getContext()));
                this.mPhoneContainer.setBackgroundResource(0);
                this.mSwitchToEmail.setVisibility(0);
                String a = C2240a.m6772a(getString(R.string.hhd), new Object[]{getString(R.string.hhb)});
                SpannableString spannableString = new SpannableString(a);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(R.color.a10));
                spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.a17)), 0, a.length() - getString(R.string.hhb).length(), 33);
                spannableString.setSpan(foregroundColorSpan, a.length() - getString(R.string.hhb).length(), a.length(), 33);
                this.mSwitchToEmail.setText(spannableString);
                this.mSwitchToEmail.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        String str;
                        ClickInstrumentation.onClick(view);
                        C26890h.onEventV3("set_up_by_email");
                        C18922i iVar = new C18922i("https://www.tiktok.com/passport/email/email_bind_index/");
                        C47549c.m102974a();
                        User b = C47549c.m102975b();
                        String b2 = ((C36692m) C23826bi.m58450a(C36692m.class)).mo47887b();
                        String a = ((C36692m) C23826bi.m58450a(C36692m.class)).mo47886a();
                        iVar.mo38778a("lang", b2);
                        iVar.mo38776a("aid", (int) C23018b.f61359a);
                        iVar.mo38778a("locale", a);
                        iVar.mo38778a("enterfrom", "switchtoproaccount");
                        if (!TextUtils.isEmpty(b.getEmail())) {
                            iVar.mo38778a("email", b.getEmail());
                            StringBuilder sb = new StringBuilder();
                            sb.append(iVar.mo38774a());
                            sb.append("#verify-email");
                            str = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(iVar.mo38774a());
                            sb2.append("#bind-email");
                            str = sb2.toString();
                        }
                        C22263e.m55109a(C22228c.this.getActivity(), str, true);
                    }
                });
                this.f58512n.setTextColor(getResources().getColor(R.color.a17));
            } else if (this.f59992w == 2) {
                this.mTitleHint.setText(R.string.s3);
                this.mTxtHint.setText(R.string.s2);
                if (this.f59988s != null && this.f59988s.contains("third_party_")) {
                    this.mRightText.setVisibility(0);
                    this.backBtn.setVisibility(4);
                }
                if (TextUtils.equals(this.f59988s, "auth_login")) {
                    this.mTitleHint.setText(R.string.c34);
                    this.mTxtHint.setVisibility(8);
                    this.mRightText.setVisibility(4);
                    this.backBtn.setImageDrawable(C0726c.m2091a(getContext(), (int) R.drawable.cf0));
                    if ((getActivity() instanceof BaseAccountActivity) && getActivity().getSupportFragmentManager().mo2237e() > 1) {
                        this.backBtn.setImageDrawable(C0726c.m2091a(getContext(), (int) R.drawable.cey));
                    }
                }
            } else if (this.f59992w == 4) {
                this.mTitleHint.setText(R.string.s3);
                this.mTxtHint.setText(R.string.s2);
            } else if (this.f59992w == 3) {
                this.mTitleHint.setText(R.string.rz);
                this.mTxtHint.setText(R.string.faj);
            }
            this.f59983A = C13081d.m26312a(getContext());
        }
    }

    /* renamed from: d */
    public final void mo46356d(String str) {
        ((BaseAccountActivity) getActivity()).mo46248a(VerificationCodeFragment.m55046a(this.f59988s, 8, str, C47661ab.m103163a().mo94972a("profile_key", this.f59986a).f120139a));
    }

    /* renamed from: c */
    public final void mo45865c(String str) {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof BindMobileActivityV2)) {
            if (activity != null) {
                if (this.f59992w != 5) {
                    ((BaseAccountActivity) activity).mo46248a(VerificationCodeFragment.m55047b(5, str, "", "", this.f59988s));
                    return;
                }
                BaseAccountActivity baseAccountActivity = (BaseAccountActivity) activity;
                String str2 = this.f59988s;
                int i = this.f59994y;
                baseAccountActivity.mo46248a(VerificationCodeFragment.m55046a(str2, 9, str, C47661ab.m103163a().mo94972a("password", "").mo94972a("ticket", "").mo94969a("proaccount_switch_type", i).mo94972a("proaccount_category", this.f59995z).f120139a));
            }
        } else if (this.f59992w != 5) {
            ((BaseAccountActivity) activity).mo46248a(VerificationCodeFragmentV2.m53331a(5, str, "", "", this.f59988s));
        } else {
            ((BaseAccountActivity) activity).mo46248a(VerificationCodeFragmentV2.m53331a(9, str, "", "", this.f59988s));
        }
    }

    /* renamed from: a */
    public final void mo46354a(final C12993e<C13120s> eVar) {
        String str;
        if (eVar != null) {
            if (f59982q) {
                StringBuilder sb = new StringBuilder("Conflict optimization ");
                if (this.f59993x) {
                    str = "enabled";
                } else {
                    str = "disabled";
                }
                sb.append(str);
            }
            if (TextUtils.equals(this.f59988s, "auth_login")) {
                if (getContext() != null) {
                    C10691a.m21548c(getContext(), (int) R.string.cd).mo19066a();
                }
            } else if (!this.f59993x) {
                if (getContext() != null) {
                    C10691a.m21548c(getContext(), (int) R.string.coj).mo19066a();
                }
            } else {
                if (eVar.f34000c == 1057) {
                    C26890h.m65011a("phone_bundling_conflict_alert", new C20856a().mo44776a("enter_from", "log_in").mo44776a("platform", C21021e.m53410a(this.f59989t)).f56798a);
                    new C10643a(getContext()).mo18885a((int) R.string.rr).mo18899b((int) R.string.rp).mo18886a((int) R.string.ro, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C26890h.m65011a("phone_bundling_conflict_check", new C20856a().mo44776a("enter_from", "log_in").mo44776a("platform", C21021e.m53410a(C22228c.this.f59989t)).f56798a);
                            String str = ((C13120s) eVar.f34007h).f34317d;
                            if (!TextUtils.isEmpty(str)) {
                                Map a = C18500a.m44767a(str);
                                JSONObject jSONObject = new JSONObject();
                                for (Entry entry : a.entrySet()) {
                                    try {
                                        jSONObject.put((String) entry.getKey(), entry.getValue());
                                    } catch (Exception unused) {
                                    }
                                }
                                ((C36703x) C23826bi.m58450a(C36703x.class)).mo47869a((Context) C23826bi.m58460b(), AppLog.addCommonParams(str, false), jSONObject.toString());
                            }
                            dialogInterface.dismiss();
                        }
                    }).mo18900b((int) R.string.rn, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C26890h.m65011a("phone_bundling_conflict_cancel", new C20856a().mo44776a("enter_from", "log_in").mo44776a("platform", C21021e.m53410a(C22228c.this.f59989t)).f56798a);
                            dialogInterface.dismiss();
                        }
                    }).mo18897a().mo18882b().setCanceledOnTouchOutside(false);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo46341a(int i, String str) {
        C22281s.m55136a(getContext(), str, i);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (f59982q) {
            C22264f.m55111a("BBMInputPhoneFragment", arguments);
        }
        if (arguments != null) {
            this.f59993x = arguments.getBoolean("bind_conflict_opt", true);
        }
    }

    /* renamed from: a */
    public final void mo46355a(String str, final OnClickListener onClickListener) {
        this.f59983A.mo24642b(str, (String) null, m55076x(), (C13139p) new C21095ad(this) {
            /* renamed from: a */
            public final void mo45149a(C12993e<C13120s> eVar) {
            }

            public final void onSuccess(C12993e<C13120s> eVar) {
                super.onSuccess(eVar);
                if (C22228c.this.getActivity() != null) {
                    C11105a a = C22284v.m55156a(C22228c.this.getActivity());
                    a.mo20135a((int) R.string.cob).mo20144b((int) R.string.coc).mo20145b((int) R.string.bdf, onClickListener).mo20141a(false);
                    C47700ay.m103235a(a.mo20143a());
                }
            }
        });
        C26890h.m65011a("send_voice_verification_code", new C20856a().mo44776a("send_reason", String.valueOf(m55076x())).mo44776a("send_method", "anti_spam").f56798a);
    }
}
