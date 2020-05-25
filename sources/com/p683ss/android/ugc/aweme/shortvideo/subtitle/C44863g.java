package com.p683ss.android.ugc.aweme.shortvideo.subtitle;

import android.app.Activity;
import android.graphics.Color;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43434az;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45428bk;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.vesdk.C50720o.C50744e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.g */
public final class C44863g extends C1322a<C44864a> {

    /* renamed from: a */
    public View f113535a;

    /* renamed from: b */
    public final ArrayList<UtteranceWithWords> f113536b = new ArrayList<>();

    /* renamed from: c */
    public String f113537c = "";

    /* renamed from: d */
    public final FragmentActivity f113538d;

    /* renamed from: e */
    public final C20347c f113539e;

    /* renamed from: f */
    public final VideoPublishEditModel f113540f;

    /* renamed from: g */
    public final SubtitleModule f113541g;

    /* renamed from: h */
    public ArrayList<UtteranceWithWords> f113542h;

    /* renamed from: i */
    public ArrayList<UtteranceWithWords> f113543i;

    /* renamed from: j */
    public int f113544j = 0;

    /* renamed from: k */
    private final EditViewModel f113545k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.g$a */
    public final class C44864a extends C1352v {

        /* renamed from: a */
        public final EditText f113546a;

        /* renamed from: b */
        public final ImageView f113547b;

        /* renamed from: c */
        final /* synthetic */ C44863g f113548c;

        public C44864a(C44863g gVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f113548c = gVar;
            super(view);
            View findViewById = view.findViewById(R.id.cuw);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.….subtitle_item_edit_text)");
            this.f113546a = (EditText) findViewById;
            View findViewById2 = view.findViewById(R.id.cux);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.subtitle_item_play)");
            this.f113547b = (ImageView) findViewById2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.g$b */
    static final class C44865b implements OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C44863g f113549a;

        /* renamed from: b */
        final /* synthetic */ C44864a f113550b;

        C44865b(C44863g gVar, C44864a aVar) {
            this.f113549a = gVar;
            this.f113550b = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.f113549a.f113541g.mo90884a(this.f113550b.f113546a);
                if (this.f113550b.getAdapterPosition() == this.f113549a.f113544j) {
                    this.f113550b.f113546a.setTextIsSelectable(true);
                    this.f113550b.f113546a.setCursorVisible(true);
                    this.f113550b.f113546a.setSelection(this.f113550b.f113546a.getText().length());
                    this.f113550b.f113547b.setVisibility(0);
                    this.f113550b.f113546a.setTextColor(this.f113549a.f113538d.getResources().getColor(R.color.aso));
                    this.f113550b.itemView.setBackgroundColor(Color.parseColor("#0fffffff"));
                    return;
                }
                return;
            }
            this.f113550b.f113547b.setVisibility(4);
            this.f113550b.itemView.setBackgroundResource(0);
            this.f113550b.f113546a.setTextColor(this.f113549a.f113538d.getResources().getColor(R.color.asw));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.g$c */
    static final class C44866c implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C44863g f113551a;

        /* renamed from: b */
        final /* synthetic */ C44864a f113552b;

        C44866c(C44863g gVar, C44864a aVar) {
            this.f113551a = gVar;
            this.f113552b = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C52711k.m112236a((Object) motionEvent, "event");
            if (motionEvent.getAction() != 0 || this.f113552b.getAdapterPosition() == -1) {
                return false;
            }
            this.f113551a.f113544j = this.f113552b.getAdapterPosition();
            this.f113552b.f113546a.requestFocus();
            this.f113551a.f113541g.mo90884a(this.f113552b.f113546a);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.g$d */
    static final class C44867d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44863g f113553a;

        /* renamed from: b */
        final /* synthetic */ UtteranceWithWords f113554b;

        C44867d(C44863g gVar, UtteranceWithWords utteranceWithWords) {
            this.f113553a = gVar;
            this.f113554b = utteranceWithWords;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C20347c cVar = this.f113553a.f113539e;
            if (cVar != null) {
                cVar.mo42976a(this.f113554b.getStartTime(), this.f113554b.getEndTime(), C50744e.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED);
            }
            C20347c cVar2 = this.f113553a.f113539e;
            if (cVar2 != null) {
                cVar2.mo43085r();
            }
            C26890h.m65011a("preview_subtitle", C42438az.m93209a().mo86526a("enter_from", "video_edit_page").mo86526a("shoot_way", this.f113553a.f113540f.mShootWay).mo86526a("creation_id", this.f113553a.f113540f.creationId).mo86526a("content_source", C43434az.m95207b(this.f113553a.f113540f)).mo86526a("content_type", C43434az.m95202a(this.f113553a.f113540f)).mo86526a("enter_method", this.f113553a.f113537c).f107329a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.g$e */
    public static final class C44868e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C44863g f113555a;

        /* renamed from: b */
        final /* synthetic */ C44864a f113556b;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null) {
                if (TextUtils.isEmpty(editable.toString())) {
                    int indexOf = this.f113555a.f113543i.indexOf(this.f113555a.f113542h.get(this.f113556b.getAdapterPosition()));
                    this.f113555a.f113536b.add(this.f113555a.f113543i.get(indexOf));
                    int i = indexOf + 1;
                    if (i < this.f113555a.f113543i.size()) {
                        this.f113555a.f113536b.add(this.f113555a.f113543i.get(i));
                    }
                } else if (this.f113556b.getAdapterPosition() != -1) {
                    int i2 = 20;
                    if (this.f113556b.f113546a.getText().length() > 20) {
                        TextWatcher textWatcher = this;
                        this.f113556b.f113546a.removeTextChangedListener(textWatcher);
                        EditText editText = this.f113556b.f113546a;
                        String obj = this.f113556b.f113546a.getText().toString();
                        if (Character.isHighSurrogate(obj.charAt(19))) {
                            i2 = 19;
                        }
                        int i3 = i2 + 0;
                        if (obj != null) {
                            String substring = obj.substring(0, i3);
                            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            editText.setText(substring);
                            this.f113556b.f113546a.addTextChangedListener(textWatcher);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    ((UtteranceWithWords) this.f113555a.f113542h.get(this.f113556b.getAdapterPosition())).setText(this.f113556b.f113546a.getText().toString());
                    int indexOf2 = this.f113555a.f113543i.indexOf(this.f113555a.f113542h.get(this.f113556b.getAdapterPosition()));
                    this.f113555a.f113536b.remove(this.f113555a.f113543i.get(indexOf2));
                    int i4 = indexOf2 + 1;
                    if (i4 < this.f113555a.f113543i.size()) {
                        this.f113555a.f113536b.remove(this.f113555a.f113543i.get(i4));
                    }
                }
            }
        }

        C44868e(C44863g gVar, C44864a aVar) {
            this.f113555a = gVar;
            this.f113556b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.g$f */
    static final class C44869f implements OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C44863g f113557a;

        /* renamed from: b */
        final /* synthetic */ UtteranceWithWords f113558b;

        /* renamed from: c */
        final /* synthetic */ C44864a f113559c;

        C44869f(C44863g gVar, UtteranceWithWords utteranceWithWords, C44864a aVar) {
            this.f113557a = gVar;
            this.f113558b = utteranceWithWords;
            this.f113559c = aVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 4 || i == 6 || (keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0)) {
                C52711k.m112236a((Object) textView, "v");
                int selectionStart = textView.getSelectionStart();
                int length = this.f113558b.getText().length();
                if (selectionStart > 0 && length > selectionStart) {
                    String text = this.f113558b.getText();
                    if (text != null) {
                        String substring = text.substring(selectionStart, length);
                        C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        int endTime = this.f113558b.getEndTime();
                        UtteranceWithWords utteranceWithWords = this.f113558b;
                        String text2 = this.f113558b.getText();
                        if (text2 != null) {
                            String substring2 = text2.substring(0, selectionStart);
                            C52711k.m112236a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            utteranceWithWords.setText(substring2);
                            this.f113558b.setEndTime(this.f113558b.getStartTime() + (((this.f113558b.getEndTime() - this.f113558b.getStartTime()) * this.f113558b.getText().length()) / length));
                            UtteranceWithWords utteranceWithWords2 = new UtteranceWithWords(this.f113558b.getEndTime() + 1, endTime, substring);
                            this.f113557a.f113542h.add(this.f113559c.getAdapterPosition() + 1, utteranceWithWords2);
                            int indexOf = this.f113557a.f113543i.indexOf(this.f113558b);
                            this.f113557a.f113543i.add(indexOf + 1, new UtteranceWithWords(this.f113558b.getEndTime() + 1, this.f113558b.getEndTime() - 1));
                            this.f113557a.f113543i.add(indexOf + 2, utteranceWithWords2);
                            this.f113557a.f113544j = this.f113559c.getAdapterPosition() + 1;
                            this.f113557a.notifyDataSetChanged();
                        } else {
                            throw new C52857u("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public final List<UtteranceWithWords> mo90975a() {
        return this.f113536b;
    }

    public final int getItemCount() {
        return this.f113542h.size();
    }

    /* renamed from: a */
    public final void mo90976a(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f113537c = str;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "p0");
        View inflate = LayoutInflater.from(this.f113538d).inflate(R.layout.af7, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…tle_edit_item, p0, false)");
        this.f113535a = inflate;
        View view = this.f113535a;
        if (view == null) {
            C52711k.m112237a("view");
        }
        return new C44864a(this, view);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C44864a aVar = (C44864a) vVar;
        C52711k.m112240b(aVar, "p0");
        aVar.f113546a.setVisibility(0);
        aVar.f113546a.setText(((UtteranceWithWords) this.f113542h.get(i)).getText());
        aVar.f113546a.setOnFocusChangeListener(new C44865b(this, aVar));
        aVar.f113546a.setOnTouchListener(new C44866c(this, aVar));
        if (aVar.getAdapterPosition() != this.f113544j) {
            aVar.f113547b.setVisibility(4);
            aVar.itemView.setBackgroundResource(0);
            aVar.f113546a.setTextColor(this.f113538d.getResources().getColor(R.color.asw));
            aVar.f113546a.clearFocus();
        } else {
            aVar.f113546a.requestFocus();
            this.f113541g.mo90884a(aVar.f113546a);
        }
        Object obj = this.f113542h.get(aVar.getAdapterPosition());
        C52711k.m112236a(obj, "list.get(p0.adapterPosition)");
        UtteranceWithWords utteranceWithWords = (UtteranceWithWords) obj;
        C45428bk.m99000a(aVar.f113547b, 0.75f);
        aVar.f113547b.setOnClickListener(new C44867d(this, utteranceWithWords));
        aVar.f113546a.addTextChangedListener(new C44868e(this, aVar));
        aVar.f113546a.setOnEditorActionListener(new C44869f(this, utteranceWithWords, aVar));
    }

    /* renamed from: a */
    public final void mo90977a(ArrayList<UtteranceWithWords> arrayList, ArrayList<UtteranceWithWords> arrayList2, int i) {
        C52711k.m112240b(arrayList, "list");
        C52711k.m112240b(arrayList2, "result");
        this.f113542h = arrayList;
        this.f113543i = arrayList2;
        this.f113544j = i;
        this.f113536b.clear();
        notifyDataSetChanged();
    }

    public C44863g(SubtitleModule subtitleModule, ArrayList<UtteranceWithWords> arrayList, ArrayList<UtteranceWithWords> arrayList2, int i) {
        C52711k.m112240b(subtitleModule, "module");
        C52711k.m112240b(arrayList, "list");
        C52711k.m112240b(arrayList2, "result");
        this.f113541g = subtitleModule;
        this.f113542h = arrayList;
        this.f113543i = arrayList2;
        Activity activity = this.f113541g.f33840g_;
        if (activity != null) {
            this.f113538d = (FragmentActivity) activity;
            JediViewModel a = C48927d.m105736a(this.f113538d).mo96760a(EditViewModel.class);
            C52711k.m112236a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f113545k = (EditViewModel) a;
            this.f113539e = (C20347c) this.f113545k.mo97038h().getValue();
            this.f113540f = this.f113545k.mo97035e();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
