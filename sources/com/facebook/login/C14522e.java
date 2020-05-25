package com.facebook.login;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C14457k;
import com.facebook.login.LoginClient.C14493b;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import com.ss.android.ugc.trill.R;

/* renamed from: com.facebook.login.e */
public final class C14522e extends Fragment {

    /* renamed from: a */
    public LoginClient f37730a;

    /* renamed from: b */
    Request f37731b;

    /* renamed from: c */
    private String f37732c;

    public final void onDestroy() {
        LoginClient loginClient = this.f37730a;
        if (loginClient.f37629b >= 0) {
            loginClient.mo26684c().mo26672b();
        }
        super.onDestroy();
    }

    public final void onPause() {
        View view;
        super.onPause();
        if (getView() == null) {
            view = null;
        } else {
            view = getView().findViewById(R.id.wd);
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f37732c == null) {
            getActivity().finish();
        } else {
            this.f37730a.mo26681a(this.f37731b);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.f37730a);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f37730a = (LoginClient) bundle.getParcelable("loginClient");
            LoginClient loginClient = this.f37730a;
            if (loginClient.f37630c == null) {
                loginClient.f37630c = this;
            } else {
                throw new C14457k("Can't set fragment once it is already set.");
            }
        } else {
            this.f37730a = new LoginClient((Fragment) this);
        }
        this.f37730a.f37631d = new C14493b() {
            /* renamed from: a */
            public final void mo26702a(Result result) {
                int i;
                C14522e eVar = C14522e.this;
                eVar.f37731b = null;
                if (result.f37647a == C14491a.CANCEL) {
                    i = 0;
                } else {
                    i = -1;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.facebook.LoginFragment:Result", result);
                Intent intent = new Intent();
                intent.putExtras(bundle);
                if (eVar.isAdded()) {
                    eVar.getActivity().setResult(i, intent);
                    eVar.getActivity().finish();
                }
            }
        };
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ComponentName callingActivity = activity.getCallingActivity();
            if (callingActivity != null) {
                this.f37732c = callingActivity.getPackageName();
            }
            Intent intent = activity.getIntent();
            if (intent != null) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request");
                if (bundleExtra != null) {
                    this.f37731b = (Request) bundleExtra.getParcelable("request");
                }
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LoginClient loginClient = this.f37730a;
        if (loginClient.f37634g != null) {
            loginClient.mo26684c().mo26637a(i, i2, intent);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ib, viewGroup, false);
        final View findViewById = inflate.findViewById(R.id.wd);
        this.f37730a.f37632e = new C14492a() {
            /* renamed from: a */
            public final void mo26700a() {
                findViewById.setVisibility(0);
            }

            /* renamed from: b */
            public final void mo26701b() {
                findViewById.setVisibility(8);
            }
        };
        return inflate;
    }
}
