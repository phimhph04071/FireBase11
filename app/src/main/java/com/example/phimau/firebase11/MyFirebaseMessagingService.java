package com.example.phimau.firebase11;

import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.Transaction;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by phimau on 7/10/2016.
 */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
    static String TAG ="FirebaseMessaging";
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d(TAG, "From: " + remoteMessage.getFrom());
        Log.d(TAG, "Notification Message Body: " + remoteMessage.getNotification().getBody());


    }
}
