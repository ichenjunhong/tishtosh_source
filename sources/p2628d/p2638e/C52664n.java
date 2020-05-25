package p2628d.p2638e;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.p2642a.C52695a;
import p2628d.p2649l.C52785g;

/* renamed from: d.e.n */
final class C52664n implements C52785g<String> {

    /* renamed from: a */
    public final BufferedReader f130957a;

    /* renamed from: d.e.n$a */
    public static final class C52665a implements C52695a, Iterator<String> {

        /* renamed from: a */
        final /* synthetic */ C52664n f130958a;

        /* renamed from: b */
        private String f130959b;

        /* renamed from: c */
        private boolean f130960c;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f130959b == null && !this.f130960c) {
                this.f130959b = this.f130958a.f130957a.readLine();
                if (this.f130959b == null) {
                    this.f130960c = true;
                }
            }
            if (this.f130959b != null) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ Object next() {
            if (hasNext()) {
                String str = this.f130959b;
                this.f130959b = null;
                if (str == null) {
                    C52711k.m112234a();
                }
                return str;
            }
            throw new NoSuchElementException();
        }

        C52665a(C52664n nVar) {
            this.f130958a = nVar;
        }
    }

    /* renamed from: a */
    public final Iterator<String> mo110157a() {
        return new C52665a<>(this);
    }

    public C52664n(BufferedReader bufferedReader) {
        C52711k.m112240b(bufferedReader, "reader");
        this.f130957a = bufferedReader;
    }
}
