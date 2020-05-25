package com.google.p1057b.p1060c;

import com.google.p1057b.p1060c.C17624aw.C17625a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: com.google.b.c.e */
abstract class C17687e<E> extends C17693h<E> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    transient C17636ba<E> f49395a;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(entrySet().size());
        for (C17625a aVar : entrySet()) {
            objectOutputStream.writeObject(aVar.mo34201a());
            objectOutputStream.writeInt(aVar.mo34202b());
        }
    }
}
