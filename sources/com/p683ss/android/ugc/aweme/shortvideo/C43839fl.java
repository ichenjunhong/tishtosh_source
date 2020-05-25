package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.google.p1057b.p1058a.C17421k;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.imported.C35522c;
import com.p683ss.android.ugc.aweme.imported.C35525f;
import com.p683ss.android.ugc.aweme.imported.C35527g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa.C39528a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.mob.HashTagMobHelper;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45634i;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45421bg.C45422a;
import com.p683ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p683ss.android.ugc.aweme.utils.C47761ce;
import com.p683ss.android.ugc.aweme.video.hashtag.C48024a;
import com.p683ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.p683ss.android.ugc.aweme.views.mention.MentionEditText.C48212c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fl */
public final class C43839fl {

    /* renamed from: a */
    public final Fragment f111008a;

    /* renamed from: b */
    public final HashTagMentionEditText f111009b;

    /* renamed from: c */
    final View f111010c;

    /* renamed from: d */
    final View f111011d;

    /* renamed from: e */
    final int f111012e;

    /* renamed from: f */
    final int f111013f;

    /* renamed from: g */
    public String f111014g = "";

    /* renamed from: h */
    public int f111015h;

    /* renamed from: i */
    public BaseTitleHelper f111016i;

    /* renamed from: j */
    public HashTagMobHelper f111017j;

    /* renamed from: k */
    public String f111018k;

    /* renamed from: l */
    public boolean f111019l;

    /* renamed from: m */
    final ArrayList<C42480by> f111020m = new ArrayList<>();

    /* renamed from: n */
    private C35525f f111021n;

    /* renamed from: b */
    public final void mo89377b() {
        this.f111009b.mo95675f();
    }

    /* renamed from: c */
    public final String mo89380c() {
        return this.f111009b.getText().toString();
    }

    /* renamed from: d */
    public final List<AVTextExtraStruct> mo89381d() {
        return C45634i.m99374a(this.f111009b.getTextExtraStructListWithHashTag());
    }

    /* renamed from: a */
    public final void mo89371a() {
        int i;
        this.f111021n = new C35525f();
        this.f111021n.mo73908a((EditText) this.f111009b);
        if (this.f111010c != null) {
            if (C39618d.f101183x.mo74280a()) {
                this.f111010c.setVisibility(8);
            } else {
                this.f111010c.setVisibility(0);
            }
        }
        HashTagMentionEditText hashTagMentionEditText = this.f111009b;
        Context context = this.f111009b.getContext();
        if (C39618d.f101183x.mo74280a()) {
            i = R.color.a17;
        } else {
            i = R.color.a0y;
        }
        hashTagMentionEditText.setMentionTextColor(C0726c.m2098c(context, i));
        this.f111009b.setOnMentionInputListener(new C48212c() {
            /* renamed from: a */
            public final void mo51903a() {
                if (!C39618d.f101183x.mo74280a()) {
                    C39618d.f101165f.mo74250a(C43839fl.this.f111008a, 3, "", C43839fl.this.f111012e);
                }
            }
        });
        if (this.f111010c != null && !C39618d.f101183x.mo74280a()) {
            this.f111010c.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    KeyboardUtils.m58183b(C43839fl.this.f111009b);
                    Editable text = C43839fl.this.f111009b.getText();
                    if (text != null && text.length() <= 150) {
                        int selectionStart = Selection.getSelectionStart(text);
                        if (C43839fl.this.f111016i != null) {
                            BaseTitleHelper baseTitleHelper = C43839fl.this.f111016i;
                            String obj = text.toString();
                            C52711k.m112240b(obj, "<set-?>");
                            baseTitleHelper.f120716c = obj;
                        }
                        if (C43839fl.this.f111017j != null) {
                            C43839fl.this.f111017j.mo89563a("click_tag_button");
                        }
                        text.insert(selectionStart, "#");
                    }
                }
            });
        }
        if (this.f111011d != null) {
            this.f111011d.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (!C39618d.f101183x.mo74282b()) {
                        C39618d.f101183x.mo74277a(C43839fl.this.f111008a, "", "click_at_friend", C45422a.m98992a(C43839fl.this.f111008a.getString(R.string.cvs)), (C39528a) null);
                        return;
                    }
                    C39618d.f101165f.mo74249a(C43839fl.this.f111008a, 3);
                }
            });
        }
        if (this.f111019l) {
            this.f111009b.setFixLengthInFront(this.f111018k.length());
        }
        this.f111009b.mo91792a((InputFilter) new C35522c(NormalGiftView.MASK_TRANSLATE_VALUE));
        this.f111009b.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                int length = editable.length();
                if (length > 0) {
                    int i = length - 1;
                    if (editable.charAt(i) == 10) {
                        editable.delete(i, length);
                    }
                }
                C43839fl flVar = C43839fl.this;
                for (int i2 = 0; i2 < flVar.f111020m.size(); i2++) {
                    ((C42480by) flVar.f111020m.get(i2)).mo78776a(flVar);
                }
                Editable text = C43839fl.this.f111009b.getText();
                if (text.length() > 150) {
                    int selectionEnd = Selection.getSelectionEnd(text);
                    C43839fl.this.f111009b.setText(text.toString().substring(0, NormalGiftView.MASK_TRANSLATE_VALUE));
                    Editable text2 = C43839fl.this.f111009b.getText();
                    if (selectionEnd > text2.length()) {
                        selectionEnd = text2.length();
                    }
                    Selection.setSelection(text2, selectionEnd);
                    C10691a.m21548c(C43839fl.this.f111008a.getContext(), (int) R.string.ffq).mo19066a();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo89375a(String str) {
        this.f111009b.setText(str);
    }

    /* renamed from: b */
    public final void mo89378b(String str) {
        this.f111021n.mo73909a(str);
    }

    /* renamed from: a */
    public final void mo89372a(int i) {
        this.f111015h = i;
        if (this.f111009b != null) {
            this.f111009b.setVideoType(i);
        }
    }

    /* renamed from: a */
    public final void mo89373a(Intent intent) {
        User a = C39618d.f101165f.mo74248a(intent);
        if (a != null) {
            this.f111009b.mo95669a(0, C35527g.m80272a(a), a.getUid());
        }
        this.f111009b.mo91795b();
    }

    /* renamed from: b */
    public final void mo89379b(List<AVTextExtraStruct> list) {
        this.f111009b.setAVTextExtraList(list);
        if (!C9414h.m18630a(list)) {
            for (AVTextExtraStruct aVTextExtraStruct : list) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(aVTextExtraStruct.getHashTagName());
                String trim = sb.toString().trim();
                if (!C47761ce.m103388a(trim)) {
                    this.f111009b.f121324l.add(trim);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo89374a(C42480by byVar) {
        this.f111020m.add(C17421k.m42653a(byVar));
    }

    /* renamed from: a */
    public final void mo89376a(List<AVChallenge> list) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            this.f111009b.f121324l.clear();
            for (AVChallenge aVChallenge : list) {
                if (aVChallenge != null) {
                    String obj = this.f111009b.getText().toString();
                    StringBuilder sb = new StringBuilder("#");
                    sb.append(aVChallenge.getChallengeName());
                    sb.append(" ");
                    if (!obj.contains(sb.toString())) {
                        Set set = this.f111009b.f121324l;
                        StringBuilder sb2 = new StringBuilder("#");
                        sb2.append(aVChallenge.getChallengeName());
                        set.add(sb2.toString());
                        C48024a b = C47761ce.m103389b(this.f111009b.getText().toString(), aVChallenge.getChallengeName());
                        if (b.f120701b <= 150) {
                            this.f111009b.getText().insert(b.f120700a, b.f120702c);
                        }
                        this.f111009b.mo91794a(true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C43839fl m96268a(Fragment fragment, HashTagMentionEditText hashTagMentionEditText, View view, View view2, int i) {
        C43839fl flVar = new C43839fl(fragment, hashTagMentionEditText, view, view2, 0, 0);
        return flVar;
    }

    public C43839fl(Fragment fragment, HashTagMentionEditText hashTagMentionEditText, View view, View view2, int i, int i2) {
        this.f111008a = fragment;
        this.f111009b = hashTagMentionEditText;
        this.f111010c = view;
        this.f111011d = view2;
        this.f111012e = i;
        this.f111013f = i2;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            this.f111016i = BaseTitleHelper.m104027a(activity);
            this.f111017j = (HashTagMobHelper) C0214z.m440a(activity).mo359a(HashTagMobHelper.class);
        }
    }
}
