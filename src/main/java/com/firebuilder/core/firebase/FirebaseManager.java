package com.firebuilder.core.firebase;

import org.springframework.stereotype.Component;

import com.firebase.client.Firebase;

@Component
public class FirebaseManager {
    
    Firebase ref;

    public Firebase getRef() {
        return ref;
    }

    public void setRef(String firebaseUrl) {
        this.ref = new Firebase(firebaseUrl);
    }
     
}
