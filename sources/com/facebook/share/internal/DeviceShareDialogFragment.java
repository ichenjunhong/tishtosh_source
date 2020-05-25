package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.C14696t;
import com.facebook.C14697u;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13501b;
import com.facebook.internal.C14283ab;
import com.facebook.p943e.p944a.C13853a;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class DeviceShareDialogFragment extends C0649f {

    /* renamed from: g */
    private static ScheduledThreadPoolExecutor f37869g;

    /* renamed from: a */
    public Dialog f37870a;

    /* renamed from: b */
    public ShareContent f37871b;

    /* renamed from: c */
    private ProgressBar f37872c;

    /* renamed from: d */
    private TextView f37873d;

    /* renamed from: e */
    private volatile RequestState f37874e;

    /* renamed from: f */
    private volatile ScheduledFuture f37875f;

    static class RequestState implements Parcelable {
        public static final Creator<RequestState> CREATOR = new Creator<RequestState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new RequestState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new RequestState(parcel);
            }
        };

        /* renamed from: a */
        public String f37879a;

        /* renamed from: b */
        public long f37880b;

        RequestState() {
        }

        public int describeContents() {
            return 0;
        }

        protected RequestState(Parcel parcel) {
            this.f37879a = parcel.readString();
            this.f37880b = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f37879a);
            parcel.writeLong(this.f37880b);
        }
    }

    /* renamed from: a */
    private void m29849a() {
        if (isAdded()) {
            getFragmentManager().mo2225a().mo2177a((Fragment) this).mo2189b();
        }
    }

    /* renamed from: b */
    private static synchronized ScheduledThreadPoolExecutor m29851b() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (f37869g == null) {
                f37869g = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f37869g;
        }
        return scheduledThreadPoolExecutor;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f37874e != null) {
            bundle.putParcelable("request_state", this.f37874e);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f37875f != null) {
            this.f37875f.cancel(true);
        }
        m29850a(-1, new Intent());
    }

    /* renamed from: a */
    public final void mo26813a(FacebookRequestError facebookRequestError) {
        m29849a();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        m29850a(-1, intent);
    }

    /* renamed from: a */
    public final void mo26814a(RequestState requestState) {
        this.f37874e = requestState;
        this.f37873d.setText(requestState.f37879a);
        this.f37873d.setVisibility(0);
        this.f37872c.setVisibility(8);
        this.f37875f = m29851b().schedule(new Runnable() {
            public final void run() {
                DeviceShareDialogFragment.this.f37870a.dismiss();
            }
        }, requestState.f37880b, TimeUnit.SECONDS);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        this.f37870a = new Dialog(getActivity(), R.style.sq);
        Bundle bundle2 = null;
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.ia, null);
        this.f37872c = (ProgressBar) inflate.findViewById(R.id.c66);
        this.f37873d = (TextView) inflate.findViewById(R.id.yq);
        ((Button) inflate.findViewById(R.id.qb)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                DeviceShareDialogFragment.this.f37870a.dismiss();
            }
        });
        ((TextView) inflate.findViewById(R.id.wb)).setText(Html.fromHtml(getString(R.string.a68)));
        this.f37870a.setContentView(inflate);
        ShareContent shareContent = this.f37871b;
        if (shareContent != null) {
            if (shareContent instanceof ShareLinkContent) {
                bundle2 = C14619n.m29948a((ShareLinkContent) shareContent);
            } else if (shareContent instanceof ShareOpenGraphContent) {
                bundle2 = C14619n.m29949a((ShareOpenGraphContent) shareContent);
            }
        }
        Bundle bundle3 = bundle2;
        if (bundle3 == null || bundle3.size() == 0) {
            mo26813a(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C14283ab.m29309b());
        sb.append("|");
        sb.append(C14283ab.m29312c());
        bundle3.putString("access_token", sb.toString());
        bundle3.putString("device_info", C13853a.m28172a());
        GraphRequest graphRequest = new GraphRequest(null, "device/share", bundle3, C14697u.POST, new C13501b() {
            /* renamed from: a */
            public final void mo25316a(C14696t tVar) {
                FacebookRequestError facebookRequestError = tVar.f38086d;
                if (facebookRequestError != null) {
                    DeviceShareDialogFragment.this.mo26813a(facebookRequestError);
                    return;
                }
                JSONObject jSONObject = tVar.f38084b;
                RequestState requestState = new RequestState();
                try {
                    requestState.f37879a = jSONObject.getString("user_code");
                    requestState.f37880b = jSONObject.getLong("expires_in");
                    DeviceShareDialogFragment.this.mo26814a(requestState);
                } catch (JSONException unused) {
                    DeviceShareDialogFragment.this.mo26813a(new FacebookRequestError(0, "", "Malformed server response"));
                }
            }
        });
        graphRequest.mo25314b();
        return this.f37870a;
    }

    /* renamed from: a */
    private void m29850a(int i, Intent intent) {
        if (this.f37874e != null) {
            C13853a.m28176c(this.f37874e.f37879a);
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            C14592c.m29859a(Toast.makeText(getContext(), facebookRequestError.mo25306a(), 0));
        }
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            RequestState requestState = (RequestState) bundle.getParcelable("request_state");
            if (requestState != null) {
                mo26814a(requestState);
            }
        }
        return onCreateView;
    }
}
