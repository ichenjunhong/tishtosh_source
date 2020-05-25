package com.p683ss.android.ugc.aweme.story.live;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagView;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.notification.util.C38446k.C38451a;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText;
import com.ss.android.ugc.trill.R;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.story.live.k */
public final class C46650k implements TextWatcher, OnClickListener, OnKeyListener {

    /* renamed from: a */
    public Context f117654a;

    /* renamed from: b */
    public TagView f117655b;

    /* renamed from: c */
    public TagView f117656c;

    /* renamed from: d */
    public MentionEditText f117657d;

    /* renamed from: e */
    private View f117658e;

    /* renamed from: f */
    private View f117659f;

    /* renamed from: g */
    private C38451a f117660g;

    /* renamed from: h */
    private CharSequence f117661h = "";

    /* renamed from: i */
    private int f117662i;

    /* renamed from: j */
    private int f117663j;

    /* renamed from: k */
    private OnTouchListener f117664k = new OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                C26894c.m65021a((Activity) C46650k.this.f117654a, C46650k.this.f117657d);
            }
            return false;
        }
    };

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.ce0) {
            C26894c.m65021a((Activity) this.f117654a, this.f117657d);
            return;
        }
        if (id == R.id.abt) {
            this.f117657d.requestFocus();
            KeyboardUtils.m58182a(this.f117657d);
        }
    }

    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        if (obj.contains("\n")) {
            C10691a.m21548c(this.f117654a, (int) R.string.ci5).mo19066a();
            int indexOf = obj.indexOf("\n");
            editable.replace(indexOf, indexOf + 1, "");
        }
        int length = editable.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int type = Character.getType(editable.charAt(i2));
            if (type == 19 || type == 28) {
                i++;
            }
        }
        if (length - (i / 2) > 20) {
            editable.replace(this.f117662i, this.f117663j, this.f117661h);
            C10691a.m21548c(this.f117654a, (int) R.string.c58).mo19066a();
        }
    }

    /* renamed from: a */
    static boolean m101249a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        List installedPackages = context.getPackageManager().getInstalledPackages(0);
        if (installedPackages != null) {
            for (int i = 0; i < installedPackages.size(); i++) {
                if (((PackageInfo) installedPackages.get(i)).packageName.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C46650k(Context context, View view) throws IllegalArgumentException {
        if (view == null || context == null) {
            throw new IllegalArgumentException("context or root cannot be null");
        }
        this.f117654a = context;
        this.f117658e = view;
        this.f117659f = view.findViewById(R.id.ce0);
        this.f117655b = (TagView) view.findViewById(R.id.cxo);
        this.f117656c = (TagView) view.findViewById(R.id.cxp);
        this.f117657d = (MentionEditText) view.findViewById(R.id.abt);
        this.f117659f.setOnTouchListener(this.f117664k);
        this.f117655b.setVisibility(8);
        if (this.f117660g == null) {
            this.f117660g = new C38451a();
            this.f117660g.f97855b = new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1 && (view.equals(C46650k.this.f117656c) || view.equals(C46650k.this.f117655b))) {
                        C46650k kVar = C46650k.this;
                        if (view.equals(kVar.f117656c)) {
                            kVar.f117655b.setSelected(false);
                            if (C46650k.m101249a(kVar.f117654a, "com.sina.weibo")) {
                                kVar.f117656c.setSelected(!kVar.f117656c.isSelected());
                            } else {
                                C10691a.m21548c(kVar.f117654a, (int) R.string.cik).mo19066a();
                                kVar.f117656c.setSelected(false);
                            }
                        } else if (view.equals(kVar.f117655b)) {
                            kVar.f117656c.setSelected(false);
                            if (C46650k.m101249a(kVar.f117654a, "com.tencent.mm")) {
                                kVar.f117655b.setSelected(!kVar.f117655b.isSelected());
                            } else {
                                C10691a.m21548c(kVar.f117654a, (int) R.string.cil).mo19066a();
                                kVar.f117655b.setSelected(false);
                            }
                        }
                        C26890h.m65008a(kVar.f117654a, "share", "live_set", "0", "0", (JSONObject) null);
                    }
                    return true;
                }
            };
            this.f117660g.mo78343a(this.f117656c, this.f117655b);
        }
        if (this.f117657d != null) {
            this.f117657d.addTextChangedListener(this);
            this.f117657d.setOnKeyListener(this);
            this.f117657d.setOnClickListener(this);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        if (i == 67) {
            this.f117657d.onKeyDown(i, keyEvent);
        } else if (i == 66) {
            if (this.f117657d.getLineCount() > 0) {
                C10691a.m21548c(this.f117654a, (int) R.string.ci5).mo19066a();
            } else {
                this.f117657d.onKeyDown(i, keyEvent);
            }
        }
        return false;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f117662i = i;
        this.f117663j = i3 + i;
        this.f117661h = charSequence.subSequence(i, i2 + i);
    }
}
