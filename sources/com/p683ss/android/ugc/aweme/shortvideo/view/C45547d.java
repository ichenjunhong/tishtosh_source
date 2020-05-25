package com.p683ss.android.ugc.aweme.shortvideo.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.d */
public class C45547d extends ProgressDialog implements OnKeyListener {

    /* renamed from: a */
    public boolean f115095a = true;

    /* renamed from: b */
    private boolean f115096b;

    /* renamed from: c */
    private CharSequence f115097c;

    /* renamed from: d */
    private Drawable f115098d;

    /* renamed from: e */
    private String f115099e;

    /* renamed from: f */
    private long f115100f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91828a() {
        View findViewById = findViewById(R.id.c62);
        if (findViewById != null) {
            if (this.f115095a) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo91829b() {
        CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.b25);
        if (circularProgressView != null) {
            circularProgressView.mo49173b();
        }
        super.dismiss();
    }

    public void dismiss() {
        C45548e eVar = new C45548e(this);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eVar.run();
        } else {
            C18842a.m45934b(eVar);
        }
    }

    public void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.f115096b) {
            CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.b25);
            if (circularProgressView != null) {
                circularProgressView.setIndeterminate(z);
            }
            TextView textView = (TextView) findViewById(R.id.c62);
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
    }

    public void setMessage(CharSequence charSequence) {
        int i;
        super.setMessage(charSequence);
        if (this.f115096b) {
            TextView textView = (TextView) findViewById(R.id.bld);
            if (textView != null) {
                textView.setText(charSequence);
                if (TextUtils.isEmpty(charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                textView.setVisibility(i);
            }
        }
        this.f115097c = charSequence;
    }

    public void setProgress(int i) {
        super.setProgress(i);
        TextView textView = (TextView) findViewById(R.id.c62);
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("%");
            textView.setText(sb.toString());
        }
        CircularProgressView circularProgressView = (CircularProgressView) findViewById(R.id.b25);
        if (circularProgressView != null) {
            circularProgressView.setProgress((float) i);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.a26);
        this.f115096b = true;
        setMessage(this.f115097c);
        setIndeterminate(false);
        String str = this.f115099e;
        if (this.f115096b) {
            TextView textView = (TextView) findViewById(R.id.d0l);
            if (textView != null && !C9431p.m18664a(str)) {
                textView.setText(str);
                C9432q.m18691b((View) textView, 0);
            }
        }
        this.f115099e = str;
        if (this.f115098d != null) {
            Drawable drawable = this.f115098d;
            if (this.f115096b) {
                View findViewById = findViewById(R.id.cfc);
                if (findViewById != null) {
                    findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C0726c.m2091a(getContext(), (int) R.drawable.h1)}));
                }
            }
            this.f115098d = drawable;
        }
        setOnKeyListener(this);
        this.f115100f = System.currentTimeMillis();
    }

    public C45547d(Context context, int i) {
        super(context, 3);
    }

    /* renamed from: b */
    public static C45547d m99208b(Context context, String str) {
        C45547d dVar = new C45547d(context, 3);
        dVar.setCancelable(false);
        dVar.setIndeterminate(false);
        dVar.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            dVar.show();
        }
        dVar.setMessage(str);
        dVar.mo91828a();
        return dVar;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("time", (currentTimeMillis - this.f115100f) / 1000);
            } catch (JSONException unused) {
            }
            C23569o.m57779a("ug_save_video_click_back", jSONObject);
        }
        return false;
    }
}
