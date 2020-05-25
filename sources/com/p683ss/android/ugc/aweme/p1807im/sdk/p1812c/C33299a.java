package com.p683ss.android.ugc.aweme.p1807im.sdk.p1812c;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.app.C1164e;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33359af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35467d;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.c.a */
public final class C33299a extends C1164e {

    /* renamed from: a */
    public final C35467d f86359a;

    /* renamed from: b */
    public final C33303a f86360b;

    /* renamed from: c */
    public final C33303a f86361c;

    /* renamed from: d */
    public EditText f86362d;

    /* renamed from: e */
    private View f86363e;

    /* renamed from: f */
    private DmtTextView f86364f;

    /* renamed from: g */
    private AvatarImageView f86365g;

    /* renamed from: h */
    private ImageView f86366h;

    /* renamed from: i */
    private DmtTextView f86367i;

    /* renamed from: j */
    private Button f86368j;

    /* renamed from: k */
    private Button f86369k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.c.a$a */
    public interface C33303a {
        /* renamed from: a */
        void mo70637a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.c.a$b */
    public static class C33304b {

        /* renamed from: a */
        public Context f86373a;

        /* renamed from: b */
        public C35467d f86374b;

        /* renamed from: c */
        public C33303a f86375c;

        /* renamed from: d */
        public C33303a f86376d;

        public C33304b(Context context) {
            this.f86373a = context;
        }
    }

    public final void cancel() {
        m76417a();
        super.cancel();
    }

    public final void dismiss() {
        m76417a();
        super.dismiss();
    }

    /* renamed from: a */
    private void m76417a() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f86362d.getWindowToken(), 0);
        }
    }

    public final void show() {
        super.show();
        EditText editText = this.f86362d;
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (!inputMethodManager.showSoftInput(editText, 0)) {
            editText.postDelayed(new Runnable(inputMethodManager, editText, 0) {

                /* renamed from: a */
                final /* synthetic */ InputMethodManager f70752a;

                /* renamed from: b */
                final /* synthetic */ View f70753b;

                /* renamed from: c */
                final /* synthetic */ int f70754c;

                public final void run() {
                    this.f70752a.showSoftInput(this.f70753b, this.f70754c);
                }

                {
                    this.f70752a = r1;
                    this.f70753b = r2;
                    this.f70754c = r3;
                }
            }, 100);
        }
    }

    private C33299a(C33304b bVar) {
        super(bVar.f86373a);
        this.f86359a = bVar.f86374b;
        this.f86360b = bVar.f86375c;
        this.f86361c = bVar.f86376d;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        this.f86363e = LayoutInflater.from(getContext()).inflate(R.layout.bci, null);
        setContentView(this.f86363e);
        setCancelable(false);
        this.f86364f = (DmtTextView) findViewById(R.id.wt);
        this.f86365g = (AvatarImageView) findViewById(R.id.hy);
        this.f86366h = (ImageView) findViewById(R.id.doe);
        this.f86367i = (DmtTextView) findViewById(R.id.dn1);
        this.f86362d = (EditText) findViewById(R.id.a9g);
        this.f86368j = (Button) findViewById(R.id.cmt);
        this.f86369k = (Button) findViewById(R.id.cmy);
        IMUser iMUser = this.f86359a.f91142h;
        this.f86364f.setText(getContext().getResources().getString(R.string.bgg, new Object[]{this.f86359a.f91141g}));
        C23515d.m57669a((RemoteImageView) this.f86365g, iMUser.getAvatarThumb());
        this.f86367i.setText(iMUser.getNickName());
        C47916gh.m103675a(getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.f86367i);
        C35221bc.m79614a(this.f86368j);
        C35221bc.m79614a(this.f86369k);
        this.f86368j.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C33299a.this.f86360b != null) {
                    C33299a.this.f86360b.mo70637a(C33299a.this.f86362d.getText().toString());
                }
                C33299a.this.dismiss();
            }
        });
        this.f86369k.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (TextUtils.isEmpty(C33299a.this.f86362d.getText().toString())) {
                    C10691a.m21549c(C33299a.this.getContext(), (int) R.string.bfu, 1).mo19066a();
                    C35190af.m79442a();
                    C35190af.m79518h(C33299a.this.f86359a.f91139e);
                } else if (C33299a.this.f86362d.getText().length() > C35197am.m79552a()) {
                    C9432q.m18676a(C11010c.m22280a(), C11010c.m22280a().getResources().getString(R.string.bkj));
                    C35190af.m79442a();
                    C35190af.m79518h(C33299a.this.f86359a.f91139e);
                } else {
                    C35190af.m79442a();
                    C35467d dVar = C33299a.this.f86359a;
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from", dVar.f91139e);
                    hashMap.put("group_id", dVar.f91137c);
                    hashMap.put("comment_id", dVar.f91136b);
                    hashMap.put("to_user_id", dVar.f91142h.getUid());
                    hashMap.put("author_id", dVar.f91138d);
                    C26890h.m65011a("share_comment", (Map<String, String>) hashMap);
                    if (C33299a.this.f86361c != null) {
                        C33299a.this.f86361c.mo70637a(C33299a.this.f86362d.getText().toString());
                    }
                    C33299a.this.dismiss();
                }
            }
        });
        this.f86362d.setFilters(new InputFilter[]{new C33359af(C35197am.m79552a())});
        this.f86362d.setOnKeyListener(new OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return i == 66;
            }
        });
    }
}
