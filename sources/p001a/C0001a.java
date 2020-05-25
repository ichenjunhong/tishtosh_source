package p001a;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: a.a */
public final class C0001a extends Exception {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private List<Throwable> f2a;

    public final List<Throwable> getInnerThrowables() {
        return this.f2a;
    }

    public final Throwable[] getCauses() {
        return (Throwable[]) this.f2a.toArray(new Throwable[this.f2a.size()]);
    }

    public final List<Exception> getErrors() {
        ArrayList arrayList = new ArrayList();
        if (this.f2a == null) {
            return arrayList;
        }
        for (Throwable th : this.f2a) {
            if (th instanceof Exception) {
                arrayList.add((Exception) th);
            } else {
                arrayList.add(new Exception(th));
            }
        }
        return arrayList;
    }

    public C0001a(List<? extends Throwable> list) {
        this("There were multiple errors.", list);
    }

    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable th : this.f2a) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append(Integer.toString(i));
            printStream.append(": ");
            C17840a.m43750a(th, printStream);
            printStream.append("\n");
        }
    }

    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable th : this.f2a) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append(Integer.toString(i));
            printWriter.append(": ");
            C17840a.m43751a(th, printWriter);
            printWriter.append("\n");
        }
    }

    public C0001a(String str, Throwable[] thArr) {
        this(str, Arrays.asList(thArr));
    }

    public C0001a(String str, List<? extends Throwable> list) {
        Throwable th;
        if (list == null || list.size() <= 0) {
            th = null;
        } else {
            th = (Throwable) list.get(0);
        }
        super(str, th);
        this.f2a = Collections.unmodifiableList(list);
    }
}
