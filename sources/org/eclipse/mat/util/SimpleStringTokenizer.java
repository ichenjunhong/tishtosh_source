package org.eclipse.mat.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class SimpleStringTokenizer implements Iterable<String> {
    public char delim;
    public String subject;

    public final Iterator<String> iterator() {
        return new Iterator<String>() {
            int maxPosition = SimpleStringTokenizer.this.subject.length();
            int position;

            public void remove() {
                throw new UnsupportedOperationException();
            }

            public boolean hasNext() {
                if (this.position < this.maxPosition) {
                    return true;
                }
                return false;
            }

            public String next() {
                if (this.position < this.maxPosition) {
                    int indexOf = SimpleStringTokenizer.this.subject.indexOf(SimpleStringTokenizer.this.delim, this.position);
                    if (indexOf < 0) {
                        String substring = SimpleStringTokenizer.this.subject.substring(this.position);
                        this.position = this.maxPosition;
                        return substring;
                    }
                    String substring2 = SimpleStringTokenizer.this.subject.substring(this.position, indexOf);
                    this.position = indexOf + 1;
                    return substring2;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public SimpleStringTokenizer(String str, char c) {
        this.subject = str;
        this.delim = c;
    }

    public static String[] split(String str, char c) {
        ArrayList arrayList = new ArrayList();
        Iterator it = new SimpleStringTokenizer(str, c).iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).trim());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
