package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.C0654k;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.livesdk.C4642b;
import com.bytedance.android.livesdk.chatroom.event.C5205x;
import com.bytedance.android.livesdk.chatroom.p310f.C5242w.C5243a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4609s;
import com.bytedance.android.livesdk.widget.BarrageView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bz */
public final class C6013bz extends C0649f {

    /* renamed from: a */
    public BarrageView f15949a;

    /* renamed from: b */
    InputFilter f15950b;

    /* renamed from: c */
    public View f15951c;

    /* renamed from: d */
    public ImageView f15952d;

    /* renamed from: e */
    public EditText f15953e;

    /* renamed from: f */
    public TextView f15954f;

    /* renamed from: g */
    public View f15955g;

    /* renamed from: h */
    public boolean f15956h;

    /* renamed from: i */
    public boolean f15957i;

    /* renamed from: j */
    public String f15958j;

    /* renamed from: k */
    public C6019c f15959k;

    /* renamed from: l */
    C6017a f15960l;

    /* renamed from: m */
    public boolean f15961m = false;

    /* renamed from: n */
    public boolean f15962n = false;

    /* renamed from: o */
    private final OnClickListener f15963o = new C6021ca(this);

    /* renamed from: p */
    private final TextWatcher f15964p = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            int i;
            int i2;
            String str2;
            if (C6013bz.this.f15962n) {
                Editable text = C6013bz.this.f15953e.getText();
                C6013bz bzVar = C6013bz.this;
                if (text == null) {
                    str = "";
                } else {
                    str = text.toString();
                }
                bzVar.f15958j = str;
                if (TextUtils.isEmpty(C6013bz.this.f15958j)) {
                    C6013bz.this.f15954f.setVisibility(0);
                    C6013bz.this.f15952d.setImageResource(R.drawable.c24);
                } else {
                    C6013bz.this.f15954f.setVisibility(8);
                    C6013bz.this.f15952d.setImageResource(R.drawable.c23);
                }
                int trimmedLength = TextUtils.getTrimmedLength(C6013bz.this.f15958j);
                int i3 = 15;
                if (C6013bz.this.f15956h) {
                    i = 15;
                } else {
                    i = 50;
                }
                if (trimmedLength > i) {
                    C6013bz bzVar2 = C6013bz.this;
                    EditText editText = C6013bz.this.f15953e;
                    bzVar2.f15950b = new LengthFilter(C6013bz.this.f15958j.length());
                    editText.setFilters(new InputFilter[]{bzVar2.f15950b});
                } else {
                    C6013bz bzVar3 = C6013bz.this;
                    EditText editText2 = C6013bz.this.f15953e;
                    if (bzVar3.f15950b != null) {
                        editText2.setFilters(new InputFilter[0]);
                        bzVar3.f15950b = null;
                    }
                }
                if (C6013bz.this.f15956h) {
                    i2 = 15;
                } else {
                    i2 = 50;
                }
                if (trimmedLength > i2) {
                    if (C6013bz.this.f15956h) {
                        str2 = C6013bz.this.getString(R.string.efe);
                    } else {
                        str2 = C6013bz.this.getString(R.string.ed6, Integer.valueOf(50));
                    }
                    C4575an.m10988a(str2, 1);
                    String str3 = C6013bz.this.f15958j;
                    if (!C6013bz.this.f15956h) {
                        i3 = 50;
                    }
                    String substring = str3.substring(0, i3);
                    C6013bz.this.f15953e.setText(substring);
                    C6013bz.this.f15953e.setSelection(substring.length());
                }
            }
        }
    };

    /* renamed from: q */
    private final OnLayoutChangeListener f15965q = new OnLayoutChangeListener() {

        /* renamed from: b */
        private float f15976b = -1.0f;

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (C6013bz.this.f15951c != null) {
                if (this.f15976b < 0.0f) {
                    this.f15976b = ((float) C6013bz.this.getResources().getDisplayMetrics().heightPixels) * 0.75f;
                }
                if (((float) i4) < this.f15976b) {
                    if (!C6013bz.this.f15961m) {
                        C6013bz.this.f15961m = true;
                        int i9 = i8 - i4;
                        C6013bz.this.f15951c.setVisibility(0);
                        if (C6013bz.this.f15955g.getVisibility() == 0) {
                            i9 += C6013bz.this.f15955g.getHeight();
                        }
                        C4495a.m10823a().mo10301a((Object) new C5205x(i9, true));
                    }
                } else if (C6013bz.this.f15961m) {
                    C6013bz.this.f15961m = false;
                    C6013bz.this.f15951c.setVisibility(4);
                    try {
                        C6013bz.this.dismiss();
                    } catch (IllegalStateException unused) {
                    }
                    C4495a.m10823a().mo10301a((Object) new C5205x(0, false));
                }
            }
        }
    };

    /* renamed from: r */
    private View f15966r;

    /* renamed from: s */
    private TextView f15967s;

    /* renamed from: t */
    private View f15968t;

    /* renamed from: u */
    private boolean f15969u;

    /* renamed from: v */
    private boolean f15970v;

    /* renamed from: w */
    private boolean f15971w;

    /* renamed from: x */
    private boolean f15972x = false;

    /* renamed from: y */
    private C5243a f15973y = new C5243a() {
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bz$a */
    public interface C6017a {
        /* renamed from: a */
        void mo12021a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bz$b */
    public static final class C6018b {

        /* renamed from: a */
        public boolean f15978a;

        /* renamed from: b */
        public boolean f15979b;

        /* renamed from: c */
        public boolean f15980c;

        /* renamed from: d */
        public String f15981d;

        /* renamed from: e */
        public boolean f15982e = true;

        /* renamed from: f */
        public boolean f15983f;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bz$c */
    public interface C6019c {
        /* renamed from: a */
        void mo12022a(C6018b bVar);

        /* renamed from: a */
        void mo12023a(String str, boolean z);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f15962n = false;
    }

    /* renamed from: a */
    public final void mo12012a() {
        if (this.f15953e != null) {
            C4609s.m11068b(getContext(), this.f15953e);
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f15951c.removeOnLayoutChangeListener(this.f15965q);
        this.f15972x = false;
    }

    public final void onResume() {
        super.onResume();
        if (this.f15972x) {
            this.f15972x = false;
            mo12013a(200, 1, 5);
            return;
        }
        this.f15953e.postDelayed(new C6023cc(this), 100);
    }

    /* renamed from: b */
    public void mo12016b() {
        if (isAdded()) {
            if (this.f15957i) {
                this.f15953e.setText("");
                this.f15954f.setText(R.string.euv);
                this.f15953e.setEnabled(false);
                return;
            }
            this.f15953e.setText(this.f15958j);
            if (!TextUtils.isEmpty(this.f15958j)) {
                this.f15953e.setSelection(this.f15958j.length());
            }
            this.f15953e.setTextSize(1, 17.0f);
            if (this.f15956h) {
                this.f15954f.setText(R.string.e95);
            } else if (this.f15969u) {
                this.f15954f.setText(R.string.e3w);
            } else {
                this.f15954f.setText(R.string.esi);
            }
            this.f15953e.setEnabled(true);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f15972x = this.f15961m;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C4642b.m11130a().mo10429c();
        super.onDismiss(dialogInterface);
        if (this.f15959k != null) {
            C6018b bVar = new C6018b();
            bVar.f15979b = this.f15969u;
            bVar.f15980c = this.f15957i;
            bVar.f15978a = this.f15956h;
            bVar.f15981d = this.f15958j;
            bVar.f15982e = this.f15970v;
            this.f15959k.mo12022a(bVar);
            this.f15959k = null;
            this.f15961m = false;
        }
    }

    /* renamed from: a */
    public final void mo12014a(String str) {
        if (isAdded() && !this.f15957i) {
            this.f15958j = str;
            mo12016b();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15962n = true;
        setStyle(1, R.style.yx);
        setCancelable(true);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        this.f15956h = arguments.getBoolean("live.intent.extra.DANMU_OPEN", false);
        this.f15969u = arguments.getBoolean("live.intent.extra.IS_BROADCASTER", false);
        this.f15957i = arguments.getBoolean("live.intent.extra.USER_BANNED", false);
        this.f15958j = arguments.getString("live.intent.extra.INPUT", "");
        this.f15970v = arguments.getBoolean("live.inter.extra.CAN_DANMU", true);
        this.f15971w = arguments.getBoolean("live.inter.extra.IS_OFFICIAL", false);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
            window.addFlags(32);
            if ((getActivity() != null && getActivity().getRequestedOrientation() == 0) || (!this.f15969u && !C3894h.m9842a(getActivity()))) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    /* renamed from: a */
    public final void mo12015a(boolean z) {
        if (isAdded()) {
            if ((!this.f15957i || !z) && (this.f15957i || z)) {
                this.f15957i = z;
                mo12016b();
            }
        }
    }

    public final void show(C0654k kVar, String str) {
        C4642b.m11130a().mo10428b();
        super.show(kVar, str);
    }

    public final void showNow(C0654k kVar, String str) {
        C4642b.m11130a().mo10428b();
        super.showNow(kVar, str);
    }

    /* renamed from: a */
    public static C6013bz m13114a(C6018b bVar, C6017a aVar) {
        C6013bz bzVar = new C6013bz();
        Bundle bundle = new Bundle();
        bundle.putBoolean("live.intent.extra.DANMU_OPEN", bVar.f15978a);
        bundle.putBoolean("live.intent.extra.IS_BROADCASTER", bVar.f15979b);
        bundle.putBoolean("live.intent.extra.USER_BANNED", bVar.f15980c);
        bundle.putString("live.intent.extra.INPUT", bVar.f15981d);
        bundle.putBoolean("live.inter.extra.CAN_DANMU", bVar.f15982e);
        bundle.putBoolean("live.inter.extra.IS_OFFICIAL", bVar.f15983f);
        bzVar.setArguments(bundle);
        bzVar.f15960l = aVar;
        return bzVar;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f15953e.addTextChangedListener(this.f15964p);
        this.f15953e.setOnKeyListener(new C6022cb(this));
        this.f15949a.setOnClickListener(this.f15963o);
        this.f15952d.setOnClickListener(this.f15963o);
        if (this.f15971w) {
            C9432q.m18691b((View) this.f15949a, 8);
        }
        mo12016b();
        if (!this.f15957i && this.f15956h) {
            this.f15949a.mo14683a(false);
        }
        this.f15955g.setVisibility(8);
        this.f15949a.setVisibility(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12013a(long j, int i, int i2) {
        if (this.f15953e != null && i <= i2) {
            EditText editText = this.f15953e;
            C6024cd cdVar = new C6024cd(this, j, i, i2);
            editText.postDelayed(cdVar, j);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.akm, viewGroup, false);
        this.f15951c = inflate;
        this.f15951c.addOnLayoutChangeListener(this.f15965q);
        KeyboardShadowView keyboardShadowView = (KeyboardShadowView) this.f15951c.findViewById(R.id.drs);
        keyboardShadowView.setActivity(getActivity());
        if (this.f15969u && (getActivity() == null || getActivity().getRequestedOrientation() != 0)) {
            z = true;
        }
        keyboardShadowView.setShowStatusBar(z);
        this.f15966r = inflate.findViewById(R.id.au3);
        this.f15952d = (ImageView) inflate.findViewById(R.id.clb);
        this.f15949a = (BarrageView) inflate.findViewById(R.id.je);
        this.f15953e = (EditText) inflate.findViewById(R.id.a9s);
        this.f15954f = (TextView) inflate.findViewById(R.id.a9t);
        this.f15966r.getLayoutParams().width = (getResources().getDisplayMetrics().widthPixels - inflate.getPaddingLeft()) - inflate.getPaddingRight();
        this.f15955g = inflate.findViewById(R.id.c9p);
        this.f15955g.getLayoutParams().width = (getResources().getDisplayMetrics().widthPixels - inflate.getPaddingLeft()) - inflate.getPaddingRight();
        this.f15968t = this.f15955g.findViewById(R.id.am7);
        this.f15967s = (TextView) this.f15955g.findViewById(R.id.dn1);
        return inflate;
    }
}
