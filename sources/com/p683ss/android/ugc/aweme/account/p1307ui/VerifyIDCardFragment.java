package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.mobilelib.present.CommonPresent;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.p683ss.android.ugc.aweme.account.api.p1265a.C20895a;
import com.p683ss.android.ugc.aweme.account.api.p1266b.C20899a;
import com.p683ss.android.ugc.aweme.account.base.C20916a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21542a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.CheckButton;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.ui.VerifyIDCardFragment */
public class VerifyIDCardFragment extends C21542a {

    /* renamed from: a */
    public String f59968a;

    /* renamed from: l */
    private String f59969l;
    @BindView(2131492932)
    protected CheckButton mDoneBtn;
    @BindView(2131493064)
    protected EditText mIdCardEditText;
    @BindView(2131493516)
    protected DmtStatusView mStatusView;
    @BindView(2131493519)
    protected TextView mSubTitle;

    /* renamed from: g */
    public final CommonPresent mo45812g() {
        return null;
    }

    /* renamed from: a */
    private void m55071a() {
        this.mStatusView.mo19212f();
        AccountApiInModule.m53227a(C23826bi.m58463d(), this.f59969l, new C17824h<C20895a>() {
            public final void onFailure(Throwable th) {
                if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                    C10691a.m21542b((Context) VerifyIDCardFragment.this.getActivity(), (int) R.string.cg1).mo19066a();
                    if (VerifyIDCardFragment.this.getActivity() != null) {
                        VerifyIDCardFragment.this.mStatusView.mo19214h();
                    }
                }
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                C20895a aVar = (C20895a) obj;
                if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                    if (TextUtils.equals(aVar.f56873a, "success")) {
                        VerifyIDCardFragment.this.f59968a = aVar.f56874b.f56877c;
                        String a = C2240a.m6772a(VerifyIDCardFragment.this.getString(R.string.fae), new Object[]{VerifyIDCardFragment.this.f59968a});
                        int indexOf = a.indexOf(VerifyIDCardFragment.this.f59968a);
                        Spannable newSpannable = Factory.getInstance().newSpannable(a);
                        newSpannable.setSpan(new ForegroundColorSpan(VerifyIDCardFragment.this.getResources().getColor(R.color.a10)), indexOf, VerifyIDCardFragment.this.f59968a.length() + indexOf, 17);
                        VerifyIDCardFragment.this.mSubTitle.setText(newSpannable);
                        VerifyIDCardFragment.this.mStatusView.setVisibility(8);
                        return;
                    }
                    if (10003 == aVar.f56874b.f56875a) {
                        Intent intent = new Intent();
                        intent.putExtra("error_code", aVar.f56874b.f56875a);
                        VerifyIDCardFragment.this.getActivity().setResult(0, intent);
                        VerifyIDCardFragment.this.getActivity().finish();
                    } else {
                        C10691a.m21545b((Context) VerifyIDCardFragment.this.getActivity(), C22275o.m55131a(Integer.valueOf(aVar.f56874b.f56875a), aVar.f56874b.f56876b)).mo19066a();
                    }
                    if (VerifyIDCardFragment.this.getActivity() != null) {
                        VerifyIDCardFragment.this.mStatusView.mo19214h();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo46352c(View view) {
        m55071a();
    }

    /* renamed from: a */
    public static VerifyIDCardFragment m55070a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("shark_ticket", str);
        VerifyIDCardFragment verifyIDCardFragment = new VerifyIDCardFragment();
        verifyIDCardFragment.setArguments(bundle);
        return verifyIDCardFragment;
    }

    @OnClick({2131492911, 2131492932})
    public void onClick(View view) {
        if (isViewValid()) {
            if (view.getId() == R.id.ik) {
                KeyboardUtils.m58184c(this.mIdCardEditText);
                getActivity().finish();
                return;
            }
            if (view.getId() == R.id.no) {
                String d = C23826bi.m58463d();
                String obj = this.mIdCardEditText.getText().toString();
                String str = this.f59969l;
                C17825i.m43740a(AccountApiInModule.f56869b.verifyVerifyInfo(d, "id_number", obj, str), new C20899a() {
                    /* renamed from: a */
                    public final void mo44855a(JSONObject jSONObject) {
                        if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                            VerifyIDCardFragment.this.getActivity().setResult(-1);
                            VerifyIDCardFragment.this.getActivity().finish();
                        }
                    }

                    public final void onFailure(Throwable th) {
                        if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                            C10691a.m21542b((Context) VerifyIDCardFragment.this.getActivity(), (int) R.string.cg1).mo19066a();
                            if (VerifyIDCardFragment.this.getActivity() != null) {
                                VerifyIDCardFragment.this.mStatusView.mo19214h();
                            }
                        }
                    }

                    /* renamed from: b */
                    public final void mo44856b(JSONObject jSONObject) {
                        if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                            JSONObject optJSONObject = jSONObject.optJSONObject("data");
                            int optInt = optJSONObject.optInt("error_code");
                            String optString = optJSONObject.optString("description");
                            if (10003 == optInt) {
                                Intent intent = new Intent();
                                intent.putExtra("error_code", optInt);
                                VerifyIDCardFragment.this.getActivity().setResult(0, intent);
                                return;
                            }
                            if (!TextUtils.isEmpty(optString)) {
                                C10691a.m21545b((Context) VerifyIDCardFragment.this.getActivity(), optString).mo19066a();
                            }
                        }
                    }
                }, C20916a.f56902a);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            this.f59969l = getArguments().getString("shark_ticket");
        }
        DmtStatusView dmtStatusView = this.mStatusView;
        C10719a a = C10719a.m21676a(getContext());
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.tf));
        dmtTextView.setTextColor(getResources().getColor(R.color.a19));
        dmtTextView.setText(R.string.c0e);
        dmtTextView.setOnClickListener(new C22253r(this));
        dmtStatusView.setBuilder(a.mo19234c((View) dmtTextView));
        this.mIdCardEditText.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                if (editable.length() == 6) {
                    VerifyIDCardFragment.this.mDoneBtn.setEnabled(true);
                } else {
                    VerifyIDCardFragment.this.mDoneBtn.setEnabled(false);
                }
            }
        });
        m55071a();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.b15, viewGroup, false);
    }
}
