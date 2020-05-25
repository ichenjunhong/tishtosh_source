package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.support.p030v4.app.C0610aa.C0611a;
import android.support.p030v4.app.C0610aa.C0613c;
import android.support.p030v4.app.C0610aa.C0614d;
import android.support.p030v4.app.C0610aa.C0618g;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.FragmentActivity;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C15279bh;
import com.google.android.gms.common.api.internal.C15335g;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.C15444e;
import com.google.android.gms.common.internal.C15445f;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.C15472v;
import com.google.android.gms.common.internal.C15473w;
import com.google.android.gms.common.util.C15518i;
import com.google.android.gms.common.util.C15524o;
import com.google.android.gms.internal.p1042c.C16478e;
import com.p683ss.android.socialbase.downloader.impls.C19974n;
import com.ss.android.ugc.trill.R;

public class GoogleApiAvailability extends C15369c {
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C15369c.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final Object mLock = new Object();
    private static final GoogleApiAvailability zaao = new GoogleApiAvailability();
    private String zaap;

    /* renamed from: com.google.android.gms.common.GoogleApiAvailability$a */
    class C15202a extends C16478e {

        /* renamed from: a */
        private final Context f39253a;

        public C15202a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f39253a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                int isGooglePlayServicesAvailable = GoogleApiAvailability.this.isGooglePlayServicesAvailable(this.f39253a);
                if (GoogleApiAvailability.this.isUserResolvableError(isGooglePlayServicesAvailable)) {
                    GoogleApiAvailability.this.showErrorNotification(this.f39253a, isGooglePlayServicesAvailable);
                }
            }
        }
    }

    public static GoogleApiAvailability getInstance() {
        return zaao;
    }

    GoogleApiAvailability() {
    }

    public Dialog getErrorDialog(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return zaa((Context) activity, i, (C15445f) new C15472v(getErrorResolutionIntent(activity, i, "d"), activity, i2), onCancelListener);
    }

    public final boolean zaa(Activity activity, C15335g gVar, int i, int i2, OnCancelListener onCancelListener) {
        Dialog zaa = zaa((Context) activity, i, (C15445f) new C15473w(getErrorResolutionIntent(activity, i, "d"), gVar, 2), onCancelListener);
        if (zaa == null) {
            return false;
        }
        zaa(activity, zaa, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public boolean showErrorDialogFragment(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zaa(activity, errorDialog, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void showErrorNotification(Context context, int i) {
        zaa(context, i, (String) null, getErrorResolutionPendingIntent(context, i, 0, C19974n.f54904f));
    }

    public final boolean zaa(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult);
        if (errorResolutionPendingIntent == null) {
            return false;
        }
        zaa(context, connectionResult.f39246b, (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m31451a(context, errorResolutionPendingIntent, i, true), 134217728));
        return true;
    }

    public static Dialog zaa(Activity activity, OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C15444e.m32091b(activity, 18));
        builder.setPositiveButton("", null);
        AlertDialog create = builder.create();
        zaa(activity, (Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final zabq zaa(Context context, C15279bh bhVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabq zabq = new zabq(bhVar);
        context.registerReceiver(zabq, intentFilter);
        zabq.f39645a = context;
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabq;
        }
        bhVar.mo28181a();
        zabq.mo28298a();
        return null;
    }

    private final String zag() {
        String str;
        synchronized (mLock) {
            str = this.zaap;
        }
        return str;
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    public int isGooglePlayServicesAvailable(Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        if (connectionResult.mo28023a()) {
            return connectionResult.f39247c;
        }
        return getErrorResolutionPendingIntent(context, connectionResult.f39246b, 0);
    }

    public final String getErrorString(int i) {
        return super.getErrorString(i);
    }

    static Dialog zaa(Context context, int i, C15445f fVar, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(context, 5);
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(C15444e.m32091b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = C15444e.m32092c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, fVar);
        }
        String a = C15444e.m32088a(context, i);
        if (a != null) {
            builder.setTitle(a);
        }
        return builder.create();
    }

    static void zaa(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            C0654k supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            C15477j jVar = new C15477j();
            Dialog dialog2 = (Dialog) C15464q.m32124a(dialog, (Object) "Cannot display null dialog");
            dialog2.setOnCancelListener(null);
            dialog2.setOnDismissListener(null);
            jVar.f39886a = dialog2;
            if (onCancelListener != null) {
                jVar.f39887b = onCancelListener;
            }
            jVar.show(supportFragmentManager, str);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        C15367b bVar = new C15367b();
        Dialog dialog3 = (Dialog) C15464q.m32124a(dialog, (Object) "Cannot display null dialog");
        dialog3.setOnCancelListener(null);
        dialog3.setOnDismissListener(null);
        bVar.f39648a = dialog3;
        if (onCancelListener != null) {
            bVar.f39649b = onCancelListener;
        }
        bVar.show(fragmentManager, str);
    }

    private final void zaa(Context context, int i, String str, PendingIntent pendingIntent) {
        String str2;
        String str3;
        int i2;
        if (i == 18) {
            zaa(context);
        } else if (pendingIntent != null) {
            if (i == 6) {
                str2 = C15444e.m32089a(context, "common_google_play_services_resolution_required_title");
            } else {
                str2 = C15444e.m32088a(context, i);
            }
            if (str2 == null) {
                str2 = context.getResources().getString(R.string.acn);
            }
            if (i == 6) {
                str3 = C15444e.m32090a(context, "common_google_play_services_resolution_required_text", C15444e.m32087a(context));
            } else {
                str3 = C15444e.m32091b(context, i);
            }
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C0614d dVar = new C0614d(context);
            dVar.f2225x = true;
            C0614d a = dVar.mo2126b(true).mo2118a((CharSequence) str2).mo2117a((C0618g) new C0613c().mo2109c(str3));
            if (C15518i.m32284a(context)) {
                C15464q.m32129a(C15524o.m32298f());
                a.mo2111a(context.getApplicationInfo().icon).mo2128c(2);
                if (C15518i.m32285b(context)) {
                    a.f2203b.add(new C0611a(2131952747, resources.getString(R.string.aeq), pendingIntent));
                } else {
                    a.mo2114a(pendingIntent);
                }
            } else {
                a.mo2111a(17301642).mo2131d((CharSequence) resources.getString(R.string.acn)).mo2113a(System.currentTimeMillis()).mo2114a(pendingIntent).mo2125b((CharSequence) str3);
            }
            if (C15524o.m32301i()) {
                C15464q.m32129a(C15524o.m32301i());
                String zag = zag();
                if (zag == null) {
                    zag = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(zag);
                    String string = context.getResources().getString(R.string.acm);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(zag, string, 4));
                    } else if (!string.equals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                a.mo2119a(zag);
            }
            Notification b = a.mo2122b();
            switch (i) {
                case 1:
                case 2:
                case 3:
                    i2 = 10436;
                    C15384g.f39686c.set(false);
                    break;
                default:
                    i2 = 39789;
                    break;
            }
            notificationManager.notify(i2, b);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void zaa(Context context) {
        new C15202a(context).sendEmptyMessageDelayed(1, 120000);
    }
}
