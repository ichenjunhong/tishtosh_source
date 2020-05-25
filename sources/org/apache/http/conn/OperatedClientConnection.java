package org.apache.http.conn;

import org.apache.http.HttpClientConnection;
import org.apache.http.HttpInetConnection;

public interface OperatedClientConnection extends HttpClientConnection, HttpInetConnection {
}
