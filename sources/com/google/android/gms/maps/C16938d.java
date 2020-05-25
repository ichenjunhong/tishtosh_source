package com.google.android.gms.maps;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.C15373d;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.C15444e;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.maps.model.C16955d;
import com.google.android.gms.maps.p1046a.C16912c;
import com.google.android.gms.maps.p1046a.C16913d;
import com.google.android.gms.maps.p1046a.C16919j;
import com.google.android.gms.maps.p1046a.C16924o;
import com.google.android.gms.maps.p1046a.C16925p;
import com.google.android.gms.p1027a.C14880a;
import com.google.android.gms.p1027a.C14886d;
import com.google.android.gms.p1027a.C14887e;
import com.google.android.gms.p1027a.C14892i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.maps.d */
public final class C16938d extends FrameLayout {

    /* renamed from: a */
    private final C16940b f47711a;

    /* renamed from: com.google.android.gms.maps.d$a */
    static class C16939a implements C16913d {

        /* renamed from: a */
        private final ViewGroup f47712a;

        /* renamed from: b */
        private final C16912c f47713b;

        /* renamed from: c */
        private View f47714c;

        public C16939a(ViewGroup viewGroup, C16912c cVar) {
            this.f47713b = (C16912c) C15464q.m32123a(cVar);
            this.f47712a = (ViewGroup) C15464q.m32123a(viewGroup);
        }

        /* renamed from: a */
        public final void mo27244a() {
            try {
                this.f47713b.mo32649f();
            } catch (RemoteException e) {
                throw new C16955d(e);
            }
        }

        /* renamed from: a */
        public final void mo27245a(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C16924o.m41037a(bundle, bundle2);
                this.f47713b.mo32642a(bundle2);
                C16924o.m41037a(bundle2, bundle);
                this.f47714c = (View) C14886d.m30545a(this.f47713b.mo32648e());
                this.f47712a.removeAllViews();
                this.f47712a.addView(this.f47714c);
            } catch (RemoteException e) {
                throw new C16955d(e);
            }
        }

        /* renamed from: a */
        public final void mo32682a(C16942f fVar) {
            try {
                this.f47713b.mo32643a((C16919j) new C16944h(this, fVar));
            } catch (RemoteException e) {
                throw new C16955d(e);
            }
        }

        /* renamed from: b */
        public final void mo27246b() {
            try {
                this.f47713b.mo32641O_();
            } catch (RemoteException e) {
                throw new C16955d(e);
            }
        }

        /* renamed from: b */
        public final void mo27247b(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C16924o.m41037a(bundle, bundle2);
                this.f47713b.mo32645b(bundle2);
                C16924o.m41037a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new C16955d(e);
            }
        }

        /* renamed from: c */
        public final void mo27248c() {
            try {
                this.f47713b.mo32644b();
            } catch (RemoteException e) {
                throw new C16955d(e);
            }
        }

        /* renamed from: d */
        public final void mo27249d() {
            try {
                this.f47713b.mo32650g();
            } catch (RemoteException e) {
                throw new C16955d(e);
            }
        }

        /* renamed from: e */
        public final void mo27250e() {
            try {
                this.f47713b.mo32646c();
            } catch (RemoteException e) {
                throw new C16955d(e);
            }
        }

        /* renamed from: f */
        public final void mo27251f() {
            try {
                this.f47713b.mo32647d();
            } catch (RemoteException e) {
                throw new C16955d(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.d$b */
    static class C16940b extends C14880a<C16939a> {

        /* renamed from: c */
        final List<C16942f> f47715c = new ArrayList();

        /* renamed from: d */
        private final ViewGroup f47716d;

        /* renamed from: e */
        private final Context f47717e;

        /* renamed from: f */
        private C14887e<C16939a> f47718f;

        /* renamed from: g */
        private final GoogleMapOptions f47719g;

        C16940b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f47716d = viewGroup;
            this.f47717e = context;
            this.f47719g = null;
        }

        /* renamed from: a */
        public final void mo27240a(C14887e<C16939a> eVar) {
            this.f47718f = eVar;
            if (this.f47718f != null && this.f38412a == null) {
                try {
                    C16941e.m41107a(this.f47717e);
                    C16912c a = C16925p.m41039a(this.f47717e).mo32656a(C14886d.m30544a(this.f47717e), this.f47719g);
                    if (a != null) {
                        this.f47718f.mo27252a(new C16939a(this.f47716d, a));
                        for (C16942f a2 : this.f47715c) {
                            ((C16939a) this.f38412a).mo32682a(a2);
                        }
                        this.f47715c.clear();
                    }
                } catch (RemoteException e) {
                    throw new C16955d(e);
                } catch (C15373d unused) {
                }
            }
        }
    }

    public C16938d(Context context) {
        super(context);
        this.f47711a = new C16940b(this, context, null);
        setClickable(true);
    }

    /* renamed from: a */
    public final void mo32673a() {
        this.f47711a.mo27241b();
    }

    /* renamed from: c */
    public final void mo32678c() {
        this.f47711a.mo27237a();
    }

    /* renamed from: a */
    public final void mo32674a(Bundle bundle) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitAll().build());
        try {
            this.f47711a.mo27239a(bundle);
            if (this.f47711a.f38412a == null) {
                GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
                Context context = getContext();
                int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context);
                String b = C15444e.m32091b(context, isGooglePlayServicesAvailable);
                String c = C15444e.m32092c(context, isGooglePlayServicesAvailable);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new LayoutParams(-2, -2));
                addView(linearLayout);
                TextView textView = new TextView(getContext());
                textView.setLayoutParams(new LayoutParams(-2, -2));
                textView.setText(b);
                linearLayout.addView(textView);
                Intent errorResolutionIntent = instance.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null);
                if (errorResolutionIntent != null) {
                    Button button = new Button(context);
                    button.setId(16908313);
                    button.setLayoutParams(new LayoutParams(-2, -2));
                    button.setText(c);
                    linearLayout.addView(button);
                    button.setOnClickListener(new C14892i(context, errorResolutionIntent));
                }
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: b */
    public final void mo32676b() {
        C16940b bVar = this.f47711a;
        if (bVar.f38412a != null) {
            bVar.f38412a.mo27248c();
        } else {
            bVar.mo27238a(5);
        }
    }

    /* renamed from: d */
    public final void mo32679d() {
        C16940b bVar = this.f47711a;
        if (bVar.f38412a != null) {
            bVar.f38412a.mo27249d();
        } else {
            bVar.mo27238a(4);
        }
    }

    /* renamed from: e */
    public final void mo32680e() {
        C16940b bVar = this.f47711a;
        if (bVar.f38412a != null) {
            bVar.f38412a.mo27250e();
        } else {
            bVar.mo27238a(1);
        }
    }

    /* renamed from: f */
    public final void mo32681f() {
        C16940b bVar = this.f47711a;
        if (bVar.f38412a != null) {
            bVar.f38412a.mo27251f();
        }
    }

    /* renamed from: b */
    public final void mo32677b(Bundle bundle) {
        C16940b bVar = this.f47711a;
        if (bVar.f38412a != null) {
            bVar.f38412a.mo27247b(bundle);
            return;
        }
        if (bVar.f38413b != null) {
            bundle.putAll(bVar.f38413b);
        }
    }

    /* renamed from: a */
    public final void mo32675a(C16942f fVar) {
        C15464q.m32132b("getMapAsync() must be called on the main thread");
        C16940b bVar = this.f47711a;
        if (bVar.f38412a != null) {
            ((C16939a) bVar.f38412a).mo32682a(fVar);
        } else {
            bVar.f47715c.add(fVar);
        }
    }
}
