package com.facebook.login;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.app.C0649f;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.C2240a;
import com.facebook.AccessToken;
import com.facebook.C13739d;
import com.facebook.C14457k;
import com.facebook.C14533n;
import com.facebook.C14563r;
import com.facebook.C14696t;
import com.facebook.C14697u;
import com.facebook.FacebookActivity;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13501b;
import com.facebook.internal.C14277aa.C14282c;
import com.facebook.internal.C14283ab;
import com.facebook.internal.C14338p;
import com.facebook.internal.C14367z;
import com.facebook.login.LoginClient.Request;
import com.facebook.p909a.C13589l;
import com.facebook.p943e.p944a.C13853a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class DeviceAuthDialog extends C0649f {

    /* renamed from: a */
    public AtomicBoolean f37589a = new AtomicBoolean();

    /* renamed from: b */
    public volatile RequestState f37590b;

    /* renamed from: c */
    public Dialog f37591c;

    /* renamed from: d */
    public boolean f37592d = false;

    /* renamed from: e */
    public boolean f37593e = false;

    /* renamed from: f */
    public Request f37594f = null;

    /* renamed from: g */
    private View f37595g;

    /* renamed from: h */
    private TextView f37596h;

    /* renamed from: i */
    private TextView f37597i;

    /* renamed from: j */
    private DeviceAuthMethodHandler f37598j;

    /* renamed from: k */
    private volatile C14563r f37599k;

    /* renamed from: l */
    private volatile ScheduledFuture f37600l;

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
        public String f37616a;

        /* renamed from: b */
        public String f37617b;

        /* renamed from: c */
        public String f37618c;

        /* renamed from: d */
        public long f37619d;

        /* renamed from: e */
        public long f37620e;

        RequestState() {
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: a */
        public final boolean mo26657a() {
            if (this.f37620e != 0 && (new Date().getTime() - this.f37620e) - (this.f37619d * 1000) < 0) {
                return true;
            }
            return false;
        }

        protected RequestState(Parcel parcel) {
            this.f37616a = parcel.readString();
            this.f37617b = parcel.readString();
            this.f37618c = parcel.readString();
            this.f37619d = parcel.readLong();
            this.f37620e = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f37616a);
            parcel.writeString(this.f37617b);
            parcel.writeString(this.f37618c);
            parcel.writeLong(this.f37619d);
            parcel.writeLong(this.f37620e);
        }
    }

    /* renamed from: b */
    private static int m29606b(boolean z) {
        return z ? R.layout.ic : R.layout.ia;
    }

    /* renamed from: d */
    private GraphRequest m29607d() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f37590b.f37618c);
        GraphRequest graphRequest = new GraphRequest(null, "device/login_status", bundle, C14697u.POST, new C13501b() {
            /* renamed from: a */
            public final void mo25316a(C14696t tVar) {
                Date date;
                Date date2;
                C144774 r1 = this;
                C14696t tVar2 = tVar;
                if (!DeviceAuthDialog.this.f37589a.get()) {
                    FacebookRequestError facebookRequestError = tVar2.f38086d;
                    if (facebookRequestError != null) {
                        int i = facebookRequestError.f35202e;
                        if (i != 1349152) {
                            switch (i) {
                                case 1349172:
                                case 1349174:
                                    DeviceAuthDialog.this.mo26651b();
                                    return;
                                case 1349173:
                                    DeviceAuthDialog.this.mo26652c();
                                    return;
                                default:
                                    DeviceAuthDialog.this.mo26647a(tVar2.f38086d.f35211n);
                                    return;
                            }
                        } else {
                            if (DeviceAuthDialog.this.f37590b != null) {
                                C13853a.m28176c(DeviceAuthDialog.this.f37590b.f37617b);
                            }
                            if (DeviceAuthDialog.this.f37594f != null) {
                                DeviceAuthDialog.this.mo26649a(DeviceAuthDialog.this.f37594f);
                            } else {
                                DeviceAuthDialog.this.mo26652c();
                            }
                        }
                    } else {
                        JSONObject jSONObject = tVar2.f38084b;
                        DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                        String string = jSONObject.getString("access_token");
                        Long valueOf = Long.valueOf(jSONObject.getLong("expires_in"));
                        Long valueOf2 = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                        Bundle bundle = new Bundle();
                        bundle.putString("fields", "id,permissions,name");
                        if (valueOf.longValue() != 0) {
                            try {
                                date = new Date(new Date().getTime() + (valueOf.longValue() * 1000));
                            } catch (JSONException e) {
                                e = e;
                                DeviceAuthDialog.this.mo26647a(new C14457k((Throwable) e));
                            }
                        } else {
                            date = null;
                        }
                        try {
                            if (valueOf2.longValue() == 0 || valueOf2 == null) {
                                date2 = null;
                            } else {
                                date2 = new Date(valueOf2.longValue() * 1000);
                            }
                            Date date3 = date;
                            AccessToken accessToken = new AccessToken(string, C14533n.m29777k(), "0", null, null, null, null, date, null, date2);
                            GraphRequest graphRequest = new GraphRequest(accessToken, "me", bundle, C14697u.GET, new C13501b(string, date3, date2) {

                                /* renamed from: a */
                                final /* synthetic */ String f37612a;

                                /* renamed from: b */
                                final /* synthetic */ Date f37613b;

                                /* renamed from: c */
                                final /* synthetic */ Date f37614c;

                                /* renamed from: a */
                                public final void mo25316a(C14696t tVar) {
                                    C14696t tVar2 = tVar;
                                    if (!DeviceAuthDialog.this.f37589a.get()) {
                                        if (tVar2.f38086d != null) {
                                            DeviceAuthDialog.this.mo26647a(tVar2.f38086d.f35211n);
                                            return;
                                        }
                                        try {
                                            JSONObject jSONObject = tVar2.f38084b;
                                            String string = jSONObject.getString("id");
                                            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
                                            ArrayList arrayList = new ArrayList(jSONArray.length());
                                            ArrayList arrayList2 = new ArrayList(jSONArray.length());
                                            ArrayList arrayList3 = new ArrayList(jSONArray.length());
                                            for (int i = 0; i < jSONArray.length(); i++) {
                                                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                                                String optString = optJSONObject.optString("permission");
                                                if (optString != null && !optString.equals("installed")) {
                                                    String optString2 = optJSONObject.optString("status");
                                                    if (optString2 != null) {
                                                        if (optString2.equals("granted")) {
                                                            arrayList.add(optString);
                                                        } else if (optString2.equals("declined")) {
                                                            arrayList2.add(optString);
                                                        } else if (optString2.equals("expired")) {
                                                            arrayList3.add(optString);
                                                        }
                                                    }
                                                }
                                            }
                                            C14282c cVar = new C14282c(arrayList, arrayList2, arrayList3);
                                            String string2 = jSONObject.getString(LeakCanaryFileProvider.f132049i);
                                            C13853a.m28176c(DeviceAuthDialog.this.f37590b.f37617b);
                                            if (!C14338p.m29397a(C14533n.m29777k()).f37293e.contains(C14367z.RequireConfirm) || DeviceAuthDialog.this.f37593e) {
                                                DeviceAuthDialog.this.mo26650a(string, cVar, this.f37612a, this.f37613b, this.f37614c);
                                                return;
                                            }
                                            DeviceAuthDialog.this.f37593e = true;
                                            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                                            String str = this.f37612a;
                                            Date date = this.f37613b;
                                            Date date2 = this.f37614c;
                                            String string3 = deviceAuthDialog.getResources().getString(R.string.a6s);
                                            String string4 = deviceAuthDialog.getResources().getString(R.string.a6r);
                                            String string5 = deviceAuthDialog.getResources().getString(R.string.a6q);
                                            String a = C2240a.m6772a(string4, new Object[]{string2});
                                            Builder builder = new Builder(deviceAuthDialog.getContext());
                                            Builder cancelable = builder.setMessage(string3).setCancelable(true);
                                            C144796 r2 = r3;
                                            C144796 r3 = new OnClickListener(string, cVar, str, date, date2) {

                                                /* renamed from: a */
                                                final /* synthetic */ String f37606a;

                                                /* renamed from: b */
                                                final /* synthetic */ C14282c f37607b;

                                                /* renamed from: c */
                                                final /* synthetic */ String f37608c;

                                                /* renamed from: d */
                                                final /* synthetic */ Date f37609d;

                                                /* renamed from: e */
                                                final /* synthetic */ Date f37610e;

                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                    DeviceAuthDialog.this.mo26650a(this.f37606a, this.f37607b, this.f37608c, this.f37609d, this.f37610e);
                                                }

                                                {
                                                    this.f37606a = r2;
                                                    this.f37607b = r3;
                                                    this.f37608c = r4;
                                                    this.f37609d = r5;
                                                    this.f37610e = r6;
                                                }
                                            };
                                            cancelable.setNegativeButton(a, r2).setPositiveButton(string5, new OnClickListener() {
                                                public final void onClick(DialogInterface dialogInterface, int i) {
                                                    DeviceAuthDialog.this.f37591c.setContentView(DeviceAuthDialog.this.mo26645a(false));
                                                    DeviceAuthDialog.this.mo26649a(DeviceAuthDialog.this.f37594f);
                                                }
                                            });
                                            builder.create().show();
                                        } catch (JSONException e) {
                                            DeviceAuthDialog.this.mo26647a(new C14457k((Throwable) e));
                                        }
                                    }
                                }

                                {
                                    this.f37612a = r2;
                                    this.f37613b = r3;
                                    this.f37614c = r4;
                                }
                            });
                            graphRequest.mo25314b();
                        } catch (JSONException e2) {
                            e = e2;
                            r1 = this;
                            DeviceAuthDialog.this.mo26647a(new C14457k((Throwable) e));
                        }
                    }
                }
            }
        });
        return graphRequest;
    }

    /* renamed from: a */
    public final void mo26646a() {
        this.f37590b.f37620e = new Date().getTime();
        this.f37599k = m29607d().mo25314b();
    }

    /* renamed from: b */
    public final void mo26651b() {
        this.f37600l = DeviceAuthMethodHandler.m29620c().schedule(new Runnable() {
            public final void run() {
                DeviceAuthDialog.this.mo26646a();
            }
        }, this.f37590b.f37619d, TimeUnit.SECONDS);
    }

    public final void onDestroy() {
        this.f37592d = true;
        this.f37589a.set(true);
        super.onDestroy();
        if (this.f37599k != null) {
            this.f37599k.cancel(true);
        }
        if (this.f37600l != null) {
            this.f37600l.cancel(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo26652c() {
        if (this.f37589a.compareAndSet(false, true)) {
            if (this.f37590b != null) {
                C13853a.m28176c(this.f37590b.f37617b);
            }
            if (this.f37598j != null) {
                this.f37598j.mo26665w_();
            }
            C14519b.m29738a(this.f37591c);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f37592d) {
            mo26652c();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f37590b != null) {
            bundle.putParcelable("request_state", this.f37590b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26647a(C14457k kVar) {
        if (this.f37589a.compareAndSet(false, true)) {
            if (this.f37590b != null) {
                C13853a.m28176c(this.f37590b.f37617b);
            }
            this.f37598j.mo26662a((Exception) kVar);
            C14519b.m29738a(this.f37591c);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        this.f37591c = new Dialog(getActivity(), R.style.sq);
        if (!C13853a.m28175b() || this.f37593e) {
            z = false;
        } else {
            z = true;
        }
        this.f37591c.setContentView(mo26645a(z));
        return this.f37591c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo26645a(boolean z) {
        View inflate = getActivity().getLayoutInflater().inflate(m29606b(z), null);
        this.f37595g = inflate.findViewById(R.id.c66);
        this.f37596h = (TextView) inflate.findViewById(R.id.yq);
        ((Button) inflate.findViewById(R.id.qb)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                DeviceAuthDialog.this.mo26652c();
            }
        });
        this.f37597i = (TextView) inflate.findViewById(R.id.wb);
        this.f37597i.setText(Html.fromHtml(getString(R.string.a68)));
        return inflate;
    }

    /* renamed from: a */
    public final void mo26648a(RequestState requestState) {
        this.f37590b = requestState;
        this.f37596h.setText(requestState.f37617b);
        this.f37597i.setCompoundDrawablesWithIntrinsicBounds(null, new BitmapDrawable(getResources(), C13853a.m28174b(requestState.f37616a)), null, null);
        this.f37596h.setVisibility(0);
        this.f37595g.setVisibility(8);
        if (!this.f37593e && C13853a.m28173a(requestState.f37617b)) {
            new C13589l(getContext()).mo25406a("fb_smart_login_service");
        }
        if (requestState.mo26657a()) {
            mo26651b();
        } else {
            mo26646a();
        }
    }

    /* renamed from: a */
    public final void mo26649a(Request request) {
        this.f37594f = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.f37639b));
        String str = request.f37644g;
        if (str != null) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = request.f37646i;
        if (str2 != null) {
            bundle.putString("target_user_id", str2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C14283ab.m29309b());
        sb.append("|");
        sb.append(C14283ab.m29312c());
        bundle.putString("access_token", sb.toString());
        bundle.putString("device_info", C13853a.m28172a());
        GraphRequest graphRequest = new GraphRequest(null, "device/login", bundle, C14697u.POST, new C13501b() {
            /* renamed from: a */
            public final void mo25316a(C14696t tVar) {
                if (!DeviceAuthDialog.this.f37592d) {
                    if (tVar.f38086d != null) {
                        DeviceAuthDialog.this.mo26647a(tVar.f38086d.f35211n);
                        return;
                    }
                    JSONObject jSONObject = tVar.f38084b;
                    RequestState requestState = new RequestState();
                    try {
                        String string = jSONObject.getString("user_code");
                        requestState.f37617b = string;
                        requestState.f37616a = C2240a.m6773a(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{string});
                        requestState.f37618c = jSONObject.getString("code");
                        requestState.f37619d = jSONObject.getLong("interval");
                        DeviceAuthDialog.this.mo26648a(requestState);
                    } catch (JSONException e) {
                        DeviceAuthDialog.this.mo26647a(new C14457k((Throwable) e));
                    }
                }
            }
        });
        graphRequest.mo25314b();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f37598j = (DeviceAuthMethodHandler) ((C14522e) ((FacebookActivity) getActivity()).f35196b).f37730a.mo26684c();
        if (bundle != null) {
            RequestState requestState = (RequestState) bundle.getParcelable("request_state");
            if (requestState != null) {
                mo26648a(requestState);
            }
        }
        return onCreateView;
    }

    /* renamed from: a */
    public final void mo26650a(String str, C14282c cVar, String str2, Date date, Date date2) {
        C14282c cVar2 = cVar;
        this.f37598j.mo26663a(str2, C14533n.m29777k(), str, cVar2.f37199a, cVar2.f37200b, cVar2.f37201c, C13739d.DEVICE_AUTH, date, null, date2);
        C14519b.m29738a(this.f37591c);
    }
}
