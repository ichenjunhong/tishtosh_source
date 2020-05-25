package com.bytedance.ies.safemode;

import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.app.C1160b.C1161a;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class SafeModeActivity extends AppCompatActivity {

    /* renamed from: a */
    public static final C10991b f29520a = new C10991b(null);

    /* renamed from: b */
    HashMap f29521b;

    /* renamed from: com.bytedance.ies.safemode.SafeModeActivity$a */
    public static final class C10990a extends AsyncTask<C52860x, C52860x, C52860x> {

        /* renamed from: a */
        private final WeakReference<Activity> f29522a;

        public C10990a(WeakReference<Activity> weakReference) {
            C52711k.m112240b(weakReference, "activityRef");
            this.f29522a = weakReference;
        }

        public final /* synthetic */ void onPostExecute(Object obj) {
            C52860x xVar = (C52860x) obj;
            Activity activity = (Activity) this.f29522a.get();
            if (activity != null) {
                C52711k.m112240b(activity, "$this$restartApplication");
                activity.finish();
                C11000f.m22268b(activity);
            }
        }

        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            C52711k.m112240b((C52860x[]) objArr, "params");
            Activity activity = (Activity) this.f29522a.get();
            if (activity != null) {
                Application application = activity.getApplication();
                if (application != null) {
                    C10996b a = C10996b.m22262a(application);
                    try {
                        C52711k.m112236a((Object) a, "protector");
                        a.f29539h.onReceiveValue(new C10997c(false, false, 3, null));
                    } catch (Throwable unused) {
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.safemode.SafeModeActivity$b */
    public static final class C10991b {
        private C10991b() {
        }

        public /* synthetic */ C10991b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.safemode.SafeModeActivity$c */
    static final class C10992c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SafeModeActivity f29523a;

        /* renamed from: b */
        final /* synthetic */ C10996b f29524b;

        C10992c(SafeModeActivity safeModeActivity, C10996b bVar) {
            this.f29523a = safeModeActivity;
            this.f29524b = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C10996b bVar = this.f29524b;
            C52711k.m112236a((Object) bVar, "protector");
            bVar.f29533b.mo19824b(Integer.valueOf(0));
            SafeModeActivity safeModeActivity = this.f29523a;
            if (safeModeActivity.f29521b == null) {
                safeModeActivity.f29521b = new HashMap();
            }
            View view = (View) safeModeActivity.f29521b.get(Integer.valueOf(R.id.bhy));
            if (view == null) {
                view = safeModeActivity.findViewById(R.id.bhy);
                safeModeActivity.f29521b.put(Integer.valueOf(R.id.bhy), view);
            }
            TextView textView = (TextView) view;
            C52711k.m112236a((Object) textView, "loading_view");
            textView.setVisibility(0);
            new C10990a(new WeakReference(this.f29523a)).execute(new C52860x[0]);
        }
    }

    /* renamed from: com.bytedance.ies.safemode.SafeModeActivity$d */
    static final class C10993d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SafeModeActivity f29525a;

        /* renamed from: b */
        final /* synthetic */ C10996b f29526b;

        C10993d(SafeModeActivity safeModeActivity, C10996b bVar) {
            this.f29525a = safeModeActivity;
            this.f29526b = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C10996b bVar = this.f29526b;
            C52711k.m112236a((Object) bVar, "protector");
            bVar.f29533b.mo19824b(Integer.valueOf(0));
            this.f29525a.finish();
            C11000f.m22268b(this.f29525a);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        setContentView((int) R.layout.axf);
        C10996b a = C10996b.m22262a(getApplication());
        new C1161a(this).mo3770b((CharSequence) getApplicationContext().getString(R.string.fka)).mo3765a((CharSequence) getApplicationContext().getString(R.string.fk9), (OnClickListener) new C10992c(this, a)).mo3771b((CharSequence) getApplicationContext().getString(R.string.fk_), (OnClickListener) new C10993d(this, a)).mo3766a(false).mo3775c();
        C10996b a2 = C10996b.m22262a(getApplication());
        C52711k.m112236a((Object) a2, "BootProtector.getInstance(application)");
        Runnable runnable = a2.f29541j;
        if (runnable != null) {
            runnable.run();
        }
    }
}
