package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.app.C1164e;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.p */
public final class C40454p extends C1164e {

    /* renamed from: a */
    public Context f103280a;

    /* renamed from: b */
    public EditText f103281b;

    /* renamed from: c */
    public Button f103282c;

    /* renamed from: d */
    public ImageButton f103283d;

    /* renamed from: e */
    public C40453o f103284e;

    /* renamed from: f */
    public User f103285f;

    /* renamed from: g */
    public String f103286g = "";

    /* renamed from: h */
    public int f103287h;

    /* renamed from: i */
    private View f103288i;

    /* renamed from: j */
    private DmtTextView f103289j;

    /* renamed from: k */
    private DmtTextView f103290k;

    /* renamed from: l */
    private Button f103291l;

    public final void cancel() {
        m89880a();
        super.cancel();
    }

    public final void dismiss() {
        m89880a();
        super.dismiss();
    }

    /* renamed from: a */
    private void m89880a() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f103281b.getWindowToken(), 0);
        }
    }

    public C40454p(Context context) {
        super(context);
        this.f103280a = context;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        this.f103288i = LayoutInflater.from(this.f103280a).inflate(R.layout.kn, null);
        setContentView(this.f103288i);
        this.f103289j = (DmtTextView) this.f103288i.findViewById(R.id.den);
        this.f103281b = (EditText) this.f103288i.findViewById(R.id.ac8);
        this.f103290k = (DmtTextView) this.f103288i.findViewById(R.id.dem);
        this.f103291l = (Button) this.f103288i.findViewById(R.id.cb5);
        this.f103282c = (Button) this.f103288i.findViewById(R.id.cb6);
        this.f103283d = (ImageButton) this.f103288i.findViewById(R.id.nh);
        this.f103291l.setOnClickListener(new C40456q(this));
        int i = 0;
        if (this.f103287h == 1) {
            this.f103289j.setText(R.string.aw0);
            this.f103290k.setText(R.string.avy);
            this.f103290k.setVisibility(0);
        } else {
            this.f103289j.setText(R.string.avz);
            this.f103290k.setVisibility(8);
        }
        if (this.f103285f != null && TextUtils.isEmpty(this.f103286g)) {
            if (!TextUtils.isEmpty(this.f103285f.getRemarkName())) {
                this.f103286g = this.f103285f.getRemarkName();
            } else {
                this.f103286g = this.f103285f.getNickname();
            }
        }
        this.f103281b.setText(this.f103286g);
        this.f103281b.setSelection(this.f103281b.getText().length());
        this.f103282c.setOnClickListener(new C40457r(this));
        this.f103281b.addTextChangedListener(new C23698l() {
            public final void afterTextChanged(Editable editable) {
                String str;
                String str2;
                if (Character.codePointCount(editable, 0, editable.length()) > 20) {
                    C10691a.m21545b(C40454p.this.f103280a, C40454p.this.f103280a.getString(R.string.rc)).mo19066a();
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    String obj = editable.toString();
                    if (selectionEnd == 0) {
                        str = "";
                    } else {
                        str = obj.substring(0, selectionEnd);
                    }
                    if (selectionEnd == obj.length()) {
                        str2 = "";
                    } else {
                        str2 = obj.substring(selectionEnd);
                    }
                    int codePointCount = Character.codePointCount(str2, 0, str2.length());
                    StringBuilder sb = new StringBuilder();
                    int i = 20 - codePointCount;
                    for (int i2 = 0; i2 < i; i2++) {
                        sb.append(Character.toChars(Character.codePointAt(str, sb.length())));
                    }
                    sb.append(str2);
                    C40454p.this.f103281b.setText(sb.toString());
                    Selection.setSelection(C40454p.this.f103281b.getText(), Math.min(C40454p.this.f103281b.length() - str2.length(), C40454p.this.f103281b.length()));
                }
                if (TextUtils.isEmpty(editable)) {
                    C40454p.this.f103283d.setVisibility(4);
                } else {
                    C40454p.this.f103283d.setVisibility(0);
                }
                if (C40454p.this.f103287h == 1) {
                    if (editable.toString().trim().length() > 0) {
                        C40454p.this.f103282c.setEnabled(true);
                        C40454p.this.f103282c.setAlpha(1.0f);
                        return;
                    }
                    C40454p.this.f103282c.setEnabled(false);
                    C40454p.this.f103282c.setAlpha(0.34f);
                }
            }
        });
        ImageButton imageButton = this.f103283d;
        if (this.f103281b.getText().length() <= 0) {
            i = 4;
        }
        imageButton.setVisibility(i);
        this.f103283d.setOnClickListener(new C40458s(this));
        setOnShowListener(new C40459t(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo82748a(String str, C0013i iVar) throws Exception {
        if (iVar.mo33d() || iVar.mo31c()) {
            C10691a.m21542b(this.f103280a, (int) R.string.d_4).mo19066a();
        } else {
            CommitRemarkNameResponse commitRemarkNameResponse = (CommitRemarkNameResponse) iVar.mo34e();
            if (commitRemarkNameResponse.isOK()) {
                this.f103285f.setRemarkName(str);
                if (this.f103284e != null) {
                    this.f103284e.mo65278a();
                }
            } else if (commitRemarkNameResponse.statusCode == 2550) {
                C10691a.m21542b(this.f103280a, (int) R.string.d6k).mo19066a();
            } else {
                C10691a.m21545b(this.f103280a, commitRemarkNameResponse.statusMsg).mo19066a();
            }
        }
        return null;
    }
}
