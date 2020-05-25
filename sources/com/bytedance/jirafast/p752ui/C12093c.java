package com.bytedance.jirafast.p752ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.bytedance.jirafast.models.C12055e;
import com.bytedance.jirafast.p751d.C12015a;
import com.bytedance.jirafast.p751d.C12040j;
import com.bytedance.jirafast.p751d.C12045n;
import com.bytedance.jirafast.p751d.C12045n.C12047a;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.bytedance.jirafast.ui.c */
public final class C12093c extends Fragment {

    /* renamed from: a */
    public List<String> f31990a;

    /* renamed from: b */
    public List<String> f31991b;

    /* renamed from: c */
    public String f31992c;

    /* renamed from: d */
    public String f31993d;

    /* renamed from: e */
    public ProgressDialog f31994e;

    /* renamed from: f */
    public EditText f31995f;

    /* renamed from: g */
    public EditText f31996g;

    /* renamed from: h */
    public C12045n f31997h;

    /* renamed from: i */
    private String f31998i;

    /* renamed from: j */
    private Button f31999j;

    /* renamed from: com.bytedance.jirafast.ui.c$a */
    static class C12095a extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        public final WeakReference<C12093c> f32001a;

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            if (this.f32001a.get() != null) {
                ((C12093c) this.f32001a.get()).f31994e.setTitle(R.string.gns);
                ((C12093c) this.f32001a.get()).f31994e.setMessage("Sending...");
                ((C12093c) this.f32001a.get()).f31994e.show();
            }
        }

        public C12095a(C12093c cVar) {
            this.f32001a = new WeakReference<>(cVar);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            String str = "";
            if (this.f32001a.get() == null) {
                return str;
            }
            C12093c cVar = (C12093c) this.f32001a.get();
            String trim = cVar.f31996g.getText().toString().trim();
            String obj = cVar.f31995f.getText().toString();
            StringBuilder sb = new StringBuilder();
            sb.append(System.getProperty("line.separator"));
            sb.append("------ App Info ------");
            sb.append(System.getProperty("line.separator"));
            sb.append("网络状态：");
            sb.append(C12040j.m24494a(cVar.getContext()));
            sb.append("\n\n");
            sb.append(cVar.f31992c);
            sb.append("\n");
            sb.append(cVar.f31993d);
            String concat = obj.concat(sb.toString());
            C12015a.m24416a().mo22756a(C12015a.f31776q, trim);
            int indexOf = trim.indexOf("@");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            String str2 = trim;
            C12015a a = C12015a.m24416a();
            C12055e eVar = new C12055e(a.f31785y.getInt(C12015a.f31774o, 0), str2, concat, cVar.f31990a, cVar.f31991b);
            return cVar.f31997h.mo22790a(eVar);
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            if (this.f32001a.get() != null) {
                C12015a.m24416a().mo22757a(C12015a.f31777r, false);
                ((C12093c) this.f32001a.get()).f31994e.dismiss();
                Context context = ((C12093c) this.f32001a.get()).getContext();
                if (!TextUtils.isEmpty(str)) {
                    Toast makeText = Toast.makeText(context, str, 1);
                    if (VERSION.SDK_INT == 25) {
                        C47905fy.m103630a(makeText);
                    }
                    makeText.show();
                    return;
                }
                String trim = ((C12093c) this.f32001a.get()).f31996g.getText().toString().trim();
                int indexOf = trim.indexOf("@");
                if (indexOf > 0) {
                    trim.substring(0, indexOf);
                }
                new C1161a(context, R.style.mp).mo3770b((CharSequence) "Issue received, we've created a Lark group to follow up").mo3771b((CharSequence) "Done", (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ((C12093c) C12095a.this.f32001a.get()).getActivity().finish();
                    }
                }).mo3772b().show();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31997h = C12047a.f31845a;
        Bundle arguments = getArguments();
        this.f31990a = arguments.getStringArrayList("imgfilepath");
        this.f31991b = arguments.getStringArrayList("txtfilepath");
        this.f31992c = arguments.getString("momorydes");
        this.f31993d = arguments.getString("sddes");
        this.f31998i = arguments.getString("email");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.bj_, viewGroup, false);
        this.f31995f = (EditText) inflate.findViewById(R.id.a4m);
        this.f31996g = (EditText) inflate.findViewById(R.id.es0);
        this.f31998i = C12015a.m24416a().mo22755a(C12015a.f31781v);
        if (!TextUtils.isEmpty(this.f31998i)) {
            this.f31996g.setText(this.f31998i);
        } else {
            this.f31996g.setText(C12015a.m24416a().mo22755a(C12015a.f31776q));
        }
        this.f31999j = (Button) inflate.findViewById(R.id.e5r);
        this.f31994e = new ProgressDialog(getContext());
        this.f31999j.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                String obj = C12093c.this.f31996g.getText().toString();
                if (TextUtils.isEmpty(C12093c.this.f31995f.getText().toString())) {
                    C12097d.m24526a(Toast.makeText(C12093c.this.getContext(), "Please  describe the problem", 1));
                } else if (TextUtils.isEmpty(obj)) {
                    C12097d.m24526a(Toast.makeText(C12093c.this.getContext(), "Please fill in your Bytedance Email Prefix", 1));
                } else {
                    new C12095a(C12093c.this).execute(new Void[0]);
                }
            }
        });
        return inflate;
    }
}
