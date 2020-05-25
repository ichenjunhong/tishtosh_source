package com.p683ss.android.ugc.aweme.account.utils;

import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.widget.EditText;
import p2628d.C52857u;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2649l.C52786h;

/* renamed from: com.ss.android.ugc.aweme.account.utils.c */
public final class C22295c {

    /* renamed from: a */
    public static final C22295c f60063a = new C22295c();

    /* renamed from: com.ss.android.ugc.aweme.account.utils.c$a */
    static final class C22296a extends C52712l implements C52671b<InputFilter, Boolean> {

        /* renamed from: a */
        public static final C22296a f60064a = new C22296a();

        C22296a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            if (!(((InputFilter) obj) instanceof LengthFilter)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    private C22295c() {
    }

    /* renamed from: a */
    public static final void m55180a(EditText editText, int i) {
        boolean z;
        InputFilter[] inputFilterArr;
        if (editText != null && i >= 0) {
            InputFilter[] filters = editText.getFilters();
            C52711k.m112236a((Object) filters, "editText.filters");
            if (filters.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                inputFilterArr = (InputFilter[]) new LengthFilter[]{new LengthFilter(i)};
            } else {
                InputFilter[] filters2 = editText.getFilters();
                C52711k.m112236a((Object) filters2, "editText.filters");
                Object[] array = C52786h.m112353g(C52786h.m112341a(C52786h.m112340a(C52568f.m112089j(filters2), (C52671b<? super T, Boolean>) C22296a.f60064a), new LengthFilter(i))).toArray(new InputFilter[0]);
                if (array != null) {
                    inputFilterArr = (InputFilter[]) array;
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            editText.setFilters(inputFilterArr);
        }
    }
}
