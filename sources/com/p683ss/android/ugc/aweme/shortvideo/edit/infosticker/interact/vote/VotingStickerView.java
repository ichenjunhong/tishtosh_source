package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23725l;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.shortvideo.widget.C45609i.C45611b;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46679c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView */
public final class VotingStickerView extends FrameLayout {

    /* renamed from: a */
    public static final C43614a f110476a = new C43614a(null);

    /* renamed from: b */
    private final int f110477b = C23728o.m58241a(73.0d);

    /* renamed from: c */
    private LinearLayout f110478c;

    /* renamed from: d */
    private HashMap f110479d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView$a */
    public static final class C43614a {
        private C43614a() {
        }

        public /* synthetic */ C43614a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView$b */
    public static final class C43615b implements TextWatcher {

        /* renamed from: a */
        private final EditText f110480a;

        /* renamed from: b */
        private final EditText f110481b;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            C43630e.m95896a(this.f110480a, 1);
            String valueOf = String.valueOf(editable);
            CharSequence charSequence = valueOf;
            if (C52830p.m112415a(charSequence, 13, 0, false, 6, (Object) null) >= 0 || C52830p.m112415a(charSequence, 10, 0, false, 6, (Object) null) >= 0) {
                this.f110480a.setText(C52830p.m112401a(C52830p.m112401a(valueOf, "\r", "", false, 4, (Object) null), "\n", "", false, 4, (Object) null));
                this.f110480a.setSelection(this.f110480a.getText().length());
                C43630e.m95898b(this.f110481b);
            }
        }

        public C43615b(EditText editText, EditText editText2) {
            C52711k.m112240b(editText, "editText");
            this.f110480a = editText;
            this.f110481b = editText2;
        }

        public /* synthetic */ C43615b(EditText editText, EditText editText2, int i, C52707g gVar) {
            this(editText, null);
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C43630e.m95895a(this.f110480a, 20.0d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView$c */
    public static final class C43616c implements TextWatcher {

        /* renamed from: a */
        private final EditText f110482a;

        /* renamed from: b */
        private final EditText f110483b;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            C43630e.m95896a(this.f110482a, C43630e.f110527e);
            C43630e.f110528f = C43630e.m95894a(this.f110482a);
        }

        public C43616c(EditText editText, EditText editText2) {
            C52711k.m112240b(editText, "editText");
            this.f110482a = editText;
            this.f110483b = editText2;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C43630e.m95895a(this.f110482a, 10.0d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerView$d */
    static final class C43617d implements OnKeyListener {

        /* renamed from: a */
        public static final C43617d f110484a = new C43617d();

        C43617d() {
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (66 == i) {
                C52711k.m112236a((Object) keyEvent, "event");
                if (keyEvent.getAction() == 0 && C43630e.f110528f >= C43630e.f110527e) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public final View mo88955b(int i) {
        if (this.f110479d == null) {
            this.f110479d = new HashMap();
        }
        View view = (View) this.f110479d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f110479d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo88952a() {
        setEditTextFocusable(0);
    }

    /* renamed from: c */
    public final void mo88957c() {
        VoteEditText voteEditText = (VoteEditText) mo88955b(R.id.acf);
        C52711k.m112236a((Object) voteEditText, "et_voting_sticker_title");
        voteEditText.setVisibility(0);
        Space space = (Space) mo88955b(R.id.b9p);
        C52711k.m112236a((Object) space, "layout_space");
        space.setVisibility(0);
    }

    public final VoteStruct getVoteStruct() {
        VoteStruct voteStruct = new VoteStruct();
        VoteEditText voteEditText = (VoteEditText) mo88955b(R.id.acf);
        C52711k.m112236a((Object) voteEditText, "et_voting_sticker_title");
        voteStruct.setQuestion(String.valueOf(voteEditText.getText()));
        List arrayList = new ArrayList();
        OptionsBean optionsBean = new OptionsBean();
        VoteEditText voteEditText2 = (VoteEditText) mo88955b(R.id.acd);
        C52711k.m112236a((Object) voteEditText2, "et_voting_sticker_option_1");
        optionsBean.setPostOption(String.valueOf(voteEditText2.getText()));
        arrayList.add(optionsBean);
        OptionsBean optionsBean2 = new OptionsBean();
        VoteEditText voteEditText3 = (VoteEditText) mo88955b(R.id.ace);
        C52711k.m112236a((Object) voteEditText3, "et_voting_sticker_option_2");
        optionsBean2.setPostOption(String.valueOf(voteEditText3.getText()));
        arrayList.add(optionsBean2);
        voteStruct.setOptions(arrayList);
        return voteStruct;
    }

    /* renamed from: b */
    public final void mo88956b() {
        boolean z;
        VoteEditText voteEditText = (VoteEditText) mo88955b(R.id.acf);
        C52711k.m112236a((Object) voteEditText, "et_voting_sticker_title");
        voteEditText.setVisibility(8);
        Space space = (Space) mo88955b(R.id.b9p);
        C52711k.m112236a((Object) space, "layout_space");
        space.setVisibility(8);
        VoteEditText voteEditText2 = (VoteEditText) mo88955b(R.id.acf);
        C52711k.m112236a((Object) voteEditText2, "et_voting_sticker_title");
        if (!C23725l.m58233a(String.valueOf(voteEditText2.getText()))) {
            VoteEditText voteEditText3 = (VoteEditText) mo88955b(R.id.acf);
            C52711k.m112236a((Object) voteEditText3, "et_voting_sticker_title");
            voteEditText3.setVisibility(0);
            Space space2 = (Space) mo88955b(R.id.b9p);
            C52711k.m112236a((Object) space2, "layout_space");
            space2.setVisibility(0);
        }
        VoteEditText voteEditText4 = (VoteEditText) mo88955b(R.id.acd);
        C52711k.m112236a((Object) voteEditText4, "et_voting_sticker_option_1");
        CharSequence text = voteEditText4.getText();
        boolean z2 = true;
        if (text == null || text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((VoteEditText) mo88955b(R.id.acd)).setText(R.string.fdd);
        }
        VoteEditText voteEditText5 = (VoteEditText) mo88955b(R.id.ace);
        C52711k.m112236a((Object) voteEditText5, "et_voting_sticker_option_2");
        CharSequence text2 = voteEditText5.getText();
        if (!(text2 == null || text2.length() == 0)) {
            z2 = false;
        }
        if (z2) {
            ((VoteEditText) mo88955b(R.id.ace)).setText(R.string.fde);
        }
    }

    public final int getLastTouchedIndex() {
        if (((VoteEditText) mo88955b(R.id.acf)).f110451a > ((VoteEditText) mo88955b(R.id.acd)).f110451a) {
            if (((VoteEditText) mo88955b(R.id.acf)).f110451a < ((VoteEditText) mo88955b(R.id.ace)).f110451a && System.currentTimeMillis() - ((VoteEditText) mo88955b(R.id.ace)).f110451a < 1000) {
                return 2;
            }
        } else if (((VoteEditText) mo88955b(R.id.acd)).f110451a > ((VoteEditText) mo88955b(R.id.ace)).f110451a) {
            if (System.currentTimeMillis() - ((VoteEditText) mo88955b(R.id.acd)).f110451a < 1000) {
                return 1;
            }
        } else if (System.currentTimeMillis() - ((VoteEditText) mo88955b(R.id.ace)).f110451a < 1000) {
            return 2;
        }
        return 0;
    }

    /* renamed from: d */
    private final void m95867d() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.awx, this, false);
        if (inflate != null) {
            this.f110478c = (LinearLayout) inflate;
            LinearLayout linearLayout = this.f110478c;
            if (linearLayout == null) {
                C52711k.m112237a("container");
            }
            addView(linearLayout);
            C43630e.f110523a = Math.max(C23724k.m58229e(getContext()) / 4, this.f110477b);
            VoteEditText voteEditText = (VoteEditText) mo88955b(R.id.acf);
            VoteEditText voteEditText2 = (VoteEditText) mo88955b(R.id.acf);
            C52711k.m112236a((Object) voteEditText2, "et_voting_sticker_title");
            voteEditText.addTextChangedListener(new C43616c(voteEditText2, (VoteEditText) mo88955b(R.id.acd)));
            VoteEditText voteEditText3 = (VoteEditText) mo88955b(R.id.acd);
            VoteEditText voteEditText4 = (VoteEditText) mo88955b(R.id.acd);
            C52711k.m112236a((Object) voteEditText4, "et_voting_sticker_option_1");
            voteEditText3.addTextChangedListener(new C43615b(voteEditText4, (VoteEditText) mo88955b(R.id.ace)));
            VoteEditText voteEditText5 = (VoteEditText) mo88955b(R.id.ace);
            VoteEditText voteEditText6 = (VoteEditText) mo88955b(R.id.ace);
            C52711k.m112236a((Object) voteEditText6, "et_voting_sticker_option_2");
            voteEditText5.addTextChangedListener(new C43615b(voteEditText6, null, 2, null));
            Typeface d = C46679c.m101291a().mo93635d("方正兰亭特黑简体");
            if (d != null) {
                VoteEditText voteEditText7 = (VoteEditText) mo88955b(R.id.acf);
                C52711k.m112236a((Object) voteEditText7, "et_voting_sticker_title");
                voteEditText7.setTypeface(d);
            }
            C43630e.m95895a((EditText) (VoteEditText) mo88955b(R.id.acf), 10.0d);
            C43630e.m95895a((EditText) (VoteEditText) mo88955b(R.id.acd), 20.0d);
            C43630e.m95895a((EditText) (VoteEditText) mo88955b(R.id.ace), 20.0d);
            ((VoteEditText) mo88955b(R.id.acd)).setLayerType(1, null);
            ((VoteEditText) mo88955b(R.id.ace)).setLayerType(1, null);
            VoteEditText voteEditText8 = (VoteEditText) mo88955b(R.id.acd);
            C52711k.m112236a((Object) voteEditText8, "et_voting_sticker_option_1");
            C45611b.m99351a(voteEditText8, Color.parseColor("#ffffff"), C23728o.m58241a(22.0d), Color.parseColor("#3d000000"), C23728o.m58241a(4.0d), 0, 0);
            VoteEditText voteEditText9 = (VoteEditText) mo88955b(R.id.ace);
            C52711k.m112236a((Object) voteEditText9, "et_voting_sticker_option_2");
            C45611b.m99351a(voteEditText9, Color.parseColor("#ffffff"), C23728o.m58241a(22.0d), Color.parseColor("#3d000000"), C23728o.m58241a(4.0d), 0, 0);
            ((VoteEditText) mo88955b(R.id.acf)).setOnKeyListener(C43617d.f110484a);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    public VotingStickerView(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        m95867d();
    }

    /* renamed from: a */
    public final void mo88953a(int i) {
        C43630e.f110527e = i;
        VoteEditText voteEditText = (VoteEditText) mo88955b(R.id.acf);
        C52711k.m112236a((Object) voteEditText, "et_voting_sticker_title");
        voteEditText.setMaxLines(C43630e.f110527e);
    }

    public final void setEditEnable(boolean z) {
        VoteEditText voteEditText = (VoteEditText) mo88955b(R.id.acf);
        C52711k.m112236a((Object) voteEditText, "et_voting_sticker_title");
        voteEditText.setEnabled(z);
        VoteEditText voteEditText2 = (VoteEditText) mo88955b(R.id.acd);
        C52711k.m112236a((Object) voteEditText2, "et_voting_sticker_option_1");
        voteEditText2.setEnabled(z);
        VoteEditText voteEditText3 = (VoteEditText) mo88955b(R.id.ace);
        C52711k.m112236a((Object) voteEditText3, "et_voting_sticker_option_2");
        voteEditText3.setEnabled(z);
    }

    public final void setTouchEnable(boolean z) {
        ((VoteEditText) mo88955b(R.id.acf)).setMode(z);
        ((VoteEditText) mo88955b(R.id.acd)).setMode(z);
        ((VoteEditText) mo88955b(R.id.ace)).setMode(z);
    }

    /* renamed from: a */
    public final void mo88954a(VoteStruct voteStruct) {
        C52711k.m112240b(voteStruct, "voteStruct");
        ((VoteEditText) mo88955b(R.id.acf)).setText(voteStruct.getQuestion());
        VoteEditText voteEditText = (VoteEditText) mo88955b(R.id.acd);
        Object obj = voteStruct.getOptions().get(0);
        C52711k.m112236a(obj, "voteStruct.options[0]");
        voteEditText.setText(((OptionsBean) obj).getPostOption());
        VoteEditText voteEditText2 = (VoteEditText) mo88955b(R.id.ace);
        Object obj2 = voteStruct.getOptions().get(1);
        C52711k.m112236a(obj2, "voteStruct.options[1]");
        voteEditText2.setText(((OptionsBean) obj2).getPostOption());
    }

    public final void setEditTextFocusable(int i) {
        VoteEditText voteEditText = (VoteEditText) mo88955b(R.id.acf);
        C52711k.m112236a((Object) voteEditText, "et_voting_sticker_title");
        voteEditText.setVisibility(0);
        Space space = (Space) mo88955b(R.id.b9p);
        C52711k.m112236a((Object) space, "layout_space");
        space.setVisibility(0);
        switch (i) {
            case 0:
                C43630e.m95898b((VoteEditText) mo88955b(R.id.acf));
                return;
            case 1:
                C43630e.m95898b((VoteEditText) mo88955b(R.id.acd));
                return;
            case 2:
                C43630e.m95898b((VoteEditText) mo88955b(R.id.ace));
                break;
        }
    }

    public VotingStickerView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attr");
        super(context, attributeSet);
        m95867d();
    }

    public VotingStickerView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attr");
        super(context, attributeSet, i);
        m95867d();
    }
}
