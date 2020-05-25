package com.p683ss.android.ugc.aweme.tools.debug;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity */
public final class AVSchemaTestActivity extends AmeActivity {

    /* renamed from: a */
    public final String f118585a = "openRecord";

    /* renamed from: b */
    public final String f118586b = "studio/create";

    /* renamed from: c */
    public final String f118587c = "publishVideo";

    /* renamed from: d */
    public final String f118588d = C23057c.f61423a;

    /* renamed from: e */
    public final String f118589e = "aweme";

    /* renamed from: f */
    public String f118590f = m101975a();

    /* renamed from: g */
    public String f118591g = this.f118586b;

    /* renamed from: h */
    public String f118592h = "";

    /* renamed from: i */
    public String f118593i = "";

    /* renamed from: j */
    public String f118594j = "";

    /* renamed from: k */
    public String f118595k = "";

    /* renamed from: l */
    private final String f118596l = "准备打开的链接是:";

    /* renamed from: m */
    private String f118597m = "";

    /* renamed from: n */
    private HashMap f118598n;

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$a */
    public static abstract class C46939a implements TextWatcher {
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$b */
    public static final class C46940b extends C46939a {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f118599a;

        C46940b(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f118599a = aVSchemaTestActivity;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            if (editable != null) {
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f118599a.f118593i = editable.toString();
                    EditText editText = (EditText) this.f118599a.mo94233a(R.id.abg);
                    C52711k.m112236a((Object) editText, "etMusic");
                    editText.setEnabled(false);
                    EditText editText2 = (EditText) this.f118599a.mo94233a(R.id.abh);
                    C52711k.m112236a((Object) editText2, "etSticker");
                    editText2.setEnabled(false);
                    this.f118599a.mo94235c();
                }
            }
            this.f118599a.f118593i = "";
            EditText editText3 = (EditText) this.f118599a.mo94233a(R.id.abg);
            C52711k.m112236a((Object) editText3, "etMusic");
            editText3.setEnabled(true);
            EditText editText4 = (EditText) this.f118599a.mo94233a(R.id.abh);
            C52711k.m112236a((Object) editText4, "etSticker");
            editText4.setEnabled(true);
            this.f118599a.mo94235c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$c */
    public static final class C46941c extends C46939a {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f118600a;

        C46941c(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f118600a = aVSchemaTestActivity;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            if (editable != null) {
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f118600a.f118592h = editable.toString();
                    EditText editText = (EditText) this.f118600a.mo94233a(R.id.abg);
                    C52711k.m112236a((Object) editText, "etMusic");
                    editText.setEnabled(false);
                    EditText editText2 = (EditText) this.f118600a.mo94233a(R.id.abd);
                    C52711k.m112236a((Object) editText2, "etChallenge");
                    editText2.setEnabled(false);
                    this.f118600a.mo94235c();
                }
            }
            this.f118600a.f118592h = "";
            EditText editText3 = (EditText) this.f118600a.mo94233a(R.id.abg);
            C52711k.m112236a((Object) editText3, "etMusic");
            editText3.setEnabled(true);
            EditText editText4 = (EditText) this.f118600a.mo94233a(R.id.abd);
            C52711k.m112236a((Object) editText4, "etChallenge");
            editText4.setEnabled(true);
            this.f118600a.mo94235c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$d */
    public static final class C46942d extends C46939a {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f118601a;

        C46942d(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f118601a = aVSchemaTestActivity;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            if (editable != null) {
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f118601a.f118594j = editable.toString();
                    EditText editText = (EditText) this.f118601a.mo94233a(R.id.abd);
                    C52711k.m112236a((Object) editText, "etChallenge");
                    editText.setEnabled(false);
                    EditText editText2 = (EditText) this.f118601a.mo94233a(R.id.abh);
                    C52711k.m112236a((Object) editText2, "etSticker");
                    editText2.setEnabled(false);
                    this.f118601a.mo94235c();
                }
            }
            this.f118601a.f118594j = "";
            EditText editText3 = (EditText) this.f118601a.mo94233a(R.id.abd);
            C52711k.m112236a((Object) editText3, "etChallenge");
            editText3.setEnabled(true);
            EditText editText4 = (EditText) this.f118601a.mo94233a(R.id.abh);
            C52711k.m112236a((Object) editText4, "etSticker");
            editText4.setEnabled(true);
            this.f118601a.mo94235c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$e */
    public static final class C46943e extends C46939a {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f118602a;

        C46943e(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f118602a = aVSchemaTestActivity;
        }

        public final void afterTextChanged(Editable editable) {
            this.f118602a.mo94235c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$f */
    public static final class C46944f extends C46939a {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f118603a;

        C46944f(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f118603a = aVSchemaTestActivity;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            AVSchemaTestActivity aVSchemaTestActivity = this.f118603a;
            if (editable != null) {
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = editable.toString();
                    aVSchemaTestActivity.f118595k = str;
                    this.f118603a.mo94235c();
                }
            }
            str = "";
            aVSchemaTestActivity.f118595k = str;
            this.f118603a.mo94235c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$g */
    static final class C46945g implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f118604a;

        C46945g(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f118604a = aVSchemaTestActivity;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i == R.id.c8w) {
                this.f118604a.f118590f = AVSchemaTestActivity.m101975a();
            } else if (i == R.id.c8v) {
                this.f118604a.f118590f = this.f118604a.f118588d;
            } else if (i == R.id.c8u) {
                this.f118604a.f118590f = this.f118604a.f118589e;
            }
            this.f118604a.mo94235c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$h */
    static final class C46946h implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f118605a;

        C46946h(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f118605a = aVSchemaTestActivity;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i == R.id.c8y) {
                this.f118605a.f118591g = this.f118605a.f118586b;
            } else if (i == R.id.c8x) {
                this.f118605a.f118591g = this.f118605a.f118585a;
            } else if (i == R.id.er4) {
                this.f118605a.f118591g = this.f118605a.f118587c;
            }
            this.f118605a.mo94235c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$i */
    static final class C46947i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f118606a;

        C46947i(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f118606a = aVSchemaTestActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            String b = this.f118606a.mo94234b();
            if (C52830p.m112411b(b, this.f118606a.f118589e, false, 2, null)) {
                C41302w.m91042a().mo83861a(b);
                return;
            }
            Intent intent = new Intent();
            intent.setData(Uri.parse(b));
            this.f118606a.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity$j */
    static final class C46948j implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ AVSchemaTestActivity f118607a;

        C46948j(AVSchemaTestActivity aVSchemaTestActivity) {
            this.f118607a = aVSchemaTestActivity;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f118607a.mo94235c();
        }
    }

    /* renamed from: a */
    public static String m101975a() {
        return "snssdk1180";
    }

    /* renamed from: a */
    public final View mo94233a(int i) {
        if (this.f118598n == null) {
            this.f118598n = new HashMap();
        }
        View view = (View) this.f118598n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118598n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    public final void mo94235c() {
        TextView textView = (TextView) mo94233a(R.id.d6h);
        C52711k.m112236a((Object) textView, "tvUrl");
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118596l);
        sb.append(mo94234b());
        textView.setText(sb.toString());
    }

    /* renamed from: b */
    public final String mo94234b() {
        CheckBox checkBox = (CheckBox) mo94233a(R.id.r6);
        C52711k.m112236a((Object) checkBox, "cbUrl");
        if (checkBox.isChecked()) {
            EditText editText = (EditText) mo94233a(R.id.abi);
            C52711k.m112236a((Object) editText, "etUrl");
            return editText.getText().toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f118590f);
        sb.append("://");
        String sb2 = sb.toString();
        String str = this.f118591g;
        if (C52711k.m112239a((Object) str, (Object) this.f118586b)) {
            if (!TextUtils.isEmpty(this.f118592h)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(this.f118591g);
                sb3.append("?type=use_sticker&sticker_id=");
                sb3.append(this.f118592h);
                sb2 = sb3.toString();
                if (!TextUtils.isEmpty(this.f118597m)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb2);
                    sb4.append("&enter_from=");
                    sb4.append(this.f118597m);
                    sb2 = sb4.toString();
                }
            }
        } else if (C52711k.m112239a((Object) str, (Object) this.f118585a)) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append(this.f118591g);
            sb5.append("?recordOrigin=system&");
            sb2 = sb5.toString();
            if (!TextUtils.isEmpty(this.f118592h)) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(sb2);
                sb6.append("recordParam=sticker&id=");
                sb6.append(this.f118592h);
                sb2 = sb6.toString();
            } else if (!TextUtils.isEmpty(this.f118593i)) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb2);
                sb7.append("recordParam=challenge&id=");
                sb7.append(this.f118593i);
                sb2 = sb7.toString();
            } else if (!TextUtils.isEmpty(this.f118594j)) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(sb2);
                sb8.append("recordParam=music&id=");
                sb8.append(this.f118594j);
                sb2 = sb8.toString();
            } else if (!TextUtils.isEmpty(this.f118595k)) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(sb2);
                sb9.append("&tab=");
                sb9.append(this.f118595k);
                sb2 = sb9.toString();
            }
        } else if (C52711k.m112239a((Object) str, (Object) this.f118587c)) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb2);
            sb10.append(this.f118591g);
            sb10.append('?');
            sb2 = sb10.toString();
        }
        return sb2;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.aa);
        ((EditText) mo94233a(R.id.abd)).addTextChangedListener(new C46940b(this));
        ((EditText) mo94233a(R.id.abh)).addTextChangedListener(new C46941c(this));
        ((EditText) mo94233a(R.id.abg)).addTextChangedListener(new C46942d(this));
        ((EditText) mo94233a(R.id.abe)).addTextChangedListener(new C46943e(this));
        ((EditText) mo94233a(R.id.e7n)).addTextChangedListener(new C46944f(this));
        ((RadioGroup) mo94233a(R.id.cbz)).setOnCheckedChangeListener(new C46945g(this));
        ((RadioGroup) mo94233a(R.id.cc0)).setOnCheckedChangeListener(new C46946h(this));
        ((TextView) mo94233a(R.id.d6d)).setOnClickListener(new C46947i(this));
        ((CheckBox) mo94233a(R.id.r6)).setOnCheckedChangeListener(new C46948j(this));
        ((EditText) mo94233a(R.id.abh)).setText("89604");
        RadioButton radioButton = (RadioButton) mo94233a(R.id.c8v);
        C52711k.m112236a((Object) radioButton, "rbLocal");
        radioButton.setChecked(true);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity", "onCreate", false);
    }
}
