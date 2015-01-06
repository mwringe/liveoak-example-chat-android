package io.liveoak.helper.rest;

import org.jboss.aerogear.android.Callback;
import org.json.JSONObject;

import java.net.URI;
import java.net.URL;

/**
 * Created by mwringe on 01/05/14.
 */
public class DeleteTask extends RESTTask {

    public DeleteTask(Callback<JSONObject> callback) {
        super(callback);
    }

    @Override
    protected Object doInBackground(Object... params) {
        String resourceURLParam = (String) params[0];

        try {
            return request(new URL(resourceURLParam), Method.DELETE);
        } catch (Exception e) {
            return e;
        }
    }
}