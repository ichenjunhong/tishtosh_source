package com.p683ss.android.ugc.aweme.property;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View.OnLongClickListener;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.setting.SettingItemBase;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40762a;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40763b;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.property.AVABRangeView */
public class AVABRangeView extends SettingItemBase {

    /* renamed from: a */
    DmtEditText f103821a;

    /* renamed from: b */
    C40762a f103822b;

    /* renamed from: c */
    C40756e f103823c;

    /* renamed from: com.ss.android.ugc.aweme.property.AVABRangeView$a */
    static class C40752a implements C40756e {

        /* renamed from: a */
        C40762a f103825a;

        public C40752a(C40762a aVar) {
            this.f103825a = aVar;
        }

        /* renamed from: a */
        public final void mo83046a(String str) throws IllegalArgumentException {
            float floatValue = Float.valueOf(str).floatValue();
            if (C40765ac.m90177f(this.f103825a) == null || C40765ac.m90177f(this.f103825a).mo83078a(Float.valueOf(floatValue))) {
                C40762a aVar = this.f103825a;
                if (aVar instanceof C40790a) {
                    C39618d.f101152P.mo83098a((C40762a) (C40790a) aVar, floatValue);
                } else if (aVar instanceof C40796a) {
                    C39618d.f101151O.mo83112a((C40796a) aVar, floatValue);
                } else if (aVar instanceof C40773ai) {
                    C40765ac.m90172a((C40773ai) aVar, Float.valueOf(floatValue));
                }
                if (C40765ac.m90176e(this.f103825a) != null) {
                    C40765ac.m90176e(this.f103825a).mo83111a(Float.valueOf(floatValue));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABRangeView$b */
    static class C40753b implements C40756e {

        /* renamed from: a */
        C40762a f103826a;

        public C40753b(C40762a aVar) {
            this.f103826a = aVar;
        }

        /* renamed from: a */
        public final void mo83046a(String str) throws NumberFormatException, IllegalArgumentException {
            int intValue = Integer.valueOf(str).intValue();
            if (C40765ac.m90177f(this.f103826a) == null || C40765ac.m90177f(this.f103826a).mo83078a(Integer.valueOf(intValue))) {
                C40762a aVar = this.f103826a;
                if (aVar instanceof C40790a) {
                    C39618d.f101152P.mo83099a((C40762a) (C40790a) aVar, intValue);
                } else if (aVar instanceof C40796a) {
                    C39618d.f101151O.mo83113a((C40796a) aVar, intValue);
                } else if (aVar instanceof C40773ai) {
                    C40765ac.m90172a((C40773ai) aVar, Integer.valueOf(intValue));
                }
                if (C40765ac.m90176e(this.f103826a) != null) {
                    C40765ac.m90176e(this.f103826a).mo83111a(Integer.valueOf(intValue));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABRangeView$c */
    static class C40754c implements C40756e {

        /* renamed from: a */
        C40762a f103827a;

        public C40754c(C40762a aVar) {
            this.f103827a = aVar;
        }

        /* renamed from: a */
        public final void mo83046a(String str) throws IllegalArgumentException {
            long longValue = Long.valueOf(str).longValue();
            if (C40765ac.m90177f(this.f103827a) == null || C40765ac.m90177f(this.f103827a).mo83078a(Long.valueOf(longValue))) {
                C40762a aVar = this.f103827a;
                if (aVar instanceof C40790a) {
                    C39618d.f101152P.mo83100a((C40762a) (C40790a) aVar, longValue);
                } else if (aVar instanceof C40796a) {
                    C39618d.f101151O.mo83114a((C40796a) aVar, longValue);
                } else if (aVar instanceof C40773ai) {
                    C40765ac.m90172a((C40773ai) aVar, Long.valueOf(longValue));
                }
                if (C40765ac.m90176e(this.f103827a) != null) {
                    C40765ac.m90176e(this.f103827a).mo83111a(Long.valueOf(longValue));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABRangeView$d */
    static class C40755d implements C40756e {

        /* renamed from: a */
        C40762a f103828a;

        public C40755d(C40762a aVar) {
            this.f103828a = aVar;
        }

        /* renamed from: a */
        public final void mo83046a(String str) throws IllegalArgumentException {
            C40762a aVar = this.f103828a;
            if (aVar instanceof C40790a) {
                C39618d.f101152P.mo83101a((C40762a) (C40790a) aVar, str);
            } else if (aVar instanceof C40796a) {
                C39618d.f101151O.mo83115a((C40796a) aVar, str);
            } else if (aVar instanceof C40773ai) {
                C40765ac.m90172a((C40773ai) aVar, str);
            }
            if (C40765ac.m90176e(this.f103828a) != null) {
                C40765ac.m90176e(this.f103828a).mo83111a(str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABRangeView$e */
    interface C40756e {
        /* renamed from: a */
        void mo83046a(String str) throws NumberFormatException, IllegalArgumentException;
    }

    public int getRightLayoutId() {
        return R.layout.f9;
    }

    public AVABRangeView(Context context) {
        super(context);
    }

    public void setAVABProperty(C40790a aVar) {
        mo83040a(aVar, aVar.key());
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f28757g.setOnLongClickListener(onLongClickListener);
    }

    /* renamed from: a */
    public final void mo19302a(Context context) {
        super.mo19302a(context);
        this.f28761k.setSingleLine(true);
        this.f103821a = (DmtEditText) this.f28758h.getChildAt(0);
        this.f103821a.setTextColor(-16777216);
    }

    public AVABRangeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo83040a(C40762a aVar, String str) {
        if (aVar == null) {
            throw new NullPointerException();
        } else if (aVar.type() == C40763b.Float || aVar.type() == C40763b.Integer || aVar.type() == C40763b.Long || aVar.type() == C40763b.String) {
            this.f103822b = aVar;
            if (aVar.type() == C40763b.Float) {
                this.f103821a.setText(String.valueOf(C40765ac.m90171a(aVar)));
                this.f103823c = new C40752a(aVar);
            } else if (aVar.type() == C40763b.Integer) {
                this.f103821a.setText(String.valueOf(C40765ac.m90173b(aVar)));
                this.f103823c = new C40753b(aVar);
            } else if (aVar.type() == C40763b.Long) {
                this.f103821a.setText(String.valueOf(C40765ac.m90174c(aVar)));
                this.f103823c = new C40754c(aVar);
            } else if (aVar.type() == C40763b.String) {
                this.f103821a.setText(C40765ac.m90175d(aVar));
                this.f103823c = new C40755d(aVar);
            }
            setStartText(str);
            this.f103821a.addTextChangedListener(new TextWatcher() {
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    if (editable.toString().endsWith("\n")) {
                        try {
                            editable.delete(editable.length() - 1, editable.length());
                            AVABRangeView.this.f103823c.mo83046a(editable.toString());
                        } catch (NumberFormatException unused) {
                            C10691a.m21545b(AVABRangeView.this.getContext(), "参数格式错误").mo19066a();
                        } catch (IllegalArgumentException unused2) {
                            C10691a.m21545b(AVABRangeView.this.getContext(), "参数区间错误").mo19066a();
                        }
                    }
                }
            });
        } else {
            throw new IllegalArgumentException();
        }
    }

    public AVABRangeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
